/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.EnumLpVarType;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.SolverPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Lp Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpVarImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpVarImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpVarImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpVarImpl#getObjectiveCoeff <em>Objective Coeff</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratorLpVarImpl extends GeneratorVarImpl implements GeneratorLpVar {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumLpVarType TYPE_EDEFAULT = EnumLpVarType.ENUM_LITERAL_LP_VAR_INTEGER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EnumLpVarType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final float LOWER_BOUND_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected float lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final float UPPER_BOUND_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected float upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectiveCoeff() <em>Objective Coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectiveCoeff()
	 * @generated
	 * @ordered
	 */
	protected static final float OBJECTIVE_COEFF_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getObjectiveCoeff() <em>Objective Coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectiveCoeff()
	 * @generated
	 * @ordered
	 */
	protected float objectiveCoeff = OBJECTIVE_COEFF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorLpVarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR_LP_VAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLpVarType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EnumLpVarType newType) {
		EnumLpVarType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_LP_VAR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(float newLowerBound) {
		float oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_LP_VAR__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(float newUpperBound) {
		float oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_LP_VAR__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getObjectiveCoeff() {
		return objectiveCoeff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectiveCoeff(float newObjectiveCoeff) {
		float oldObjectiveCoeff = objectiveCoeff;
		objectiveCoeff = newObjectiveCoeff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_LP_VAR__OBJECTIVE_COEFF, oldObjectiveCoeff, objectiveCoeff));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.GENERATOR_LP_VAR__TYPE:
				return getType();
			case SolverPackage.GENERATOR_LP_VAR__LOWER_BOUND:
				return getLowerBound();
			case SolverPackage.GENERATOR_LP_VAR__UPPER_BOUND:
				return getUpperBound();
			case SolverPackage.GENERATOR_LP_VAR__OBJECTIVE_COEFF:
				return getObjectiveCoeff();
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
			case SolverPackage.GENERATOR_LP_VAR__TYPE:
				setType((EnumLpVarType)newValue);
				return;
			case SolverPackage.GENERATOR_LP_VAR__LOWER_BOUND:
				setLowerBound((Float)newValue);
				return;
			case SolverPackage.GENERATOR_LP_VAR__UPPER_BOUND:
				setUpperBound((Float)newValue);
				return;
			case SolverPackage.GENERATOR_LP_VAR__OBJECTIVE_COEFF:
				setObjectiveCoeff((Float)newValue);
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
			case SolverPackage.GENERATOR_LP_VAR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SolverPackage.GENERATOR_LP_VAR__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case SolverPackage.GENERATOR_LP_VAR__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case SolverPackage.GENERATOR_LP_VAR__OBJECTIVE_COEFF:
				setObjectiveCoeff(OBJECTIVE_COEFF_EDEFAULT);
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
			case SolverPackage.GENERATOR_LP_VAR__TYPE:
				return type != TYPE_EDEFAULT;
			case SolverPackage.GENERATOR_LP_VAR__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
			case SolverPackage.GENERATOR_LP_VAR__UPPER_BOUND:
				return upperBound != UPPER_BOUND_EDEFAULT;
			case SolverPackage.GENERATOR_LP_VAR__OBJECTIVE_COEFF:
				return objectiveCoeff != OBJECTIVE_COEFF_EDEFAULT;
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
		result.append(" (Type: ");
		result.append(type);
		result.append(", LowerBound: ");
		result.append(lowerBound);
		result.append(", UpperBound: ");
		result.append(upperBound);
		result.append(", ObjectiveCoeff: ");
		result.append(objectiveCoeff);
		result.append(')');
		return result.toString();
	}

} //GeneratorLpVarImpl
