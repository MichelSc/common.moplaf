/**
 */
package com.misc.common.moplaf.datatools.provider;


import com.misc.common.moplaf.datatools.DataToolContext;
import com.misc.common.moplaf.datatools.DatatoolsFactory;
import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.ExtractorPath;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.datatools.ExtractorPath} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtractorPathItemProvider extends ExtractorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtractorPathItemProvider(AdapterFactory adapterFactory) {
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

			addSourceTypePropertyDescriptor(object);
			addTargetTypePropertyDescriptor(object);
			addManyPropertyDescriptor(object);
			addPathPropertyDescriptor(object);
			addRootTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NavigationPath_SourceType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NavigationPath_SourceType_feature", "_UI_NavigationPath_type"),
				 DatatoolsPackage.Literals.NAVIGATION_PATH__SOURCE_TYPE,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI__25ConfigDetailPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NavigationPath_TargetType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NavigationPath_TargetType_feature", "_UI_NavigationPath_type"),
				 DatatoolsPackage.Literals.NAVIGATION_PATH__TARGET_TYPE,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI__25ConfigDetailPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Many feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addManyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NavigationPath_Many_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NavigationPath_Many_feature", "_UI_NavigationPath_type"),
				 DatatoolsPackage.Literals.NAVIGATION_PATH__MANY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__25ConfigDetailPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NavigationPath_Path_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NavigationPath_Path_feature", "_UI_NavigationPath_type"),
				 DatatoolsPackage.Literals.NAVIGATION_PATH__PATH,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__25ConfigDetailPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Root Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected void addRootTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtractorPath_RootType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtractorPath_RootType_feature", "_UI_ExtractorPath_type"),
				 DatatoolsPackage.Literals.EXTRACTOR_PATH__ROOT_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null)
			{

				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					ExtractorPath extractor = (ExtractorPath)object;
					DataToolContext context = extractor.getContext();
					return context.getDomainTypes();
				}
			}
			);
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
			childrenFeatures.add(DatatoolsPackage.Literals.NAVIGATION_PATH__PATH_ELEMENTS);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ExtractorPath)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_ExtractorPath_type") :
			getString("_UI_ExtractorPath_type") + " " + label;
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

		switch (notification.getFeatureID(ExtractorPath.class)) {
			case DatatoolsPackage.EXTRACTOR_PATH__SOURCE_TYPE:
			case DatatoolsPackage.EXTRACTOR_PATH__MANY:
			case DatatoolsPackage.EXTRACTOR_PATH__PATH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DatatoolsPackage.EXTRACTOR_PATH__PATH_ELEMENTS:
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

		newChildDescriptors.add
			(createChildParameter
				(DatatoolsPackage.Literals.NAVIGATION_PATH__PATH_ELEMENTS,
				 DatatoolsFactory.eINSTANCE.createNavigationReference()));

		newChildDescriptors.add
			(createChildParameter
				(DatatoolsPackage.Literals.NAVIGATION_PATH__PATH_ELEMENTS,
				 DatatoolsFactory.eINSTANCE.createNavigationDowncast()));
	}

}
