package com.misc.common.moplaf.time.discrete;



import java.util.Date;
import java.util.Iterator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PO Time Scale Iterator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link clientserver3.common.POTimeScaleIterator#getBucket <em>Bucket</em>}</li>
 *   <li>{@link clientserver3.common.POTimeScaleIterator#getFromDate <em>From Date</em>}</li>
 *   <li>{@link clientserver3.common.POTimeScaleIterator#getToDate <em>To Date</em>}</li>
 *   <li>{@link clientserver3.common.POTimeScaleIterator#getSeconds <em>Seconds</em>}</li>
 *   <li>{@link clientserver3.common.POTimeScaleIterator#isIsBeforeFirst <em>Is Before First</em>}</li>
 *   <li>{@link clientserver3.common.POTimeScaleIterator#isIsAfterLast <em>Is After Last</em>}</li>
 *   <li>{@link clientserver3.common.POTimeScaleIterator#isIsValid <em>Is Valid</em>}</li>
 *   <li>{@link clientserver3.common.POTimeScaleIterator#getPartFromDate <em>Part From Date</em>}</li>
 *   <li>{@link clientserver3.common.POTimeScaleIterator#getPartToDate <em>Part To Date</em>}</li>
 *   <li>{@link clientserver3.common.POTimeScaleIterator#getPartSeconds <em>Part Seconds</em>}</li>
 *   <li>{@link clientserver3.common.POTimeScaleIterator#getPartInThis <em>Part In This</em>}</li>
 *   <li>{@link clientserver3.common.POTimeScaleIterator#getTimeScale <em>Time Scale</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface BucketIterator extends Iterator<TimeBucket>  {
	/**
	 * Returns the value of the '<em><b>Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bucket</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket</em>' reference.
	 */
	TimeBucket getBucket();

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 */
	Date getFromDate();

	/**
	 * Returns the value of the '<em><b>To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Date</em>' attribute.
	 */
	Date getToDate();

	/**
	 * Returns the value of the '<em><b>Part In This</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part In This</em>' attribute.
	 * @see #setPartInThis(float)
	 * @see clientserver3.common.CommonPackage#getPOTimeScaleIterator_PartInThis()
	 * @model
	 * @generated
	 */
	float getPartInThis();

	/**
	 * Returns the value of the '<em><b>Time Scale</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link clientserver3.common.POTimeScale#getIterators <em>Iterators</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Scale</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Scale</em>' container reference.
	 */
	TimeLine getTimeLine();


	/**
	 * Returns the value of the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seconds</em>' attribute.
	 * @see #setSeconds(int)
	 */
	int getSeconds();

	/**
	 * Returns the value of the '<em><b>Is Before First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Before First</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Before First</em>' attribute.
	 */
	boolean isBeforeFirst();


	/**
	 * Returns the value of the '<em><b>Is After Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is After Last</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is After Last</em>' attribute.
	 */
	boolean isAfterLast();


	/**
	 * Returns the value of the '<em><b>Is Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Valid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Valid</em>' attribute.
	 */
	boolean isValid();

	/**
	 * Returns the value of the '<em><b>Part From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part From Date</em>' attribute.
	 */
	Date getPartFromDate();

	/**
	 * Returns the value of the '<em><b>Part To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part To Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part To Date</em>' attribute.
	 */
	Date getPartToDate();

	/**
	 * Returns the value of the '<em><b>Part Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Seconds</em>' attribute.
	 */
	int getPartSeconds();


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 */
	TimeBucket next();

} // POTimeScaleIterator