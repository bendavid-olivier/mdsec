package policyTools.simulation;

import java.util.HashMap;
import java.util.Map.Entry;
import com.sun.tools.javac.util.Pair;
import policy.*;
import policyTools.editor.PolicyEditor;
import policyTools.generator.Generator;
import policyTools.guiEditor.controllers.PolicyListener;
import policyTools.split.Splitter;
import utils.time.Chrono;
import kevoree.KevoreeFactory;
import kevoreeTools.editor.KevoreeEditor;
import kevoreeTools.guiEditor.controllers.KevoreeListener;

//one architectural model and only multiple policy models splitted by users.
public class SimulationSplit extends Simulation{

	
	public SimulationSplit()  {
		super();
		policies =  new HashMap<String, Pair<Policy,PolicyListener>>();
		Splitter splitter = new Splitter(policy);	
		for(Policy p : splitter.splitByUsers()){
			policies.put(p.getName(),new  Pair<Policy, PolicyListener>(p, new PolicyListener(this,p)));
		}
		for(Entry e :  policies.entrySet()){
			((Pair<Policy,PolicyListener>)e.getValue()).snd.listen();
		}
	}
	
	public SimulationSplit(int numberUsers, int numberResources){
		super(numberUsers, numberResources);	
		policies =  new HashMap<String, Pair<Policy,PolicyListener>>();
		Splitter splitter = new Splitter(policy);	
		for(Policy p : splitter.splitByUsers()){
			policies.put(p.getName(),new  Pair<Policy, PolicyListener>(p, new PolicyListener(this,p)));
		}
		for(Entry e :  policies.entrySet()){
			((Pair<Policy,PolicyListener>)e.getValue()).snd.listen();
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