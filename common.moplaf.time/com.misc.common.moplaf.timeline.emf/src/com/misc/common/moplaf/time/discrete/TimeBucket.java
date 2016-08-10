/**
 */
package com.misc.common.moplaf.time.discrete;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Bucket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.discrete.TimeBucket#getBucketStart <em>Bucket Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.TimeBucket#getBucketEnd <em>Bucket End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.TimeBucket#getNext <em>Next</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.TimeBucket#getPrevious <em>Previous</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.TimeBucket#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.TimeBucket#getSeconds <em>Seconds</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.TimeBucket#getBucketNr <em>Bucket Nr</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getTimeBucket()
 * @model
 * @generated
 */
public interface TimeBucket extends EObject {
	/**
	 * Returns the value of the '<em><b>Bucket Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bucket Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket Start</em>' attribute.
	 * @see #setBucketStart(Date)
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getTimeBucket_BucketStart()
	 * @model
	 * @generated
	 */
	Date getBucketStart();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.TimeBucket#getBucketStart <em>Bucket Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bucket Start</em>' attribute.
	 * @see #getBucketStart()
	 * @generated
	 */
	void setBucketStart(Date value);

	/**
	 * Returns the value of the '<em><b>Bucket End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bucket End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket End</em>' attribute.
	 * @see #setBucketEnd(Date)
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getTimeBucket_BucketEnd()
	 * @model
	 * @generated
	 */
	Date getBucketEnd();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.TimeBucket#getBucketEnd <em>Bucket End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bucket End</em>' attribute.
	 * @see #getBucketEnd()
	 * @generated
	 */
	void setBucketEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.discrete.TimeBucket#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(TimeBucket)
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getTimeBucket_Next()
	 * @see com.misc.common.moplaf.time.discrete.TimeBucket#getPrevious
	 * @model opposite="Previous"
	 * @generated
	 */
	TimeBucket getNext();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.TimeBucket#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(TimeBucket value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.discrete.TimeBucket#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(TimeBucket)
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getTimeBucket_Previous()
	 * @see com.misc.common.moplaf.time.discrete.TimeBucket#getNext
	 * @model opposite="Next"
	 * @generated
	 */
	TimeBucket getPrevious();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.TimeBucket#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(TimeBucket value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getTimeBucket_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.TimeBucket#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getTimeBucket_Seconds()
	 * @model
	 * @generated
	 */
	int getSeconds();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.TimeBucket#getSeconds <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seconds</em>' attribute.
	 * @see #getSeconds()
	 * @generated
	 */
	void setSeconds(int value);

	/**
	 * Returns the value of the '<em><b>Bucket Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bucket Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket Nr</em>' attribute.
	 * @see #setBucketNr(int)
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getTimeBucket_BucketNr()
	 * @model
	 * @generated
	 */
	int getBucketNr();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.TimeBucket#getBucketNr <em>Bucket Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bucket Nr</em>' attribute.
	 * @see #getBucketNr()
	 * @generated
	 */
	void setBucketNr(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean contains(Date sometime);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isBefore(TimeBucket other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int getSecondsIntersection(Date from, Date to);

} // TimeBucket
