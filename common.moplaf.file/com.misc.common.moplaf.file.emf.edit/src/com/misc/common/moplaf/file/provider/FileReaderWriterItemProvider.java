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
package com.misc.common.moplaf.file.provider;


import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.emf.edit.command.AppendCommand;
import com.misc.common.moplaf.emf.edit.command.ReadCommand;
import com.misc.common.moplaf.emf.edit.command.WriteCommand;
import com.misc.common.moplaf.file.FileReaderWriter;
import com.misc.common.moplaf.file.FilePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.file.FileReaderWriter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FileReaderWriterItemProvider 
	extends FileHandlerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileReaderWriterItemProvider(AdapterFactory adapterFactory) {
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

			addReadFeedbackPropertyDescriptor(object);
			addWriteFeedbackPropertyDescriptor(object);
			addAppendFeedbackPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Read Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FileReaderWriter_ReadFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FileReaderWriter_ReadFeedback_feature", "_UI_FileReaderWriter_type"),
				 FilePackage.Literals.FILE_READER_WRITER__READ_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10EnabledPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Write Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWriteFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FileReaderWriter_WriteFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FileReaderWriter_WriteFeedback_feature", "_UI_FileReaderWriter_type"),
				 FilePackage.Literals.FILE_READER_WRITER__WRITE_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10EnabledPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Append Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppendFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FileReaderWriter_AppendFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FileReaderWriter_AppendFeedback_feature", "_UI_FileReaderWriter_type"),
				 FilePackage.Literals.FILE_READER_WRITER__APPEND_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns FileReaderWriter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/document_icon&16.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		EnabledFeedback labelValue = ((FileReaderWriter)object).getReadFeedback();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_FileReaderWriter_type") :
			getString("_UI_FileReaderWriter_type") + " " + label;
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

		switch (notification.getFeatureID(FileReaderWriter.class)) {
			case FilePackage.FILE_READER_WRITER__READ_FEEDBACK:
			case FilePackage.FILE_READER_WRITER__WRITE_FEEDBACK:
			case FilePackage.FILE_READER_WRITER__APPEND_FEEDBACK:
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

	public class FileWriteCommand extends WriteCommand{
		private FileReaderWriter writer;
		
		// constructor
		public FileWriteCommand(FileReaderWriter writer)	{
			super();
			this.writer = writer;
		}

		@Override
		protected boolean prepare(){
			EnabledFeedback feedback = this.writer.getWriteFeedback();
			if ( !feedback.isEnabled()) {
				this.setDescription(feedback.getFeedback());
				return false;
			}
			return true;
		}

		@Override
		public void execute() {
			this.writer.writeFile();
		}
	} // class FileWriteCommand

	public class FileAppendCommand extends AppendCommand{
		private FileReaderWriter writer;
		
		// constructor
		public FileAppendCommand(FileReaderWriter writer)	{
			super();
			this.writer = writer;
		}

		@Override
		protected boolean prepare(){
			EnabledFeedback feedback = this.writer.getAppendFeedback();
			if ( !feedback.isEnabled()) {
				this.setDescription(feedback.getFeedback());
				return false;
			}
			return true;
		}

		@Override
		public void execute() {
			this.writer.writeFile();
		}
	} // class FileAppendCommand

	public class FileReadCommand extends ReadCommand{
		private FileReaderWriter reader;
		
		// constructor
		public FileReadCommand(FileReaderWriter reader)	{
			super();
			this.reader = reader;
		}

		@Override
		protected boolean prepare(){
			EnabledFeedback feedback = this.reader.getReadFeedback();
			if ( !feedback.isEnabled()) {
				this.setDescription(feedback.getFeedback());
				return false;
			}
			return true;
		}

		@Override
		public void execute() {
			this.reader.readFile();
		}
	} // class FileReadCommand

	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == WriteCommand.class){
			return new FileWriteCommand((FileReaderWriter) object); 
		}
		else if ( commandClass == AppendCommand.class){
			return new FileAppendCommand((FileReaderWriter) object); 
		}
		else if ( commandClass == ReadCommand.class){
			return new FileReadCommand((FileReaderWriter) object); 
		}
		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand
}
