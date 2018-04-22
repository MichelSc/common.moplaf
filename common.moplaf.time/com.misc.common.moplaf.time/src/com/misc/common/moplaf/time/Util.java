/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
package com.misc.common.moplaf.time;

import java.util.Calendar;
import java.util.Date;

public class Util {

	public static Date MIN_DATE = new Date(Long.MIN_VALUE);
	public static Date MAX_DATE = new Date(Long.MAX_VALUE);
	public static int MAX_SECONDS = Integer.MAX_VALUE;

	/**
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
	 */
	static public Date addSeconds(Date date, double seconds) {
		if ( seconds == 0.0d) { return date; }
		else {
			long millisAsFromEpoch = date.getTime()+(long)(seconds*1000.0d);
			return new Date(millisAsFromEpoch);
		}
	}

	/**
	 */
	static public Date addDays(Date date, int days) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DATE, days);  
		return c.getTime();
	}

	/**
	 */
	static public Date addMinutes(Date date, double minutes) {
		return Util.addSeconds(date,  minutes*60.0d);
	}

	/**
	 */
	static public Date addHours(Date date, double hours) {
		return Util.addMinutes(date,  hours*60.0d);
	}

	/**
	 */
	static public int getSecondsIntersection(Date from1, Date to1, Date from2, Date to2) {
		Date from = new Date(Math.max(from1.getTime(), from2.getTime()));
		Date to   = new Date(Math.min(to1.getTime(), to2.getTime()));
		int seconds = Util.getSeconds(from,  to);
		return seconds;
	}
	
	/**
	 */
	static public Date getMaxDate(Date date1, Date date2){
		if ( date1.compareTo(date2)>=0 ){
			return date1;
		} else {
			return date2;
		}
	}

	/**
	 */
	static public Date getMinDate(Date date1, Date date2){
		if ( date1.compareTo(date2)<=0 ){
			return date1;
		} else {
			return date2;
		}
	}
	
	/**
	 * Return the day of the week, in a range from 1 (Sunday) to 7 (Saturday)
	 */
	static public int getDayOfWeek(Date date){
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek;
	}
	
	
}
