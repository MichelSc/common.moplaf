/**
 */
package com.misc.common.moplaf.dbsynch.dbsynchderby.impl;

import com.misc.common.moplaf.dbsynch.DbSynchPackage;
import com.misc.common.moplaf.dbsynch.dbsynchderby.DataSourceJdbcDerbyEmbedded;
import com.misc.common.moplaf.dbsynch.dbsynchderby.DbsynchderbyFactory;
import com.misc.common.moplaf.dbsynch.dbsynchderby.DbsynchderbyPackage;

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
public class DbsynchderbyPackageImpl extends EPackageImpl implements DbsynchderbyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceJdbcDerbyEmbeddedEClass = null;
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
	 * @see com.misc.common.moplaf.dbsynch.dbsynchderby.DbsynchderbyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DbsynchderbyPackageImpl() {
		super(eNS_URI, DbsynchderbyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DbsynchderbyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DbsynchderbyPackage init() {
		if (isInited) return (DbsynchderbyPackage)EPackage.Registry.INSTANCE.getEPackage(DbsynchderbyPackage.eNS_URI);

		// Obtain or create and register package
		DbsynchderbyPackageImpl theDbsynchderbyPackage = (DbsynchderbyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DbsynchderbyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DbsynchderbyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DbSynchPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDbsynchderbyPackage.createPackageContents();

		// Initialize created meta-data
		theDbsynchderbyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDbsynchderbyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DbsynchderbyPackage.eNS_URI, theDbsynchderbyPackage);
		return theDbsynchderbyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSourceJdbcDerbyEmbedded() {
		return dataSourceJdbcDerbyEmbeddedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceJdbcDerbyEmbedded_DatabasePath() {
		return (EAttribute)dataSourceJdbcDerbyEmbeddedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbsynchderbyFactory getDbsynchderbyFactory() {
		return (DbsynchderbyFactory)getEFactoryInstance();
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
		dataSourceJdbcDerbyEmbeddedEClass = createEClass(DATA_SOURCE_JDBC_DERBY_EMBEDDED);
		createEAttribute(dataSourceJdbcDerbyEmbeddedEClass, DATA_SOURCE_JDBC_DERBY_EMBEDDED__DATABASE_PATH);
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
		DbSynchPackage theDbSynchPackage = (DbSynchPackage)EPackage.Registry.INSTANCE.getEPackage(DbSynchPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataSourceJdbcDerbyEmbeddedEClass.getESuperTypes().add(theDbSynchPackage.getDataSourceJdbc());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataSourceJdbcDerbyEmbeddedEClass, DataSourceJdbcDerbyEmbedded.class, "DataSourceJdbcDerbyEmbedded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSourceJdbcDerbyEmbedded_DatabasePath(), ecorePackage.getEString(), "DatabasePath", null, 0, 1, DataSourceJdbcDerbyEmbedded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DbsynchderbyPackageImpl
