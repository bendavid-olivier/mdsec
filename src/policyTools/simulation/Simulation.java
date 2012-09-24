package policyTools.simulation;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import kevoree.ContainerRoot;
import kevoree.KevoreeFactory;
import kevoree.KevoreePackage;
import kevoreeTools.editor.KevoreeEditor;
import kevoreeTools.guiEditor.controllers.KevoreeListener;
import kevoreeTools.guiEditor.graphicComponents.FileChooser;
import policy.Operation;
import policy.Permission;
import policy.Policy;
import policy.PolicyElement;
import policy.PolicyFactory;
import policy.Role;
import policy.impl.ObjectImpl;
import policy.impl.OperationImpl;
import policy.impl.RoleImpl;
import policyTools.editor.PolicyEditor;
import policyTools.generator.Generator;
import policyTools.guiEditor.controllers.PolicyListener;
import policyTools.guiEditor.graphicComponents.GraphMonitor;

import com.sun.tools.javac.util.Pair;

public abstract class Simulation {

	public ContainerRoot kevoree;	
	public Policy policy;
	
	public HashMap<String, Pair<Policy, PolicyListener>> policies;	
	public KevoreeListener kevoreeListener;
	public PolicyListener policyListener;
	
	public KevoreeEditor kevoreeEditor;
	public PolicyEditor policyEditor;
	
	public KevoreeFactory kevoreeFactory;
	public PolicyFactory policyFactory;
	
	
	
	public Simulation(){
		initializedCommonElements(3,3);
	}
	
	public Simulation(int numberUsers, int numberResources){
		initializedCommonElements(numberUsers,numberResources);
	}
	
	public void initializedCommonElements(int numberUsers, int numberResources){
		kevoreeFactory = KevoreeFactory.eINSTANCE;
		policyFactory = PolicyFactory.eINSTANCE;
		
		kevoree = kevoreeFactory.createContainerRoot();
		policy = policyFactory.createPolicy();
		
		// load policy model example
		Generator gen = new Generator(policy);
		gen.generateModelExampleASMSvaryUsers3(numberUsers, numberResources);

		kevoreeEditor = new KevoreeEditor(kevoree);
		policyEditor = new PolicyEditor(policy);
//		System.out.println("number of rules : "+policyEditor.getNumberPolicyRules());
		//GraphMonitor gm = new GraphMonitor(policy);
		

		kevoreeListener = new KevoreeListener(this, KevoreeListener.STRATEGY_SIMPLE);
		policyListener = new PolicyListener(this);
		
		loadTypes();
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
	
	public int[] createArrayOfUniqueNumber(int numberOfElementsString){
		int[] res = new int[numberOfElementsString];	
		boolean[] booleans = new boolean[numberOfElementsString];
		Random random = new Random();
		for(int i=0; i<numberOfElementsString;i++){
			boolean toContinue = true;
			while(toContinue){		
				int randomNumber = random.nextInt(numberOfElementsString);
				if(! booleans[randomNumber]){
					res[i] = randomNumber;
					booleans[randomNumber]=true;
					toContinue = false;
				}
			}
		}
		return res;
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
//				System.out.println(user+" "+rolls[i]);
				kevoreeEditor.addNodeComponent(user, rolls[i], rolls[i]);
			}
//			for (String role : roles) {
//				kevoreeEditor.addNodeComponent(user, role, role);
//			}
		}
	}
	
	public void saveArchitectureModel(){
		ResourceSet resourceSetMetamodel;
		Resource resourceModel;
		// REGISTER THE METAMODEL
		resourceSetMetamodel = new ResourceSetImpl();
		resourceSetMetamodel.getPackageRegistry().put(KevoreePackage.eNS_URI,
		KevoreePackage.eINSTANCE);
		resourceSetMetamodel.getResourceFactoryRegistry()
		.getExtensionToFactoryMap()
		.put("xmi", new XMIResourceFactoryImpl());
		FileChooser fc = new FileChooser(null);
		System.out.println(fc.getChooser().getSelectedFile().getAbsolutePath());
		String path = fc.getChooser().getSelectedFile().getAbsolutePath();
		 // SAVE THE MODEL
		 resourceModel = resourceSetMetamodel.createResource(URI
		 .createFileURI(path));
		 resourceModel.getContents().add(kevoree);
		 try {
		 resourceModel.save(null);
		 } catch (IOException e) {
		 System.out.println("error during the model saving step");
		 e.printStackTrace();
		 }
	}
	
	
	
}