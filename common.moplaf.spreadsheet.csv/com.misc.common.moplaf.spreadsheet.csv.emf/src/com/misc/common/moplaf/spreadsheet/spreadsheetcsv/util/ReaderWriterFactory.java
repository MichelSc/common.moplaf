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
