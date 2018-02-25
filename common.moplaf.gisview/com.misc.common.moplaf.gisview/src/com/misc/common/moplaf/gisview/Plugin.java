/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
package com.misc.common.moplaf.gisview;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.misc.common.moplaf.gisview.preference.Activator;
import com.misc.common.moplaf.gisview.preference.PrefConstants;
import com.misc.common.moplaf.gisview.preference.PreferenceInitializer;

/**
 * The activator class controls the plug-in life cycle
 */
public class Plugin extends AbstractUIPlugin implements PrefConstants{

	private int mapMaxDepth      = PreferenceInitializer.getDefaultMapMaxDepth();
	private int mapLocationSize  = PreferenceInitializer.getDefaultMapLocationSize();
	private int mapPathWidth     = PreferenceInitializer.getDefaultMapPathWidth();
	private String mapServerUrl  = PreferenceInitializer.getDefaultMapServerUrl();
	private int mapServerMaxZoom = PreferenceInitializer.getDefaultMapServerMaxZoom();
	
	public int getMapMaxDepth() {
		return mapMaxDepth;
	}

	public void setMapMaxDepth(int mapMaxDepth) {
		this.mapMaxDepth = mapMaxDepth;
	}

	public int getMapLocationSize() {
		return mapLocationSize;
	}

	public void setMapLocationSize(int mapLocationSize) {
		this.mapLocationSize = mapLocationSize;
	}

	public int getMapPathWidth() {
		return mapPathWidth;
	}

	public void setMapPathWidth(int mapPathWidth) {
		this.mapPathWidth = mapPathWidth;
	}

	public String getMapServerUrl() {
		return mapServerUrl;
	}

	public void setMapServerUrl(String mapServerUrl) {
		this.mapServerUrl = mapServerUrl;
	}

	public int getMapServerMaxZoom() {
		return mapServerMaxZoom;
	}

	public void setMapServerMaxZoom(int mapServerMaxZoom) {
		this.mapServerMaxZoom = mapServerMaxZoom;
	}

	// The plug-in ID
	public static final String PLUGIN_ID = "com.misc.common.moplaf.gisview"; //$NON-NLS-1$

	// The shared instance
	private static Plugin plugin;
	
	/**
	 * The constructor
	 */
	public Plugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		this.initPreferences();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Plugin getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
	
	private void initPreferences(){
		final IPreferenceStore prefStore = Activator.getDefault().getPreferenceStore();
		int maxDepth         = prefStore.getInt(PREF_MAP_MAX_DEPTH);
		int locationSize     = prefStore.getInt(PREF_MAP_LOCATION_SIZE);
		int pathWidth        = prefStore.getInt(PREF_MAP_PATH_WIDTH);
		int maxZoom          = prefStore.getInt(PREF_MAP_SERVER_MAX_ZOOM);
		String mapServerUrl  = prefStore.getString(PREF_MAP_SERVER_URL);
		
		Plugin.getDefault().setMapMaxDepth(maxDepth);
		Plugin.getDefault().setMapLocationSize(locationSize);
		Plugin.getDefault().setMapPathWidth(pathWidth);
		Plugin.getDefault().setMapServerMaxZoom(maxZoom);
		Plugin.getDefault().setMapServerUrl(mapServerUrl);
		
		prefStore.addPropertyChangeListener(new IPropertyChangeListener() {
		      public void propertyChange(PropertyChangeEvent event) {
		    	  String property = event.getProperty();
		    	  Object newValue = event.getNewValue();
		    	  
		    	  if ( newValue instanceof Integer ){
		    		  Integer newValueAsInteger = (Integer)newValue;
			    	  if ( property.equals(PREF_MAP_MAX_DEPTH) ){
			    			Plugin.getDefault().setMapMaxDepth(newValueAsInteger);
			    	  } else if ( property.equals(PREF_MAP_SERVER_MAX_ZOOM)) {
			    			Plugin.getDefault().setMapServerMaxZoom(newValueAsInteger);
			    	  } else if ( property.equals(PREF_MAP_LOCATION_SIZE)) {
			    			Plugin.getDefault().setMapLocationSize(newValueAsInteger);
			    	  } else if ( property.equals(PREF_MAP_PATH_WIDTH)) {
			    			Plugin.getDefault().setMapPathWidth(newValueAsInteger);
			    	  }
		    	  } else if ( newValue instanceof String) {
		    		  String newValueAsString = (String)newValue;
			    	  if ( property.equals(PREF_MAP_SERVER_URL) ){
			    			Plugin.getDefault().setMapServerUrl(newValueAsString);
			    	  }
		    	  }
		       }; // property changed
		}); //addPropertyChangedListener

	} // init preferences
}  // class
