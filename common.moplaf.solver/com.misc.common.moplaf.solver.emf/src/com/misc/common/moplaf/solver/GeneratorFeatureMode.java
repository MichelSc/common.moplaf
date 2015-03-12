/**
 */
package com.misc.common.moplaf.solver;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Feature Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Return the measure how the object is in the scope of the feature mode:
 *  - negative value means not in scope
 *  - zero means perfect in scope
 *  - positive value means in scope
 *  - the bigger the value, the less relevant the Mode for the object
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorFeatureMode#getGenerator <em>Generator</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorFeatureMode#getObjetScope <em>Objet Scope</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorFeatureMode#getCode <em>Code</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorFeatureMode#getERemarks <em>ERemarks</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorFeatureMode()
 * @model
 * @generated
 */
public interface GeneratorFeatureMode extends EObject {
	/**
	 * Returns the value of the '<em><b>Generator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.Generator#getGeneratorFeatureModes <em>Generator Feature Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' reference.
	 * @see #setGenerator(Generator)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorFeatureMode_Generator()
	 * @see com.misc.common.moplaf.solver.Generator#getGeneratorFeatureModes
	 * @model opposite="GeneratorFeatureModes" required="true"
	 * @generated
	 */
	Generator getGenerator();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorFeatureMode#getGenerator <em>Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' reference.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(Generator value);

	/**
	 * Returns the value of the '<em><b>Objet Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objet Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objet Scope</em>' reference.
	 * @see #setObjetScope(GeneratorTuple)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorFeatureMode_ObjetScope()
	 * @model
	 * @generated
	 */
	GeneratorTuple getObjetScope();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorFeatureMode#getObjetScope <em>Objet Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objet Scope</em>' reference.
	 * @see #getObjetScope()
	 * @generated
	 */
	void setObjetScope(GeneratorTuple value);

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
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorFeatureMode_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorFeatureMode#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>ERemarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERemarks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERemarks</em>' attribute.
	 * @see #setERemarks(String)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorFeatureMode_ERemarks()
	 * @model
	 * @generated
	 */
	String getERemarks();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorFeatureMode#getERemarks <em>ERemarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ERemarks</em>' attribute.
	 * @see #getERemarks()
	 * @generated
	 */
	void setERemarks(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int IsObjectInScope(GeneratorTuple object);

} // GeneratorFeatureMode
