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
/**
 */
package com.misc.common.moplaf.solver;

import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.job.Run;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator</b></em>'.
 * 
 * <p>
 * A Generator is a problem formulation (linear, constraints, ...), containing 
 * <ul>
 *   <li>a set of variables: {@link GeneratorVar}</li>
 *   <li>a set of constraints:  {@link GeneratorCons}</li>
 *   <li>a set of goals: {@link GeneratorGoal}</li> 
 * </ul>
 * <p>
 * {@link SolutionProvider}s (typically, {@link Solver}s) will produce {@link Solution}s for this problem formulation.
 * <p>
 * A Generator is structured as follows:  
 * <ul>
 *   <li>a {@link Generator} is a set of trees (a forest) of tuples: {@link GeneratorTuple}</li>
 *   <li>a {@link Generator} has  {@link GeneratorTuple} <em>roots</em></li>
 *   <li>a {@link GeneratorTuple} has {@link GeneratorTuple} <em>elements</em> (children) and possibly a {@link GeneratorTuple} <em>container</em> (parent)</li>
 *   <li>a {@link GeneratorTuple}, has : {@link GeneratorTupleMember} <em>members</em></li>
 *   <li>there are two kinds of {@link GeneratorTupleMember}s</li>
 *   <ul>
 *     <li>variables: {@link GeneratorVar}</li>
 *     <li>constraints: {@link GeneratorCons}</li>
 *   </ul>
 * </ul>
 * <p>
 * A generator provides
 * <ul>
 *   <li>a mechanism allowing to traverse all the tuples: 
 *     <ul>
 *     <li>interface {@link ITupleVisitor}</li>
 *     <li>method {@link #visitTuples(ITupleVisitor)}</li>
 *     </ul>
 *   </li>
 *   <li>helpers to construct itself: 
 *       <ul>
 *       <li>method {@link #generateRootTuples()}: generate the roots of the structure</li>
 *       <li>method {@link #generateTuples()}: generate the tuples of the structure, starting from the roots </li>
 *       <li>method {@link #generateTupleXReferences()}: set XReferences after the structure has been built </li>
 *       </ul>
 *   </li>
 *   <li>helpers to construct the variables and the constraints:
 *     <ul>
 *     <li>method {@link #generateVars()}: construct the variables </li>
 *     <li>method {@link #generateCons()}: construct the constraints </li>
 *     <li>method {@link #generateGoals()}: construct the goals</li>
 *     </ul>
 *   </li>
 * </ul>
 * <p>
 * Concrete Generator implementations will 
 * <ul>
 * <li> subclass Generator and GeneratorTuple </li>
 * <li> implement the Generate methods in order to 
 *   <ul>
 *   <li> create the GeneratorTuples, so the structure of the formulation </li>
 *   <li> create the variables and constraints hanging to the elements of this structure </li>
 *   <li> create the goals defined for this formulation </li>
 *   </ul>
 * </li>
 * </ul>
 * <p>
 * A generator may select one solution among its pool of solutions: {@link #setSelected(Solution)}. The selected solution is used to show
 *  properties of this Generator elements for the selected solution.
 * <p>
 * 
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.Generator#getTupleRoot <em>Tuple Root</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Generator#getGoals <em>Goals</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Generator#getGeneratorFeatureModes <em>Generator Feature Modes</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Generator#getSolutionProvider <em>Solution Provider</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Generator#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Generator#getFootprintNofVars <em>Footprint Nof Vars</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Generator#getFootprintNofCons <em>Footprint Nof Cons</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Generator#getFootprintNofTerms <em>Footprint Nof Terms</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Generator#getCode <em>Code</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Generator#getSelected <em>Selected</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGenerator()
 * @model abstract="true"
 * @generated
 */
public interface Generator extends Run {
	/**
	 * Returns the value of the '<em><b>Tuple Root</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.GeneratorTuple}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.GeneratorTuple#getGeneratorAsRoot <em>Generator As Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tuple Root</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuple Root</em>' reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGenerator_TupleRoot()
	 * @see com.misc.common.moplaf.solver.GeneratorTuple#getGeneratorAsRoot
	 * @model opposite="GeneratorAsRoot" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<GeneratorTuple> getTupleRoot();

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remarks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remarks</em>' attribute.
	 * @see #setRemarks(String)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGenerator_Remarks()
	 * @model
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Generator#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

	/**
	 * Returns the value of the '<em><b>Footprint Nof Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footprint Nof Vars</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footprint Nof Vars</em>' attribute.
	 * @see #setFootprintNofVars(int)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGenerator_FootprintNofVars()
	 * @model
	 * @generated
	 */
	int getFootprintNofVars();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Generator#getFootprintNofVars <em>Footprint Nof Vars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footprint Nof Vars</em>' attribute.
	 * @see #getFootprintNofVars()
	 * @generated
	 */
	void setFootprintNofVars(int value);

	/**
	 * Returns the value of the '<em><b>Footprint Nof Cons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footprint Nof Cons</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footprint Nof Cons</em>' attribute.
	 * @see #setFootprintNofCons(int)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGenerator_FootprintNofCons()
	 * @model
	 * @generated
	 */
	int getFootprintNofCons();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Generator#getFootprintNofCons <em>Footprint Nof Cons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footprint Nof Cons</em>' attribute.
	 * @see #getFootprintNofCons()
	 * @generated
	 */
	void setFootprintNofCons(int value);

	/**
	 * Returns the value of the '<em><b>Footprint Nof Terms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footprint Nof Terms</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footprint Nof Terms</em>' attribute.
	 * @see #setFootprintNofTerms(int)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGenerator_FootprintNofTerms()
	 * @model
	 * @generated
	 */
	int getFootprintNofTerms();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Generator#getFootprintNofTerms <em>Footprint Nof Terms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footprint Nof Terms</em>' attribute.
	 * @see #getFootprintNofTerms()
	 * @generated
	 */
	void setFootprintNofTerms(int value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGenerator_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Generator#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Solution Provider</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.SolutionProvider}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution Provider</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution Provider</em>' reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGenerator_SolutionProvider()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<SolutionProvider> getSolutionProvider();

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The '<em>Selected</em>' {@link Solution} is the solution used by the Generator to returns 
	 * information associated to its elements (Vars and Cons) relative to the {@link Solution}.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' reference.
	 * @see #setSelected(Solution)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGenerator_Selected()
	 * @model
	 * @generated
	 */
	Solution getSelected();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Generator#getSelected <em>Selected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' reference.
	 * @see #getSelected()
	 * @generated
	 */
	void setSelected(Solution value);

	/**
	 * Returns the value of the '<em><b>Goals</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.GeneratorGoal}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.GeneratorGoal#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals</em>' reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGenerator_Goals()
	 * @see com.misc.common.moplaf.solver.GeneratorGoal#getGenerator
	 * @model opposite="Generator" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<GeneratorGoal> getGoals();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.misc.common.moplaf.job.ReturnFeedback"
	 * @generated
	 */
	ReturnFeedback generate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.misc.common.moplaf.solver.Exception"
	 * @generated
	 */
	void generateRootTuples() throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.misc.common.moplaf.solver.Exception"
	 * @generated
	 */
	void generateTuples() throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.misc.common.moplaf.solver.Exception"
	 * @generated
	 */
	void generateTupleXReferences() throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.misc.common.moplaf.solver.Exception"
	 * @generated
	 */
	void generateVars() throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.misc.common.moplaf.solver.Exception"
	 * @generated
	 */
	void generateCons() throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.misc.common.moplaf.solver.Exception"
	 * @generated
	 */
	void generateGoals() throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To be implemented by the specialisation for eploiting the solver solution and making a 
	 * domain specific solution
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void acceptSolution(Solution solutionprovider);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	GeneratorFeatureMode selectFeatureMode(GeneratorFeatureMode feature, GeneratorTuple object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.misc.common.moplaf.solver.Exception" visitorDataType="com.misc.common.moplaf.solver.ITupleVisitor"
	 * @generated
	 */
	void visitTuples(ITupleVisitor visitor) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshSelectedSolution();

	/**
	 * Returns the value of the '<em><b>Generator Feature Modes</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.GeneratorFeatureMode}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.GeneratorFeatureMode#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator Feature Modes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator Feature Modes</em>' reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGenerator_GeneratorFeatureModes()
	 * @see com.misc.common.moplaf.solver.GeneratorFeatureMode#getGenerator
	 * @model opposite="Generator"
	 * @generated
	 */
	EList<GeneratorFeatureMode> getGeneratorFeatureModes();

} // Generator
