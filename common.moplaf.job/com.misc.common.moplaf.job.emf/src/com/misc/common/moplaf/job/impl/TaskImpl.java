/**
 */
package com.misc.common.moplaf.job.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.job.Doc;
import com.misc.common.moplaf.job.JobFactory;
import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.job.KeyIndicator;
import com.misc.common.moplaf.job.KeyIndicatorsHolder;
import com.misc.common.moplaf.job.Task;

import com.misc.common.moplaf.job.TaskInput;
import com.misc.common.moplaf.job.TaskOutput;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
 *   <li>{@link com.misc.common.moplaf.job.impl.TaskImpl#getIndicators <em>Indicators</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.TaskImpl#getCloneFeedback <em>Clone Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.TaskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.TaskImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.TaskImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TaskImpl extends RunImpl implements Task {
	/**
	 * The cached value of the '{@link #getIndicators() <em>Indicators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicators()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyIndicator> indicators;
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "<new Task>";
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
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
	public EList<KeyIndicator> getIndicators() {
		if (indicators == null) {
			indicators = new EObjectContainmentEList<KeyIndicator>(KeyIndicator.class, this, JobPackage.TASK__INDICATORS);
		}
		return indicators;
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
	 * @generated
	 */
	public String getDescription() {
		// TODO: implement this method to return the 'Description' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.TASK__NAME, oldName, name));
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
	public KeyIndicator getKeyIndicator(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyIndicator getOrCreateKeyIndicator(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyIndicator updateKeyIndicator(String name, double value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refreshKeyIndicators() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case JobPackage.TASK__INDICATORS:
				return ((InternalEList<?>)getIndicators()).basicRemove(otherEnd, msgs);
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
			case JobPackage.TASK__INDICATORS:
				return getIndicators();
			case JobPackage.TASK__CLONE_FEEDBACK:
				return getCloneFeedback();
			case JobPackage.TASK__DESCRIPTION:
				return getDescription();
			case JobPackage.TASK__NAME:
				return getName();
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
			case JobPackage.TASK__INDICATORS:
				getIndicators().clear();
				getIndicators().addAll((Collection<? extends KeyIndicator>)newValue);
				return;
			case JobPackage.TASK__NAME:
				setName((String)newValue);
				return;
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
			case JobPackage.TASK__INDICATORS:
				getIndicators().clear();
				return;
			case JobPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
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
			case JobPackage.TASK__INDICATORS:
				return indicators != null && !indicators.isEmpty();
			case JobPackage.TASK__CLONE_FEEDBACK:
				return CLONE_FEEDBACK_EDEFAULT == null ? getCloneFeedback() != null : !CLONE_FEEDBACK_EDEFAULT.equals(getCloneFeedback());
			case JobPackage.TASK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case JobPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == KeyIndicatorsHolder.class) {
			switch (derivedFeatureID) {
				case JobPackage.TASK__INDICATORS: return JobPackage.KEY_INDICATORS_HOLDER__INDICATORS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == KeyIndicatorsHolder.class) {
			switch (baseFeatureID) {
				case JobPackage.KEY_INDICATORS_HOLDER__INDICATORS: return JobPackage.TASK__INDICATORS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == KeyIndicatorsHolder.class) {
			switch (baseOperationID) {
				case JobPackage.KEY_INDICATORS_HOLDER___GET_KEY_INDICATOR__STRING: return JobPackage.TASK___GET_KEY_INDICATOR__STRING;
				case JobPackage.KEY_INDICATORS_HOLDER___GET_OR_CREATE_KEY_INDICATOR__STRING: return JobPackage.TASK___GET_OR_CREATE_KEY_INDICATOR__STRING;
				case JobPackage.KEY_INDICATORS_HOLDER___UPDATE_KEY_INDICATOR__STRING_DOUBLE: return JobPackage.TASK___UPDATE_KEY_INDICATOR__STRING_DOUBLE;
				case JobPackage.KEY_INDICATORS_HOLDER___REFRESH_KEY_INDICATORS: return JobPackage.TASK___REFRESH_KEY_INDICATORS;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case JobPackage.TASK___GET_KEY_INDICATOR__STRING:
				return getKeyIndicator((String)arguments.get(0));
			case JobPackage.TASK___GET_OR_CREATE_KEY_INDICATOR__STRING:
				return getOrCreateKeyIndicator((String)arguments.get(0));
			case JobPackage.TASK___UPDATE_KEY_INDICATOR__STRING_DOUBLE:
				return updateKeyIndicator((String)arguments.get(0), (Double)arguments.get(1));
			case JobPackage.TASK___REFRESH_KEY_INDICATORS:
				refreshKeyIndicators();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
