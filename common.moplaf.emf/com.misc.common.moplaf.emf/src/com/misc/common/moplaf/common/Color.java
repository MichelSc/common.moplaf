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
package com.misc.common.moplaf.common;

import org.eclipse.emf.common.util.URI;

public class Color {
	private int r;
	private int g;
	private int b;
	
	static public Color COLOR_BLACK = new Color(0,0,0);
	
	public Color(int rgb) {
		super();
		int b = rgb % 256;
		int rest = (rgb-b)/256;
		int g = rest % 256;
		int r = rest / 256;
		this.r = r;
		this.g = g;
		this.b = b;
		}

	public Color(int r, int g, int b) {
		super();
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	public Color(float r, float g, float b) {
		super();
		this.r = (int) Math.floor(r*255.0f);
		this.g = (int) Math.floor(g*255.0f);
		this.b = (int) Math.floor(b*255.0f);
	}
	
	public static Color colorFromHueSaturation(float hue, float saturation, float value){ 
		int h = (int)(hue * 6.0f);
		float f = hue * 6.0f - h;
		float p = value * (1.0f - saturation);
		float q = value * (1.0f - f * saturation);
		float t = value * (1.0f - (1.0f - f) * saturation);
		
		switch (h) {
		  case 0: return new Color(value, t, p);
		  case 1: return new Color(q, value, p);
		  case 2: return new Color(p, value, t);
		  case 3: return new Color(p, q, value);
		  case 4: return new Color(t, p, value);
		  case 5: return new Color(value, p, q);
		  default: throw new RuntimeException("Something went wrong when converting from HSV to RGB. Input was " + hue + ", " + saturation + ", " + value);
		}
	}

	public int getR() {
		return r;
	}
	
	public int getG() {
		return g;
	}
	
	public int getB() {
		return b;
	}
	
	public int toInt(){
	    int toReturn = 256 * ( 256 * this.r + this.g )+ this.b;
	    return toReturn;
	}
	
	public URI toURI(){
		return URI.createURI(this.getURIAsString());
	}
	
	
	public String getURIAsString(){
		String uri = String.format("color://rgb/%d/%d/%d", this.getR(), this.getG(), this.getB());
		return uri;
	}

}
