/**
 */
package com.misc.common.moplaf.gis;

import com.misc.common.moplaf.common.EnabledFeedback;
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
 *   <li>{@link com.misc.common.moplaf.gis.GisRoutesHolder#getCalculator <em>Calculator</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisRoutesHolder#getRefreshFeedback <em>Refresh Feedback</em>}</li>
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
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#getRoutesHolder <em>Routes Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Locations</em>' containment reference list.
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisRoutesHolder_FromLocations()
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#getRoutesHolder
	 * @model opposite="RoutesHolder" containment="true"
	 * @generated
	 */
	EList<GisRoutesHolderFromLocation> getFromLocations();

	/**
	 * Returns the value of the '<em><b>To Locations</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.gis.GisRoutesHolderToLocation}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.gis.GisRoutesHolderToLocation#getRoutesHolder <em>Routes Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Locations</em>' containment reference list.
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisRoutesHolder_ToLocations()
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderToLocation#getRoutesHolder
	 * @model opposite="RoutesHolder" containment="true"
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
	 * Returns the value of the '<em><b>Calculator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculator</em>' reference.
	 * @see #setCalculator(GisRouter)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisRoutesHolder_Calculator()
	 * @model
	 * @generated
	 */
	GisRouter getCalculator();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisRoutesHolder#getCalculator <em>Calculator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculator</em>' reference.
	 * @see #getCalculator()
	 * @generated
	 */
	void setCalculator(GisRouter value);

	/**
	 * Returns the value of the '<em><b>Refresh Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refresh Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisRoutesHolder_RefreshFeedback()
	 * @model dataType="com.misc.common.moplaf.job.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getRefreshFeedback();

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

} // GisRoutesHolder
