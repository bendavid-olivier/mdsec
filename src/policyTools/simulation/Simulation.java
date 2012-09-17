package policyTools.simulation;

import java.util.HashMap;
import java.util.Map.Entry;

import java.util.HashSet;

import policy.*;
import policy.impl.*;
import policyTools.editor.PolicyEditor;
import policyTools.guiEditor.commands.CommandLoadASMSSmall;
import policyTools.guiEditor.commands.CommandLoadModelExample;
import policyTools.guiEditor.graphicComponents.PolicyTextualEditor;
import utils.statistics.Statistics;
import utils.time.Chrono;
import kevoree.ContainerRoot;
import kevoree.KevoreeFactory;
import kevoreeTools.editor.KevoreeEditor;
import kevoreeTools.guiEditor.controllers.KevoreeListener;

import org.apache.commons.math3.stat.*;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math3.stat.descriptive.rank.*;

public class Simulation {

	public ContainerRoot kevoree;
	public KevoreeEditor editor;
	public KevoreeListener kevoreeListener;
	public PolicyTextualEditor policyTextualEditor;
	
	public Simulation(PolicyTextualEditor pe){
		KevoreeFactory fact = KevoreeFactory.eINSTANCE;
		kevoree = fact.createContainerRoot();
		policyTextualEditor = pe;
		editor = new KevoreeEditor(kevoree);		
		kevoreeListener = new KevoreeListener(this);
	}
	
	public void loadTypes(){
		//adding ports types first
		for(PolicyElement e :policyTextualEditor.getPolicy().getElements()){
			if(e instanceof OperationImpl){
				editor.addPortType(e.getName());
			}
		}
		
		//creating component types after
		for(PolicyElement e :policyTextualEditor.getPolicy().getElements()){
			if(e instanceof RoleImpl){
				Role r = (Role)e;
				editor.addComponentType(r.getArchType());
				HashSet<String> operations = new HashSet<String>(); 
				for(Permission p : r.getPermissions()){
					for(Operation op : p.getOperations()){
						operations.add(op.getName());
					}
				}
				for(String op :operations){
					editor.addComponentTypePortReq(r.getName(), op);
				}
			}
			if(e instanceof ObjectImpl){
				policy.Object ob = (policy.Object) e;
				editor.addComponentType(ob.getArchType());
				HashSet<String> operations = new HashSet<String>(); 
				for(Operation op: ob.getOperations()){
					operations.add(op.getName());
				}
				for(String op :operations){
					editor.addComponentTypePortProv(ob.getArchType(), op);
				}
			}
		}
	}
	
	//the goal is to apply all architectural primitives of modifications 
	//and to verify that the adaptation is correctly performed according to the policy enforcement
	//this verification consists in checking that all activated rules are enforced.
	public void initSimulationArchitecturalChanges(){
		addResources();
		connectUsers();
		activateUsersRoles();
	}
	
	public void addResources(){
		PolicyEditor pe = new PolicyEditor(policyTextualEditor.getPolicy());
		//System.out.println("resources " +policyTextualEditor.getPolicy().getElements().size() + " "+ policyTextualEditor.policyEditor);
//		HashSet<String> objects = pe.getPolicyObjectsNames(policyTextualEditor.getPolicy().getName());
//		for(String obj : objects){
////			System.out.println("adding resource : "+obj);
//			editor.addNode(obj);
//			editor.addNodeComponent(obj, obj, obj);
//		}
		
		HashSet<policy.Object> objects = pe.getPolicyObjects(policyTextualEditor.getPolicy().getName());
		for(policy.Object obj : objects){
//			System.out.println("adding resource : "+obj);
			editor.addNode(obj.getName());
			editor.addNodeComponent(obj.getName(), obj.getName(), obj.getArchType());
		}
		
	}
	
	public void connectUsers(){
		HashSet<String> users = policyTextualEditor.policyEditor.getPolicyUsersNames(policyTextualEditor.getPolicy().getName());
		for(String user : users){
//			System.out.println("connecting user : "+user);
			editor.addNode(user);
		}
	}
	
	public void activateUsersRoles(){
		HashSet<String> users = policyTextualEditor.policyEditor.getPolicyUsersNames(policyTextualEditor.getPolicy().getName());
		for(String user : users){
			HashSet<String> roles = new HashSet<String>();
			for(Role r : policyTextualEditor.policyEditor.getPolicyUserByName(policyTextualEditor.getPolicy().getName(), user).getRoles()){
				roles.add(r.getName());
			}
			for(String role : roles){
//				System.out.println("activating role : "+role+" for user "+user);
				editor.addNodeComponent(user, role, role);
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("START SIMULATION");
		int numberOfIteration = 10;
		double[] executionTime = new double[numberOfIteration]; 
		
		PolicyTextualEditor editor2 = new PolicyTextualEditor(false);
		CommandLoadASMSSmall loadModelExample2 = new CommandLoadASMSSmall(editor2, "loadME", "loadME");
		loadModelExample2.execute2(10, 10);		
		PolicyEditor pe = new PolicyEditor(editor2.policy);
		System.out.println("policy rules : " + pe.getNumberPolicyRules());
		
		
		for(int size =0;size <3;size++){
			for(int i =0;i<numberOfIteration; i++){	
				Chrono c = new Chrono();
				c.start();
				PolicyTextualEditor editor = new PolicyTextualEditor(false);
				//load policy model example
				CommandLoadASMSSmall loadModelExample = new CommandLoadASMSSmall(editor, "loadME", "loadME");
				loadModelExample.execute2(10*(size+1), 10);		
				//load types for the simulation
				editor.simulation.loadTypes();
				//listen architectural model
				editor.simulation.kevoreeListener.listen();
				//init architectural changes
				editor.simulation.initSimulationArchitecturalChanges();

				c.stop();
				executionTime[i] = c.timeMs();
			}
			System.out.println("Policy size : "+ (size + 1));
			//initialise
			Statistics stats = new Statistics(executionTime);
			//runs the statistics and also say whether the results should be grouped in ranges - right now the range is 10 groups.
			stats.statistics(false);	
		}
		System.out.println("END SIMULATION");
	}	
}