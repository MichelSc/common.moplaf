/**
 */
package com.misc.common.moplaf.dbsynch.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

import com.misc.common.moplaf.dbsynch.DbSynchPackage;
import com.misc.common.moplaf.dbsynch.EnumModification;
import com.misc.common.moplaf.dbsynch.Table;
import com.misc.common.moplaf.dbsynch.TableColumn;
import com.misc.common.moplaf.dbsynch.TableRow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableRowImpl#getTable <em>Table</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableRowImpl#getKey <em>Key</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableRowImpl#getOldKey <em>Old Key</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableRowImpl#isDeleted <em>Deleted</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableRowImpl#isOldDeleted <em>Old Deleted</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableRowImpl#getModificationLastSynchUp <em>Modification Last Synch Up</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableRowImpl#getModificationNextSynchDown <em>Modification Next Synch Down</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TableRowImpl extends MinimalEObjectImpl.Container implements TableRow {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final TableRowKeyImpl KEY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOldKey() <em>Old Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldKey()
	 * @generated
	 * @ordered
	 */
	protected static final TableRowKeyImpl OLD_KEY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isDeleted() <em>Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeleted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELETED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDeleted() <em>Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeleted()
	 * @generated
	 * @ordered
	 */
	protected boolean deleted = DELETED_EDEFAULT;

	/**
	 * The default value of the '{@link #isOldDeleted() <em>Old Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOldDeleted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OLD_DELETED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getModificationLastSynchUp() <em>Modification Last Synch Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificationLastSynchUp()
	 * @generated
	 * @ordered
	 */
	protected static final EnumModification MODIFICATION_LAST_SYNCH_UP_EDEFAULT = EnumModification.ENUM_MODIFICATION_NONE;

	/**
	 * The cached value of the '{@link #getModificationLastSynchUp() <em>Modification Last Synch Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificationLastSynchUp()
	 * @generated
	 * @ordered
	 */
	protected EnumModification modificationLastSynchUp = MODIFICATION_LAST_SYNCH_UP_EDEFAULT;

	/**
	 * The default value of the '{@link #getModificationNextSynchDown() <em>Modification Next Synch Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificationNextSynchDown()
	 * @generated
	 * @ordered
	 */
	protected static final EnumModification MODIFICATION_NEXT_SYNCH_DOWN_EDEFAULT = EnumModification.ENUM_MODIFICATION_NONE;

	/**
	 * The cached value of the '{@link #getModificationNextSynchDown() <em>Modification Next Synch Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificationNextSynchDown()
	 * @generated
	 * @ordered
	 */
	protected EnumModification modificationNextSynchDown = MODIFICATION_NEXT_SYNCH_DOWN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected TableRowImpl() {
		super();
		this.eAdapters().add(new AdapterImpl(){

			@Override
			public void notifyChanged(Notification msg) {
				// TODO Auto-generated method stub
				super.notifyChanged(msg);
				TableRowImpl.this.notifyChanged(msg);
			}
			
		});
	}
	
	private TableRowKeyImpl lastKey = null;
	private boolean         lastDeleted = false;

	
	/**
	 * when this table is deleted, ignore the changes
	 * when the field deleted becomes true, 
	 * 
	 * @param msg
	 */
	private void notifyChanged(Notification msg){
		Resource resource = this.eResource();
		if (resource == null) { return ; } // no resource means object under construction means not loading
		
		if (!(resource instanceof ResourceImpl) ) { return ; }
		ResourceImpl r = (ResourceImpl) resource;
		if (r.isLoading() ){ return; }

		if ( msg.isTouch() ) { return ; }
		
		boolean some_modified = msg.getFeature() == DbSynchPackage.Literals.TABLE_ROW__DELETED;
		for ( TableColumn column: this.getTable().getColumns()){
			if ( column.getRowAttribute()==msg.getFeature() ){
				some_modified = true;
			}
		}
		if ( !some_modified ) { return; }
		
		if ( this.getModificationNextSynchDown() == EnumModification.ENUM_MODIFICATION_NONE){
			// so far the row is synchronous
			// get the last key and the last deleted
			this.lastDeleted = msg.getFeature()== DbSynchPackage.Literals.TABLE_ROW__DELETED
					         ? msg.getOldBooleanValue()
					         : this.isDeleted();
			Object[] keys = new Object[this.getTable().getKeyColumns().size()];
			int keyindex = 0;
			for ( TableColumn keyColumn : this.getTable().getKeyColumns()){
				Object attributeValue = keyColumn.getRowAttribute()==msg.getFeature()
						              ? msg.getOldValue()
						              : this.eGet(keyColumn.getRowAttribute());
				keys[keyindex] = attributeValue;
				keyindex++;
			}
			this.lastKey = new TableRowKeyImpl(keys);
		}
		
		EnumModification nextModification = EnumModification.ENUM_MODIFICATION_NONE;
		if ( this.lastDeleted && !this.isDeleted()){
			nextModification = EnumModification.ENUM_MODIFICATION_CREATE;
		} else if ( !this.lastDeleted && this.isDeleted()){
			nextModification = EnumModification.ENUM_MODIFICATION_DELETE;
		} else if ( !this.lastDeleted && !this.isDeleted()){
			if ( this.lastKey.equals(this.getKey())){
				// some change and but not the key and not deleted, so this is an update
				nextModification = EnumModification.ENUM_MODIFICATION_UPDATE;
			} else {
				// the key has changed!
				nextModification = EnumModification.ENUM_MODIFICATION_MUTATEKEY; 
			}
		}
		this.setModificationNextSynchDown(nextModification);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbSynchPackage.Literals.TABLE_ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTable() {
		Table table = basicGetTable();
		return table != null && table.eIsProxy() ? (Table)eResolveProxy((InternalEObject)table) : table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Table basicGetTable() {
		if ( (this.eContainer() instanceof Table) ){
			return (Table)this.eContainer();
		}
		throw new RuntimeException("TableRow: the owner must be a Table");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public TableRowKeyImpl getKey() {
		Table table = this.getTable();
		Object[] key = new Object[table.getKeyColumns().size()];
		int keyindex = 0;
		for ( TableColumn keyColumn : table.getKeyColumns()){
			Object attributeValue = this.eGet(keyColumn.getRowAttribute());
			key[keyindex] = attributeValue;
			keyindex++;
		}
		TableRowKeyImpl  thekey = new TableRowKeyImpl(key);
		  
		return thekey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public TableRowKeyImpl getOldKey() {
		return this.lastKey;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumModification getModificationLastSynchUp() {
		return modificationLastSynchUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModificationLastSynchUp(EnumModification newModificationLastSynchUp) {
		EnumModification oldModificationLastSynchUp = modificationLastSynchUp;
		modificationLastSynchUp = newModificationLastSynchUp == null ? MODIFICATION_LAST_SYNCH_UP_EDEFAULT : newModificationLastSynchUp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbSynchPackage.TABLE_ROW__MODIFICATION_LAST_SYNCH_UP, oldModificationLastSynchUp, modificationLastSynchUp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumModification getModificationNextSynchDown() {
		return modificationNextSynchDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModificationNextSynchDown(EnumModification newModificationNextSynchDown) {
		EnumModification oldModificationNextSynchDown = modificationNextSynchDown;
		modificationNextSynchDown = newModificationNextSynchDown == null ? MODIFICATION_NEXT_SYNCH_DOWN_EDEFAULT : newModificationNextSynchDown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbSynchPackage.TABLE_ROW__MODIFICATION_NEXT_SYNCH_DOWN, oldModificationNextSynchDown, modificationNextSynchDown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeleted() {
		return deleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleted(boolean newDeleted) {
		boolean oldDeleted = deleted;
		deleted = newDeleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbSynchPackage.TABLE_ROW__DELETED, oldDeleted, deleted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOldDeleted() {
		// TODO: implement this method to return the 'Old Deleted' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbSynchPackage.TABLE_ROW__TABLE:
				if (resolve) return getTable();
				return basicGetTable();
			case DbSynchPackage.TABLE_ROW__KEY:
				return getKey();
			case DbSynchPackage.TABLE_ROW__OLD_KEY:
				return getOldKey();
			case DbSynchPackage.TABLE_ROW__DELETED:
				return isDeleted();
			case DbSynchPackage.TABLE_ROW__OLD_DELETED:
				return isOldDeleted();
			case DbSynchPackage.TABLE_ROW__MODIFICATION_LAST_SYNCH_UP:
				return getModificationLastSynchUp();
			case DbSynchPackage.TABLE_ROW__MODIFICATION_NEXT_SYNCH_DOWN:
				return getModificationNextSynchDown();
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
			case DbSynchPackage.TABLE_ROW__DELETED:
				setDeleted((Boolean)newValue);
				return;
			case DbSynchPackage.TABLE_ROW__MODIFICATION_LAST_SYNCH_UP:
				setModificationLastSynchUp((EnumModification)newValue);
				return;
			case DbSynchPackage.TABLE_ROW__MODIFICATION_NEXT_SYNCH_DOWN:
				setModificationNextSynchDown((EnumModification)newValue);
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
			case DbSynchPackage.TABLE_ROW__DELETED:
				setDeleted(DELETED_EDEFAULT);
				return;
			case DbSynchPackage.TABLE_ROW__MODIFICATION_LAST_SYNCH_UP:
				setModificationLastSynchUp(MODIFICATION_LAST_SYNCH_UP_EDEFAULT);
				return;
			case DbSynchPackage.TABLE_ROW__MODIFICATION_NEXT_SYNCH_DOWN:
				setModificationNextSynchDown(MODIFICATION_NEXT_SYNCH_DOWN_EDEFAULT);
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
			case DbSynchPackage.TABLE_ROW__TABLE:
				return basicGetTable() != null;
			case DbSynchPackage.TABLE_ROW__KEY:
				return KEY_EDEFAULT == null ? getKey() != null : !KEY_EDEFAULT.equals(getKey());
			case DbSynchPackage.TABLE_ROW__OLD_KEY:
				return OLD_KEY_EDEFAULT == null ? getOldKey() != null : !OLD_KEY_EDEFAULT.equals(getOldKey());
			case DbSynchPackage.TABLE_ROW__DELETED:
				return deleted != DELETED_EDEFAULT;
			case DbSynchPackage.TABLE_ROW__OLD_DELETED:
				return isOldDeleted() != OLD_DELETED_EDEFAULT;
			case DbSynchPackage.TABLE_ROW__MODIFICATION_LAST_SYNCH_UP:
				return modificationLastSynchUp != MODIFICATION_LAST_SYNCH_UP_EDEFAULT;
			case DbSynchPackage.TABLE_ROW__MODIFICATION_NEXT_SYNCH_DOWN:
				return modificationNextSynchDown != MODIFICATION_NEXT_SYNCH_DOWN_EDEFAULT;
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
			case DbSynchPackage.TABLE_ROW___REFRESH:
				refresh();
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
		result.append(" (Deleted: ");
		result.append(deleted);
		result.append(", ModificationLastSynchUp: ");
		result.append(modificationLastSynchUp);
		result.append(", ModificationNextSynchDown: ");
		result.append(modificationNextSynchDown);
		result.append(')');
		return result.toString();
	}

} //TableRowImpl
