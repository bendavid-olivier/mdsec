package policyTools.simulation;

import java.text.DecimalFormat;

import com.sun.tools.javac.util.Pair;

import utils.time.Chrono;

public class Experiments {
	private static int USERS = 5;
	private static int RESOURCES = 5;
	private static int ITERATIONS = 10;
	private static int DIFFERENCE = 50;
	private static DecimalFormat df = new DecimalFormat();

	private static double [][][] executionTimeSS = new double[ITERATIONS][USERS][RESOURCES];
	private static double [][][] executionTimeSPU = new double[ITERATIONS][USERS][RESOURCES];
	private static double [][][] executionTimeSPR = new double[ITERATIONS][USERS][RESOURCES];

	private static double [][][] executionTimeCompareSS_SPU = new double[ITERATIONS][USERS][RESOURCES];
	private static double [][][] executionTimeCompareSS_SPR = new double[ITERATIONS][USERS][RESOURCES];
	private static double [][][] executionTimeCompareSPU_SPR = new double[ITERATIONS][USERS][RESOURCES];

	private static double[] totalTimes = new double[ITERATIONS];

	private static void simple(Chrono c, int iteration) {
		System.out.println("\tStart: Simulation Simple");
		for (int i=0; i<USERS; i++) {
			for (int j=0; j<RESOURCES; j++){
				c.start();
				SimulationSimple simul = new SimulationSimple(i+1, j+1);
				simul.loadTypes();
				simul.kevoreeListener.listen();
				simul.policyListener.listen();
				simul.initSimulationArchitecturalChanges();
				c.stop();
				executionTimeSS[iteration][i][j] = c.timeMs();
			}
		}
	}

	private static void splitUser( Chrono c, int iteration) {

		System.out.println("\tStart: Simulation Split by User");
		for (int i=0; i<USERS; i++) {
			for (int j=0; j<RESOURCES; j++){
				c.start();
				SimulationSplit simul = new SimulationSplit(i+1, j+1);
				simul.loadTypes();
				simul.kevoreeListener.listen();
				simul.policyListener.listen();
				simul.initSimulationArchitecturalChanges();
				c.stop();
				executionTimeSPU[iteration][i][j] = c.timeMs();
			}
		}

	}

	private static void splitRole( Chrono c, int iteration) {

		System.out.println("\tStart: Simulation Split by Role");
		for (int i=0; i<USERS; i++) {
			for (int j=0; j<RESOURCES; j++){

			}
		}
	}


	private static Pair<Integer,Integer> calculateCompareSS_SPU(double[][] vals, 
			double[][] base, 
			double[][] compareTo, 
			int val,
			Strategy stg1, Strategy stg2) {
		int k = 0, l = 0;
		for (int i=0; i<USERS; i++) 
			for (int j=0; j<RESOURCES; j++) {
				vals[i][j] = base[i][j] - compareTo[i][j];

				if (vals[i][j] >= 0) {
					k++;
					if ((vals[i][j] >= val) && (DIFFERENCE>0))  {
						System.out.println ("\tFor " + (i+1) + " USERS  and " + ((j+1) + 
								" RESOURCES the " + stg2 + " strategy was better by " + vals[i][j] + 
								" ms compared to the " + stg1 + " strategy." ));
						l++;
					}
				}
			}
		return new Pair<Integer,Integer>(k,l);
	}

	private static void printCompare (double[][] et, int iteration, Strategy strategy1, Strategy strategy2) {
		System.out.println("All execution times compared  for USERS:" + USERS + " and RESOURCES:" + RESOURCES + " on ITERATION: " + iteration +  
				".\n\tValues shown are the difference between the time for " + strategy1 + " and time for " + strategy2 + ")"); 
		for (int i=0; i<USERS; i++) {
			for (int j=0; j<RESOURCES; j++)
				System.out.print(df.format(et[i][j])  + "\t");
			System.out.println();
		}
	}

	public static void runSimple() {
		Chrono c = new Chrono();
		for (int i=0; i<ITERATIONS; i++)
			simple(c, i);
	}

	public static void runSplitUser() {
		Chrono c = new Chrono();
		for (int i=0; i<ITERATIONS; i++)
			splitUser(c, i);
	}

	public static void runSplitRole() {
		Chrono c = new Chrono();
		for (int i=0; i<ITERATIONS; i++)
			splitRole(c, i);
	}

	public  static void compareSearchStrategiesInterleave(Strategy stg1, Strategy stg2) {
		Chrono cTotal = new Chrono();
		Chrono c = new Chrono();
		Pair<Integer,Integer> splitBetter;
		double [][][] base = null;
		double [][][] compareTo = null;
		double [][][] vals = null;

		if ((stg1 != stg2) && (stg1 != null) && (stg2 != null))  {
			switch (stg1) {
			case ROLE_SPLIT: base = executionTimeSPR;
			break;
			case USER_SPLIT: base = executionTimeSPU;
			break;
			default:
				base = executionTimeSS;
			}

			switch (stg2) {
			case ROLE_SPLIT: compareTo = executionTimeSPR;
			break;
			case USER_SPLIT: compareTo = executionTimeSPU;
			break;
			default: compareTo = executionTimeSS;
			}

			if ((stg1==Strategy.SIMPLE && stg2==Strategy.USER_SPLIT) || (stg2==Strategy.SIMPLE && stg1==Strategy.USER_SPLIT))
				vals = executionTimeCompareSS_SPU;
			else 
				if ((stg1==Strategy.SIMPLE && stg2==Strategy.ROLE_SPLIT) || (stg2==Strategy.SIMPLE && stg1==Strategy.ROLE_SPLIT))
					vals = executionTimeCompareSS_SPR;
				else 
					vals = executionTimeCompareSPU_SPR;

			//process iterations
			System.out.println("Simulation of strategies: Simple and Split for " + USERS + " USER(S) and " + 
					RESOURCES + " RESOURCE(S) for " + ITERATIONS + " ITERATION(S)");

			for (int h=0; h<ITERATIONS;h++) {
				System.out.println("------------------------------------------------------------------------------------------------------------------------");
				System.out.println("Start of Iteration: " + (h+1));
				//start clock for total
				cTotal.start();

				//execute Strategy
				switch (stg1) {
				case ROLE_SPLIT: splitRole(c,h);
				break;
				case USER_SPLIT: splitUser(c, h);
				break;
				default: simple(c, h);
				}

				switch (stg2) {
				case ROLE_SPLIT: splitRole(c,h);
				break;
				case USER_SPLIT: splitUser(c, h);
				break;
				default: simple(c, h);
				}

				//stop clock for total
				cTotal.stop();
				totalTimes[h] = cTotal.timeMs();
				System.out.println("\tTotal time for Simulations on iteration: " + (h+1) + " is " + df.format(totalTimes[h]/1000) + " seconds\n");

				//Print Compare Results
				System.out.println("\nComparison: Difference between " + stg1 + " and " + stg2 + " Strategies");
				splitBetter = calculateCompareSS_SPU(vals[h], base[h], compareTo[h], DIFFERENCE, Strategy.SIMPLE, Strategy.USER_SPLIT);

				System.out.println(stg2 + " strategy was: \n\tbetter in " + splitBetter.fst + " out of " + 
						(USERS*RESOURCES) + " runs compared to the "+ stg1 + "strategy (difference of >= 0 ms considered)");
				if (DIFFERENCE>0)
					System.out.println("\tbetter in " + splitBetter.snd + " out of " + 
							(USERS*RESOURCES) + " runs compared to the " + stg1 + " strategy (difference of >= " + DIFFERENCE + " ms considered)");
				//Show Compare Grid
				System.out.println();
				//printCompare(vals[h], h+1, Strategy.SIMPLE, Strategy.USER_SPLIT);
			}//end for

			System.out.println("ITERATIONS: Time for each run" );
			for (int i=0; i<ITERATIONS; i++)
				System.out.println("\tTotal time for Simulations on iteration: " + (i+1) + " is " + df.format(totalTimes[i]/1000) + " seconds\n");
		}
		else 
			System.out.println("Invalid Comparisons: " + stg1 + " and " + stg2 );
	}	

	public static void compareSearchStrategiesSequental(Strategy stg1, Strategy stg2) {
		
		Pair<Integer,Integer> splitBetter;
		double [][][] base = null;
		double [][][] compareTo = null;
		double [][][] vals = null;
		
		if ((stg1 != stg2) && (stg1 != null) && (stg2 != null))  {


			switch (stg1) {
			case ROLE_SPLIT: base = executionTimeSPR;
			break;
			case USER_SPLIT: base = executionTimeSPU;
			break;
			default:
				base = executionTimeSS;
			}

			switch (stg2) {
			case ROLE_SPLIT: compareTo = executionTimeSPR;
			break;
			case USER_SPLIT: compareTo = executionTimeSPU;
			break;
			default: compareTo = executionTimeSS;
			}

			if ((stg1==Strategy.SIMPLE && stg2==Strategy.USER_SPLIT) || (stg2==Strategy.SIMPLE && stg1==Strategy.USER_SPLIT))
				vals = executionTimeCompareSS_SPU;
			else 
				if ((stg1==Strategy.SIMPLE && stg2==Strategy.ROLE_SPLIT) || (stg2==Strategy.SIMPLE && stg1==Strategy.ROLE_SPLIT))
					vals = executionTimeCompareSS_SPR;
				else 
					vals = executionTimeCompareSPU_SPR;

			//execute Strategy
			switch (stg1) {
			case ROLE_SPLIT: runSplitRole();
			break;
			case USER_SPLIT: runSplitUser();
			break;
			default: runSimple();
			}

			switch (stg2) {
			case ROLE_SPLIT: runSplitRole();
			break;
			case USER_SPLIT: runSplitUser();
			break;
			default: runSimple();
			}

			//Print Compare Results
			
			for (int i=0; i<ITERATIONS; i++){
			System.out.println("\nComparison: Difference between " + stg1 + " and " + stg2 + " Strategies");
			splitBetter = calculateCompareSS_SPU(vals[i], base[i], compareTo[i], DIFFERENCE, Strategy.SIMPLE, Strategy.USER_SPLIT);

			System.out.println(stg2 + " strategy was: \n\tbetter in " + splitBetter.fst + " out of " + 
					(USERS*RESOURCES) + " runs compared to the "+ stg1 + "strategy (difference of >= 0 ms considered)");
			if (DIFFERENCE>0)
				System.out.println("\tbetter in " + splitBetter.snd + " out of " + 
						(USERS*RESOURCES) + " runs compared to the " + stg1 + " strategy (difference of >= " + DIFFERENCE + " ms considered)");
			//Show Compare Grid
			System.out.println();
			//printCompare(vals[h], h+1, Strategy.SIMPLE, Strategy.USER_SPLIT);
			}

		}

		else 
			System.out.println("Invalid Comparisons: " + stg1 + " and " + stg2 );
	}

	public static void main(String[] args) {
		compareSearchStrategiesInterleave(Strategy.SIMPLE, Strategy.USER_SPLIT);
	}

}
