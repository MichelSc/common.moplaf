/**
 */
package com.misc.common.moplaf.gis.kml.impl;

import com.misc.common.moplaf.common.Coordinates;
import com.misc.common.moplaf.file.File;
import com.misc.common.moplaf.gis.kml.Document;
import com.misc.common.moplaf.gis.kml.Feature;
import com.misc.common.moplaf.gis.kml.Folder;
import com.misc.common.moplaf.gis.kml.Geometry;
import com.misc.common.moplaf.gis.kml.Kml;
import com.misc.common.moplaf.gis.kml.KmlFactory;
import com.misc.common.moplaf.gis.kml.KmlPackage;
import com.misc.common.moplaf.gis.kml.LineString;
import com.misc.common.moplaf.gis.kml.LinearRing;
import com.misc.common.moplaf.gis.kml.Placemark;
import com.misc.common.moplaf.gis.kml.Point;

import net.opengis.kml._2.AbstractContainerType;
import net.opengis.kml._2.AbstractFeatureType;
import net.opengis.kml._2.AbstractGeometryType;
import net.opengis.kml._2.DocumentType;
import net.opengis.kml._2.FolderType;
import net.opengis.kml._2.KmlType;
import net.opengis.kml._2.LineStringType;
import net.opengis.kml._2.LinearRingType;
import net.opengis.kml._2.PlacemarkType;
import net.opengis.kml._2.PointType;

import org.eclipse.emf.common.notify.Notification;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

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
 * An implementation of the model object '<em><b>Kml</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.kml.impl.KmlImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.kml.impl.KmlImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KmlImpl extends MinimalEObjectImpl.Container implements Kml {
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
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature feature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KmlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.KML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<File>(File.class, this, KmlPackage.KML__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeature(Feature newFeature, NotificationChain msgs) {
		Feature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmlPackage.KML__FEATURE, oldFeature, newFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(Feature newFeature) {
		if (newFeature != feature) {
			NotificationChain msgs = null;
			if (feature != null)
				msgs = ((InternalEObject)feature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmlPackage.KML__FEATURE, null, msgs);
			if (newFeature != null)
				msgs = ((InternalEObject)newFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmlPackage.KML__FEATURE, null, msgs);
			msgs = basicSetFeature(newFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.KML__FEATURE, newFeature, newFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void readFile(File file) {
		 try {
				JAXBContext jaxbContext = JAXBContext.newInstance(KmlType.class);

				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				JAXBElement<KmlType> result = (JAXBElement<KmlType>) jaxbUnmarshaller.unmarshal(file.getInputStream());
				KmlType klm = result.getValue();
				JAXBElement<? extends AbstractFeatureType> feature_ele = klm.getAbstractFeatureGroup();
				Feature feature = this.createFeature(feature_ele);
				this.setFeature(feature);
				
				boolean ok = klm != null;
//				Plugin.INSTANCE.logInfo("KML read: "+ok);

			  } catch (JAXBException e) {
				e.printStackTrace();
	//			Plugin.INSTANCE.logError("KML not read: "+e.getMessage());
			  }
	}

	private Geometry createGeometry(JAXBElement<? extends AbstractGeometryType> element) {
		AbstractGeometryType geometry_ele = element.getValue();
		Geometry new_geometry = null;
		if ( geometry_ele instanceof PointType) {
			Point new_point = KmlFactory.eINSTANCE.createPoint();
			this.synchPoint(new_point, (PointType)geometry_ele);
			new_geometry = new_point;
		} else if ( geometry_ele instanceof LineStringType) {
			LineString new_linestring = KmlFactory.eINSTANCE.createLineString();
			this.synchLineString(new_linestring, (LineStringType)geometry_ele);
			new_geometry = new_linestring;
		} else if ( geometry_ele instanceof LinearRingType) {
			LinearRing new_linearring = KmlFactory.eINSTANCE.createLinearRing();
			this.synchLinearRing(new_linearring, (LinearRingType)geometry_ele);
			new_geometry = new_linearring;
		}
		return new_geometry;
	}

	private void synchGeometry(Geometry geomtry, AbstractGeometryType geometry_ele) {
	}
	
	private void synchPoint(Point point , PointType point_ele) {
		this.synchGeometry(point, point_ele);
		List<String> coordinates_collec = point_ele.getCoordinates();
		if ( coordinates_collec.size()>0) {
			String coordinates_string = coordinates_collec.get(0);
			Coordinates coordinates = Coordinates.valueOf(coordinates_string);
			point.setCoordinates(coordinates);
		}
	}
	
	private void synchLineString(LineString line, LineStringType line_ele) {
		this.synchGeometry(line, line_ele);
		List<String> coordinates_collec = line_ele.getCoordinates();
		line.getCoordinates().clear();
		for ( String coordinates_string : coordinates_collec ) {
			Coordinates coordinates = Coordinates.valueOf(coordinates_string);
			line.getCoordinates().add(coordinates);
		}
	}
	
	private void synchLinearRing(LinearRing line, LinearRingType line_ele) {
		this.synchGeometry(line, line_ele);
		List<String> coordinates_collec = line_ele.getCoordinates();
		line.getCoordinates().clear();
		for ( String coordinates_string : coordinates_collec ) {
			Coordinates coordinates = Coordinates.valueOf(coordinates_string);
			line.getCoordinates().add(coordinates);
		}
	}
	
	private Feature createFeature(JAXBElement<? extends AbstractFeatureType> element) {
		AbstractFeatureType feature_ele = element.getValue();
		Feature new_feature = null;
		if ( feature_ele instanceof DocumentType) {
			Document new_document = KmlFactory.eINSTANCE.createDocument();
			this.synchDocument(new_document, (DocumentType)feature_ele);
			new_feature = new_document;
		} else if (feature_ele instanceof FolderType ) {
			Folder new_folder= KmlFactory.eINSTANCE.createFolder();
			this.synchFolder(new_folder, (FolderType)feature_ele);
			new_feature = new_folder;
		} else if ( feature_ele instanceof PlacemarkType ) {
			Placemark new_placemark = KmlFactory.eINSTANCE.createPlacemark();
			this.synchPlacemark(new_placemark, (PlacemarkType)feature_ele);
			new_feature = new_placemark;
		}
		return new_feature;
	}
	
	private void synchFeature(Feature feature, AbstractFeatureType feature_ele) {
		String name = feature_ele.getName();
		feature.setName(name);
	}
	
	private void synchPlacemark(Placemark placemark, PlacemarkType placemark_ele) {
		this.synchFeature(placemark, placemark_ele);
		JAXBElement<? extends AbstractGeometryType> geometry_ele = placemark_ele.getAbstractGeometryGroup();
		if ( geometry_ele != null ) {
			Geometry new_geometry = this.createGeometry(geometry_ele);
			placemark.setGeometry(new_geometry);
		}
	}
	
	private void synchContainer(com.misc.common.moplaf.gis.kml.Container container, AbstractContainerType container_ele) {
		this.synchFeature(container, container_ele);
	}
	
	private void synchDocument(Document doc, DocumentType doc_ele) {
		this.synchContainer(doc, doc_ele);
		for ( JAXBElement<? extends AbstractFeatureType> element_feature : doc_ele.getAbstractFeatureGroup() ) {
			Feature new_feature = this.createFeature(element_feature);
			doc.getFeatures().add(new_feature);
		}
	}

	private void synchFolder(Folder folder, FolderType folder_ele) {
		this.synchContainer(folder, folder_ele);
		for ( JAXBElement<? extends AbstractFeatureType> element_feature : folder_ele.getAbstractFeatureGroup() ) {
			Feature new_feature = this.createFeature(element_feature);
			folder.getFeatures().add(new_feature);
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
			case KmlPackage.KML__FILES:
				return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
			case KmlPackage.KML__FEATURE:
				return basicSetFeature(null, msgs);
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
			case KmlPackage.KML__FILES:
				return getFiles();
			case KmlPackage.KML__FEATURE:
				return getFeature();
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
			case KmlPackage.KML__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends File>)newValue);
				return;
			case KmlPackage.KML__FEATURE:
				setFeature((Feature)newValue);
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
			case KmlPackage.KML__FILES:
				getFiles().clear();
				return;
			case KmlPackage.KML__FEATURE:
				setFeature((Feature)null);
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
			case KmlPackage.KML__FILES:
				return files != null && !files.isEmpty();
			case KmlPackage.KML__FEATURE:
				return feature != null;
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
			case KmlPackage.KML___READ_FILE__FILE:
				readFile((File)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //KmlImpl
