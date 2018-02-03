/**
 */
package com.misc.common.moplaf.gis;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Routes Holder To Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.GisRoutesHolderToLocation#getFromLocations <em>From Locations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisRoutesHolderToLocation#getRoutesHolder <em>Routes Holder</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.GisPackage#getGisRoutesHolderToLocation()
 * @model
 * @generated
 */
public interface GisRoutesHolderToLocation extends GisRoutesHolderWaypoint {
	/**
	 * Returns the value of the '<em><b>From Locations</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.gis.GisRoutesHolderElement}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.gis.GisRoutesHolderElement#getToLocation <em>To Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Locations</em>' reference list.
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisRoutesHolderToLocation_FromLocations()
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderElement#getToLocation
	 * @model opposite="ToLocation"
	 * @generated
	 */
	EList<GisRoutesHolderElement> getFromLocations();

	/**
	 * Returns the value of the '<em><b>Routes Holder</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.gis.GisRoutesHolder#getToLocations <em>To Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routes Holder</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes Holder</em>' container reference.
	 * @see #setRoutesHolder(GisRoutesHolder)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisRoutesHolderToLocation_RoutesHolder()
	 * @see com.misc.common.moplaf.gis.GisRoutesHolder#getToLocations
	 * @model opposite="ToLocations" required="true" transient="false"
	 * @generated
	 */
	GisRoutesHolder getRoutesHolder();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisRoutesHolderToLocation#getRoutesHolder <em>Routes Holder</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routes Holder</em>' container reference.
	 * @see #getRoutesHolder()
	 * @generated
	 */
	void setRoutesHolder(GisRoutesHolder value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	GisRoutesHolderElement getElement(GisLocation fromLocation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	GisRoutesHolderElement addElement(GisRoutesHolderFromLocation fromLocation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void update(GisRouteCalculator calculator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void remove();

} // GisRoutesHolderToLocation
