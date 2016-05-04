/**
 */
package com.misc.common.moplaf.dbsynch.provider;


import com.misc.common.moplaf.dbsynch.DbSynchPackage;

import com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DbSynchUnitAbstractItemProvider 
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
	public DbSynchUnitAbstractItemProvider(AdapterFactory adapterFactory) {
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

			addTablesPropertyDescriptor(object);
			addDataSourcePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addChildUnitsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Tables feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTablesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DbSynchUnitAbstract_Tables_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DbSynchUnitAbstract_Tables_feature", "_UI_DbSynchUnitAbstract_type"),
				 DbSynchPackage.Literals.DB_SYNCH_UNIT_ABSTRACT__TABLES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DbSynchUnitAbstract_DataSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DbSynchUnitAbstract_DataSource_feature", "_UI_DbSynchUnitAbstract_type"),
				 DbSynchPackage.Literals.DB_SYNCH_UNIT_ABSTRACT__DATA_SOURCE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DbSynchUnitAbstract_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DbSynchUnitAbstract_Name_feature", "_UI_DbSynchUnitAbstract_type"),
				 DbSynchPackage.Literals.DB_SYNCH_UNIT_ABSTRACT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Child Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChildUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DbSynchUnitAbstract_ChildUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DbSynchUnitAbstract_ChildUnits_feature", "_UI_DbSynchUnitAbstract_type"),
				 DbSynchPackage.Literals.DB_SYNCH_UNIT_ABSTRACT__CHILD_UNITS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DbSynchUnitAbstract)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DbSynchUnitAbstract_type") :
			getString("_UI_DbSynchUnitAbstract_type") + " " + label;
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

		switch (notification.getFeatureID(DbSynchUnitAbstract.class)) {
			case DbSynchPackage.DB_SYNCH_UNIT_ABSTRACT__NAME:
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

	public class SynchUnitSynchUpCommand extends SynchUpCommand{
		private DbSynchUnitAbstract synchUnit;
		
		// constructor
		public SynchUnitSynchUpCommand(DbSynchUnitAbstract aUnit)	{
			super();
			this.synchUnit = aUnit;
			String tmp = "SynchUp the SynchUnit ";
			String label = "label:"+tmp;
			String description = "desc:"+tmp;
			this.setDescription(description);
			this.setLabel(label);
		}

		@Override
		public void execute() {
			this.synchUnit.synchUp();
		}
	} // class TableSynchUpCommand

	public class SynchUnitSynchDownCommand extends SynchDownCommand{
		private DbSynchUnitAbstract synchUnit;
		
		// constructor
		public SynchUnitSynchDownCommand(DbSynchUnitAbstract aUnit)	{
			super();
			this.synchUnit = aUnit;
			String tmp = "SynchDown the SynchUnit ";
			String label = "label:"+tmp;
			String description = "desc:"+tmp;
			this.setDescription(description);
			this.setLabel(label);
		}

		@Override
		public void execute() {
			this.synchUnit.synchDown();
		}
	} // class SynchUnitSynchUpCommand

	/*
	public class SynchUnitRefreshCommand extends RefreshCommand{
		private DbSynchUnitAbstract synchUnit;
		
		// constructor
		public SynchUnitRefreshCommand(DbSynchUnitAbstract aSynchUnit)	{
			super();
			this.synchUnit = aSynchUnit;
			String tmp = "Refresh the SynchUnit ";
			String label = "label:"+tmp;
			String description = "desc:"+tmp;
			this.setDescription(description);
			this.setLabel(label);
		}

		@Override
		public void execute() {
			this.synchUnit.refresh();
		}
	} // class SynchUnitRefreshCommand
	*/

	public class SynchUnitRefreshMetaDataCommand extends RefreshCommand{
		private DbSynchUnitAbstract synchUnit;
		
		// constructor
		public SynchUnitRefreshMetaDataCommand(DbSynchUnitAbstract aSynchUnit)	{
			super();
			this.synchUnit = aSynchUnit;
			String tmp = "Refresh the MetaData of the SynchUnit ";
			String label = "label:"+tmp;
			String description = "desc:"+tmp;
			this.setDescription(description);
			this.setLabel(label);
		}

		@Override
		public void execute() {
			this.synchUnit.refreshMetaData();
		}
	} // class SynchUnitRefreshMetaDataCommand

	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == SynchUpCommand.class){
			return new SynchUnitSynchUpCommand((DbSynchUnitAbstract) object);
		} else if ( commandClass == SynchDownCommand.class){
				return new SynchUnitSynchDownCommand((DbSynchUnitAbstract) object); 
//		} else if ( commandClass == RefreshCommand.class){
//			return new SynchUnitRefreshCommand((DbSynchUnitAbstract) object);
		} else if ( commandClass == RefreshMetaDataCommand.class){
			return new SynchUnitRefreshMetaDataCommand((DbSynchUnitAbstract) object);
		}

		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand
}
