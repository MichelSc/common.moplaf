/**
 */
package com.misc.common.moplaf.datatools;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Axis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.NavigationAxis#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.NavigationAxis#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.NavigationAxis#getPath <em>Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.NavigationAxis#getPrevious <em>Previous</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.NavigationAxis#getPathElement <em>Path Element</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getNavigationAxis()
 * @model abstract="true"
 * @generated
 */
public interface NavigationAxis extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type</em>' reference.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getNavigationAxis_SourceType()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EClass getSourceType();

	/**
	 * Returns the value of the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Type</em>' reference.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getNavigationAxis_TargetType()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EClass getTargetType();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.datatools.NavigationPath#getPathElements <em>Path Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' container reference.
	 * @see #setPath(NavigationPath)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getNavigationAxis_Path()
	 * @see com.misc.common.moplaf.datatools.NavigationPath#getPathElements
	 * @model opposite="PathElements" required="true" transient="false"
	 * @generated
	 */
	NavigationPath getPath();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.NavigationAxis#getPath <em>Path</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' container reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(NavigationPath value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getNavigationAxis_Previous()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	NavigationAxis getPrevious();

	/**
	 * Returns the value of the '<em><b>Path Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Element</em>' attribute.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getNavigationAxis_PathElement()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getPathElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject naviguate(EObject in);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<EObject> naviguateMany(EObject in);

} // NavigationAxis
