/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.Categorizer;
import com.misc.common.moplaf.datatools.CategorizerOcl;
import com.misc.common.moplaf.datatools.CategorizerStructuralFeature;
import com.misc.common.moplaf.datatools.Category;
import com.misc.common.moplaf.datatools.CategoryAbstract;
import com.misc.common.moplaf.datatools.Columnizer;
import com.misc.common.moplaf.datatools.ColumnizerAbstract;
import com.misc.common.moplaf.datatools.ColumnizerColumn;
import com.misc.common.moplaf.datatools.ColumnizerColumnAttribute;
import com.misc.common.moplaf.datatools.ColumnizerColumnOcl;
import com.misc.common.moplaf.datatools.Columnizers;
import com.misc.common.moplaf.datatools.DataTool;
import com.misc.common.moplaf.datatools.DataToolAbstract;
import com.misc.common.moplaf.datatools.DataToolContext;
import com.misc.common.moplaf.datatools.DataToolType;
import com.misc.common.moplaf.datatools.DatatoolsFactory;
import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.Extractor;
import com.misc.common.moplaf.datatools.ExtractorCompound;
import com.misc.common.moplaf.datatools.ExtractorIntersection;
import com.misc.common.moplaf.datatools.ExtractorLogic;
import com.misc.common.moplaf.datatools.ExtractorOcl;
import com.misc.common.moplaf.datatools.ExtractorPath;
import com.misc.common.moplaf.datatools.ExtractorPipe;
import com.misc.common.moplaf.datatools.ExtractorType;
import com.misc.common.moplaf.datatools.ExtractorUnion;
import com.misc.common.moplaf.datatools.Filter;
import com.misc.common.moplaf.datatools.FilterAND;
import com.misc.common.moplaf.datatools.FilterAttribute;
import com.misc.common.moplaf.datatools.FilterAttributeInt;
import com.misc.common.moplaf.datatools.FilterAttributeIntRange;
import com.misc.common.moplaf.datatools.FilterAttributeString;
import com.misc.common.moplaf.datatools.FilterCompound;
import com.misc.common.moplaf.datatools.FilterOR;
import com.misc.common.moplaf.datatools.FilterOcl;
import com.misc.common.moplaf.datatools.FilterRegex;
import com.misc.common.moplaf.datatools.Match;
import com.misc.common.moplaf.datatools.MatchStatus;
import com.misc.common.moplaf.datatools.Matcher;
import com.misc.common.moplaf.datatools.NavigationAxis;
import com.misc.common.moplaf.datatools.NavigationDowncast;
import com.misc.common.moplaf.datatools.NavigationPath;
import com.misc.common.moplaf.datatools.NavigationReference;

import com.misc.common.moplaf.datatools.SuperCategory;
import com.misc.common.moplaf.datatools.util.ObjectSet;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatoolsPackageImpl extends EPackageImpl implements DatatoolsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categorizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extractorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categorizerStructuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categorizerOclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extractorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extractorCompoundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extractorPipeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extractorLogicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extractorUnionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extractorIntersectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnizerAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extractorPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extractorOclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterAttributeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterRegexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterAttributeIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterAttributeIntRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterOclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterCompoundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterANDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterOREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnizerColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnizerColumnAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnizerColumnOclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationDowncastEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataToolContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationAxisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matcherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnizersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataToolTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum matchStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eObjectsSetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataToolAbstractEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatatoolsPackageImpl() {
		super(eNS_URI, DatatoolsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DatatoolsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatatoolsPackage init() {
		if (isInited) return (DatatoolsPackage)EPackage.Registry.INSTANCE.getEPackage(DatatoolsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDatatoolsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DatatoolsPackageImpl theDatatoolsPackage = registeredDatatoolsPackage instanceof DatatoolsPackageImpl ? (DatatoolsPackageImpl)registeredDatatoolsPackage : new DatatoolsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDatatoolsPackage.createPackageContents();

		// Initialize created meta-data
		theDatatoolsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatatoolsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatatoolsPackage.eNS_URI, theDatatoolsPackage);
		return theDatatoolsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategorizer() {
		return categorizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCategorizer__GetCategoryValue__EObject() {
		return categorizerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCategorizer__GetCategoryLabel__Object() {
		return categorizerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCategorizer__IsValidElementType__EClass() {
		return categorizerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCategorizer__ConstructCategory() {
		return categorizerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_Categorizer() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategory_CategoryValue() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtractor() {
		return extractorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtractor_ExtractedType() {
		return (EReference)extractorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtractor_Filter() {
		return (EReference)extractorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtractor__Extract__ObjectSet_int() {
		return extractorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtractor__IsValidRoot__EObject() {
		return extractorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnizer() {
		return columnizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnizer_Columns() {
		return (EReference)columnizerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnizer_ColumnizedType() {
		return (EReference)columnizerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnizer_SheetName() {
		return (EAttribute)columnizerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoryAbstract() {
		return categoryAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryAbstract_SubCategories() {
		return (EReference)categoryAbstractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryAbstract_Elements() {
		return (EReference)categoryAbstractEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryAbstract_NbElements() {
		return (EAttribute)categoryAbstractEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryAbstract_CategoryLabel() {
		return (EAttribute)categoryAbstractEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryAbstract_CategoryColumnizers() {
		return (EReference)categoryAbstractEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCategoryAbstract__GetSubcategory__EObject() {
		return categoryAbstractEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCategoryAbstract__RefreshCats__ObjectSet_EList_int() {
		return categoryAbstractEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCategoryAbstract__SetColumnizerAll__Columnizers() {
		return categoryAbstractEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCategoryAbstract__Flush() {
		return categoryAbstractEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategorizerStructuralFeature() {
		return categorizerStructuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategorizerStructuralFeature_Feature() {
		return (EReference)categorizerStructuralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategorizerStructuralFeature_CategorizedType() {
		return (EReference)categorizerStructuralFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategorizerOcl() {
		return categorizerOclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategorizerOcl_Expression() {
		return (EAttribute)categorizerOclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtractorType() {
		return extractorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtractorType_TargetType() {
		return (EReference)extractorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtractorCompound() {
		return extractorCompoundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtractorCompound_Extractors() {
		return (EReference)extractorCompoundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtractorPipe() {
		return extractorPipeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtractorLogic() {
		return extractorLogicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtractorUnion() {
		return extractorUnionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtractorIntersection() {
		return extractorIntersectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnizerAbstract() {
		return columnizerAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getColumnizerAbstract__IsValidElementType__EClass() {
		return columnizerAbstractEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtractorPath() {
		return extractorPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtractorPath_RootType() {
		return (EReference)extractorPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtractorOcl() {
		return extractorOclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtractorOcl_Expression() {
		return (EAttribute)extractorOclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilter_Enabled() {
		return (EAttribute)filterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilter_Negated() {
		return (EAttribute)filterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilter_FilteredType() {
		return (EReference)filterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFilter__SatisfiesFilter__EObject() {
		return filterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterAttribute() {
		return filterAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterAttribute_Attribute() {
		return (EReference)filterAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFilterAttribute__GetAttributeValue__EObject() {
		return filterAttributeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterAttributeString() {
		return filterAttributeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterRegex() {
		return filterRegexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterRegex_Pattern() {
		return (EAttribute)filterRegexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterAttributeInt() {
		return filterAttributeIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterAttributeIntRange() {
		return filterAttributeIntRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterAttributeIntRange_MinValue() {
		return (EAttribute)filterAttributeIntRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterAttributeIntRange_MaxValue() {
		return (EAttribute)filterAttributeIntRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterOcl() {
		return filterOclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterOcl_Expression() {
		return (EAttribute)filterOclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterCompound() {
		return filterCompoundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterCompound_Filters() {
		return (EReference)filterCompoundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterAND() {
		return filterANDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterOR() {
		return filterOREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnizerColumn() {
		return columnizerColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnizerColumn_ColumnName() {
		return (EAttribute)columnizerColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnizerColumn_ColumnWidth() {
		return (EAttribute)columnizerColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnizerColumn_Columnizer() {
		return (EReference)columnizerColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getColumnizerColumn__GetValue__EObject() {
		return columnizerColumnEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnizerColumnAttribute() {
		return columnizerColumnAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnizerColumnAttribute_Attribute() {
		return (EReference)columnizerColumnAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnizerColumnOcl() {
		return columnizerColumnOclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnizerColumnOcl_Expression() {
		return (EAttribute)columnizerColumnOclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperCategory() {
		return superCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperCategory__RefreshCats__ObjectSet_EList() {
		return superCategoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationPath() {
		return navigationPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationPath_PathElements() {
		return (EReference)navigationPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationPath_SourceType() {
		return (EReference)navigationPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationPath_TargetType() {
		return (EReference)navigationPathEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavigationPath_Many() {
		return (EAttribute)navigationPathEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavigationPath_Path() {
		return (EAttribute)navigationPathEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationReference() {
		return navigationReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationReference_Reference() {
		return (EReference)navigationReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationDowncast() {
		return navigationDowncastEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationDowncast_DowncastType() {
		return (EReference)navigationDowncastEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataToolContext() {
		return dataToolContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataToolContext__GetDomainTypes() {
		return dataToolContextEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationAxis() {
		return navigationAxisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationAxis_SourceType() {
		return (EReference)navigationAxisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationAxis_TargetType() {
		return (EReference)navigationAxisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationAxis_Path() {
		return (EReference)navigationAxisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationAxis_Previous() {
		return (EReference)navigationAxisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavigationAxis_PathElement() {
		return (EAttribute)navigationAxisEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationAxis_Next() {
		return (EReference)navigationAxisEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNavigationAxis__Navigate__EObject() {
		return navigationAxisEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNavigationAxis__NavigateMany__EObject() {
		return navigationAxisEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatcher() {
		return matcherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMatcher__GetMatch__EObject_EObject() {
		return matcherEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatch() {
		return matchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatch_Object1() {
		return (EReference)matchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatch_Object2() {
		return (EReference)matchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnizers() {
		return columnizersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnizers_Columnizers() {
		return (EReference)columnizersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataToolType() {
		return dataToolTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMatchStatus() {
		return matchStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEObjectsSet() {
		return eObjectsSetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTool() {
		return dataToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataTool__Clone() {
		return dataToolEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataToolAbstract() {
		return dataToolAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataToolAbstract_Context() {
		return (EReference)dataToolAbstractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataToolAbstract_Description() {
		return (EAttribute)dataToolAbstractEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataToolAbstract_Name() {
		return (EAttribute)dataToolAbstractEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataToolAbstract__GetType() {
		return dataToolAbstractEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatoolsFactory getDatatoolsFactory() {
		return (DatatoolsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		navigationPathEClass = createEClass(NAVIGATION_PATH);
		createEReference(navigationPathEClass, NAVIGATION_PATH__PATH_ELEMENTS);
		createEReference(navigationPathEClass, NAVIGATION_PATH__SOURCE_TYPE);
		createEReference(navigationPathEClass, NAVIGATION_PATH__TARGET_TYPE);
		createEAttribute(navigationPathEClass, NAVIGATION_PATH__MANY);
		createEAttribute(navigationPathEClass, NAVIGATION_PATH__PATH);

		navigationAxisEClass = createEClass(NAVIGATION_AXIS);
		createEReference(navigationAxisEClass, NAVIGATION_AXIS__SOURCE_TYPE);
		createEReference(navigationAxisEClass, NAVIGATION_AXIS__TARGET_TYPE);
		createEReference(navigationAxisEClass, NAVIGATION_AXIS__PATH);
		createEReference(navigationAxisEClass, NAVIGATION_AXIS__PREVIOUS);
		createEAttribute(navigationAxisEClass, NAVIGATION_AXIS__PATH_ELEMENT);
		createEReference(navigationAxisEClass, NAVIGATION_AXIS__NEXT);
		createEOperation(navigationAxisEClass, NAVIGATION_AXIS___NAVIGATE__EOBJECT);
		createEOperation(navigationAxisEClass, NAVIGATION_AXIS___NAVIGATE_MANY__EOBJECT);

		navigationReferenceEClass = createEClass(NAVIGATION_REFERENCE);
		createEReference(navigationReferenceEClass, NAVIGATION_REFERENCE__REFERENCE);

		navigationDowncastEClass = createEClass(NAVIGATION_DOWNCAST);
		createEReference(navigationDowncastEClass, NAVIGATION_DOWNCAST__DOWNCAST_TYPE);

		dataToolContextEClass = createEClass(DATA_TOOL_CONTEXT);
		createEOperation(dataToolContextEClass, DATA_TOOL_CONTEXT___GET_DOMAIN_TYPES);

		dataToolEClass = createEClass(DATA_TOOL);
		createEOperation(dataToolEClass, DATA_TOOL___CLONE);

		dataToolAbstractEClass = createEClass(DATA_TOOL_ABSTRACT);
		createEReference(dataToolAbstractEClass, DATA_TOOL_ABSTRACT__CONTEXT);
		createEAttribute(dataToolAbstractEClass, DATA_TOOL_ABSTRACT__DESCRIPTION);
		createEAttribute(dataToolAbstractEClass, DATA_TOOL_ABSTRACT__NAME);
		createEOperation(dataToolAbstractEClass, DATA_TOOL_ABSTRACT___GET_TYPE);

		extractorEClass = createEClass(EXTRACTOR);
		createEReference(extractorEClass, EXTRACTOR__EXTRACTED_TYPE);
		createEReference(extractorEClass, EXTRACTOR__FILTER);
		createEOperation(extractorEClass, EXTRACTOR___EXTRACT__OBJECTSET_INT);
		createEOperation(extractorEClass, EXTRACTOR___IS_VALID_ROOT__EOBJECT);

		extractorTypeEClass = createEClass(EXTRACTOR_TYPE);
		createEReference(extractorTypeEClass, EXTRACTOR_TYPE__TARGET_TYPE);

		extractorPathEClass = createEClass(EXTRACTOR_PATH);
		createEReference(extractorPathEClass, EXTRACTOR_PATH__ROOT_TYPE);

		extractorOclEClass = createEClass(EXTRACTOR_OCL);
		createEAttribute(extractorOclEClass, EXTRACTOR_OCL__EXPRESSION);

		filterEClass = createEClass(FILTER);
		createEAttribute(filterEClass, FILTER__ENABLED);
		createEAttribute(filterEClass, FILTER__NEGATED);
		createEReference(filterEClass, FILTER__FILTERED_TYPE);
		createEOperation(filterEClass, FILTER___SATISFIES_FILTER__EOBJECT);

		filterAttributeEClass = createEClass(FILTER_ATTRIBUTE);
		createEReference(filterAttributeEClass, FILTER_ATTRIBUTE__ATTRIBUTE);
		createEOperation(filterAttributeEClass, FILTER_ATTRIBUTE___GET_ATTRIBUTE_VALUE__EOBJECT);

		filterAttributeStringEClass = createEClass(FILTER_ATTRIBUTE_STRING);

		filterRegexEClass = createEClass(FILTER_REGEX);
		createEAttribute(filterRegexEClass, FILTER_REGEX__PATTERN);

		filterAttributeIntEClass = createEClass(FILTER_ATTRIBUTE_INT);

		filterAttributeIntRangeEClass = createEClass(FILTER_ATTRIBUTE_INT_RANGE);
		createEAttribute(filterAttributeIntRangeEClass, FILTER_ATTRIBUTE_INT_RANGE__MIN_VALUE);
		createEAttribute(filterAttributeIntRangeEClass, FILTER_ATTRIBUTE_INT_RANGE__MAX_VALUE);

		filterOclEClass = createEClass(FILTER_OCL);
		createEAttribute(filterOclEClass, FILTER_OCL__EXPRESSION);

		filterCompoundEClass = createEClass(FILTER_COMPOUND);
		createEReference(filterCompoundEClass, FILTER_COMPOUND__FILTERS);

		filterANDEClass = createEClass(FILTER_AND);

		filterOREClass = createEClass(FILTER_OR);

		extractorCompoundEClass = createEClass(EXTRACTOR_COMPOUND);
		createEReference(extractorCompoundEClass, EXTRACTOR_COMPOUND__EXTRACTORS);

		extractorLogicEClass = createEClass(EXTRACTOR_LOGIC);

		extractorPipeEClass = createEClass(EXTRACTOR_PIPE);

		extractorUnionEClass = createEClass(EXTRACTOR_UNION);

		extractorIntersectionEClass = createEClass(EXTRACTOR_INTERSECTION);

		columnizerAbstractEClass = createEClass(COLUMNIZER_ABSTRACT);
		createEOperation(columnizerAbstractEClass, COLUMNIZER_ABSTRACT___IS_VALID_ELEMENT_TYPE__ECLASS);

		columnizerEClass = createEClass(COLUMNIZER);
		createEReference(columnizerEClass, COLUMNIZER__COLUMNS);
		createEReference(columnizerEClass, COLUMNIZER__COLUMNIZED_TYPE);
		createEAttribute(columnizerEClass, COLUMNIZER__SHEET_NAME);

		columnizerColumnEClass = createEClass(COLUMNIZER_COLUMN);
		createEAttribute(columnizerColumnEClass, COLUMNIZER_COLUMN__COLUMN_NAME);
		createEAttribute(columnizerColumnEClass, COLUMNIZER_COLUMN__COLUMN_WIDTH);
		createEReference(columnizerColumnEClass, COLUMNIZER_COLUMN__COLUMNIZER);
		createEOperation(columnizerColumnEClass, COLUMNIZER_COLUMN___GET_VALUE__EOBJECT);

		columnizerColumnAttributeEClass = createEClass(COLUMNIZER_COLUMN_ATTRIBUTE);
		createEReference(columnizerColumnAttributeEClass, COLUMNIZER_COLUMN_ATTRIBUTE__ATTRIBUTE);

		columnizerColumnOclEClass = createEClass(COLUMNIZER_COLUMN_OCL);
		createEAttribute(columnizerColumnOclEClass, COLUMNIZER_COLUMN_OCL__EXPRESSION);

		categoryAbstractEClass = createEClass(CATEGORY_ABSTRACT);
		createEReference(categoryAbstractEClass, CATEGORY_ABSTRACT__SUB_CATEGORIES);
		createEReference(categoryAbstractEClass, CATEGORY_ABSTRACT__ELEMENTS);
		createEAttribute(categoryAbstractEClass, CATEGORY_ABSTRACT__NB_ELEMENTS);
		createEAttribute(categoryAbstractEClass, CATEGORY_ABSTRACT__CATEGORY_LABEL);
		createEReference(categoryAbstractEClass, CATEGORY_ABSTRACT__CATEGORY_COLUMNIZERS);
		createEOperation(categoryAbstractEClass, CATEGORY_ABSTRACT___GET_SUBCATEGORY__EOBJECT);
		createEOperation(categoryAbstractEClass, CATEGORY_ABSTRACT___REFRESH_CATS__OBJECTSET_ELIST_INT);
		createEOperation(categoryAbstractEClass, CATEGORY_ABSTRACT___SET_COLUMNIZER_ALL__COLUMNIZERS);
		createEOperation(categoryAbstractEClass, CATEGORY_ABSTRACT___FLUSH);

		superCategoryEClass = createEClass(SUPER_CATEGORY);
		createEOperation(superCategoryEClass, SUPER_CATEGORY___REFRESH_CATS__OBJECTSET_ELIST);

		categoryEClass = createEClass(CATEGORY);
		createEReference(categoryEClass, CATEGORY__CATEGORIZER);
		createEAttribute(categoryEClass, CATEGORY__CATEGORY_VALUE);

		categorizerEClass = createEClass(CATEGORIZER);
		createEOperation(categorizerEClass, CATEGORIZER___CONSTRUCT_CATEGORY);
		createEOperation(categorizerEClass, CATEGORIZER___GET_CATEGORY_VALUE__EOBJECT);
		createEOperation(categorizerEClass, CATEGORIZER___GET_CATEGORY_LABEL__OBJECT);
		createEOperation(categorizerEClass, CATEGORIZER___IS_VALID_ELEMENT_TYPE__ECLASS);

		categorizerStructuralFeatureEClass = createEClass(CATEGORIZER_STRUCTURAL_FEATURE);
		createEReference(categorizerStructuralFeatureEClass, CATEGORIZER_STRUCTURAL_FEATURE__FEATURE);
		createEReference(categorizerStructuralFeatureEClass, CATEGORIZER_STRUCTURAL_FEATURE__CATEGORIZED_TYPE);

		categorizerOclEClass = createEClass(CATEGORIZER_OCL);
		createEAttribute(categorizerOclEClass, CATEGORIZER_OCL__EXPRESSION);

		matcherEClass = createEClass(MATCHER);
		createEOperation(matcherEClass, MATCHER___GET_MATCH__EOBJECT_EOBJECT);

		matchEClass = createEClass(MATCH);
		createEReference(matchEClass, MATCH__OBJECT1);
		createEReference(matchEClass, MATCH__OBJECT2);

		columnizersEClass = createEClass(COLUMNIZERS);
		createEReference(columnizersEClass, COLUMNIZERS__COLUMNIZERS);

		// Create enums
		dataToolTypeEEnum = createEEnum(DATA_TOOL_TYPE);
		matchStatusEEnum = createEEnum(MATCH_STATUS);

		// Create data types
		eObjectsSetEDataType = createEDataType(EOBJECTS_SET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		navigationPathEClass.getESuperTypes().add(this.getDataToolAbstract());
		navigationReferenceEClass.getESuperTypes().add(this.getNavigationAxis());
		navigationDowncastEClass.getESuperTypes().add(this.getNavigationAxis());
		dataToolEClass.getESuperTypes().add(this.getDataToolAbstract());
		extractorEClass.getESuperTypes().add(this.getDataTool());
		extractorTypeEClass.getESuperTypes().add(this.getExtractor());
		extractorPathEClass.getESuperTypes().add(this.getExtractor());
		extractorPathEClass.getESuperTypes().add(this.getNavigationPath());
		extractorOclEClass.getESuperTypes().add(this.getExtractor());
		filterEClass.getESuperTypes().add(this.getDataToolAbstract());
		filterAttributeEClass.getESuperTypes().add(this.getFilter());
		filterAttributeEClass.getESuperTypes().add(this.getNavigationPath());
		filterAttributeStringEClass.getESuperTypes().add(this.getFilterAttribute());
		filterRegexEClass.getESuperTypes().add(this.getFilterAttributeString());
		filterAttributeIntEClass.getESuperTypes().add(this.getFilterAttribute());
		filterAttributeIntRangeEClass.getESuperTypes().add(this.getFilterAttributeInt());
		filterOclEClass.getESuperTypes().add(this.getFilter());
		filterCompoundEClass.getESuperTypes().add(this.getFilter());
		filterCompoundEClass.getESuperTypes().add(this.getDataToolContext());
		filterANDEClass.getESuperTypes().add(this.getFilterCompound());
		filterOREClass.getESuperTypes().add(this.getFilterCompound());
		extractorCompoundEClass.getESuperTypes().add(this.getExtractor());
		extractorCompoundEClass.getESuperTypes().add(this.getDataToolContext());
		extractorLogicEClass.getESuperTypes().add(this.getExtractorCompound());
		extractorPipeEClass.getESuperTypes().add(this.getExtractorCompound());
		extractorUnionEClass.getESuperTypes().add(this.getExtractorLogic());
		extractorIntersectionEClass.getESuperTypes().add(this.getExtractorLogic());
		columnizerAbstractEClass.getESuperTypes().add(this.getDataTool());
		columnizerEClass.getESuperTypes().add(this.getColumnizerAbstract());
		columnizerColumnAttributeEClass.getESuperTypes().add(this.getNavigationPath());
		columnizerColumnAttributeEClass.getESuperTypes().add(this.getColumnizerColumn());
		columnizerColumnOclEClass.getESuperTypes().add(this.getColumnizerColumn());
		superCategoryEClass.getESuperTypes().add(this.getCategoryAbstract());
		categoryEClass.getESuperTypes().add(this.getCategoryAbstract());
		categorizerEClass.getESuperTypes().add(this.getDataTool());
		categorizerStructuralFeatureEClass.getESuperTypes().add(this.getCategorizer());
		categorizerStructuralFeatureEClass.getESuperTypes().add(this.getNavigationPath());
		categorizerOclEClass.getESuperTypes().add(this.getCategorizer());
		matcherEClass.getESuperTypes().add(this.getDataTool());

		// Initialize classes, features, and operations; add parameters
		initEClass(navigationPathEClass, NavigationPath.class, "NavigationPath", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNavigationPath_PathElements(), this.getNavigationAxis(), this.getNavigationAxis_Path(), "PathElements", null, 0, -1, NavigationPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNavigationPath_SourceType(), ecorePackage.getEClass(), null, "SourceType", null, 0, 1, NavigationPath.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNavigationPath_TargetType(), ecorePackage.getEClass(), null, "TargetType", null, 0, 1, NavigationPath.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavigationPath_Many(), ecorePackage.getEBoolean(), "Many", null, 0, 1, NavigationPath.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavigationPath_Path(), ecorePackage.getEString(), "Path", null, 0, 1, NavigationPath.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(navigationAxisEClass, NavigationAxis.class, "NavigationAxis", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNavigationAxis_SourceType(), ecorePackage.getEClass(), null, "SourceType", null, 0, 1, NavigationAxis.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNavigationAxis_TargetType(), ecorePackage.getEClass(), null, "TargetType", null, 0, 1, NavigationAxis.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNavigationAxis_Path(), this.getNavigationPath(), this.getNavigationPath_PathElements(), "Path", null, 1, 1, NavigationAxis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNavigationAxis_Previous(), this.getNavigationAxis(), null, "Previous", null, 0, 1, NavigationAxis.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavigationAxis_PathElement(), ecorePackage.getEString(), "PathElement", null, 0, 1, NavigationAxis.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNavigationAxis_Next(), this.getNavigationAxis(), null, "Next", null, 0, 1, NavigationAxis.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getNavigationAxis__Navigate__EObject(), ecorePackage.getEObject(), "navigate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "in", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNavigationAxis__NavigateMany__EObject(), ecorePackage.getEObject(), "navigateMany", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "in", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(navigationReferenceEClass, NavigationReference.class, "NavigationReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNavigationReference_Reference(), ecorePackage.getEReference(), null, "Reference", null, 1, 1, NavigationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navigationDowncastEClass, NavigationDowncast.class, "NavigationDowncast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNavigationDowncast_DowncastType(), ecorePackage.getEClass(), null, "DowncastType", null, 0, 1, NavigationDowncast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataToolContextEClass, DataToolContext.class, "DataToolContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDataToolContext__GetDomainTypes(), ecorePackage.getEClass(), "getDomainTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataToolEClass, DataTool.class, "DataTool", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDataTool__Clone(), this.getDataTool(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataToolAbstractEClass, DataToolAbstract.class, "DataToolAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataToolAbstract_Context(), this.getDataToolContext(), null, "Context", null, 0, 1, DataToolAbstract.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataToolAbstract_Description(), ecorePackage.getEString(), "Description", null, 0, 1, DataToolAbstract.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataToolAbstract_Name(), ecorePackage.getEString(), "Name", null, 0, 1, DataToolAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDataToolAbstract__GetType(), this.getDataToolType(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(extractorEClass, Extractor.class, "Extractor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtractor_ExtractedType(), ecorePackage.getEClass(), null, "ExtractedType", null, 0, 1, Extractor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getExtractor_Filter(), this.getFilter(), null, "Filter", null, 0, 1, Extractor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getExtractor__Extract__ObjectSet_int(), this.getEObjectsSet(), "extract", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEObjectsSet(), "ins", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "max_elements", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExtractor__IsValidRoot__EObject(), ecorePackage.getEBoolean(), "isValidRoot", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "doc", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(extractorTypeEClass, ExtractorType.class, "ExtractorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtractorType_TargetType(), ecorePackage.getEClass(), null, "TargetType", null, 0, 1, ExtractorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extractorPathEClass, ExtractorPath.class, "ExtractorPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtractorPath_RootType(), ecorePackage.getEClass(), null, "RootType", null, 0, 1, ExtractorPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extractorOclEClass, ExtractorOcl.class, "ExtractorOcl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtractorOcl_Expression(), ecorePackage.getEString(), "Expression", null, 0, 1, ExtractorOcl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterEClass, Filter.class, "Filter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilter_Enabled(), ecorePackage.getEBoolean(), "Enabled", "true", 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilter_Negated(), ecorePackage.getEBoolean(), "Negated", "false", 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilter_FilteredType(), ecorePackage.getEClass(), null, "FilteredType", null, 0, 1, Filter.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getFilter__SatisfiesFilter__EObject(), ecorePackage.getEBoolean(), "satisfiesFilter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(filterAttributeEClass, FilterAttribute.class, "FilterAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterAttribute_Attribute(), ecorePackage.getEAttribute(), null, "Attribute", null, 1, 1, FilterAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getFilterAttribute__GetAttributeValue__EObject(), ecorePackage.getEJavaObject(), "getAttributeValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(filterAttributeStringEClass, FilterAttributeString.class, "FilterAttributeString", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(filterRegexEClass, FilterRegex.class, "FilterRegex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilterRegex_Pattern(), ecorePackage.getEString(), "Pattern", null, 0, 1, FilterRegex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterAttributeIntEClass, FilterAttributeInt.class, "FilterAttributeInt", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(filterAttributeIntRangeEClass, FilterAttributeIntRange.class, "FilterAttributeIntRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilterAttributeIntRange_MinValue(), ecorePackage.getEInt(), "MinValue", null, 0, 1, FilterAttributeIntRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilterAttributeIntRange_MaxValue(), ecorePackage.getEInt(), "MaxValue", null, 0, 1, FilterAttributeIntRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterOclEClass, FilterOcl.class, "FilterOcl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilterOcl_Expression(), ecorePackage.getEString(), "Expression", null, 0, 1, FilterOcl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterCompoundEClass, FilterCompound.class, "FilterCompound", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterCompound_Filters(), this.getFilter(), null, "Filters", null, 0, -1, FilterCompound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterANDEClass, FilterAND.class, "FilterAND", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(filterOREClass, FilterOR.class, "FilterOR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(extractorCompoundEClass, ExtractorCompound.class, "ExtractorCompound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtractorCompound_Extractors(), this.getExtractor(), null, "Extractors", null, 0, -1, ExtractorCompound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extractorLogicEClass, ExtractorLogic.class, "ExtractorLogic", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(extractorPipeEClass, ExtractorPipe.class, "ExtractorPipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(extractorUnionEClass, ExtractorUnion.class, "ExtractorUnion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(extractorIntersectionEClass, ExtractorIntersection.class, "ExtractorIntersection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(columnizerAbstractEClass, ColumnizerAbstract.class, "ColumnizerAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getColumnizerAbstract__IsValidElementType__EClass(), ecorePackage.getEBoolean(), "isValidElementType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(columnizerEClass, Columnizer.class, "Columnizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumnizer_Columns(), this.getColumnizerColumn(), this.getColumnizerColumn_Columnizer(), "Columns", null, 0, -1, Columnizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumnizer_ColumnizedType(), ecorePackage.getEClass(), null, "ColumnizedType", null, 0, 1, Columnizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnizer_SheetName(), ecorePackage.getEString(), "SheetName", null, 0, 1, Columnizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnizerColumnEClass, ColumnizerColumn.class, "ColumnizerColumn", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumnizerColumn_ColumnName(), ecorePackage.getEString(), "ColumnName", null, 0, 1, ColumnizerColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnizerColumn_ColumnWidth(), ecorePackage.getEInt(), "ColumnWidth", null, 0, 1, ColumnizerColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumnizerColumn_Columnizer(), this.getColumnizer(), this.getColumnizer_Columns(), "Columnizer", null, 1, 1, ColumnizerColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getColumnizerColumn__GetValue__EObject(), ecorePackage.getEJavaObject(), "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(columnizerColumnAttributeEClass, ColumnizerColumnAttribute.class, "ColumnizerColumnAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumnizerColumnAttribute_Attribute(), ecorePackage.getEAttribute(), null, "Attribute", null, 1, 1, ColumnizerColumnAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnizerColumnOclEClass, ColumnizerColumnOcl.class, "ColumnizerColumnOcl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumnizerColumnOcl_Expression(), ecorePackage.getEString(), "Expression", null, 0, 1, ColumnizerColumnOcl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryAbstractEClass, CategoryAbstract.class, "CategoryAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategoryAbstract_SubCategories(), this.getCategory(), null, "SubCategories", null, 0, -1, CategoryAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategoryAbstract_Elements(), ecorePackage.getEObject(), null, "Elements", null, 0, -1, CategoryAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCategoryAbstract_NbElements(), ecorePackage.getEInt(), "NbElements", null, 0, 1, CategoryAbstract.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCategoryAbstract_CategoryLabel(), ecorePackage.getEString(), "CategoryLabel", null, 0, 1, CategoryAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCategoryAbstract_CategoryColumnizers(), this.getColumnizers(), null, "CategoryColumnizers", null, 0, 1, CategoryAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCategoryAbstract__GetSubcategory__EObject(), this.getCategory(), "getSubcategory", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCategoryAbstract__RefreshCats__ObjectSet_EList_int(), null, "refreshCats", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEObjectsSet(), "ins", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCategorizer(), "categorizers", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "level", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCategoryAbstract__SetColumnizerAll__Columnizers(), null, "setColumnizerAll", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getColumnizers(), "columnizers", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCategoryAbstract__Flush(), null, "flush", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(superCategoryEClass, SuperCategory.class, "SuperCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSuperCategory__RefreshCats__ObjectSet_EList(), null, "refreshCats", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEObjectsSet(), "ins", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCategorizer(), "categorizers", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategory_Categorizer(), this.getCategorizer(), null, "Categorizer", null, 1, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCategory_CategoryValue(), ecorePackage.getEJavaObject(), "CategoryValue", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categorizerEClass, Categorizer.class, "Categorizer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCategorizer__ConstructCategory(), this.getCategory(), "constructCategory", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCategorizer__GetCategoryValue__EObject(), ecorePackage.getEJavaObject(), "getCategoryValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCategorizer__GetCategoryLabel__Object(), ecorePackage.getEString(), "getCategoryLabel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCategorizer__IsValidElementType__EClass(), ecorePackage.getEBoolean(), "isValidElementType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(categorizerStructuralFeatureEClass, CategorizerStructuralFeature.class, "CategorizerStructuralFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategorizerStructuralFeature_Feature(), ecorePackage.getEStructuralFeature(), null, "Feature", null, 1, 1, CategorizerStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategorizerStructuralFeature_CategorizedType(), ecorePackage.getEClass(), null, "CategorizedType", null, 0, 1, CategorizerStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categorizerOclEClass, CategorizerOcl.class, "CategorizerOcl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategorizerOcl_Expression(), ecorePackage.getEString(), "Expression", null, 0, 1, CategorizerOcl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matcherEClass, Matcher.class, "Matcher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getMatcher__GetMatch__EObject_EObject(), this.getMatchStatus(), "getMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "ins1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "ins2", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(matchEClass, Match.class, "Match", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatch_Object1(), ecorePackage.getEObject(), null, "Object1", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_Object2(), ecorePackage.getEObject(), null, "Object2", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnizersEClass, Columnizers.class, "Columnizers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumnizers_Columnizers(), this.getColumnizerAbstract(), null, "Columnizers", null, 0, -1, Columnizers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataToolTypeEEnum, DataToolType.class, "DataToolType");
		addEEnumLiteral(dataToolTypeEEnum, DataToolType.NONE);
		addEEnumLiteral(dataToolTypeEEnum, DataToolType.EXTRACTOR);
		addEEnumLiteral(dataToolTypeEEnum, DataToolType.COLUMNIZER);
		addEEnumLiteral(dataToolTypeEEnum, DataToolType.CATEGORIZER);
		addEEnumLiteral(dataToolTypeEEnum, DataToolType.FILTER);
		addEEnumLiteral(dataToolTypeEEnum, DataToolType.PATH);

		initEEnum(matchStatusEEnum, MatchStatus.class, "MatchStatus");
		addEEnumLiteral(matchStatusEEnum, MatchStatus.BEFORE);
		addEEnumLiteral(matchStatusEEnum, MatchStatus.AFTER);
		addEEnumLiteral(matchStatusEEnum, MatchStatus.MATCH);

		// Initialize data types
		initEDataType(eObjectsSetEDataType, ObjectSet.class, "EObjectsSet", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DatatoolsPackageImpl
