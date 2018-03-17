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
