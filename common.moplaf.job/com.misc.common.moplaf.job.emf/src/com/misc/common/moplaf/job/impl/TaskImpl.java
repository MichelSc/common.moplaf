/**
 */
package com.misc.common.moplaf.job.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.job.Doc;
import com.misc.common.moplaf.job.JobFactory;
import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.job.Task;

import com.misc.common.moplaf.job.TaskInput;
import com.misc.common.moplaf.job.TaskOutput;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.impl.TaskImpl#getCloneFeedback <em>Clone Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.TaskImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.TaskImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TaskImpl extends JobImpl implements Task {
	/**
	 * The default value of the '{@link #getCloneFeedback() <em>Clone Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloneFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback CLONE_FEEDBACK_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskInput> inputs;
	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskOutput> outputs;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledFeedback getCloneFeedback() {
		// TODO: implement this method to return the 'Clone Feedback' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskOutput> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentWithInverseEList<TaskOutput>(TaskOutput.class, this, JobPackage.TASK__OUTPUTS, JobPackage.TASK_OUTPUT__PRODUCER);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback isValidInput(Doc doc) {
		if ( doc == null ) {
			return new EnabledFeedback(false, "No input doc");
		} else if ( this.getInputs().stream().anyMatch(d -> d.getDoc()==doc) ) {
			return new EnabledFeedback(false, "No the doc is already an input of this task");
		}
		return EnabledFeedback.NOFEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback isValidOutput(Doc doc) {
		if ( doc == null ) {
			return new EnabledFeedback(false, "No output doc");
		} else if ( this.getOutputs().stream().anyMatch(d -> d.getDoc()==doc) ) {
			return new EnabledFeedback(false, "No the doc is already an output of this task");
		}
		return EnabledFeedback.NOFEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskInput> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentWithInverseEList<TaskInput>(TaskInput.class, this, JobPackage.TASK__INPUTS, JobPackage.TASK_INPUT__CONSUMER);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addInputDoc(Doc doc) {
		TaskInput ref = JobFactory.eINSTANCE.createTaskInput();
		ref.setDoc(doc);
		this.getInputs().add(ref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addInputDocs(EList<Doc> docs) {
		for(Doc doc : docs) {
			this.addInputDoc(doc);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initOutputs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task clone() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addOutputDoc(Doc doc) {
		TaskOutput ref = JobFactory.eINSTANCE.createTaskOutput();
		ref.setDoc(doc);
		this.getOutputs().add(ref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addOutputDocs(EList<Doc> docs) {
		for(Doc doc : docs) {
			this.addOutputDoc(doc);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobPackage.TASK__INPUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputs()).basicAdd(otherEnd, msgs);
			case JobPackage.TASK__OUTPUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobPackage.TASK__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case JobPackage.TASK__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JobPackage.TASK__CLONE_FEEDBACK:
				return getCloneFeedback();
			case JobPackage.TASK__INPUTS:
				return getInputs();
			case JobPackage.TASK__OUTPUTS:
				return getOutputs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JobPackage.TASK__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends TaskInput>)newValue);
				return;
			case JobPackage.TASK__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends TaskOutput>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JobPackage.TASK__INPUTS:
				getInputs().clear();
				return;
			case JobPackage.TASK__OUTPUTS:
				getOutputs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JobPackage.TASK__CLONE_FEEDBACK:
				return CLONE_FEEDBACK_EDEFAULT == null ? getCloneFeedback() != null : !CLONE_FEEDBACK_EDEFAULT.equals(getCloneFeedback());
			case JobPackage.TASK__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case JobPackage.TASK__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JobPackage.TASK___IS_VALID_INPUT__DOC:
				return isValidInput((Doc)arguments.get(0));
			case JobPackage.TASK___IS_VALID_OUTPUT__DOC:
				return isValidOutput((Doc)arguments.get(0));
			case JobPackage.TASK___ADD_INPUT_DOC__DOC:
				addInputDoc((Doc)arguments.get(0));
				return null;
			case JobPackage.TASK___ADD_INPUT_DOCS__ELIST:
				addInputDocs((EList<Doc>)arguments.get(0));
				return null;
			case JobPackage.TASK___INIT_OUTPUTS:
				initOutputs();
				return null;
			case JobPackage.TASK___CLONE:
				return clone();
			case JobPackage.TASK___ADD_OUTPUT_DOC__DOC:
				addOutputDoc((Doc)arguments.get(0));
				return null;
			case JobPackage.TASK___ADD_OUTPUT_DOCS__ELIST:
				addOutputDocs((EList<Doc>)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //TaskImpl
