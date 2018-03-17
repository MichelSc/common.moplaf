/**
 */
package com.misc.common.moplaf.file.impl;

import com.misc.common.moplaf.common.EnabledFeedback;

import com.misc.common.moplaf.file.File;
import com.misc.common.moplaf.file.FilePackage;
import com.misc.common.moplaf.file.FileReaderWriter;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reader Writer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.file.impl.FileReaderWriterImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link com.misc.common.moplaf.file.impl.FileReaderWriterImpl#getSelectedFile <em>Selected File</em>}</li>
 *   <li>{@link com.misc.common.moplaf.file.impl.FileReaderWriterImpl#getHandledFile <em>Handled File</em>}</li>
 *   <li>{@link com.misc.common.moplaf.file.impl.FileReaderWriterImpl#getReadFeedback <em>Read Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.file.impl.FileReaderWriterImpl#getWriteFeedback <em>Write Feedback</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FileReaderWriterImpl extends MinimalEObjectImpl.Container implements FileReaderWriter {
	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<File> files;

	/**
	 * The cached value of the '{@link #getSelectedFile() <em>Selected File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedFile()
	 * @generated
	 * @ordered
	 */
	protected File selectedFile;

	/**
	 * The default value of the '{@link #getReadFeedback() <em>Read Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback READ_FEEDBACK_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWriteFeedback() <em>Write Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback WRITE_FEEDBACK_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileReaderWriterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilePackage.Literals.FILE_READER_WRITER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<File>(File.class, this, FilePackage.FILE_READER_WRITER__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getSelectedFile() {
		if (selectedFile != null && selectedFile.eIsProxy()) {
			InternalEObject oldSelectedFile = (InternalEObject)selectedFile;
			selectedFile = (File)eResolveProxy(oldSelectedFile);
			if (selectedFile != oldSelectedFile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FilePackage.FILE_READER_WRITER__SELECTED_FILE, oldSelectedFile, selectedFile));
			}
		}
		return selectedFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File basicGetSelectedFile() {
		return selectedFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedFile(File newSelectedFile) {
		File oldSelectedFile = selectedFile;
		selectedFile = newSelectedFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_READER_WRITER__SELECTED_FILE, oldSelectedFile, selectedFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getHandledFile() {
		File handledFile = basicGetHandledFile();
		return handledFile != null && handledFile.eIsProxy() ? (File)eResolveProxy((InternalEObject)handledFile) : handledFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public File basicGetHandledFile() {
		File selected = this.getSelectedFile();
		if ( selected!=null ) {
			return selected;
		}
		if ( this.getFiles().size()==1 ) {
			return this.getFiles().get(0);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getReadFeedback() {
		return this.getReadFeedback(this.getHandledFile());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getWriteFeedback() {
		return this.getWriteFeedback(this.getHandledFile());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getReadFeedback(File file) {
		if ( file == null ) {
			return new EnabledFeedback(false, "No file to read from");
		}
		return this.getReadFeedbackImpl(file);
	}

	protected EnabledFeedback getReadFeedbackImpl(File file) {
		return new EnabledFeedback(false, "Read not supported");
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getWriteFeedback(File file) {
		if ( file == null ) {
			return new EnabledFeedback(false, "No file to write to");
		}
		return this.getWriteFeedbackImpl(file);
	}

	protected EnabledFeedback getWriteFeedbackImpl(File file) {
		return new EnabledFeedback(false, "Write not supported");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void readFile() {
		this.readFile(this.getHandledFile());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void writeFile() {
		this.writeFile(this.getHandledFile());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void readFile(File file) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void writeFile(File file) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FilePackage.FILE_READER_WRITER__FILES:
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
			case FilePackage.FILE_READER_WRITER__FILES:
				return getFiles();
			case FilePackage.FILE_READER_WRITER__SELECTED_FILE:
				if (resolve) return getSelectedFile();
				return basicGetSelectedFile();
			case FilePackage.FILE_READER_WRITER__HANDLED_FILE:
				if (resolve) return getHandledFile();
				return basicGetHandledFile();
			case FilePackage.FILE_READER_WRITER__READ_FEEDBACK:
				return getReadFeedback();
			case FilePackage.FILE_READER_WRITER__WRITE_FEEDBACK:
				return getWriteFeedback();
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
			case FilePackage.FILE_READER_WRITER__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends File>)newValue);
				return;
			case FilePackage.FILE_READER_WRITER__SELECTED_FILE:
				setSelectedFile((File)newValue);
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
			case FilePackage.FILE_READER_WRITER__FILES:
				getFiles().clear();
				return;
			case FilePackage.FILE_READER_WRITER__SELECTED_FILE:
				setSelectedFile((File)null);
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
			case FilePackage.FILE_READER_WRITER__FILES:
				return files != null && !files.isEmpty();
			case FilePackage.FILE_READER_WRITER__SELECTED_FILE:
				return selectedFile != null;
			case FilePackage.FILE_READER_WRITER__HANDLED_FILE:
				return basicGetHandledFile() != null;
			case FilePackage.FILE_READER_WRITER__READ_FEEDBACK:
				return READ_FEEDBACK_EDEFAULT == null ? getReadFeedback() != null : !READ_FEEDBACK_EDEFAULT.equals(getReadFeedback());
			case FilePackage.FILE_READER_WRITER__WRITE_FEEDBACK:
				return WRITE_FEEDBACK_EDEFAULT == null ? getWriteFeedback() != null : !WRITE_FEEDBACK_EDEFAULT.equals(getWriteFeedback());
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
			case FilePackage.FILE_READER_WRITER___GET_READ_FEEDBACK__FILE:
				return getReadFeedback((File)arguments.get(0));
			case FilePackage.FILE_READER_WRITER___GET_WRITE_FEEDBACK__FILE:
				return getWriteFeedback((File)arguments.get(0));
			case FilePackage.FILE_READER_WRITER___READ_FILE:
				readFile();
				return null;
			case FilePackage.FILE_READER_WRITER___WRITE_FILE:
				writeFile();
				return null;
			case FilePackage.FILE_READER_WRITER___READ_FILE__FILE:
				readFile((File)arguments.get(0));
				return null;
			case FilePackage.FILE_READER_WRITER___WRITE_FILE__FILE:
				writeFile((File)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //FileReaderWriterImpl
