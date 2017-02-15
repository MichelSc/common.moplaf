package com.misc.common.moplaf.kpiview;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.misc.common.moplaf.kpiview.preference.Activator;
import com.misc.common.moplaf.kpiview.preference.PrefConstants;
import com.misc.common.moplaf.kpiview.preference.PreferenceInitializer;


public class Plugin extends AbstractUIPlugin implements PrefConstants {

	public static  Plugin INSTANCE = null;
	
	private int tileSize          = PreferenceInitializer.getDefaultTileSize();
	private int gridHorizontalGap = PreferenceInitializer.getDefaultHorizontalGap();
	private int gridVerticalGap   = PreferenceInitializer.getDefaultVerticalGap();
	private RGB backgroundColor   = PreferenceInitializer.getDefaultBackgroundColor();
	private RGB textColor         = PreferenceInitializer.getDefaultTextColor();
	
	public int getTileSize(){
		return this.tileSize;
	}
	public int getGridHorizontalGap(){
		return this.gridHorizontalGap;
	}
	public int getGridVerticalGap() {
		return gridVerticalGap;
	}
	public RGB getBackgroundColor() {
		return backgroundColor;
	}
	public RGB getTextColor() {
		return textColor;
	}

	public void setTileSize(int tileSize) {
		this.tileSize = tileSize;
	}
	public void setGridHorizontalGap(int gridHorizontalGap) {
		this.gridHorizontalGap = gridHorizontalGap;
	}
	public void setGridVerticalGap(int gridVerticalGap) {
		this.gridVerticalGap = gridVerticalGap;
	}
	public void setBackgroundColor(RGB backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	public void setTextColor(RGB textColor) {
		this.textColor = textColor;
	}


	public Plugin() {
		// remember the instance
		INSTANCE = this;
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		this.initPreferences();
	}

	private void initPreferences(){
		final IPreferenceStore prefStore = Activator.getDefault().getPreferenceStore();
		int tileSize = prefStore.getInt(PREF_TILE_SIZE);
		int gridHGap = prefStore.getInt(PREF_GRID_HORIZONTAL_GAP);
		int gridVGap = prefStore.getInt(PREF_GRID_VERTICAL_GAP);
		RGB backgroundColor = StringConverter.asRGB(prefStore.getString(PREF_COLOR_BACKGROUND));
		RGB textColor       = StringConverter.asRGB(prefStore.getString(PREF_COLOR_TEXT));
		
		Plugin.INSTANCE.setTileSize(tileSize);
		Plugin.INSTANCE.setGridHorizontalGap(gridHGap);
		Plugin.INSTANCE.setGridVerticalGap(gridVGap);
		Plugin.INSTANCE.setBackgroundColor(backgroundColor);
		Plugin.INSTANCE.setTextColor(textColor);
		
		prefStore.addPropertyChangeListener(new IPropertyChangeListener() {
		      public void propertyChange(PropertyChangeEvent event) {
		    	  String property = event.getProperty();
		    	  Object newValue = event.getNewValue();
		    	  
		    	  if ( newValue instanceof Integer ){
		    		  Integer newValueAsInteger = (Integer)newValue;
			    	  if        ( property.equals(PREF_TILE_SIZE) ){
			    			Plugin.INSTANCE.setTileSize(newValueAsInteger);
			    	  } else if ( property.equals(PREF_GRID_HORIZONTAL_GAP) ){
			    			Plugin.INSTANCE.setGridHorizontalGap(newValueAsInteger);
			    	  } else if ( property.equals(PREF_GRID_VERTICAL_GAP)){
			    			Plugin.INSTANCE.setGridVerticalGap  (newValueAsInteger);
			    	  } 
		    	  } else if ( newValue instanceof String){
		    		  String newValueAsString = (String)newValue;
		    		  if ( property.equals(PREF_COLOR_BACKGROUND)){
		    			  Plugin.INSTANCE.setBackgroundColor(StringConverter.asRGB(newValueAsString));
		    		  }
		    		  else if ( property.equals(PREF_COLOR_TEXT)){
		    			  Plugin.INSTANCE.setTextColor(StringConverter.asRGB(newValueAsString));
		    		  }
		    	  } else if ( newValue instanceof RGB){
		    		  RGB newValuleAsRGB = (RGB)newValue;
		    		  if ( property.equals(PREF_COLOR_BACKGROUND)){
		    			  Plugin.INSTANCE.setBackgroundColor(newValuleAsRGB);
		    		  }
		    		  else if ( property.equals(PREF_COLOR_TEXT)){
		    			  Plugin.INSTANCE.setTextColor(newValuleAsRGB);
		    		  }
		    	  }

		       }});
	}

	

}
