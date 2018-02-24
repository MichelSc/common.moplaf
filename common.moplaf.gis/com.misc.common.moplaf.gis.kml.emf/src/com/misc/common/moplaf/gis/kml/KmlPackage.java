/**
 */
package com.misc.common.moplaf.gis.kml;

import com.misc.common.moplaf.file.FilePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.gis.kml.KmlFactory
 * @model kind="package"
 * @generated
 */
public interface KmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/gis/kml/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KmlPackage eINSTANCE = com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.kml.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.kml.impl.FeatureImpl
	 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 4;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.kml.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.kml.impl.ContainerImpl
	 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.kml.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.kml.impl.DocumentImpl
	 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.kml.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.kml.impl.FolderImpl
	 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 3;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.kml.impl.PlacemarkImpl <em>Placemark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.kml.impl.PlacemarkImpl
	 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getPlacemark()
	 * @generated
	 */
	int PLACEMARK = 5;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.kml.impl.GeometryImpl <em>Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.kml.impl.GeometryImpl
	 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getGeometry()
	 * @generated
	 */
	int GEOMETRY = 6;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.kml.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.kml.impl.PointImpl
	 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 7;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.kml.impl.LineStringImpl <em>Line String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.kml.impl.LineStringImpl
	 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getLineString()
	 * @generated
	 */
	int LINE_STRING = 8;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.kml.impl.LinearRingImpl <em>Linear Ring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.kml.impl.LinearRingImpl
	 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getLinearRing()
	 * @generated
	 */
	int LINEAR_RING = 9;

	/**
	 * The meta object id for the '<em>Coordinates</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.common.Coordinates
	 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getCoordinates()
	 * @generated
	 */
	int COORDINATES = 12;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.kml.impl.KmlImpl <em>Kml</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.kml.impl.KmlImpl
	 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getKml()
	 * @generated
	 */
	int KML = 0;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KML__FILES = FilePackage.FILE_READER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KML__FEATURE = FilePackage.FILE_READER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Kml</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KML_FEATURE_COUNT = FilePackage.FILE_READER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Read File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KML___READ_FILE__FILE = FilePackage.FILE_READER___READ_FILE__FILE;

	/**
	 * The number of operations of the '<em>Kml</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KML_OPERATION_COUNT = FilePackage.FILE_READER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__FEATURES = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__FEATURES = CONTAINER__FEATURES;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__FEATURES = CONTAINER__FEATURES;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK__GEOMETRY = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Placemark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Placemark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Placemark</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__PLACEMARK = 0;

	/**
	 * The number of structural features of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Placemark</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__PLACEMARK = GEOMETRY__PLACEMARK;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__COORDINATES = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = GEOMETRY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Placemark</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING__PLACEMARK = GEOMETRY__PLACEMARK;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING__COORDINATES = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Line String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Line String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_OPERATION_COUNT = GEOMETRY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Placemark</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING__PLACEMARK = GEOMETRY__PLACEMARK;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING__COORDINATES = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Linear Ring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Linear Ring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_OPERATION_COUNT = GEOMETRY_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.kml.impl.MultiGeometryImpl <em>Multi Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.kml.impl.MultiGeometryImpl
	 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getMultiGeometry()
	 * @generated
	 */
	int MULTI_GEOMETRY = 10;

	/**
	 * The feature id for the '<em><b>Placemark</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY__PLACEMARK = GEOMETRY__PLACEMARK;

	/**
	 * The feature id for the '<em><b>Geometries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY__GEOMETRIES = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multi Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY_OPERATION_COUNT = GEOMETRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.kml.impl.PolygonImpl <em>Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.kml.impl.PolygonImpl
	 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getPolygon()
	 * @generated
	 */
	int POLYGON = 11;

	/**
	 * The feature id for the '<em><b>Placemark</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__PLACEMARK = GEOMETRY__PLACEMARK;

	/**
	 * The feature id for the '<em><b>Outer Boundary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__OUTER_BOUNDARY = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inner Boundaries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__INNER_BOUNDARIES = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_OPERATION_COUNT = GEOMETRY_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.kml.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see com.misc.common.moplaf.gis.kml.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.kml.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see com.misc.common.moplaf.gis.kml.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.gis.kml.Container#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see com.misc.common.moplaf.gis.kml.Container#getFeatures()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Features();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.kml.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see com.misc.common.moplaf.gis.kml.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.kml.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see com.misc.common.moplaf.gis.kml.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.kml.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.gis.kml.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.kml.Placemark <em>Placemark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placemark</em>'.
	 * @see com.misc.common.moplaf.gis.kml.Placemark
	 * @generated
	 */
	EClass getPlacemark();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.gis.kml.Placemark#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry</em>'.
	 * @see com.misc.common.moplaf.gis.kml.Placemark#getGeometry()
	 * @see #getPlacemark()
	 * @generated
	 */
	EReference getPlacemark_Geometry();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.kml.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry</em>'.
	 * @see com.misc.common.moplaf.gis.kml.Geometry
	 * @generated
	 */
	EClass getGeometry();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.gis.kml.Geometry#getPlacemark <em>Placemark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Placemark</em>'.
	 * @see com.misc.common.moplaf.gis.kml.Geometry#getPlacemark()
	 * @see #getGeometry()
	 * @generated
	 */
	EReference getGeometry_Placemark();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.kml.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see com.misc.common.moplaf.gis.kml.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.kml.Point#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinates</em>'.
	 * @see com.misc.common.moplaf.gis.kml.Point#getCoordinates()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Coordinates();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.kml.LineString <em>Line String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line String</em>'.
	 * @see com.misc.common.moplaf.gis.kml.LineString
	 * @generated
	 */
	EClass getLineString();

	/**
	 * Returns the meta object for the attribute list '{@link com.misc.common.moplaf.gis.kml.LineString#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Coordinates</em>'.
	 * @see com.misc.common.moplaf.gis.kml.LineString#getCoordinates()
	 * @see #getLineString()
	 * @generated
	 */
	EAttribute getLineString_Coordinates();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.kml.LinearRing <em>Linear Ring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Ring</em>'.
	 * @see com.misc.common.moplaf.gis.kml.LinearRing
	 * @generated
	 */
	EClass getLinearRing();

	/**
	 * Returns the meta object for the attribute list '{@link com.misc.common.moplaf.gis.kml.LinearRing#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Coordinates</em>'.
	 * @see com.misc.common.moplaf.gis.kml.LinearRing#getCoordinates()
	 * @see #getLinearRing()
	 * @generated
	 */
	EAttribute getLinearRing_Coordinates();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.kml.MultiGeometry <em>Multi Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Geometry</em>'.
	 * @see com.misc.common.moplaf.gis.kml.MultiGeometry
	 * @generated
	 */
	EClass getMultiGeometry();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.gis.kml.MultiGeometry#getGeometries <em>Geometries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Geometries</em>'.
	 * @see com.misc.common.moplaf.gis.kml.MultiGeometry#getGeometries()
	 * @see #getMultiGeometry()
	 * @generated
	 */
	EReference getMultiGeometry_Geometries();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.kml.Polygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon</em>'.
	 * @see com.misc.common.moplaf.gis.kml.Polygon
	 * @generated
	 */
	EClass getPolygon();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.gis.kml.Polygon#getOuterBoundary <em>Outer Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outer Boundary</em>'.
	 * @see com.misc.common.moplaf.gis.kml.Polygon#getOuterBoundary()
	 * @see #getPolygon()
	 * @generated
	 */
	EReference getPolygon_OuterBoundary();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.gis.kml.Polygon#getInnerBoundaries <em>Inner Boundaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inner Boundaries</em>'.
	 * @see com.misc.common.moplaf.gis.kml.Polygon#getInnerBoundaries()
	 * @see #getPolygon()
	 * @generated
	 */
	EReference getPolygon_InnerBoundaries();

	/**
	 * Returns the meta object for data type '{@link com.misc.common.moplaf.common.Coordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Coordinates</em>'.
	 * @see com.misc.common.moplaf.common.Coordinates
	 * @model instanceClass="com.misc.common.moplaf.common.Coordinates"
	 * @generated
	 */
	EDataType getCoordinates();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.kml.Kml <em>Kml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kml</em>'.
	 * @see com.misc.common.moplaf.gis.kml.Kml
	 * @generated
	 */
	EClass getKml();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.gis.kml.Kml#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see com.misc.common.moplaf.gis.kml.Kml#getFiles()
	 * @see #getKml()
	 * @generated
	 */
	EReference getKml_Files();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.gis.kml.Kml#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see com.misc.common.moplaf.gis.kml.Kml#getFeature()
	 * @see #getKml()
	 * @generated
	 */
	EReference getKml_Feature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KmlFactory getKmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.kml.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.kml.impl.DocumentImpl
		 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.kml.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.kml.impl.ContainerImpl
		 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__FEATURES = eINSTANCE.getContainer_Features();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.kml.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.kml.impl.FolderImpl
		 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.kml.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.kml.impl.FeatureImpl
		 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.kml.impl.PlacemarkImpl <em>Placemark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.kml.impl.PlacemarkImpl
		 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getPlacemark()
		 * @generated
		 */
		EClass PLACEMARK = eINSTANCE.getPlacemark();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACEMARK__GEOMETRY = eINSTANCE.getPlacemark_Geometry();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.kml.impl.GeometryImpl <em>Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.kml.impl.GeometryImpl
		 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getGeometry()
		 * @generated
		 */
		EClass GEOMETRY = eINSTANCE.getGeometry();

		/**
		 * The meta object literal for the '<em><b>Placemark</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY__PLACEMARK = eINSTANCE.getGeometry_Placemark();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.kml.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.kml.impl.PointImpl
		 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__COORDINATES = eINSTANCE.getPoint_Coordinates();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.kml.impl.LineStringImpl <em>Line String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.kml.impl.LineStringImpl
		 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getLineString()
		 * @generated
		 */
		EClass LINE_STRING = eINSTANCE.getLineString();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STRING__COORDINATES = eINSTANCE.getLineString_Coordinates();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.kml.impl.LinearRingImpl <em>Linear Ring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.kml.impl.LinearRingImpl
		 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getLinearRing()
		 * @generated
		 */
		EClass LINEAR_RING = eINSTANCE.getLinearRing();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_RING__COORDINATES = eINSTANCE.getLinearRing_Coordinates();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.kml.impl.MultiGeometryImpl <em>Multi Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.kml.impl.MultiGeometryImpl
		 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getMultiGeometry()
		 * @generated
		 */
		EClass MULTI_GEOMETRY = eINSTANCE.getMultiGeometry();

		/**
		 * The meta object literal for the '<em><b>Geometries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_GEOMETRY__GEOMETRIES = eINSTANCE.getMultiGeometry_Geometries();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.kml.impl.PolygonImpl <em>Polygon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.kml.impl.PolygonImpl
		 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getPolygon()
		 * @generated
		 */
		EClass POLYGON = eINSTANCE.getPolygon();

		/**
		 * The meta object literal for the '<em><b>Outer Boundary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYGON__OUTER_BOUNDARY = eINSTANCE.getPolygon_OuterBoundary();

		/**
		 * The meta object literal for the '<em><b>Inner Boundaries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYGON__INNER_BOUNDARIES = eINSTANCE.getPolygon_InnerBoundaries();

		/**
		 * The meta object literal for the '<em>Coordinates</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.common.Coordinates
		 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getCoordinates()
		 * @generated
		 */
		EDataType COORDINATES = eINSTANCE.getCoordinates();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.kml.impl.KmlImpl <em>Kml</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.kml.impl.KmlImpl
		 * @see com.misc.common.moplaf.gis.kml.impl.KmlPackageImpl#getKml()
		 * @generated
		 */
		EClass KML = eINSTANCE.getKml();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KML__FILES = eINSTANCE.getKml_Files();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KML__FEATURE = eINSTANCE.getKml_Feature();

	}

} //KmlPackage
