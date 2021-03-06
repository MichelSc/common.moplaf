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
				if (result == null) result = caseDataToolAbstract(navigationPath);
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
			case DatatoolsPackage.DATA_TOOL_CONTEXT: {
				DataToolContext dataToolContext = (DataToolContext)theEObject;
				T result = caseDataToolContext(dataToolContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.DATA_TOOL: {
				DataTool dataTool = (DataTool)theEObject;
				T result = caseDataTool(dataTool);
				if (result == null) result = caseDataToolAbstract(dataTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.DATA_TOOL_ABSTRACT: {
				DataToolAbstract dataToolAbstract = (DataToolAbstract)theEObject;
				T result = caseDataToolAbstract(dataToolAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.EXTRACTOR: {
				Extractor extractor = (Extractor)theEObject;
				T result = caseExtractor(extractor);
				if (result == null) result = caseDataTool(extractor);
				if (result == null) result = caseDataToolAbstract(extractor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.EXTRACTOR_TYPE: {
				ExtractorType extractorType = (ExtractorType)theEObject;
				T result = caseExtractorType(extractorType);
				if (result == null) result = caseExtractor(extractorType);
				if (result == null) result = caseDataTool(extractorType);
				if (result == null) result = caseDataToolAbstract(extractorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.EXTRACTOR_PATH: {
				ExtractorPath extractorPath = (ExtractorPath)theEObject;
				T result = caseExtractorPath(extractorPath);
				if (result == null) result = caseExtractor(extractorPath);
				if (result == null) result = caseNavigationPath(extractorPath);
				if (result == null) result = caseDataTool(extractorPath);
				if (result == null) result = caseDataToolAbstract(extractorPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.EXTRACTOR_OCL: {
				ExtractorOcl extractorOcl = (ExtractorOcl)theEObject;
				T result = caseExtractorOcl(extractorOcl);
				if (result == null) result = caseExtractor(extractorOcl);
				if (result == null) result = caseDataTool(extractorOcl);
				if (result == null) result = caseDataToolAbstract(extractorOcl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.FILTER: {
				Filter filter = (Filter)theEObject;
				T result = caseFilter(filter);
				if (result == null) result = caseDataToolAbstract(filter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.FILTER_ATTRIBUTE: {
				FilterAttribute filterAttribute = (FilterAttribute)theEObject;
				T result = caseFilterAttribute(filterAttribute);
				if (result == null) result = caseFilter(filterAttribute);
				if (result == null) result = caseNavigationPath(filterAttribute);
				if (result == null) result = caseDataToolAbstract(filterAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.FILTER_ATTRIBUTE_STRING: {
				FilterAttributeString filterAttributeString = (FilterAttributeString)theEObject;
				T result = caseFilterAttributeString(filterAttributeString);
				if (result == null) result = caseFilterAttribute(filterAttributeString);
				if (result == null) result = caseFilter(filterAttributeString);
				if (result == null) result = caseNavigationPath(filterAttributeString);
				if (result == null) result = caseDataToolAbstract(filterAttributeString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.FILTER_REGEX: {
				FilterRegex filterRegex = (FilterRegex)theEObject;
				T result = caseFilterRegex(filterRegex);
				if (result == null) result = caseFilterAttributeString(filterRegex);
				if (result == null) result = caseFilterAttribute(filterRegex);
				if (result == null) result = caseFilter(filterRegex);
				if (result == null) result = caseNavigationPath(filterRegex);
				if (result == null) result = caseDataToolAbstract(filterRegex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.FILTER_ATTRIBUTE_INT: {
				FilterAttributeInt filterAttributeInt = (FilterAttributeInt)theEObject;
				T result = caseFilterAttributeInt(filterAttributeInt);
				if (result == null) result = caseFilterAttribute(filterAttributeInt);
				if (result == null) result = caseFilter(filterAttributeInt);
				if (result == null) result = caseNavigationPath(filterAttributeInt);
				if (result == null) result = caseDataToolAbstract(filterAttributeInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.FILTER_ATTRIBUTE_INT_RANGE: {
				FilterAttributeIntRange filterAttributeIntRange = (FilterAttributeIntRange)theEObject;
				T result = caseFilterAttributeIntRange(filterAttributeIntRange);
				if (result == null) result = caseFilterAttributeInt(filterAttributeIntRange);
				if (result == null) result = caseFilterAttribute(filterAttributeIntRange);
				if (result == null) result = caseFilter(filterAttributeIntRange);
				if (result == null) result = caseNavigationPath(filterAttributeIntRange);
				if (result == null) result = caseDataToolAbstract(filterAttributeIntRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.FILTER_OCL: {
				FilterOcl filterOcl = (FilterOcl)theEObject;
				T result = caseFilterOcl(filterOcl);
				if (result == null) result = caseFilter(filterOcl);
				if (result == null) result = caseDataToolAbstract(filterOcl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.FILTER_COMPOUND: {
				FilterCompound filterCompound = (FilterCompound)theEObject;
				T result = caseFilterCompound(filterCompound);
				if (result == null) result = caseFilter(filterCompound);
				if (result == null) result = caseDataToolContext(filterCompound);
				if (result == null) result = caseDataToolAbstract(filterCompound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.FILTER_AND: {
				FilterAND filterAND = (FilterAND)theEObject;
				T result = caseFilterAND(filterAND);
				if (result == null) result = caseFilterCompound(filterAND);
				if (result == null) result = caseFilter(filterAND);
				if (result == null) result = caseDataToolContext(filterAND);
				if (result == null) result = caseDataToolAbstract(filterAND);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.FILTER_OR: {
				FilterOR filterOR = (FilterOR)theEObject;
				T result = caseFilterOR(filterOR);
				if (result == null) result = caseFilterCompound(filterOR);
				if (result == null) result = caseFilter(filterOR);
				if (result == null) result = caseDataToolContext(filterOR);
				if (result == null) result = caseDataToolAbstract(filterOR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.EXTRACTOR_COMPOUND: {
				ExtractorCompound extractorCompound = (ExtractorCompound)theEObject;
				T result = caseExtractorCompound(extractorCompound);
				if (result == null) result = caseExtractor(extractorCompound);
				if (result == null) result = caseDataToolContext(extractorCompound);
				if (result == null) result = caseDataTool(extractorCompound);
				if (result == null) result = caseDataToolAbstract(extractorCompound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.EXTRACTOR_LOGIC: {
				ExtractorLogic extractorLogic = (ExtractorLogic)theEObject;
				T result = caseExtractorLogic(extractorLogic);
				if (result == null) result = caseExtractorCompound(extractorLogic);
				if (result == null) result = caseExtractor(extractorLogic);
				if (result == null) result = caseDataToolContext(extractorLogic);
				if (result == null) result = caseDataTool(extractorLogic);
				if (result == null) result = caseDataToolAbstract(extractorLogic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.EXTRACTOR_PIPE: {
				ExtractorPipe extractorPipe = (ExtractorPipe)theEObject;
				T result = caseExtractorPipe(extractorPipe);
				if (result == null) result = caseExtractorCompound(extractorPipe);
				if (result == null) result = caseExtractor(extractorPipe);
				if (result == null) result = caseDataToolContext(extractorPipe);
				if (result == null) result = caseDataTool(extractorPipe);
				if (result == null) result = caseDataToolAbstract(extractorPipe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.EXTRACTOR_UNION: {
				ExtractorUnion extractorUnion = (ExtractorUnion)theEObject;
				T result = caseExtractorUnion(extractorUnion);
				if (result == null) result = caseExtractorLogic(extractorUnion);
				if (result == null) result = caseExtractorCompound(extractorUnion);
				if (result == null) result = caseExtractor(extractorUnion);
				if (result == null) result = caseDataToolContext(extractorUnion);
				if (result == null) result = caseDataTool(extractorUnion);
				if (result == null) result = caseDataToolAbstract(extractorUnion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.EXTRACTOR_INTERSECTION: {
				ExtractorIntersection extractorIntersection = (ExtractorIntersection)theEObject;
				T result = caseExtractorIntersection(extractorIntersection);
				if (result == null) result = caseExtractorLogic(extractorIntersection);
				if (result == null) result = caseExtractorCompound(extractorIntersection);
				if (result == null) result = caseExtractor(extractorIntersection);
				if (result == null) result = caseDataToolContext(extractorIntersection);
				if (result == null) result = caseDataTool(extractorIntersection);
				if (result == null) result = caseDataToolAbstract(extractorIntersection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.COLUMNIZERS: {
				Columnizers columnizers = (Columnizers)theEObject;
				T result = caseColumnizers(columnizers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.COLUMNIZER_ABSTRACT: {
				ColumnizerAbstract columnizerAbstract = (ColumnizerAbstract)theEObject;
				T result = caseColumnizerAbstract(columnizerAbstract);
				if (result == null) result = caseDataTool(columnizerAbstract);
				if (result == null) result = caseDataToolAbstract(columnizerAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.COLUMNIZER: {
				Columnizer columnizer = (Columnizer)theEObject;
				T result = caseColumnizer(columnizer);
				if (result == null) result = caseColumnizerAbstract(columnizer);
				if (result == null) result = caseDataTool(columnizer);
				if (result == null) result = caseDataToolAbstract(columnizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.COLUMNIZER_COLUMN: {
				ColumnizerColumn columnizerColumn = (ColumnizerColumn)theEObject;
				T result = caseColumnizerColumn(columnizerColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE: {
				ColumnizerColumnAttribute columnizerColumnAttribute = (ColumnizerColumnAttribute)theEObject;
				T result = caseColumnizerColumnAttribute(columnizerColumnAttribute);
				if (result == null) result = caseNavigationPath(columnizerColumnAttribute);
				if (result == null) result = caseColumnizerColumn(columnizerColumnAttribute);
				if (result == null) result = caseDataToolAbstract(columnizerColumnAttribute);
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
			case DatatoolsPackage.CATEGORY_FACTORY: {
				CategoryFactory categoryFactory = (CategoryFactory)theEObject;
				T result = caseCategoryFactory(categoryFactory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.CATEGORY_ABSTRACT: {
				CategoryAbstract categoryAbstract = (CategoryAbstract)theEObject;
				T result = caseCategoryAbstract(categoryAbstract);
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
			case DatatoolsPackage.CATEGORIZER: {
				Categorizer categorizer = (Categorizer)theEObject;
				T result = caseCategorizer(categorizer);
				if (result == null) result = caseDataTool(categorizer);
				if (result == null) result = caseDataToolAbstract(categorizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE: {
				CategorizerStructuralFeature categorizerStructuralFeature = (CategorizerStructuralFeature)theEObject;
				T result = caseCategorizerStructuralFeature(categorizerStructuralFeature);
				if (result == null) result = caseCategorizer(categorizerStructuralFeature);
				if (result == null) result = caseNavigationPath(categorizerStructuralFeature);
				if (result == null) result = caseDataTool(categorizerStructuralFeature);
				if (result == null) result = caseDataToolAbstract(categorizerStructuralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.CATEGORIZER_OCL: {
				CategorizerOcl categorizerOcl = (CategorizerOcl)theEObject;
				T result = caseCategorizerOcl(categorizerOcl);
				if (result == null) result = caseCategorizer(categorizerOcl);
				if (result == null) result = caseDataTool(categorizerOcl);
				if (result == null) result = caseDataToolAbstract(categorizerOcl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatoolsPackage.CATEGORIZER_SUBJECT: {
				CategorizerSubject categorizerSubject = (CategorizerSubject)theEObject;
				T result = caseCategorizerSubject(categorizerSubject);
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
	 * Returns the result of interpreting the object as an instance of '<em>Categorizer Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Categorizer Structural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategorizerStructuralFeature(CategorizerStructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Categorizer Ocl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Categorizer Ocl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategorizerOcl(CategorizerOcl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Categorizer Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Categorizer Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategorizerSubject(CategorizerSubject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoryFactory(CategoryFactory object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Columnizer Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Columnizer Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnizerAbstract(ColumnizerAbstract object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilter(Filter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterAttribute(FilterAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Attribute String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Attribute String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterAttributeString(FilterAttributeString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Regex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Regex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterRegex(FilterRegex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Attribute Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Attribute Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterAttributeInt(FilterAttributeInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Attribute Int Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Attribute Int Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterAttributeIntRange(FilterAttributeIntRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Ocl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Ocl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterOcl(FilterOcl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Compound</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Compound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterCompound(FilterCompound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter AND</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter AND</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterAND(FilterAND object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter OR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter OR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterOR(FilterOR object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Data Tool Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Tool Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataToolContext(DataToolContext object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Columnizers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Columnizers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnizers(Columnizers object) {
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
