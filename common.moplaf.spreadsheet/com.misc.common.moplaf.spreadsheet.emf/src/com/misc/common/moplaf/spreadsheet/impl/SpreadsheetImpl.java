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
package com.misc.common.moplaf.spreadsheet.impl;

import com.misc.common.moplaf.spreadsheet.Sheet;
import com.misc.common.moplaf.spreadsheet.Spreadsheet;
import com.misc.common.moplaf.spreadsheet.SpreadsheetFactory;
import com.misc.common.moplaf.spreadsheet.SpreadsheetPackage;

import com.misc.common.moplaf.spreadsheet.SpreadsheetReaderWriter;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spreadsheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.SpreadsheetImpl#getSheets <em>Sheets</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.SpreadsheetImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.SpreadsheetImpl#getFiles <em>Files</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpreadsheetImpl extends MinimalEObjectImpl.Container implements Spreadsheet {
	/**
	 * The cached value of the '{@link #getSheets() <em>Sheets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheets()
	 * @generated
	 * @ordered
	 */
	protected EList<Sheet> sheets;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<SpreadsheetReaderWriter> files;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpreadsheetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpreadsheetPackage.Literals.SPREADSHEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sheet> getSheets() {
		if (sheets == null) {
			sheets = new EObjectContainmentWithInverseEList<Sheet>(Sheet.class, this, SpreadsheetPackage.SPREADSHEET__SHEETS, SpreadsheetPackage.SHEET__SPREADSHEET);
		}
		return sheets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetPackage.SPREADSHEET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpreadsheetReaderWriter> getFiles() {
		if (files == null) {
			files = new EObjectContainmentWithInverseEList<SpreadsheetReaderWriter>(SpreadsheetReaderWriter.class, this, SpreadsheetPackage.SPREADSHEET__FILES, SpreadsheetPackage.SPREADSHEET_READER_WRITER__SPREADSHEET);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Sheet getSheet(String sheetname) {
		for ( Sheet sheet : this.getSheets()){
			if ( sheet.getSheetName().equals(sheetname)){
				return sheet;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Sheet getSheet(int sheetindex) {
		for ( Sheet sheet : this.getSheets()){
			if ( sheet.getSheetIndex()==sheetindex){
				return sheet;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Sheet createSheet(int index) {
		Sheet sheet = SpreadsheetFactory.eINSTANCE.createSheet();
		sheet.setSheetIndex(index);
		this.getSheets().add(sheet);
		return sheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Sheet getOrCreateSheet(int index) {
		Sheet sheet = this.getSheet(index);
		if ( sheet==null ){
			sheet = this.createSheet(index);
		}
		return sheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Sheet addSheet() {
		Optional<Integer> max_index = this.getSheets().stream()
				.map(c -> c.getSheetIndex())
				.max(Comparator.naturalOrder());
		int new_index = max_index.isPresent() ? max_index.get()+1 : 0;
		Sheet new_sheet = this.createSheet(new_index);
		return new_sheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void flush() {
		this.getSheets().clear();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpreadsheetPackage.SPREADSHEET__SHEETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSheets()).basicAdd(otherEnd, msgs);
			case SpreadsheetPackage.SPREADSHEET__FILES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFiles()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpreadsheetPackage.SPREADSHEET__SHEETS:
				return ((InternalEList<?>)getSheets()).basicRemove(otherEnd, msgs);
			case SpreadsheetPackage.SPREADSHEET__FILES:
				return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpreadsheetPackage.SPREADSHEET__SHEETS:
				return getSheets();
			case SpreadsheetPackage.SPREADSHEET__NAME:
				return getName();
			case SpreadsheetPackage.SPREADSHEET__FILES:
				return getFiles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpreadsheetPackage.SPREADSHEET__SHEETS:
				getSheets().clear();
				getSheets().addAll((Collection<? extends Sheet>)newValue);
				return;
			case SpreadsheetPackage.SPREADSHEET__NAME:
				setName((String)newValue);
				return;
			case SpreadsheetPackage.SPREADSHEET__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends SpreadsheetReaderWriter>)newValue);
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
			case SpreadsheetPackage.SPREADSHEET__SHEETS:
				getSheets().clear();
				return;
			case SpreadsheetPackage.SPREADSHEET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpreadsheetPackage.SPREADSHEET__FILES:
				getFiles().clear();
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
			case SpreadsheetPackage.SPREADSHEET__SHEETS:
				return sheets != null && !sheets.isEmpty();
			case SpreadsheetPackage.SPREADSHEET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpreadsheetPackage.SPREADSHEET__FILES:
				return files != null && !files.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SpreadsheetPackage.SPREADSHEET___GET_SHEET__STRING:
				return getSheet((String)arguments.get(0));
			case SpreadsheetPackage.SPREADSHEET___GET_SHEET__INT:
				return getSheet((Integer)arguments.get(0));
			case SpreadsheetPackage.SPREADSHEET___CREATE_SHEET__INT:
				return createSheet((Integer)arguments.get(0));
			case SpreadsheetPackage.SPREADSHEET___GET_OR_CREATE_SHEET__INT:
				return getOrCreateSheet((Integer)arguments.get(0));
			case SpreadsheetPackage.SPREADSHEET___ADD_SHEET:
				return addSheet();
			case SpreadsheetPackage.SPREADSHEET___FLUSH:
				flush();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SpreadsheetImpl
