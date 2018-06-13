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
package com.misc.common.moplaf.job.provider;


import com.misc.common.moplaf.file.File;
import com.misc.common.moplaf.file.FileFactory;
import com.misc.common.moplaf.file.FilePackage;
import com.misc.common.moplaf.job.JobFileHandler;
import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.job.Run;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.job.JobFileHandler} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JobFileHandlerItemProvider extends JobItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobFileHandlerItemProvider(AdapterFactory adapterFactory) {
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

			addSelectedFilePropertyDescriptor(object);
			addHandledFilePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Selected File feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedFilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FileHandler_SelectedFile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FileHandler_SelectedFile_feature", "_UI_FileHandler_type"),
				 FilePackage.Literals.FILE_HANDLER__SELECTED_FILE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__10FilePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Handled File feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHandledFilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FileHandler_HandledFile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FileHandler_HandledFile_feature", "_UI_FileHandler_type"),
				 FilePackage.Literals.FILE_HANDLER__HANDLED_FILE,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI__10FilePropertyCategory"),
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FilePackage.Literals.FILE_OWNER__FILES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((JobFileHandler)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_JobFileHandler_type") :
			getString("_UI_JobFileHandler_type") + " " + label;
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

		switch (notification.getFeatureID(JobFileHandler.class)) {
			case JobPackage.JOB_FILE_HANDLER__FILES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(FilePackage.Literals.FILE_OWNER__FILES,
				 FileFactory.eINSTANCE.createFileLocal()));

		newChildDescriptors.add
			(createChildParameter
				(FilePackage.Literals.FILE_OWNER__FILES,
				 FileFactory.eINSTANCE.createFileRemote()));

		newChildDescriptors.add
			(createChildParameter
				(FilePackage.Literals.FILE_OWNER__FILES,
				 FileFactory.eINSTANCE.createFileInMemory()));
	}

	@Override
	protected Command createDropCommand(EditingDomain domain, Run owner, Object droppedObject) {
		JobFileHandler thisRun = (JobFileHandler) owner;
		if ( droppedObject instanceof File){
  	   		SetCommand cmd = new SetCommand(domain, thisRun, FilePackage.Literals.FILE_HANDLER__SELECTED_FILE, droppedObject);
		   	return cmd;
		} 
		return null;
	}
	
	

}
