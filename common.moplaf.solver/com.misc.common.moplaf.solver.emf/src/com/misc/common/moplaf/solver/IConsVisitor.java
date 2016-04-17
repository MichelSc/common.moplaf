/**
 */
package com.misc.common.moplaf.solver;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ITuple Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getITupleVisitor()
 */
public interface IConsVisitor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws Exception 
	 * @model
	 * @generated
	 */
	void visitCons(GeneratorCons tuple) throws Exception;
	void visitLpCons(GeneratorLpCons tuple) throws Exception;

} // ITupleVisitor
