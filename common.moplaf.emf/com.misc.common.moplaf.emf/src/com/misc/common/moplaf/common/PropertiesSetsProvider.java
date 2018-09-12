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
 * <li> an element:Object: the object owning the properties sets(s) </li>
 * <li> a set:Object: an object identifying a set of properties for the owner element</li>
 * <li> a property:Object: an object identifying a property that provides a value. 
 * The Object can be an actual Object, or an Integer, if no collection of Property Objects is provided (see further).
 * In this latter case, the index is zero-based.
 *  </li>
 * </ul>
 * in order to get
 * <ul>
 * <li> the set(s) of properties supported by the element </li>
 * <li> the properties belonging to a set of an element (their number or the actual set)</li>
 * <li> the value of the object for some property of some set </li>
 * </ul>
 * <p>
 * <p>
 * To implement this interface by an {@link PropertiesSetsProvider}, in the interface class, do the following 
 * <ul>
 *   <li>add <code>@implements PropertysSetsProviders</code> in the user doc</li>
 *   <li>regenerate the code</li>
 *   <li>add the unimplemented methods</li>
 *   <li>implement the interface methods</li>
 * </ul> 
 * <p>
 * @author michel
 */

public interface PropertiesSetsProvider {
	static int NO_ALIGN = 0;
	
	static int HORIZONTAL_ALIGN_LEFT   = 1;
	static int HORIZONTAL_ALIGN_RIGHT  = 2;
	static int HORIZONTAL_ALIGN_CENTER = 4;

	static int AGGREGATE_NONE   =  8;
	static int AGGREGATE_COUNT  =  16;
	static int AGGREGATE_SUM    =  32;
	static int AGGREGATE_MIN    =  64;
	static int AGGREGATE_MAX    = 128;

	static int PROPERTY_TYPE_UNKOWN  = 0;
	static int PROPERTY_TYPE_STRING  = 1;
	static int PROPERTY_TYPE_DATE    = 2;
	static int PROPERTY_TYPE_FLOAT   = 3;
	static int PROPERTY_TYPE_DOUBLE  = 4;
	static int PROPERTY_TYPE_INT     = 5;
	static int PROPERTY_TYPE_LONG    = 6;
	static int PROPERTY_TYPE_BOOLEAN = 7;
	
	/**
	 * Returns the properties sets published by the element. 
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
	default Object getPropertiesSets(Object element){
		return null;
	}
	
	/**
	 * Return the text associated to a properties set published by the element.
	 * @param element
	 * @param grid
	 * @return
	 */
	default String getPropertiesSetText(Object element, Object grid) {
		return "";
	}

	/**
	 * Returns the collections of properties a set published by an element.
	 * <p>
	 * If no collection is returned, then the number of properties is given by {@link #getNrPropertys(Object, Object)}
	 * @param element
	 * @param grid
	 * @return
	 */
	default Collection<?> getProperties(Object element, Object set){
		return null;
	}
	
	/**
	 * Returns number of properties of a set published by an element.
	 * <p>
	 * The return value may be ignored when the concrete class implements {@link #getPropertys(Object, Object)}
	 * @param element
	 * @param grid
	 * @return
	 */
	default int getNrProperties(Object element, Object set) {
		return 0;
	}
	
	/**
	 * Return the text associated to a property of a set published by the element.
	 * @param element
	 * @param grid
	 * @return
	 */
	default String getPropertyText(Object element, Object set, Object property) {
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
	default Object getPropertyValue(Object element, Object set, Object property) {
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
	default int getPropertyType(Object element, Object set, Object property) {
		Object value = this.getPropertyValue(element, set, property);
		if      ( value instanceof String )   { return PROPERTY_TYPE_STRING; }
		else if ( value instanceof Date )     { return PROPERTY_TYPE_DATE; }
		else if ( value instanceof Float )    { return PROPERTY_TYPE_FLOAT; }
		else if ( value instanceof Double )   { return PROPERTY_TYPE_DOUBLE; }
		else if ( value instanceof Integer )  { return PROPERTY_TYPE_INT; }
		else if ( value instanceof Long )     { return PROPERTY_TYPE_LONG; }
		else if ( value instanceof Boolean )  { return PROPERTY_TYPE_BOOLEAN; }
		return PROPERTY_TYPE_UNKOWN;
	}

	/**
	/**
	 * Return the display width of a property of a set published by the element.
	 * @param element
	 * @param set
	 * @param property
	 * @return
	 */
	default int getPropertyDisplayWidth(Object element, Object set, Object property) {
		return 200;
	}
	
	/**
	 * Return the alignment to be used to display a property published by an element
	 * @param element
	 * @param grid
	 * @param row
	 * @param column
	 * @return
	 */
	default int getPropertyDisplayALignment (Object element, Object set, Object property, Object column) {
		int type = this.getPropertyType(element, set, property);
		switch ( type ) {
		case PROPERTY_TYPE_STRING: 
			return HORIZONTAL_ALIGN_LEFT;
		case PROPERTY_TYPE_FLOAT:
		case PROPERTY_TYPE_DOUBLE:
		case PROPERTY_TYPE_INT:
		case PROPERTY_TYPE_LONG:
			return HORIZONTAL_ALIGN_RIGHT;
		default: 
			return NO_ALIGN;
		}
	}

	/**
	 * Compares 2 objects according to a given property.
	 * The property must be supported by both compared objects.
	 * @param element
	 * @param set
	 * @param property
	 * @param element1
	 * @param element2
	 * @param ascending
	 * @return
	 */
	default int compare(Object set, Object property, Object element1, Object element2, boolean ascending) {
		int type1 = this.getPropertyType(element1, set, property);
		int type2 = this.getPropertyType(element2, set, property);
		Object value1 = this.getPropertyValue(element1, set, property);
		Object value2 = this.getPropertyValue(element2, set, property);
		return PropertiesSetsProvider.defaultCompareValues(value1, type1, value2, type2, ascending);
	}

	static int defaultCompareValues(Object value1, int type1, Object value2, int type2, boolean ascending) {
		int sense = ascending ? +1 : -1;
		if ( type1<type2 ) { 
			return sense; 
		} else if ( type1>type2) {
			return -sense; 
		}
		switch (type1) {
		case PROPERTY_TYPE_BOOLEAN:
			Boolean boolean1 = (Boolean)value1;
			Boolean boolean2 = (Boolean)value2;
			return sense*boolean1.compareTo(boolean2);
		case PROPERTY_TYPE_STRING:
			String string1 = (String)value1;
			String string2 = (String)value2;
			return sense *string1.compareTo(string2);
		case PROPERTY_TYPE_DATE:
			Date date1 = (Date)value1;
			Date date2 = (Date)value2;
			return sense *date1.compareTo(date2);
		case PROPERTY_TYPE_INT:
			Integer int1 = (Integer)value1;
			Integer int2 = (Integer)value2;
			return sense *int1.compareTo(int2);
		case PROPERTY_TYPE_LONG:
			Long long1 = (Long)value1;
			Long long2 = (Long)value2;
			return sense *long1.compareTo(long2);
		case PROPERTY_TYPE_FLOAT:
			Float float1 = (Float)value1;
			Float float2 = (Float)value2;
			return sense *float1.compareTo(float2);
		case PROPERTY_TYPE_DOUBLE:
			Double double1 = (Double)value1;
			Double double2 = (Double)value2;
			return sense *double1.compareTo(double2);
		default:
			return 0;
		}
	}

}
