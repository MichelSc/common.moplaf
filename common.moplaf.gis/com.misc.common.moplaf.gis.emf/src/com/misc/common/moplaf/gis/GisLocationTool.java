/**
 */
package com.misc.common.moplaf.gis;

import com.misc.common.moplaf.common.EnabledFeedback;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.GisLocationTool#getTool <em>Tool</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisLocationTool#getLocation <em>Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisLocationTool#getResults <em>Results</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisLocationTool#getLastHandlingFeedback <em>Last Handling Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisLocationTool#getDoToolFeedback <em>Do Tool Feedback</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.GisPackage#getGisLocationTool()
 * @model
 * @generated
 */
public interface GisLocationTool extends EObject {
	/**
	 * Returns the value of the '<em><b>Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool</em>' reference.
	 * @see #setTool(GisToolLocation)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisLocationTool_Tool()
	 * @model required="true"
	 * @generated
	 */
	GisToolLocation getTool();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisLocationTool#getTool <em>Tool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool</em>' reference.
	 * @see #getTool()
	 * @generated
	 */
	void setTool(GisToolLocation value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.gis.GisLocation#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' container reference.
	 * @see #setLocation(GisLocation)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisLocationTool_Location()
	 * @see com.misc.common.moplaf.gis.GisLocation#getTools
	 * @model opposite="Tools" required="true" transient="false"
	 * @generated
	 */
	GisLocation getLocation();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisLocationTool#getLocation <em>Location</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' container reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(GisLocation value);

	/**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.gis.GisLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Results</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' containment reference list.
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisLocationTool_Results()
	 * @model containment="true"
	 * @generated
	 */
	EList<GisLocation> getResults();

	/**
	 * Returns the value of the '<em><b>Last Handling Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Handling Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Handling Feedback</em>' attribute.
	 * @see #setLastHandlingFeedback(String)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisLocationTool_LastHandlingFeedback()
	 * @model
	 * @generated
	 */
	String getLastHandlingFeedback();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisLocationTool#getLastHandlingFeedback <em>Last Handling Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Handling Feedback</em>' attribute.
	 * @see #getLastHandlingFeedback()
	 * @generated
	 */
	void setLastHandlingFeedback(String value);

	/**
	 * Returns the value of the '<em><b>Do Tool Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Tool Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Tool Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisLocationTool_DoToolFeedback()
	 * @model dataType="com.misc.common.moplaf.job.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getDoToolFeedback();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void doTool();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void flushResults();

} // GisLocationTool
