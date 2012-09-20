package policyTools.simulation;

import utils.statistics.Statistics;
import utils.time.Chrono;

public class Simulate {

	public void splitStrategy(int numberUsers, int numberResources) {
		System.out.println("split strategy");
		int numberOfIteration = 10;
		double[] executionTime = new double[numberOfIteration]; 
		for(int i =0;i<numberOfIteration; i++){
			Chrono c = new Chrono();
			c.start();
			SimulationSplit simul = new SimulationSplit(numberUsers, numberResources);
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
		stats.statistics(false);
	}
	
	public void simpleStrategy(int numberUsers, int numberResources) {
		System.out.println("simple strategy");
		int numberOfIteration = 10;
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
		stats.statistics(false);
	}	
	
	
	public void simulate(int numberUsers, int numberResources){
		simpleStrategy(numberUsers, numberResources);
		splitStrategy(numberUsers, numberResources);
	}
	
	public static void main(String[] args) {
		Simulate s =new Simulate();
		for(int users = 0;users<5;users++){
			for(int resources = 0;resources<5;resources++){
				System.out.println("number users : "+(users+1) + " number resources : "+(resources+1));
				s.simulate(users, resources);
			}
		}
	}	


}
