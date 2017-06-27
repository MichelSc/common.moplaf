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
package com.misc.common.moplaf.timeview;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.misc.common.moplaf.timeview.preference.PrefConstants;
import com.misc.common.moplaf.timeview.Plugin;
import com.misc.common.moplaf.timeview.preference.Activator;

/**
 * The activator class controls the plug-in life cycle
 */
public class Plugin extends AbstractUIPlugin implements PrefConstants {
	
	public static  Plugin INSTANCE = null;

	private int ganttMaxDepth = 4;
	private int ganttRowHeight = 40;
	private int ganttEmptyRowHeight = 16;

	public int getGanttMaxDepth() {
		return ganttMaxDepth;
	}

	public void setGanttMaxDepth(int ganttMaxDepth) {
		this.ganttMaxDepth = ganttMaxDepth;
	}

	public int getGanttRowHeight() {
		return ganttRowHeight;
	}

	public void setGanttRowHeight(int ganttRowHeight) {
		this.ganttRowHeight = ganttRowHeight;
	}

	public int getGanttEmptyRowHeight() {
		return ganttEmptyRowHeight;
	}

	public void setGanttEmptyRowHeight(int ganttEmptyRowHeight) {
		this.ganttEmptyRowHeight = ganttEmptyRowHeight;
	}

	// The plug-in ID
	public static final String PLUGIN_ID = "com.misc.common.moplaf.timeview"; //$NON-NLS-1$

	// The shared instance
	private static Plugin plugin;
	
	/**
	 * The constructor
	 */
	public Plugin() {
		// remember the instance
		INSTANCE = this;
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
		int maxDepth       = prefStore.getInt(PREF_GANTT_MAX_DEPTH);
		int rowHeight      = prefStore.getInt(PREF_GANTT_ROW_HEIGHT);
		int emptyRowHeight = prefStore.getInt(PREF_GANTT_EMPTY_ROW_HEIGHT);
		
		Plugin.INSTANCE.setGanttMaxDepth(maxDepth);
		Plugin.INSTANCE.setGanttRowHeight(rowHeight);
		Plugin.INSTANCE.setGanttEmptyRowHeight(emptyRowHeight);
		
		prefStore.addPropertyChangeListener(new IPropertyChangeListener() {
		      public void propertyChange(PropertyChangeEvent event) {
		    	  String property = event.getProperty();
		    	  Object newValue = event.getNewValue();
		    	  
		    	  if ( newValue instanceof Integer ){
		    		  Integer newValueAsInteger = (Integer)newValue;
			    	  if        ( property.equals(PREF_GANTT_MAX_DEPTH) ){
			    			Plugin.INSTANCE.setGanttMaxDepth(newValueAsInteger);
			    	  } else if ( property.equals(PREF_GANTT_ROW_HEIGHT) ){
			    			Plugin.INSTANCE.setGanttRowHeight(newValueAsInteger);
			    	  } else if ( property.equals(PREF_GANTT_EMPTY_ROW_HEIGHT)){
			    			Plugin.INSTANCE.setGanttEmptyRowHeight(newValueAsInteger);
			    	  } 
		    	  }		    	  }

		       });
	} // init preferences

}
