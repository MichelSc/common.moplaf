/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
package com.misc.common.moplaf.solver.util;


import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.misc.common.moplaf.job.util.RunFactory;
import com.misc.common.moplaf.solver.EnumLpVarType;
import com.misc.common.moplaf.solver.GeneratorLpLinear;
import com.misc.common.moplaf.solver.GeneratorLpTerm;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.Plugin;
import com.misc.common.moplaf.solver.Solver;
import com.misc.common.moplaf.solver.SolverFactory;

public class Util {

	/**
	 * Create an new term to the linear. Assume that the var is not yet present in the linear.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	static public GeneratorLpTerm constructTerm(GeneratorLpLinear linear, GeneratorLpVar var, double coef) {
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
	static public GeneratorLpTerm contributeTerm(GeneratorLpLinear linear, GeneratorLpVar var, double coef) {
		for ( GeneratorLpTerm term : linear.getLpTerm()){
			if ( term.getLpVar()==var){
				double coefAsIs = term.getCoeff();
				double coefToBe = coefAsIs+coef;
				term.setCoeff(coefToBe);
				return term;
			}
		} // traverse the terms
		return Util.constructTerm(linear, var, coef);
	}
	
	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVar(String name, EnumLpVarType type, double lb, double ub){
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
	static public GeneratorLpVar createGeneratorLpVarReal(String name, double lb, double ub){
		GeneratorLpVar var = Util.createGeneratorLpVar(name, EnumLpVarType.ENUM_LITERAL_LP_VAR_REAL, lb ,ub);
		return var;
	}

	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarRealUnbounded(String name){
		GeneratorLpVar var = Util.createGeneratorLpVarReal(name, Double.MIN_VALUE, Double.MAX_VALUE);
		return var;
	}

	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarRealNegativeUnbounded(String name){
		GeneratorLpVar var = Util.createGeneratorLpVarReal(name, Double.MIN_VALUE, 0.0d);
		return var;
	}

	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarRealNegativeBounded(String name, double bound){
		GeneratorLpVar var = Util.createGeneratorLpVarReal(name, bound, 0.0d);
		return var;
	}

	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarRealPositiveUnbounded(String name){
		GeneratorLpVar var = Util.createGeneratorLpVarReal(name, 0.0d, Double.MAX_VALUE);
		return var;
	}
	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarRealPositiveBounded(String name, double bound){
		GeneratorLpVar var = Util.createGeneratorLpVarReal(name, 0.0d, bound);
		return var;
	}
	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarRealBinary(String name){
		GeneratorLpVar var = Util.createGeneratorLpVarReal(name, 0.0d, 1.0d);
		return var;
	}

	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarInteger(String name, double lb, double ub){
		GeneratorLpVar var = Util.createGeneratorLpVar(name, EnumLpVarType.ENUM_LITERAL_LP_VAR_INTEGER, lb ,ub);
		return var;
	}

	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarIntegerUnbounded(String name){
		GeneratorLpVar var = Util.createGeneratorLpVarInteger(name, Double.MIN_VALUE, Double.MAX_VALUE);
		return var;
	}

	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarIntegerNegativeUnbounded(String name){
		GeneratorLpVar var = Util.createGeneratorLpVarInteger(name, Double.MIN_VALUE, 0.0d);
		return var;
	}

	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarIntegerNegativeBounded(String name, double bound){
		GeneratorLpVar var = Util.createGeneratorLpVarInteger(name, bound, 0.0d);
		return var;
	}

	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarIntegerPositiveUnbounded(String name){
		GeneratorLpVar var = Util.createGeneratorLpVarInteger(name, 0.0d, Double.MAX_VALUE);
		return var;
	}
	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarIntegerPositiveBounded(String name, double bound){
		GeneratorLpVar var = Util.createGeneratorLpVarInteger(name, 0.0d, bound);
		return var;
	}
	/**
	 * 
	 */
	static public GeneratorLpVar createGeneratorLpVarIntegerBinary(String name){
		GeneratorLpVar var = Util.createGeneratorLpVarInteger(name, 0.0d, 1.0d);
		return var;
	}
	
	/**
	 * 
	 * @param solver_factory_id
	 * @return
	 */
	static public Solver constructSolver(String solver_factory_id) {
		
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = reg.getConfigurationElementsFor("com.misc.common.moplaf.solver.emf.solver_factory");
		for ( IConfigurationElement element : elements){
			// check the extension id 
			String extension_id = element.getDeclaringExtension().getUniqueIdentifier();
			String element_id = element.getAttribute("id");
			String this_element_full_id = extension_id == null ? "" : extension_id;
			if ( element_id != null ) {
				if ( this_element_full_id.length()>0 ) {
					this_element_full_id += ".";
				}
				this_element_full_id += element_id;
			}
			if ( this_element_full_id.contentEquals(solver_factory_id)) {
				Object value;
				try {
					value = element.createExecutableExtension("class");
				} catch (CoreException e) {
					String message = String.format("Util.constructSolver, factory %s, creating the class, exception %s", solver_factory_id, e.getMessage());
					Plugin.INSTANCE.logError(message);
					return null;
				}
				if ( value instanceof com.misc.common.moplaf.solver.util.SolverFactory ) {
					com.misc.common.moplaf.solver.util.SolverFactory factory = (com.misc.common.moplaf.solver.util.SolverFactory)value;
					return factory.createSolver();
				} else {
					String message = String.format("Util.constructSolver, factory %s returned no SolverFactory, but a %s", solver_factory_id, value.getClass().getName());
					Plugin.INSTANCE.logError(message);
					return null;
				}
			}
		}
		return null;
	}

	static public EList<Solver> getNewSolvers() {
		BasicEList<Solver> list = new BasicEList<Solver>();
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = reg.getConfigurationElementsFor("com.misc.common.moplaf.solver.emf.solver_factory");
		for ( IConfigurationElement element : elements){
			Object value;
			try {
				value = element.createExecutableExtension("class");
				if ( value instanceof RunFactory) {
					Solver newSolver = ((com.misc.common.moplaf.solver.util.SolverFactory)value).createSolver();
					if ( newSolver!=null){
						list.add(newSolver);
					}
				}
			} catch (CoreException e) {
				e.printStackTrace();
				Plugin.INSTANCE.logError("com.misc.common.moplaf.job.Util.getNewSolvers: exception caught "+e.getMessage());
			}
		}
		return list;
	}



}

