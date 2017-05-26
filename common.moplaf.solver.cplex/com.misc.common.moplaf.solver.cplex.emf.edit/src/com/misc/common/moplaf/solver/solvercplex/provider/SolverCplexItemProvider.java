/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
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
package com.misc.common.moplaf.solver.solvercplex.provider;


import com.misc.common.moplaf.solver.SolverPackage;
import com.misc.common.moplaf.solver.provider.SolverLpItemProvider;
import com.misc.common.moplaf.solver.solvercplex.SolverCplex;
import com.misc.common.moplaf.solver.solvercplex.SolvercplexPackage;
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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.solver.solvercplex.SolverCplex} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SolverCplexItemProvider
	extends SolverLpItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverCplexItemProvider(AdapterFactory adapterFactory) {
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

			addFilePathPropertyDescriptor(object);
			addFileFormatPropertyDescriptor(object);
			addFileCompressedPropertyDescriptor(object);
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
			addMipStrategyPresolveNodePropertyDescriptor(object);
			addMipStrategyProbePropertyDescriptor(object);
			addMipLimitsCutsFactorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the File Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ILpWriter_FilePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ILpWriter_FilePath_feature", "_UI_ILpWriter_type"),
				 SolverPackage.Literals.ILP_WRITER__FILE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__15FileWriterPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the File Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ILpWriter_FileFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ILpWriter_FileFormat_feature", "_UI_ILpWriter_type"),
				 SolverPackage.Literals.ILP_WRITER__FILE_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__15FileWriterPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the File Compressed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileCompressedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ILpWriter_FileCompressed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ILpWriter_FileCompressed_feature", "_UI_ILpWriter_type"),
				 SolverPackage.Literals.ILP_WRITER__FILE_COMPRESSED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__15FileWriterPropertyCategory"),
				 null));
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
				 getString("_UI_SolverCplex_MipCutsCliques_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplex_MipCutsCliques_feature", "_UI_SolverCplex_type"),
				 SolvercplexPackage.Literals.SOLVER_CPLEX__MIP_CUTS_CLIQUES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__20SolverCplexPropertyCategory"),
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
				 getString("_UI_SolverCplex_MipCutsCovers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplex_MipCutsCovers_feature", "_UI_SolverCplex_type"),
				 SolvercplexPackage.Literals.SOLVER_CPLEX__MIP_CUTS_COVERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__20SolverCplexPropertyCategory"),
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
				 getString("_UI_SolverCplex_MipCutsFlowCovers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplex_MipCutsFlowCovers_feature", "_UI_SolverCplex_type"),
				 SolvercplexPackage.Literals.SOLVER_CPLEX__MIP_CUTS_FLOW_COVERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__20SolverCplexPropertyCategory"),
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
				 getString("_UI_SolverCplex_MipCutsGomory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplex_MipCutsGomory_feature", "_UI_SolverCplex_type"),
				 SolvercplexPackage.Literals.SOLVER_CPLEX__MIP_CUTS_GOMORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__20SolverCplexPropertyCategory"),
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
				 getString("_UI_SolverCplex_MipCutsGUBCovers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplex_MipCutsGUBCovers_feature", "_UI_SolverCplex_type"),
				 SolvercplexPackage.Literals.SOLVER_CPLEX__MIP_CUTS_GUB_COVERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__20SolverCplexPropertyCategory"),
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
				 getString("_UI_SolverCplex_MipCutsImplied_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplex_MipCutsImplied_feature", "_UI_SolverCplex_type"),
				 SolvercplexPackage.Literals.SOLVER_CPLEX__MIP_CUTS_IMPLIED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__20SolverCplexPropertyCategory"),
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
				 getString("_UI_SolverCplex_MipCutsMIRCut_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplex_MipCutsMIRCut_feature", "_UI_SolverCplex_type"),
				 SolvercplexPackage.Literals.SOLVER_CPLEX__MIP_CUTS_MIR_CUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__20SolverCplexPropertyCategory"),
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
				 getString("_UI_SolverCplex_MipCutsPathCut_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplex_MipCutsPathCut_feature", "_UI_SolverCplex_type"),
				 SolvercplexPackage.Literals.SOLVER_CPLEX__MIP_CUTS_PATH_CUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__20SolverCplexPropertyCategory"),
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
				 getString("_UI_SolverCplex_MipStrategyBacktrack_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplex_MipStrategyBacktrack_feature", "_UI_SolverCplex_type"),
				 SolvercplexPackage.Literals.SOLVER_CPLEX__MIP_STRATEGY_BACKTRACK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20SolverCplexPropertyCategory"),
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
				 getString("_UI_SolverCplex_MipStrategyHeuristicFreq_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplex_MipStrategyHeuristicFreq_feature", "_UI_SolverCplex_type"),
				 SolvercplexPackage.Literals.SOLVER_CPLEX__MIP_STRATEGY_HEURISTIC_FREQ,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__20SolverCplexPropertyCategory"),
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
				 getString("_UI_SolverCplex_MipStrategyPresolveNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplex_MipStrategyPresolveNode_feature", "_UI_SolverCplex_type"),
				 SolvercplexPackage.Literals.SOLVER_CPLEX__MIP_STRATEGY_PRESOLVE_NODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__20SolverCplexPropertyCategory"),
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
				 getString("_UI_SolverCplex_MipStrategyProbe_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplex_MipStrategyProbe_feature", "_UI_SolverCplex_type"),
				 SolvercplexPackage.Literals.SOLVER_CPLEX__MIP_STRATEGY_PROBE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__20SolverCplexPropertyCategory"),
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
				 getString("_UI_SolverCplex_MipLimitsCutsFactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverCplex_MipLimitsCutsFactor_feature", "_UI_SolverCplex_type"),
				 SolvercplexPackage.Literals.SOLVER_CPLEX__MIP_LIMITS_CUTS_FACTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__20SolverCplexPropertyCategory"),
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
		String label = ((SolverCplex)object).getCode();
		return label == null || label.length() == 0 ?
			getString("_UI_SolverCplex_type") :
			getString("_UI_SolverCplex_type") + " " + label;
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

		switch (notification.getFeatureID(SolverCplex.class)) {
			case SolvercplexPackage.SOLVER_CPLEX__FILE_PATH:
			case SolvercplexPackage.SOLVER_CPLEX__FILE_FORMAT:
			case SolvercplexPackage.SOLVER_CPLEX__FILE_COMPRESSED:
			case SolvercplexPackage.SOLVER_CPLEX__MIP_CUTS_CLIQUES:
			case SolvercplexPackage.SOLVER_CPLEX__MIP_CUTS_COVERS:
			case SolvercplexPackage.SOLVER_CPLEX__MIP_CUTS_FLOW_COVERS:
			case SolvercplexPackage.SOLVER_CPLEX__MIP_CUTS_GOMORY:
			case SolvercplexPackage.SOLVER_CPLEX__MIP_CUTS_GUB_COVERS:
			case SolvercplexPackage.SOLVER_CPLEX__MIP_CUTS_IMPLIED:
			case SolvercplexPackage.SOLVER_CPLEX__MIP_CUTS_MIR_CUT:
			case SolvercplexPackage.SOLVER_CPLEX__MIP_CUTS_PATH_CUT:
			case SolvercplexPackage.SOLVER_CPLEX__MIP_STRATEGY_BACKTRACK:
			case SolvercplexPackage.SOLVER_CPLEX__MIP_STRATEGY_HEURISTIC_FREQ:
			case SolvercplexPackage.SOLVER_CPLEX__MIP_STRATEGY_PRESOLVE_NODE:
			case SolvercplexPackage.SOLVER_CPLEX__MIP_STRATEGY_PROBE:
			case SolvercplexPackage.SOLVER_CPLEX__MIP_LIMITS_CUTS_FACTOR:
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
