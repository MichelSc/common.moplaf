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
/**
 */
package solverjacop.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorCons;
import com.misc.common.moplaf.solver.GeneratorCpCons;
import com.misc.common.moplaf.solver.GeneratorCpLinear;
import com.misc.common.moplaf.solver.GeneratorCpLinearTerm;
import com.misc.common.moplaf.solver.GeneratorCpLogical;
import com.misc.common.moplaf.solver.GeneratorCpLogicalTerm;
import com.misc.common.moplaf.solver.GeneratorCpVar;
import com.misc.common.moplaf.solver.GeneratorCpVarAtomic;
import com.misc.common.moplaf.solver.GeneratorTuple;
import com.misc.common.moplaf.solver.GeneratorVar;
import com.misc.common.moplaf.solver.ITupleVisitor;
import com.misc.common.moplaf.solver.Plugin;
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.SolutionVar;
import com.misc.common.moplaf.solver.impl.SolverCpImpl;

import org.eclipse.emf.ecore.EClass;
import org.jacop.constraints.And;
import org.jacop.constraints.Constraint;
import org.jacop.constraints.Linear;
import org.jacop.constraints.Not;
import org.jacop.constraints.Or;
import org.jacop.constraints.PrimitiveConstraint;
import org.jacop.core.IntVar;
import org.jacop.core.Store;
import org.jacop.search.DepthFirstSearch;
import org.jacop.search.IndomainMin;
import org.jacop.search.InputOrderSelect;
import org.jacop.search.Search;
import org.jacop.search.SelectChoicePoint;
import org.jacop.search.SimpleSolutionListener;
import org.jacop.search.SolutionListener;

import solverjacop.SolverJacop;
import solverjacop.SolverjacopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solver Jacop</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SolverJacopImpl extends SolverCpImpl implements SolverJacop {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolverJacopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverjacopPackage.Literals.SOLVER_JACOP;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Integrates GLPK in the framework
	 * <!-- end-user-doc -->
	 */
    // private declarations
	private Store store;
	private Map<GeneratorCpVar, IntVar> vars;  // or set var?
	private Map<GeneratorCpCons, Constraint> cons;
	private String actualfilepath = null;
	 
	private void releaseCp(){
		// Free memory
		if ( this.store!=null){
			this.store = null;
		}
		this.vars = null;
		this.cons = null;
		
	}

	private Constraint createConstraint(GeneratorCons cpCons){
		Constraint newConstraint = null;
		if ( cpCons instanceof GeneratorCpLinear){
			GeneratorCpLinear linear = (GeneratorCpLinear)cpCons;
			if ( SolverJacopImpl.this.cons.get(linear)==null){
				newConstraint = this.createLinearConstraint(linear);
				SolverJacopImpl.this.cons.put(linear, newConstraint);
			}
		}
		else if ( cpCons instanceof GeneratorCpLogical){
			GeneratorCpLogical logical = (GeneratorCpLogical)cpCons;
			if ( SolverJacopImpl.this.cons.get(logical)==null){
				newConstraint = this.createLogicalConstraint(logical);
				SolverJacopImpl.this.cons.put(logical, newConstraint);
			}
		} 
		else {
			throw new UnsupportedOperationException("Constraint type not supported by solver: "+cpCons.eClass().getName());
		}
		return newConstraint;
	}

	private Constraint createLinearConstraint(GeneratorCpLinear linear){
		int nofTerms = linear.getTerm().size();
		ArrayList<IntVar> jacopVars = new ArrayList<IntVar>(nofTerms);
		ArrayList<Integer> weights  = new ArrayList<Integer>(nofTerms);
		for (GeneratorCpLinearTerm term : linear.getTerm()){
			int coefficient = term.getCoeff();
			GeneratorCpVarAtomic cpvar = term.getCpVar();
			IntVar jacopVar = SolverJacopImpl.this.vars.get(cpvar);
			jacopVars.add(jacopVar);
			weights.add(coefficient);
		}
		String kind = "";
		switch (linear.getType() ) {
	    case ENUM_LITERAL_CP_LINEAR_EQUAL:
			kind = "==";
	        break;
	    case ENUM_LITERAL_CP_LINEAR_NOT_EQUAL:
			kind = "!=";
	        break;
	    case ENUM_LITERAL_CP_LINEAR_SMALLER:
			kind = "<";
	        break;
	    case ENUM_LITERAL_CP_LINEAR_SMALLER_OR_EQUAL:
			kind = "<=";
	        break;
	    case ENUM_LITERAL_CP_LINEAR_BIGGER:
			kind = ">";
	        break;
	    case ENUM_LITERAL_CP_LINEAR_BIGGER_OR_EQUAL:
			kind = ">=";
	        break;
	    };  // switch on constraint type
	    int rhs = linear.getRightHandSide();
	    Linear jacopLinear = new Linear(SolverJacopImpl.this.store,
	    		                        jacopVars, 
	    		                        weights, 
	    		                        kind,
	    		                        rhs);
	    return jacopLinear;
	}
	
	private Constraint createLogicalConstraint(GeneratorCpLogical logical){
		int nofTerms = logical.getTerm().size();
		ArrayList<PrimitiveConstraint> jacopPrimitives = new ArrayList<PrimitiveConstraint>(nofTerms);
		for (GeneratorCpLogicalTerm term : logical.getTerm()){
			boolean negate = term.isNot();
			GeneratorCpCons cpconstraint = term.getCpCons();
			Constraint jacopConstraint = SolverJacopImpl.this.cons.get(cpconstraint);
			if ( jacopConstraint==null ) {
				jacopConstraint = this.createConstraint(cpconstraint);
			}
			if ( jacopConstraint==null){
				throw new UnsupportedOperationException("Constraint could not be created: "+cpconstraint.getCode());
			}
			if ( !(jacopConstraint  instanceof PrimitiveConstraint)) {
				throw new UnsupportedOperationException("Constraint not primitive for a logical: "+cpconstraint.getCode());
			}  
			PrimitiveConstraint jacopPrimitive = (PrimitiveConstraint)jacopConstraint;
			if ( negate ) {
				jacopPrimitive = new Not(jacopPrimitive);
			}
			jacopPrimitives.add(jacopPrimitive);
		}
	    PrimitiveConstraint newConstraint = null;
		switch (logical.getType() ) {
	    case ENUM_LITERAL_CP_LOGICAL_AND:
		    newConstraint = new And(jacopPrimitives);
	        break;
	    case ENUM_LITERAL_CP_LOGICAL_OR:
		    newConstraint = new Or(jacopPrimitives);
	        break;
		}
	    if ( logical.isNot() ){
	    	newConstraint = new Not(newConstraint);
	    }
	    return newConstraint;
	}
	
	private void loadCp(){
		this.releaseCp(); // release the current model, if any
		Generator generator = this.getGenerator();
		if ( generator == null) { return; }
		try {
			// create the store
			this.store = new Store();
			// create the variables
			this.vars = new HashMap<GeneratorCpVar, IntVar>();
			class VarMapper implements ITupleVisitor{
				@Override
				public void visitTuple(GeneratorTuple tuple) {
					for ( GeneratorVar var : tuple.getVar()){
						if ( var  instanceof GeneratorCpVarAtomic){
							GeneratorCpVarAtomic cpvar = (GeneratorCpVarAtomic)var;
							IntVar jacopVar = new IntVar(SolverJacopImpl.this.store, 
									                     cpvar.getCode(), 
									                     cpvar.getLowerBound(),
									                     cpvar.getUpperBound());
							SolverJacopImpl.this.vars.put(cpvar, jacopVar);
						} else {
							throw new UnsupportedOperationException("Variable type not supported by solver: "+var.eClass().getName());
						}
					}
				}
			};
			VarMapper varmapper = new VarMapper();
			generator.visitTuples(varmapper);
			
			// create the constraints
			this.cons = new HashMap<GeneratorCpCons, Constraint>();
			class ConsMapper implements ITupleVisitor{
				@Override
				public void visitTuple(GeneratorTuple tuple) {
					for ( GeneratorCons cpcons : tuple.getCons()){
						SolverJacopImpl.this.createConstraint(cpcons);
					}
				}
			};
			ConsMapper consmapper = new ConsMapper();
			generator.visitTuples(consmapper);

		}
		catch (Exception e) {
			Plugin.INSTANCE.logError("SolverJacop: load failed, reason "+e.getMessage());
			this.releaseCp();
		}
	} // method lp load
	
	@Override
	public ReturnFeedback solveImpl() {

		// load the model
		this.loadCp();
		if ( this.store==null ) { 
			return new ReturnFeedback(false, "SolverJacop.solve: no cp"); 
		}
		
		// post the constraints
		for (Entry<GeneratorCpCons, Constraint> mapEntry : this.cons.entrySet()){
			GeneratorCpCons cpCons = mapEntry.getKey();
			Constraint jacopCons = mapEntry.getValue();
			if ( cpCons.isPost()){
				this.store.impose(jacopCons);
			}
		}

		this.onInitializationEnd();
		
		if ( this.isSolverDump()){
			this.writeCpToFile();
		}
		
		// calculate the order for selecting the vars
		Collection<Map.Entry<GeneratorCpVar, IntVar>> varsCollection = this.vars.entrySet();
		List<Map.Entry<GeneratorCpVar, IntVar>> varsList = new ArrayList<Map.Entry<GeneratorCpVar, IntVar>>( varsCollection);
		Collections.sort( varsList, new Comparator<Map.Entry<GeneratorCpVar, IntVar>>( ){

			@Override
			public int compare(Map.Entry<GeneratorCpVar, IntVar> arg0, Map.Entry<GeneratorCpVar, IntVar> arg1) {
				// decreasing order for sort, so the opposite 
				return -Integer.compare(arg0.getKey().getPriority(), arg1.getKey().getPriority());
			}} );
		
        IntVar[] sortedJacopVars = new IntVar[varsList.size()];
        int currentIndex = 0;
        for (Map.Entry<GeneratorCpVar, IntVar> currentEntry : varsList){
        	sortedJacopVars[currentIndex++] = currentEntry.getValue();
        }
        SelectChoicePoint<IntVar> select =  new InputOrderSelect<IntVar>(this.store, 
								            		                     sortedJacopVars, 
								                                         new IndomainMin<IntVar>()); 
        // solution listener
        SolutionListener<IntVar> thissolutionlistener = new SimpleSolutionListener<IntVar>(){
        	 public boolean executeAfterSolution(Search<IntVar> search, 
        			 SelectChoicePoint<IntVar> select) { 
        		 		boolean stop = super.executeAfterSolution(search, select); 
        		 		Plugin.INSTANCE.logInfo("SolutionListener.executeAfterSolution, stop="+stop);
        				// read the solution
        				Solution newSolution = SolverJacopImpl.this.constructSolution();
        				for ( Map.Entry<GeneratorCpVar, IntVar> varentry : SolverJacopImpl.this.vars.entrySet())	{
        					GeneratorCpVar cpvar = varentry.getKey();
        					IntVar jacopVar = varentry.getValue();
        					int varValue = jacopVar.value();
        					if ( varValue!= 0 ){
        		    			SolutionVar solutionvar = newSolution.constructSolutionVar(cpvar);
        						solutionvar.setOptimalValue(varValue);
        					}
        				} // traverse the vars
        		 	return stop; 
        	 		}  	
        };
        thissolutionlistener.searchAll(this.isSearchAll());
        
        // search for a solution and print results 
        Search<IntVar> search = new DepthFirstSearch<IntVar>();
        search.setSolutionListener(thissolutionlistener);
        boolean result = search.labeling(this.store, select);
        
        this.onSolvingEnd();
 
		boolean feasible   = result;
		boolean unfeasible = !result;
		boolean optimal    = false;
		float value        = 0.0f;
		
		this.setSolFeasible(feasible);
		this.setSolUnfeasible(unfeasible);
		this.setSolOptimal(optimal);
		this.setSolValue(value);
		
		// release the lp
		this.releaseCp();
		
		return ReturnFeedback.SUCCESS;
		
	} // method SolveSolver
	
	void writeCpToFile(){
	}


} //SolverJacopImpl
