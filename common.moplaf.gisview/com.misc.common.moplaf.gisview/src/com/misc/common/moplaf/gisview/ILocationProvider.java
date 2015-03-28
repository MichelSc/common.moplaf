package com.misc.common.moplaf.gisview;


public interface ILocationProvider {
	float getLongitude(Object element);
	float getLatitude(Object element);
	float getElevation(Object element);
	boolean isLocation(Object element);
}
