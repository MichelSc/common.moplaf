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
package com.misc.common.moplaf.file.impl;

import com.misc.common.moplaf.file.ByteFile;
import com.misc.common.moplaf.file.FileEncoding;
import com.misc.common.moplaf.file.FilePackage;
import com.misc.common.moplaf.file.Plugin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Byte File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.file.impl.ByteFileImpl#getEncoding <em>Encoding</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ByteFileImpl extends FileImpl implements ByteFile {
	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final FileEncoding ENCODING_EDEFAULT = FileEncoding.UTF_8;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected FileEncoding encoding = ENCODING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ByteFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilePackage.Literals.BYTE_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileEncoding getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(FileEncoding newEncoding) {
		FileEncoding oldEncoding = encoding;
		encoding = newEncoding == null ? ENCODING_EDEFAULT : newEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.BYTE_FILE__ENCODING, oldEncoding, encoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FilePackage.BYTE_FILE__ENCODING:
				return getEncoding();
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
			case FilePackage.BYTE_FILE__ENCODING:
				setEncoding((FileEncoding)newValue);
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
			case FilePackage.BYTE_FILE__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
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
			case FilePackage.BYTE_FILE__ENCODING:
				return encoding != ENCODING_EDEFAULT;
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
		result.append(" (Encoding: ");
		result.append(encoding);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * 
	 */
	protected java.io.File getFile() {
		return null;
	}

	@Override
	public Reader getReader() {
		InputStream stream = this.getInputStream();
		if ( stream == null ) {
			Plugin.INSTANCE.logError("ByteFile.getReader: no input stream");
			return null;
		}
		
		try {
			return new InputStreamReader(stream, getEncoding().getLiteral());
		} catch (UnsupportedEncodingException e) {
			Plugin.INSTANCE.logError("ByteFile.getReader: unsupported encoding, exception "+e.getMessage());
			return null;
		}
	}

	@Override
	public InputStream getInputStream() {
		File file = this.getFile();
		if ( file == null ) {
			Plugin.INSTANCE.logError("ByteFile.getInputStream: file NOT found");
			return null;
		}
		
		FileInputStream inputstream = null;
		try {
			inputstream  = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			Plugin.INSTANCE.logError("ByteFile.getInputStream: input stream not created");
			return null;
		} 
		return inputstream;
	}

	@Override
	public Writer getWriter() {
		OutputStream stream = this.getOutputStream();
		if ( stream == null ) {
			Plugin.INSTANCE.logError("ByteFile.getReader: no output stream");
			return null;
		}
			
		try {
			return new OutputStreamWriter(stream, this.getEncoding().getLiteral());
		} catch (UnsupportedEncodingException e) {
			Plugin.INSTANCE.logError("ByteFile.getWriter: unsupported encoding, exception "+e.getMessage());
			return null;
		}
	}

	@Override
	public OutputStream getOutputStream() {
		File file = this.getFile();
		if ( file == null ) {
			Plugin.INSTANCE.logError("ByteFile.getOutputStream: file NOT found");
			return null;
		}

		FileOutputStream outputstream = null;
		try {
			outputstream = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			Plugin.INSTANCE.logError("ByteFile.getOutputStream: output stream not created");
			return null;
		} 
		return outputstream;
	}

} //ByteFileImpl
