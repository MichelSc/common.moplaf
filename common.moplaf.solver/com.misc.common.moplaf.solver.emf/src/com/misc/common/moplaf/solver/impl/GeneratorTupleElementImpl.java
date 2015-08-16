/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.GeneratorTuple;
import com.misc.common.moplaf.solver.GeneratorTupleElement;
import com.misc.common.moplaf.solver.SolverPackage;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Tuple Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorTupleElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorTupleElementImpl#getTuple <em>Tuple</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorTupleElementImpl#getCode <em>Code</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorTupleElementImpl#getSelectedSolutionDisplay <em>Selected Solution Display</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorTupleElementImpl extends GeneratorElementImpl implements GeneratorTupleElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSelectedSolutionDisplay() <em>Selected Solution Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedSolutionDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTED_SOLUTION_DISPLAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelectedSolutionDisplay() <em>Selected Solution Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedSolutionDisplay()
	 * @generated
	 * @ordered
	 */
	protected String selectedSolutionDisplay = SELECTED_SOLUTION_DISPLAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorTupleElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR_TUPLE_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_TUPLE_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorTuple getTuple() {
		GeneratorTuple tuple = basicGetTuple();
		return tuple != null && tuple.eIsProxy() ? (GeneratorTuple)eResolveProxy((InternalEObject)tuple) : tuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GeneratorTuple basicGetTuple() {
		if ( !(this.eContainer() instanceof GeneratorTuple) ){
			throw new UnsupportedOperationException("Container of a tuple element (var or cons) must be a tuple and not : "+this.eContainer().eClass().getName());
		}
		GeneratorTuple tupletobe = (GeneratorTuple)this.eContainer();
		return tupletobe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getCode() {
		GeneratorTuple tuple = this.getTuple();
		String tuplecode = tuple==null ? "null" : tuple.getCode();
		String code = String.format("%2$s(%1$s)", tuplecode, this.getName());
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setCode(String newCode) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelectedSolutionDisplay() {
		return selectedSolutionDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedSolutionDisplay(String newSelectedSolutionDisplay) {
		String oldSelectedSolutionDisplay = selectedSolutionDisplay;
		selectedSolutionDisplay = newSelectedSolutionDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_TUPLE_ELEMENT__SELECTED_SOLUTION_DISPLAY, oldSelectedSolutionDisplay, selectedSolutionDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshSelectedSolution() {
		String displaySelectedSolution = this.getCode();
		this.setSelectedSolutionDisplay(displaySelectedSolution);
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.solver.impl.GeneratorElementImpl#onOwnerChanged()
	 */
	@Override
	public void onOwnerChanged() {
		super.onOwnerChanged();
		this.refreshTuple();
		this.refreshCode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshTuple() {
		/*
		if ( !(this.eContainer() instanceof GeneratorTuple) ){
			throw new UnsupportedOperationException("Container of a tuple element (var or cons) must be a tuple and not : "+this.eContainer().eClass().getName());
		}
		GeneratorTuple tupletobe = (GeneratorTuple)this.eContainer();
		GeneratorTuple tupleasis = this.getTuple();
		if ( tupletobe!=tupleasis){
			if (tupleasis!=null){
				this.onResetTuple(tupleasis);
			}
			if ( tupletobe!=null){
				this.onSetTuple(tupletobe);
			}
			this.setTuple(tupletobe);
		}*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void onSetTuple(GeneratorTuple newTuple) {
		// default does nothing
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void onResetTuple(GeneratorTuple oldTuple) {
		// default does nothing
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshCode() {
		/*
		GeneratorTuple tuple = this.getTuple();
		String tuplecode = tuple==null ? "null" : tuple.getCode();
		String code = String.format("%2$s(%1$s)", tuplecode, this.getName());
		this.setCode(code);
		*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.GENERATOR_TUPLE_ELEMENT__NAME:
				return getName();
			case SolverPackage.GENERATOR_TUPLE_ELEMENT__TUPLE:
				if (resolve) return getTuple();
				return basicGetTuple();
			case SolverPackage.GENERATOR_TUPLE_ELEMENT__CODE:
				return getCode();
			case SolverPackage.GENERATOR_TUPLE_ELEMENT__SELECTED_SOLUTION_DISPLAY:
				return getSelectedSolutionDisplay();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SolverPackage.GENERATOR_TUPLE_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case SolverPackage.GENERATOR_TUPLE_ELEMENT__CODE:
				setCode((String)newValue);
				return;
			case SolverPackage.GENERATOR_TUPLE_ELEMENT__SELECTED_SOLUTION_DISPLAY:
				setSelectedSolutionDisplay((String)newValue);
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
			case SolverPackage.GENERATOR_TUPLE_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SolverPackage.GENERATOR_TUPLE_ELEMENT__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case SolverPackage.GENERATOR_TUPLE_ELEMENT__SELECTED_SOLUTION_DISPLAY:
				setSelectedSolutionDisplay(SELECTED_SOLUTION_DISPLAY_EDEFAULT);
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
			case SolverPackage.GENERATOR_TUPLE_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SolverPackage.GENERATOR_TUPLE_ELEMENT__TUPLE:
				return basicGetTuple() != null;
			case SolverPackage.GENERATOR_TUPLE_ELEMENT__CODE:
				return CODE_EDEFAULT == null ? getCode() != null : !CODE_EDEFAULT.equals(getCode());
			case SolverPackage.GENERATOR_TUPLE_ELEMENT__SELECTED_SOLUTION_DISPLAY:
				return SELECTED_SOLUTION_DISPLAY_EDEFAULT == null ? selectedSolutionDisplay != null : !SELECTED_SOLUTION_DISPLAY_EDEFAULT.equals(selectedSolutionDisplay);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SolverPackage.GENERATOR_TUPLE_ELEMENT___REFRESH_SELECTED_SOLUTION:
				refreshSelectedSolution();
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
		result.append(", SelectedSolutionDisplay: ");
		result.append(selectedSolutionDisplay);
		result.append(')');
		return result.toString();
	}

} //GeneratorTupleElementImpl
