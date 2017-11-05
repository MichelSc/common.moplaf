/**
 */
package com.misc.common.moplaf.localsearch.provider;


import com.misc.common.moplaf.emf.edit.command.SortCommand;
import com.misc.common.moplaf.job.provider.RunItemProvider;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Strategy;

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
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.localsearch.Strategy} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StrategyItemProvider 
	extends RunItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategyItemProvider(AdapterFactory adapterFactory) {
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

			addBestSolutionPropertyDescriptor(object);
			addCurrentSolutionNrPropertyDescriptor(object);
			addMaxNrSolutionsPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addChanceSelectBestPropertyDescriptor(object);
			addChanceSelectWorstPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Best Solution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBestSolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategy_BestSolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategy_BestSolution_feature", "_UI_Strategy_type"),
				 LocalSearchPackage.Literals.STRATEGY__BEST_SOLUTION,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__10StrategyPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Solution Nr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentSolutionNrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategy_CurrentSolutionNr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategy_CurrentSolutionNr_feature", "_UI_Strategy_type"),
				 LocalSearchPackage.Literals.STRATEGY__CURRENT_SOLUTION_NR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__10StrategyPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Nr Solutions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxNrSolutionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategy_MaxNrSolutions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategy_MaxNrSolutions_feature", "_UI_Strategy_type"),
				 LocalSearchPackage.Literals.STRATEGY__MAX_NR_SOLUTIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__10StrategyPropertyCategory"),
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
				 getString("_UI_Strategy_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategy_Name_feature", "_UI_Strategy_type"),
				 LocalSearchPackage.Literals.STRATEGY__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10StrategyPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Chance Select Best feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChanceSelectBestPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategy_ChanceSelectBest_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategy_ChanceSelectBest_feature", "_UI_Strategy_type"),
				 LocalSearchPackage.Literals.STRATEGY__CHANCE_SELECT_BEST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__10StrategyPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Chance Select Worst feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChanceSelectWorstPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategy_ChanceSelectWorst_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategy_ChanceSelectWorst_feature", "_UI_Strategy_type"),
				 LocalSearchPackage.Literals.STRATEGY__CHANCE_SELECT_WORST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__10StrategyPropertyCategory"),
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
			childrenFeatures.add(LocalSearchPackage.Literals.STRATEGY__IMPROVMENTS);
			childrenFeatures.add(LocalSearchPackage.Literals.STRATEGY__SOLUTIONS);
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
	 * This returns Strategy.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/business-plan.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Strategy)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Strategy_type") :
			getString("_UI_Strategy_type") + " " + label;
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

		switch (notification.getFeatureID(Strategy.class)) {
			case LocalSearchPackage.STRATEGY__CURRENT_SOLUTION_NR:
			case LocalSearchPackage.STRATEGY__MAX_NR_SOLUTIONS:
			case LocalSearchPackage.STRATEGY__NAME:
			case LocalSearchPackage.STRATEGY__CHANCE_SELECT_BEST:
			case LocalSearchPackage.STRATEGY__CHANCE_SELECT_WORST:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LocalSearchPackage.STRATEGY__IMPROVMENTS:
			case LocalSearchPackage.STRATEGY__SOLUTIONS:
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
	public class StrategySortCommand extends SortCommand{
		private Strategy strategy;
		
		public StrategySortCommand(Strategy aStrategy)	{
			super();
			this.strategy = aStrategy;
		}

		@Override
		public void execute() {
			this.strategy.sortSolutions();
		}
	} // class StrategySortCommand

	/**
	 * 
	 */
	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == SortCommand.class){
			return new StrategySortCommand((Strategy) object); 
		} 
		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand

}
