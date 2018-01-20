/**
 */
package com.misc.common.moplaf.gis;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Routes Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.GisRoutesHolder#getFromLocations <em>From Locations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisRoutesHolder#getToLocations <em>To Locations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisRoutesHolder#getSymmetrical <em>Symmetrical</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.GisPackage#getGisRoutesHolder()
 * @model
 * @generated
 */
public interface GisRoutesHolder extends GisRouter {
	/**
	 * Returns the value of the '<em><b>From Locations</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.gis.GisRoutesHolderFromLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Locations</em>' containment reference list.
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisRoutesHolder_FromLocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<GisRoutesHolderFromLocation> getFromLocations();

	/**
	 * Returns the value of the '<em><b>To Locations</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.gis.GisRoutesHolderToLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Locations</em>' containment reference list.
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisRoutesHolder_ToLocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<GisRoutesHolderToLocation> getToLocations();

	/**
	 * Returns the value of the '<em><b>Symmetrical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symmetrical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symmetrical</em>' attribute.
	 * @see #setSymmetrical(Boolean)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisRoutesHolder_Symmetrical()
	 * @model
	 * @generated
	 */
	Boolean getSymmetrical();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisRoutesHolder#getSymmetrical <em>Symmetrical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symmetrical</em>' attribute.
	 * @see #getSymmetrical()
	 * @generated
	 */
	void setSymmetrical(Boolean value);

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
	 * @model fromsRequired="true" fromsMany="true" tosRequired="true" tosMany="true"
	 * @generated
	 */
	void update(GisRouteCalculator calculator, EList<GisLocation> froms, EList<GisLocation> tos);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	GisRoutesHolderFromLocation addFromLocation(GisLocation location);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	GisRoutesHolderToLocation addToLocation(GisLocation location);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	GisRoutesHolderFromLocation getFromLocation(GisLocation location);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	GisRoutesHolderToLocation getToLocation(GisLocation location);

} // GisRoutesHolder
