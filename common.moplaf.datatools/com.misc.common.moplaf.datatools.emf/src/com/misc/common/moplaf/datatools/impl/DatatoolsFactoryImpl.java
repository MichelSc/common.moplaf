/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatoolsFactoryImpl extends EFactoryImpl implements DatatoolsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatatoolsFactory init() {
		try {
			DatatoolsFactory theDatatoolsFactory = (DatatoolsFactory)EPackage.Registry.INSTANCE.getEFactory(DatatoolsPackage.eNS_URI);
			if (theDatatoolsFactory != null) {
				return theDatatoolsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatatoolsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatoolsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DatatoolsPackage.NAVIGATION_REFERENCE: return createNavigationReference();
			case DatatoolsPackage.NAVIGATION_DOWNCAST: return createNavigationDowncast();
			case DatatoolsPackage.DATA_TOOL_CONTEXT: return createDataToolContext();
			case DatatoolsPackage.EXTRACTOR_TYPE: return createExtractorType();
			case DatatoolsPackage.EXTRACTOR_PATH: return createExtractorPath();
			case DatatoolsPackage.EXTRACTOR_OCL: return createExtractorOcl();
			case DatatoolsPackage.EXTRACTOR_FILTER_REGEX: return createExtractorFilterRegex();
			case DatatoolsPackage.EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE: return createExtractorFilterAttributeIntRange();
			case DatatoolsPackage.EXTRACTOR_FILTER_OCL: return createExtractorFilterOcl();
			case DatatoolsPackage.EXTRACTOR_FILTER_AND: return createExtractorFilterAND();
			case DatatoolsPackage.EXTRACTOR_FILTER_OR: return createExtractorFilterOR();
			case DatatoolsPackage.EXTRACTOR_COMPOUND: return createExtractorCompound();
			case DatatoolsPackage.EXTRACTOR_PIPE: return createExtractorPipe();
			case DatatoolsPackage.EXTRACTOR_UNION: return createExtractorUnion();
			case DatatoolsPackage.EXTRACTOR_INTERSECTION: return createExtractorIntersection();
			case DatatoolsPackage.COLUMNIZER: return createColumnizer();
			case DatatoolsPackage.COLUMNIZER_GRID: return createColumnizerGrid();
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE: return createColumnizerColumnAttribute();
			case DatatoolsPackage.COLUMNIZER_COLUMN_OCL: return createColumnizerColumnOcl();
			case DatatoolsPackage.SUPER_CATEGORY: return createSuperCategory();
			case DatatoolsPackage.CATEGORY: return createCategory();
			case DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE: return createCategorizerStructuralFeature();
			case DatatoolsPackage.CATEGORIZER_OCL: return createCategorizerOcl();
			case DatatoolsPackage.MATCHER: return createMatcher();
			case DatatoolsPackage.MATCH: return createMatch();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DatatoolsPackage.DATA_TOOL_TYPE:
				return createDataToolTypeFromString(eDataType, initialValue);
			case DatatoolsPackage.MATCH_STATUS:
				return createMatchStatusFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DatatoolsPackage.DATA_TOOL_TYPE:
				return convertDataToolTypeToString(eDataType, instanceValue);
			case DatatoolsPackage.MATCH_STATUS:
				return convertMatchStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategorizerStructuralFeature createCategorizerStructuralFeature() {
		CategorizerStructuralFeatureImpl categorizerStructuralFeature = new CategorizerStructuralFeatureImpl();
		return categorizerStructuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategorizerOcl createCategorizerOcl() {
		CategorizerOclImpl categorizerOcl = new CategorizerOclImpl();
		return categorizerOcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtractorType createExtractorType() {
		ExtractorTypeImpl extractorType = new ExtractorTypeImpl();
		return extractorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtractorCompound createExtractorCompound() {
		ExtractorCompoundImpl extractorCompound = new ExtractorCompoundImpl();
		return extractorCompound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtractorPipe createExtractorPipe() {
		ExtractorPipeImpl extractorPipe = new ExtractorPipeImpl();
		return extractorPipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtractorUnion createExtractorUnion() {
		ExtractorUnionImpl extractorUnion = new ExtractorUnionImpl();
		return extractorUnion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtractorIntersection createExtractorIntersection() {
		ExtractorIntersectionImpl extractorIntersection = new ExtractorIntersectionImpl();
		return extractorIntersection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columnizer createColumnizer() {
		ColumnizerImpl columnizer = new ColumnizerImpl();
		return columnizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtractorPath createExtractorPath() {
		ExtractorPathImpl extractorPath = new ExtractorPathImpl();
		return extractorPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtractorOcl createExtractorOcl() {
		ExtractorOclImpl extractorOcl = new ExtractorOclImpl();
		return extractorOcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtractorFilterOcl createExtractorFilterOcl() {
		ExtractorFilterOclImpl extractorFilterOcl = new ExtractorFilterOclImpl();
		return extractorFilterOcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnizerColumnAttribute createColumnizerColumnAttribute() {
		ColumnizerColumnAttributeImpl columnizerColumnAttribute = new ColumnizerColumnAttributeImpl();
		return columnizerColumnAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnizerColumnOcl createColumnizerColumnOcl() {
		ColumnizerColumnOclImpl columnizerColumnOcl = new ColumnizerColumnOclImpl();
		return columnizerColumnOcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperCategory createSuperCategory() {
		SuperCategoryImpl superCategory = new SuperCategoryImpl();
		return superCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationReference createNavigationReference() {
		NavigationReferenceImpl navigationReference = new NavigationReferenceImpl();
		return navigationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationDowncast createNavigationDowncast() {
		NavigationDowncastImpl navigationDowncast = new NavigationDowncastImpl();
		return navigationDowncast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataToolContext createDataToolContext() {
		DataToolContextImpl dataToolContext = new DataToolContextImpl();
		return dataToolContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matcher createMatcher() {
		MatcherImpl matcher = new MatcherImpl();
		return matcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Match createMatch() {
		MatchImpl match = new MatchImpl();
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataToolType createDataToolTypeFromString(EDataType eDataType, String initialValue) {
		DataToolType result = DataToolType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataToolTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchStatus createMatchStatusFromString(EDataType eDataType, String initialValue) {
		MatchStatus result = MatchStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMatchStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtractorFilterAND createExtractorFilterAND() {
		ExtractorFilterANDImpl extractorFilterAND = new ExtractorFilterANDImpl();
		return extractorFilterAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtractorFilterOR createExtractorFilterOR() {
		ExtractorFilterORImpl extractorFilterOR = new ExtractorFilterORImpl();
		return extractorFilterOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtractorFilterRegex createExtractorFilterRegex() {
		ExtractorFilterRegexImpl extractorFilterRegex = new ExtractorFilterRegexImpl();
		return extractorFilterRegex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtractorFilterAttributeIntRange createExtractorFilterAttributeIntRange() {
		ExtractorFilterAttributeIntRangeImpl extractorFilterAttributeIntRange = new ExtractorFilterAttributeIntRangeImpl();
		return extractorFilterAttributeIntRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnizerGrid createColumnizerGrid() {
		ColumnizerGridImpl columnizerGrid = new ColumnizerGridImpl();
		return columnizerGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatoolsPackage getDatatoolsPackage() {
		return (DatatoolsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatatoolsPackage getPackage() {
		return DatatoolsPackage.eINSTANCE;
	}

} //DatatoolsFactoryImpl
