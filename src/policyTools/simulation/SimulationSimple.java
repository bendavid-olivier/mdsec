package policyTools.simulation;

import utils.time.Chrono;



//one architectural model and only one policy model.

public class SimulationSimple extends Simulation{


	public SimulationSimple() {
		super();
	}
	
	public SimulationSimple(int numberUsers, int numberResources) {
		super(numberUsers, numberResources);
	}

	public static void main(String[] args) {
		Chrono c = new Chrono();
		c.start();
		System.out.println("START SIMULATION SIMPLE");
		SimulationSimple simul = new SimulationSimple(3,3);
		simul.loadTypes();
		simul.kevoreeListener.listen();
		simul.policyListener.listen();
		simul.initSimulationArchitecturalChanges();
		c.stop();
		System.out.println("END SIMULATION SIMPLE : " + c.displayTime());
	}
}
	
	
