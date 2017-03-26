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
package com.misc.common.moplaf.solver.provider;

import com.misc.common.moplaf.kpiview.emf.edit.IItemKPIProvider;
import com.misc.common.moplaf.kpiview.emf.edit.IItemKPIsProvider;
import com.misc.common.moplaf.solver.util.SolverAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SolverItemProviderAdapterFactory extends SolverAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SolverItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(IItemKPIsProvider.class);
		supportedTypes.add(IItemKPIProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.GeneratorElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorElementItemProvider generatorElementItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.GeneratorElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneratorElementAdapter() {
		if (generatorElementItemProvider == null) {
			generatorElementItemProvider = new GeneratorElementItemProvider(this);
		}

		return generatorElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.GeneratorLpGoal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorLpGoalItemProvider generatorLpGoalItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.GeneratorLpGoal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneratorLpGoalAdapter() {
		if (generatorLpGoalItemProvider == null) {
			generatorLpGoalItemProvider = new GeneratorLpGoalItemProvider(this);
		}

		return generatorLpGoalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.GeneratorLpLinear} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorLpLinearItemProvider generatorLpLinearItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.GeneratorLpLinear}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneratorLpLinearAdapter() {
		if (generatorLpLinearItemProvider == null) {
			generatorLpLinearItemProvider = new GeneratorLpLinearItemProvider(this);
		}

		return generatorLpLinearItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.SolverGeneratorGoal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolverGeneratorGoalItemProvider solverGeneratorGoalItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.SolverGeneratorGoal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSolverGeneratorGoalAdapter() {
		if (solverGeneratorGoalItemProvider == null) {
			solverGeneratorGoalItemProvider = new SolverGeneratorGoalItemProvider(this);
		}

		return solverGeneratorGoalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.SolverGoalPreviousSolver} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolverGoalPreviousSolverItemProvider solverGoalPreviousSolverItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.SolverGoalPreviousSolver}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSolverGoalPreviousSolverAdapter() {
		if (solverGoalPreviousSolverItemProvider == null) {
			solverGoalPreviousSolverItemProvider = new SolverGoalPreviousSolverItemProvider(this);
		}

		return solverGoalPreviousSolverItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.Solution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionItemProvider solutionItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.Solution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSolutionAdapter() {
		if (solutionItemProvider == null) {
			solutionItemProvider = new SolutionItemProvider(this);
		}

		return solutionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.SolutionElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionElementItemProvider solutionElementItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.SolutionElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSolutionElementAdapter() {
		if (solutionElementItemProvider == null) {
			solutionElementItemProvider = new SolutionElementItemProvider(this);
		}

		return solutionElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.SolutionLp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionLpItemProvider solutionLpItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.SolutionLp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSolutionLpAdapter() {
		if (solutionLpItemProvider == null) {
			solutionLpItemProvider = new SolutionLpItemProvider(this);
		}

		return solutionLpItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.GeneratorLpVar} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorLpVarItemProvider generatorLpVarItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.GeneratorLpVar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneratorLpVarAdapter() {
		if (generatorLpVarItemProvider == null) {
			generatorLpVarItemProvider = new GeneratorLpVarItemProvider(this);
		}

		return generatorLpVarItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.GeneratorLpCons} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorLpConsItemProvider generatorLpConsItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.GeneratorLpCons}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneratorLpConsAdapter() {
		if (generatorLpConsItemProvider == null) {
			generatorLpConsItemProvider = new GeneratorLpConsItemProvider(this);
		}

		return generatorLpConsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.GeneratorLpTerm} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorLpTermItemProvider generatorLpTermItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.GeneratorLpTerm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneratorLpTermAdapter() {
		if (generatorLpTermItemProvider == null) {
			generatorLpTermItemProvider = new GeneratorLpTermItemProvider(this);
		}

		return generatorLpTermItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.GeneratorLpConsCountElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorLpConsCountElementItemProvider generatorLpConsCountElementItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.GeneratorLpConsCountElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneratorLpConsCountElementAdapter() {
		if (generatorLpConsCountElementItemProvider == null) {
			generatorLpConsCountElementItemProvider = new GeneratorLpConsCountElementItemProvider(this);
		}

		return generatorLpConsCountElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.GeneratorLpVarCountElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorLpVarCountElementItemProvider generatorLpVarCountElementItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.GeneratorLpVarCountElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneratorLpVarCountElementAdapter() {
		if (generatorLpVarCountElementItemProvider == null) {
			generatorLpVarCountElementItemProvider = new GeneratorLpVarCountElementItemProvider(this);
		}

		return generatorLpVarCountElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.GeneratorLpVarCount} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorLpVarCountItemProvider generatorLpVarCountItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.GeneratorLpVarCount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneratorLpVarCountAdapter() {
		if (generatorLpVarCountItemProvider == null) {
			generatorLpVarCountItemProvider = new GeneratorLpVarCountItemProvider(this);
		}

		return generatorLpVarCountItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.GeneratorLpConsCount} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorLpConsCountItemProvider generatorLpConsCountItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.GeneratorLpConsCount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneratorLpConsCountAdapter() {
		if (generatorLpConsCountItemProvider == null) {
			generatorLpConsCountItemProvider = new GeneratorLpConsCountItemProvider(this);
		}

		return generatorLpConsCountItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.GeneratorFeatureMode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorFeatureModeItemProvider generatorFeatureModeItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.GeneratorFeatureMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneratorFeatureModeAdapter() {
		if (generatorFeatureModeItemProvider == null) {
			generatorFeatureModeItemProvider = new GeneratorFeatureModeItemProvider(this);
		}

		return generatorFeatureModeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.GeneratorConstraintEnabler} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorConstraintEnablerItemProvider generatorConstraintEnablerItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.GeneratorConstraintEnabler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneratorConstraintEnablerAdapter() {
		if (generatorConstraintEnablerItemProvider == null) {
			generatorConstraintEnablerItemProvider = new GeneratorConstraintEnablerItemProvider(this);
		}

		return generatorConstraintEnablerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.GeneratorVarOverflow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorVarOverflowItemProvider generatorVarOverflowItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.GeneratorVarOverflow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneratorVarOverflowAdapter() {
		if (generatorVarOverflowItemProvider == null) {
			generatorVarOverflowItemProvider = new GeneratorVarOverflowItemProvider(this);
		}

		return generatorVarOverflowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.SolutionVar} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionVarItemProvider solutionVarItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.SolutionVar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSolutionVarAdapter() {
		if (solutionVarItemProvider == null) {
			solutionVarItemProvider = new SolutionVarItemProvider(this);
		}

		return solutionVarItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.SolutionReaderPattern} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionReaderPatternItemProvider solutionReaderPatternItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.SolutionReaderPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSolutionReaderPatternAdapter() {
		if (solutionReaderPatternItemProvider == null) {
			solutionReaderPatternItemProvider = new SolutionReaderPatternItemProvider(this);
		}

		return solutionReaderPatternItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.SolutionLpVar} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionLpVarItemProvider solutionLpVarItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.SolutionLpVar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSolutionLpVarAdapter() {
		if (solutionLpVarItemProvider == null) {
			solutionLpVarItemProvider = new SolutionLpVarItemProvider(this);
		}

		return solutionLpVarItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.SolutionCons} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionConsItemProvider solutionConsItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.SolutionCons}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSolutionConsAdapter() {
		if (solutionConsItemProvider == null) {
			solutionConsItemProvider = new SolutionConsItemProvider(this);
		}

		return solutionConsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.SolutionLpCons} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionLpConsItemProvider solutionLpConsItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.SolutionLpCons}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSolutionLpConsAdapter() {
		if (solutionLpConsItemProvider == null) {
			solutionLpConsItemProvider = new SolutionLpConsItemProvider(this);
		}

		return solutionLpConsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.SolutionGoal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionGoalItemProvider solutionGoalItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.SolutionGoal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSolutionGoalAdapter() {
		if (solutionGoalItemProvider == null) {
			solutionGoalItemProvider = new SolutionGoalItemProvider(this);
		}

		return solutionGoalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.SolutionLpGoal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionLpGoalItemProvider solutionLpGoalItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.SolutionLpGoal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSolutionLpGoalAdapter() {
		if (solutionLpGoalItemProvider == null) {
			solutionLpGoalItemProvider = new SolutionLpGoalItemProvider(this);
		}

		return solutionLpGoalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.GeneratorCpLinear} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorCpLinearItemProvider generatorCpLinearItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.GeneratorCpLinear}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneratorCpLinearAdapter() {
		if (generatorCpLinearItemProvider == null) {
			generatorCpLinearItemProvider = new GeneratorCpLinearItemProvider(this);
		}

		return generatorCpLinearItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.GeneratorCpLogical} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorCpLogicalItemProvider generatorCpLogicalItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.GeneratorCpLogical}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneratorCpLogicalAdapter() {
		if (generatorCpLogicalItemProvider == null) {
			generatorCpLogicalItemProvider = new GeneratorCpLogicalItemProvider(this);
		}

		return generatorCpLogicalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.GeneratorCpVarAtomic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorCpVarAtomicItemProvider generatorCpVarAtomicItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.GeneratorCpVarAtomic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneratorCpVarAtomicAdapter() {
		if (generatorCpVarAtomicItemProvider == null) {
			generatorCpVarAtomicItemProvider = new GeneratorCpVarAtomicItemProvider(this);
		}

		return generatorCpVarAtomicItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.GeneratorCpLinearTerm} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorCpLinearTermItemProvider generatorCpLinearTermItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.GeneratorCpLinearTerm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneratorCpLinearTermAdapter() {
		if (generatorCpLinearTermItemProvider == null) {
			generatorCpLinearTermItemProvider = new GeneratorCpLinearTermItemProvider(this);
		}

		return generatorCpLinearTermItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.GeneratorCpLogicalTerm} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorCpLogicalTermItemProvider generatorCpLogicalTermItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.GeneratorCpLogicalTerm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneratorCpLogicalTermAdapter() {
		if (generatorCpLogicalTermItemProvider == null) {
			generatorCpLogicalTermItemProvider = new GeneratorCpLogicalTermItemProvider(this);
		}

		return generatorCpLogicalTermItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.solver.SolutionCpVar} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionCpVarItemProvider solutionCpVarItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.solver.SolutionCpVar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSolutionCpVarAdapter() {
		if (solutionCpVarItemProvider == null) {
			solutionCpVarItemProvider = new SolutionCpVarItemProvider(this);
		}

		return solutionCpVarItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (generatorElementItemProvider != null) generatorElementItemProvider.dispose();
		if (generatorLpVarItemProvider != null) generatorLpVarItemProvider.dispose();
		if (generatorLpConsItemProvider != null) generatorLpConsItemProvider.dispose();
		if (generatorLpTermItemProvider != null) generatorLpTermItemProvider.dispose();
		if (generatorLpConsCountElementItemProvider != null) generatorLpConsCountElementItemProvider.dispose();
		if (generatorLpVarCountElementItemProvider != null) generatorLpVarCountElementItemProvider.dispose();
		if (generatorLpVarCountItemProvider != null) generatorLpVarCountItemProvider.dispose();
		if (generatorLpConsCountItemProvider != null) generatorLpConsCountItemProvider.dispose();
		if (generatorFeatureModeItemProvider != null) generatorFeatureModeItemProvider.dispose();
		if (generatorConstraintEnablerItemProvider != null) generatorConstraintEnablerItemProvider.dispose();
		if (generatorVarOverflowItemProvider != null) generatorVarOverflowItemProvider.dispose();
		if (solutionReaderPatternItemProvider != null) solutionReaderPatternItemProvider.dispose();
		if (solverGeneratorGoalItemProvider != null) solverGeneratorGoalItemProvider.dispose();
		if (solverGoalPreviousSolverItemProvider != null) solverGoalPreviousSolverItemProvider.dispose();
		if (solutionItemProvider != null) solutionItemProvider.dispose();
		if (solutionElementItemProvider != null) solutionElementItemProvider.dispose();
		if (solutionLpItemProvider != null) solutionLpItemProvider.dispose();
		if (solutionVarItemProvider != null) solutionVarItemProvider.dispose();
		if (solutionLpVarItemProvider != null) solutionLpVarItemProvider.dispose();
		if (solutionCpVarItemProvider != null) solutionCpVarItemProvider.dispose();
		if (solutionConsItemProvider != null) solutionConsItemProvider.dispose();
		if (solutionLpConsItemProvider != null) solutionLpConsItemProvider.dispose();
		if (solutionGoalItemProvider != null) solutionGoalItemProvider.dispose();
		if (solutionLpGoalItemProvider != null) solutionLpGoalItemProvider.dispose();
		if (generatorCpLinearItemProvider != null) generatorCpLinearItemProvider.dispose();
		if (generatorCpLogicalItemProvider != null) generatorCpLogicalItemProvider.dispose();
		if (generatorCpVarAtomicItemProvider != null) generatorCpVarAtomicItemProvider.dispose();
		if (generatorCpLinearTermItemProvider != null) generatorCpLinearTermItemProvider.dispose();
		if (generatorCpLogicalTermItemProvider != null) generatorCpLogicalTermItemProvider.dispose();
		if (generatorLpGoalItemProvider != null) generatorLpGoalItemProvider.dispose();
		if (generatorLpLinearItemProvider != null) generatorLpLinearItemProvider.dispose();
	}

}
