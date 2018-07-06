/**
 */
package com.misc.common.moplaf.datatools;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage
 * @generated
 */
public interface DatatoolsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatoolsFactory eINSTANCE = com.misc.common.moplaf.datatools.impl.DatatoolsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Categorizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Categorizer</em>'.
	 * @generated
	 */
	Categorizer createCategorizer();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * Returns a new object of class '<em>Extractor Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extractor Type</em>'.
	 * @generated
	 */
	ExtractorType createExtractorType();

	/**
	 * Returns a new object of class '<em>Extractor Compound</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extractor Compound</em>'.
	 * @generated
	 */
	ExtractorCompound createExtractorCompound();

	/**
	 * Returns a new object of class '<em>Extractor Pipe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extractor Pipe</em>'.
	 * @generated
	 */
	ExtractorPipe createExtractorPipe();

	/**
	 * Returns a new object of class '<em>Extractor Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extractor Union</em>'.
	 * @generated
	 */
	ExtractorUnion createExtractorUnion();

	/**
	 * Returns a new object of class '<em>Extractor Intersection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extractor Intersection</em>'.
	 * @generated
	 */
	ExtractorIntersection createExtractorIntersection();

	/**
	 * Returns a new object of class '<em>Extractor Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extractor Path</em>'.
	 * @generated
	 */
	ExtractorPath createExtractorPath();

	/**
	 * Returns a new object of class '<em>Extractor Ocl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extractor Ocl</em>'.
	 * @generated
	 */
	ExtractorOcl createExtractorOcl();

	/**
	 * Returns a new object of class '<em>Extractor Filter Attribute Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extractor Filter Attribute Int</em>'.
	 * @generated
	 */
	ExtractorFilterAttributeInt createExtractorFilterAttributeInt();

	/**
	 * Returns a new object of class '<em>Extractor Filter Ocl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extractor Filter Ocl</em>'.
	 * @generated
	 */
	ExtractorFilterOcl createExtractorFilterOcl();

	/**
	 * Returns a new object of class '<em>Category Criteria Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category Criteria Structural Feature</em>'.
	 * @generated
	 */
	CategoryCriteriaStructuralFeature createCategoryCriteriaStructuralFeature();

	/**
	 * Returns a new object of class '<em>Category Criteria Ocl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category Criteria Ocl</em>'.
	 * @generated
	 */
	CategoryCriteriaOcl createCategoryCriteriaOcl();

	/**
	 * Returns a new object of class '<em>Columnizer Explicit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Columnizer Explicit</em>'.
	 * @generated
	 */
	ColumnizerExplicit createColumnizerExplicit();

	/**
	 * Returns a new object of class '<em>Columnizer Column Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Columnizer Column Attribute</em>'.
	 * @generated
	 */
	ColumnizerColumnAttribute createColumnizerColumnAttribute();

	/**
	 * Returns a new object of class '<em>Columnizer Column Ocl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Columnizer Column Ocl</em>'.
	 * @generated
	 */
	ColumnizerColumnOcl createColumnizerColumnOcl();

	/**
	 * Returns a new object of class '<em>Navigation Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigation Path</em>'.
	 * @generated
	 */
	NavigationPath createNavigationPath();

	/**
	 * Returns a new object of class '<em>Navigation Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigation Reference</em>'.
	 * @generated
	 */
	NavigationReference createNavigationReference();

	/**
	 * Returns a new object of class '<em>Navigation Downcast</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigation Downcast</em>'.
	 * @generated
	 */
	NavigationDowncast createNavigationDowncast();

	/**
	 * Returns a new object of class '<em>Matcher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matcher</em>'.
	 * @generated
	 */
	Matcher createMatcher();

	/**
	 * Returns a new object of class '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match</em>'.
	 * @generated
	 */
	Match createMatch();

	/**
	 * Returns a new object of class '<em>Data Tools</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Tools</em>'.
	 * @generated
	 */
	DataTools createDataTools();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatatoolsPackage getDatatoolsPackage();

} //DatatoolsFactory
