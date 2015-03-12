/**
 */
package com.misc.common.moplaf.spreadsheet.spreadsheetpoi.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.misc.common.moplaf.spreadsheet.Cell;
import com.misc.common.moplaf.spreadsheet.CellType;
import com.misc.common.moplaf.spreadsheet.Column;
import com.misc.common.moplaf.spreadsheet.Row;
import com.misc.common.moplaf.spreadsheet.Sheet;
import com.misc.common.moplaf.spreadsheet.SpreadsheetFactory;
import com.misc.common.moplaf.spreadsheet.SpreadsheetPackage;
import com.misc.common.moplaf.spreadsheet.impl.SpreadsheetImpl;
import com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetPOI;
import com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetpoiPackage;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spreadsheet POI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SpreadsheetPOIImpl extends SpreadsheetImpl implements SpreadsheetPOI {
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
		return SpreadsheetpoiPackage.Literals.SPREADSHEET_POI;
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.spreadsheet.impl.SpreadsheetImpl#readFile()
	 */
	@Override
	public void readFile() {
		CommonPlugin.INSTANCE.log("SpreadsheetPOI.load: started");
		
		// open the file
		FileInputStream inputstream = null;;
		try {
			inputstream = new FileInputStream(this.getFilePath());
		} catch (FileNotFoundException e) {
			CommonPlugin.INSTANCE.log("SpreadsheetPOI.load: file NOT found");
			return;
		} 
		CommonPlugin.INSTANCE.log("SpreadsheetPOI.load: file found");

		// load the file
		HSSFWorkbook wb = null;
		try {
			wb = new HSSFWorkbook(inputstream);
		} catch (IOException e) {
			CommonPlugin.INSTANCE.log("SpreadsheetPOI.load: sheet NOT loaded");
			return;
		}
		CommonPlugin.INSTANCE.log("SpreadsheetPOI.load: sheet loaded");

		for (int k = 0; k < wb.getNumberOfSheets(); k++) {
			Map<Integer, Column> pocolumns = new HashMap<Integer, Column>();
			
			// run through the sheets
			HSSFSheet sheet = wb.getSheetAt(k);
			int rows = sheet.getPhysicalNumberOfRows();
			String sheetname = wb.getSheetName(k);
			CommonPlugin.INSTANCE.log("SpreadsheetPOI.load: Sheet "
                    + k 
                    + ", "  
	                 + sheetname 
	                 + ","
	                 + rows
	                 + " rows");
			Sheet posheet = SpreadsheetFactory.eINSTANCE.createSheet();
			posheet.setSheetName(sheetname);
			posheet.setSheetIndex(k);
			posheet.setSpreadsheet(this);
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
					String value = null;
					Double doublevalue = 0.0;
					String stringvalue = "";
					CellType pocelltype = null;
					switch (cell.getCellType()) {
						case HSSFCell.CELL_TYPE_FORMULA:
							value = "FORMULA value=" + cell.getCellFormula();
							pocelltype = CellType.CELL_TYPE_FORMULA;
							break;
						case HSSFCell.CELL_TYPE_NUMERIC:
							doublevalue = cell.getNumericCellValue();
							value = "NUMERIC value=" + doublevalue;
							pocelltype = CellType.CELL_TYPE_NUMERIC;
							break;
						case HSSFCell.CELL_TYPE_STRING:
							stringvalue = cell.getStringCellValue();
							value = "STRING value=" + stringvalue;
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
				pocell.setValueFormatted(value);
				pocell.setDoubleValue(doublevalue);
				pocell.setStringValue(stringvalue);
				pocell.setRow(porow);
				pocell.setColumn(pocolumn);
				} // traverse the cells
			}  // traverse the rows
		}  // traverse the sheets 
	} // load method

} //SpreadsheetPOIImpl
