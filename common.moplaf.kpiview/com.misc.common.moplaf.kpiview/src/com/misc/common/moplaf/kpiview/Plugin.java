package com.misc.common.moplaf.kpiview;

import org.eclipse.ui.plugin.AbstractUIPlugin;


public class Plugin extends AbstractUIPlugin {

	public static  Plugin INSTANCE = null;
	
	private int tileSize = 172;
	private int gridHorizontalGap = 5;
	private int gridVerticalGap = 15;
	
	public int getTileSize(){
		return this.tileSize;
	}
	public int getGridHorizontalGap(){
		return this.gridHorizontalGap;
	}
	public int getGridVerticalGap() {
		return gridVerticalGap;
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


	public Plugin() {
		// remember the instance
		INSTANCE = this;
	}

}
