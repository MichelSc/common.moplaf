package com.misc.common.moplaf.spreadsheet.spreadsheetpoi.util;

import com.misc.common.moplaf.spreadsheet.SpreadsheetReaderWriter;
import com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetPOIFactory;

public class ReaderWriterFactory implements com.misc.common.moplaf.spreadsheet.util.ReaderWriterFactory {

	public ReaderWriterFactory() {
	}

	@Override
	public SpreadsheetReaderWriter createReaderWriter() {
		return SpreadsheetPOIFactory.eINSTANCE.createSpreadsheetPOI();
	}

}
