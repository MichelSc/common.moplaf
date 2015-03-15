/**
 */
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.gis.GisDistanceMatrix;
import com.misc.common.moplaf.gis.GisDistanceMatrixCalculator;
import com.misc.common.moplaf.gis.GisPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance Matrix Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GisDistanceMatrixCalculatorImpl extends MinimalEObjectImpl.Container implements GisDistanceMatrixCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisDistanceMatrixCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisPackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void calculate(GisDistanceMatrix matrix) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GisPackage.GIS_DISTANCE_MATRIX_CALCULATOR___CALCULATE__GISDISTANCEMATRIX:
				calculate((GisDistanceMatrix)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GisDistanceMatrixCalculatorImpl
