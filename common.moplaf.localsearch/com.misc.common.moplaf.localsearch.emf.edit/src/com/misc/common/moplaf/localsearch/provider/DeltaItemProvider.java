/**
 */
package com.misc.common.moplaf.localsearch.provider;


import com.misc.common.moplaf.emf.edit.command.DoCommand;
import com.misc.common.moplaf.emf.edit.command.SelectCommand;
import com.misc.common.moplaf.emf.edit.command.UndoCommand;
import com.misc.common.moplaf.localsearch.Action;
import com.misc.common.moplaf.localsearch.Delta;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.localsearch.Delta} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeltaItemProvider 
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
	public DeltaItemProvider(AdapterFactory adapterFactory) {
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

			addDescriptionPropertyDescriptor(object);
			addDoEnabledFeedbackPropertyDescriptor(object);
			addUndoEnabledFeedbackPropertyDescriptor(object);
			addSelectEnabledFeedbackPropertyDescriptor(object);
			addValidFeedbackPropertyDescriptor(object);
			addCurrentPropertyDescriptor(object);
			addSolutionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_Delta_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Delta_Description_feature", "_UI_Delta_type"),
				 LocalSearchPackage.Literals.DELTA__DESCRIPTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__20DeltaPropertyCategory"),
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
				 getString("_UI_Delta_ValidFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Delta_ValidFeedback_feature", "_UI_Delta_type"),
				 LocalSearchPackage.Literals.DELTA__VALID_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Do Enabled Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDoEnabledFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Delta_DoEnabledFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Delta_DoEnabledFeedback_feature", "_UI_Delta_type"),
				 LocalSearchPackage.Literals.DELTA__DO_ENABLED_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10EnabledPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Undo Enabled Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUndoEnabledFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Delta_UndoEnabledFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Delta_UndoEnabledFeedback_feature", "_UI_Delta_type"),
				 LocalSearchPackage.Literals.DELTA__UNDO_ENABLED_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10EnabledPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Select Enabled Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectEnabledFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Delta_SelectEnabledFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Delta_SelectEnabledFeedback_feature", "_UI_Delta_type"),
				 LocalSearchPackage.Literals.DELTA__SELECT_ENABLED_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10EnabledPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Current feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Delta_Current_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Delta_Current_feature", "_UI_Delta_type"),
				 LocalSearchPackage.Literals.DELTA__CURRENT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__20DeltaPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Solution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Delta_Solution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Delta_Solution_feature", "_UI_Delta_type"),
				 LocalSearchPackage.Literals.DELTA__SOLUTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__20DeltaPropertyCategory"),
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
			childrenFeatures.add(LocalSearchPackage.Literals.DELTA__SCORE);
			childrenFeatures.add(LocalSearchPackage.Literals.DELTA__NEXT_DELTAS);
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
	 * This returns Delta.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/arrows.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Delta)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_Delta_type") :
			getString("_UI_Delta_type") + " " + label;
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

		switch (notification.getFeatureID(Delta.class)) {
			case LocalSearchPackage.DELTA__DESCRIPTION:
			case LocalSearchPackage.DELTA__DO_ENABLED_FEEDBACK:
			case LocalSearchPackage.DELTA__UNDO_ENABLED_FEEDBACK:
			case LocalSearchPackage.DELTA__SELECT_ENABLED_FEEDBACK:
			case LocalSearchPackage.DELTA__VALID_FEEDBACK:
			case LocalSearchPackage.DELTA__CURRENT:
			case LocalSearchPackage.DELTA__SOLUTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LocalSearchPackage.DELTA__SCORE:
			case LocalSearchPackage.DELTA__NEXT_DELTAS:
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
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return LocalsearchEditPlugin.INSTANCE;
	}
	
	/**
	 * 
	 * @author michel
	 *
	 */
	public class DeltaDoCommand extends DoCommand{
		private Delta delta;
		
		public DeltaDoCommand(Delta aDelta)	{
			super();
			this.delta = aDelta;
		}
		
		@Override
		public boolean canExecute() {
			return this.delta.getDoEnabledFeedback().isEnabled();
		}

		@Override
		public void execute() {
			this.delta.do_();;
		}
	} // DeltaDoCommand

	/**
	 * 
	 * @author michel
	 *
	 */
	public class DeltaUndoCommand extends UndoCommand{
		private Delta delta;
		
		public DeltaUndoCommand(Delta aDelta)	{
			super();
			this.delta = aDelta;
		}

		@Override
		public boolean canExecute() {
			return this.delta.getUndoEnabledFeedback().isEnabled();
		}

		@Override
		public void execute() {
			this.delta.undo();
		}
	} // class DeltaUndoCommand


	/**
	 * 
	 * @author michel
	 *
	 */
	public class DeltaSelectCommand extends SelectCommand{
		private Delta delta;
		
		public DeltaSelectCommand(Delta aDelta)	{
			super();
			this.delta = aDelta;
		}

		@Override
		public boolean canExecute() {
			return this.delta.getSelectEnabledFeedback().isEnabled();
		}

		@Override
		public void execute() {
			Action action = this.delta.getAction();
			action.select(this.delta);
		}
	} // class DeltaUndoCommand


	/**
	 * 
	 */
	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == DoCommand.class){
			return new DeltaDoCommand((Delta) object); 
		} else 	if ( commandClass == UndoCommand.class){
			return new DeltaUndoCommand((Delta) object); 
		} else 	if ( commandClass == SelectCommand.class){
			return new DeltaSelectCommand((Delta) object); 
		}
		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand

	

}
