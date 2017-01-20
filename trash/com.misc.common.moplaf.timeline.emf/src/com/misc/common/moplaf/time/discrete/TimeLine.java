/**
 */
package com.misc.common.moplaf.time.discrete;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.discrete.TimeLine#getBucketType <em>Bucket Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.TimeLine#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.TimeLine#getTimeZoneID <em>Time Zone ID</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.TimeLine#getLocaleLanguage <em>Locale Language</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.TimeLine#getLocaleCountry <em>Locale Country</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.TimeLine#getHorizonStart <em>Horizon Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.TimeLine#getHorizonEnd <em>Horizon End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.TimeLine#getBuckets <em>Buckets</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.TimeLine#getFirstBucket <em>First Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.TimeLine#getLastBucket <em>Last Bucket</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getTimeLine()
 * @model
 * @generated
 */
public interface TimeLine extends EObject {
	/**
	 * Returns the value of the '<em><b>Bucket Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.time.discrete.BucketType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bucket Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket Type</em>' attribute.
	 * @see com.misc.common.moplaf.time.discrete.BucketType
	 * @see #setBucketType(BucketType)
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getTimeLine_BucketType()
	 * @model
	 * @generated
	 */
	BucketType getBucketType();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.TimeLine#getBucketType <em>Bucket Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bucket Type</em>' attribute.
	 * @see com.misc.common.moplaf.time.discrete.BucketType
	 * @see #getBucketType()
	 * @generated
	 */
	void setBucketType(BucketType value);

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
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getTimeLine_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.TimeLine#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Time Zone ID</b></em>' attribute.
	 * The default value is <code>"Europe/Brussels"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Zone ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Zone ID</em>' attribute.
	 * @see #setTimeZoneID(String)
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getTimeLine_TimeZoneID()
	 * @model default="Europe/Brussels"
	 * @generated
	 */
	String getTimeZoneID();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.TimeLine#getTimeZoneID <em>Time Zone ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Zone ID</em>' attribute.
	 * @see #getTimeZoneID()
	 * @generated
	 */
	void setTimeZoneID(String value);

	/**
	 * Returns the value of the '<em><b>Locale Language</b></em>' attribute.
	 * The default value is <code>"fr"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locale Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locale Language</em>' attribute.
	 * @see #setLocaleLanguage(String)
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getTimeLine_LocaleLanguage()
	 * @model default="fr"
	 * @generated
	 */
	String getLocaleLanguage();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.TimeLine#getLocaleLanguage <em>Locale Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locale Language</em>' attribute.
	 * @see #getLocaleLanguage()
	 * @generated
	 */
	void setLocaleLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Locale Country</b></em>' attribute.
	 * The default value is <code>"BE"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locale Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locale Country</em>' attribute.
	 * @see #setLocaleCountry(String)
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getTimeLine_LocaleCountry()
	 * @model default="BE"
	 * @generated
	 */
	String getLocaleCountry();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.TimeLine#getLocaleCountry <em>Locale Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locale Country</em>' attribute.
	 * @see #getLocaleCountry()
	 * @generated
	 */
	void setLocaleCountry(String value);

	/**
	 * Returns the value of the '<em><b>Horizon Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizon Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizon Start</em>' attribute.
	 * @see #setHorizonStart(Date)
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getTimeLine_HorizonStart()
	 * @model
	 * @generated
	 */
	Date getHorizonStart();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.TimeLine#getHorizonStart <em>Horizon Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizon Start</em>' attribute.
	 * @see #getHorizonStart()
	 * @generated
	 */
	void setHorizonStart(Date value);

	/**
	 * Returns the value of the '<em><b>Horizon End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizon End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizon End</em>' attribute.
	 * @see #setHorizonEnd(Date)
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getTimeLine_HorizonEnd()
	 * @model
	 * @generated
	 */
	Date getHorizonEnd();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.TimeLine#getHorizonEnd <em>Horizon End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizon End</em>' attribute.
	 * @see #getHorizonEnd()
	 * @generated
	 */
	void setHorizonEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Buckets</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.time.discrete.TimeBucket}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.discrete.TimeBucket#getTimeLine <em>Time Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buckets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buckets</em>' containment reference list.
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getTimeLine_Buckets()
	 * @see com.misc.common.moplaf.time.discrete.TimeBucket#getTimeLine
	 * @model opposite="TimeLine" containment="true"
	 * @generated
	 */
	EList<TimeBucket> getBuckets();

	/**
	 * Returns the value of the '<em><b>First Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Bucket</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Bucket</em>' reference.
	 * @see #setFirstBucket(TimeBucket)
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getTimeLine_FirstBucket()
	 * @model
	 * @generated
	 */
	TimeBucket getFirstBucket();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.TimeLine#getFirstBucket <em>First Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Bucket</em>' reference.
	 * @see #getFirstBucket()
	 * @generated
	 */
	void setFirstBucket(TimeBucket value);

	/**
	 * Returns the value of the '<em><b>Last Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Bucket</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Bucket</em>' reference.
	 * @see #setLastBucket(TimeBucket)
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getTimeLine_LastBucket()
	 * @model
	 * @generated
	 */
	TimeBucket getLastBucket();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.discrete.TimeLine#getLastBucket <em>Last Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Bucket</em>' reference.
	 * @see #getLastBucket()
	 * @generated
	 */
	void setLastBucket(TimeBucket value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshHorizon();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.misc.common.moplaf.time.discrete.BucketIterator"
	 * @generated
	 */
	BucketIterator iterator(Date from, Date to, boolean naked);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TimeBucket getBucket(Date sometime);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int getSecondsIntersection(Date from1, Date to1, Date from2, Date to2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TimeBucket createBucket();

	public static Date MIN_DATE = new Date(Long.MIN_VALUE);
	public static Date MAX_DATE = new Date(Long.MAX_VALUE);
	public static int MAX_SECONDS = Integer.MAX_VALUE;

	public class Util{
		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 */
		static public int getSeconds(Date start, Date end) {
			int seconds = 0;
			if ( start==MIN_DATE){
				seconds = MAX_SECONDS;
			}
			else if ( end==MAX_DATE){
				seconds = MAX_SECONDS;
			}
			else {
				long millis = end.getTime()-start.getTime();
				seconds = (int)(millis/1000);
			}
			return seconds;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 */
		static public int getSecondsIntersection(Date from1, Date to1, Date from2, Date to2) {
			Date from = new Date(Math.max(from1.getTime(), from2.getTime()));
			Date to   = new Date(Math.min(to1.getTime(), to2.getTime()));
			int seconds = TimeLine.Util.getSeconds(from,  to);
			return seconds;
		}

	}  // nested class Util
} // TimeLine
