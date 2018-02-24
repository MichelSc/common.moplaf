/**
 */
package com.misc.common.moplaf.gis.kml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.kml.MultiGeometry#getGeometries <em>Geometries</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.kml.KmlPackage#getMultiGeometry()
 * @model
 * @generated
 */
public interface MultiGeometry extends Geometry {
	/**
	 * Returns the value of the '<em><b>Geometries</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.gis.kml.Geometry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometries</em>' containment reference list.
	 * @see com.misc.common.moplaf.gis.kml.KmlPackage#getMultiGeometry_Geometries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Geometry> getGeometries();

} // MultiGeometry
