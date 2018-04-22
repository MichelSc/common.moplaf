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
package com.misc.common.moplaf.spreadsheet.spreadsheetcsv.util;

import com.misc.common.moplaf.spreadsheet.SpreadsheetReaderWriter;
import com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSVFactory;

public class ReaderWriterFactory implements com.misc.common.moplaf.spreadsheet.util.ReaderWriterFactory {

	public ReaderWriterFactory() {
	}

	@Override
	public SpreadsheetReaderWriter createReaderWriter() {
		return SpreadsheetCSVFactory.eINSTANCE.createSpreadsheetCSV();
	}

}
