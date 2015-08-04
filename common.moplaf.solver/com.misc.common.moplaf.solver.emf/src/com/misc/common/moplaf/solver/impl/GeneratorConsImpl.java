/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.GeneratorCons;
import com.misc.common.moplaf.solver.GeneratorTuple;
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.SolutionCons;
import com.misc.common.moplaf.solver.SolverPackage;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Cons</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorConsImpl#getSolution <em>Solution</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GeneratorConsImpl extends GeneratorTupleElementImpl implements GeneratorCons {
	/**
	 * The cached value of the '{@link #getSolution() <em>Solution</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolution()
	 * @generated
	 * @ordered
	 */
	protected EList<SolutionCons> solution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorConsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR_CONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolutionCons> getSolution() {
		if (solution == null) {
			solution = new EObjectWithInverseResolvingEList<SolutionCons>(SolutionCons.class, this, SolverPackage.GENERATOR_CONS__SOLUTION, SolverPackage.SOLUTION_CONS__CONS);
		}
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void generate() {
		// default does nothing
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SolutionCons getSolution(Solution solver) {
		for(SolutionCons currentsol : this.getSolution()) {
			if ( currentsol.getSolution()==solver) {
				return currentsol;
			}
		}
		return null;
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
			case SolverPackage.GENERATOR_CONS__SOLUTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSolution()).basicAdd(otherEnd, msgs);
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
			case SolverPackage.GENERATOR_CONS__SOLUTION:
				return ((InternalEList<?>)getSolution()).basicRemove(otherEnd, msgs);
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
			case SolverPackage.GENERATOR_CONS__SOLUTION:
				return getSolution();
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
			case SolverPackage.GENERATOR_CONS__SOLUTION:
				getSolution().clear();
				getSolution().addAll((Collection<? extends SolutionCons>)newValue);
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
			case SolverPackage.GENERATOR_CONS__SOLUTION:
				getSolution().clear();
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
			case SolverPackage.GENERATOR_CONS__SOLUTION:
				return solution != null && !solution.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.solver.impl.GeneratorTupleElementImpl#onSetTuple(com.misc.common.moplaf.solver.GeneratorTuple)
	 */
	@Override
	public void onSetTuple(GeneratorTuple newTuple) {
		super.onSetTuple(newTuple);
		newTuple.getCons().add(this);
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.solver.impl.GeneratorTupleElementImpl#onResetTuple(com.misc.common.moplaf.solver.GeneratorTuple)
	 */
	@Override
	public void onResetTuple(GeneratorTuple oldTuple) {
		super.onResetTuple(oldTuple);
		super.onSetTuple(oldTuple);
		oldTuple.getCons().remove(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SolverPackage.GENERATOR_CONS___GENERATE:
				generate();
				return null;
			case SolverPackage.GENERATOR_CONS___GET_SOLUTION__SOLUTION:
				return getSolution((Solution)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GeneratorConsImpl
