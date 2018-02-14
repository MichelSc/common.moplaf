/**
 */
package com.misc.common.moplaf.gis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Pinpointer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.GisLocationPinpointer#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisLocationPinpointer#getMaxPinpoints <em>Max Pinpoints</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.GisPackage#getGisLocationPinpointer()
 * @model abstract="true"
 * @generated
 */
public interface GisLocationPinpointer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisLocationPinpointer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisLocationPinpointer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Max Pinpoints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Pinpoints</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Pinpoints</em>' attribute.
	 * @see #setMaxPinpoints(int)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisLocationPinpointer_MaxPinpoints()
	 * @model
	 * @generated
	 */
	int getMaxPinpoints();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisLocationPinpointer#getMaxPinpoints <em>Max Pinpoints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Pinpoints</em>' attribute.
	 * @see #getMaxPinpoints()
	 * @generated
	 */
	void setMaxPinpoints(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void snap(GisLocation location);

} // GisLocationPinpointer
