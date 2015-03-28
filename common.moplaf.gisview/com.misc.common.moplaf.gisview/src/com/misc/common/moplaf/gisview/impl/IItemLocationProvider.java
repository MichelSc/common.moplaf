package com.misc.common.moplaf.gisview.impl;


public interface IItemLocationProvider {
	float getLongitude(Object element);
	float getLatitude(Object element);
	float getElevation(Object element);
}
