/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
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
	static public Date addSeconds(Date date, double seconds) {
		if ( seconds == 0.0d) { return date; }
		else {
			long millisAsFromEpoch = date.getTime()+(long)(seconds*1000.0d);
			return new Date(millisAsFromEpoch);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	static public Date addDays(Date date, int days) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DATE, days);  
		return c.getTime();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	static public Date addMinutes(Date date, double minutes) {
		return Util.addSeconds(date,  minutes*60.0d);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	static public Date addHours(Date date, double hours) {
		return Util.addMinutes(date,  hours*60.0d);
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	static public Date getMaxDate(Date date1, Date date2){
		if ( date1.compareTo(date2)>=0 ){
			return date1;
		} else {
			return date2;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	static public Date getMinDate(Date date1, Date date2){
		if ( date1.compareTo(date2)<=0 ){
			return date1;
		} else {
			return date2;
		}
	}
}
