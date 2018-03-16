/**
 */
package com.misc.common.moplaf.file.impl;

import com.misc.common.moplaf.file.FilePackage;
import com.misc.common.moplaf.file.FileRemote;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.file.impl.FileRemoteImpl#getURI <em>URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileRemoteImpl extends FileImpl implements FileRemote {
	/**
	 * The default value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileRemoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilePackage.Literals.FILE_REMOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getURI() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURI(String newURI) {
		String oldURI = uri;
		uri = newURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_REMOTE__URI, oldURI, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FilePackage.FILE_REMOTE__URI:
				return getURI();
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
			case FilePackage.FILE_REMOTE__URI:
				setURI((String)newValue);
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
			case FilePackage.FILE_REMOTE__URI:
				setURI(URI_EDEFAULT);
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
			case FilePackage.FILE_REMOTE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
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
		result.append(" (URI: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}
	
	private URI getURI_private() {
		try {
			return new URI(this.getURI());
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	private java.io.File getFile_private() {
		URI uri = this.getURI_private();
		if ( uri == null ) {
			return null;
		}
		java.io.File file = new java.io.File(uri);
		return file;
	}

	@Override
	public Reader getReader() {
		java.io.File file = this.getFile_private();
		if ( file == null) {
			CommonPlugin.INSTANCE.log("FileRemote.getReader: file NOT found");
			return null;
		}
		Reader reader;
		try {
			reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			CommonPlugin.INSTANCE.log("FileRemote.getReader: Reader NOT created");
			e.printStackTrace();
			return null;
		}
		
		return reader;
	}

	@Override
	public InputStream getInputStream() {
		java.io.File file = this.getFile_private();
		if ( file == null) {
			CommonPlugin.INSTANCE.log("FileRemote.getInputStream: file NOT found");
			return null;
		}
		FileInputStream inputstream = null;
		try {
			inputstream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			CommonPlugin.INSTANCE.log("FileRemote.getInputStream: stream NOT created");
			return null;
		} 
		return inputstream;
	}

	@Override
	public Writer getWriter() {
		// TODO Auto-generated method stub
		return super.getWriter();
	}

	@Override
	public OutputStream getOutputStream() {
		// TODO Auto-generated method stub
		return super.getOutputStream();
	}
	
	

} //FileRemoteImpl
