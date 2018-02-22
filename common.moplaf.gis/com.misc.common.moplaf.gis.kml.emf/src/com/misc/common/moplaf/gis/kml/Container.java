/**
 */
package com.misc.common.moplaf.gis.kml;

import com.misc.common.moplaf.file.File;
import com.misc.common.moplaf.file.FileReader;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.kml.Container#getFeatures <em>Features</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.kml.Container#getFiles <em>Files</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.kml.KmlPackage#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends Feature, FileReader {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.gis.kml.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see com.misc.common.moplaf.gis.kml.KmlPackage#getContainer_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

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
	 * @see com.misc.common.moplaf.gis.kml.KmlPackage#getContainer_Files()
	 * @model containment="true"
	 * @generated
	 */
	EList<File> getFiles();

} // Container
