/**
 */
package com.misc.common.moplaf.file.impl;

import com.misc.common.moplaf.file.FileLocal;
import com.misc.common.moplaf.file.FilePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.file.impl.FileLocalImpl#getFilePath <em>File Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileLocalImpl extends FileImpl implements FileLocal {
	/**
	 * The default value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_PATH_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected String filePath = FILE_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileLocalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilePackage.Literals.FILE_LOCAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilePath(String newFilePath) {
		String oldFilePath = filePath;
		filePath = newFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_LOCAL__FILE_PATH, oldFilePath, filePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FilePackage.FILE_LOCAL__FILE_PATH:
				return getFilePath();
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
			case FilePackage.FILE_LOCAL__FILE_PATH:
				setFilePath((String)newValue);
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
			case FilePackage.FILE_LOCAL__FILE_PATH:
				setFilePath(FILE_PATH_EDEFAULT);
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
			case FilePackage.FILE_LOCAL__FILE_PATH:
				return FILE_PATH_EDEFAULT == null ? filePath != null : !FILE_PATH_EDEFAULT.equals(filePath);
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
		result.append(" (FilePath: ");
		result.append(filePath);
		result.append(')');
		return result.toString();
	}

	/**
	 * 
	 */
	@Override
	public Reader getReader() {
		// open the file
		FileReader reader = null;
		try {
			reader = new FileReader(this.getFilePath());
		} catch (FileNotFoundException e) {
			CommonPlugin.INSTANCE.log("FileLocal.getReader: file NOT found");
			return null;
		} 
		CommonPlugin.INSTANCE.log("FileLocal.getReader: file found");
		return reader;
	}
	
	/**
	 * 
	 */
	@Override
	public InputStream getInputStream() {
		FileInputStream inputstream = null;
		try {
			inputstream = new FileInputStream(this.getFilePath());
		} catch (FileNotFoundException e) {
			CommonPlugin.INSTANCE.log("FileLocal.getInputStream: file NOT found");
			return null;
		} 
		CommonPlugin.INSTANCE.log("FileLocal.getInputStream: file found");
		return inputstream;
	}

	/**
	 * For writing characters files
	 */
	@Override
	public Writer getWriter() {
		FileWriter writer = null;
		try {
			writer = new FileWriter(this.getFilePath());
		} catch (IOException e) {
			CommonPlugin.INSTANCE.log("FileLocal.getWriter: file NOT found");
		} 
		CommonPlugin.INSTANCE.log("FileLocal.getWriter: file found");
		return writer;
	}
	
	/**
	 * For writing raw data files
	 */
	@Override
	public OutputStream getOutputStream() {
		FileOutputStream outputstream = null;
		try {
			outputstream = new FileOutputStream(this.getFilePath());
		} catch (FileNotFoundException e) {
			CommonPlugin.INSTANCE.log("FileLocal.getOutputStream: file NOT found");
			return null;
		} 
		CommonPlugin.INSTANCE.log("FileLocal.getOutputStream: file found");
		return outputstream;
	}



} //FileLocalImpl
