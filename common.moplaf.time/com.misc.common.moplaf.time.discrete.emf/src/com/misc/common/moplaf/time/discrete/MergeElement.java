/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.time.discrete;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.discrete.MergeElement#getBucketFrom <em>Bucket From</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.MergeElement#getBucketTo <em>Bucket To</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.MergeElement#getPrevious <em>Previous</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.MergeElement#getNext <em>Next</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.MergeElement#getPartFromInTo <em>Part From In To</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.MergeElement#getPartToInFrom <em>Part To In From</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.MergeElement#getElementStart <em>Element Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.MergeElement#getElementEnd <em>Element End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.MergeElement#getSeconds <em>Seconds</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.discrete.TimeDiscretePackage#getMergeElement()
 * @model
 * @generated
 */
public interface MergeElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Bucket From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bucket From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket From</em>' reference.
	 * @see #setBucketFrom(TimeBucket)
	 * @see com.misc.common.moplaf.time.discrete.TimeDiscretePackage#getMergeElement_BucketFrom()
	 * @model
	 * @generated
	 */
	TimeBucket getBucketFrom();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.MergeElement#getBucketFrom <em>Bucket From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bucket From</em>' reference.
	 * @see #getBucketFrom()
	 * @generated
	 */
	void setBucketFrom(TimeBucket value);

	/**
	 * Returns the value of the '<em><b>Bucket To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bucket To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket To</em>' reference.
	 * @see #setBucketTo(TimeBucket)
	 * @see com.misc.common.moplaf.time.discrete.TimeDiscretePackage#getMergeElement_BucketTo()
	 * @model
	 * @generated
	 */
	TimeBucket getBucketTo();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.MergeElement#getBucketTo <em>Bucket To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bucket To</em>' reference.
	 * @see #getBucketTo()
	 * @generated
	 */
	void setBucketTo(TimeBucket value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.discrete.MergeElement#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(MergeElement)
	 * @see com.misc.common.moplaf.time.discrete.TimeDiscretePackage#getMergeElement_Previous()
	 * @see com.misc.common.moplaf.time.discrete.MergeElement#getNext
	 * @model opposite="Next"
	 * @generated
	 */
	MergeElement getPrevious();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.MergeElement#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(MergeElement value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.discrete.MergeElement#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(MergeElement)
	 * @see com.misc.common.moplaf.time.discrete.TimeDiscretePackage#getMergeElement_Next()
	 * @see com.misc.common.moplaf.time.discrete.MergeElement#getPrevious
	 * @model opposite="Previous"
	 * @generated
	 */
	MergeElement getNext();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.MergeElement#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(MergeElement value);

	/**
	 * Returns the value of the '<em><b>Part From In To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part From In To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part From In To</em>' attribute.
	 * @see #setPartFromInTo(float)
	 * @see com.misc.common.moplaf.time.discrete.TimeDiscretePackage#getMergeElement_PartFromInTo()
	 * @model
	 * @generated
	 */
	float getPartFromInTo();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.MergeElement#getPartFromInTo <em>Part From In To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part From In To</em>' attribute.
	 * @see #getPartFromInTo()
	 * @generated
	 */
	void setPartFromInTo(float value);

	/**
	 * Returns the value of the '<em><b>Part To In From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part To In From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part To In From</em>' attribute.
	 * @see #setPartToInFrom(float)
	 * @see com.misc.common.moplaf.time.discrete.TimeDiscretePackage#getMergeElement_PartToInFrom()
	 * @model
	 * @generated
	 */
	float getPartToInFrom();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.MergeElement#getPartToInFrom <em>Part To In From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part To In From</em>' attribute.
	 * @see #getPartToInFrom()
	 * @generated
	 */
	void setPartToInFrom(float value);

	/**
	 * Returns the value of the '<em><b>Element Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Start</em>' attribute.
	 * @see #setElementStart(Date)
	 * @see com.misc.common.moplaf.time.discrete.TimeDiscretePackage#getMergeElement_ElementStart()
	 * @model
	 * @generated
	 */
	Date getElementStart();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.MergeElement#getElementStart <em>Element Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Start</em>' attribute.
	 * @see #getElementStart()
	 * @generated
	 */
	void setElementStart(Date value);

	/**
	 * Returns the value of the '<em><b>Element End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element End</em>' attribute.
	 * @see #setElementEnd(Date)
	 * @see com.misc.common.moplaf.time.discrete.TimeDiscretePackage#getMergeElement_ElementEnd()
	 * @model
	 * @generated
	 */
	Date getElementEnd();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.MergeElement#getElementEnd <em>Element End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element End</em>' attribute.
	 * @see #getElementEnd()
	 * @generated
	 */
	void setElementEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seconds</em>' attribute.
	 * @see #setSeconds(int)
	 * @see com.misc.common.moplaf.time.discrete.TimeDiscretePackage#getMergeElement_Seconds()
	 * @model
	 * @generated
	 */
	int getSeconds();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.MergeElement#getSeconds <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seconds</em>' attribute.
	 * @see #getSeconds()
	 * @generated
	 */
	void setSeconds(int value);

} // MergeElement
