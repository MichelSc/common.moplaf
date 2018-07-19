/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.Categorizer;
import com.misc.common.moplaf.datatools.CategorizerOcl;
import com.misc.common.moplaf.datatools.CategorizerStructuralFeature;
import com.misc.common.moplaf.datatools.Category;
import com.misc.common.moplaf.datatools.CategoryAbstract;
import com.misc.common.moplaf.datatools.Columnizer;
import com.misc.common.moplaf.datatools.ColumnizerColumn;
import com.misc.common.moplaf.datatools.ColumnizerColumnAttribute;
import com.misc.common.moplaf.datatools.ColumnizerColumnOcl;
import com.misc.common.moplaf.datatools.ColumnizerExplicit;
import com.misc.common.moplaf.datatools.ColumnizerGrid;
import com.misc.common.moplaf.datatools.DataTool;
import com.misc.common.moplaf.datatools.DataToolAbstract;
import com.misc.common.moplaf.datatools.DataTools;
import com.misc.common.moplaf.datatools.DatatoolsFactory;
import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.Extractor;
import com.misc.common.moplaf.datatools.ExtractorCompound;
import com.misc.common.moplaf.datatools.ExtractorFilter;
import com.misc.common.moplaf.datatools.ExtractorFilterAttribute;
import com.misc.common.moplaf.datatools.ExtractorFilterAttributeInt;
import com.misc.common.moplaf.datatools.ExtractorFilterOcl;
import com.misc.common.moplaf.datatools.ExtractorIntersection;
import com.misc.common.moplaf.datatools.ExtractorLogic;
import com.misc.common.moplaf.datatools.ExtractorOcl;
import com.misc.common.moplaf.datatools.ExtractorPath;
import com.misc.common.moplaf.datatools.ExtractorPipe;
import com.misc.common.moplaf.datatools.ExtractorType;
import com.misc.common.moplaf.datatools.ExtractorUnion;
import com.misc.common.moplaf.datatools.Match;
import com.misc.common.moplaf.datatools.Matcher;
import com.misc.common.moplaf.datatools.NavigationAxis;
import com.misc.common.moplaf.datatools.NavigationDowncast;
import com.misc.common.moplaf.datatools.NavigationPath;
import com.misc.common.moplaf.datatools.NavigationReference;

import com.misc.common.moplaf.datatools.SuperCategory;
import java.util.Set;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	private EClass extractorFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extractorFilterAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extractorFilterAttributeIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extractorFilterOclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnizerExplicitEClass = null;

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
	private EClass columnizerGridEClass = null;

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
	private EClass dataToolsEClass = null;

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
		return categorizerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCategorizer__ConstructCategory() {
		return categorizerEClass.getEOperations().get(1);
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
	public EOperation getExtractor__Extract__Set() {
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
	public EReference getCategoryAbstract_CategoryColumnizer() {
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
	public EOperation getCategoryAbstract__RefreshCats__Set_SuperCategory_int() {
		return categoryAbstractEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCategoryAbstract__SetColumnizerAll__Columnizer() {
		return categoryAbstractEClass.getEOperations().get(2);
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
	public EClass getExtractorPath() {
		return extractorPathEClass;
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
	public EClass getExtractorFilter() {
		return extractorFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtractorFilter__IsFiltered__EObject() {
		return extractorFilterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtractorFilterAttribute() {
		return extractorFilterAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtractorFilterAttribute__GetAttributeValue() {
		return extractorFilterAttributeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtractorFilterAttributeInt() {
		return extractorFilterAttributeIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtractorFilterAttributeInt_MinValue() {
		return (EAttribute)extractorFilterAttributeIntEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtractorFilterAttributeInt_MaxValue() {
		return (EAttribute)extractorFilterAttributeIntEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtractorFilterAttributeInt_Attribute() {
		return (EReference)extractorFilterAttributeIntEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtractorFilterOcl() {
		return extractorFilterOclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtractorFilterOcl_Expression() {
		return (EAttribute)extractorFilterOclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnizerExplicit() {
		return columnizerExplicitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnizerExplicit_Columns() {
		return (EReference)columnizerExplicitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnizerExplicit_Grids() {
		return (EReference)columnizerExplicitEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getColumnizerColumn_Name() {
		return (EAttribute)columnizerColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnizerColumn_Width() {
		return (EAttribute)columnizerColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnizerColumn_Grids() {
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
	public EReference getSuperCategory_Categorizers() {
		return (EReference)superCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperCategory__IsValidRoot__EObject() {
		return superCategoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperCategory__RefreshCats__Set() {
		return superCategoryEClass.getEOperations().get(1);
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
	public EOperation getNavigationAxis__Naviguate__EObject() {
		return navigationAxisEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNavigationAxis__NaviguateMany__EObject() {
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
	public EReference getMatcher_Matches() {
		return (EReference)matcherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMatcher__RefreshMatches__EObject_EObject() {
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
	public EClass getColumnizerGrid() {
		return columnizerGridEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnizerGrid_Columns() {
		return (EReference)columnizerGridEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnizerGrid_Name() {
		return (EAttribute)columnizerGridEClass.getEStructuralFeatures().get(1);
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
	public EClass getDataTools() {
		return dataToolsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTools_DataTools() {
		return (EReference)dataToolsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataTools__GetDomainTypes() {
		return dataToolsEClass.getEOperations().get(0);
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
	public EReference getDataTool_Context() {
		return (EReference)dataToolEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getDataToolAbstract_Name() {
		return (EAttribute)dataToolAbstractEClass.getEStructuralFeatures().get(0);
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
		createEOperation(navigationAxisEClass, NAVIGATION_AXIS___NAVIGUATE__EOBJECT);
		createEOperation(navigationAxisEClass, NAVIGATION_AXIS___NAVIGUATE_MANY__EOBJECT);

		navigationReferenceEClass = createEClass(NAVIGATION_REFERENCE);
		createEReference(navigationReferenceEClass, NAVIGATION_REFERENCE__REFERENCE);

		navigationDowncastEClass = createEClass(NAVIGATION_DOWNCAST);
		createEReference(navigationDowncastEClass, NAVIGATION_DOWNCAST__DOWNCAST_TYPE);

		dataToolsEClass = createEClass(DATA_TOOLS);
		createEReference(dataToolsEClass, DATA_TOOLS__DATA_TOOLS);
		createEOperation(dataToolsEClass, DATA_TOOLS___GET_DOMAIN_TYPES);

		dataToolEClass = createEClass(DATA_TOOL);
		createEReference(dataToolEClass, DATA_TOOL__CONTEXT);

		dataToolAbstractEClass = createEClass(DATA_TOOL_ABSTRACT);
		createEAttribute(dataToolAbstractEClass, DATA_TOOL_ABSTRACT__NAME);
		createEAttribute(dataToolAbstractEClass, DATA_TOOL_ABSTRACT__DESCRIPTION);

		extractorEClass = createEClass(EXTRACTOR);
		createEOperation(extractorEClass, EXTRACTOR___EXTRACT__SET);
		createEOperation(extractorEClass, EXTRACTOR___IS_VALID_ROOT__EOBJECT);

		extractorTypeEClass = createEClass(EXTRACTOR_TYPE);
		createEReference(extractorTypeEClass, EXTRACTOR_TYPE__TARGET_TYPE);

		extractorPathEClass = createEClass(EXTRACTOR_PATH);

		extractorOclEClass = createEClass(EXTRACTOR_OCL);
		createEAttribute(extractorOclEClass, EXTRACTOR_OCL__EXPRESSION);

		extractorFilterEClass = createEClass(EXTRACTOR_FILTER);
		createEOperation(extractorFilterEClass, EXTRACTOR_FILTER___IS_FILTERED__EOBJECT);

		extractorFilterAttributeEClass = createEClass(EXTRACTOR_FILTER_ATTRIBUTE);
		createEOperation(extractorFilterAttributeEClass, EXTRACTOR_FILTER_ATTRIBUTE___GET_ATTRIBUTE_VALUE);

		extractorFilterAttributeIntEClass = createEClass(EXTRACTOR_FILTER_ATTRIBUTE_INT);
		createEAttribute(extractorFilterAttributeIntEClass, EXTRACTOR_FILTER_ATTRIBUTE_INT__MIN_VALUE);
		createEAttribute(extractorFilterAttributeIntEClass, EXTRACTOR_FILTER_ATTRIBUTE_INT__MAX_VALUE);
		createEReference(extractorFilterAttributeIntEClass, EXTRACTOR_FILTER_ATTRIBUTE_INT__ATTRIBUTE);

		extractorFilterOclEClass = createEClass(EXTRACTOR_FILTER_OCL);
		createEAttribute(extractorFilterOclEClass, EXTRACTOR_FILTER_OCL__EXPRESSION);

		extractorCompoundEClass = createEClass(EXTRACTOR_COMPOUND);
		createEReference(extractorCompoundEClass, EXTRACTOR_COMPOUND__EXTRACTORS);

		extractorLogicEClass = createEClass(EXTRACTOR_LOGIC);

		extractorPipeEClass = createEClass(EXTRACTOR_PIPE);

		extractorUnionEClass = createEClass(EXTRACTOR_UNION);

		extractorIntersectionEClass = createEClass(EXTRACTOR_INTERSECTION);

		columnizerEClass = createEClass(COLUMNIZER);

		columnizerColumnEClass = createEClass(COLUMNIZER_COLUMN);
		createEAttribute(columnizerColumnEClass, COLUMNIZER_COLUMN__NAME);
		createEAttribute(columnizerColumnEClass, COLUMNIZER_COLUMN__WIDTH);
		createEReference(columnizerColumnEClass, COLUMNIZER_COLUMN__GRIDS);
		createEOperation(columnizerColumnEClass, COLUMNIZER_COLUMN___GET_VALUE__EOBJECT);

		columnizerExplicitEClass = createEClass(COLUMNIZER_EXPLICIT);
		createEReference(columnizerExplicitEClass, COLUMNIZER_EXPLICIT__COLUMNS);
		createEReference(columnizerExplicitEClass, COLUMNIZER_EXPLICIT__GRIDS);

		columnizerColumnAttributeEClass = createEClass(COLUMNIZER_COLUMN_ATTRIBUTE);
		createEReference(columnizerColumnAttributeEClass, COLUMNIZER_COLUMN_ATTRIBUTE__ATTRIBUTE);

		columnizerColumnOclEClass = createEClass(COLUMNIZER_COLUMN_OCL);
		createEAttribute(columnizerColumnOclEClass, COLUMNIZER_COLUMN_OCL__EXPRESSION);

		superCategoryEClass = createEClass(SUPER_CATEGORY);
		createEReference(superCategoryEClass, SUPER_CATEGORY__CATEGORIZERS);
		createEOperation(superCategoryEClass, SUPER_CATEGORY___IS_VALID_ROOT__EOBJECT);
		createEOperation(superCategoryEClass, SUPER_CATEGORY___REFRESH_CATS__SET);

		categoryEClass = createEClass(CATEGORY);
		createEReference(categoryEClass, CATEGORY__CATEGORIZER);
		createEAttribute(categoryEClass, CATEGORY__CATEGORY_VALUE);

		categorizerEClass = createEClass(CATEGORIZER);
		createEOperation(categorizerEClass, CATEGORIZER___GET_CATEGORY_VALUE__EOBJECT);
		createEOperation(categorizerEClass, CATEGORIZER___CONSTRUCT_CATEGORY);

		categoryAbstractEClass = createEClass(CATEGORY_ABSTRACT);
		createEReference(categoryAbstractEClass, CATEGORY_ABSTRACT__SUB_CATEGORIES);
		createEReference(categoryAbstractEClass, CATEGORY_ABSTRACT__ELEMENTS);
		createEAttribute(categoryAbstractEClass, CATEGORY_ABSTRACT__NB_ELEMENTS);
		createEAttribute(categoryAbstractEClass, CATEGORY_ABSTRACT__CATEGORY_LABEL);
		createEReference(categoryAbstractEClass, CATEGORY_ABSTRACT__CATEGORY_COLUMNIZER);
		createEOperation(categoryAbstractEClass, CATEGORY_ABSTRACT___GET_SUBCATEGORY__EOBJECT);
		createEOperation(categoryAbstractEClass, CATEGORY_ABSTRACT___REFRESH_CATS__SET_SUPERCATEGORY_INT);
		createEOperation(categoryAbstractEClass, CATEGORY_ABSTRACT___SET_COLUMNIZER_ALL__COLUMNIZER);

		categorizerStructuralFeatureEClass = createEClass(CATEGORIZER_STRUCTURAL_FEATURE);
		createEReference(categorizerStructuralFeatureEClass, CATEGORIZER_STRUCTURAL_FEATURE__FEATURE);

		categorizerOclEClass = createEClass(CATEGORIZER_OCL);
		createEAttribute(categorizerOclEClass, CATEGORIZER_OCL__EXPRESSION);

		matcherEClass = createEClass(MATCHER);
		createEReference(matcherEClass, MATCHER__MATCHES);
		createEOperation(matcherEClass, MATCHER___REFRESH_MATCHES__EOBJECT_EOBJECT);

		matchEClass = createEClass(MATCH);
		createEReference(matchEClass, MATCH__OBJECT1);
		createEReference(matchEClass, MATCH__OBJECT2);

		columnizerGridEClass = createEClass(COLUMNIZER_GRID);
		createEReference(columnizerGridEClass, COLUMNIZER_GRID__COLUMNS);
		createEAttribute(columnizerGridEClass, COLUMNIZER_GRID__NAME);

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
		navigationPathEClass.getESuperTypes().add(this.getDataTool());
		navigationReferenceEClass.getESuperTypes().add(this.getNavigationAxis());
		navigationDowncastEClass.getESuperTypes().add(this.getNavigationAxis());
		dataToolAbstractEClass.getESuperTypes().add(this.getDataTool());
		extractorEClass.getESuperTypes().add(this.getDataToolAbstract());
		extractorTypeEClass.getESuperTypes().add(this.getExtractor());
		extractorPathEClass.getESuperTypes().add(this.getExtractor());
		extractorPathEClass.getESuperTypes().add(this.getNavigationPath());
		extractorOclEClass.getESuperTypes().add(this.getExtractor());
		extractorFilterEClass.getESuperTypes().add(this.getExtractor());
		extractorFilterAttributeEClass.getESuperTypes().add(this.getExtractorFilter());
		extractorFilterAttributeEClass.getESuperTypes().add(this.getNavigationPath());
		extractorFilterAttributeIntEClass.getESuperTypes().add(this.getExtractorFilterAttribute());
		extractorFilterOclEClass.getESuperTypes().add(this.getExtractorFilter());
		extractorCompoundEClass.getESuperTypes().add(this.getExtractor());
		extractorLogicEClass.getESuperTypes().add(this.getExtractorCompound());
		extractorPipeEClass.getESuperTypes().add(this.getExtractorCompound());
		extractorUnionEClass.getESuperTypes().add(this.getExtractorLogic());
		extractorIntersectionEClass.getESuperTypes().add(this.getExtractorLogic());
		columnizerEClass.getESuperTypes().add(this.getDataToolAbstract());
		columnizerExplicitEClass.getESuperTypes().add(this.getColumnizer());
		columnizerColumnAttributeEClass.getESuperTypes().add(this.getColumnizerColumn());
		columnizerColumnAttributeEClass.getESuperTypes().add(this.getNavigationPath());
		columnizerColumnOclEClass.getESuperTypes().add(this.getColumnizerColumn());
		superCategoryEClass.getESuperTypes().add(this.getCategoryAbstract());
		categoryEClass.getESuperTypes().add(this.getCategoryAbstract());
		categorizerEClass.getESuperTypes().add(this.getDataToolAbstract());
		categorizerStructuralFeatureEClass.getESuperTypes().add(this.getCategorizer());
		categorizerStructuralFeatureEClass.getESuperTypes().add(this.getNavigationPath());
		categorizerOclEClass.getESuperTypes().add(this.getCategorizer());

		// Initialize classes, features, and operations; add parameters
		initEClass(navigationPathEClass, NavigationPath.class, "NavigationPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNavigationPath_PathElements(), this.getNavigationAxis(), this.getNavigationAxis_Path(), "PathElements", null, 0, -1, NavigationPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNavigationPath_SourceType(), ecorePackage.getEClass(), null, "SourceType", null, 0, 1, NavigationPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNavigationPath_TargetType(), ecorePackage.getEClass(), null, "TargetType", null, 0, 1, NavigationPath.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavigationPath_Many(), ecorePackage.getEBoolean(), "Many", null, 0, 1, NavigationPath.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavigationPath_Path(), ecorePackage.getEString(), "Path", null, 0, 1, NavigationPath.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(navigationAxisEClass, NavigationAxis.class, "NavigationAxis", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNavigationAxis_SourceType(), ecorePackage.getEClass(), null, "SourceType", null, 0, 1, NavigationAxis.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNavigationAxis_TargetType(), ecorePackage.getEClass(), null, "TargetType", null, 0, 1, NavigationAxis.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNavigationAxis_Path(), this.getNavigationPath(), this.getNavigationPath_PathElements(), "Path", null, 1, 1, NavigationAxis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNavigationAxis_Previous(), this.getNavigationAxis(), null, "Previous", null, 0, 1, NavigationAxis.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavigationAxis_PathElement(), ecorePackage.getEString(), "PathElement", null, 0, 1, NavigationAxis.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getNavigationAxis__Naviguate__EObject(), ecorePackage.getEObject(), "naviguate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "in", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNavigationAxis__NaviguateMany__EObject(), ecorePackage.getEObject(), "naviguateMany", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "in", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(navigationReferenceEClass, NavigationReference.class, "NavigationReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNavigationReference_Reference(), ecorePackage.getEReference(), null, "Reference", null, 1, 1, NavigationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navigationDowncastEClass, NavigationDowncast.class, "NavigationDowncast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNavigationDowncast_DowncastType(), ecorePackage.getEClass(), null, "DowncastType", null, 0, 1, NavigationDowncast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataToolsEClass, DataTools.class, "DataTools", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTools_DataTools(), this.getDataTool(), null, "DataTools", null, 0, -1, DataTools.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDataTools__GetDomainTypes(), ecorePackage.getEClass(), "getDomainTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataToolEClass, DataTool.class, "DataTool", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTool_Context(), this.getDataTools(), null, "Context", null, 0, 1, DataTool.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dataToolAbstractEClass, DataToolAbstract.class, "DataToolAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataToolAbstract_Name(), ecorePackage.getEString(), "Name", null, 0, 1, DataToolAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataToolAbstract_Description(), ecorePackage.getEString(), "Description", null, 0, 1, DataToolAbstract.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(extractorEClass, Extractor.class, "Extractor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getExtractor__Extract__Set(), this.getEObjectsSet(), "extract", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEObjectsSet(), "ins", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExtractor__IsValidRoot__EObject(), ecorePackage.getEBoolean(), "isValidRoot", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "doc", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(extractorTypeEClass, ExtractorType.class, "ExtractorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtractorType_TargetType(), ecorePackage.getEClass(), null, "TargetType", null, 0, 1, ExtractorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extractorPathEClass, ExtractorPath.class, "ExtractorPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(extractorOclEClass, ExtractorOcl.class, "ExtractorOcl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtractorOcl_Expression(), ecorePackage.getEString(), "Expression", null, 0, 1, ExtractorOcl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extractorFilterEClass, ExtractorFilter.class, "ExtractorFilter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getExtractorFilter__IsFiltered__EObject(), null, "isFiltered", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(extractorFilterAttributeEClass, ExtractorFilterAttribute.class, "ExtractorFilterAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getExtractorFilterAttribute__GetAttributeValue(), ecorePackage.getEJavaObject(), "getAttributeValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(extractorFilterAttributeIntEClass, ExtractorFilterAttributeInt.class, "ExtractorFilterAttributeInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtractorFilterAttributeInt_MinValue(), ecorePackage.getEInt(), "MinValue", null, 0, 1, ExtractorFilterAttributeInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtractorFilterAttributeInt_MaxValue(), ecorePackage.getEInt(), "MaxValue", null, 0, 1, ExtractorFilterAttributeInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtractorFilterAttributeInt_Attribute(), ecorePackage.getEAttribute(), null, "Attribute", null, 1, 1, ExtractorFilterAttributeInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extractorFilterOclEClass, ExtractorFilterOcl.class, "ExtractorFilterOcl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtractorFilterOcl_Expression(), ecorePackage.getEString(), "Expression", null, 0, 1, ExtractorFilterOcl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extractorCompoundEClass, ExtractorCompound.class, "ExtractorCompound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtractorCompound_Extractors(), this.getExtractor(), null, "Extractors", null, 0, -1, ExtractorCompound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extractorLogicEClass, ExtractorLogic.class, "ExtractorLogic", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(extractorPipeEClass, ExtractorPipe.class, "ExtractorPipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(extractorUnionEClass, ExtractorUnion.class, "ExtractorUnion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(extractorIntersectionEClass, ExtractorIntersection.class, "ExtractorIntersection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(columnizerEClass, Columnizer.class, "Columnizer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(columnizerColumnEClass, ColumnizerColumn.class, "ColumnizerColumn", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumnizerColumn_Name(), ecorePackage.getEString(), "Name", null, 0, 1, ColumnizerColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnizerColumn_Width(), ecorePackage.getEInt(), "Width", null, 0, 1, ColumnizerColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumnizerColumn_Grids(), this.getColumnizerGrid(), this.getColumnizerGrid_Columns(), "Grids", null, 0, 1, ColumnizerColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getColumnizerColumn__GetValue__EObject(), ecorePackage.getEJavaObject(), "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(columnizerExplicitEClass, ColumnizerExplicit.class, "ColumnizerExplicit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumnizerExplicit_Columns(), this.getColumnizerColumn(), null, "Columns", null, 0, -1, ColumnizerExplicit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumnizerExplicit_Grids(), this.getColumnizerGrid(), null, "Grids", null, 0, -1, ColumnizerExplicit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnizerColumnAttributeEClass, ColumnizerColumnAttribute.class, "ColumnizerColumnAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumnizerColumnAttribute_Attribute(), ecorePackage.getEAttribute(), null, "Attribute", null, 1, 1, ColumnizerColumnAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnizerColumnOclEClass, ColumnizerColumnOcl.class, "ColumnizerColumnOcl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumnizerColumnOcl_Expression(), ecorePackage.getEString(), "Expression", null, 0, 1, ColumnizerColumnOcl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(superCategoryEClass, SuperCategory.class, "SuperCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSuperCategory_Categorizers(), this.getCategorizer(), null, "Categorizers", null, 0, -1, SuperCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSuperCategory__IsValidRoot__EObject(), ecorePackage.getEBoolean(), "isValidRoot", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "doc", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSuperCategory__RefreshCats__Set(), null, "refreshCats", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEObjectsSet(), "ins", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategory_Categorizer(), this.getCategorizer(), null, "Categorizer", null, 1, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCategory_CategoryValue(), ecorePackage.getEJavaObject(), "CategoryValue", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categorizerEClass, Categorizer.class, "Categorizer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getCategorizer__GetCategoryValue__EObject(), ecorePackage.getEJavaObject(), "getCategoryValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCategorizer__ConstructCategory(), this.getCategory(), "constructCategory", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(categoryAbstractEClass, CategoryAbstract.class, "CategoryAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategoryAbstract_SubCategories(), this.getCategory(), null, "SubCategories", null, 0, -1, CategoryAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategoryAbstract_Elements(), ecorePackage.getEObject(), null, "Elements", null, 0, -1, CategoryAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCategoryAbstract_NbElements(), ecorePackage.getEInt(), "NbElements", null, 0, 1, CategoryAbstract.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCategoryAbstract_CategoryLabel(), ecorePackage.getEString(), "CategoryLabel", null, 0, 1, CategoryAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCategoryAbstract_CategoryColumnizer(), this.getColumnizer(), null, "CategoryColumnizer", null, 0, 1, CategoryAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCategoryAbstract__GetSubcategory__EObject(), this.getCategory(), "getSubcategory", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCategoryAbstract__RefreshCats__Set_SuperCategory_int(), null, "refreshCats", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEObjectsSet(), "tobe", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSuperCategory(), "categorizer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "level", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCategoryAbstract__SetColumnizerAll__Columnizer(), null, "setColumnizerAll", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getColumnizer(), "columnizer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(categorizerStructuralFeatureEClass, CategorizerStructuralFeature.class, "CategorizerStructuralFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategorizerStructuralFeature_Feature(), ecorePackage.getEStructuralFeature(), null, "Feature", null, 1, 1, CategorizerStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categorizerOclEClass, CategorizerOcl.class, "CategorizerOcl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategorizerOcl_Expression(), ecorePackage.getEString(), "Expression", null, 0, 1, CategorizerOcl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matcherEClass, Matcher.class, "Matcher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatcher_Matches(), this.getMatch(), null, "Matches", null, 0, -1, Matcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMatcher__RefreshMatches__EObject_EObject(), null, "refreshMatches", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "ins1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "ins2", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(matchEClass, Match.class, "Match", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatch_Object1(), ecorePackage.getEObject(), null, "Object1", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_Object2(), ecorePackage.getEObject(), null, "Object2", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnizerGridEClass, ColumnizerGrid.class, "ColumnizerGrid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumnizerGrid_Columns(), this.getColumnizerColumn(), this.getColumnizerColumn_Grids(), "Columns", null, 0, -1, ColumnizerGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnizerGrid_Name(), ecorePackage.getEString(), "Name", null, 0, 1, ColumnizerGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(eObjectsSetEDataType, Set.class, "EObjectsSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.Set<org.eclipse.emf.ecore.EObject>");

		// Create resource
		createResource(eNS_URI);
	}

} //DatatoolsPackageImpl
