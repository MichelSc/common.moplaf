/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
package com.misc.common.moplaf.solver.util;


import com.misc.common.moplaf.solver.EnumLpVarType;
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
	
	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVar(String name, EnumLpVarType type, float lb, float ub){
		GeneratorLpVar var = SolverFactory.eINSTANCE.createGeneratorLpVar();
		var.setName(name);
		var.setType(type);
		var.setLowerBound(lb);
		var.setUpperBound(ub);
		return var;
	}

	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarReal(String name, float lb, float ub){
		GeneratorLpVar var = Util.createGeneratorLpVar(name, EnumLpVarType.ENUM_LITERAL_LP_VAR_REAL, lb ,ub);
		return var;
	}

	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarRealUnbounded(String name){
		GeneratorLpVar var = Util.createGeneratorLpVarReal(name, Float.MIN_VALUE, Float.MAX_VALUE);
		return var;
	}

	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarRealNegativeUnbounded(String name){
		GeneratorLpVar var = Util.createGeneratorLpVarReal(name, Float.MIN_VALUE, 0.0f);
		return var;
	}

	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarRealNegativeBounded(String name, float bound){
		GeneratorLpVar var = Util.createGeneratorLpVarReal(name, bound, 0.0f);
		return var;
	}

	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarRealPositiveUnbounded(String name){
		GeneratorLpVar var = Util.createGeneratorLpVarReal(name, 0.0f, Float.MAX_VALUE);
		return var;
	}
	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarRealPositiveBounded(String name, float bound){
		GeneratorLpVar var = Util.createGeneratorLpVarReal(name, 0.0f, bound);
		return var;
	}
	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarRealBinary(String name){
		GeneratorLpVar var = Util.createGeneratorLpVarReal(name, 0.0f, 1.0f);
		return var;
	}

	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarInteger(String name, float lb, float ub){
		GeneratorLpVar var = Util.createGeneratorLpVar(name, EnumLpVarType.ENUM_LITERAL_LP_VAR_INTEGER, lb ,ub);
		return var;
	}

	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarIntegerUnbounded(String name){
		GeneratorLpVar var = Util.createGeneratorLpVarInteger(name, Float.MIN_VALUE, Float.MAX_VALUE);
		return var;
	}

	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarIntegerNegativeUnbounded(String name){
		GeneratorLpVar var = Util.createGeneratorLpVarInteger(name, Float.MIN_VALUE, 0.0f);
		return var;
	}

	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarIntegerNegativeBounded(String name, float bound){
		GeneratorLpVar var = Util.createGeneratorLpVarInteger(name, bound, 0.0f);
		return var;
	}

	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarIntegerPositiveUnbounded(String name){
		GeneratorLpVar var = Util.createGeneratorLpVarInteger(name, 0.0f, Float.MAX_VALUE);
		return var;
	}
	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarIntegerPositiveBounded(String name, float bound){
		GeneratorLpVar var = Util.createGeneratorLpVarInteger(name, 0.0f, bound);
		return var;
	}
	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarIntegerBinary(String name){
		GeneratorLpVar var = Util.createGeneratorLpVarInteger(name, 0.0f, 1.0f);
		return var;
	}

}

