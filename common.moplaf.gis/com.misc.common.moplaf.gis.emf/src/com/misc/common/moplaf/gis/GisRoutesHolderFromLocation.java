/**
 */
package com.misc.common.moplaf.gis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Routes Holder From Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#getLocation <em>Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#getToLocations <em>To Locations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#getRoutesHolder <em>Routes Holder</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.GisPackage#getGisRoutesHolderFromLocation()
 * @model
 * @generated
 */
public interface GisRoutesHolderFromLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(GisLocation)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisRoutesHolderFromLocation_Location()
	 * @model required="true"
	 * @generated
	 */
	GisLocation getLocation();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(GisLocation value);

	/**
	 * Returns the value of the '<em><b>To Locations</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.gis.GisRoutesHolderElement}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.gis.GisRoutesHolderElement#getFromLocation <em>From Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Locations</em>' containment reference list.
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisRoutesHolderFromLocation_ToLocations()
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderElement#getFromLocation
	 * @model opposite="FromLocation" containment="true"
	 * @generated
	 */
	EList<GisRoutesHolderElement> getToLocations();

	/**
	 * Returns the value of the '<em><b>Routes Holder</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.gis.GisRoutesHolder#getFromLocations <em>From Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routes Holder</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes Holder</em>' container reference.
	 * @see #setRoutesHolder(GisRoutesHolder)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisRoutesHolderFromLocation_RoutesHolder()
	 * @see com.misc.common.moplaf.gis.GisRoutesHolder#getFromLocations
	 * @model opposite="FromLocations" required="true" transient="false"
	 * @generated
	 */
	GisRoutesHolder getRoutesHolder();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#getRoutesHolder <em>Routes Holder</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routes Holder</em>' container reference.
	 * @see #getRoutesHolder()
	 * @generated
	 */
	void setRoutesHolder(GisRoutesHolder value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisRoutesHolderFromLocation_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	GisRoutesHolderElement getElement(GisLocation toLocation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	GisRoutesHolderElement addElement(GisRoutesHolderToLocation toLocation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void remove();

} // GisRoutesHolderFromLocation
