package policyTools.simulation;

import java.text.DecimalFormat;

import utils.time.Chrono;

public class Experiments {

	public static void main(String[] args) {

		int users = 20;
		int resources = 20;
		double [][] executionTimeSP = new double[users][resources];
		double [][] executionTimeSS = new double[users][resources];
		double [][] executionTimeCompare = new double[users][resources];
		Chrono c = new Chrono();
		
		System.out.println("START SIMULATION SPLIT");
		for (int i=0; i<users; i++) {
			for (int j=0; j<resources; j++){

				c.start();
				SimulationSplit simul = new SimulationSplit(i+1, j+1);
				simul.loadTypes();
				simul.kevoreeListener.listen();
				simul.policyListener.listen();
				simul.initSimulationArchitecturalChanges();
				c.stop();
				executionTimeSP[i][j] = c.timeMs();
			}
		}
		System.out.println("END SIMULATION SPLIT");
		
		System.out.println("START SIMULATION SIMPLE");
		for (int i=0; i<users; i++) {
			for (int j=0; j<resources; j++){

				c.start();
				SimulationSimple simul = new SimulationSimple(i+1, j+1);
				simul.loadTypes();
				simul.kevoreeListener.listen();
				simul.policyListener.listen();
				simul.initSimulationArchitecturalChanges();
				c.stop();
				executionTimeSS[i][j] = c.timeMs();
			}
		}
		System.out.println("END SIMULATION SIMPLE");
		
		for (int i=0; i<users; i++) 
			for (int j=0; j<resources; j++)
				executionTimeCompare[i][j] = executionTimeSS[i][j]-executionTimeSP[i][j];
		
		DecimalFormat df = new DecimalFormat();
		for (int i=0; i<users; i++) {
			for (int j=0; j<resources; j++)
				System.out.print(df.format(executionTimeCompare[i][j])  + "\t");
			System.out.println();
		}
	}	
}
