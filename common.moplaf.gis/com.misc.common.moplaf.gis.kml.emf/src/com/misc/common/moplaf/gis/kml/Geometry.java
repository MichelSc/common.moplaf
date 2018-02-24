/**
 */
package com.misc.common.moplaf.gis.kml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.kml.Geometry#getPlacemark <em>Placemark</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.kml.KmlPackage#getGeometry()
 * @model abstract="true"
 * @generated
 */
public interface Geometry extends EObject {

	/**
	 * Returns the value of the '<em><b>Placemark</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placemark</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placemark</em>' reference.
	 * @see com.misc.common.moplaf.gis.kml.KmlPackage#getGeometry_Placemark()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Placemark getPlacemark();
} // Geometry
