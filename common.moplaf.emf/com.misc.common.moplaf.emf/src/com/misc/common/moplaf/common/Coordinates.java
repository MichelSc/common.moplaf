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
package com.misc.common.moplaf.common;

import java.util.StringTokenizer;

public class Coordinates {
	private double x, y, z;
	public Coordinates (double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	@Override
	public String toString() {
		String string = String.format("%s,%s,%s", 
				Double.toString(this.getX()),
				Double.toString(this.getY()),
				Double.toString(this.getZ()));
		return string;
	}
	
	public static Coordinates valueOf(String string) {
		double x = 0.0d;
		double y = 0.0d;
		double z = 0.0d;
		StringTokenizer tokenizer = new StringTokenizer(string, ",");
		int index = 0;
		while ( tokenizer.hasMoreTokens() && index<3 ) {
			String token = tokenizer.nextToken();
			Double value = Double.valueOf(token);
			if ( index == 0 ) {
				x = value;
			} else if ( index == 1) {
				y = value;
			} else if ( index == 2 ) {
				z = value;
			}
			index++;
		}
		return new Coordinates(x,y,z);
	}
}
