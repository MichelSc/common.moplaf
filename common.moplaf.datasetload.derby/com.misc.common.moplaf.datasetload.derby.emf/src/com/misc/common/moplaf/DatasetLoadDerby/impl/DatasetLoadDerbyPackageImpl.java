/**
 */
package com.misc.common.moplaf.DatasetLoadDerby.impl;

import com.misc.common.moplaf.DatasetLoadDerby.DataSourceJdbDerbyEmbedded;
import com.misc.common.moplaf.DatasetLoadDerby.DatasetLoadDerbyFactory;
import com.misc.common.moplaf.DatasetLoadDerby.DatasetLoadDerbyPackage;

import com.misc.common.moplaf.datasetload.DatasetloadPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatasetLoadDerbyPackageImpl extends EPackageImpl implements DatasetLoadDerbyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceJdbDerbyEmbeddedEClass = null;

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
	 * @see com.misc.common.moplaf.DatasetLoadDerby.DatasetLoadDerbyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatasetLoadDerbyPackageImpl() {
		super(eNS_URI, DatasetLoadDerbyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DatasetLoadDerbyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatasetLoadDerbyPackage init() {
		if (isInited) return (DatasetLoadDerbyPackage)EPackage.Registry.INSTANCE.getEPackage(DatasetLoadDerbyPackage.eNS_URI);

		// Obtain or create and register package
		DatasetLoadDerbyPackageImpl theDatasetLoadDerbyPackage = (DatasetLoadDerbyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatasetLoadDerbyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatasetLoadDerbyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DatasetloadPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDatasetLoadDerbyPackage.createPackageContents();

		// Initialize created meta-data
		theDatasetLoadDerbyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatasetLoadDerbyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatasetLoadDerbyPackage.eNS_URI, theDatasetLoadDerbyPackage);
		return theDatasetLoadDerbyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSourceJdbDerbyEmbedded() {
		return dataSourceJdbDerbyEmbeddedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceJdbDerbyEmbedded_DatabasePath() {
		return (EAttribute)dataSourceJdbDerbyEmbeddedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetLoadDerbyFactory getDatasetLoadDerbyFactory() {
		return (DatasetLoadDerbyFactory)getEFactoryInstance();
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
		dataSourceJdbDerbyEmbeddedEClass = createEClass(DATA_SOURCE_JDB_DERBY_EMBEDDED);
		createEAttribute(dataSourceJdbDerbyEmbeddedEClass, DATA_SOURCE_JDB_DERBY_EMBEDDED__DATABASE_PATH);
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

		// Obtain other dependent packages
		DatasetloadPackage theDatasetloadPackage = (DatasetloadPackage)EPackage.Registry.INSTANCE.getEPackage(DatasetloadPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataSourceJdbDerbyEmbeddedEClass.getESuperTypes().add(theDatasetloadPackage.getDataSourceJdbc());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataSourceJdbDerbyEmbeddedEClass, DataSourceJdbDerbyEmbedded.class, "DataSourceJdbDerbyEmbedded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSourceJdbDerbyEmbedded_DatabasePath(), ecorePackage.getEString(), "DatabasePath", null, 0, 1, DataSourceJdbDerbyEmbedded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DatasetLoadDerbyPackageImpl
