/**
 */
package com.misc.common.moplaf.solver.provider;


import com.misc.common.moplaf.emf.edit.command.RunCommand;
import com.misc.common.moplaf.emf.edit.command.WriteCommand;
import com.misc.common.moplaf.solver.ILpWriter;
import com.misc.common.moplaf.solver.Solver;
import com.misc.common.moplaf.solver.SolverPackage;

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
			addStatusPropertyDescriptor(object);
			addSolverMaxDurationPropertyDescriptor(object);
			addSolverBackgroundPropertyDescriptor(object);
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
			addGoalToSolvePropertyDescriptor(object);
			addInitialSolutionPropertyDescriptor(object);
			addNextToSolvePropertyDescriptor(object);
			addPreviousSolvedPropertyDescriptor(object);
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
				 getString("_UI_Solver_Remarks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solver_Remarks_feature", "_UI_Solver_type"),
				 SolverPackage.Literals.SOLVER__REMARKS,
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
	 * This adds a property descriptor for the Goal To Solve feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGoalToSolvePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solver_GoalToSolve_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solver_GoalToSolve_feature", "_UI_Solver_type"),
				 SolverPackage.Literals.SOLVER__GOAL_TO_SOLVE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__10GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Initial Solution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialSolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solver_InitialSolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solver_InitialSolution_feature", "_UI_Solver_type"),
				 SolverPackage.Literals.SOLVER__INITIAL_SOLUTION,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__10GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Next To Solve feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextToSolvePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solver_nextToSolve_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solver_nextToSolve_feature", "_UI_Solver_type"),
				 SolverPackage.Literals.SOLVER__NEXT_TO_SOLVE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__10GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Previous Solved feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreviousSolvedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solver_previousSolved_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solver_previousSolved_feature", "_UI_Solver_type"),
				 SolverPackage.Literals.SOLVER__PREVIOUS_SOLVED,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__10GeneralPropertyCategory"),
				 null));
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
				 getString("_UI_Solver_SolverMaxDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solver_SolverMaxDuration_feature", "_UI_Solver_type"),
				 SolverPackage.Literals.SOLVER__SOLVER_MAX_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20SolverPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Solver Background feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolverBackgroundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solver_SolverBackground_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solver_SolverBackground_feature", "_UI_Solver_type"),
				 SolverPackage.Literals.SOLVER__SOLVER_BACKGROUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__20SolverPropertyCategory"),
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
			case SolverPackage.SOLVER__STATUS:
			case SolverPackage.SOLVER__SOLVER_MAX_DURATION:
			case SolverPackage.SOLVER__SOLVER_BACKGROUND:
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

	public class SolverRunCommand extends RunCommand{
		private Solver solver;
		
		// constructor
		public SolverRunCommand(Solver asolver)	{
			this.solver = asolver;
			String tmp = "Run the Solver";
			String label = "label:"+tmp;
			String description = "desc:"+tmp;
			this.setDescription(description);
			this.setLabel(label);
		}

		@Override
		public void execute() {
			this.solver.solve();
		}
	} // class SolverRunCommand

	public class SolverWriteCommand extends WriteCommand{
		private ILpWriter writer;
		
		// constructor
		public SolverWriteCommand(ILpWriter awriter)	{
			super();
			this.writer = awriter;
			String tmp = "Write the Solver";
			String label = "label:"+tmp;
			String description = "desc:"+tmp;
			this.setDescription(description);
			this.setLabel(label);
		}

		@Override
		public void execute() {
			this.writer.writeLpToFile();
		}
	} // class WriterRunCommand

	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == RunCommand.class){
			return new SolverRunCommand((Solver) object); 
		}
		if ( commandClass == WriteCommand.class){
			if ( object instanceof ILpWriter ){
			return new SolverWriteCommand((ILpWriter) object);
			}
		}
		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand
}
