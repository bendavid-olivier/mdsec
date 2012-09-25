package policyTools.simulation;

import java.util.Map.Entry;
import com.sun.tools.javac.util.Pair;
import policy.*;
import policyTools.editor.PolicyEditor;
import policyTools.guiEditor.controllers.PolicyListener;
import policyTools.guiEditor.graphicComponents.GraphMonitor;
import utils.time.Chrono;

//one architectural model and only multiple policy models splitted by users.
public class SimulationSplitByRole extends SimulationSplit{

	
	public SimulationSplitByRole()  {
		super();
		for(Policy p : splitter.splitByRoles()){
			policies.put(p.getName(),new  Pair<Policy, PolicyListener>(p, new PolicyListener(this,p)));
		}
		for(Entry e :  policies.entrySet()){
			((Pair<Policy,PolicyListener>)e.getValue()).snd.listen();
		}
	}
	
	public SimulationSplitByRole(int numberUsers, int numberResources){
		super(numberUsers, numberResources);	
		GraphMonitor agm = new GraphMonitor(policy);
		for(Policy p : splitter.splitByRoles()){
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
		System.out.println("START SIMULATION SPLIT BY ROLES");
		SimulationSplitByRole simul = new SimulationSplitByRole(3,1);
		simul.loadTypes();
		simul.kevoreeListener.listen();
		simul.policyListener.listen();
		simul.initSimulationArchitecturalChanges();
//		simul.saveArchitectureModel();
		c.stop();
		System.out.println("END SIMULATION SPLIT BY ROLES : "+c.displayTime());
	}	
}