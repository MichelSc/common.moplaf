/**
 */
package com.misc.common.moplaf.time.discrete;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Time Bucket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.discrete.ObjectTimeBucket#getBucket <em>Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.ObjectTimeBucket#getNext <em>Next</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.ObjectTimeBucket#getPrevious <em>Previous</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.ObjectTimeBucket#getObjectWithTimeLine <em>Object With Time Line</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getObjectTimeBucket()
 * @model
 * @generated
 */
public interface ObjectTimeBucket extends EObject {
	/**
	 * Returns the value of the '<em><b>Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bucket</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket</em>' reference.
	 * @see #setBucket(TimeBucket)
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getObjectTimeBucket_Bucket()
	 * @model required="true"
	 * @generated
	 */
	TimeBucket getBucket();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.ObjectTimeBucket#getBucket <em>Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bucket</em>' reference.
	 * @see #getBucket()
	 * @generated
	 */
	void setBucket(TimeBucket value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.discrete.ObjectTimeBucket#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(ObjectTimeBucket)
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getObjectTimeBucket_Next()
	 * @see com.misc.common.moplaf.time.discrete.ObjectTimeBucket#getPrevious
	 * @model opposite="Previous"
	 * @generated
	 */
	ObjectTimeBucket getNext();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.ObjectTimeBucket#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(ObjectTimeBucket value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.discrete.ObjectTimeBucket#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(ObjectTimeBucket)
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getObjectTimeBucket_Previous()
	 * @see com.misc.common.moplaf.time.discrete.ObjectTimeBucket#getNext
	 * @model opposite="Next"
	 * @generated
	 */
	ObjectTimeBucket getPrevious();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.ObjectTimeBucket#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(ObjectTimeBucket value);

	/**
	 * Returns the value of the '<em><b>Object With Time Line</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.discrete.ObjectWithTimeLine#getBuckets <em>Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object With Time Line</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object With Time Line</em>' container reference.
	 * @see #setObjectWithTimeLine(ObjectWithTimeLine)
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getObjectTimeBucket_ObjectWithTimeLine()
	 * @see com.misc.common.moplaf.time.discrete.ObjectWithTimeLine#getBuckets
	 * @model opposite="Buckets" required="true" transient="false"
	 * @generated
	 */
	ObjectWithTimeLine getObjectWithTimeLine();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.ObjectTimeBucket#getObjectWithTimeLine <em>Object With Time Line</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object With Time Line</em>' container reference.
	 * @see #getObjectWithTimeLine()
	 * @generated
	 */
	void setObjectWithTimeLine(ObjectWithTimeLine value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void dispose();

} // ObjectTimeBucket
