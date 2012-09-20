package policyTools.simulation;

import utils.time.Chrono;

public class Simulate {

	
	
	public void splitStrategy() {
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
	
	
	
	public void simpleStrategy() {
		Chrono c = new Chrono();
		c.start();
		System.out.println("START SIMULATION SIMPLE");
		SimulationSimple simul = new SimulationSimple();
		simul.loadTypes();
		simul.kevoreeListener.listen();
		simul.policyListener.listen();
		simul.initSimulationArchitecturalChanges();
		c.stop();
		System.out.println("END SIMULATION SIMPLE : " + c.displayTime());
	}	
	
	
	public static void main(String[] args) {
		Simulate s =new Simulate();
		s.simpleStrategy();
		s.splitStrategy();
	}	
	
	
}
