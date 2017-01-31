package com.misc.common.moplaf.kpiview.preference;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.IStartup;

import com.misc.common.moplaf.kpiview.Plugin;

public class Startup implements IStartup, PrefConstants {

	@Override
	public void earlyStartup() {
		final IPreferenceStore prefStore = Activator.getDefault().getPreferenceStore();
		int tileSize = prefStore.getInt(PREF_TILE_SIZE);
		int gridHGap = prefStore.getInt(PREF_GRID_HORIZONTAL_GAP);
		int gridVGap = prefStore.getInt(PREF_GRID_VERTICAL_GAP);
		
		Plugin.INSTANCE.setTileSize(tileSize);
		Plugin.INSTANCE.setGridHorizontalGap(gridHGap);
		Plugin.INSTANCE.setGridVerticalGap(gridVGap);
		
		prefStore.addPropertyChangeListener(new IPropertyChangeListener() {
		      public void propertyChange(PropertyChangeEvent event) {
		    	  String property = event.getProperty();
		    	  Object newValue = event.getNewValue();
		    	  
		    	  Integer newValueAsInteger = null;
		    	  if ( newValue instanceof Integer ){
		    		  newValueAsInteger = (Integer)newValue;
			    	  if ( property == PREF_TILE_SIZE ){
			    			Plugin.INSTANCE.setTileSize(newValueAsInteger);
			    	  } else if ( property == PREF_GRID_HORIZONTAL_GAP ){
			    			Plugin.INSTANCE.setGridHorizontalGap(newValueAsInteger);
			    	  } else if ( property == PREF_GRID_VERTICAL_GAP){
			    			Plugin.INSTANCE.setGridVerticalGap  (newValueAsInteger);
			    	  } 
		    	  }

		       }});
	}

}
