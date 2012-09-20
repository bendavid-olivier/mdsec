package policyTools.simulation;

import java.util.HashMap;
import kevoree.ContainerRoot;
import kevoree.KevoreeFactory;
import kevoreeTools.editor.KevoreeEditor;
import kevoreeTools.guiEditor.controllers.KevoreeListener;
import policy.Policy;
import policy.PolicyFactory;
import policyTools.editor.PolicyEditor;
import policyTools.guiEditor.controllers.PolicyListener;

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
	
	
	
	public abstract void loadTypes();

	public abstract void initSimulationArchitecturalChanges();
	
	public abstract  void addResources();
	
	public abstract void connectUsers();
	
<<<<<<< HEAD
	public abstract void activateUsersRoles();
=======
	public static void main(String[] args) {
		System.out.println("START SIMULATION");
		int numberOfIteration = 10;
		int variationSizeUsers = 1;
		
		double[] executionTime = new double[numberOfIteration]; 
		
		PolicyTextualEditor editor2 = new PolicyTextualEditor(false);
		CommandLoadASMSSmall loadModelExample2 = new CommandLoadASMSSmall(editor2, "loadME", "loadME");
		loadModelExample2.execute2(4,4);		
		PolicyEditor pe = new PolicyEditor(editor2.policy);
		System.out.println("policy rules : " + pe.getNumberPolicyRules());
		
		
		for(int size =0;size <variationSizeUsers;size++){
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
>>>>>>> 6d9271deaf03cbdb0a2eea2445767016fa404148

	
}