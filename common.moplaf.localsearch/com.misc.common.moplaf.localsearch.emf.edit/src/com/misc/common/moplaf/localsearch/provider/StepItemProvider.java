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
import com.misc.common.moplaf.localsearch.Action;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Phase;
import com.misc.common.moplaf.localsearch.Step;

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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.localsearch.Step} object.
 * <!-- begin-user-doc -->
 * @implements IItemGridsProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class StepItemProvider extends SolutionChangeItemProvider implements IItemGridsProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepItemProvider(AdapterFactory adapterFactory) {
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

			addStepNrPropertyDescriptor(object);
			addStepPropertyDescriptor(object);
			addValidFeedbackPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Step Nr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStepNrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Step_StepNr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Step_StepNr_feature", "_UI_Step_type"),
				 LocalSearchPackage.Literals.STEP__STEP_NR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__20StepPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Step feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStepPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Step_Step_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Step_Step_feature", "_UI_Step_type"),
				 LocalSearchPackage.Literals.STEP__STEP,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__20StepPropertyCategory"),
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
				 getString("_UI_Step_ValidFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Step_ValidFeedback_feature", "_UI_Step_type"),
				 LocalSearchPackage.Literals.STEP__VALID_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10EnabledPropertyCategory"),
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
				 getString("_UI_Step_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Step_Description_feature", "_UI_Step_type"),
				 LocalSearchPackage.Literals.STEP__DESCRIPTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
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
			childrenFeatures.add(LocalSearchPackage.Literals.STEP__ACTIONS);
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
	 * This returns Step.gif.
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
		String label = ((Step)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_Step_type") :
			getString("_UI_Step_type") + " " + label;
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

		switch (notification.getFeatureID(Step.class)) {
			case LocalSearchPackage.STEP__STEP_NR:
			case LocalSearchPackage.STEP__STEP:
			case LocalSearchPackage.STEP__VALID_FEEDBACK:
			case LocalSearchPackage.STEP__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LocalSearchPackage.STEP__ACTIONS:
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
	public class StepDoCommand extends DoCommand{
		private Step step;
		
		public StepDoCommand(Step aStep)	{
			super();
			this.step= aStep;
		}
		
		@Override
		public boolean canExecute() {
			return this.step.getValidFeedback().isEnabled();
		}


		@Override
		public void execute() {
			Phase phase = this.step.getPhase();
			this.step.doStep(phase);
		}
	} // class StepDoCommand

	/**
	 * 
	 */
	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == DoCommand.class){
			return new StepDoCommand((Step) object); 
		} 
		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand

	@Override
	public String getGridText(Object element, Object grid) {
		Step step = (Step)element;
		return step.getStep();
	}

	@Override
	public Collection<?> getRows(Object element, Object grid) {
		Step step = (Step)element;
		return step.getActions();
	}
	
	private abstract interface Column {
		public String getText();
		public int  getWidth();
		public Object getValue(Action action);
	}
	
	private static Column[] columns = {
			new Column() {
				public String getText() {
					return "New";
				}
				public int  getWidth() {
					return 40;
				}
				public Object getValue(Action action) {
					return action.isNewSolution();
				}
			}, 
			new Column() {
				public String getText() {
					return "SolNr";
				}
				public int  getWidth() {
					return 40;
				}
				public Object getValue(Action action) {
					return action.getEndSolution().getSolution().getSolutionNr();
				}
			}, 
			new Column() {
				public String getText() {
					return "Action";
				}
				public int  getWidth() {
					return 200;
				}
				public Object getValue(Action action) {
					return action.getDescription();
				}
			}, 
			new Column() {
				public String getText() {
					return "Score";
				}
				public int  getWidth() {
					return 200;
				}
				public Object getValue(Action action) {
					return action.getEndSolution().getSolution().getScore().getDescription();
				}
			}
	};

	@Override
	public String getRowText(Object element, Object grid, Object row) {
		Action action = (Action)row;
		String row_header = String.format("%d", action.getActionNr());
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
		Action action = (Action)row;
		Integer column_index = (Integer)column;
		return columns[column_index].getValue(action);
	}
}
