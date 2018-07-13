/**
 */
package com.misc.common.moplaf.datatools.util;

import com.misc.common.moplaf.datatools.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage
 * @generated
 */
public class DatatoolsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatatoolsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatoolsSwitch() {
		if (modelPackage == null) {
			modelPackage = DatatoolsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DatatoolsPackage.NAVIGATION_PATH: {
				NavigationPath navigationPath = (NavigationPath)theEObject;
				T result = caseNavigationPath(navigationPath);
				if (result == null) result = caseDataTool(navigationPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.NAVIGATION_AXIS: {
				NavigationAxis navigationAxis = (NavigationAxis)theEObject;
				T result = caseNavigationAxis(navigationAxis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.NAVIGATION_REFERENCE: {
				NavigationReference navigationReference = (NavigationReference)theEObject;
				T result = caseNavigationReference(navigationReference);
				if (result == null) result = caseNavigationAxis(navigationReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.NAVIGATION_DOWNCAST: {
				NavigationDowncast navigationDowncast = (NavigationDowncast)theEObject;
				T result = caseNavigationDowncast(navigationDowncast);
				if (result == null) result = caseNavigationAxis(navigationDowncast);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.DATA_TOOLS: {
				DataTools dataTools = (DataTools)theEObject;
				T result = caseDataTools(dataTools);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.DATA_TOOL: {
				DataTool dataTool = (DataTool)theEObject;
				T result = caseDataTool(dataTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.DATA_TOOL_ABSTRACT: {
				DataToolAbstract dataToolAbstract = (DataToolAbstract)theEObject;
				T result = caseDataToolAbstract(dataToolAbstract);
				if (result == null) result = caseDataTool(dataToolAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.EXTRACTOR: {
				Extractor extractor = (Extractor)theEObject;
				T result = caseExtractor(extractor);
				if (result == null) result = caseDataToolAbstract(extractor);
				if (result == null) result = caseDataTool(extractor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.EXTRACTOR_TYPE: {
				ExtractorType extractorType = (ExtractorType)theEObject;
				T result = caseExtractorType(extractorType);
				if (result == null) result = caseExtractor(extractorType);
				if (result == null) result = caseDataToolAbstract(extractorType);
				if (result == null) result = caseDataTool(extractorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.EXTRACTOR_PATH: {
				ExtractorPath extractorPath = (ExtractorPath)theEObject;
				T result = caseExtractorPath(extractorPath);
				if (result == null) result = caseExtractor(extractorPath);
				if (result == null) result = caseNavigationPath(extractorPath);
				if (result == null) result = caseDataToolAbstract(extractorPath);
				if (result == null) result = caseDataTool(extractorPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.EXTRACTOR_OCL: {
				ExtractorOcl extractorOcl = (ExtractorOcl)theEObject;
				T result = caseExtractorOcl(extractorOcl);
				if (result == null) result = caseExtractor(extractorOcl);
				if (result == null) result = caseDataToolAbstract(extractorOcl);
				if (result == null) result = caseDataTool(extractorOcl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.EXTRACTOR_FILTER: {
				ExtractorFilter extractorFilter = (ExtractorFilter)theEObject;
				T result = caseExtractorFilter(extractorFilter);
				if (result == null) result = caseExtractor(extractorFilter);
				if (result == null) result = caseDataToolAbstract(extractorFilter);
				if (result == null) result = caseDataTool(extractorFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.EXTRACTOR_FILTER_ATTRIBUTE: {
				ExtractorFilterAttribute extractorFilterAttribute = (ExtractorFilterAttribute)theEObject;
				T result = caseExtractorFilterAttribute(extractorFilterAttribute);
				if (result == null) result = caseExtractorFilter(extractorFilterAttribute);
				if (result == null) result = caseNavigationPath(extractorFilterAttribute);
				if (result == null) result = caseExtractor(extractorFilterAttribute);
				if (result == null) result = caseDataToolAbstract(extractorFilterAttribute);
				if (result == null) result = caseDataTool(extractorFilterAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.EXTRACTOR_FILTER_ATTRIBUTE_INT: {
				ExtractorFilterAttributeInt extractorFilterAttributeInt = (ExtractorFilterAttributeInt)theEObject;
				T result = caseExtractorFilterAttributeInt(extractorFilterAttributeInt);
				if (result == null) result = caseExtractorFilterAttribute(extractorFilterAttributeInt);
				if (result == null) result = caseExtractorFilter(extractorFilterAttributeInt);
				if (result == null) result = caseNavigationPath(extractorFilterAttributeInt);
				if (result == null) result = caseExtractor(extractorFilterAttributeInt);
				if (result == null) result = caseDataToolAbstract(extractorFilterAttributeInt);
				if (result == null) result = caseDataTool(extractorFilterAttributeInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.EXTRACTOR_FILTER_OCL: {
				ExtractorFilterOcl extractorFilterOcl = (ExtractorFilterOcl)theEObject;
				T result = caseExtractorFilterOcl(extractorFilterOcl);
				if (result == null) result = caseExtractorFilter(extractorFilterOcl);
				if (result == null) result = caseExtractor(extractorFilterOcl);
				if (result == null) result = caseDataToolAbstract(extractorFilterOcl);
				if (result == null) result = caseDataTool(extractorFilterOcl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.EXTRACTOR_COMPOUND: {
				ExtractorCompound extractorCompound = (ExtractorCompound)theEObject;
				T result = caseExtractorCompound(extractorCompound);
				if (result == null) result = caseExtractor(extractorCompound);
				if (result == null) result = caseDataToolAbstract(extractorCompound);
				if (result == null) result = caseDataTool(extractorCompound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.EXTRACTOR_LOGIC: {
				ExtractorLogic extractorLogic = (ExtractorLogic)theEObject;
				T result = caseExtractorLogic(extractorLogic);
				if (result == null) result = caseExtractorCompound(extractorLogic);
				if (result == null) result = caseExtractor(extractorLogic);
				if (result == null) result = caseDataToolAbstract(extractorLogic);
				if (result == null) result = caseDataTool(extractorLogic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.EXTRACTOR_PIPE: {
				ExtractorPipe extractorPipe = (ExtractorPipe)theEObject;
				T result = caseExtractorPipe(extractorPipe);
				if (result == null) result = caseExtractorCompound(extractorPipe);
				if (result == null) result = caseExtractor(extractorPipe);
				if (result == null) result = caseDataToolAbstract(extractorPipe);
				if (result == null) result = caseDataTool(extractorPipe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.EXTRACTOR_UNION: {
				ExtractorUnion extractorUnion = (ExtractorUnion)theEObject;
				T result = caseExtractorUnion(extractorUnion);
				if (result == null) result = caseExtractorLogic(extractorUnion);
				if (result == null) result = caseExtractorCompound(extractorUnion);
				if (result == null) result = caseExtractor(extractorUnion);
				if (result == null) result = caseDataToolAbstract(extractorUnion);
				if (result == null) result = caseDataTool(extractorUnion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.EXTRACTOR_INTERSECTION: {
				ExtractorIntersection extractorIntersection = (ExtractorIntersection)theEObject;
				T result = caseExtractorIntersection(extractorIntersection);
				if (result == null) result = caseExtractorLogic(extractorIntersection);
				if (result == null) result = caseExtractorCompound(extractorIntersection);
				if (result == null) result = caseExtractor(extractorIntersection);
				if (result == null) result = caseDataToolAbstract(extractorIntersection);
				if (result == null) result = caseDataTool(extractorIntersection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.COLUMNIZER: {
				Columnizer columnizer = (Columnizer)theEObject;
				T result = caseColumnizer(columnizer);
				if (result == null) result = caseDataToolAbstract(columnizer);
				if (result == null) result = caseDataTool(columnizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.COLUMNIZER_COLUMN: {
				ColumnizerColumn columnizerColumn = (ColumnizerColumn)theEObject;
				T result = caseColumnizerColumn(columnizerColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.COLUMNIZER_EXPLICIT: {
				ColumnizerExplicit columnizerExplicit = (ColumnizerExplicit)theEObject;
				T result = caseColumnizerExplicit(columnizerExplicit);
				if (result == null) result = caseColumnizer(columnizerExplicit);
				if (result == null) result = caseDataToolAbstract(columnizerExplicit);
				if (result == null) result = caseDataTool(columnizerExplicit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE: {
				ColumnizerColumnAttribute columnizerColumnAttribute = (ColumnizerColumnAttribute)theEObject;
				T result = caseColumnizerColumnAttribute(columnizerColumnAttribute);
				if (result == null) result = caseColumnizerColumn(columnizerColumnAttribute);
				if (result == null) result = caseNavigationPath(columnizerColumnAttribute);
				if (result == null) result = caseDataTool(columnizerColumnAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.COLUMNIZER_COLUMN_OCL: {
				ColumnizerColumnOcl columnizerColumnOcl = (ColumnizerColumnOcl)theEObject;
				T result = caseColumnizerColumnOcl(columnizerColumnOcl);
				if (result == null) result = caseColumnizerColumn(columnizerColumnOcl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.CATEGORIZER: {
				Categorizer categorizer = (Categorizer)theEObject;
				T result = caseCategorizer(categorizer);
				if (result == null) result = caseCategoryAbstract(categorizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.CATEGORY: {
				Category category = (Category)theEObject;
				T result = caseCategory(category);
				if (result == null) result = caseCategoryAbstract(category);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.CATEGORY_CRITERIA: {
				CategoryCriteria categoryCriteria = (CategoryCriteria)theEObject;
				T result = caseCategoryCriteria(categoryCriteria);
				if (result == null) result = caseDataToolAbstract(categoryCriteria);
				if (result == null) result = caseDataTool(categoryCriteria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.CATEGORY_ABSTRACT: {
				CategoryAbstract categoryAbstract = (CategoryAbstract)theEObject;
				T result = caseCategoryAbstract(categoryAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.CATEGORY_CRITERIA_STRUCTURAL_FEATURE: {
				CategoryCriteriaStructuralFeature categoryCriteriaStructuralFeature = (CategoryCriteriaStructuralFeature)theEObject;
				T result = caseCategoryCriteriaStructuralFeature(categoryCriteriaStructuralFeature);
				if (result == null) result = caseCategoryCriteria(categoryCriteriaStructuralFeature);
				if (result == null) result = caseNavigationPath(categoryCriteriaStructuralFeature);
				if (result == null) result = caseDataToolAbstract(categoryCriteriaStructuralFeature);
				if (result == null) result = caseDataTool(categoryCriteriaStructuralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.CATEGORY_CRITERIA_OCL: {
				CategoryCriteriaOcl categoryCriteriaOcl = (CategoryCriteriaOcl)theEObject;
				T result = caseCategoryCriteriaOcl(categoryCriteriaOcl);
				if (result == null) result = caseCategoryCriteria(categoryCriteriaOcl);
				if (result == null) result = caseDataToolAbstract(categoryCriteriaOcl);
				if (result == null) result = caseDataTool(categoryCriteriaOcl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.MATCHER: {
				Matcher matcher = (Matcher)theEObject;
				T result = caseMatcher(matcher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.MATCH: {
				Match match = (Match)theEObject;
				T result = caseMatch(match);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.COLUMNIZER_GRID: {
				ColumnizerGrid columnizerGrid = (ColumnizerGrid)theEObject;
				T result = caseColumnizerGrid(columnizerGrid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Categorizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Categorizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategorizer(Categorizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategory(Category object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Criteria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoryCriteria(CategoryCriteria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extractor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extractor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtractor(Extractor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Columnizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Columnizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnizer(Columnizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoryAbstract(CategoryAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extractor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extractor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtractorType(ExtractorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extractor Compound</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extractor Compound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtractorCompound(ExtractorCompound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extractor Pipe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extractor Pipe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtractorPipe(ExtractorPipe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extractor Logic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extractor Logic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtractorLogic(ExtractorLogic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extractor Union</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extractor Union</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtractorUnion(ExtractorUnion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extractor Intersection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extractor Intersection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtractorIntersection(ExtractorIntersection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extractor Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extractor Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtractorPath(ExtractorPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extractor Ocl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extractor Ocl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtractorOcl(ExtractorOcl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extractor Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extractor Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtractorFilter(ExtractorFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extractor Filter Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extractor Filter Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtractorFilterAttribute(ExtractorFilterAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extractor Filter Attribute Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extractor Filter Attribute Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtractorFilterAttributeInt(ExtractorFilterAttributeInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extractor Filter Ocl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extractor Filter Ocl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtractorFilterOcl(ExtractorFilterOcl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Criteria Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Criteria Structural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoryCriteriaStructuralFeature(CategoryCriteriaStructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Criteria Ocl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Criteria Ocl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoryCriteriaOcl(CategoryCriteriaOcl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Columnizer Explicit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Columnizer Explicit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnizerExplicit(ColumnizerExplicit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Columnizer Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Columnizer Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnizerColumn(ColumnizerColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Columnizer Column Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Columnizer Column Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnizerColumnAttribute(ColumnizerColumnAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Columnizer Column Ocl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Columnizer Column Ocl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnizerColumnOcl(ColumnizerColumnOcl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationPath(NavigationPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationReference(NavigationReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Downcast</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Downcast</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationDowncast(NavigationDowncast object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Axis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Axis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationAxis(NavigationAxis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matcher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matcher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatcher(Matcher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatch(Match object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Columnizer Grid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Columnizer Grid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnizerGrid(ColumnizerGrid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Tools</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Tools</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTools(DataTools object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTool(DataTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Tool Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Tool Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataToolAbstract(DataToolAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DatatoolsSwitch
