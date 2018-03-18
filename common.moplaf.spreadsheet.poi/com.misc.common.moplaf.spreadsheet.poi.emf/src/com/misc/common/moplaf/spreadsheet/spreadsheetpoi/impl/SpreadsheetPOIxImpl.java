/**
 */
package com.misc.common.moplaf.spreadsheet.spreadsheetpoi.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.file.File;
import com.misc.common.moplaf.file.Plugin;
import com.misc.common.moplaf.spreadsheet.Cell;
import com.misc.common.moplaf.spreadsheet.CellType;
import com.misc.common.moplaf.spreadsheet.Column;
import com.misc.common.moplaf.spreadsheet.Row;
import com.misc.common.moplaf.spreadsheet.Sheet;
import com.misc.common.moplaf.spreadsheet.Spreadsheet;
import com.misc.common.moplaf.spreadsheet.SpreadsheetFactory;
import com.misc.common.moplaf.spreadsheet.impl.SpreadsheetReaderWriterImpl;

import com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetPOIPackage;
import com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetPOIx;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spreadsheet PO Ix</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SpreadsheetPOIxImpl extends SpreadsheetReaderWriterImpl implements SpreadsheetPOIx {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpreadsheetPOIxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpreadsheetPOIPackage.Literals.SPREADSHEET_PO_IX;
	}

	@Override
	protected EnabledFeedback getReadFeedbackImpl(File file) {
		return EnabledFeedback.NOFEEDBACK;
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.spreadsheet.impl.SpreadsheetImpl#readFile()
	 */
	@Override
	public void readFile(File file){
		InputStream inputStream = file.getInputStream();
		if ( inputStream==null) {
			Plugin.INSTANCE.logError("SpreadsheetPOIx.readFile: sheet NOT read");
			return;
		}
		
		// load the file
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(inputStream);
		} catch (IOException e) {
			Plugin.INSTANCE.logError("SpreadsheetPOIx.readFile: file NOT opened, i/o exeption "+e.getMessage());
			return;
		} catch (RuntimeException e) {
			Plugin.INSTANCE.logError("SpreadsheetPOIx.readFile: file NOT opened, runtime exeption "+e.getMessage());
			return;
		}
		Plugin.INSTANCE.logInfo("SpreadsheetPOI.readFile: sheet loaded");
		
		Spreadsheet spreadsheet = this.getSpreadsheet();
		for (int k = 0; k < wb.getNumberOfSheets(); k++) {
			Map<Integer, Column> pocolumns = new HashMap<Integer, Column>();
			
			// run through the sheets
			XSSFSheet sheet = wb.getSheetAt(k);
			int rows = sheet.getPhysicalNumberOfRows();
			String sheetname =  sheet.getSheetName();
			Plugin.INSTANCE.logInfo("SpreadsheetPOIx.readFile: Sheet "
                    + k 
                    + ", "  
	                 + sheetname 
	                 + ","
	                 + rows
	                 + " rows");
			Sheet posheet = SpreadsheetFactory.eINSTANCE.createSheet();
			posheet.setSheetName(sheetname);
			posheet.setSheetIndex(k);
			posheet.setSpreadsheet(spreadsheet);
			// load the rows
			for (int r = 0; r < rows; r++) {
				// run trough the rows
				 XSSFRow row = sheet.getRow(r);
				if (row == null) {
					continue;
				}
				Row porow = SpreadsheetFactory.eINSTANCE.createRow();
				porow.setRowIndex(r);
				porow.setSheet(posheet);
				for(org.apache.poi.ss.usermodel.Cell cell : row){
					// run through the cells of the row
					Double doublevalue = 0.0;
					String stringvalue = "";
					Boolean booleanvalue = false;
					CellType pocelltype = null;
					switch (cell.getCellTypeEnum()) {
						case FORMULA:
							stringvalue = cell.getCellFormula();
							pocelltype = CellType.CELL_TYPE_FORMULA;
							break;
						case NUMERIC:
							doublevalue = cell.getNumericCellValue();
							pocelltype = CellType.CELL_TYPE_NUMERIC;
							break;
						case STRING:
							stringvalue = cell.getStringCellValue();
							pocelltype = CellType.CELL_TYPE_STRING;
							break;
						case BOOLEAN:
							booleanvalue = cell.getBooleanCellValue();
							pocelltype = CellType.CELL_TYPE_STRING;
							break;
						default:
					} // switch on the type
				int columnindex = cell.getColumnIndex();
				Column pocolumn = pocolumns.get(columnindex);
				if ( pocolumn==null){
					pocolumn = SpreadsheetFactory.eINSTANCE.createColumn();
					pocolumn.setColumnIndex(columnindex);
					pocolumn.setSheet(posheet);
					pocolumns.put(columnindex, pocolumn);
				}
				Cell pocell = SpreadsheetFactory.eINSTANCE.createCell();
				pocell.setCellType(pocelltype);
				pocell.setDoubleValue(doublevalue);
				pocell.setStringValue(stringvalue);
				pocell.setRow(porow);
				pocell.setColumn(pocolumn);
				} // traverse the cells
			}  // traverse the rows
		}  // traverse the sheets 
		try {
			wb.close();
			inputStream.close();
		} catch (IOException e) {
			Plugin.INSTANCE.logError("SpreadsheetPOIx.readFile: file not closed, exeption "+e.getMessage());
			return;
		}
	} // load readFile

	@Override
	protected EnabledFeedback getWriteFeedbackImpl(File file) {
		return EnabledFeedback.NOFEEDBACK;
	}

	@Override
	public void writeFile(File file) {
		XSSFWorkbook wb = new XSSFWorkbook();

		// fill in the wb
		Spreadsheet spreadsheet = this.getSpreadsheet();
		for ( Sheet from_sheet : spreadsheet.getSheets()) {
			XSSFSheet to_sheet = wb.createSheet(from_sheet.getSheetName());
			for( Row from_row : from_sheet.getRows()) {
				XSSFRow to_row = to_sheet.createRow(from_row.getRowIndex());
				for( Cell from_cell : from_row.getCells()){
					XSSFCell to_cell = to_row.createCell(from_cell.getColumn().getColumnIndex());
					switch ( from_cell.getCellType()) {
					case CELL_TYPE_BOOLEAN:
						throw new UnsupportedOperationException();
					case CELL_TYPE_NUMERIC:
						to_cell.setCellValue(from_cell.getDoubleValue());
						break;
					case CELL_TYPE_STRING:
						to_cell.setCellValue(from_cell.getStringValue());
						break;
					default:
						// ignore the cell
					}
				}
			}
		}
		
		// write the file
		try {
			OutputStream outputStream = file.getOutputStream();
			if ( outputStream==null) {
				Plugin.INSTANCE.logError("SpreadsheetPOIx.writeFile: file NOT opened");
				return;
			}
			wb.write(outputStream);
			wb.close();
			outputStream.close();
		} catch (IOException e) {
			Plugin.INSTANCE.logError("SpreadsheetPOIx.writeFile: sheet NOT written, exeption "+e.getMessage());
			return;
		}
	}
} //SpreadsheetPOIxImpl
