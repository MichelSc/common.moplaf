/**
 */
package com.misc.common.moplaf.gis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.GisDistanceMatrix#getFromLocations <em>From Locations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisDistanceMatrix#getToLocations <em>To Locations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisDistanceMatrix#getCalculator <em>Calculator</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisDistanceMatrix#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.gis.GisPackage#getGisDistanceMatrix()
 * @model
 * @generated
 */
public interface GisDistanceMatrix extends EObject {
	/**
	 * Returns the value of the '<em><b>From Locations</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.gis.GisDistanceFromLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Locations</em>' containment reference list.
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisDistanceMatrix_FromLocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<GisDistanceFromLocation> getFromLocations();

	/**
	 * Returns the value of the '<em><b>To Locations</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.gis.GisDistanceToLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Locations</em>' containment reference list.
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisDistanceMatrix_ToLocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<GisDistanceToLocation> getToLocations();

	/**
	 * Returns the value of the '<em><b>Calculator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculator</em>' reference.
	 * @see #setCalculator(GisDistanceMatrixCalculator)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisDistanceMatrix_Calculator()
	 * @model
	 * @generated
	 */
	GisDistanceMatrixCalculator getCalculator();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisDistanceMatrix#getCalculator <em>Calculator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculator</em>' reference.
	 * @see #getCalculator()
	 * @generated
	 */
	void setCalculator(GisDistanceMatrixCalculator value);

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
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisDistanceMatrix_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisDistanceMatrix#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void calculate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addFromLocation(GisCoordinates location);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addToLocation(GisCoordinates location);

} // GisDistanceMatrix
