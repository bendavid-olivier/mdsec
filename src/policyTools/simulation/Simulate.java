package policyTools.simulation;

import policyTools.editor.PolicyEditor;
import utils.statistics.Statistics;
import utils.time.Chrono;

public class Simulate {

	
	public void splitStrategyByUsers(int numberUsers, int numberResources) {
		System.out.println("split strategy");
		int numberOfIteration = 10;
		double[] executionTime = new double[numberOfIteration]; 
		for(int i =0;i<numberOfIteration; i++){
			Chrono c = new Chrono();
			c.start();
			SimulationSplit simul = new SimulationSplitByUser(numberUsers, numberResources);
			simul.loadTypes();
			simul.kevoreeListener.listen();
			simul.policyListener.listen();
			simul.initSimulationArchitecturalChanges();
			c.stop();
			executionTime[i] = c.timeMs();
		}
		//initialise
		Statistics stats = new Statistics(executionTime);
		//runs the statistics and also say whether the results should be grouped in ranges - right now the range is 10 groups.
		stats.printStatistics(false);
	}
	
	
	public void splitStrategyByRoles(int numberUsers, int numberResources) {
		System.out.println("split strategy");
		int numberOfIteration = 10;
		double[] executionTime = new double[numberOfIteration]; 
		for(int i =0;i<numberOfIteration; i++){
			Chrono c = new Chrono();
			c.start();
			SimulationSplit simul = new SimulationSplitByRole(numberUsers, numberResources);
			simul.loadTypes();
			simul.kevoreeListener.listen();
			simul.policyListener.listen();
			simul.initSimulationArchitecturalChanges();
			c.stop();
			executionTime[i] = c.timeMs();
		}
		//initialise
		Statistics stats = new Statistics(executionTime);
		//runs the statistics and also say whether the results should be grouped in ranges - right now the range is 10 groups.
		stats.printStatistics(false);
	}
	
	
	public void simpleStrategy(int numberUsers, int numberResources) {
		System.out.println("simple strategy");
		int numberOfIteration = 2;
		double[] executionTime = new double[numberOfIteration];
		for(int i =0;i<numberOfIteration; i++){
			Chrono c = new Chrono();
			c.start();
			SimulationSimple simul = new SimulationSimple(numberUsers, numberResources);
			simul.loadTypes();
			simul.kevoreeListener.listen();
			simul.policyListener.listen();
			simul.initSimulationArchitecturalChanges();
			c.stop();
			executionTime[i] = c.timeMs();
		}
		//initialise
		Statistics stats = new Statistics(executionTime);
		//runs the statistics and also say whether the results should be grouped in ranges - right now the range is 10 groups.
		stats.printStatistics(false);
	}	
	
	
	public void simulate(int numberUsers, int numberResources){
		simpleStrategy(numberUsers, numberResources);
		splitStrategyByUsers(numberUsers, numberResources);
		splitStrategyByRoles(numberUsers, numberResources);
	}
	
	
	
	public void simulate2(int numberUsers, int numberResources){
		
		Chrono c = new Chrono();
		c.start();
		Simulation simul = new SimulationSplitByUser(numberUsers, numberResources);
//		PolicyEditor pe= new PolicyEditor(simul.policy);
//		System.out.println(pe.getNumberPolicyRules());
		simul.loadTypes();
		simul.kevoreeListener.listen();
		simul.policyListener.listen();
		simul.initSimulationArchitecturalChanges();
		c.stop();
		System.out.println("split by user : "+c.displayTime());
		
		c = new Chrono();
		c.start();
		simul = new SimulationSplitByRole(numberUsers, numberResources);
		simul.loadTypes();
		simul.kevoreeListener.listen();
		simul.policyListener.listen();
		simul.initSimulationArchitecturalChanges();
		c.stop();
		System.out.println("split by role : " + c.displayTime());

		c = new Chrono();
		c.start();
		simul = new SimulationSimple(numberUsers, numberResources);
		simul.loadTypes();
		simul.kevoreeListener.listen();
		simul.policyListener.listen();
		simul.initSimulationArchitecturalChanges();
		c.stop();
		System.out.println("       simple : " + c.displayTime());
		
		
	}
	
	
	public static void main(String[] args) {
		Simulate s =new Simulate();
		int users = 100;
		int resources = 100;
		int iteration =10;
		
		for(int i = 0;i<iteration;i++){
				System.out.println("iteration : "+iteration+" number users : "+(users) + " number resources : "+(resources));
				s.simulate2(users, resources);
		}
	}	
	
}