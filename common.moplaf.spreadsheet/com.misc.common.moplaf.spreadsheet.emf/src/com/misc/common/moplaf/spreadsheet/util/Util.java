package com.misc.common.moplaf.spreadsheet.util;

import com.misc.common.moplaf.spreadsheet.Cell;
import com.misc.common.moplaf.spreadsheet.CellType;
import com.misc.common.moplaf.spreadsheet.Column;
import com.misc.common.moplaf.spreadsheet.Row;
import com.misc.common.moplaf.spreadsheet.Sheet;

public class Util {
	static public Cell getOrCreateCell(Row row, String cell_value) {
		Cell cell = row.lookUp(cell_value);
		if ( cell==null ) {
			Sheet sheet = row.getSheet();
			Column column = sheet.addColumn();
			cell = sheet.createCell(row, column);
			cell.setCellType(CellType.CELL_TYPE_STRING);
			cell.setStringValue(cell_value);
		} 
		return cell;
	}

	static public Cell getOrCreateCell(Column column, String cell_value) {
		Cell cell = column.lookUp(cell_value);
		if ( cell==null ) {
			Sheet sheet = column.getSheet();
			Row row  = sheet.addRow();
			cell = sheet.createCell(row, column);
			cell.setCellType(CellType.CELL_TYPE_STRING);
			cell.setStringValue(cell_value);
		} 
		return cell;
	}
}
