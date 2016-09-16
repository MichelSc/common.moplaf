package com.misc.common.moplaf.emf.edit;


import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.swt.graphics.RGB;

import com.misc.common.moplaf.common.Color;

public class Util {

	public static RGB integerToRgb(int integer){
		int b = integer % 256;
		int rest = (integer-b)/256;
		int g = rest % 256;
		int r = rest / 256;
		try{
			return new RGB(r, g, b);
		} catch(Exception e){
			CommonPlugin.INSTANCE.log("No RGB made");
			return null;
		}
		
	}

	public static RGB colorToRgb(Color color){
		return new RGB(color.getR(), color.getG(), color.getB());
	}

	public static int rgbToInt(RGB rgb){
		if ( rgb == null) { return 0; }
	    int toReturn = 256 * ( 256 * rgb.red + rgb.green )+ rgb.blue;
	    return toReturn;
	}

}
