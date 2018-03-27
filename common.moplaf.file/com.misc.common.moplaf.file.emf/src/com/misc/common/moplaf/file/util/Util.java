package com.misc.common.moplaf.file.util;

import com.misc.common.moplaf.file.File;
import com.misc.common.moplaf.file.FileHandler;

public class Util {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	static public File FileHandlerGetHandledFile(FileHandler this_handler) {
		File selected = this_handler.getSelectedFile();
		if ( selected!=null ) {
			return selected;
		}
		if ( this_handler.getFiles().size()==1 ) {
			return this_handler.getFiles().get(0);
		}
		return null;
	}
}
