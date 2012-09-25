package policyTools.simulation;

import java.text.DecimalFormat;
import com.sun.tools.javac.util.Pair;
import utils.statistics.Statistics;
import utils.time.Chrono;

public class Experiments{
	private static int USERS = 5;
	private static int RESOURCES =5;
	private static int ITERATIONS = 5;
	private static int DIFFERENCE = 50;
	private static DecimalFormat df = new DecimalFormat();

	private double [][][] executionTimeSS = new double[ITERATIONS][USERS][RESOURCES];
	private double [][][] executionTimeSPU = new double[ITERATIONS][USERS][RESOURCES];
	private double [][][] executionTimeSPR = new double[ITERATIONS][USERS][RESOURCES];

	private double [][][] executionTimeCompareSS_SPU = new double[ITERATIONS][USERS][RESOURCES];
	private double [][][] executionTimeCompareSS_SPR = new double[ITERATIONS][USERS][RESOURCES];
	private double [][][] executionTimeCompareSPU_SPR = new double[ITERATIONS][USERS][RESOURCES];
	private double[] totalTimes = new double[ITERATIONS];
	private Statistics[][] statistics = new Statistics[USERS][RESOURCES];

	public Experiments () {

	}

	public Pair<Integer, Integer> statsSize() { 
		return new Pair<Integer,Integer>(statistics.length, statistics[0].length);
	}

	public Statistics[][] getStats() {
		return statistics;
	}

	private double [][][] setLocalBC ( Strategy strategy) {

		double [][][] exArray;

		switch (strategy) {
		case ROLE_SPLIT: 
			exArray = executionTimeSPR;
			break;
		case USER_SPLIT: 
			exArray = executionTimeSPU;
			break;
		default:
			exArray = executionTimeSS;
		}
		return exArray;
	}

	private double [][][] setLocalVals ( Strategy stg1, Strategy stg2) {
		double [][][] vals;
		if ((stg1==Strategy.SIMPLE && stg2==Strategy.USER_SPLIT) || (stg2==Strategy.SIMPLE && stg1==Strategy.USER_SPLIT))
			vals = executionTimeCompareSS_SPU;
		else 
			if ((stg1==Strategy.SIMPLE && stg2==Strategy.ROLE_SPLIT) || (stg2==Strategy.SIMPLE && stg1==Strategy.ROLE_SPLIT))
				vals = executionTimeCompareSS_SPR;
			else 
				vals = executionTimeCompareSPU_SPR;
		return vals;
	}

	private void runStrategy(Strategy strategy) {
		switch (strategy) {
		case ROLE_SPLIT: 
			runSplitRole();
			break;
		case USER_SPLIT: 
			runSplitUser();
			break;
		default: 
			runSimple();
		}
	}

	private void runSimple() {
		Chrono c = new Chrono();
		for (int i=0; i<ITERATIONS; i++)
			simple(c, i);
	}

	private void runSplitUser() {
		Chrono c = new Chrono();
		for (int i=0; i<ITERATIONS; i++)
			splitUser(c, i);
	}

	private void runSplitRole() {
		Chrono c = new Chrono();
		for (int i=0; i<ITERATIONS; i++)
			splitRole(c, i);
	}

	private void simple(Chrono c, int iteration) {
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

	private void splitUser( Chrono c, int iteration) {

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

	private void splitRole( Chrono c, int iteration) {
		for (int i=0; i<USERS; i++) {
			for (int j=0; j<RESOURCES; j++){

			}
		}
	}

	private void compareExperiments(double[][] vals, 
			double[][] base, 
			double[][] compareTo, 
			Strategy stg1, Strategy stg2,
			int iteration) {

		Pair<Integer,Integer> splitBetter;

		//Print Compare Results
		System.out.println("\nComparison: Difference between " + stg1 + " and " + stg2 + 
				" Strategies on ITERATION: " + iteration );
		splitBetter = calculateStrategiesComparisons(vals, base, compareTo, stg1, stg2);

		System.out.println(stg2 + " strategy was: \n\tbetter in " + splitBetter.fst + " out of " + 
				(USERS*RESOURCES) + " runs compared to the "+ stg1 + "strategy (difference of >= 0 ms considered)");
		if (DIFFERENCE>0)
			System.out.println("\tbetter in " + splitBetter.snd + " out of " + 
					(USERS*RESOURCES) + " runs compared to the " + stg1 + " strategy (difference of >= " + DIFFERENCE + " ms considered)");
		//Show Compare Grid
		System.out.println();
		//printCompare(vals[h], h+1, Strategy.SIMPLE, Strategy.USER_SPLIT);

	}

	private Pair<Integer,Integer> calculateStrategiesComparisons(double[][] vals, 
			double[][] base, 
			double[][] compareTo, 
			Strategy stg1, Strategy stg2) {
		int k = 0, l = 0;
		for (int i=0; i<USERS; i++) 
			for (int j=0; j<RESOURCES; j++) {
				vals[i][j] = base[i][j] - compareTo[i][j];

				if (vals[i][j] >= 0) {
					k++;
					if ((vals[i][j] >= DIFFERENCE) && (DIFFERENCE>0))  {
						/*System.out.println ("\tFor " + (i+1) + " USERS  and " + ((j+1) + 
								" RESOURCES the " + stg2 + " strategy was better by " + vals[i][j] + 
								" ms compared to the " + stg1 + " strategy." ));*/
						l++;
					}
				}
			}
		return new Pair<Integer,Integer>(k,l);
	}

	private void printCompare (double[][] et, int iteration, Strategy strategy1, Strategy strategy2) {
		System.out.println("All execution times compared  for USERS:" + USERS + " and RESOURCES:" + RESOURCES + " on ITERATION: " + iteration +  
				".\n\tValues shown are the difference between the time for " + strategy1 + " and time for " + strategy2 + ")"); 
		for (int i=0; i<USERS; i++) {
			for (int j=0; j<RESOURCES; j++)
				System.out.print(df.format(et[i][j])  + "\t");
			System.out.println();
		}
	}

	public void compareSearchStrategiesInterleave(Strategy stg1, Strategy stg2) {
		Chrono cTotal = new Chrono();

		double [][][] base = null;
		double [][][] compareTo = null;
		double [][][] vals = null;

		if ((stg1 != stg2) && (stg1 != null) && (stg2 != null))  {
			base = setLocalBC(stg1);
			compareTo = setLocalBC(stg2);
			vals = setLocalVals(stg1, stg2);

			//process iterations
			System.out.println("(Interleaved) Simulation of strategies: Simple and Split for " + USERS + " USER(S) and " + 
					RESOURCES + " RESOURCE(S) for " + ITERATIONS + " ITERATION(S)");

			for (int h=0; h<ITERATIONS;h++) {
				System.out.println("------------------------------------------------------------------------------------------------------------------------");
				System.out.println("Start of Iteration: " + (h+1));
				
				//start clock for total
				cTotal.start();
				
				//execute Strategy
				System.out.println("\tStart: Simulation " + stg1);
				runStrategy(stg1);
				System.out.println("\tStart: Simulation " + stg2);
				runStrategy(stg2);

				//stop clock for total
				cTotal.stop();
				totalTimes[h] = cTotal.timeMs();
				System.out.println("\tTotal time for Simulations is " + df.format(totalTimes[h]/1000) + " seconds\n");

				compareExperiments(vals[h], base[h], compareTo[h],stg1, stg2, h+1);
			}//end for

			System.out.println("All ITERATIONS: Time for each run" );
			for (int i=0; i<ITERATIONS; i++)
				System.out.println("\t time on iteration: " + (i+1) + " is " + df.format(totalTimes[i]/1000) + " seconds");
		}
		else 
			System.out.println("Invalid Comparisons: " + stg1 + " and " + stg2 );
	}	

	public void compareSearchStrategiesSequental(Strategy stg1, Strategy stg2) {
		double [][][] base = null;
		double [][][] compareTo = null;
		double [][][] vals = null;

		//process iterations
		System.out.println("(Sequential) Simulation of strategies: Simple and Split for " + USERS + " USER(S) and " + 
				RESOURCES + " RESOURCE(S) for " + ITERATIONS + " ITERATION(S)");

		if ((stg1 != stg2) && (stg1 != null) && (stg2 != null))  {

			//set local pointers
			base = setLocalBC(stg1);
			compareTo = setLocalBC(stg2);
			vals = setLocalVals(stg1, stg2);

			//execute Strategy
			System.out.println("\tStart: Simulation " + stg1 + " for all iterations");
			runStrategy(stg1);
			System.out.println("\tStart: Simulation " + stg2 + " for all iterations");
			runStrategy(stg2);

			//Print Compare Results
			for (int i=0; i<ITERATIONS; i++)
				compareExperiments(vals[i], base[i], compareTo[i], stg1, stg2, i+1);
		}

		else 
			System.out.println("Invalid Comparisons: " + stg1 + " and " + stg2 );
	}

	public Statistics[][] calculateStatistics(Strategy strategy) {
		/*for h, i, and j, where i and j do not change, 
		 *  we have all the execution times for the h ITERATIONS for i USERS and j RESOURCES 
		 */

		double[] s = new double[ITERATIONS];
		double [][][] t = setLocalBC(strategy);

		for ( int i=0; i<USERS; i++) 
			for ( int j=0; j<RESOURCES; j++){
				for (int h=0; h<ITERATIONS; h++ )
					s[h] = t[h][i][j];
				Statistics stats = new Statistics(s);
				stats.update(0, ITERATIONS);
				statistics[i][j] = stats;
			}
		return statistics;
	}

	public void compareStatistics(Experiments exp, int whichBetter) {
		compareStatistics(statistics, exp.getStats(), whichBetter);
	}

	public static void compareStatistics(Statistics[][] base, Statistics[][] compare, int whichBetter) {
		
		if (base.length == compare.length && base[0].length == compare[0].length ){
			
			int better=0, worse=0, equal=0;
			for (int i=0; i<USERS; i++) {
				for (int j=0; j<RESOURCES; j++){
					//System.out.println("Statistics for base: \n" + statistics[i][j]);
					//System.out.println("Statistics for comparison: \n" + t[i][j]);

					int c = base[i][j].compareTo(compare[i][j]) ;
					switch(whichBetter) { //fall through is intended
					case 2:
						if (c<0){
							better++;
							//System.out.println("Comparing in dimension " + (i+1) + " USERS and " + (j+1) + " RESOURCES gives: " + c );
						}
					case 1:
						if (c>0){
							worse++;
							//System.out.println("Comparing in dimension " + (i+1) + " USERS and " + (j+1) + " RESOURCES gives: " + c );
						}
						break;
					case 0:
						if (c==0){
							equal++;
							//System.out.println("Comparing in dimension " + (i+1) + " USERS and " + (j+1) + " RESOURCES gives: " + c );
						}
						break;
					default:
						System.out.println("Invalid!");
					} //end switch	
				}//end for j
			} //end for i
			System.out.println("Cases better: " + better + ", worse: " + worse + ", equal: " + equal);
		}
		else System.out.println("Not Comparable: Incompatible dimensions!");
	}
	
	public static void experiement1() {
		Experiments experiment1 = new Experiments();
		experiment1.compareSearchStrategiesInterleave(Strategy.SIMPLE, Strategy.USER_SPLIT);

		System.out.println("\n\n");
		System.out.println("========================================================================================================================");
		Experiments experiment2 = new Experiments();
		experiment2.compareSearchStrategiesSequental(Strategy.SIMPLE, Strategy.USER_SPLIT);

		System.out.println("\n\n");
		System.out.println("========================================================================================================================");
		System.out.println("Comparing Statistics SIMPLE Interleaved to SIMPLE Sequential---");
		experiment1.calculateStatistics(Strategy.SIMPLE);
		experiment2.calculateStatistics(Strategy.SIMPLE);
		//experiment1.compareStatistics(experiment2, 0);
		//experiment1.compareStatistics(experiment2, 1);
		experiment1.compareStatistics(experiment2, 2);
		
		System.out.println("\n\n");
		System.out.println("========================================================================================================================");
		System.out.println("Comparing Statistics USER_SPLIT Interleaved to USER_SPLIT Sequential---");
		experiment1.calculateStatistics(Strategy.USER_SPLIT);
		experiment2.calculateStatistics(Strategy.USER_SPLIT);
		//experiment1.compareStatistics(experiment2, 0);
		//experiment1.compareStatistics(experiment2, 1);
		experiment1.compareStatistics(experiment2, 2);
		
		
		System.out.println("\n\n");
		System.out.println("========================================================================================================================");
		System.out.println("Comparing Statistics SIMPLE Interleaved to USER_SPLIT Sequential---");
		experiment1.calculateStatistics(Strategy.SIMPLE);
		experiment2.calculateStatistics(Strategy.USER_SPLIT);
		//experiment1.compareStatistics(experiment2, 0);
		//experiment1.compareStatistics(experiment2, 1);
		experiment1.compareStatistics(experiment2, 2);
		
		System.out.println("\n\n");
		System.out.println("========================================================================================================================");
		System.out.println("Comparing Statistics USER_SPLIT Interleaved to SIMPLE Sequential---");
		experiment1.calculateStatistics(Strategy.USER_SPLIT);
		experiment2.calculateStatistics(Strategy.SIMPLE);
		//experiment1.compareStatistics(experiment2, 0);
		//experiment1.compareStatistics(experiment2, 1);
		experiment1.compareStatistics(experiment2, 2);
	}	
		
	public static void experiement2() {
	
		/* using Sequential Execution for Comparison, 
		 * can only be run when ROLE_SPLIT strategy has been implemented*/
		Experiments experiment = new Experiments();
		
		//run all strategies
		experiment.runSimple();
		experiment.runSplitUser();
		experiment.runSplitRole();
		
		//calculate statistics for all categories
		Statistics[][] simpleStats = experiment.calculateStatistics(Strategy.SIMPLE);
		Statistics[][] userSplitStats = experiment.calculateStatistics(Strategy.USER_SPLIT);
		Statistics[][] roleSplitStats = experiment.calculateStatistics(Strategy.ROLE_SPLIT);
		
		//run comparisons on statistics
		System.out.println("========================================================================================================================");
		System.out.println("Comparing Statistics SIMPLE Sequential to USER_SPLIT Sequential ---");
		Experiments.compareStatistics(simpleStats, userSplitStats, 2);
		System.out.println("========================================================================================================================");
		System.out.println("Comparing Statistics SIMPLE Sequential to ROLE_SPLIT Sequential ---");
		Experiments.compareStatistics(simpleStats, roleSplitStats, 2);
		System.out.println("========================================================================================================================");
		System.out.println("Comparing Statistics ROLE_SPLIT Sequential to USER_SPLIT Sequential ---");
		Experiments.compareStatistics(roleSplitStats, userSplitStats, 2);
	}
	
	public static void main(String[] args) {
		Experiments.experiement1();
	}

}
