package policyTools.simulation;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.HashSet;

import com.sun.tools.javac.util.Pair;

import policy.*;
import policy.impl.*;
import policyTools.editor.PolicyEditor;
import policyTools.generator.Generator;
import policyTools.guiEditor.controllers.PolicyListener;
import policyTools.split.Splitter;
import utils.time.Chrono;
import kevoree.ContainerRoot;
import kevoree.KevoreeFactory;
import kevoreeTools.editor.KevoreeEditor;
import kevoreeTools.guiEditor.controllers.KevoreeListener;


public class SimulationSplit{

	public ContainerRoot kevoree;	
	public Policy policy;
	
	public HashMap<String, Pair<Policy, PolicyListener>> policies;	
	public KevoreeListener kevoreeListener;
	public PolicyListener policyListener;
	
	public KevoreeEditor kevoreeEditor;
	public PolicyEditor policyEditor;
	
	public KevoreeFactory kevoreeFactory;
	public PolicyFactory policyFactory;
	
	public SimulationSplit(){
		kevoreeFactory = KevoreeFactory.eINSTANCE;
		policyFactory = PolicyFactory.eINSTANCE;
		
		kevoree = kevoreeFactory.createContainerRoot();
		policy =policyFactory.createPolicy();

		//load policy model example
		Generator gen = new Generator(policy);
		gen.generateModelExampleASMSvaryUsers3(3,2);
		
		kevoreeEditor = new KevoreeEditor(kevoree);
		policyEditor = new PolicyEditor(policy);

		kevoreeListener = new KevoreeListener(this);
		policyListener = new PolicyListener(this);
		
		policies =  new HashMap<String, Pair<Policy,PolicyListener>>();
		Splitter splitter = new Splitter(policy);
		
		for(Policy p : splitter.split()){
			policies.put(p.getName(),new  Pair<Policy, PolicyListener>(p, new PolicyListener(this,p)));
		}
		for(Entry e :  policies.entrySet()){
			((Pair<Policy,PolicyListener>)e.getValue()).snd.listen();
		}
	}
	
	public SimulationSplit(int numberUsers, int numberResources){
		kevoreeFactory = KevoreeFactory.eINSTANCE;
		policyFactory = PolicyFactory.eINSTANCE;
		
		kevoree = kevoreeFactory.createContainerRoot();
		policy =policyFactory.createPolicy();

		//load policy model example
		Generator gen = new Generator(policy);
		gen.generateModelExampleASMSvaryUsers3(numberUsers, numberResources);
		
		kevoreeEditor = new KevoreeEditor(kevoree);
		policyEditor = new PolicyEditor(policy);

		kevoreeListener = new KevoreeListener(this);
		policyListener = new PolicyListener(this);
		
		policies =  new HashMap<String, Pair<Policy,PolicyListener>>();
		Splitter splitter = new Splitter(policy);
		
		for(Policy p : splitter.split()){
			policies.put(p.getName(),new  Pair<Policy, PolicyListener>(p, new PolicyListener(this,p)));
		}
		for(Entry e :  policies.entrySet()){
			((Pair<Policy,PolicyListener>)e.getValue()).snd.listen();
		}
	}
	
	public void loadTypes(){
		//adding ports types first
		for(PolicyElement e :policy.getElements()){
			if(e instanceof OperationImpl){
				kevoreeEditor.addPortType(e.getName());
			}
		}
		//creating component types after
		for(PolicyElement e :policy.getElements()){
			if(e instanceof RoleImpl){
				Role r = (Role)e;
				kevoreeEditor.addComponentType(r.getArchType());
				HashSet<String> operations = new HashSet<String>(); 
				for(Permission p : r.getPermissions()){
					for(Operation op : p.getOperations()){
						operations.add(op.getName());
					}
				}
				for(String op :operations){
					kevoreeEditor.addComponentTypePortReq(r.getName(), op);
				}
			}
			if(e instanceof ObjectImpl){
				policy.Object ob = (policy.Object) e;
				kevoreeEditor.addComponentType(ob.getArchType());
				HashSet<String> operations = new HashSet<String>(); 
				for(Operation op: ob.getOperations()){
					operations.add(op.getName());
				}
				for(String op :operations){
					kevoreeEditor.addComponentTypePortProv(ob.getArchType(), op);
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
		PolicyEditor pe = new PolicyEditor(policy);
		HashSet<policy.Object> objects = pe.getPolicyObjects(policy.getName());
		for(policy.Object obj : objects){
			kevoreeEditor.addNode(obj.getName());
			kevoreeEditor.addNodeComponent(obj.getName(), obj.getName(), obj.getArchType());
		}
	}
	
	public void connectUsers(){
		HashSet<String> users = policyEditor.getPolicyUsersNames(policy.getName());
		for(String user : users){
			kevoreeEditor.addNode(user);
		}
	}
	
	public void activateUsersRoles(){
		HashSet<String> users = policyEditor.getPolicyUsersNames(policy.getName());
		for(String user : users){
			HashSet<String> roles = new HashSet<String>();
			for(Role r : policyEditor.getPolicyUserByName(policy.getName(), user).getRoles()){
				roles.add(r.getName());
			}
			for(String role : roles){
				kevoreeEditor.addNodeComponent(user, role, role);
			}
		}
	}
	
	public static void main(String[] args) {
		Chrono c = new Chrono();
		c.start();
		System.out.println("START SIMULATION SPLIT");
		SimulationSplit simul = new SimulationSplit();
		simul.loadTypes();
		simul.kevoreeListener.listen();
		simul.policyListener.listen();
		simul.initSimulationArchitecturalChanges();
		c.stop();
		System.out.println("END SIMULATION SPLIT : "+c.displayTime());
	}	
}