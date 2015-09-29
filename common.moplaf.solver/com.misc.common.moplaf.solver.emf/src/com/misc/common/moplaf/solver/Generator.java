/**
 */
package com.misc.common.moplaf.solver;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator</b></em>'.
 * 
 * <p>
 * A Generator is a problem formulation (linear, constraints, ...), containing variables ({@link GeneratorVar}) and constraints ({@link GeneratorCons}).
 * <p>
 * {@link SolutionProvider}s (typically, solvers) will produce {@link Solution}s for this problem formulation.
 * <p>
 * A Generator is structured as follows:  
 * <ul>
 *   <li>a {@link Generator} is a set of trees (a fores) of tuples: {@link GeneratorTuple}</li>
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
 *   <li>a helper allowing to traverse all the tuples: interface {@link ITupleVisitor} and method {@link #visitTuples(ITupleVisitor)}</li>
 *   <li>helpers to construct itself: methods {@link #generateTuples()} and {@link #generateRootTuples()} </li>
 *   <li>helpers to construct the variables and the constraints: methods {@link #generateVars()} and {@link #generateCons()} </li>
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
 *   <li>{@link com.misc.common.moplaf.solver.Generator#getGeneratorFeatureModes <em>Generator Feature Modes</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Generator#getObjectiveType <em>Objective Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Generator#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Generator#getFootprintNofVars <em>Footprint Nof Vars</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Generator#getFootprintNofCons <em>Footprint Nof Cons</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Generator#getFootprintNofTerms <em>Footprint Nof Terms</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Generator#isCountCons <em>Count Cons</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Generator#isCountVars <em>Count Vars</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Generator#getELpVarCount <em>ELp Var Count</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Generator#getELpConsCount <em>ELp Cons Count</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Generator#getCode <em>Code</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Generator#getSolutionProvider <em>Solution Provider</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Generator#getSelected <em>Selected</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGenerator()
 * @model abstract="true"
 * @generated
 */
public interface Generator extends EObject {
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
	 * Returns the value of the '<em><b>Objective Type</b></em>' attribute.
	 * The default value is <code>"Maximum"</code>.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.solver.EnumObjectiveType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objective Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective Type</em>' attribute.
	 * @see com.misc.common.moplaf.solver.EnumObjectiveType
	 * @see #setObjectiveType(EnumObjectiveType)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGenerator_ObjectiveType()
	 * @model default="Maximum"
	 * @generated
	 */
	EnumObjectiveType getObjectiveType();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Generator#getObjectiveType <em>Objective Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective Type</em>' attribute.
	 * @see com.misc.common.moplaf.solver.EnumObjectiveType
	 * @see #getObjectiveType()
	 * @generated
	 */
	void setObjectiveType(EnumObjectiveType value);

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
	 * Returns the value of the '<em><b>Count Cons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count Cons</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Cons</em>' attribute.
	 * @see #setCountCons(boolean)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGenerator_CountCons()
	 * @model
	 * @generated
	 */
	boolean isCountCons();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Generator#isCountCons <em>Count Cons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Cons</em>' attribute.
	 * @see #isCountCons()
	 * @generated
	 */
	void setCountCons(boolean value);

	/**
	 * Returns the value of the '<em><b>Count Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count Vars</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Vars</em>' attribute.
	 * @see #setCountVars(boolean)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGenerator_CountVars()
	 * @model
	 * @generated
	 */
	boolean isCountVars();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Generator#isCountVars <em>Count Vars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Vars</em>' attribute.
	 * @see #isCountVars()
	 * @generated
	 */
	void setCountVars(boolean value);

	/**
	 * Returns the value of the '<em><b>ELp Var Count</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.GeneratorLpVarCount#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ELp Var Count</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ELp Var Count</em>' containment reference.
	 * @see #setELpVarCount(GeneratorLpVarCount)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGenerator_ELpVarCount()
	 * @see com.misc.common.moplaf.solver.GeneratorLpVarCount#getGenerator
	 * @model opposite="Generator" containment="true"
	 * @generated
	 */
	GeneratorLpVarCount getELpVarCount();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Generator#getELpVarCount <em>ELp Var Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ELp Var Count</em>' containment reference.
	 * @see #getELpVarCount()
	 * @generated
	 */
	void setELpVarCount(GeneratorLpVarCount value);

	/**
	 * Returns the value of the '<em><b>ELp Cons Count</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.GeneratorLpConsCount#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ELp Cons Count</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ELp Cons Count</em>' containment reference.
	 * @see #setELpConsCount(GeneratorLpConsCount)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGenerator_ELpConsCount()
	 * @see com.misc.common.moplaf.solver.GeneratorLpConsCount#getGenerator
	 * @model opposite="Generator" containment="true"
	 * @generated
	 */
	GeneratorLpConsCount getELpConsCount();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Generator#getELpConsCount <em>ELp Cons Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ELp Cons Count</em>' containment reference.
	 * @see #getELpConsCount()
	 * @generated
	 */
	void setELpConsCount(GeneratorLpConsCount value);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generateRootTuples();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generateTuples();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generateVars();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generateCons();

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
