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
	
	public abstract void activateUsersRoles();

	
}