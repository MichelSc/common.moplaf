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
package com.misc.common.moplaf.job.provider;

import com.misc.common.moplaf.job.util.JobAdapterFactory;

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
public class JobItemProviderAdapterFactory extends JobAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	 * @generated
	 */
	public JobItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.job.JobParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobParameterItemProvider jobParameterItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.job.JobParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJobParameterAdapter() {
		if (jobParameterItemProvider == null) {
			jobParameterItemProvider = new JobParameterItemProvider(this);
		}

		return jobParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.job.Runs} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunsItemProvider runsItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.job.Runs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRunsAdapter() {
		if (runsItemProvider == null) {
			runsItemProvider = new RunsItemProvider(this);
		}

		return runsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.job.Tasks} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TasksItemProvider tasksItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.job.Tasks}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTasksAdapter() {
		if (tasksItemProvider == null) {
			tasksItemProvider = new TasksItemProvider(this);
		}

		return tasksItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.job.Docs} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocsItemProvider docsItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.job.Docs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocsAdapter() {
		if (docsItemProvider == null) {
			docsItemProvider = new DocsItemProvider(this);
		}

		return docsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.job.TaskDomain} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskDomainItemProvider taskDomainItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.job.TaskDomain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskDomainAdapter() {
		if (taskDomainItemProvider == null) {
			taskDomainItemProvider = new TaskDomainItemProvider(this);
		}

		return taskDomainItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.job.KeyIndicators} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyIndicatorsItemProvider keyIndicatorsItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.job.KeyIndicators}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createKeyIndicatorsAdapter() {
		if (keyIndicatorsItemProvider == null) {
			keyIndicatorsItemProvider = new KeyIndicatorsItemProvider(this);
		}

		return keyIndicatorsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.job.KeyIndicator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyIndicatorItemProvider keyIndicatorItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.job.KeyIndicator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createKeyIndicatorAdapter() {
		if (keyIndicatorItemProvider == null) {
			keyIndicatorItemProvider = new KeyIndicatorItemProvider(this);
		}

		return keyIndicatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.job.DocsHolder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocsHolderItemProvider docsHolderItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.job.DocsHolder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocsHolderAdapter() {
		if (docsHolderItemProvider == null) {
			docsHolderItemProvider = new DocsHolderItemProvider(this);
		}

		return docsHolderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.job.CompoundDoc} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundDocItemProvider compoundDocItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.job.CompoundDoc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompoundDocAdapter() {
		if (compoundDocItemProvider == null) {
			compoundDocItemProvider = new CompoundDocItemProvider(this);
		}

		return compoundDocItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.job.DocInDocsHolder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocInDocsHolderItemProvider docInDocsHolderItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.job.DocInDocsHolder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocInDocsHolderAdapter() {
		if (docInDocsHolderItemProvider == null) {
			docInDocsHolderItemProvider = new DocInDocsHolderItemProvider(this);
		}

		return docInDocsHolderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.job.TaskInput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskInputItemProvider taskInputItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.job.TaskInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskInputAdapter() {
		if (taskInputItemProvider == null) {
			taskInputItemProvider = new TaskInputItemProvider(this);
		}

		return taskInputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.job.TaskOutput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskOutputItemProvider taskOutputItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.job.TaskOutput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskOutputAdapter() {
		if (taskOutputItemProvider == null) {
			taskOutputItemProvider = new TaskOutputItemProvider(this);
		}

		return taskOutputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.job.RunParams} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunParamsItemProvider runParamsItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.job.RunParams}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRunParamsAdapter() {
		if (runParamsItemProvider == null) {
			runParamsItemProvider = new RunParamsItemProvider(this);
		}

		return runParamsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.job.Run} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunItemProvider runItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.job.Run}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRunAdapter() {
		if (runItemProvider == null) {
			runItemProvider = new RunItemProvider(this);
		}

		return runItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.job.Setter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetterItemProvider setterItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.job.Setter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSetterAdapter() {
		if (setterItemProvider == null) {
			setterItemProvider = new SetterItemProvider(this);
		}

		return setterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.job.SetterAttributeInt} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetterAttributeIntItemProvider setterAttributeIntItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.job.SetterAttributeInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSetterAttributeIntAdapter() {
		if (setterAttributeIntItemProvider == null) {
			setterAttributeIntItemProvider = new SetterAttributeIntItemProvider(this);
		}

		return setterAttributeIntItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.job.SetterAttributeFloat} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetterAttributeFloatItemProvider setterAttributeFloatItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.job.SetterAttributeFloat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSetterAttributeFloatAdapter() {
		if (setterAttributeFloatItemProvider == null) {
			setterAttributeFloatItemProvider = new SetterAttributeFloatItemProvider(this);
		}

		return setterAttributeFloatItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.job.ParamsHolder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParamsHolderItemProvider paramsHolderItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.job.ParamsHolder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParamsHolderAdapter() {
		if (paramsHolderItemProvider == null) {
			paramsHolderItemProvider = new ParamsHolderItemProvider(this);
		}

		return paramsHolderItemProvider;
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
		if (jobParameterItemProvider != null) jobParameterItemProvider.dispose();
		if (runParamsItemProvider != null) runParamsItemProvider.dispose();
		if (runItemProvider != null) runItemProvider.dispose();
		if (setterItemProvider != null) setterItemProvider.dispose();
		if (setterAttributeIntItemProvider != null) setterAttributeIntItemProvider.dispose();
		if (setterAttributeFloatItemProvider != null) setterAttributeFloatItemProvider.dispose();
		if (paramsHolderItemProvider != null) paramsHolderItemProvider.dispose();
		if (runsItemProvider != null) runsItemProvider.dispose();
		if (docsHolderItemProvider != null) docsHolderItemProvider.dispose();
		if (compoundDocItemProvider != null) compoundDocItemProvider.dispose();
		if (docInDocsHolderItemProvider != null) docInDocsHolderItemProvider.dispose();
		if (taskInputItemProvider != null) taskInputItemProvider.dispose();
		if (taskOutputItemProvider != null) taskOutputItemProvider.dispose();
		if (tasksItemProvider != null) tasksItemProvider.dispose();
		if (docsItemProvider != null) docsItemProvider.dispose();
		if (taskDomainItemProvider != null) taskDomainItemProvider.dispose();
		if (keyIndicatorsItemProvider != null) keyIndicatorsItemProvider.dispose();
		if (keyIndicatorItemProvider != null) keyIndicatorItemProvider.dispose();
	}

}
