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

import org.eclipse.emf.common.util.URI;

public class Color {
	private int r;
	private int g;
	private int b;
	
	static public Color COLOR_BLACK   = new Color(  0,   0,   0);
	static public Color COLOR_WHITE   = new Color(255, 255, 255);
	static public Color COLOR_CYAN    = new Color(  0, 255, 255);
	static public Color COLOR_MAGENTA = new Color(255,   0, 255);
	static public Color COLOR_YELLOW  = new Color(255, 255,   0);
	static public Color COLOR_BLUE    = new Color(  0,   0, 255);
	static public Color COLOR_RED     = new Color(255,   0,   0);
	static public Color COLOR_GREEN   = new Color(  0, 255,   0);

	static public Color COLOR_LIGHTCORAL    = new Color(240, 128, 128);
	static public Color COLOR_LIGHTSALMON   = new Color(255, 160, 122);
	static public Color COLOR_LIGHTGREEN    = new Color(144, 238, 144);
	static public Color COLOR_LIGHTSEAGREEN = new Color(32, 178, 170);
	static public Color COLOR_LIGHTBLUE     = new Color(173, 216, 230);
	static public Color COLOR_LIGHTPINK     = new Color(255, 182, 193);
	static public Color COLOR_LIGHTGREY     = new Color(211, 211, 211);
	
	static public Color COLOR_SIRIUSYELLOW  = new Color(225, 225, 135);
	static public Color COLOR_SIRIUSCYAN    = new Color(155, 199, 204);
	static public Color COLOR_SIRIUSRED     = new Color(222, 164, 156);

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
	
	/* parameters hue, saturation and lightness between 0.0 and 1.0 */
	public static Color colorFromHueSaturation(float hue, float saturation, float lightness){ 
		int h = (int)(hue * 6.0f);
		float f = hue * 6.0f - h;
		float p = lightness * (1.0f - saturation);
		float q = lightness * (1.0f - f * saturation);
		float t = lightness * (1.0f - (1.0f - f) * saturation);
		
		switch (h) {
		  case 0: return new Color(lightness, t, p);
		  case 1: return new Color(q, lightness, p);
		  case 2: return new Color(p, lightness, t);
		  case 3: return new Color(p, q, lightness);
		  case 4: return new Color(t, p, lightness);
		  case 5: return new Color(lightness, p, q);
		  default: throw new RuntimeException("Something went wrong when converting from HSV to RGB. Input was " + hue + ", " + saturation + ", " + lightness);
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
