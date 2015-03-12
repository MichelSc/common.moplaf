/**
 */
package com.misc.common.moplaf.flock.provider;


import com.misc.common.moplaf.flock.ChainFlock;
import com.misc.common.moplaf.flock.FlockPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.flock.ChainFlock} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChainFlockItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainFlockItemProvider(AdapterFactory adapterFactory) {
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

			addMountedFlocksPropertyDescriptor(object);
			addMounterFlockPropertyDescriptor(object);
			addNextFlockPropertyDescriptor(object);
			addPreviousFlockPropertyDescriptor(object);
			addChainPropertyDescriptor(object);
			addFlockPropertyDescriptor(object);
			addSequenceNrPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Mounted Flocks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMountedFlocksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChainFlock_MountedFlocks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChainFlock_MountedFlocks_feature", "_UI_ChainFlock_type"),
				 FlockPackage.Literals.CHAIN_FLOCK__MOUNTED_FLOCKS,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI__2ConfigurationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Mounter Flock feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMounterFlockPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChainFlock_MounterFlock_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChainFlock_MounterFlock_feature", "_UI_ChainFlock_type"),
				 FlockPackage.Literals.CHAIN_FLOCK__MOUNTER_FLOCK,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI__2ConfigurationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Next Flock feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextFlockPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChainFlock_NextFlock_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChainFlock_NextFlock_feature", "_UI_ChainFlock_type"),
				 FlockPackage.Literals.CHAIN_FLOCK__NEXT_FLOCK,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI__1FlockPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Previous Flock feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreviousFlockPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChainFlock_PreviousFlock_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChainFlock_PreviousFlock_feature", "_UI_ChainFlock_type"),
				 FlockPackage.Literals.CHAIN_FLOCK__PREVIOUS_FLOCK,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI__1FlockPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Chain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChainFlock_Chain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChainFlock_Chain_feature", "_UI_ChainFlock_type"),
				 FlockPackage.Literals.CHAIN_FLOCK__CHAIN,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI__1FlockPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Flock feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlockPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChainFlock_Flock_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChainFlock_Flock_feature", "_UI_ChainFlock_type"),
				 FlockPackage.Literals.CHAIN_FLOCK__FLOCK,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI__1FlockPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Sequence Nr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSequenceNrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChainFlock_SequenceNr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChainFlock_SequenceNr_feature", "_UI_ChainFlock_type"),
				 FlockPackage.Literals.CHAIN_FLOCK__SEQUENCE_NR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__1FlockPropertyCategory"),
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
			childrenFeatures.add(FlockPackage.Literals.CHAIN_FLOCK__MOUNTED_FLOCKS);
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
	 * This returns ChainFlock.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ChainFlock"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ChainFlock chainFlock = (ChainFlock)object;
		return getString("_UI_ChainFlock_type") + " " + chainFlock.getSequenceNr();
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

		switch (notification.getFeatureID(ChainFlock.class)) {
			case FlockPackage.CHAIN_FLOCK__SEQUENCE_NR:
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
		return FlockEditPlugin.INSTANCE;
	}

}
