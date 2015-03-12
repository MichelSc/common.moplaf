/**
 */
package com.misc.common.moplaf.DatasetLoadOra.provider;


import com.misc.common.moplaf.DatasetLoadOra.DatasetLoadJdbcOraThin;

import com.misc.common.moplaf.DatasetLoadOra.DatasetLoadOraPackage;
import com.misc.common.moplaf.datasetload.provider.DataSourceJdbcItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.DatasetLoadOra.DatasetLoadJdbcOraThin} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DatasetLoadJdbcOraThinItemProvider extends DataSourceJdbcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetLoadJdbcOraThinItemProvider(AdapterFactory adapterFactory) {
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

			addHostPropertyDescriptor(object);
			addPortPropertyDescriptor(object);
			addDataBasePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Host feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatasetLoadJdbcOraThin_Host_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatasetLoadJdbcOraThin_Host_feature", "_UI_DatasetLoadJdbcOraThin_type"),
				 DatasetLoadOraPackage.Literals.DATASET_LOAD_JDBC_ORA_THIN__HOST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatasetLoadJdbcOraThin_Port_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatasetLoadJdbcOraThin_Port_feature", "_UI_DatasetLoadJdbcOraThin_type"),
				 DatasetLoadOraPackage.Literals.DATASET_LOAD_JDBC_ORA_THIN__PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Base feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataBasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatasetLoadJdbcOraThin_DataBase_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatasetLoadJdbcOraThin_DataBase_feature", "_UI_DatasetLoadJdbcOraThin_type"),
				 DatasetLoadOraPackage.Literals.DATASET_LOAD_JDBC_ORA_THIN__DATA_BASE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DatasetLoadJdbcOraThin.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DatasetLoadJdbcOraThin"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DatasetLoadJdbcOraThin)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DatasetLoadJdbcOraThin_type") :
			getString("_UI_DatasetLoadJdbcOraThin_type") + " " + label;
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

		switch (notification.getFeatureID(DatasetLoadJdbcOraThin.class)) {
			case DatasetLoadOraPackage.DATASET_LOAD_JDBC_ORA_THIN__HOST:
			case DatasetLoadOraPackage.DATASET_LOAD_JDBC_ORA_THIN__PORT:
			case DatasetLoadOraPackage.DATASET_LOAD_JDBC_ORA_THIN__DATA_BASE:
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
		return DatasetloadoraEditPlugin.INSTANCE;
	}

}
