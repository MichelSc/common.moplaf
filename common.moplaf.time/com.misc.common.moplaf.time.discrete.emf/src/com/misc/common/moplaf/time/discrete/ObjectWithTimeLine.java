/**
 */
package com.misc.common.moplaf.time.discrete;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object With Time Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.discrete.ObjectWithTimeLine#getBuckets <em>Buckets</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.ObjectWithTimeLine#getLastBucket <em>Last Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.ObjectWithTimeLine#getFirstBucket <em>First Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.ObjectWithTimeLine#getStartBucket <em>Start Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.ObjectWithTimeLine#getEndBucket <em>End Bucket</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.discrete.TimeDiscretePackage#getObjectWithTimeLine()
 * @model
 * @generated
 */
public interface ObjectWithTimeLine extends EObject {
	/**
	 * Returns the value of the '<em><b>Buckets</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.time.discrete.ObjectTimeBucket}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buckets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buckets</em>' reference list.
	 * @see com.misc.common.moplaf.time.discrete.TimeDiscretePackage#getObjectWithTimeLine_Buckets()
	 * @model
	 * @generated
	 */
	EList<ObjectTimeBucket> getBuckets();

	/**
	 * Returns the value of the '<em><b>Last Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Bucket</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Bucket</em>' reference.
	 * @see #setLastBucket(ObjectTimeBucket)
	 * @see com.misc.common.moplaf.time.discrete.TimeDiscretePackage#getObjectWithTimeLine_LastBucket()
	 * @model
	 * @generated
	 */
	ObjectTimeBucket getLastBucket();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.ObjectWithTimeLine#getLastBucket <em>Last Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Bucket</em>' reference.
	 * @see #getLastBucket()
	 * @generated
	 */
	void setLastBucket(ObjectTimeBucket value);

	/**
	 * Returns the value of the '<em><b>First Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Bucket</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Bucket</em>' reference.
	 * @see #setFirstBucket(ObjectTimeBucket)
	 * @see com.misc.common.moplaf.time.discrete.TimeDiscretePackage#getObjectWithTimeLine_FirstBucket()
	 * @model
	 * @generated
	 */
	ObjectTimeBucket getFirstBucket();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.ObjectWithTimeLine#getFirstBucket <em>First Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Bucket</em>' reference.
	 * @see #getFirstBucket()
	 * @generated
	 */
	void setFirstBucket(ObjectTimeBucket value);

	/**
	 * Returns the value of the '<em><b>Start Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Bucket</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Bucket</em>' reference.
	 * @see #setStartBucket(TimeBucket)
	 * @see com.misc.common.moplaf.time.discrete.TimeDiscretePackage#getObjectWithTimeLine_StartBucket()
	 * @model
	 * @generated
	 */
	TimeBucket getStartBucket();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.ObjectWithTimeLine#getStartBucket <em>Start Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Bucket</em>' reference.
	 * @see #getStartBucket()
	 * @generated
	 */
	void setStartBucket(TimeBucket value);

	/**
	 * Returns the value of the '<em><b>End Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Bucket</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Bucket</em>' reference.
	 * @see #setEndBucket(TimeBucket)
	 * @see com.misc.common.moplaf.time.discrete.TimeDiscretePackage#getObjectWithTimeLine_EndBucket()
	 * @model
	 * @generated
	 */
	TimeBucket getEndBucket();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.ObjectWithTimeLine#getEndBucket <em>End Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Bucket</em>' reference.
	 * @see #getEndBucket()
	 * @generated
	 */
	void setEndBucket(TimeBucket value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ObjectTimeBucket getBucket(TimeBucket bucket);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ObjectTimeBucket constructObjectTimeBucket();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

} // ObjectWithTimeLine
