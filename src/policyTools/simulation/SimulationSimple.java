package policyTools.simulation;

import java.util.HashSet;
import java.util.Random;

import policy.*;
import policy.impl.*;
import policyTools.editor.PolicyEditor;
import policyTools.generator.Generator;
import policyTools.guiEditor.controllers.PolicyListener;
import policyTools.guiEditor.controllers.PolicyListenerSimple;
import utils.time.Chrono;
import kevoree.ContainerRoot;
import kevoree.KevoreeFactory;
import kevoreeTools.editor.KevoreeEditor;
import kevoreeTools.guiEditor.controllers.KevoreeListener;
import kevoreeTools.guiEditor.controllers.KevoreeListenerSimple;


public class SimulationSimple extends Simulation{



	public SimulationSimple() {
		kevoreeFactory = KevoreeFactory.eINSTANCE;
		policyFactory = PolicyFactory.eINSTANCE;

		kevoree = kevoreeFactory.createContainerRoot();
		policy = policyFactory.createPolicy();

		// load policy model example
		Generator gen = new Generator(policy);
		gen.generateModelExampleASMSvaryUsers3(3, 2);

		kevoreeEditor = new KevoreeEditor(kevoree);
		policyEditor = new PolicyEditor(policy);

//		kevoreeListener = new KevoreeListenerSimple(this);
		kevoreeListener = new KevoreeListener(this, KevoreeListener.STRATEGY_SIMPLE);
		policyListener = new PolicyListener(this);
		
		loadTypes();

	}
	
	
	public SimulationSimple(int numberUsers, int numberResources) {
		kevoreeFactory = KevoreeFactory.eINSTANCE;
		policyFactory = PolicyFactory.eINSTANCE;

		kevoree = kevoreeFactory.createContainerRoot();
		policy = policyFactory.createPolicy();

		// load policy model example
		Generator gen = new Generator(policy);
		gen.generateModelExampleASMSvaryUsers3(numberUsers, numberResources);

		kevoreeEditor = new KevoreeEditor(kevoree);
		policyEditor = new PolicyEditor(policy);

//		kevoreeListener = new KevoreeListenerSimple(this);
		System.out.println(kevoree);
		kevoreeListener = new KevoreeListener(this, KevoreeListener.STRATEGY_SIMPLE);
		policyListener = new PolicyListener(this);

	}

	public void loadTypes() {
		// adding ports types first
		for (PolicyElement e : policy.getElements()) {
			if (e instanceof OperationImpl) {
				kevoreeEditor.addPortType(e.getName());
			}
		}
		// creating component types after
		for (PolicyElement e : policy.getElements()) {
			if (e instanceof RoleImpl) {
				Role r = (Role) e;
				kevoreeEditor.addComponentType(r.getArchType());
				HashSet<String> operations = new HashSet<String>();
				for (Permission p : r.getPermissions()) {
					for (Operation op : p.getOperations()) {
						operations.add(op.getName());
					}
				}
				for (String op : operations) {
					kevoreeEditor.addComponentTypePortReq(r.getName(), op);
				}
			}
			if (e instanceof ObjectImpl) {
				policy.Object ob = (policy.Object) e;
				kevoreeEditor.addComponentType(ob.getArchType());
				HashSet<String> operations = new HashSet<String>();
				for (Operation op : ob.getOperations()) {
					operations.add(op.getName());
				}
				for (String op : operations) {
					kevoreeEditor
							.addComponentTypePortProv(ob.getArchType(), op);
				}
			}
		}
	}

	// the goal is to apply all architectural primitives of modifications
	// and to verify that the adaptation is correctly performed according to the
	// policy enforcement
	// this verification consists in checking that all activated rules are
	// enforced.
	public void initSimulationArchitecturalChanges() {
		addResources();
		connectUsers();
		activateUsersRoles();
	}

	public void addResources() {
		PolicyEditor pe = new PolicyEditor(policy);
		HashSet<policy.Object> objects = pe.getPolicyObjects(policy.getName());
		for (policy.Object obj : objects) {
			kevoreeEditor.addNode(obj.getName());
			kevoreeEditor.addNodeComponent(obj.getName(), obj.getName(),
					obj.getArchType());
		}
	}

	public void connectUsers() {
		HashSet<String> users = policyEditor.getPolicyUsersNames(policy
				.getName());
		for (String user : users) {
			kevoreeEditor.addNode(user);
		}
	}

	public void activateUsersRoles() {
		HashSet<String> users = policyEditor.getPolicyUsersNames(policy
				.getName());
		for (String user : users) {
			HashSet<String> roles = new HashSet<String>();
			String[] rolls = new String[policyEditor.getPolicyUserByName(policy.getName(),
					user).getRoles().size()];
			int cpt = 0;		
			for (Role r : policyEditor.getPolicyUserByName(policy.getName(),
					user).getRoles()) {
//				roles.add(r.getName());
				rolls[cpt] = r.getName();
				cpt++;
			}
			for(int i : createArrayOfUniqueNumber(rolls.length)){
				System.out.println(user+" "+rolls[i]);
				kevoreeEditor.addNodeComponent(user, rolls[i], rolls[i]);
			}
//			for (String role : roles) {
//				kevoreeEditor.addNodeComponent(user, role, role);
//			}
		}
	}
	
	

	

	public static void main(String[] args) {
		Chrono c = new Chrono();
		c.start();
		System.out.println("START SIMULATION SIMPLE");
		SimulationSimple simul = new SimulationSimple(3,3);
		simul.loadTypes();
		simul.kevoreeListener.listen();
		simul.policyListener.listen();
		simul.initSimulationArchitecturalChanges();
		c.stop();
		System.out.println("END SIMULATION SIMPLE : " + c.displayTime());
	}
}
	
	
