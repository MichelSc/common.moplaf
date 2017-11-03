/**
 */
package com.misc.common.moplaf.localsearch;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Improvment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Improvment is supposed to improve a solution. So it receives a solution, that will be modified and be possibly better at the end of the execution.
 * For this, it will execute a set of Actions.
 * An improvment is the unit of execution at the end of which it is evaluated if the current solution is kept or not, and what is the next current solution.
 * The framework will iterate on the improvments. The iterations will limited by a max number of iterations and and maximum duration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.Improvment#getMaxIterations <em>Max Iterations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Improvment#getMaxSeconds <em>Max Seconds</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Improvment#getActions <em>Actions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Improvment#getSolution <em>Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Improvment#getImprovmentsStart <em>Improvments Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Improvment#getImprovmentsEnd <em>Improvments End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Improvment#getIterations <em>Iterations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Improvment#getDurationTotal <em>Duration Total</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Improvment#getDurationAverage <em>Duration Average</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Improvment#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getImprovment()
 * @model abstract="true"
 * @generated
 */
public interface Improvment extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Iterations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Iterations</em>' attribute.
	 * @see #setMaxIterations(int)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getImprovment_MaxIterations()
	 * @model
	 * @generated
	 */
	int getMaxIterations();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Improvment#getMaxIterations <em>Max Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Iterations</em>' attribute.
	 * @see #getMaxIterations()
	 * @generated
	 */
	void setMaxIterations(int value);

	/**
	 * Returns the value of the '<em><b>Max Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Seconds</em>' attribute.
	 * @see #setMaxSeconds(float)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getImprovment_MaxSeconds()
	 * @model
	 * @generated
	 */
	float getMaxSeconds();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Improvment#getMaxSeconds <em>Max Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Seconds</em>' attribute.
	 * @see #getMaxSeconds()
	 * @generated
	 */
	void setMaxSeconds(float value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.localsearch.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getImprovment_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' reference.
	 * @see #setSolution(Solution)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getImprovment_Solution()
	 * @model required="true"
	 * @generated
	 */
	Solution getSolution();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Improvment#getSolution <em>Solution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution</em>' reference.
	 * @see #getSolution()
	 * @generated
	 */
	void setSolution(Solution value);

	/**
	 * Returns the value of the '<em><b>Improvments Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Improvments Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Improvments Start</em>' attribute.
	 * @see #setImprovmentsStart(Date)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getImprovment_ImprovmentsStart()
	 * @model
	 * @generated
	 */
	Date getImprovmentsStart();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Improvment#getImprovmentsStart <em>Improvments Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Improvments Start</em>' attribute.
	 * @see #getImprovmentsStart()
	 * @generated
	 */
	void setImprovmentsStart(Date value);

	/**
	 * Returns the value of the '<em><b>Improvments End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Improvments End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Improvments End</em>' attribute.
	 * @see #setImprovmentsEnd(Date)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getImprovment_ImprovmentsEnd()
	 * @model
	 * @generated
	 */
	Date getImprovmentsEnd();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Improvment#getImprovmentsEnd <em>Improvments End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Improvments End</em>' attribute.
	 * @see #getImprovmentsEnd()
	 * @generated
	 */
	void setImprovmentsEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterations</em>' attribute.
	 * @see #setIterations(int)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getImprovment_Iterations()
	 * @model
	 * @generated
	 */
	int getIterations();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Improvment#getIterations <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterations</em>' attribute.
	 * @see #getIterations()
	 * @generated
	 */
	void setIterations(int value);

	/**
	 * Returns the value of the '<em><b>Duration Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Total</em>' attribute.
	 * @see #setDurationTotal(float)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getImprovment_DurationTotal()
	 * @model
	 * @generated
	 */
	float getDurationTotal();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Improvment#getDurationTotal <em>Duration Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Total</em>' attribute.
	 * @see #getDurationTotal()
	 * @generated
	 */
	void setDurationTotal(float value);

	/**
	 * Returns the value of the '<em><b>Duration Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Average</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Average</em>' attribute.
	 * @see #setDurationAverage(float)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getImprovment_DurationAverage()
	 * @model
	 * @generated
	 */
	float getDurationAverage();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Improvment#getDurationAverage <em>Duration Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Average</em>' attribute.
	 * @see #getDurationAverage()
	 * @generated
	 */
	void setDurationAverage(float value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getImprovment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Improvment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void doIteration();

} // Improvment
