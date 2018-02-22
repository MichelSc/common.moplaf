/**
 */
package com.misc.common.moplaf.gis.kml.impl;

import com.google.earth.kml._2.ContainerType;
import com.misc.common.moplaf.file.File;
import com.misc.common.moplaf.file.FilePackage;
import com.misc.common.moplaf.file.FileReader;
import com.misc.common.moplaf.gis.kml.Feature;
import com.misc.common.moplaf.gis.kml.KmlPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.kml.impl.ContainerImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.kml.impl.ContainerImpl#getFiles <em>Files</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContainerImpl extends FeatureImpl implements com.misc.common.moplaf.gis.kml.Container {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Feature>(Feature.class, this, KmlPackage.CONTAINER__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<File>(File.class, this, KmlPackage.CONTAINER__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void readFile(File file) {
		 try {
				JAXBContext jaxbContext = JAXBContext.newInstance(ContainerType.class);

				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				ContainerType container = (ContainerType) jaxbUnmarshaller.unmarshal(file.getInputStream());

				// do something with container ...

			  } catch (JAXBException e) {
				e.printStackTrace();
			  }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmlPackage.CONTAINER__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case KmlPackage.CONTAINER__FILES:
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
			case KmlPackage.CONTAINER__FEATURES:
				return getFeatures();
			case KmlPackage.CONTAINER__FILES:
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
			case KmlPackage.CONTAINER__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case KmlPackage.CONTAINER__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends File>)newValue);
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
			case KmlPackage.CONTAINER__FEATURES:
				getFeatures().clear();
				return;
			case KmlPackage.CONTAINER__FILES:
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
			case KmlPackage.CONTAINER__FEATURES:
				return features != null && !features.isEmpty();
			case KmlPackage.CONTAINER__FILES:
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == FileReader.class) {
			switch (baseOperationID) {
				case FilePackage.FILE_READER___READ_FILE__FILE: return KmlPackage.CONTAINER___READ_FILE__FILE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case KmlPackage.CONTAINER___READ_FILE__FILE:
				readFile((File)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ContainerImpl
