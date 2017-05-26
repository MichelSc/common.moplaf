/**
 */
package com.misc.common.moplaf.solver.solvercplex.provider;


import com.misc.common.moplaf.solver.provider.SolverLpParamsItemProvider;

import com.misc.common.moplaf.solver.solvercplex.SolverCplexPackage;
import com.misc.common.moplaf.solver.solvercplex.SolverCplexParams;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SolverCplexParamsItemProvider extends SolverLpParamsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverCplexParamsItemProvider(AdapterFactory adapterFactory) {
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

			addMipCutsCliquesPropertyDescriptor(object);
			addMipCutsCoversPropertyDescriptor(object);
			addMipCutsFlowCoversPropertyDescriptor(object);
			addMipCutsGomoryPropertyDescriptor(object);
			addMipCutsGUBCoversPropertyDescriptor(object);
			addMipCutsImpliedPropertyDescriptor(object);
			addMipCutsMIRCutPropertyDescriptor(object);
			addMipCutsPathCutPropertyDescriptor(object);
			addMipStrategyBacktrackPropertyDescriptor(object);
			addMipStrategyHeuristicFreqPropertyDescriptor(object);
			addMipStrategyProbePropertyDescriptor(object);
			addMipStrategyPresolveNodePropertyDescriptor(object);
			addMipLimitsCutsFactorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Mip Cuts Cliques feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMipCutsCliquesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverCplexParams_MipCutsCliques_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplexParams_MipCutsCliques_feature", "_UI_SolverCplexParams_type"),
				 SolverCplexPackage.Literals.SOLVER_CPLEX_PARAMS__MIP_CUTS_CLIQUES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__24ParamSolverCplexPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Mip Cuts Covers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMipCutsCoversPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverCplexParams_MipCutsCovers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplexParams_MipCutsCovers_feature", "_UI_SolverCplexParams_type"),
				 SolverCplexPackage.Literals.SOLVER_CPLEX_PARAMS__MIP_CUTS_COVERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__24ParamSolverCplexPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Mip Cuts Flow Covers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMipCutsFlowCoversPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverCplexParams_MipCutsFlowCovers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplexParams_MipCutsFlowCovers_feature", "_UI_SolverCplexParams_type"),
				 SolverCplexPackage.Literals.SOLVER_CPLEX_PARAMS__MIP_CUTS_FLOW_COVERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__24ParamSolverCplexPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Mip Cuts Gomory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMipCutsGomoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverCplexParams_MipCutsGomory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplexParams_MipCutsGomory_feature", "_UI_SolverCplexParams_type"),
				 SolverCplexPackage.Literals.SOLVER_CPLEX_PARAMS__MIP_CUTS_GOMORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__24ParamSolverCplexPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Mip Cuts GUB Covers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMipCutsGUBCoversPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverCplexParams_MipCutsGUBCovers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplexParams_MipCutsGUBCovers_feature", "_UI_SolverCplexParams_type"),
				 SolverCplexPackage.Literals.SOLVER_CPLEX_PARAMS__MIP_CUTS_GUB_COVERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__24ParamSolverCplexPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Mip Cuts Implied feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMipCutsImpliedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverCplexParams_MipCutsImplied_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplexParams_MipCutsImplied_feature", "_UI_SolverCplexParams_type"),
				 SolverCplexPackage.Literals.SOLVER_CPLEX_PARAMS__MIP_CUTS_IMPLIED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__24ParamSolverCplexPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Mip Cuts MIR Cut feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMipCutsMIRCutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverCplexParams_MipCutsMIRCut_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplexParams_MipCutsMIRCut_feature", "_UI_SolverCplexParams_type"),
				 SolverCplexPackage.Literals.SOLVER_CPLEX_PARAMS__MIP_CUTS_MIR_CUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__24ParamSolverCplexPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Mip Cuts Path Cut feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMipCutsPathCutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverCplexParams_MipCutsPathCut_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplexParams_MipCutsPathCut_feature", "_UI_SolverCplexParams_type"),
				 SolverCplexPackage.Literals.SOLVER_CPLEX_PARAMS__MIP_CUTS_PATH_CUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__24ParamSolverCplexPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Mip Strategy Backtrack feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMipStrategyBacktrackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverCplexParams_MipStrategyBacktrack_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplexParams_MipStrategyBacktrack_feature", "_UI_SolverCplexParams_type"),
				 SolverCplexPackage.Literals.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_BACKTRACK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__24ParamSolverCplexPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Mip Strategy Heuristic Freq feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMipStrategyHeuristicFreqPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverCplexParams_MipStrategyHeuristicFreq_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplexParams_MipStrategyHeuristicFreq_feature", "_UI_SolverCplexParams_type"),
				 SolverCplexPackage.Literals.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_HEURISTIC_FREQ,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__24ParamSolverCplexPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Mip Strategy Probe feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMipStrategyProbePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverCplexParams_MipStrategyProbe_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplexParams_MipStrategyProbe_feature", "_UI_SolverCplexParams_type"),
				 SolverCplexPackage.Literals.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_PROBE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__24ParamSolverCplexPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Mip Strategy Presolve Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMipStrategyPresolveNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverCplexParams_MipStrategyPresolveNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplexParams_MipStrategyPresolveNode_feature", "_UI_SolverCplexParams_type"),
				 SolverCplexPackage.Literals.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_PRESOLVE_NODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__24ParamSolverCplexPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Mip Limits Cuts Factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMipLimitsCutsFactorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverCplexParams_MipLimitsCutsFactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplexParams_MipLimitsCutsFactor_feature", "_UI_SolverCplexParams_type"),
				 SolverCplexPackage.Literals.SOLVER_CPLEX_PARAMS__MIP_LIMITS_CUTS_FACTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__24ParamSolverCplexPropertyCategory"),
				 null));
	}

	/**
	 * This returns SolverCplexParams.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SolverCplexParams"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		SolverCplexParams solverCplexParams = (SolverCplexParams)object;
		return getString("_UI_SolverCplexParams_type") + " " + solverCplexParams.getSolverOptimalityTolerance();
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

		switch (notification.getFeatureID(SolverCplexParams.class)) {
			case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_CLIQUES:
			case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_COVERS:
			case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_FLOW_COVERS:
			case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_GOMORY:
			case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_GUB_COVERS:
			case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_IMPLIED:
			case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_MIR_CUT:
			case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_PATH_CUT:
			case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_BACKTRACK:
			case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_HEURISTIC_FREQ:
			case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_PROBE:
			case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_PRESOLVE_NODE:
			case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_LIMITS_CUTS_FACTOR:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SolvercplexEditPlugin.INSTANCE;
	}

}
