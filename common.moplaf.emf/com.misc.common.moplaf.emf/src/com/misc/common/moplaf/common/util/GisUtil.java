package com.misc.common.moplaf.common.util;

public class GisUtil {
	/**
	 * Return the geodesic distance (on our earth)
	 * coordinates are expressed in degrees, so in x the range [-180 +180] and y in the range [-90, 90]
	 * result is expressed in kms
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */
	static public double getDistance(double x1, double y1, double x2, double y2) {
		// reference: https://en.wikipedia.org/wiki/Great-circle_distance
		double earthRadius = 6371.0d; 

		double latitude1  = Math.PI * x1 / 180.0d;
		double longitude1 = Math.PI * y1 / 180.0d;
		double latitude2  = Math.PI * x2 / 180.0d;
		double longitude2 = Math.PI * y2 / 180.0d;

		double cos = Math.cos( latitude2 ) * Math.cos( latitude1 )* Math.cos( longitude2  - longitude1 )  + Math.sin( latitude2 ) * Math.sin ( latitude1 );
		// coerce into [-1.0, 1.0] because of round off errors
		// cos = Math.min( Math.max( cos,  -1.0d ), 1.0d);

		double angle = Math.acos( cos );

		double distance = angle * earthRadius;

		return distance;
	}

}
