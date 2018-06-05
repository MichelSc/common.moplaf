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

import org.apache.poi.ss.util.WorkbookUtil;
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
	
	private OpenResources openResources = null;
	
	private class OpenResources  {
		private InputStream inputStream = null;
		private XSSFWorkbook workbook = null;
		public OpenResources(InputStream inputStream, XSSFWorkbook workbook) {
			super();
			this.inputStream = inputStream;
			this.workbook = workbook;
		}
		public void close()  {
			try {
				if ( this.inputStream!=null) {
					this.inputStream.close();
				}
			} catch (IOException e) {
				Plugin.INSTANCE.logError("SpreadsheetPOIx.readFile: file not closed, exeption "+e.getMessage());
			}
			try {
				if ( this.workbook!=null ) {
					this.workbook.close();
				}
			} catch (IOException e) {
				Plugin.INSTANCE.logError("SpreadsheetPOIx.readFile: workbook not closed, exeption "+e.getMessage());
			}
		}
	}

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
		if ( this.isOpen() ) {
			return new EnabledFeedback(false, "The File is already open");
		}
		return EnabledFeedback.NOFEEDBACK;
	}

	@Override
	protected EnabledFeedback getWriteFeedbackImpl(File file) {
		return EnabledFeedback.NOFEEDBACK;
	}
	
	

	@Override
	public EnabledFeedback getCloseFeedback() {
		if ( this.openResources==null) {
			return new EnabledFeedback(false, "No resource to close");
		}
		return EnabledFeedback.NOFEEDBACK;
	}

	private void loadSpreadsheet(XSSFWorkbook wb) {
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
							pocelltype = CellType.CELL_TYPE_BOOLEAN;
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
				pocell.setBooleanValueSet(booleanvalue);
				pocell.setRow(porow);
				pocell.setColumn(pocolumn);
				} // traverse the cells
			}  // traverse the rows
		}  // traverse the sheets 
		
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.spreadsheet.impl.SpreadsheetImpl#readFile()
	 */
	@Override
	public void readFile(File file){
		// read the file
		InputStream inputStream = file.getInputStream();
		if ( inputStream==null) {
			Plugin.INSTANCE.logError("SpreadsheetPOIx.readFile: sheet NOT read");
		}

		XSSFWorkbook wb = null;

		// load the file
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
		
		this.openResources = new OpenResources(inputStream, wb);
		this.setOpen(true);
		
		// do something with the file
		this.loadSpreadsheet(wb);
		
	} // load readFile

	@Override
	public void writeFile(File file) {
		XSSFWorkbook wb = null;
		if ( this.isOpen() ) {
			// append behavior
			wb = this.openResources.workbook;
		} else {
			// overwrite behavior
			wb = new XSSFWorkbook();
		}

		// fill in the wb
		boolean success = true;
		try {
			Spreadsheet spreadsheet = this.getSpreadsheet();
			for ( Sheet from_sheet : spreadsheet.getSheets()) {
				String sheet_name = from_sheet.getSheetName();
				String safe_name = WorkbookUtil.createSafeSheetName(sheet_name);
				if ( !safe_name.equals(sheet_name)) {
					Plugin.INSTANCE.logWarning(String.format("SpreadsheetPOIx.writeFile: sheet name %s was reduced to %s", sheet_name, safe_name));
				}
				XSSFSheet to_sheet = wb.createSheet(safe_name);
				for( Row from_row : from_sheet.getRows()) {
					// Create a new row within the sheet and return the high level representation 
					// Note: If a row already exists at this position, it is removed/overwritten and any existing cell is removed!
					XSSFRow to_row = to_sheet.createRow(from_row.getRowIndex());
					for( Cell from_cell : from_row.getCells()){
						XSSFCell to_cell = to_row.createCell(from_cell.getColumn().getColumnIndex());
						switch ( from_cell.getCellType()) {
						case CELL_TYPE_DATE:
							to_cell.setCellValue(from_cell.getDateValue());
							break;
						case CELL_TYPE_BOOLEAN:
							to_cell.setCellValue(from_cell.isBooleanValueSet());
							break;
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
		} catch(Exception e) {
			Plugin.INSTANCE.logError("SpreadsheetPOIx.writeFile: exception while filling XSSFWorkbook "+e.getMessage());
			success = false;
		};
		
		// write the file
		try {
			OutputStream outputStream = file.getOutputStream();
			if ( outputStream!=null && success ) {
				wb.write(outputStream);
				outputStream.close();
			} else {
				Plugin.INSTANCE.logError("SpreadsheetPOIx.writeFile: file NOT opened");
				success = false;
			} 
			wb.close();
		} catch (IOException e) {
			Plugin.INSTANCE.logError("SpreadsheetPOIx.writeFile: sheet NOT written, exeption "+e.getMessage());
			return;
		}
	}

	@Override
	public void close() {
		if ( this.isOpen() && this.openResources!=null ) {
			this.openResources.close();
			this.openResources = null;
		}
		this.setOpen(false);
	}
	
	
} //SpreadsheetPOIxImpl
