package com.misc.common.moplaf.time;

import java.util.Date;

public class Util {

	public static Date MIN_DATE = new Date(Long.MIN_VALUE);
	public static Date MAX_DATE = new Date(Long.MAX_VALUE);
	public static int MAX_SECONDS = Integer.MAX_VALUE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	static public int getSeconds(Date start, Date end) {
		int seconds = 0;
		if ( start==MIN_DATE){
			seconds = MAX_SECONDS;
		}
		else if ( end==MAX_DATE){
			seconds = MAX_SECONDS;
		}
		else {
			long millis = end.getTime()-start.getTime();
			seconds = (int)(millis/1000);
		}
		return seconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	static public int getSecondsIntersection(Date from1, Date to1, Date from2, Date to2) {
		Date from = new Date(Math.max(from1.getTime(), from2.getTime()));
		Date to   = new Date(Math.min(to1.getTime(), to2.getTime()));
		int seconds = Util.getSeconds(from,  to);
		return seconds;
	}
}
