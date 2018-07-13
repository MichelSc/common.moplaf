/**
 */
package com.misc.common.moplaf.analysis;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.analysis.AnalysisPackage
 * @generated
 */
public interface AnalysisFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnalysisFactory eINSTANCE = com.misc.common.moplaf.analysis.impl.AnalysisFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Doc Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doc Analysis</em>'.
	 * @generated
	 */
	DocAnalysis createDocAnalysis();

	/**
	 * Returns a new object of class '<em>Doc Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doc Comparison</em>'.
	 * @generated
	 */
	DocComparison createDocComparison();

	/**
	 * Returns a new object of class '<em>Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Holder</em>'.
	 * @generated
	 */
	AnalysisHolder createAnalysisHolder();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnalysisPackage getAnalysisPackage();

} //AnalysisFactory
