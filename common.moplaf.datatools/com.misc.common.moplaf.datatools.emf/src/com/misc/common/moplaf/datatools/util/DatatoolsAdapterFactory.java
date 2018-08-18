/**
 */
package com.misc.common.moplaf.datatools.util;

import com.misc.common.moplaf.datatools.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage
 * @generated
 */
public class DatatoolsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatatoolsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatoolsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DatatoolsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatoolsSwitch<Adapter> modelSwitch =
		new DatatoolsSwitch<Adapter>() {
			@Override
			public Adapter caseNavigationPath(NavigationPath object) {
				return createNavigationPathAdapter();
			}
			@Override
			public Adapter caseNavigationAxis(NavigationAxis object) {
				return createNavigationAxisAdapter();
			}
			@Override
			public Adapter caseNavigationReference(NavigationReference object) {
				return createNavigationReferenceAdapter();
			}
			@Override
			public Adapter caseNavigationDowncast(NavigationDowncast object) {
				return createNavigationDowncastAdapter();
			}
			@Override
			public Adapter caseDataToolContext(DataToolContext object) {
				return createDataToolContextAdapter();
			}
			@Override
			public Adapter caseDataTool(DataTool object) {
				return createDataToolAdapter();
			}
			@Override
			public Adapter caseDataToolAbstract(DataToolAbstract object) {
				return createDataToolAbstractAdapter();
			}
			@Override
			public Adapter caseExtractor(Extractor object) {
				return createExtractorAdapter();
			}
			@Override
			public Adapter caseExtractorType(ExtractorType object) {
				return createExtractorTypeAdapter();
			}
			@Override
			public Adapter caseExtractorPath(ExtractorPath object) {
				return createExtractorPathAdapter();
			}
			@Override
			public Adapter caseExtractorOcl(ExtractorOcl object) {
				return createExtractorOclAdapter();
			}
			@Override
			public Adapter caseExtractorFilter(ExtractorFilter object) {
				return createExtractorFilterAdapter();
			}
			@Override
			public Adapter caseExtractorFilterAttribute(ExtractorFilterAttribute object) {
				return createExtractorFilterAttributeAdapter();
			}
			@Override
			public Adapter caseExtractorFilterAttributeString(ExtractorFilterAttributeString object) {
				return createExtractorFilterAttributeStringAdapter();
			}
			@Override
			public Adapter caseExtractorFilterRegex(ExtractorFilterRegex object) {
				return createExtractorFilterRegexAdapter();
			}
			@Override
			public Adapter caseExtractorFilterAttributeInt(ExtractorFilterAttributeInt object) {
				return createExtractorFilterAttributeIntAdapter();
			}
			@Override
			public Adapter caseExtractorFilterAttributeIntRange(ExtractorFilterAttributeIntRange object) {
				return createExtractorFilterAttributeIntRangeAdapter();
			}
			@Override
			public Adapter caseExtractorFilterOcl(ExtractorFilterOcl object) {
				return createExtractorFilterOclAdapter();
			}
			@Override
			public Adapter caseExtractorFilterCompound(ExtractorFilterCompound object) {
				return createExtractorFilterCompoundAdapter();
			}
			@Override
			public Adapter caseExtractorFilterAND(ExtractorFilterAND object) {
				return createExtractorFilterANDAdapter();
			}
			@Override
			public Adapter caseExtractorFilterOR(ExtractorFilterOR object) {
				return createExtractorFilterORAdapter();
			}
			@Override
			public Adapter caseExtractorCompound(ExtractorCompound object) {
				return createExtractorCompoundAdapter();
			}
			@Override
			public Adapter caseExtractorLogic(ExtractorLogic object) {
				return createExtractorLogicAdapter();
			}
			@Override
			public Adapter caseExtractorPipe(ExtractorPipe object) {
				return createExtractorPipeAdapter();
			}
			@Override
			public Adapter caseExtractorUnion(ExtractorUnion object) {
				return createExtractorUnionAdapter();
			}
			@Override
			public Adapter caseExtractorIntersection(ExtractorIntersection object) {
				return createExtractorIntersectionAdapter();
			}
			@Override
			public Adapter caseColumnizerAbstract(ColumnizerAbstract object) {
				return createColumnizerAbstractAdapter();
			}
			@Override
			public Adapter caseColumnizer(Columnizer object) {
				return createColumnizerAdapter();
			}
			@Override
			public Adapter caseColumnizerGrid(ColumnizerGrid object) {
				return createColumnizerGridAdapter();
			}
			@Override
			public Adapter caseColumnizerColumn(ColumnizerColumn object) {
				return createColumnizerColumnAdapter();
			}
			@Override
			public Adapter caseColumnizerColumnAttribute(ColumnizerColumnAttribute object) {
				return createColumnizerColumnAttributeAdapter();
			}
			@Override
			public Adapter caseColumnizerColumnOcl(ColumnizerColumnOcl object) {
				return createColumnizerColumnOclAdapter();
			}
			@Override
			public Adapter caseCategoryAbstract(CategoryAbstract object) {
				return createCategoryAbstractAdapter();
			}
			@Override
			public Adapter caseSuperCategory(SuperCategory object) {
				return createSuperCategoryAdapter();
			}
			@Override
			public Adapter caseCategory(Category object) {
				return createCategoryAdapter();
			}
			@Override
			public Adapter caseCategorizer(Categorizer object) {
				return createCategorizerAdapter();
			}
			@Override
			public Adapter caseCategorizerStructuralFeature(CategorizerStructuralFeature object) {
				return createCategorizerStructuralFeatureAdapter();
			}
			@Override
			public Adapter caseCategorizerOcl(CategorizerOcl object) {
				return createCategorizerOclAdapter();
			}
			@Override
			public Adapter caseMatcher(Matcher object) {
				return createMatcherAdapter();
			}
			@Override
			public Adapter caseMatch(Match object) {
				return createMatchAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.Categorizer <em>Categorizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.Categorizer
	 * @generated
	 */
	public Adapter createCategorizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.Extractor <em>Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.Extractor
	 * @generated
	 */
	public Adapter createExtractorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.Columnizer <em>Columnizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.Columnizer
	 * @generated
	 */
	public Adapter createColumnizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.CategoryAbstract <em>Category Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.CategoryAbstract
	 * @generated
	 */
	public Adapter createCategoryAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.CategorizerStructuralFeature <em>Categorizer Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.CategorizerStructuralFeature
	 * @generated
	 */
	public Adapter createCategorizerStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.CategorizerOcl <em>Categorizer Ocl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.CategorizerOcl
	 * @generated
	 */
	public Adapter createCategorizerOclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.ExtractorType <em>Extractor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.ExtractorType
	 * @generated
	 */
	public Adapter createExtractorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.ExtractorCompound <em>Extractor Compound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.ExtractorCompound
	 * @generated
	 */
	public Adapter createExtractorCompoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.ExtractorPipe <em>Extractor Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.ExtractorPipe
	 * @generated
	 */
	public Adapter createExtractorPipeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.ExtractorLogic <em>Extractor Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.ExtractorLogic
	 * @generated
	 */
	public Adapter createExtractorLogicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.ExtractorUnion <em>Extractor Union</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.ExtractorUnion
	 * @generated
	 */
	public Adapter createExtractorUnionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.ExtractorIntersection <em>Extractor Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.ExtractorIntersection
	 * @generated
	 */
	public Adapter createExtractorIntersectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.ColumnizerAbstract <em>Columnizer Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.ColumnizerAbstract
	 * @generated
	 */
	public Adapter createColumnizerAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.ExtractorPath <em>Extractor Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.ExtractorPath
	 * @generated
	 */
	public Adapter createExtractorPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.ExtractorOcl <em>Extractor Ocl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.ExtractorOcl
	 * @generated
	 */
	public Adapter createExtractorOclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.ExtractorFilter <em>Extractor Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilter
	 * @generated
	 */
	public Adapter createExtractorFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.ExtractorFilterAttribute <em>Extractor Filter Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterAttribute
	 * @generated
	 */
	public Adapter createExtractorFilterAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.ExtractorFilterAttributeInt <em>Extractor Filter Attribute Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterAttributeInt
	 * @generated
	 */
	public Adapter createExtractorFilterAttributeIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.ExtractorFilterOcl <em>Extractor Filter Ocl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterOcl
	 * @generated
	 */
	public Adapter createExtractorFilterOclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.ColumnizerColumn <em>Columnizer Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.ColumnizerColumn
	 * @generated
	 */
	public Adapter createColumnizerColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.ColumnizerColumnAttribute <em>Columnizer Column Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.ColumnizerColumnAttribute
	 * @generated
	 */
	public Adapter createColumnizerColumnAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.ColumnizerColumnOcl <em>Columnizer Column Ocl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.ColumnizerColumnOcl
	 * @generated
	 */
	public Adapter createColumnizerColumnOclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.SuperCategory <em>Super Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.SuperCategory
	 * @generated
	 */
	public Adapter createSuperCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.NavigationPath <em>Navigation Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.NavigationPath
	 * @generated
	 */
	public Adapter createNavigationPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.NavigationReference <em>Navigation Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.NavigationReference
	 * @generated
	 */
	public Adapter createNavigationReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.NavigationDowncast <em>Navigation Downcast</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.NavigationDowncast
	 * @generated
	 */
	public Adapter createNavigationDowncastAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.DataToolContext <em>Data Tool Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.DataToolContext
	 * @generated
	 */
	public Adapter createDataToolContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.NavigationAxis <em>Navigation Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.NavigationAxis
	 * @generated
	 */
	public Adapter createNavigationAxisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.Matcher <em>Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.Matcher
	 * @generated
	 */
	public Adapter createMatcherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.Match
	 * @generated
	 */
	public Adapter createMatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.ExtractorFilterCompound <em>Extractor Filter Compound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterCompound
	 * @generated
	 */
	public Adapter createExtractorFilterCompoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.ExtractorFilterAND <em>Extractor Filter AND</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterAND
	 * @generated
	 */
	public Adapter createExtractorFilterANDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.ExtractorFilterOR <em>Extractor Filter OR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterOR
	 * @generated
	 */
	public Adapter createExtractorFilterORAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.ExtractorFilterRegex <em>Extractor Filter Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterRegex
	 * @generated
	 */
	public Adapter createExtractorFilterRegexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.ExtractorFilterAttributeString <em>Extractor Filter Attribute String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterAttributeString
	 * @generated
	 */
	public Adapter createExtractorFilterAttributeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.ExtractorFilterAttributeIntRange <em>Extractor Filter Attribute Int Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterAttributeIntRange
	 * @generated
	 */
	public Adapter createExtractorFilterAttributeIntRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.ColumnizerGrid <em>Columnizer Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.ColumnizerGrid
	 * @generated
	 */
	public Adapter createColumnizerGridAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.DataTool <em>Data Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.DataTool
	 * @generated
	 */
	public Adapter createDataToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datatools.DataToolAbstract <em>Data Tool Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datatools.DataToolAbstract
	 * @generated
	 */
	public Adapter createDataToolAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DatatoolsAdapterFactory
