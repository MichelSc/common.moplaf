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
