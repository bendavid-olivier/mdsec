package utils.statistics;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math3.stat.descriptive.rank.Max;
import org.apache.commons.math3.stat.descriptive.rank.Min;
import org.apache.commons.math3.stat.descriptive.summary.Sum;

public class Statistics implements Comparable<Statistics>{

	private static StandardDeviation calcSD = new StandardDeviation();		
	private static Max calcMAX = new  Max();
	private static Min calcMIN = new Min();
	private static Mean calcMEAN = new Mean();
	private static Sum calcSUM = new Sum();
	private static final int INVALID_COMAPRE = -2000;

	private double[] executionTime;
	private double sd;
	private double max;
	private double min;
	private double mean;
	private double sum;
	private Entry<Double, Integer> mode; 

	//constructor
	public Statistics(double[] et) { executionTime = et;}
	
	//should the data be made public and do away with the following assessors?
	public int size() { return executionTime.length;}
	public double getSD() { return sd;}
	public double getMAX() { return max;}
	public double getMIN() { return min;}
	public double getMEAN() { return mean;}
	public double getSUM() { return sum;}
	public Entry<Double, Integer> getMODE() { return mode;}

	// update the statistics
	public void update (int start, int length) {

		double[] modeTime = new double[length];
		System.arraycopy(executionTime, start, modeTime, 0, length);

		calculateMode(modeTime);
		sum = calcSUM.evaluate(executionTime, start, length);
		min = calcMIN.evaluate(executionTime, start, length);
		max = calcMAX.evaluate(executionTime, start, length);
		mean = calcMEAN.evaluate(executionTime, start, length);
		sd = calcSD.evaluate(executionTime, start, length);
	}

	private void calculateMode (double [] modeTime) {
		HashMap <Double,Integer> execTimesP = new HashMap<Double, Integer>();
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
	}

	@Override
	public int compareTo(Statistics s) {
		//update both statistics objects
		s.update(0, s.size());
		this.update(0, executionTime.length);

		if (equals(s))
			return 0;
		else {
			int a = 0;
			int b = 0;
			//until we decide what better statistics mean this is a working definition
			//if (Double.compare(sd, s.getSD())<0) a++; else b++;
			//if (Double.compare(max, s.getMAX())<0) a++; else b++;
			//if (Double.compare(min, s.getMIN())<0) a++; else b++;
			//if (Double.compare(mean, s.getMEAN())<0) a++; else b++;
			if (Double.compare(sum, s.getSUM())<0) a++; else b++;
			//if ( (Double.compare(mode.getKey(), s.getMODE().getKey())>0) && (mode.getValue() >= s.getMODE().getValue()))
				//a++; else b++;

			if (a>b)
				return a;
			else 
				if (b>a)
					return -b;
				else if (a==b)
					return 0;
		}
		// TODO Auto-generated method stub
		return INVALID_COMAPRE;
	}

	private boolean equals(Statistics s) {
		//since only compareTo calls this, assume compareTo calls update on both objects
		return ( (Double.compare(sd, s.getSD())==0) &&
				(Double.compare(max, s.getMAX())==0) &&
				(Double.compare(min, s.getMIN())==0) &&
				(Double.compare(mean, s.getMEAN())==0) &&
				(Double.compare(sum, s.getSUM())==0) &&
				(Double.compare(mode.getKey(), s.getMODE().getKey())==0) && 
				(mode.getValue() == s.getMODE().getValue())
				);
	}

	@Override
	public String toString() {
		//assumes update is called before the toString is called
		DecimalFormat df = new DecimalFormat();
		String str ="";
		str+= "\tTotal Runtime (of range) : "+ df.format(sum) + "\n";
		str+= "\tmin time : "+ df.format(min) + "\n";
		str+= "\tmax time : "+ df.format(max) + "\n";
		str+= "\tmean time : "+ df.format(mean) + "\n";
		str+= "\tmode : "+ df.format(mode.getKey())+ ", number of OccurrenceMode : "+ df.format(mode.getValue())  + "\n";
		str+= "\tstandard deviation : "+ df.format(sd)  + "\n";
		return str;
	}

	public void printStatistics ( boolean useRange) {

		int sumRange;
		//statistics over sub ranges
		if (useRange) {
			//assume size is divisible by 10;
			sumRange= (int)  Math.pow(10, Math.log10(executionTime.length)-1);
			for (int i = 0; i<executionTime.length; i+= sumRange){
				System.out.println("SUMMARY over runs " + (i+1) + " to " + (sumRange+i));
				update (i, sumRange);
				System.out.println(this);
				System.out.println("END");
			}
		}

		//overall Statistics
		int s = 0, t = executionTime.length;
		update(s,t);
		System.out.println("Statistics for iterations:  " + s + " to " + t + "\n" + this);
		s++; t--;
		update(s,t);
		System.out.println("Statistics for iterations:  " + s + " to " + t + "\n" + this);
	}

	public static void main(String[] args) {
		double[] a = { 11,11,11,11,11,1, 11, 11 };
		double[] b = { 11,11,11,11,11,1, 11, 10 };
		
		Statistics s = new Statistics(a);
		Statistics t = new Statistics(b);
		
		s.update(0, s.size());
		t.update(0, t.size());
		
		System.out.println("Statistics for s: \n" + s);
		System.out.println("Statistics for t: \n" + t);
		
		System.out.println("Comparing s and t gives: " + s.compareTo(t));
		
		s.printStatistics(false);
		t.printStatistics(false);
	}

}