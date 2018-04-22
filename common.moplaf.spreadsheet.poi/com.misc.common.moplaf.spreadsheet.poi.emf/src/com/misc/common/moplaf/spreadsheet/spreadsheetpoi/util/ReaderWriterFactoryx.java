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
package com.misc.common.moplaf.spreadsheet.spreadsheetpoi.util;

import com.misc.common.moplaf.spreadsheet.SpreadsheetReaderWriter;
import com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetPOIFactory;
import com.misc.common.moplaf.spreadsheet.util.ReaderWriterFactory;

public class ReaderWriterFactoryx implements ReaderWriterFactory {

	public ReaderWriterFactoryx() {
	}

	@Override
	public SpreadsheetReaderWriter createReaderWriter() {
		return SpreadsheetPOIFactory.eINSTANCE.createSpreadsheetPOIx();
	}

}
