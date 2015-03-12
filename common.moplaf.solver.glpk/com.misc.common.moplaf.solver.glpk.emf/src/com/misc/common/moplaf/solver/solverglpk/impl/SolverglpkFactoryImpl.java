/**
 */
package com.misc.common.moplaf.solver.solverglpk.impl;

import com.misc.common.moplaf.solver.solverglpk.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SolverglpkFactoryImpl extends EFactoryImpl implements SolverglpkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SolverglpkFactory init() {
		try {
			SolverglpkFactory theSolverglpkFactory = (SolverglpkFactory)EPackage.Registry.INSTANCE.getEFactory(SolverglpkPackage.eNS_URI);
			if (theSolverglpkFactory != null) {
				return theSolverglpkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SolverglpkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverglpkFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SolverglpkPackage.SOLVER_GLPK: return createSolverGLPK();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverGLPK createSolverGLPK() {
		SolverGLPKImpl solverGLPK = new SolverGLPKImpl();
		return solverGLPK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverglpkPackage getSolverglpkPackage() {
		return (SolverglpkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SolverglpkPackage getPackage() {
		return SolverglpkPackage.eINSTANCE;
	}

} //SolverglpkFactoryImpl
