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
package com.misc.common.moplaf.gisview.emf.edit;

import java.util.List;

/**
 * <p>
 * This interface declares the method(s) to be supported by an object that provides one or 
 * paths, for instance to be displayed on a map.
 * <p>
 * The consumer (i.e. the component using the locations data, typically a map component)
 * will provide, when relevant
 * <ul>
 * <li> an element:Object: the object owning the paths(s) </li>
 * <li> an path:Object: the object identifying a path </li>
 * <li> a stop:Object: the object identifying a stop of a path </li>
 * </ul>
 * in order to get
 * <ul>
 * <li> the paths(s) provided by the element </li>
 * <li> properties to be displayed for a given path </li>
 * <li> the stops of a path </li>
 * <li> properties to be displayed for a given stop of a given path </li>
 * </ul>
 * <p>
 * <p>
 * @author michel
 */

public interface IItemPathsProvider {
	/**
	 * Returns the paths published by the element. 
	 * <p>
	 * The method may return
	 * <ul>
	 * <li> null: no path for the element </li>
	 * <li> a <code> Collection </code>: a collection of paths for the element</li>
	 * <li> otherwise an <code> Object </code>: a single path for the element </li>
	 * </ul>
	 * @param element
	 * @return
	 */
	default Object getPaths(Object element){
		return null;
	}

	/**
	 * Returns the number paths published by the element. 
	 * <p>
	 * Will be used only if getPaths does not return anything.
	 * In that case, the paths are identified by an Integer, 0 based.
	 * @param element
	 * @return
	 */
	default int getNrPaths(Object element){
		return 0;
	}

	/**
	 * Return the text associated to a path published by the element.
	 * @param element
	 * @param grid
	 * @return
	 */
	default String getPathText(Object element, Object path) {
		return "";
	}

	/**
	 * Return the color associated to a path published by the element.
	 * @param element
	 * @param grid
	 * @return
	 */
	default Object getPathForeground(Object element, Object path) {
		return null;
	}

	/**
	 * Return the stops of a path as an ordered collection. 
	 * <p>
	 * No collection may be returned. In that case, the consumer will call {@link #getNrPathStops(Object, Object)}
	 * to get the number of stops and the stop will be identified by an Integer 0-based index.
	 * @param element
	 * @param timeline
	 * @return
	 */
	default List<?> getPathStops(Object element, Object path){
		return null;
	}

	/** 
	 * Return the number of stops of a Path
	 * <p>
	 * This method will be ignored when {@link #getPathStops(Object, Object)} returns a list.
	 * @param element
	 * @param path
	 * @return
	 */
	default int getNrPathStops(Object element, Object path){
		return 1;
	}

	/**
	 * Return the longitude associated to a stop of a path published by the element.
	 * @param element
	 * @param path
	 * @param stop
	 * @return
	 */
	default double getPathStopLongitude(Object element, Object path, Object stop) {
		return 0.0d;
	}
	
	/**
	 * Return the longitude associated to a stop of a path published by the element.
	 * @param element
	 * @param path
	 * @param stop
	 * @return
	 */
	default double getPathStopLatitude(Object element, Object path, Object stop) {
		return 0.0d;
	}

	/**
	 * Return the elevation associated to a stop of path published by the element.
	 * @param element
	 * @param path
	 * @param stop
	 * @return
	 */
	default double getPathStopElevation(Object element, Object path, Object stop) {
		return 0.0d;
	}
}



