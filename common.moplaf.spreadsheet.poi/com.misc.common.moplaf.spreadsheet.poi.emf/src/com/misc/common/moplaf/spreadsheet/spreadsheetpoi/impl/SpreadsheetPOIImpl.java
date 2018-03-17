/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.spreadsheet.spreadsheetpoi.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

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
import com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetPOI;
import com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetPOIPackage;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spreadsheet POI</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SpreadsheetPOIImpl extends SpreadsheetReaderWriterImpl implements SpreadsheetPOI {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpreadsheetPOIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpreadsheetPOIPackage.Literals.SPREADSHEET_POI;
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
			Plugin.INSTANCE.logError("SpreadsheetPOI.readFile: sheet NOT read");
			return;
		}
		
		// load the file
		HSSFWorkbook wb = null;
		try {
			wb = new HSSFWorkbook(inputStream);
		} catch (IOException e) {
			Plugin.INSTANCE.logError("SpreadsheetPOI.readFile: file NOT opened, exeption "+e.getMessage());
			return;
		}
		Plugin.INSTANCE.logInfo("SpreadsheetPOI.readFile: sheet loaded");
		
		Spreadsheet spreadsheet = this.getSpreadsheet();
		for (int k = 0; k < wb.getNumberOfSheets(); k++) {
			Map<Integer, Column> pocolumns = new HashMap<Integer, Column>();
			
			// run through the sheets
			HSSFSheet sheet = wb.getSheetAt(k);
			int rows = sheet.getPhysicalNumberOfRows();
			String sheetname = wb.getSheetName(k);
			Plugin.INSTANCE.logInfo("SpreadsheetPOI.readFile: Sheet "
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
				HSSFRow row = sheet.getRow(r);
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
			Plugin.INSTANCE.logError("SpreadsheetPOI.readFile: file not closed, exeption "+e.getMessage());
			return;
		}
	} // load readFile

	@Override
	protected EnabledFeedback getWriteFeedbackImpl(File file) {
		return EnabledFeedback.NOFEEDBACK;
	}

	@Override
	public void writeFile(File file) {
		HSSFWorkbook wb = new HSSFWorkbook();

		// fill in the wb
		Spreadsheet spreadsheet = this.getSpreadsheet();
		for ( Sheet from_sheet : spreadsheet.getSheets()) {
			HSSFSheet to_sheet = wb.createSheet(from_sheet.getSheetName());
			for( Row from_row : from_sheet.getRows()) {
				HSSFRow to_row = to_sheet.createRow(from_row.getRowIndex());
				for( Cell from_cell : from_row.getCells()){
					HSSFCell to_cell = to_row.createCell(from_cell.getColumn().getColumnIndex());
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
						throw new UnsupportedOperationException();
					}
				}
			}
		}
		
		// write the file
		try {
			OutputStream outputStream = file.getOutputStream();
			if ( outputStream==null) {
				Plugin.INSTANCE.logError("SpreadsheetPOI.writeFile: file NOT opened");
				return;
			}
			wb.write(outputStream);
			wb.close();
			outputStream.close();
		} catch (IOException e) {
			Plugin.INSTANCE.logError("SpreadsheetPOI.writeFile: sheet NOT written, exeption "+e.getMessage());
			return;
		}
	}
	
	

} //SpreadsheetPOIImpl
