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
package com.misc.common.moplaf.gis.provider;

import com.misc.common.moplaf.gis.util.GisAdapterFactory;
import com.misc.common.moplaf.gisview.emf.edit.IItemLocationsProvider;
import com.misc.common.moplaf.gisview.emf.edit.IItemPathsProvider;

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
public class GisItemProviderAdapterFactory extends GisAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public GisItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(IItemLocationsProvider.class); // non emf interface
		supportedTypes.add(IItemPathsProvider.class); // non emf interface
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.gis.GisCoordinates} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisCoordinatesItemProvider gisCoordinatesItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.gis.GisCoordinates}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGisCoordinatesAdapter() {
		if (gisCoordinatesItemProvider == null) {
			gisCoordinatesItemProvider = new GisCoordinatesItemProvider(this);
		}

		return gisCoordinatesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.gis.GisGeometry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisGeometryItemProvider gisGeometryItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.gis.GisGeometry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGisGeometryAdapter() {
		if (gisGeometryItemProvider == null) {
			gisGeometryItemProvider = new GisGeometryItemProvider(this);
		}

		return gisGeometryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.gis.GisRoutesHolder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisRoutesHolderItemProvider gisRoutesHolderItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.gis.GisRoutesHolder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGisRoutesHolderAdapter() {
		if (gisRoutesHolderItemProvider == null) {
			gisRoutesHolderItemProvider = new GisRoutesHolderItemProvider(this);
		}

		return gisRoutesHolderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.gis.GisRoutesHolderWaypoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisRoutesHolderWaypointItemProvider gisRoutesHolderWaypointItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.gis.GisRoutesHolderWaypoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGisRoutesHolderWaypointAdapter() {
		if (gisRoutesHolderWaypointItemProvider == null) {
			gisRoutesHolderWaypointItemProvider = new GisRoutesHolderWaypointItemProvider(this);
		}

		return gisRoutesHolderWaypointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.gis.GisRoutesHolderFromLocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisRoutesHolderFromLocationItemProvider gisRoutesHolderFromLocationItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.gis.GisRoutesHolderFromLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGisRoutesHolderFromLocationAdapter() {
		if (gisRoutesHolderFromLocationItemProvider == null) {
			gisRoutesHolderFromLocationItemProvider = new GisRoutesHolderFromLocationItemProvider(this);
		}

		return gisRoutesHolderFromLocationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.gis.GisRoutesHolderToLocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisRoutesHolderToLocationItemProvider gisRoutesHolderToLocationItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.gis.GisRoutesHolderToLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGisRoutesHolderToLocationAdapter() {
		if (gisRoutesHolderToLocationItemProvider == null) {
			gisRoutesHolderToLocationItemProvider = new GisRoutesHolderToLocationItemProvider(this);
		}

		return gisRoutesHolderToLocationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.gis.GisRoutesHolderElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisRoutesHolderElementItemProvider gisRoutesHolderElementItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.gis.GisRoutesHolderElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGisRoutesHolderElementAdapter() {
		if (gisRoutesHolderElementItemProvider == null) {
			gisRoutesHolderElementItemProvider = new GisRoutesHolderElementItemProvider(this);
		}

		return gisRoutesHolderElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.gis.GisRouteInfo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisRouteInfoItemProvider gisRouteInfoItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.gis.GisRouteInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGisRouteInfoAdapter() {
		if (gisRouteInfoItemProvider == null) {
			gisRouteInfoItemProvider = new GisRouteInfoItemProvider(this);
		}

		return gisRouteInfoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.gis.GisAddressGeocoded} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisAddressGeocodedItemProvider gisAddressGeocodedItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.gis.GisAddressGeocoded}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGisAddressGeocodedAdapter() {
		if (gisAddressGeocodedItemProvider == null) {
			gisAddressGeocodedItemProvider = new GisAddressGeocodedItemProvider(this);
		}

		return gisAddressGeocodedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.gis.GisAddressStructured} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisAddressStructuredItemProvider gisAddressStructuredItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.gis.GisAddressStructured}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGisAddressStructuredAdapter() {
		if (gisAddressStructuredItemProvider == null) {
			gisAddressStructuredItemProvider = new GisAddressStructuredItemProvider(this);
		}

		return gisAddressStructuredItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.gis.GisAddressUnstructured} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisAddressUnstructuredItemProvider gisAddressUnstructuredItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.gis.GisAddressUnstructured}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGisAddressUnstructuredAdapter() {
		if (gisAddressUnstructuredItemProvider == null) {
			gisAddressUnstructuredItemProvider = new GisAddressUnstructuredItemProvider(this);
		}

		return gisAddressUnstructuredItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.gis.GisRouterGeodesic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisRouterGeodesicItemProvider gisRouterGeodesicItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.gis.GisRouterGeodesic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGisRouterGeodesicAdapter() {
		if (gisRouterGeodesicItemProvider == null) {
			gisRouterGeodesicItemProvider = new GisRouterGeodesicItemProvider(this);
		}

		return gisRouterGeodesicItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.gis.GisRouterDefaulted} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisRouterDefaultedItemProvider gisRouterDefaultedItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.gis.GisRouterDefaulted}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGisRouterDefaultedAdapter() {
		if (gisRouterDefaultedItemProvider == null) {
			gisRouterDefaultedItemProvider = new GisRouterDefaultedItemProvider(this);
		}

		return gisRouterDefaultedItemProvider;
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

// michel: generated implementation, with following comment
// michel: do not understand: type is forgotten		
// javadoc: This implementation substitutes the factory itself as the key for the adapter.
//			return super.adapt(notifier, this); 

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
		if (gisRoutesHolderItemProvider != null) gisRoutesHolderItemProvider.dispose();
		if (gisRoutesHolderWaypointItemProvider != null) gisRoutesHolderWaypointItemProvider.dispose();
		if (gisRoutesHolderFromLocationItemProvider != null) gisRoutesHolderFromLocationItemProvider.dispose();
		if (gisRoutesHolderToLocationItemProvider != null) gisRoutesHolderToLocationItemProvider.dispose();
		if (gisRoutesHolderElementItemProvider != null) gisRoutesHolderElementItemProvider.dispose();
		if (gisRouteInfoItemProvider != null) gisRouteInfoItemProvider.dispose();
		if (gisAddressGeocodedItemProvider != null) gisAddressGeocodedItemProvider.dispose();
		if (gisAddressStructuredItemProvider != null) gisAddressStructuredItemProvider.dispose();
		if (gisAddressUnstructuredItemProvider != null) gisAddressUnstructuredItemProvider.dispose();
		if (gisRouterGeodesicItemProvider != null) gisRouterGeodesicItemProvider.dispose();
		if (gisRouterDefaultedItemProvider != null) gisRouterDefaultedItemProvider.dispose();
		if (gisCoordinatesItemProvider != null) gisCoordinatesItemProvider.dispose();
		if (gisGeometryItemProvider != null) gisGeometryItemProvider.dispose();
	}

}
