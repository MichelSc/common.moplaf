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
package com.misc.common.moplaf.time.continuous.provider;

import com.misc.common.moplaf.time.continuous.util.TimeContinuousAdapterFactory;
import com.misc.common.moplaf.timeview.emf.edit.IItemTimePlotsProvider;

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
public class TimeContinuousItemProviderAdapterFactory extends TimeContinuousAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public TimeContinuousItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(IItemTimePlotsProvider.class); // non emf interface
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.time.continuous.Distribution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistributionItemProvider distributionItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.time.continuous.Distribution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDistributionAdapter() {
		if (distributionItemProvider == null) {
			distributionItemProvider = new DistributionItemProvider(this);
		}

		return distributionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.time.continuous.ChildEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildEventItemProvider childEventItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.time.continuous.ChildEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChildEventAdapter() {
		if (childEventItemProvider == null) {
			childEventItemProvider = new ChildEventItemProvider(this);
		}

		return childEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.time.continuous.StartEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartEventItemProvider startEventItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.time.continuous.StartEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStartEventAdapter() {
		if (startEventItemProvider == null) {
			startEventItemProvider = new StartEventItemProvider(this);
		}

		return startEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.time.continuous.EndEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndEventItemProvider endEventItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.time.continuous.EndEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndEventAdapter() {
		if (endEventItemProvider == null) {
			endEventItemProvider = new EndEventItemProvider(this);
		}

		return endEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.time.continuous.CapacityChangeStart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapacityChangeStartItemProvider capacityChangeStartItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.time.continuous.CapacityChangeStart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCapacityChangeStartAdapter() {
		if (capacityChangeStartItemProvider == null) {
			capacityChangeStartItemProvider = new CapacityChangeStartItemProvider(this);
		}

		return capacityChangeStartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.time.continuous.CapacityChangeEnd} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapacityChangeEndItemProvider capacityChangeEndItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.time.continuous.CapacityChangeEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCapacityChangeEndAdapter() {
		if (capacityChangeEndItemProvider == null) {
			capacityChangeEndItemProvider = new CapacityChangeEndItemProvider(this);
		}

		return capacityChangeEndItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.time.continuous.StockChangeStart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StockChangeStartItemProvider stockChangeStartItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.time.continuous.StockChangeStart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStockChangeStartAdapter() {
		if (stockChangeStartItemProvider == null) {
			stockChangeStartItemProvider = new StockChangeStartItemProvider(this);
		}

		return stockChangeStartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.time.continuous.StockChangeEnd} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StockChangeEndItemProvider stockChangeEndItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.time.continuous.StockChangeEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStockChangeEndAdapter() {
		if (stockChangeEndItemProvider == null) {
			stockChangeEndItemProvider = new StockChangeEndItemProvider(this);
		}

		return stockChangeEndItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.time.continuous.AmountDeltaAtomic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmountDeltaAtomicItemProvider amountDeltaAtomicItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.time.continuous.AmountDeltaAtomic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAmountDeltaAtomicAdapter() {
		if (amountDeltaAtomicItemProvider == null) {
			amountDeltaAtomicItemProvider = new AmountDeltaAtomicItemProvider(this);
		}

		return amountDeltaAtomicItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.time.continuous.SlopeDeltaAtomic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlopeDeltaAtomicItemProvider slopeDeltaAtomicItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.time.continuous.SlopeDeltaAtomic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSlopeDeltaAtomicAdapter() {
		if (slopeDeltaAtomicItemProvider == null) {
			slopeDeltaAtomicItemProvider = new SlopeDeltaAtomicItemProvider(this);
		}

		return slopeDeltaAtomicItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.time.continuous.AmountAbsoluteAtomic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmountAbsoluteAtomicItemProvider amountAbsoluteAtomicItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.time.continuous.AmountAbsoluteAtomic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAmountAbsoluteAtomicAdapter() {
		if (amountAbsoluteAtomicItemProvider == null) {
			amountAbsoluteAtomicItemProvider = new AmountAbsoluteAtomicItemProvider(this);
		}

		return amountAbsoluteAtomicItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.time.continuous.SlopeAbsoluteAtomic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlopeAbsoluteAtomicItemProvider slopeAbsoluteAtomicItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.time.continuous.SlopeAbsoluteAtomic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSlopeAbsoluteAtomicAdapter() {
		if (slopeAbsoluteAtomicItemProvider == null) {
			slopeAbsoluteAtomicItemProvider = new SlopeAbsoluteAtomicItemProvider(this);
		}

		return slopeAbsoluteAtomicItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.time.continuous.StockChange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StockChangeItemProvider stockChangeItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.time.continuous.StockChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStockChangeAdapter() {
		if (stockChangeItemProvider == null) {
			stockChangeItemProvider = new StockChangeItemProvider(this);
		}

		return stockChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.time.continuous.CapacityChange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapacityChangeItemProvider capacityChangeItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.time.continuous.CapacityChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCapacityChangeAdapter() {
		if (capacityChangeItemProvider == null) {
			capacityChangeItemProvider = new CapacityChangeItemProvider(this);
		}

		return capacityChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.time.continuous.SlopeDeltaProvider} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlopeDeltaProviderItemProvider slopeDeltaProviderItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.time.continuous.SlopeDeltaProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSlopeDeltaProviderAdapter() {
		if (slopeDeltaProviderItemProvider == null) {
			slopeDeltaProviderItemProvider = new SlopeDeltaProviderItemProvider(this);
		}

		return slopeDeltaProviderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.time.continuous.SlopeAbsoluteProvider} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlopeAbsoluteProviderItemProvider slopeAbsoluteProviderItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.time.continuous.SlopeAbsoluteProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSlopeAbsoluteProviderAdapter() {
		if (slopeAbsoluteProviderItemProvider == null) {
			slopeAbsoluteProviderItemProvider = new SlopeAbsoluteProviderItemProvider(this);
		}

		return slopeAbsoluteProviderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.time.continuous.AmountDeltaProvider} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmountDeltaProviderItemProvider amountDeltaProviderItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.time.continuous.AmountDeltaProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAmountDeltaProviderAdapter() {
		if (amountDeltaProviderItemProvider == null) {
			amountDeltaProviderItemProvider = new AmountDeltaProviderItemProvider(this);
		}

		return amountDeltaProviderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.time.continuous.AmountAbsoluteProvider} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmountAbsoluteProviderItemProvider amountAbsoluteProviderItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.time.continuous.AmountAbsoluteProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAmountAbsoluteProviderAdapter() {
		if (amountAbsoluteProviderItemProvider == null) {
			amountAbsoluteProviderItemProvider = new AmountAbsoluteProviderItemProvider(this);
		}

		return amountAbsoluteProviderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorFunctionDistributionItemProvider propagatorFunctionDistributionItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropagatorFunctionDistributionAdapter() {
		if (propagatorFunctionDistributionItemProvider == null) {
			propagatorFunctionDistributionItemProvider = new PropagatorFunctionDistributionItemProvider(this);
		}

		return propagatorFunctionDistributionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.time.continuous.PropagatorFunctionDistributionEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorFunctionDistributionEventItemProvider propagatorFunctionDistributionEventItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.time.continuous.PropagatorFunctionDistributionEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropagatorFunctionDistributionEventAdapter() {
		if (propagatorFunctionDistributionEventItemProvider == null) {
			propagatorFunctionDistributionEventItemProvider = new PropagatorFunctionDistributionEventItemProvider(this);
		}

		return propagatorFunctionDistributionEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.time.continuous.PropagatorFunctionEventsProvider} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorFunctionEventsProviderItemProvider propagatorFunctionEventsProviderItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.time.continuous.PropagatorFunctionEventsProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropagatorFunctionEventsProviderAdapter() {
		if (propagatorFunctionEventsProviderItemProvider == null) {
			propagatorFunctionEventsProviderItemProvider = new PropagatorFunctionEventsProviderItemProvider(this);
		}

		return propagatorFunctionEventsProviderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.time.continuous.PropagatorFunctionDistributionAbstract} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorFunctionDistributionAbstractItemProvider propagatorFunctionDistributionAbstractItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.time.continuous.PropagatorFunctionDistributionAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropagatorFunctionDistributionAbstractAdapter() {
		if (propagatorFunctionDistributionAbstractItemProvider == null) {
			propagatorFunctionDistributionAbstractItemProvider = new PropagatorFunctionDistributionAbstractItemProvider(this);
		}

		return propagatorFunctionDistributionAbstractItemProvider;
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
		if (distributionItemProvider != null) distributionItemProvider.dispose();
		if (childEventItemProvider != null) childEventItemProvider.dispose();
		if (startEventItemProvider != null) startEventItemProvider.dispose();
		if (endEventItemProvider != null) endEventItemProvider.dispose();
		if (capacityChangeStartItemProvider != null) capacityChangeStartItemProvider.dispose();
		if (capacityChangeEndItemProvider != null) capacityChangeEndItemProvider.dispose();
		if (stockChangeStartItemProvider != null) stockChangeStartItemProvider.dispose();
		if (stockChangeEndItemProvider != null) stockChangeEndItemProvider.dispose();
		if (amountDeltaAtomicItemProvider != null) amountDeltaAtomicItemProvider.dispose();
		if (slopeDeltaAtomicItemProvider != null) slopeDeltaAtomicItemProvider.dispose();
		if (amountAbsoluteAtomicItemProvider != null) amountAbsoluteAtomicItemProvider.dispose();
		if (slopeAbsoluteAtomicItemProvider != null) slopeAbsoluteAtomicItemProvider.dispose();
		if (stockChangeItemProvider != null) stockChangeItemProvider.dispose();
		if (capacityChangeItemProvider != null) capacityChangeItemProvider.dispose();
		if (slopeDeltaProviderItemProvider != null) slopeDeltaProviderItemProvider.dispose();
		if (slopeAbsoluteProviderItemProvider != null) slopeAbsoluteProviderItemProvider.dispose();
		if (amountDeltaProviderItemProvider != null) amountDeltaProviderItemProvider.dispose();
		if (amountAbsoluteProviderItemProvider != null) amountAbsoluteProviderItemProvider.dispose();
		if (propagatorFunctionDistributionItemProvider != null) propagatorFunctionDistributionItemProvider.dispose();
		if (propagatorFunctionDistributionEventItemProvider != null) propagatorFunctionDistributionEventItemProvider.dispose();
		if (propagatorFunctionEventsProviderItemProvider != null) propagatorFunctionEventsProviderItemProvider.dispose();
		if (propagatorFunctionDistributionAbstractItemProvider != null) propagatorFunctionDistributionAbstractItemProvider.dispose();
	}

}
