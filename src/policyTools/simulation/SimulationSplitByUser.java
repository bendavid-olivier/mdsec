package policyTools.simulation;


import java.util.HashMap;
import java.util.Map.Entry;
import com.sun.tools.javac.util.Pair;
import policy.*;
import policyTools.editor.PolicyEditor;
import policyTools.guiEditor.controllers.PolicyListener;
import policyTools.guiEditor.graphicComponents.GraphMonitor;
import policyTools.split.Splitter;
import utils.time.Chrono;

//one architectural model and only multiple policy models splitted by users.
public class SimulationSplitByUser extends SimulationSplit{

	
	public SimulationSplitByUser()  {
		super();
		for(Policy p : splitter.splitByUsers()){
			policies.put(p.getName(),new  Pair<Policy, PolicyListener>(p, new PolicyListener(this,p)));
		}
		for(Entry e :  policies.entrySet()){
			((Pair<Policy,PolicyListener>)e.getValue()).snd.listen();
		}
	}
	
	public SimulationSplitByUser(int numberUsers, int numberResources){
		super(numberUsers, numberResources);	
		for(Policy p : splitter.splitByUsers()){
			policies.put(p.getName(),new  Pair<Policy, PolicyListener>(p, new PolicyListener(this,p)));
			PolicyEditor pepe = new PolicyEditor(p);
			System.out.println("number of rules : "+pepe.getNumberPolicyRules());
			GraphMonitor gm = new GraphMonitor(p);
		}
		for(Entry e :  policies.entrySet()){
			((Pair<Policy,PolicyListener>)e.getValue()).snd.listen();
		}
	}

	

	
	public static void main(String[] args) {
		Chrono c = new Chrono();
		c.start();
		System.out.println("START SIMULATION SPLIT BY USERS");
		SimulationSplitByUser simul = new SimulationSplitByUser(3,1);
		simul.loadTypes();
		simul.kevoreeListener.listen();
		simul.policyListener.listen();
		simul.initSimulationArchitecturalChanges();
//		simul.saveArchitectureModel();
		c.stop();
		System.out.println("END SIMULATION SPLIT  BY USERS: "+c.displayTime());
	}	
}
