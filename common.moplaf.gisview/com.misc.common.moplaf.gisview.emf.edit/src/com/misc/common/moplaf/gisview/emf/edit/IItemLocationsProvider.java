package com.misc.common.moplaf.gisview.emf.edit;

/**
 * <p>
 * This interface declares the method(s) to be supported by an object that provides one or 
 * locations, for instance to be displayed on a map.
 * <p>
 * The consumer (i.e. the component using the locations data, typically a map component)
 * will provide, when relevant
 * <ul>
 * <li> an element:Object: the object owning the locations(s) </li>
 * <li> a location:Object: an object identifying a location. </li>
 * </ul>
 * in order to get
 * <ul>
 * <li> the location(s) supported by the element </li>
 * <li> properties to be displayed for a given location </li>
 * </ul>
 * <p>
 * <p>
 * @author michel
 */

public interface IItemLocationsProvider {
	/**
	 * Returns the locations published by the element. 
	 * <p>
	 * The method may return
	 * <ul>
	 * <li> null: no location for the element </li>
	 * <li> Collection<?>: a collection of locations for the element</li>
	 * <li> otherwise an Object: a single location for the element </li>
	 * </ul>
	 * @param element
	 * @return
	 */
	default Object getLocations(Object element){
		return null;
	}

	/**
	 * Returns the number locations published by the element. 
	 * <p>
	 * Will be used only if getLocations does not return anything.
	 * In that case, the locations are identified by an Integer, 0 based.
	 * @param element
	 * @return
	 */
	default int getNrLocations(Object element){
		return 0;
	}

	/**
	 * Return the text associated to a location published by the element.
	 * @param element
	 * @param grid
	 * @return
	 */
	default String getLocationText(Object element, Object location) {
		return "";
	}

	/**
	 * Return the color associated to a location published by the element.
	 * @param element
	 * @param grid
	 * @return
	 */
	default Object getLocationForeground(Object element, Object location) {
		return null;
	}

	/**
	 * Return the image associated to a location published by the element.
	 * @param element
	 * @param grid
	 * @return
	 */
	default Object getLocationImage(Object element, Object location) {
		return null;
	}

	/**
	 * Return the longitude associated to a location published by the element.
	 * @param element
	 * @param grid
	 * @return
	 */
	double getLocationLongitude(Object element, Object location);
	
	/**
	 * Return the longitude associated to a location published by the element.
	 * @param element
	 * @param grid
	 * @return
	 */
	double getLocationLatitude(Object element, Object location);

	/**
	 * Return the longitude associated to a location published by the element.
	 * @param element
	 * @param grid
	 * @return
	 */
	default double getLocationElevation(Object element, Object location) {
		return 0.0;
	}
}



