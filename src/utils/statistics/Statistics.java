package utils.statistics;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math3.stat.descriptive.rank.Max;
import org.apache.commons.math3.stat.descriptive.rank.Min;
import org.apache.commons.math3.stat.descriptive.summary.Sum;

public class Statistics {
	private double[] executionTime; // = { 11,11,11,11,11,1, 11, 11 };
	
	public Statistics() {
	}
	
	public Statistics(double[] et) {
		executionTime = et;
	}
	
	public void statistics ( boolean useRange) {

		int sumRange;
		//statistics over sub ranges
		if (useRange) {
			//assume size is divisible by 10;
			 sumRange= (int)  Math.pow(10, Math.log10(executionTime.length)-1);
			for (int i = 0; i<executionTime.length; i+= sumRange){
				rangeStatistics( i, sumRange);
			}
		}
		
		//overall Statistics
		rangeStatistics( 0, executionTime.length);
		rangeStatistics( 1, executionTime.length-1);
	}

	private void rangeStatistics ( int start, int length){

		StandardDeviation sd = new StandardDeviation();		
		Max max = new  Max();
		Min min = new Min();
		Mean mean = new Mean();
		Sum sum = new Sum();
		Entry<Double, Integer> mode = mode(executionTime);
		DecimalFormat df = new DecimalFormat();
		double[] modeTime = null; 
		
		modeTime = new double[length];
		System.arraycopy(executionTime, start, modeTime, 0, length);
		mode = mode(modeTime);
		
		System.out.println("SUMMARY over runs " + (start+1) + " to " + (length+start));
		
		/*System.out.print("\tRun times: ");
		for (double d: modeTime)
			System.out.print(d + " ");
		System.out.println();*/
	
		System.out.println("\tTotal run time : " + df.format(sum.evaluate(executionTime, start, length)));
		System.out.println("\tmin time : "+ df.format(min.evaluate(executionTime, start, length)));
		System.out.println("\tmax time : "+ df.format(max.evaluate(executionTime, start, length)));
		System.out.println("\tmean time : "+mean.evaluate(executionTime, start, length));
		System.out.println("\tmode : "+ df.format(mode.getKey())+ ", number of OccurrenceMode : "+ df.format(mode.getValue()));
		System.out.println("\tstandard deviation : "+ df.format(sd.evaluate(executionTime, start, length)));
		System.out.println("END");
	}
	
	private Entry<Double, Integer> mode (double [] modeTime) {
		HashMap <Double,Integer> execTimesP = new HashMap<Double, Integer>();
		
		Entry<Double, Integer> mode = null;
		int numberOccurrenceMode = 0;

		for(double tim : modeTime){
			
			if(execTimesP.containsKey(tim)){
				int value = execTimesP.get(tim);
				execTimesP.put(tim,  value+ 1);
			}
			else{
				execTimesP.put(tim, 1);
			}
		}
		
		for(Entry<Double, Integer> d : execTimesP.entrySet()){
			//System.out.println(d.getKey() + " " + d.getValue() );
			if(d.getValue() > numberOccurrenceMode){
				mode = d;
				numberOccurrenceMode = d.getValue();
			}
		}
		return mode;
	}
	
	/*public static void main(String[] args) {
		Statistics s = new Statistics();
		s.statistics(false);
	}*/
}

