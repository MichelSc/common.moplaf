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
package com.misc.common.moplaf.spreadsheet.spreadsheetcsv.impl;


import com.misc.common.moplaf.spreadsheet.Cell;
import com.misc.common.moplaf.spreadsheet.CellType;
import com.misc.common.moplaf.spreadsheet.Column;
import com.misc.common.moplaf.spreadsheet.Row;
import com.misc.common.moplaf.spreadsheet.Sheet;
import com.misc.common.moplaf.spreadsheet.SpreadsheetFactory;
import com.misc.common.moplaf.spreadsheet.impl.SpreadsheetImpl;

import com.misc.common.moplaf.spreadsheet.spreadsheetcsv.FormatCSV;
import com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV;
import com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSVPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spreadsheet CSV</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.impl.SpreadsheetCSVImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.impl.SpreadsheetCSVImpl#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.impl.SpreadsheetCSVImpl#getEscapeCharacter <em>Escape Character</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.impl.SpreadsheetCSVImpl#getRecordSeparator <em>Record Separator</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.impl.SpreadsheetCSVImpl#getQuoteCharacter <em>Quote Character</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpreadsheetCSVImpl extends SpreadsheetImpl implements SpreadsheetCSV {
	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final FormatCSV FORMAT_EDEFAULT = FormatCSV.ENUM_LITERAL_CSV_FORMAT_DEFAULT;
	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected FormatCSV format = FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelimiter() <em>Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiter()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIMITER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDelimiter() <em>Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiter()
	 * @generated
	 * @ordered
	 */
	protected String delimiter = DELIMITER_EDEFAULT;
	/**
	 * This is true if the Delimiter attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean delimiterESet;
	/**
	 * The default value of the '{@link #getEscapeCharacter() <em>Escape Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscapeCharacter()
	 * @generated
	 * @ordered
	 */
	protected static final String ESCAPE_CHARACTER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEscapeCharacter() <em>Escape Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscapeCharacter()
	 * @generated
	 * @ordered
	 */
	protected String escapeCharacter = ESCAPE_CHARACTER_EDEFAULT;
	/**
	 * This is true if the Escape Character attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean escapeCharacterESet;
	/**
	 * The default value of the '{@link #getRecordSeparator() <em>Record Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final String RECORD_SEPARATOR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRecordSeparator() <em>Record Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordSeparator()
	 * @generated
	 * @ordered
	 */
	protected String recordSeparator = RECORD_SEPARATOR_EDEFAULT;
	/**
	 * This is true if the Record Separator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean recordSeparatorESet;
	/**
	 * The default value of the '{@link #getQuoteCharacter() <em>Quote Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteCharacter()
	 * @generated
	 * @ordered
	 */
	protected static final String QUOTE_CHARACTER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getQuoteCharacter() <em>Quote Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteCharacter()
	 * @generated
	 * @ordered
	 */
	protected String quoteCharacter = QUOTE_CHARACTER_EDEFAULT;
	/**
	 * This is true if the Quote Character attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quoteCharacterESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpreadsheetCSVImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpreadsheetCSVPackage.Literals.SPREADSHEET_CSV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatCSV getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(FormatCSV newFormat) {
		FormatCSV oldFormat = format;
		format = newFormat == null ? FORMAT_EDEFAULT : newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetCSVPackage.SPREADSHEET_CSV__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelimiter() {
		return delimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelimiter(String newDelimiter) {
		String oldDelimiter = delimiter;
		delimiter = newDelimiter;
		boolean oldDelimiterESet = delimiterESet;
		delimiterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetCSVPackage.SPREADSHEET_CSV__DELIMITER, oldDelimiter, delimiter, !oldDelimiterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDelimiter() {
		String oldDelimiter = delimiter;
		boolean oldDelimiterESet = delimiterESet;
		delimiter = DELIMITER_EDEFAULT;
		delimiterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpreadsheetCSVPackage.SPREADSHEET_CSV__DELIMITER, oldDelimiter, DELIMITER_EDEFAULT, oldDelimiterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDelimiter() {
		return delimiterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEscapeCharacter() {
		return escapeCharacter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEscapeCharacter(String newEscapeCharacter) {
		String oldEscapeCharacter = escapeCharacter;
		escapeCharacter = newEscapeCharacter;
		boolean oldEscapeCharacterESet = escapeCharacterESet;
		escapeCharacterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetCSVPackage.SPREADSHEET_CSV__ESCAPE_CHARACTER, oldEscapeCharacter, escapeCharacter, !oldEscapeCharacterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEscapeCharacter() {
		String oldEscapeCharacter = escapeCharacter;
		boolean oldEscapeCharacterESet = escapeCharacterESet;
		escapeCharacter = ESCAPE_CHARACTER_EDEFAULT;
		escapeCharacterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpreadsheetCSVPackage.SPREADSHEET_CSV__ESCAPE_CHARACTER, oldEscapeCharacter, ESCAPE_CHARACTER_EDEFAULT, oldEscapeCharacterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEscapeCharacter() {
		return escapeCharacterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecordSeparator() {
		return recordSeparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordSeparator(String newRecordSeparator) {
		String oldRecordSeparator = recordSeparator;
		recordSeparator = newRecordSeparator;
		boolean oldRecordSeparatorESet = recordSeparatorESet;
		recordSeparatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetCSVPackage.SPREADSHEET_CSV__RECORD_SEPARATOR, oldRecordSeparator, recordSeparator, !oldRecordSeparatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRecordSeparator() {
		String oldRecordSeparator = recordSeparator;
		boolean oldRecordSeparatorESet = recordSeparatorESet;
		recordSeparator = RECORD_SEPARATOR_EDEFAULT;
		recordSeparatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpreadsheetCSVPackage.SPREADSHEET_CSV__RECORD_SEPARATOR, oldRecordSeparator, RECORD_SEPARATOR_EDEFAULT, oldRecordSeparatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRecordSeparator() {
		return recordSeparatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuoteCharacter() {
		return quoteCharacter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuoteCharacter(String newQuoteCharacter) {
		String oldQuoteCharacter = quoteCharacter;
		quoteCharacter = newQuoteCharacter;
		boolean oldQuoteCharacterESet = quoteCharacterESet;
		quoteCharacterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetCSVPackage.SPREADSHEET_CSV__QUOTE_CHARACTER, oldQuoteCharacter, quoteCharacter, !oldQuoteCharacterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuoteCharacter() {
		String oldQuoteCharacter = quoteCharacter;
		boolean oldQuoteCharacterESet = quoteCharacterESet;
		quoteCharacter = QUOTE_CHARACTER_EDEFAULT;
		quoteCharacterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpreadsheetCSVPackage.SPREADSHEET_CSV__QUOTE_CHARACTER, oldQuoteCharacter, QUOTE_CHARACTER_EDEFAULT, oldQuoteCharacterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuoteCharacter() {
		return quoteCharacterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpreadsheetCSVPackage.SPREADSHEET_CSV__FORMAT:
				return getFormat();
			case SpreadsheetCSVPackage.SPREADSHEET_CSV__DELIMITER:
				return getDelimiter();
			case SpreadsheetCSVPackage.SPREADSHEET_CSV__ESCAPE_CHARACTER:
				return getEscapeCharacter();
			case SpreadsheetCSVPackage.SPREADSHEET_CSV__RECORD_SEPARATOR:
				return getRecordSeparator();
			case SpreadsheetCSVPackage.SPREADSHEET_CSV__QUOTE_CHARACTER:
				return getQuoteCharacter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpreadsheetCSVPackage.SPREADSHEET_CSV__FORMAT:
				setFormat((FormatCSV)newValue);
				return;
			case SpreadsheetCSVPackage.SPREADSHEET_CSV__DELIMITER:
				setDelimiter((String)newValue);
				return;
			case SpreadsheetCSVPackage.SPREADSHEET_CSV__ESCAPE_CHARACTER:
				setEscapeCharacter((String)newValue);
				return;
			case SpreadsheetCSVPackage.SPREADSHEET_CSV__RECORD_SEPARATOR:
				setRecordSeparator((String)newValue);
				return;
			case SpreadsheetCSVPackage.SPREADSHEET_CSV__QUOTE_CHARACTER:
				setQuoteCharacter((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpreadsheetCSVPackage.SPREADSHEET_CSV__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case SpreadsheetCSVPackage.SPREADSHEET_CSV__DELIMITER:
				unsetDelimiter();
				return;
			case SpreadsheetCSVPackage.SPREADSHEET_CSV__ESCAPE_CHARACTER:
				unsetEscapeCharacter();
				return;
			case SpreadsheetCSVPackage.SPREADSHEET_CSV__RECORD_SEPARATOR:
				unsetRecordSeparator();
				return;
			case SpreadsheetCSVPackage.SPREADSHEET_CSV__QUOTE_CHARACTER:
				unsetQuoteCharacter();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpreadsheetCSVPackage.SPREADSHEET_CSV__FORMAT:
				return format != FORMAT_EDEFAULT;
			case SpreadsheetCSVPackage.SPREADSHEET_CSV__DELIMITER:
				return isSetDelimiter();
			case SpreadsheetCSVPackage.SPREADSHEET_CSV__ESCAPE_CHARACTER:
				return isSetEscapeCharacter();
			case SpreadsheetCSVPackage.SPREADSHEET_CSV__RECORD_SEPARATOR:
				return isSetRecordSeparator();
			case SpreadsheetCSVPackage.SPREADSHEET_CSV__QUOTE_CHARACTER:
				return isSetQuoteCharacter();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Format: ");
		result.append(format);
		result.append(", Delimiter: ");
		if (delimiterESet) result.append(delimiter); else result.append("<unset>");
		result.append(", EscapeCharacter: ");
		if (escapeCharacterESet) result.append(escapeCharacter); else result.append("<unset>");
		result.append(", RecordSeparator: ");
		if (recordSeparatorESet) result.append(recordSeparator); else result.append("<unset>");
		result.append(", QuoteCharacter: ");
		if (quoteCharacterESet) result.append(quoteCharacter); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.spreadsheet.impl.SpreadsheetImpl#readFile()
	 */
	@Override
	public void readFileImpl(InputStream inputStream){
		CommonPlugin.INSTANCE.log("SpreadsheetPOI.load: started");
		
		CSVFormat format = CSVFormat.DEFAULT;
		switch ( this.getFormat()) {
		case ENUM_LITERAL_CSV_FORMAT_MYSQL: 
			format = CSVFormat.MYSQL;
			break;
		case ENUM_LITERAL_CSV_FORMAT_EXCEL: 
			format = CSVFormat.EXCEL;
			break;
		case ENUM_LITERAL_CSV_FORMAT_RFC4180:
			format = CSVFormat.RFC4180;
			break;
		case ENUM_LITERAL_CSV_FORMAT_TDF: 
			format = CSVFormat.TDF;
			break;
		}
		
		Reader reader = new InputStreamReader(inputStream);
		CSVParser parser = null;
		try {
			parser = new CSVParser(reader, format);
		} catch (IOException e) {
			CommonPlugin.INSTANCE.log("SpreadsheetCSV.readFile: file NOT loaded, exeption "+e.getMessage());
		}
		
		this.getSheets().clear();
		
		Sheet sheet = SpreadsheetFactory.eINSTANCE.createSheet();
		sheet.setSheetName("sheet");
		sheet.setSheetIndex(0);
		sheet.setSpreadsheet(this);
		
		int rowNr = 0;
		for (CSVRecord record : parser) {
			// new row
			Row row = SpreadsheetFactory.eINSTANCE.createRow();
			row.setRowIndex(rowNr);
			row.setSheet(sheet);
			rowNr++;
			int fieldNr = 0;
		    for (String field : record){
		    	Column column = sheet.getOrCreateColumn(fieldNr);
		    	fieldNr++;
		    	// new field
				Cell cell = SpreadsheetFactory.eINSTANCE.createCell();
				cell.setCellType(CellType.CELL_TYPE_STRING);
				cell.setStringValue(field);
				cell.setRow(row);
				cell.setColumn(column);
		    } // traverse the fields of one record
		} // traverse the records of the csv
		 
		CommonPlugin.INSTANCE.log("SpreadsheetCSV.load: sheet loaded");
	} // readFileImpl method

} //SpreadsheetCSVImpl
