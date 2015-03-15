/**
 */
package com.misc.common.moplaf.gis.provider;

import com.misc.common.moplaf.gis.util.GisAdapterFactory;

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
	 * @generated
	 */
	public GisItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
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
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.gis.GisAddress} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisAddressItemProvider gisAddressItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.gis.GisAddress}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGisAddressAdapter() {
		if (gisAddressItemProvider == null) {
			gisAddressItemProvider = new GisAddressItemProvider(this);
		}

		return gisAddressItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.gis.GisDistanceMatrix} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisDistanceMatrixItemProvider gisDistanceMatrixItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.gis.GisDistanceMatrix}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGisDistanceMatrixAdapter() {
		if (gisDistanceMatrixItemProvider == null) {
			gisDistanceMatrixItemProvider = new GisDistanceMatrixItemProvider(this);
		}

		return gisDistanceMatrixItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.gis.GisDistanceMatrixElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisDistanceMatrixElementItemProvider gisDistanceMatrixElementItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.gis.GisDistanceMatrixElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGisDistanceMatrixElementAdapter() {
		if (gisDistanceMatrixElementItemProvider == null) {
			gisDistanceMatrixElementItemProvider = new GisDistanceMatrixElementItemProvider(this);
		}

		return gisDistanceMatrixElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.gis.GisDistanceFromLocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisDistanceFromLocationItemProvider gisDistanceFromLocationItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.gis.GisDistanceFromLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGisDistanceFromLocationAdapter() {
		if (gisDistanceFromLocationItemProvider == null) {
			gisDistanceFromLocationItemProvider = new GisDistanceFromLocationItemProvider(this);
		}

		return gisDistanceFromLocationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.gis.GisDistanceToLocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisDistanceToLocationItemProvider gisDistanceToLocationItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.gis.GisDistanceToLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGisDistanceToLocationAdapter() {
		if (gisDistanceToLocationItemProvider == null) {
			gisDistanceToLocationItemProvider = new GisDistanceToLocationItemProvider(this);
		}

		return gisDistanceToLocationItemProvider;
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
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.gis.GisAddressGeocoder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisAddressGeocoderItemProvider gisAddressGeocoderItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.gis.GisAddressGeocoder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGisAddressGeocoderAdapter() {
		if (gisAddressGeocoderItemProvider == null) {
			gisAddressGeocoderItemProvider = new GisAddressGeocoderItemProvider(this);
		}

		return gisAddressGeocoderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.gis.GisDistanceMatrixCalculator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisDistanceMatrixCalculatorItemProvider gisDistanceMatrixCalculatorItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.gis.GisDistanceMatrixCalculator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGisDistanceMatrixCalculatorAdapter() {
		if (gisDistanceMatrixCalculatorItemProvider == null) {
			gisDistanceMatrixCalculatorItemProvider = new GisDistanceMatrixCalculatorItemProvider(this);
		}

		return gisDistanceMatrixCalculatorItemProvider;
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
		if (gisCoordinatesItemProvider != null) gisCoordinatesItemProvider.dispose();
		if (gisAddressItemProvider != null) gisAddressItemProvider.dispose();
		if (gisDistanceMatrixItemProvider != null) gisDistanceMatrixItemProvider.dispose();
		if (gisDistanceMatrixElementItemProvider != null) gisDistanceMatrixElementItemProvider.dispose();
		if (gisDistanceFromLocationItemProvider != null) gisDistanceFromLocationItemProvider.dispose();
		if (gisDistanceToLocationItemProvider != null) gisDistanceToLocationItemProvider.dispose();
		if (gisAddressGeocodedItemProvider != null) gisAddressGeocodedItemProvider.dispose();
		if (gisAddressGeocoderItemProvider != null) gisAddressGeocoderItemProvider.dispose();
		if (gisDistanceMatrixCalculatorItemProvider != null) gisDistanceMatrixCalculatorItemProvider.dispose();
	}

}
