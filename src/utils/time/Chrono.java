/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utils.time;

/**
 *
 * @author obendavi
 */

import java.util.Date;

public class Chrono {
	private Date dStartDate;
	private Date dEndDate;

	public Chrono() {
	}

	public void start() {
		dStartDate = new Date();
	}

	public void stop() {
		dEndDate = new Date();
	}

	public String displayTime() {
		long lExecTime = dEndDate.getTime() - dStartDate.getTime();
		return "Execution time : " + lExecTime + " milliseconds";
	}
	
	public int timeMs() {
		long lExecTime = dEndDate.getTime() - dStartDate.getTime();
		return (int) lExecTime;
	}
	
	public int getTimeMsSpecial(){
		long lExecTime = new Date().getTime() - dStartDate.getTime();
		return (int) lExecTime;
	}

}
