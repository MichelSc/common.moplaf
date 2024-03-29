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
package com.misc.common.moplaf.solver.provider;


import com.misc.common.moplaf.emf.edit.command.WriteCommand;
import com.misc.common.moplaf.job.Run;
import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorGoal;
import com.misc.common.moplaf.solver.GeneratorVarBinder;
import com.misc.common.moplaf.solver.ILpWriter;
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.SolutionProvider;
import com.misc.common.moplaf.solver.Solver;
import com.misc.common.moplaf.solver.SolverPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.solver.Solver} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SolverItemProvider
	extends SolutionProviderItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverItemProvider(AdapterFactory adapterFactory) {
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

			addRemarksPropertyDescriptor(object);
			addSolverMaxDurationPropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addSolverLogLevelPropertyDescriptor(object);
			addSolverDumpPropertyDescriptor(object);
			addRunStartedPropertyDescriptor(object);
			addRunInitializationEndedPropertyDescriptor(object);
			addRunSolvingEndedPropertyDescriptor(object);
			addRunFinalizationEndedPropertyDescriptor(object);
			addRunDurationInitializationPropertyDescriptor(object);
			addRunDurationFinalizationPropertyDescriptor(object);
			addRunDurationSolvingPropertyDescriptor(object);
			addRunRequestTerminatePropertyDescriptor(object);
			addRunTimeOutPropertyDescriptor(object);
			addSolUnfeasiblePropertyDescriptor(object);
			addSolFeasiblePropertyDescriptor(object);
			addSolOptimalPropertyDescriptor(object);
			addSolValuePropertyDescriptor(object);
			addRunInterruptedPropertyDescriptor(object);
			addInitialSolutionPropertyDescriptor(object);
			addVarBindersPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Remarks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemarksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverParams_Remarks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverParams_Remarks_feature", "_UI_SolverParams_type"),
				 SolverPackage.Literals.SOLVER_PARAMS__REMARKS,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Sol Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solver_SolValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solver_SolValue_feature", "_UI_Solver_type"),
				 SolverPackage.Literals.SOLVER__SOL_VALUE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__40SolutionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Run Interrupted feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRunInterruptedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solver_RunInterrupted_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solver_RunInterrupted_feature", "_UI_Solver_type"),
				 SolverPackage.Literals.SOLVER__RUN_INTERRUPTED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__30RunPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Run Time Out feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRunTimeOutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solver_RunTimeOut_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solver_RunTimeOut_feature", "_UI_Solver_type"),
				 SolverPackage.Literals.SOLVER__RUN_TIME_OUT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__30RunPropertyCategory"),
				 null));
	}




	/**
	 * This adds a property descriptor for the Initial Solution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected void addInitialSolutionPropertyDescriptor(Object object) {
	    IItemPropertyDescriptor descriptor = new ItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
						 getResourceLocator(),
						 getString("_UI_Solver_InitialSolution_feature"),
						 getString("_UI_PropertyDescriptor_description", "_UI_Solver_InitialSolution_feature", "_UI_Solver_type"),
						 SolverPackage.Literals.SOLVER__INITIAL_SOLUTION,
						 true,
						 false,
						 true,
						 null,
						 getString("_UI__22ParamSolverPropertyCategory"),
						 null)// filter flags
	    {
	    	public java.util.Collection<?> getChoiceOfValues(java.lang.Object object){
	    		Solver solver = (Solver)object;
	    		Generator generator = solver.getGenerator();
	    		BasicEList<Solution> solutions = new BasicEList<Solution>();
	    		for ( SolutionProvider provider : generator.getSolutionProvider()){
	    			for (Solution solution : provider.getSolution()){
	    				solutions.add(solution);
	    			}
	    		}
	    		return solutions;
	    	}
	    };
		itemPropertyDescriptors.add(descriptor);
//		itemPropertyDescriptors.add
//		(createItemPropertyDescriptor
//			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//			 getResourceLocator(),
//			 getString("_UI_Solver_InitialSolution_feature"),
//			 getString("_UI_PropertyDescriptor_description", "_UI_Solver_InitialSolution_feature", "_UI_Solver_type"),
//			 SolverPackage.Literals.SOLVER__INITIAL_SOLUTION,
//			 true,
//			 false,
//			 true,
//			 null,
//			 getString("_UI__10GeneralPropertyCategory"),
//			 null));
	}



	/**
	 * This adds a property descriptor for the Var Binders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVarBindersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solver_VarBinders_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solver_VarBinders_feature", "_UI_Solver_type"),
				 SolverPackage.Literals.SOLVER__VAR_BINDERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(0, SolverPackage.Literals.SOLVER__GOALS);       // to make sure the solutions are after the goals
			childrenFeatures.add(0, SolverPackage.Literals.SOLVER__VAR_BINDERS); // to make sure the solutions are after the goals
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
	 * This returns Solver.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/settings48.png"));
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solver_Status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solver_Status_feature", "_UI_Solver_type"),
				 SolverPackage.Literals.SOLVER__STATUS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Solver Max Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolverMaxDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverParams_SolverMaxDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverParams_SolverMaxDuration_feature", "_UI_SolverParams_type"),
				 SolverPackage.Literals.SOLVER_PARAMS__SOLVER_MAX_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__22ParamSolverPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Solver Log Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolverLogLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solver_SolverLogLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solver_SolverLogLevel_feature", "_UI_Solver_type"),
				 SolverPackage.Literals.SOLVER__SOLVER_LOG_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__20SolverPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Solver Dump feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolverDumpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solver_SolverDump_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solver_SolverDump_feature", "_UI_Solver_type"),
				 SolverPackage.Literals.SOLVER__SOLVER_DUMP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__20SolverPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Run Started feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRunStartedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solver_RunStarted_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solver_RunStarted_feature", "_UI_Solver_type"),
				 SolverPackage.Literals.SOLVER__RUN_STARTED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__30RunPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Run Initialization Ended feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRunInitializationEndedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solver_RunInitializationEnded_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solver_RunInitializationEnded_feature", "_UI_Solver_type"),
				 SolverPackage.Literals.SOLVER__RUN_INITIALIZATION_ENDED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__30RunPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Run Solving Ended feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRunSolvingEndedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solver_RunSolvingEnded_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solver_RunSolvingEnded_feature", "_UI_Solver_type"),
				 SolverPackage.Literals.SOLVER__RUN_SOLVING_ENDED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__30RunPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Run Finalization Ended feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRunFinalizationEndedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solver_RunFinalizationEnded_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solver_RunFinalizationEnded_feature", "_UI_Solver_type"),
				 SolverPackage.Literals.SOLVER__RUN_FINALIZATION_ENDED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__30RunPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Run Duration Initialization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRunDurationInitializationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solver_RunDurationInitialization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solver_RunDurationInitialization_feature", "_UI_Solver_type"),
				 SolverPackage.Literals.SOLVER__RUN_DURATION_INITIALIZATION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__30RunPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Run Duration Finalization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRunDurationFinalizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solver_RunDurationFinalization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solver_RunDurationFinalization_feature", "_UI_Solver_type"),
				 SolverPackage.Literals.SOLVER__RUN_DURATION_FINALIZATION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__30RunPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Run Duration Solving feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRunDurationSolvingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solver_RunDurationSolving_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solver_RunDurationSolving_feature", "_UI_Solver_type"),
				 SolverPackage.Literals.SOLVER__RUN_DURATION_SOLVING,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__30RunPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Run Request Terminate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRunRequestTerminatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solver_RunRequestTerminate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solver_RunRequestTerminate_feature", "_UI_Solver_type"),
				 SolverPackage.Literals.SOLVER__RUN_REQUEST_TERMINATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__30RunPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Sol Unfeasible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolUnfeasiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solver_SolUnfeasible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solver_SolUnfeasible_feature", "_UI_Solver_type"),
				 SolverPackage.Literals.SOLVER__SOL_UNFEASIBLE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__40SolutionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Sol Feasible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolFeasiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solver_SolFeasible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solver_SolFeasible_feature", "_UI_Solver_type"),
				 SolverPackage.Literals.SOLVER__SOL_FEASIBLE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__40SolutionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Sol Optimal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolOptimalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solver_SolOptimal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solver_SolOptimal_feature", "_UI_Solver_type"),
				 SolverPackage.Literals.SOLVER__SOL_OPTIMAL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__40SolutionPropertyCategory"),
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
		String label = ((Solver)object).getCode();
		return label == null || label.length() == 0 ?
			getString("_UI_Solver_type") :
			getString("_UI_Solver_type") + " " + label;
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

		switch (notification.getFeatureID(Solver.class)) {
			case SolverPackage.SOLVER__REMARKS:
			case SolverPackage.SOLVER__SOLVER_MAX_DURATION:
			case SolverPackage.SOLVER__STATUS:
			case SolverPackage.SOLVER__SOLVER_LOG_LEVEL:
			case SolverPackage.SOLVER__SOLVER_DUMP:
			case SolverPackage.SOLVER__RUN_STARTED:
			case SolverPackage.SOLVER__RUN_INITIALIZATION_ENDED:
			case SolverPackage.SOLVER__RUN_SOLVING_ENDED:
			case SolverPackage.SOLVER__RUN_FINALIZATION_ENDED:
			case SolverPackage.SOLVER__RUN_DURATION_INITIALIZATION:
			case SolverPackage.SOLVER__RUN_DURATION_FINALIZATION:
			case SolverPackage.SOLVER__RUN_DURATION_SOLVING:
			case SolverPackage.SOLVER__RUN_REQUEST_TERMINATE:
			case SolverPackage.SOLVER__RUN_TIME_OUT:
			case SolverPackage.SOLVER__SOL_UNFEASIBLE:
			case SolverPackage.SOLVER__SOL_FEASIBLE:
			case SolverPackage.SOLVER__SOL_OPTIMAL:
			case SolverPackage.SOLVER__SOL_VALUE:
			case SolverPackage.SOLVER__RUN_INTERRUPTED:
			case SolverPackage.SOLVER__INITIALIZING:
			case SolverPackage.SOLVER__SOLVING:
			case SolverPackage.SOLVER__FINALIZING:
			case SolverPackage.SOLVER__FINISHED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SolverPackage.SOLVER__GOALS:
			case SolverPackage.SOLVER__VAR_BINDERS:
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
	 * Implements command WriteCommande for this Solver
	 */
	public class SolverWriteCommand extends WriteCommand{
		private ILpWriter writer;
		
		// constructor
		public SolverWriteCommand(ILpWriter awriter)	{
			super();
			this.writer = awriter;
		}

		@Override
		public void execute() {
			this.writer.writeLpToFile();
		}
	} // class WriterRunCommand
	
	
	/**
	 * Create a command for this Solver
	 */
	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == WriteCommand.class){
			if ( object instanceof ILpWriter ){
			return new SolverWriteCommand((ILpWriter) object);
			}
		}
		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand


	/**
	 * Implements Command constructVarBinder
	 */
	public class ConstructVarBinder extends AbstractCommand {

		protected Solver solver;
		protected GeneratorVarBinder binder;
		
		public ConstructVarBinder(Solver solver, GeneratorVarBinder binder) {
			super();
			this.solver = solver;
			this.binder = binder;
		}

		protected boolean prepare(){
			isExecutable = true;
			return isExecutable;
		}

		public boolean canUndo() { 
			return false; 
		}

		@Override
		public void redo() {
			execute();		
		}

		@Override
		public void execute() {
			this.solver.constructVarBinder(this.binder);
		}
	}

	
	/**
	 * Implements Command constructGoal
	 */
	public abstract class ConstructGoal extends AbstractCommand {

		protected Solver solver;
		
		public ConstructGoal(Solver solver) {
			super();
			this.solver = solver;
		}

		@Override
		protected boolean prepare(){
			isExecutable = true;
			return isExecutable;
		}

		@Override
		public boolean canUndo() { 
			return false; 
		}

		@Override
		public void redo() {
			execute();		
		}

	}


	public  class ConstructGeneratorGoal extends ConstructGoal {
		private GeneratorGoal goal;

		public ConstructGeneratorGoal(Solver solver, GeneratorGoal agoal) {
			super(solver);
			this.goal = agoal;
		}

		@Override
		public void execute() {
			this.solver.constructSolverGoal(this.goal);
		}
	};
		
	public  class ConstructPreviousSolverGoal extends ConstructGoal {
		private Solver previousSolver;

		public ConstructPreviousSolverGoal(Solver solver, Solver aPreviousSolver) {
			super(solver);
			this.previousSolver = aPreviousSolver;
		}

		@Override
		public void execute() {
			this.solver.constructSolverGoal(this.previousSolver);
		}
	};
	public  class ConstructPreviousSolutionGoal extends ConstructGoal {
		private Solution previousSolution;

		public ConstructPreviousSolutionGoal(Solver solver, Solution aPreviousSolution) {
			super(solver);
			this.previousSolution = aPreviousSolution;
		}

		@Override
		public void execute() {
			this.solver.constructSolverGoal(this.previousSolution);
		}
	};
		
	@Override
	protected Command createDropCommandSingle(EditingDomain domain, Run owner, Object droppedObject) {
		Solver solver = (Solver)owner;
		if ( droppedObject instanceof GeneratorGoal){
  	   		GeneratorGoal droppedGoal = (GeneratorGoal) droppedObject;
		   	return new ConstructGeneratorGoal(solver, droppedGoal);
		} else if ( droppedObject instanceof Solver){
  	   		Solver droppedSolver = (Solver) droppedObject;
  	   		return new ConstructPreviousSolverGoal(solver, droppedSolver);
		} else if ( droppedObject instanceof Solution){
  	   		Solution droppedSolution = (Solution) droppedObject;
  	   		return new ConstructPreviousSolutionGoal(solver, droppedSolution);
		} else if ( droppedObject instanceof GeneratorVarBinder){
		   		GeneratorVarBinder binder = (GeneratorVarBinder) droppedObject;
		   		return new ConstructVarBinder(solver, binder);
		} 
		return super.createDropCommandSingle(domain, owner, droppedObject);
		//return null;
	}
}
