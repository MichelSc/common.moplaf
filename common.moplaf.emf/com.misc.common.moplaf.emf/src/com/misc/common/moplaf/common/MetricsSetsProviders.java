package com.misc.common.moplaf.common;

import java.util.Collection;
import java.util.Date;


/**
 * The interface declares the method(s) to be supported by an object that provides one or 
 * several sets of values, for instance to be displayed as a row in a list.
 * <p>
 * The consumer (i.e. the component using the values sets, typically a list component)
 * will provide, when relevant
 * <ul>
 * <li> an element:Object: the object owning the metrics sets(s) </li>
 * <li> a set:Object: an object identifying a set of metrics for the owner element</li>
 * <li> 
 * a metric:Object: an object identifying a the property that provides a value. 
 * The Object can be an actual Object, or an Integer, if no collection of Metric Objects is provided (see further).
 * In this latter case, the index is zero-based.
 *  </li>
 * </ul>
 * in order to get
 * <ul>
 * <li> the set(s) of metrics supported by the element </li>
 * <li> the metrics belonging to a set of an element (their number or the actual set)</li>
 * <li> the value of the object for some metric of some set </li>
 * </ul>
 * <p>
 * <p>
 * To implement this interface by an {@link MetricsSetsProviders}, in the interface class, do the following 
 * <ul>
 *   <li>add <code>@implements MetricsSetsProviders</code> in the user doc</li>
 *   <li>regenerate the code</li>
 *   <li>add the unimplemented methods</li>
 *   <li>implement the interface methods</li>
 * </ul> 
 * <p>
 * @author michel
 */

public interface MetricsSetsProviders {
	static int NO_ALIGN = 0;
	
	static int HORIZONTAl_ALIGN_LEFT   = 1;
	static int HORIZONTAl_ALIGN_RIGHT  = 2;
	static int HORIZONTAl_ALIGN_CENTER = 4;

	static int AGGREGATE_NONE   =  8;
	static int AGGREGATE_COUNT  =  16;
	static int AGGREGATE_SUM    =  32;
	static int AGGREGATE_MIN    =  64;
	static int AGGREGATE_MAX    = 127;

	static int METRIC_TYPE_UNKOWN  = 0;
	static int METRIC_TYPE_STRING  = 1;
	static int METRIC_TYPE_DATE    = 2;
	static int METRIC_TYPE_FLOAT   = 3;
	static int METRIC_TYPE_DOUBLE  = 4;
	static int METRIC_TYPE_INT     = 5;
	static int METRIC_TYPE_LONG    = 6;
	static int METRIC_TYPE_BOOLEAN = 7;
	
	/**
	 * Returns the metrics sets published by the element. 
	 * <p>
	 * The method may return 
	 * <ul>
	 * <li> null: no set for the element </li>
	 * <li> Collection<?>: a collection of sets for the element</li>
	 * <li> otherwise an Object: a single set for the element </li>
	 * </ul>
	 * @param element
	 * @return
	 */
	default Object getMetricsSets(Object element){
		return null;
	}
	
	/**
	 * Return the text associated to a metrics set published by the element.
	 * @param element
	 * @param grid
	 * @return
	 */
	default String getMetricsSetText(Object element, Object grid) {
		return "";
	}

	/**
	 * Returns the collections of metrics a set published by an element.
	 * <p>
	 * If no collection is returned, then the number of metrics is given by {@link #getNrMetrics(Object, Object)}
	 * @param element
	 * @param grid
	 * @return
	 */
	default Collection<?> getMetrics(Object element, Object set){
		return null;
	}
	
	/**
	 * Returns number of metrics of a set published by an element.
	 * <p>
	 * The return value may be ignored when the concrete class implements {@link #getMetrics(Object, Object)}
	 * @param element
	 * @param grid
	 * @return
	 */
	default int getNrMetrics(Object element, Object set) {
		return 0;
	}
	
	/**
	 * Return the text associated to a metric of a set published by the element.
	 * @param element
	 * @param grid
	 * @return
	 */
	default String getMetricText(Object element, Object set, Object metric) {
		return "";
	}

	/**
	 * 
	 * @param element
	 * @param grid
	 * @param row
	 * @param column
	 * @return
	 */
	default Object getMetricValue(Object element, Object set, Object metric) {
		return null;
	}

	/**
	 * 
	 * @param element
	 * @param grid
	 * @param row
	 * @param column
	 * @return
	 */
	default int getMetricType(Object element, Object set, Object metric) {
		Object value = this.getMetricValue(element, set, metric);
		if      ( value instanceof String )   { return METRIC_TYPE_STRING; }
		else if ( value instanceof Date )     { return METRIC_TYPE_DATE; }
		else if ( value instanceof Float )    { return METRIC_TYPE_FLOAT; }
		else if ( value instanceof Double )   { return METRIC_TYPE_DOUBLE; }
		else if ( value instanceof Integer )  { return METRIC_TYPE_INT; }
		else if ( value instanceof Long )     { return METRIC_TYPE_LONG; }
		else if ( value instanceof Boolean )  { return METRIC_TYPE_BOOLEAN; }
		return METRIC_TYPE_UNKOWN;
	}

	/**
	/**
	 * Return the display width of a metric of a set published by the element.
	 * @param element
	 * @param set
	 * @param metric
	 * @return
	 */
	default int getMetricDisplayWidth(Object element, Object set, Object metric) {
		return 200;
	}
	
	/**
	 * Return the alignment to be used in a cell of a grid published by an element
	 * @param element
	 * @param grid
	 * @param row
	 * @param column
	 * @return
	 */
	default int getMetricDisplayALignment (Object element, Object set, Object metric, Object column) {
		int type = this.getMetricType(element, set, metric);
		switch ( type ) {
		case METRIC_TYPE_STRING: 
			return HORIZONTAl_ALIGN_LEFT;
		case METRIC_TYPE_FLOAT:
		case METRIC_TYPE_DOUBLE:
		case METRIC_TYPE_INT:
		case METRIC_TYPE_LONG:
			return HORIZONTAl_ALIGN_RIGHT;
		default: 
			return NO_ALIGN;
		}
	}

	/**
	 * Compares 2 objects according to a given metric.
	 * The metric must be supported by both compared objects.
	 * @param element
	 * @param set
	 * @param metric
	 * @param element1
	 * @param element2
	 * @param ascending
	 * @return
	 */
	default int compare(Object set, Object metric, Object element1, Object element2, boolean ascending) {
		int type1 = this.getMetricType(element1, set, metric);
		int type2 = this.getMetricType(element2, set, metric);
		Object value1 = this.getMetricValue(element1, set, metric);
		Object value2 = this.getMetricValue(element2, set, metric);
		return MetricsSetsProviders.defaultCompareValues(value1, type1, value2, type2, ascending);
	}

	static int defaultCompareValues(Object value1, int type1, Object value2, int type2, boolean ascending) {
		int sense = ascending ? +1 : -1;
		if ( type1<type2 ) { 
			return sense; 
		} else if ( type1>type2) {
			return -sense; 
		}
		switch (type1) {
		case METRIC_TYPE_BOOLEAN:
			Boolean boolean1 = (Boolean)value1;
			Boolean boolean2 = (Boolean)value2;
			return sense*boolean1.compareTo(boolean2);
		case METRIC_TYPE_STRING:
			String string1 = (String)value1;
			String string2 = (String)value2;
			return sense *string1.compareTo(string2);
		case METRIC_TYPE_DATE:
			Date date1 = (Date)value1;
			Date date2 = (Date)value2;
			return sense *date1.compareTo(date2);
		case METRIC_TYPE_INT:
			Integer int1 = (Integer)value1;
			Integer int2 = (Integer)value2;
			return sense *int1.compareTo(int2);
		case METRIC_TYPE_LONG:
			Long long1 = (Long)value1;
			Long long2 = (Long)value2;
			return sense *long1.compareTo(long2);
		case METRIC_TYPE_FLOAT:
			Float float1 = (Float)value1;
			Float float2 = (Float)value2;
			return sense *float1.compareTo(float2);
		case METRIC_TYPE_DOUBLE:
			Double double1 = (Double)value1;
			Double double2 = (Double)value2;
			return sense *double1.compareTo(double2);
		default:
			return 0;
		}
	}

}
