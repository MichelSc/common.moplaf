/**
 */
package com.misc.common.moplaf.gis.kml;

import com.misc.common.moplaf.file.File;

import com.misc.common.moplaf.file.FileReader;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kml</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.kml.Kml#getFiles <em>Files</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.kml.Kml#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.kml.KmlPackage#getKml()
 * @model
 * @generated
 */
public interface Kml extends FileReader {
	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.file.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see com.misc.common.moplaf.gis.kml.KmlPackage#getKml_Files()
	 * @model containment="true"
	 * @generated
	 */
	EList<File> getFiles();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference.
	 * @see #setFeature(Feature)
	 * @see com.misc.common.moplaf.gis.kml.KmlPackage#getKml_Feature()
	 * @model containment="true"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.kml.Kml#getFeature <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' containment reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

} // Kml
