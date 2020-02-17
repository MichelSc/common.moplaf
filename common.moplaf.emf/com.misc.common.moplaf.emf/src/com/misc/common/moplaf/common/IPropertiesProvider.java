package com.misc.common.moplaf.common;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcorePackage;


/**
 * The interface declares the method(s) to be supported by an object that provides properties, for instance to display elements as rows in a list.
 * <p>
 * The consumer (i.e. the component using the values sets, typically a list component)
 * will provide, when relevant
 * <ul>
 * <li> an element:Object: the object owning the properties </li>
 * <li> a property:Object: an object identifying a property that provides a value for a given element.
 * The Object can be an actual Object, or an Integer, if no collection of Property Objects is provided (see further).
 * In this latter case, the index is zero-based.
 *  </li>
 * </ul>
 * in order to get
 * <ul>
 * <li> the properties supported by the element </li>
 * <li> the value of the property for some element </li>
 * </ul>
 * <p>
 * <p>
 * To implement this interface by an {@link IPropertiesProvider}, in the interface class, do the following 
 * <ul>
 *   <li>add <code>@implements IPropertiesProvider</code> in the user doc</li>
 *   <li>regenerate the code</li>
 *   <li>add the unimplemented methods</li>
 *   <li>implement the interface methods</li>
 * </ul> 
 * <p>
 * @author michel
 */

public interface IPropertiesProvider extends Constants{
	
	/**
	 * Returns the collections of properties published by this provider.
	 * Implementation must implement this method or method GetNrProperties, but not both.
	 * <p>
	 * @return
	 */
	default Collection<?> getProperties(){
		List<Integer> properties = new LinkedList<>();
		for ( int i=0; i<this.getNrProperties(); i++) {
			properties.add(i);
		}
		return null;
	}
	
	/**
	 * Returns number of properties published by this provider
	 * Implementation must implement this method or method GetProperties, but not both.
	 * <p>
	 */
	default int getNrProperties() {
		return this.getProperties().size();
	}
	
	/**
	 * Return the text associated to a property published by the provider.
	 * @param property
	 * @return
	 */
	default String getPropertyText(Object property) {
		return "";
	}

	/**
	 * 
	 * @param element
	 * @param property
	 * @return
	 */
	default Object getPropertyValue(Object element, Object property) {
		return null;
	}

	/**
	 * 
	 * @param element
	 * @param property
	 * @return
	 */
	default int getPropertyValueTraits(Object element, Object property) {
		return TRAITS_NONE;
	}

	/**
	 * 
	 * @param property
	 * @return
	 */
	default int getPropertyType(Object property) {
		return DATA_TYPE_UNKOWN;
	}

	/**
	 * 
	 * @param property
	 * @return
	 */
	default int getPropertyTraits(Object property) {
		return TRAITS_NONE; // no traits per default
	}

	/**
	 * 
	 * @param property
	 * @return
	 */
	default int getPropertyAggregation(Object property) {
		return AGGREGATE_NONE;
	}


	/**
	/**
	 * Return the display width of a property 
	 * @param element
	 * @param set
	 * @param property
	 * @return
	 */
	default int getPropertyDisplayWidth(Object property) {
		return 200;
	}
	
	/**
	 * Return the alignment to be used to display a property published by the provider
	 * @param property
	 * @return
	 */
	default int getPropertyDisplayAlignment (Object property) {
		int type = this.getPropertyType(property);
		switch ( type ) {
		case DATA_TYPE_STRING: 
			return HORIZONTAL_ALIGN_LEFT;
		case DATA_TYPE_FLOAT:
		case DATA_TYPE_DOUBLE:
		case DATA_TYPE_INT:
		case DATA_TYPE_LONG:
			return HORIZONTAL_ALIGN_RIGHT;
		default: 
			return NO_ALIGN;
		}
	}

	/**
	 * Return the color used as foreground for the property
	 * @param property
	 * @return
	 */
	default Color getPropertyForegroundColor(Object property) {
		return null;
	}

	/**
	 * Return the color used as background for the property
	 * @param property
	 * @return
	 */
	default Color getPropertyBackgroundColor(Object property) {
		return null;
	}

	/**
	 * Compares 2 objects according to a given property.
	 * The property must be supported by both compared objects.
	 * Return a negative value if element1 is before element2
	 * @param element
	 * @param set
	 * @param property
	 * @param element1
	 * @param element2
	 * @param ascending
	 * @return
	 */
	default int compare(Object property, Object element1, Object element2, boolean ascending) {
		int type = this.getPropertyType(property);
		Object value1 = this.getPropertyValue(element1, property);
		Object value2 = this.getPropertyValue(element2, property);
		return IPropertiesProvider.defaultCompareValues(value1, value2, type, ascending);
	}

	static int defaultCompareValues(Object value1, Object value2, int type, boolean ascending) {
		int sense = ascending ? +1 : -1;
		if ( value1==null) {
			return -sense;
		} 
		if ( value2==null) {
			return sense;
		}
		switch (type) {
		case DATA_TYPE_BOOLEAN:
			Boolean boolean1 = (Boolean)value1;
			Boolean boolean2 = (Boolean)value2;
			return sense*boolean1.compareTo(boolean2);
		case DATA_TYPE_STRING:
			String string1 = (String)value1;
			String string2 = (String)value2;
			return sense *string1.compareTo(string2);
		case DATA_TYPE_DATE:
			Date date1 = (Date)value1;
			Date date2 = (Date)value2;
			return sense *date1.compareTo(date2);
		case DATA_TYPE_INT:
			Integer int1 = (Integer)value1;
			Integer int2 = (Integer)value2;
			return sense *int1.compareTo(int2);
		case DATA_TYPE_LONG:
			Long long1 = (Long)value1;
			Long long2 = (Long)value2;
			return sense *long1.compareTo(long2);
		case DATA_TYPE_FLOAT:
			Float float1 = (Float)value1;
			Float float2 = (Float)value2;
			return sense *float1.compareTo(float2);
		case DATA_TYPE_DOUBLE:
			Double double1 = (Double)value1;
			Double double2 = (Double)value2;
			return sense *double1.compareTo(double2);
		default:
			return 0;
		}
	}
	
	
	/**
	 * 
	 * @param elements
	 * @param property
	 * @return
	 */
	default public Object getAggregationValue(Collection<?>elements, Object property) {
		if ( elements==null) {
			return null;
		}
		int type = this.getPropertyType(property);
		switch ( this.getPropertyAggregation(property)) {
		case AGGREGATE_SUM : 
			switch ( type ) {
			case DATA_TYPE_DOUBLE: 
				return elements.stream()
						.map(e -> this.getPropertyValue(e, property))
						.filter(v -> v!=null)
						.mapToDouble(v -> (Double)v)
						.sum();
			case DATA_TYPE_FLOAT : 
				return (float) elements.stream()
						.map(e -> this.getPropertyValue(e, property))
						.filter(v -> v!=null)
						.mapToDouble(v -> (Float)v)
						.sum();
			case DATA_TYPE_LONG  : 
				return elements.stream()
						.map(e -> this.getPropertyValue(e, property))
						.filter(v -> v!=null)
						.mapToLong(v -> (Long)v)
						.sum();
			case DATA_TYPE_INT  : 
				return (int) elements.stream()
						.map(e -> this.getPropertyValue(e, property))
						.filter(v -> v!=null)
						.mapToLong(v -> (Integer)v)
						.sum();
			default : return null;
			}
		case AGGREGATE_MAX : {
			switch ( type ) {
			case DATA_TYPE_DOUBLE: 
				return elements.stream()
						.map(e -> this.getPropertyValue(e, property))
						.filter(v -> v!=null)
						.mapToDouble(v -> (Double)v)
						.max()
						.orElse(Double.MIN_VALUE);
			case DATA_TYPE_FLOAT : 
				return (float)  elements.stream()
						.map(e -> this.getPropertyValue(e, property))
						.filter(v -> v!=null)
						.mapToDouble(v -> (Float)v) 
						.max()
						.orElse(Float.MIN_VALUE);
			case DATA_TYPE_LONG  : 
				return elements.stream()
						.map(e -> this.getPropertyValue(e, property))
						.filter(v -> v!=null)
						.mapToLong(v -> (Long)v)    
						.max()
						.orElse(Long.MIN_VALUE);
			case DATA_TYPE_INT   : 
				return (int) elements.stream()
						.map(e -> this.getPropertyValue(e, property))
						.filter(v -> v!=null)
						.mapToLong(v -> (Integer)v) 
						.max()
						.orElse(Integer.MIN_VALUE);
			case DATA_TYPE_DATE  : 
				return new Date(elements.stream()
						.map(e -> this.getPropertyValue(e, property))
						.filter(v -> v!=null)
						.mapToLong(v -> ((Date)v).getTime())    
						.max()
						.orElse(Long.MIN_VALUE));
			default: return null;
			}
		}
		case AGGREGATE_MIN : {
			switch ( type ) {
			case DATA_TYPE_DOUBLE: 
				return elements.stream()
						.map(e -> this.getPropertyValue(e, property))
						.filter(v -> v!=null)
						.mapToDouble(v -> (Double)v)
						.min()
						.orElse(Double.MAX_VALUE);
			case DATA_TYPE_FLOAT : 
				return (float)  elements.stream()
						.map(e -> this.getPropertyValue(e, property))
						.filter(v -> v!=null)
						.mapToDouble(v -> (Float)v) 
						.min()
						.orElse(Float.MAX_VALUE);
			case DATA_TYPE_LONG  : 
				return  elements.stream()
						.map(e -> this.getPropertyValue(e, property))
						.filter(v -> v!=null)
						.mapToLong(v -> (Long)v)    
						.min()
						.orElse(Long.MAX_VALUE);
			case DATA_TYPE_INT   : 
				return (int) elements.stream()
						.map(e -> this.getPropertyValue(e, property))
						.filter(v -> v!=null)
						.mapToLong(v -> (Integer)v) 
						.min()
						.orElse(Integer.MAX_VALUE);
			case DATA_TYPE_DATE  : 
				return new Date(elements.stream()
						.map(e -> this.getPropertyValue(e, property))
						.filter(v -> v!=null)
						.mapToLong(v -> ((Date)v).getTime())    
						.min()
						.orElse(Long.MAX_VALUE));
			default: return null;
			}
		}
		case AGGREGATE_COUNT : {
			int count = 0;
			for ( Object element : elements) {
				Object value = this.getPropertyValue(element, property);
				if ( value != null ) {
					count++;
				}
			}
			return count;
		}
		} 
		return null;
	}
	
	default public int getAggregationType(Object property) {
		int aggregation = this.getPropertyAggregation(property);
		switch ( aggregation ) {
		case AGGREGATE_SUM:
		case AGGREGATE_MIN:
		case AGGREGATE_MAX:
			return this.getPropertyType(property);
		case AGGREGATE_COUNT:
			return DATA_TYPE_INT;
		}
		return AGGREGATE_NONE;
	}
	
	default public String getAggregationText(int aggregation) {
		switch ( aggregation) {
		case AGGREGATE_SUM: return "sum";
		case AGGREGATE_MIN: return "min";
		case AGGREGATE_MAX: return "max";
		case AGGREGATE_COUNT: return "count";
		}
		return "unknown";
	}
	default public boolean isPropertyKey(Object property) {
		int traits = this.getPropertyTraits(property);
		boolean iskey = (traits&TRAITS_KEY)==TRAITS_KEY;
		return iskey;
	}
	default public boolean isPropertyValueHighlightKey(Object element, Object property) {
		int traits = this.getPropertyValueTraits(element, property);
		boolean is = (traits&TRAITS_HIGHLIGHT)==TRAITS_HIGHLIGHT;
		return is;
	}
}
