/**
 */
package com.misc.common.moplaf.gis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Routes Holder Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.GisRoutesHolderElement#getToLocation <em>To Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisRoutesHolderElement#getFromLocation <em>From Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisRoutesHolderElement#getRoutesInfo <em>Routes Info</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisRoutesHolderElement#isCalculated <em>Calculated</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.GisPackage#getGisRoutesHolderElement()
 * @model
 * @generated
 */
public interface GisRoutesHolderElement extends EObject {
	/**
	 * Returns the value of the '<em><b>To Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.gis.GisRoutesHolderToLocation#getFromLocations <em>From Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Location</em>' reference.
	 * @see #setToLocation(GisRoutesHolderToLocation)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisRoutesHolderElement_ToLocation()
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderToLocation#getFromLocations
	 * @model opposite="FromLocations" required="true"
	 * @generated
	 */
	GisRoutesHolderToLocation getToLocation();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisRoutesHolderElement#getToLocation <em>To Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Location</em>' reference.
	 * @see #getToLocation()
	 * @generated
	 */
	void setToLocation(GisRoutesHolderToLocation value);

	/**
	 * Returns the value of the '<em><b>From Location</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#getToLocations <em>To Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Location</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Location</em>' container reference.
	 * @see #setFromLocation(GisRoutesHolderFromLocation)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisRoutesHolderElement_FromLocation()
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#getToLocations
	 * @model opposite="ToLocations" required="true" transient="false"
	 * @generated
	 */
	GisRoutesHolderFromLocation getFromLocation();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisRoutesHolderElement#getFromLocation <em>From Location</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Location</em>' container reference.
	 * @see #getFromLocation()
	 * @generated
	 */
	void setFromLocation(GisRoutesHolderFromLocation value);

	/**
	 * Returns the value of the '<em><b>Routes Info</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.gis.GisRouteInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routes Info</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes Info</em>' containment reference list.
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisRoutesHolderElement_RoutesInfo()
	 * @model containment="true"
	 * @generated
	 */
	EList<GisRouteInfo> getRoutesInfo();

	/**
	 * Returns the value of the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculated</em>' attribute.
	 * @see #setCalculated(boolean)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisRoutesHolderElement_Calculated()
	 * @model
	 * @generated
	 */
	boolean isCalculated();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisRoutesHolderElement#isCalculated <em>Calculated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculated</em>' attribute.
	 * @see #isCalculated()
	 * @generated
	 */
	void setCalculated(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void remove();

} // GisRoutesHolderElement
