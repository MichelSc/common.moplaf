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


import com.misc.common.moplaf.dbsynch.DbSynchPackage;
import com.misc.common.moplaf.dbsynch.TableRow;
import com.misc.common.moplaf.dbsynch.TableRowKey;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.dbsynch.TableRow} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TableRowItemProvider 
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
	public TableRowItemProvider(AdapterFactory adapterFactory) {
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

			addDeletedPropertyDescriptor(object);
			addIndexKeyPropertyDescriptor(object);
			addLastSynchDownKeyPropertyDescriptor(object);
			addLastSynchDownDeletedPropertyDescriptor(object);
			addModificationLastSynchUpPropertyDescriptor(object);
			addModificationNextSynchDownPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Modification Last Synch Up feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModificationLastSynchUpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TableRow_ModificationLastSynchUp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TableRow_ModificationLastSynchUp_feature", "_UI_TableRow_type"),
				 DbSynchPackage.Literals.TABLE_ROW__MODIFICATION_LAST_SYNCH_UP,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__16ExecutionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Modification Next Synch Down feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModificationNextSynchDownPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TableRow_ModificationNextSynchDown_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TableRow_ModificationNextSynchDown_feature", "_UI_TableRow_type"),
				 DbSynchPackage.Literals.TABLE_ROW__MODIFICATION_NEXT_SYNCH_DOWN,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__16ExecutionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Deleted feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeletedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TableRow_Deleted_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TableRow_Deleted_feature", "_UI_TableRow_type"),
				 DbSynchPackage.Literals.TABLE_ROW__DELETED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__16ExecutionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Index Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndexKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TableRow_IndexKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TableRow_IndexKey_feature", "_UI_TableRow_type"),
				 DbSynchPackage.Literals.TABLE_ROW__INDEX_KEY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__16ExecutionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Synch Down Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastSynchDownKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TableRow_LastSynchDownKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TableRow_LastSynchDownKey_feature", "_UI_TableRow_type"),
				 DbSynchPackage.Literals.TABLE_ROW__LAST_SYNCH_DOWN_KEY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__16ExecutionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Synch Down Deleted feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastSynchDownDeletedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TableRow_LastSynchDownDeleted_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TableRow_LastSynchDownDeleted_feature", "_UI_TableRow_type"),
				 DbSynchPackage.Literals.TABLE_ROW__LAST_SYNCH_DOWN_DELETED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__16ExecutionPropertyCategory"),
				 null));
	}

	/**
	 * This returns TableRow.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/tableRow.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		TableRowKey labelValue = ((TableRow)object).getCurrentKey();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_TableRow_type") :
			getString("_UI_TableRow_type") + " " + label;
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

		switch (notification.getFeatureID(TableRow.class)) {
			case DbSynchPackage.TABLE_ROW__CURRENT_KEY:
			case DbSynchPackage.TABLE_ROW__DELETED:
			case DbSynchPackage.TABLE_ROW__INDEX_KEY:
			case DbSynchPackage.TABLE_ROW__LAST_SYNCH_DOWN_KEY:
			case DbSynchPackage.TABLE_ROW__LAST_SYNCH_DOWN_DELETED:
			case DbSynchPackage.TABLE_ROW__MODIFICATION_LAST_SYNCH_UP:
			case DbSynchPackage.TABLE_ROW__MODIFICATION_NEXT_SYNCH_DOWN:
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
