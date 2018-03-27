/**
 */
package com.misc.common.moplaf.job.impl;

import com.misc.common.moplaf.file.File;
import com.misc.common.moplaf.file.FileHandler;
import com.misc.common.moplaf.file.FileOwner;
import com.misc.common.moplaf.file.FilePackage;
import com.misc.common.moplaf.file.util.Util;
import com.misc.common.moplaf.job.JobFileHandler;
import com.misc.common.moplaf.job.JobPackage;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.impl.JobFileHandlerImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.JobFileHandlerImpl#getSelectedFile <em>Selected File</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.JobFileHandlerImpl#getHandledFile <em>Handled File</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class JobFileHandlerImpl extends JobImpl implements JobFileHandler {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobFileHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobPackage.Literals.JOB_FILE_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<File>(File.class, this, JobPackage.JOB_FILE_HANDLER__FILES);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JobPackage.JOB_FILE_HANDLER__SELECTED_FILE, oldSelectedFile, selectedFile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.JOB_FILE_HANDLER__SELECTED_FILE, oldSelectedFile, selectedFile));
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
	public com.misc.common.moplaf.file.File basicGetHandledFile() {
		return Util.FileHandlerGetHandledFile(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobPackage.JOB_FILE_HANDLER__FILES:
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
			case JobPackage.JOB_FILE_HANDLER__FILES:
				return getFiles();
			case JobPackage.JOB_FILE_HANDLER__SELECTED_FILE:
				if (resolve) return getSelectedFile();
				return basicGetSelectedFile();
			case JobPackage.JOB_FILE_HANDLER__HANDLED_FILE:
				if (resolve) return getHandledFile();
				return basicGetHandledFile();
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
			case JobPackage.JOB_FILE_HANDLER__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends File>)newValue);
				return;
			case JobPackage.JOB_FILE_HANDLER__SELECTED_FILE:
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
			case JobPackage.JOB_FILE_HANDLER__FILES:
				getFiles().clear();
				return;
			case JobPackage.JOB_FILE_HANDLER__SELECTED_FILE:
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
			case JobPackage.JOB_FILE_HANDLER__FILES:
				return files != null && !files.isEmpty();
			case JobPackage.JOB_FILE_HANDLER__SELECTED_FILE:
				return selectedFile != null;
			case JobPackage.JOB_FILE_HANDLER__HANDLED_FILE:
				return basicGetHandledFile() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == FileOwner.class) {
			switch (derivedFeatureID) {
				case JobPackage.JOB_FILE_HANDLER__FILES: return FilePackage.FILE_OWNER__FILES;
				default: return -1;
			}
		}
		if (baseClass == FileHandler.class) {
			switch (derivedFeatureID) {
				case JobPackage.JOB_FILE_HANDLER__SELECTED_FILE: return FilePackage.FILE_HANDLER__SELECTED_FILE;
				case JobPackage.JOB_FILE_HANDLER__HANDLED_FILE: return FilePackage.FILE_HANDLER__HANDLED_FILE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == FileOwner.class) {
			switch (baseFeatureID) {
				case FilePackage.FILE_OWNER__FILES: return JobPackage.JOB_FILE_HANDLER__FILES;
				default: return -1;
			}
		}
		if (baseClass == FileHandler.class) {
			switch (baseFeatureID) {
				case FilePackage.FILE_HANDLER__SELECTED_FILE: return JobPackage.JOB_FILE_HANDLER__SELECTED_FILE;
				case FilePackage.FILE_HANDLER__HANDLED_FILE: return JobPackage.JOB_FILE_HANDLER__HANDLED_FILE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //JobFileHandlerImpl
