package com.misc.common.moplaf.solver.util;

import com.misc.common.moplaf.solver.GeneratorLpLinear;
import com.misc.common.moplaf.solver.GeneratorLpTerm;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.SolverFactory;

public class Util {

	/**
	 * Create an new term to the linear. Assume that the var is not yet present in the linear.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	static public GeneratorLpTerm constructTerm(GeneratorLpLinear linear, GeneratorLpVar var, float coef) {
		GeneratorLpTerm term = SolverFactory.eINSTANCE.createGeneratorLpTerm();
		term.setCoeff(coef);
		term.setLpVar(var);
		linear.getLpTerm().add(term);
		return term;
	}
	
	
	/**
	 * Contribute to a term in the linear.
	 * If there is already a term for this var in this linear, its coefficient is augmented with coef.
	 * Otherwise, a new term is constructed.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	static public GeneratorLpTerm contributeTerm(GeneratorLpLinear linear, GeneratorLpVar var, float coef) {
		for ( GeneratorLpTerm term : linear.getLpTerm()){
			if ( term.getLpVar()==var){
				float coefAsIs = term.getCoeff();
				float coefToBe = coefAsIs+coef;
				term.setCoeff(coefToBe);
				return term;
			}
		} // traverse the terms
		return Util.constructTerm(linear, var, coef);
	}
}
