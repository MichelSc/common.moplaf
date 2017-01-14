/**
 */
package com.misc.common.moplaf.time.discrete;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Line Merge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.discrete.TimeLineMerge#getElements <em>Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.TimeLineMerge#getTimeLineTo <em>Time Line To</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.TimeLineMerge#getFirstElement <em>First Element</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.TimeLineMerge#getLastElement <em>Last Element</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.TimeLineMerge#getTimeLineFrom <em>Time Line From</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getTimeLineMerge()
 * @model
 * @generated
 */
public interface TimeLineMerge extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.time.discrete.MergeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getTimeLineMerge_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<MergeElement> getElements();

	/**
	 * Returns the value of the '<em><b>Time Line To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Line To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Line To</em>' reference.
	 * @see #setTimeLineTo(TimeLine)
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getTimeLineMerge_TimeLineTo()
	 * @model
	 * @generated
	 */
	TimeLine getTimeLineTo();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.TimeLineMerge#getTimeLineTo <em>Time Line To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Line To</em>' reference.
	 * @see #getTimeLineTo()
	 * @generated
	 */
	void setTimeLineTo(TimeLine value);

	/**
	 * Returns the value of the '<em><b>First Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Element</em>' reference.
	 * @see #setFirstElement(MergeElement)
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getTimeLineMerge_FirstElement()
	 * @model
	 * @generated
	 */
	MergeElement getFirstElement();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.TimeLineMerge#getFirstElement <em>First Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Element</em>' reference.
	 * @see #getFirstElement()
	 * @generated
	 */
	void setFirstElement(MergeElement value);

	/**
	 * Returns the value of the '<em><b>Last Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Element</em>' reference.
	 * @see #setLastElement(MergeElement)
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getTimeLineMerge_LastElement()
	 * @model
	 * @generated
	 */
	MergeElement getLastElement();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.TimeLineMerge#getLastElement <em>Last Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Element</em>' reference.
	 * @see #getLastElement()
	 * @generated
	 */
	void setLastElement(MergeElement value);

	/**
	 * Returns the value of the '<em><b>Time Line From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Line From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Line From</em>' reference.
	 * @see #setTimeLineFrom(TimeLine)
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getTimeLineMerge_TimeLineFrom()
	 * @model
	 * @generated
	 */
	TimeLine getTimeLineFrom();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.TimeLineMerge#getTimeLineFrom <em>Time Line From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Line From</em>' reference.
	 * @see #getTimeLineFrom()
	 * @generated
	 */
	void setTimeLineFrom(TimeLine value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

} // TimeLineMerge
