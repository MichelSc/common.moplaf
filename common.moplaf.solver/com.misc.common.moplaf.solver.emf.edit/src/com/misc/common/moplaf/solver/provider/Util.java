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
package com.misc.common.moplaf.solver.provider;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;

import com.misc.common.moplaf.solver.Solver;
import com.misc.common.moplaf.solver.SolverPackage;

public class Util {

	public static void collectNewChildSolverDescriptors(Collection<Object> newChildDescriptors, Object object, EStructuralFeature feature) {

		EPackage.Registry registry = EPackage.Registry.INSTANCE;
		EClass solverLpClass = SolverPackage.Literals.SOLVER_LP;
		LinkedList<String> uriList = new LinkedList<String>(registry.keySet());
		for ( String  uri : uriList){
			EPackage aPackage = registry.getEPackage(uri);
			EFactory aFactory = registry.getEFactory(uri);
			for ( EClassifier aClassifier : aPackage.getEClassifiers()){
				if ( aClassifier instanceof EClass ){
					EClass aClass = (EClass)aClassifier;
					if ( !aClass.isAbstract() && solverLpClass.isSuperTypeOf(aClass)){
						/*
						Plugin.INSTANCE.logInfo("  concrete candidate"
					                             + aPackage.getClass().getName()
					                             + " : "
					                             + aClass.getName());
						*/
						newChildDescriptors.add(new CommandParameter(null, feature, aFactory.create(aClass)));
					}  // if is solver
				}  // if is class
			}  // traverse classifiers
		} // traverse the packages registered
	}  // method collectNewChildDescriptors
	
	public static void collectNewChildSolverDescriptors2(Collection<Object> newChildDescriptors, Object object, EStructuralFeature feature) {
		EList<Solver> solvers = com.misc.common.moplaf.solver.util.Util.getNewSolvers();
		for ( Solver solver : solvers) {
			newChildDescriptors.add(new CommandParameter(null, feature, solver));
		}
	}  // method collectNewChildDescriptors2
}
