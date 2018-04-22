/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.dbsynch.provider;


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

import com.misc.common.moplaf.dbsynch.DbSynchPackage;
import com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract;
import com.misc.common.moplaf.emf.edit.command.RefreshCommand;
import com.misc.common.moplaf.emf.edit.command.RefreshMetaDataCommand;
import com.misc.common.moplaf.emf.edit.command.SynchDownCommand;
import com.misc.common.moplaf.emf.edit.command.SynchUpCommand;

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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI__10DatabasePropertyCategory"),
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
		
		public SynchUnitSynchUpCommand(DbSynchUnitAbstract aUnit)	{
			super();
			this.synchUnit = aUnit;
		}

		@Override
		protected boolean prepare(){
			boolean isExecutable = true;
			if ( this.synchUnit.getDataSource()==null){
				isExecutable = false;
				this.setDescription("no data source");
			} else if ( !this.synchUnit.getDataSource().isConnected() ){
				isExecutable = false;
				this.setDescription("data source not connected");
			}
			return isExecutable;
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
		}

		@Override
		protected boolean prepare(){
			boolean isExecutable = true;
			if ( this.synchUnit.getDataSource()==null){
				isExecutable = false;
				this.setDescription("no data source");
			} else if ( !this.synchUnit.getDataSource().isConnected() ){
				isExecutable = false;
				this.setDescription("data source not connected");
			}
			return isExecutable;
		}

		@Override
		public void execute() {
			this.synchUnit.synchDown();
		}
	} // class SynchUnitSynchUpCommand

	public class SynchUnitRefreshCommand extends RefreshCommand{
		private DbSynchUnitAbstract synchUnit;
		
		// constructor
		public SynchUnitRefreshCommand(DbSynchUnitAbstract aSynchUnit)	{
			super();
			this.synchUnit = aSynchUnit;
		}

		@Override
		public void execute() {
			//this.synchUnit.refresh();
		}
	} // class SynchUnitRefreshCommand

	public class SynchUnitRefreshMetaDataCommand extends RefreshMetaDataCommand{
		private DbSynchUnitAbstract synchUnit;
		
		// constructor
		public SynchUnitRefreshMetaDataCommand(DbSynchUnitAbstract aSynchUnit)	{
			super();
			this.synchUnit = aSynchUnit;
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
