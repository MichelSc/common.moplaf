/**
 */
package com.misc.common.moplaf.dbsynch.impl;

import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.dbsynch.DataSource;
import com.misc.common.moplaf.dbsynch.DbSynchPackage;
import com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract;
import com.misc.common.moplaf.dbsynch.Table;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Abstract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.DbSynchUnitAbstractImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.DbSynchUnitAbstractImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.DbSynchUnitAbstractImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.DbSynchUnitAbstractImpl#getChildUnits <em>Child Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DbSynchUnitAbstractImpl extends MinimalEObjectImpl.Container implements DbSynchUnitAbstract {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DbSynchUnitAbstractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbSynchPackage.Literals.DB_SYNCH_UNIT_ABSTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<DbSynchUnitAbstract> getChildUnits() {
		EList<DbSynchUnitAbstract> newList = new EObjectEList<DbSynchUnitAbstract>(DbSynchUnitAbstract.class, this, DbSynchPackage.DB_SYNCH_UNIT_ABSTRACT__CHILD_UNITS);
		for ( EObject element : this.eContents()){
			if ( element instanceof DbSynchUnitAbstract){
				newList.add((DbSynchUnitAbstract)element);
			}
		}
		return newList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Table> getTables() {
		EList<Table> newList = new EObjectEList<Table>(Table.class, this, DbSynchPackage.DB_SYNCH_UNIT_ABSTRACT__TABLES);
		for ( EObject element : this.eContents()){
			if ( element instanceof Table){
				newList.add((Table)element);
			}
		}
		return newList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource getDataSource() {
		DataSource dataSource = basicGetDataSource();
		return dataSource != null && dataSource.eIsProxy() ? (DataSource)eResolveProxy((InternalEObject)dataSource) : dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource basicGetDataSource() {
		// TODO: implement this method to return the 'Data Source' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbSynchPackage.DB_SYNCH_UNIT_ABSTRACT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshMetaData() {
		// refresh this synchUnit
		this.refreshMetaDataImpl();
		// refresh its children
		for ( DbSynchUnitAbstract childUnit : this.getChildUnits()){
			childUnit.refreshMetaData();
		}
		// refresh its tables
		for ( Table childTable : this.getTables()){
			childTable.refreshMetaData();
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Default implementation does nothing.
	 * <p>
	 * The implementation may overload it in order
	 * <ul>
	 *   <li> to add tables: {@link #addTable(EReference, EClass)}</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 */
	protected void refreshMetaDataImpl() {
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ReturnFeedback synchUp() {
		for ( Table table : this.getTables()){
			ReturnFeedback feedback = table.synchUp();
			if ( feedback.isFailure()) { return feedback; }
			
		}
		for ( DbSynchUnitAbstract synchUnit : this.getChildUnits()){
			ReturnFeedback feedback = synchUnit.synchUp();
			if ( feedback.isFailure()) { return feedback; }
		}
		return ReturnFeedback.SUCCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ReturnFeedback synchDown() {
		for ( Table table : this.getTables()){
			ReturnFeedback feedback = table.synchDown();
			if ( feedback.isFailure()) { return feedback; }
			
		}
		for ( DbSynchUnitAbstract synchUnit : this.getChildUnits()){
			ReturnFeedback feedback = synchUnit.synchDown();
			if ( feedback.isFailure()) { return feedback; }
		}
		return ReturnFeedback.SUCCESS;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Object getParamValue(EAttribute attribute) {
		Class<?> attributeClass = attribute.getContainerClass();
		if ( attributeClass.isInstance(this) ){
			return this.eGet(attribute);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Object> getParamAttributes() {
		EList<Object> attributesToReturn = new BasicEList<Object>();
		EList<EAttribute> allAttributes = this.eClass().getEAllAttributes();
		for ( EAttribute aAttribute : allAttributes){
			String packageName = aAttribute.getEContainingClass().getEPackage().getNsURI(); 
			if ( !packageName.contains("common/moplaf")){
				attributesToReturn.add(aAttribute);
			}
		}
		return attributesToReturn;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addTable(EReference reference, EClass class_) {
		Table tableAsIs = (Table)this.eGet(reference);
		if ( tableAsIs!=null && tableAsIs.eClass()==class_){ return; }
		EFactory factory = class_.getEPackage().getEFactoryInstance();
		Table tableToBe = (Table)factory.create(class_);
		this.eSet(reference, tableToBe);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbSynchPackage.DB_SYNCH_UNIT_ABSTRACT__TABLES:
				return getTables();
			case DbSynchPackage.DB_SYNCH_UNIT_ABSTRACT__DATA_SOURCE:
				if (resolve) return getDataSource();
				return basicGetDataSource();
			case DbSynchPackage.DB_SYNCH_UNIT_ABSTRACT__NAME:
				return getName();
			case DbSynchPackage.DB_SYNCH_UNIT_ABSTRACT__CHILD_UNITS:
				return getChildUnits();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DbSynchPackage.DB_SYNCH_UNIT_ABSTRACT__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DbSynchPackage.DB_SYNCH_UNIT_ABSTRACT__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DbSynchPackage.DB_SYNCH_UNIT_ABSTRACT__TABLES:
				return !getTables().isEmpty();
			case DbSynchPackage.DB_SYNCH_UNIT_ABSTRACT__DATA_SOURCE:
				return basicGetDataSource() != null;
			case DbSynchPackage.DB_SYNCH_UNIT_ABSTRACT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DbSynchPackage.DB_SYNCH_UNIT_ABSTRACT__CHILD_UNITS:
				return !getChildUnits().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DbSynchPackage.DB_SYNCH_UNIT_ABSTRACT___REFRESH_META_DATA:
				refreshMetaData();
				return null;
			case DbSynchPackage.DB_SYNCH_UNIT_ABSTRACT___SYNCH_UP:
				return synchUp();
			case DbSynchPackage.DB_SYNCH_UNIT_ABSTRACT___SYNCH_DOWN:
				return synchDown();
			case DbSynchPackage.DB_SYNCH_UNIT_ABSTRACT___GET_PARAM_VALUE__EATTRIBUTE:
				return getParamValue((EAttribute)arguments.get(0));
			case DbSynchPackage.DB_SYNCH_UNIT_ABSTRACT___GET_PARAM_ATTRIBUTES:
				return getParamAttributes();
			case DbSynchPackage.DB_SYNCH_UNIT_ABSTRACT___ADD_TABLE__EREFERENCE_ECLASS:
				addTable((EReference)arguments.get(0), (EClass)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DbSynchUnitAbstractImpl
