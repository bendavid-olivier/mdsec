package policyTools.simulation;

import java.util.HashMap;
import java.util.Map.Entry;
import com.sun.tools.javac.util.Pair;
import policy.*;
import policyTools.guiEditor.controllers.PolicyListener;
import policyTools.split.Splitter;
import utils.time.Chrono;

//one architectural model and only multiple policy models splitted by users.
public abstract class SimulationSplit extends Simulation{

	public Splitter splitter;
	
	public SimulationSplit()  {
		super();
		policies =  new HashMap<String, Pair<Policy,PolicyListener>>();
		splitter = new Splitter(policy);	
	}
	
	public SimulationSplit(int numberUsers, int numberResources){
		super(numberUsers, numberResources);	
		policies =  new HashMap<String, Pair<Policy,PolicyListener>>();
		splitter = new Splitter(policy);	
	}

}