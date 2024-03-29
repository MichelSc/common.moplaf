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
import com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Phase;
import com.misc.common.moplaf.localsearch.Step;

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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.localsearch.Phase} object.
 * <!-- begin-user-doc -->
 * @implements IItemGridsProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class PhaseItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemGridsProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseItemProvider(AdapterFactory adapterFactory) {
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
			addKeepLevelPropertyDescriptor(object);
			addMaxStepsPropertyDescriptor(object);
			addMaxSecondsPropertyDescriptor(object);
			addPhaseStartPropertyDescriptor(object);
			addPhaseEndPropertyDescriptor(object);
			addNrStepsPropertyDescriptor(object);
			addDurationTotalPropertyDescriptor(object);
			addDurationAveragePropertyDescriptor(object);
			addSelectBestChancePropertyDescriptor(object);
			addSelectWorstChancePropertyDescriptor(object);
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
				 getString("_UI_Phase_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Phase_Name_feature", "_UI_Phase_type"),
				 LocalSearchPackage.Literals.PHASE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__20PhasePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Keep Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeepLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Phase_KeepLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Phase_KeepLevel_feature", "_UI_Phase_type"),
				 LocalSearchPackage.Literals.PHASE__KEEP_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__24RunParamsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Steps feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxStepsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Phase_MaxSteps_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Phase_MaxSteps_feature", "_UI_Phase_type"),
				 LocalSearchPackage.Literals.PHASE__MAX_STEPS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__24RunParamsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Seconds feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxSecondsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Phase_MaxSeconds_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Phase_MaxSeconds_feature", "_UI_Phase_type"),
				 LocalSearchPackage.Literals.PHASE__MAX_SECONDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__24RunParamsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhaseStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Phase_PhaseStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Phase_PhaseStart_feature", "_UI_Phase_type"),
				 LocalSearchPackage.Literals.PHASE__PHASE_START,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__30ExecutionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhaseEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Phase_PhaseEnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Phase_PhaseEnd_feature", "_UI_Phase_type"),
				 LocalSearchPackage.Literals.PHASE__PHASE_END,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__30ExecutionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Nr Steps feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNrStepsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Phase_NrSteps_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Phase_NrSteps_feature", "_UI_Phase_type"),
				 LocalSearchPackage.Literals.PHASE__NR_STEPS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__30ExecutionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Duration Total feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationTotalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Phase_DurationTotal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Phase_DurationTotal_feature", "_UI_Phase_type"),
				 LocalSearchPackage.Literals.PHASE__DURATION_TOTAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__30ExecutionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Duration Average feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationAveragePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Phase_DurationAverage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Phase_DurationAverage_feature", "_UI_Phase_type"),
				 LocalSearchPackage.Literals.PHASE__DURATION_AVERAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__30ExecutionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Select Best Chance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectBestChancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Phase_SelectBestChance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Phase_SelectBestChance_feature", "_UI_Phase_type"),
				 LocalSearchPackage.Literals.PHASE__SELECT_BEST_CHANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__22SearchParamsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Select Worst Chance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectWorstChancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Phase_SelectWorstChance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Phase_SelectWorstChance_feature", "_UI_Phase_type"),
				 LocalSearchPackage.Literals.PHASE__SELECT_WORST_CHANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__22SearchParamsPropertyCategory"),
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
			childrenFeatures.add(LocalSearchPackage.Literals.PHASE__STEPS);
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
	 * This returns Phase.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/seo-performance-marketing-graphic.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Phase)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Phase_type") :
			getString("_UI_Phase_type") + " " + label;
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

		switch (notification.getFeatureID(Phase.class)) {
			case LocalSearchPackage.PHASE__NAME:
			case LocalSearchPackage.PHASE__KEEP_LEVEL:
			case LocalSearchPackage.PHASE__MAX_STEPS:
			case LocalSearchPackage.PHASE__MAX_SECONDS:
			case LocalSearchPackage.PHASE__PHASE_START:
			case LocalSearchPackage.PHASE__PHASE_END:
			case LocalSearchPackage.PHASE__NR_STEPS:
			case LocalSearchPackage.PHASE__DURATION_TOTAL:
			case LocalSearchPackage.PHASE__DURATION_AVERAGE:
			case LocalSearchPackage.PHASE__SELECT_BEST_CHANCE:
			case LocalSearchPackage.PHASE__SELECT_WORST_CHANCE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LocalSearchPackage.PHASE__STEPS:
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
	 *
	 */
	public class PhaseDoCommand extends DoCommand{
		private Phase phase;
		
		public PhaseDoCommand(Phase aPhase)	{
			super();
			this.phase= aPhase;
		}

		@Override
		public void execute() {
			phase.doPhase();
		}
	} // class PhaseDoCommand

	/**
	 * 
	 */
	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == DoCommand.class){
			return new PhaseDoCommand((Phase) object); 
		} 
		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand
	
	@Override
	public String getGridText(Object element, Object grid) {
		Phase phase = (Phase)element;
		return phase.getName();
	}

	@Override
	public Collection<?> getRows(Object element, Object grid) {
		Phase phase = (Phase)element;
		return phase.getSteps();
	}
	
	private abstract interface Column {
		public String getText();
		public int  getWidth();
		public Object getValue(Step step);
	}
	
	private static Column[] columns = {
			new Column() {
				public String getText() {
					return "New";
				}
				public int  getWidth() {
					return 40;
				}
				public Object getValue(Step step) {
					return step.isNewSolution();
				}
			}, 
			new Column() {
				public String getText() {
					return "SolNr";
				}
				public int  getWidth() {
					return 40;
				}
				public Object getValue(Step step) {
					return step.getEndSolution().getSolution().getSolutionNr();
				}
			}, 
			new Column() {
				public String getText() {
					return "Score";
				}
				public int  getWidth() {
					return 200;
				}
				public Object getValue(Step step) {
					return step.getEndSolution().getSolution().getScore().getDescription();
				}
			}
	};

	@Override
	public String getRowText(Object element, Object grid, Object row) {
		Step step = (Step)row;
		String row_header = String.format("%d", step.getStepNr());
		return row_header;
	}

	@Override
	public int getNrColumns(Object element, Object grid) {
		return columns.length;
	}

	@Override
	public String getColumnText(Object element, Object grid, Object column) {
		Integer column_index = (Integer)column;
		return columns[column_index].getText();
	}

	@Override
	public int getColumnWidth(Object element, Object grid, Object column) {
		Integer column_index = (Integer)column;
		return columns[column_index].getWidth();
	}

	@Override
	public Object getCellValue(Object element, Object grid, Object row, Object column) {
		Step step = (Step)row;
		Integer column_index = (Integer)column;
		return columns[column_index].getValue(step);
	}
}
