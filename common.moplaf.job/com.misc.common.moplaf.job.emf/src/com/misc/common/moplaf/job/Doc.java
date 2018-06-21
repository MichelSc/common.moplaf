/**
 */
package com.misc.common.moplaf.job;

import com.misc.common.moplaf.common.EnabledFeedback;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.Doc#getCloneFeedback <em>Clone Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.Doc#getFlushFeedback <em>Flush Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.Doc#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.Doc#isLoaded <em>Loaded</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.Doc#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.JobPackage#getDoc()
 * @model abstract="true"
 * @generated
 */
public interface Doc extends KeyIndicators {
	/**
	 * Returns the value of the '<em><b>Clone Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clone Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clone Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.job.JobPackage#getDoc_CloneFeedback()
	 * @model dataType="com.misc.common.moplaf.job.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getCloneFeedback();

	/**
	 * Returns the value of the '<em><b>Flush Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flush Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flush Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.job.JobPackage#getDoc_FlushFeedback()
	 * @model dataType="com.misc.common.moplaf.job.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getFlushFeedback();

	/**
	 * Returns the value of the '<em><b>Refs</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.DocRef}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.DocRef#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refs</em>' reference list.
	 * @see com.misc.common.moplaf.job.JobPackage#getDoc_Refs()
	 * @see com.misc.common.moplaf.job.DocRef#getDoc
	 * @model opposite="Doc"
	 * @generated
	 */
	EList<DocRef> getRefs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Doc clone();

	/**
	 * Returns the value of the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loaded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loaded</em>' attribute.
	 * @see #setLoaded(boolean)
	 * @see com.misc.common.moplaf.job.JobPackage#getDoc_Loaded()
	 * @model
	 * @generated
	 */
	boolean isLoaded();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.Doc#isLoaded <em>Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loaded</em>' attribute.
	 * @see #isLoaded()
	 * @generated
	 */
	void setLoaded(boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.job.JobPackage#getDoc_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void save();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void load();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void flush();

} // Doc
