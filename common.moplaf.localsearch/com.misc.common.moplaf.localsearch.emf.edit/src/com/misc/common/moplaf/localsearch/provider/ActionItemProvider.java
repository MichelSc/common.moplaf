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
package com.misc.common.moplaf.localsearch.provider;


import com.misc.common.moplaf.emf.edit.command.DoCommand;
import com.misc.common.moplaf.emf.edit.command.FinalizeCommand;
import com.misc.common.moplaf.emf.edit.command.InitializeCommand;
import com.misc.common.moplaf.emf.edit.command.ResetCommand;
import com.misc.common.moplaf.emf.edit.command.RunCommand;
import com.misc.common.moplaf.localsearch.Action;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.StrategyLevel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.localsearch.Action} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionItemProvider 
	extends SolutionChangeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionItemProvider(AdapterFactory adapterFactory) {
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

			addCurrentDeltaPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addValidFeedbackPropertyDescriptor(object);
			addResetFeedbackPropertyDescriptor(object);
			addActionNrPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Current Delta feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentDeltaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_CurrentDelta_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_CurrentDelta_feature", "_UI_Action_type"),
				 LocalSearchPackage.Literals.ACTION__CURRENT_DELTA,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__20ActionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_Description_feature", "_UI_Action_type"),
				 LocalSearchPackage.Literals.ACTION__DESCRIPTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__20ActionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Action Nr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionNrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_ActionNr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_ActionNr_feature", "_UI_Action_type"),
				 LocalSearchPackage.Literals.ACTION__ACTION_NR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__20ActionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Valid Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_ValidFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_ValidFeedback_feature", "_UI_Action_type"),
				 LocalSearchPackage.Literals.ACTION__VALID_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10EnabledPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Reset Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResetFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_ResetFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_ResetFeedback_feature", "_UI_Action_type"),
				 LocalSearchPackage.Literals.ACTION__RESET_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10EnabledPropertyCategory"),
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
			childrenFeatures.add(LocalSearchPackage.Literals.ACTION__START_DELTAS);
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
	 * This returns Action.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/clipboard.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		StrategyLevel labelValue = ((Action)object).getLevel();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Action_type") :
			getString("_UI_Action_type") + " " + label;
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

		switch (notification.getFeatureID(Action.class)) {
			case LocalSearchPackage.ACTION__DESCRIPTION:
			case LocalSearchPackage.ACTION__VALID_FEEDBACK:
			case LocalSearchPackage.ACTION__RESET_FEEDBACK:
			case LocalSearchPackage.ACTION__ACTION_NR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LocalSearchPackage.ACTION__START_DELTAS:
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
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == LocalSearchPackage.Literals.SOLUTION_CHANGE__START_SOLUTION ||
			childFeature == LocalSearchPackage.Literals.SOLUTION_CHANGE__END_SOLUTION ||
			childFeature == LocalSearchPackage.Literals.SOLUTION_CHANGE__CURRENT_SOLUTION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * 
	 * @author michel
	 *
	 */
	public class ActionInitializeCommand extends InitializeCommand{
		private Action action;
		
		public ActionInitializeCommand(Action anAction)	{
			super();
			this.action = anAction;
		}

		@Override
		public boolean canExecute() {
			return this.action.getValidFeedback().isEnabled();
		}

		@Override
		public void execute() {
			this.action.initialize();
		}
	} // class ActionIntializeCommand


	/**
	 * 
	 * @author michel
	 *
	 */
	public class ActionRunCommand extends RunCommand{
		private Action action;
		
		public ActionRunCommand(Action anAction)	{
			super();
			this.action = anAction;
		}

		@Override
		public boolean canExecute() {
			return this.action.getValidFeedback().isEnabled();
		}

		@Override
		public void execute() {
			this.action.run();
		}
	} // class ActionRunCommand


	/**
	 * 
	 * @author michel
	 *
	 */
	public class ActionFinalizeCommand extends FinalizeCommand{
		private Action action;
		
		public ActionFinalizeCommand(Action anAction)	{
			super();
			this.action = anAction;
		}

		@Override
		public boolean canExecute() {
			return this.action.getValidFeedback().isEnabled();
		}

		@Override
		public void execute() {
			this.action.finalize();
		}
	} // class ActionFinalizeCommand

	/**
	 * 
	 * @author michel
	 *
	 */
	public class ActionResetCommand extends ResetCommand{
		private Action action;
		
		public ActionResetCommand(Action anAction)	{
			super();
			this.action = anAction;
		}
		@Override
		public boolean canExecute() {
			return this.action.getResetFeedback().isEnabled();
		}

		@Override
		public void execute() {
			this.action.select(null);
		}
	} // class ActionFinalizeCommand


	/**
	 *
	 */
	public class ActionDoCommand extends DoCommand{
		private Action action;
		
		public ActionDoCommand(Action anAction)	{
			super();
			this.action= anAction;
		}

		@Override
		public boolean canExecute() {
			return this.action.getValidFeedback().isEnabled();
		}

		@Override
		public void execute() {
			this.action.doAction();
		}
	} // class ActionDoCommand


	/**
	 * 
	 */
	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == InitializeCommand.class){
			return new ActionInitializeCommand((Action) object); 
		} else if ( commandClass == FinalizeCommand.class){
			return new ActionFinalizeCommand((Action) object); 
		} else if ( commandClass == RunCommand.class){
			return new ActionRunCommand((Action) object); 
		} else if ( commandClass == ResetCommand.class){
			return new ActionResetCommand((Action) object); 
		} if ( commandClass == DoCommand.class){
			return new ActionDoCommand((Action) object); 
		} 
		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand

}
