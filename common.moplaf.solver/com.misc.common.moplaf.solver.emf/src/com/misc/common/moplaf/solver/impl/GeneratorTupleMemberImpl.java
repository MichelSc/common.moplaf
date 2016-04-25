/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.GeneratorTuple;
import com.misc.common.moplaf.solver.GeneratorTupleMember;
import com.misc.common.moplaf.solver.SolverPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Tuple Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorTupleMemberImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorTupleMemberImpl#getTuple <em>Tuple</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorTupleMemberImpl#getSelectedSolutionDisplay <em>Selected Solution Display</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorTupleMemberImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GeneratorTupleMemberImpl extends GeneratorElementImpl implements GeneratorTupleMember {
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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorTupleMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR_TUPLE_MEMBER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_TUPLE_MEMBER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_TUPLE_MEMBER__SELECTED_SOLUTION_DISPLAY, oldSelectedSolutionDisplay, selectedSolutionDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getLabel() {
		String label =  this.getSelectedSolutionDisplay();
		if ( label != null) { return label; }
		
		return this.getCode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshSelectedSolution() {
		String displaySelectedSolution = this.getCode();
		this.setSelectedSolutionDisplay(displaySelectedSolution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.GENERATOR_TUPLE_MEMBER__NAME:
				return getName();
			case SolverPackage.GENERATOR_TUPLE_MEMBER__TUPLE:
				if (resolve) return getTuple();
				return basicGetTuple();
			case SolverPackage.GENERATOR_TUPLE_MEMBER__SELECTED_SOLUTION_DISPLAY:
				return getSelectedSolutionDisplay();
			case SolverPackage.GENERATOR_TUPLE_MEMBER__LABEL:
				return getLabel();
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
			case SolverPackage.GENERATOR_TUPLE_MEMBER__NAME:
				setName((String)newValue);
				return;
			case SolverPackage.GENERATOR_TUPLE_MEMBER__SELECTED_SOLUTION_DISPLAY:
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
			case SolverPackage.GENERATOR_TUPLE_MEMBER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SolverPackage.GENERATOR_TUPLE_MEMBER__SELECTED_SOLUTION_DISPLAY:
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
			case SolverPackage.GENERATOR_TUPLE_MEMBER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SolverPackage.GENERATOR_TUPLE_MEMBER__TUPLE:
				return basicGetTuple() != null;
			case SolverPackage.GENERATOR_TUPLE_MEMBER__SELECTED_SOLUTION_DISPLAY:
				return SELECTED_SOLUTION_DISPLAY_EDEFAULT == null ? selectedSolutionDisplay != null : !SELECTED_SOLUTION_DISPLAY_EDEFAULT.equals(selectedSolutionDisplay);
			case SolverPackage.GENERATOR_TUPLE_MEMBER__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
		}
		return super.eIsSet(featureID);
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

} //GeneratorTupleMemberImpl
