/**
 */
package com.misc.common.moplaf.job.provider;


import com.misc.common.moplaf.job.Doc;
import com.misc.common.moplaf.job.JobFactory;
import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.job.Run;
import com.misc.common.moplaf.job.Task;
import com.misc.common.moplaf.job.command.TaskAddInputDocsCommand;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.job.Task} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskItemProvider extends JobItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskItemProvider(AdapterFactory adapterFactory) {
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

			addCloneFeedbackPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Clone Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCloneFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Task_CloneFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Task_CloneFeedback_feature", "_UI_Task_type"),
				 JobPackage.Literals.TASK__CLONE_FEEDBACK,
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
			childrenFeatures.add(JobPackage.Literals.KEY_INDICATORS__INDICATORS);
			childrenFeatures.add(JobPackage.Literals.TASK__INPUTS);
			childrenFeatures.add(JobPackage.Literals.TASK__OUTPUTS);
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
		String label = ((Task)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_Task_type") :
			getString("_UI_Task_type") + " " + label;
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

		switch (notification.getFeatureID(Task.class)) {
			case JobPackage.TASK__CLONE_FEEDBACK:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case JobPackage.TASK__INDICATORS:
			case JobPackage.TASK__INPUTS:
			case JobPackage.TASK__OUTPUTS:
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
				(JobPackage.Literals.KEY_INDICATORS__INDICATORS,
				 JobFactory.eINSTANCE.createKeyIndicatorDouble()));

		newChildDescriptors.add
			(createChildParameter
				(JobPackage.Literals.KEY_INDICATORS__INDICATORS,
				 JobFactory.eINSTANCE.createKeyIndicatorInt()));

		newChildDescriptors.add
			(createChildParameter
				(JobPackage.Literals.KEY_INDICATORS__INDICATORS,
				 JobFactory.eINSTANCE.createKeyIndicatorDate()));

		newChildDescriptors.add
			(createChildParameter
				(JobPackage.Literals.KEY_INDICATORS__INDICATORS,
				 JobFactory.eINSTANCE.createKeyIndicatorString()));

		newChildDescriptors.add
			(createChildParameter
				(JobPackage.Literals.TASK__INPUTS,
				 JobFactory.eINSTANCE.createTaskInput()));

		newChildDescriptors.add
			(createChildParameter
				(JobPackage.Literals.TASK__OUTPUTS,
				 JobFactory.eINSTANCE.createTaskOutput()));
	}

	@Override
	protected Command createDropCommandMulti(EditingDomain domain, Run owner, Collection<?> droppedObjects) {
		Task task = (Task) owner;
		BasicEList<Doc> docs = new BasicEList<Doc>();
		for( Object droppedObject : droppedObjects) {
			if ( droppedObject instanceof Doc ) {
				docs.add((Doc)droppedObject);
			}
		}
		if ( docs.size()>0 ){
			return new TaskAddInputDocsCommand(task, docs);
		}
		return super.createDropCommandMulti(domain, owner, droppedObjects);
	}
}
