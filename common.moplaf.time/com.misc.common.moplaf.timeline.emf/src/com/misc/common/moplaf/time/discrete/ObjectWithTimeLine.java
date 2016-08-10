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
 *   <li>{@link com.misc.common.moplaf.time.discrete.ObjectWithTimeLine#getTimeline <em>Timeline</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.ObjectWithTimeLine#getBuckets <em>Buckets</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.ObjectWithTimeLine#getLastBucket <em>Last Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.ObjectWithTimeLine#getFirstBucket <em>First Bucket</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getObjectWithTimeLine()
 * @model
 * @generated
 */
public interface ObjectWithTimeLine extends EObject {
	/**
	 * Returns the value of the '<em><b>Timeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeline</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeline</em>' reference.
	 * @see #setTimeline(TimeLine)
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getObjectWithTimeLine_Timeline()
	 * @model required="true"
	 * @generated
	 */
	TimeLine getTimeline();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.ObjectWithTimeLine#getTimeline <em>Timeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeline</em>' reference.
	 * @see #getTimeline()
	 * @generated
	 */
	void setTimeline(TimeLine value);

	/**
	 * Returns the value of the '<em><b>Buckets</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.time.discrete.ObjectTimeBucket}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buckets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buckets</em>' containment reference list.
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getObjectWithTimeLine_Buckets()
	 * @model containment="true"
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
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getObjectWithTimeLine_LastBucket()
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
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getObjectWithTimeLine_FirstBucket()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void init(TimeBucket start, TimeBucket secondBucket);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ObjectTimeBucket getBucket(TimeBucket bucket);

} // ObjectWithTimeLine
