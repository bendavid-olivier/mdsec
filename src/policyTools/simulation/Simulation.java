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
					editor.addComponentTypePortProv(ob.getName(), op);
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
		HashSet<String> objects = pe.getPolicyObjectsNames(policyTextualEditor.getPolicy().getName());
		for(String obj : objects){
//			System.out.println("adding resource : "+obj);
			editor.addNode(obj);
			editor.addNodeComponent(obj, obj, obj);
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
		System.out.println("START ");
		int numberOfIteration = 1000;
		
		double[] executionTime = new double[numberOfIteration]; 
		
	//	String times = "TIMES \n";		
		for(int i =0;i<numberOfIteration; i++){	
			Chrono c = new Chrono();
			c.start();
			PolicyTextualEditor editor = new PolicyTextualEditor(false);
			//load policy model example
			CommandLoadASMSSmall loadModelExample = new CommandLoadASMSSmall(editor, "loadME", "loadME");
			loadModelExample.execute();		
//			System.out.println("model loaded : "+editor.policy.getElements().size());
			//load types for the simulation
			editor.simulation.loadTypes();
//			System.out.println("types loaded : "+editor.simulation.kevoree.getTypeDefinitions().size());
			//listen architectural model
			editor.simulation.kevoreeListener.listen();
//			System.out.println("kevoree model listened");
			//init architectural changes
			editor.simulation.initSimulationArchitecturalChanges();
//			System.out.println("architecture model change generated");
			c.stop();
		//	times = times +  " iteration : "+i+" : "+c.displayTime() +"\n";
			executionTime[i] = c.timeMs();
//			System.out.println(c.displayTime());
//			System.out.println();
//			System.out.println("-------------------------------------------------------------------------------------------------------------");
//			System.out.println();
		}
		
//		System.out.println(times);
		
//		double sumTime = 0;
//		double averageTime = 0;
//		for(int i = 1;i<numberOfIteration; i++){
//			sumTime = sumTime + executionTime[i];
//		}
//		averageTime = sumTime / (numberOfIteration-1);

//		StandardDeviation sd = new StandardDeviation();		
//		Max max = new  Max();
//		Min min = new Min();
//		Mean mean = new Mean();
//		
//		HashMap <Double,Integer> execTimesP = new HashMap<Double, Integer>();
//		
//		for(double tim : executionTime){
//			if(execTimesP.containsKey(tim)){
//				execTimesP.put(tim, execTimesP.get(tim) + 1);
//			}
//			else{
//				execTimesP.put(tim, 1);
//			}
//		}
//		
//		double mode = 0;
//		int numberOccurrenceMode = 0;
//		
//		for(Entry<Double, Integer> d : execTimesP.entrySet()){
//			if(d.getValue() > numberOccurrenceMode){
//				numberOccurrenceMode = d.getValue();
//				mode = d.getKey();
//			}
//		}
//		
//		double standardDeviation = sd.evaluate(executionTime, 1, numberOfIteration-1);		
//		
//		System.out.println("min time : "+min.evaluate(executionTime, 1, numberOfIteration - 1));
//		System.out.println("max time : "+max.evaluate(executionTime, 1, numberOfIteration - 1));
//		System.out.println("mean time : "+mean.evaluate(executionTime, 1, numberOfIteration - 1));
//		System.out.println("mode : "+mode+ "  numberOccurrenceMode : "+numberOccurrenceMode);
//		System.out.println("standard deviation : "+ standardDeviation);
		
		
		//hello Phillipa
		
		
		//initialise

		Statistics stats = new Statistics(executionTime);

		//runs the statistics and also say whether the results should be grouped in ranges - right now the range is 10 groups.

		stats.statistics(true);
		
	}	
}