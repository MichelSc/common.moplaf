package com.misc.common.moplaf.emf.edit;


import org.eclipse.swt.graphics.RGB;

public class Util {

	public static RGB integerToRgb(int integer){
		int b = integer % 256;
		int rest = (integer-b)/256;
		int g = rest % 256;
		int r = rest / 256;
		return new RGB(r, g, b);
	}

	public static int rgbToInt(RGB rgb){
		if ( rgb == null) { return 0; }
	    int toReturn = 256 * ( 256 * rgb.red + rgb.green )+ rgb.blue;
	    return toReturn;
	}

}
