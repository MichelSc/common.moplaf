/**
 */
package com.misc.common.moplaf.dbsynch.provider;


import com.misc.common.moplaf.dbsynch.DbSynchPackage;
import com.misc.common.moplaf.dbsynch.Table;
import com.misc.common.moplaf.dbsynch.TableColumn;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.dbsynch.TableColumn} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TableColumnItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableColumnItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addKeyPropertyDescriptor(object);
			addColumnNamePropertyDescriptor(object);
			addColumnTypePropertyDescriptor(object);
			addRowAttributePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TableColumn_Key_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TableColumn_Key_feature", "_UI_TableColumn_type"),
				 DbSynchPackage.Literals.TABLE_COLUMN__KEY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__12MetadataPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Column Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TableColumn_ColumnName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TableColumn_ColumnName_feature", "_UI_TableColumn_type"),
				 DbSynchPackage.Literals.TABLE_COLUMN__COLUMN_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__12MetadataPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Row Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected void addRowAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
		(new ItemPropertyDescriptor
			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
					 getResourceLocator(),
					 getString("_UI_TableColumn_RowAttribute_feature"),
					 getString("_UI_PropertyDescriptor_description", "_UI_TableColumn_RowAttribute_feature", "_UI_TableColumn_type"),
					 DbSynchPackage.Literals.TABLE_COLUMN__ROW_ATTRIBUTE,
					 true,
					 false,
					 false,
					 null,
					 getString("_UI__12MetadataPropertyCategory"),
					 null){
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				EList<Object> attributesToReturn = new BasicEList<Object>();
				TableColumn thisTableColumn = (TableColumn)object;
				Table thisTable = thisTableColumn.getTable();
				EClass thisTableClass = thisTable.eClass();
				for (  EReference containmentRef : thisTableClass.getEAllContainments()){
					EClass referenceType = containmentRef.getEReferenceType();
					if ( DbSynchPackage.Literals.TABLE_ROW.isSuperTypeOf(referenceType)){
						for ( EAttribute anAttribute : containmentRef.getEReferenceType().getEAllAttributes()){
							String packageName = anAttribute.getEContainingClass().getEPackage().getNsURI(); 
							if ( !packageName.contains("common/moplaf")){
								if ( !attributesToReturn.contains(anAttribute)){
									attributesToReturn.add(anAttribute);
								}  // the attribute is not already in the list
							}  // the attribute is a user attribute
						}  // traverse the attribute
					}  // the containment ref is a row
				} // traverse the containment refs
				return attributesToReturn;
			}; // getChoiceOfValues
			}); // add
			
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_TableColumn_RowAttribute_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_TableColumn_RowAttribute_feature", "_UI_TableColumn_type"),
//				 DbSynchPackage.Literals.TABLE_COLUMN__ROW_ATTRIBUTE,
//				 true,
//				 false,
//				 false,
//				 null,
//				 getString("_UI__12MetadataPropertyCategory"),
//				 null));
	}

	/**
	 * This adds a property descriptor for the Column Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TableColumn_ColumnType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TableColumn_ColumnType_feature", "_UI_TableColumn_type"),
				 DbSynchPackage.Literals.TABLE_COLUMN__COLUMN_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__12MetadataPropertyCategory"),
				 null));
	}

	/**
	 * This returns TableColumn.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		TableColumn tableColumn = (TableColumn)object;
		if ( tableColumn.isKey()){
			return overlayImage(object, getResourceLocator().getImage("full/obj16/key.png"));
		} else {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/data.png"));
		}
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TableColumn)object).getColumnName();
		return label == null || label.length() == 0 ?
			getString("_UI_TableColumn_type") :
			getString("_UI_TableColumn_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TableColumn.class)) {
			case DbSynchPackage.TABLE_COLUMN__KEY:
			case DbSynchPackage.TABLE_COLUMN__COLUMN_NAME:
			case DbSynchPackage.TABLE_COLUMN__COLUMN_TYPE:
			case DbSynchPackage.TABLE_COLUMN__ROW_ATTRIBUTE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return dbsynchEditPlugin.INSTANCE;
	}

}
