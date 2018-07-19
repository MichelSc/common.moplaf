/**
 */
package com.misc.common.moplaf.datatools.provider;


import com.misc.common.moplaf.datatools.CategoryAbstract;
import com.misc.common.moplaf.datatools.Columnizer;
import com.misc.common.moplaf.datatools.DatatoolsFactory;
import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider;

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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.datatools.CategoryAbstract} object.
 * <!-- begin-user-doc -->
 * @implements IItemGridsProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class CategoryAbstractItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemGridsProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryAbstractItemProvider(AdapterFactory adapterFactory) {
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

			addElementsPropertyDescriptor(object);
			addNbElementsPropertyDescriptor(object);
			addCategoryLabelPropertyDescriptor(object);
			addCategoryColumnizerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CategoryAbstract_Elements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CategoryAbstract_Elements_feature", "_UI_CategoryAbstract_type"),
				 DatatoolsPackage.Literals.CATEGORY_ABSTRACT__ELEMENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nb Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNbElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CategoryAbstract_NbElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CategoryAbstract_NbElements_feature", "_UI_CategoryAbstract_type"),
				 DatatoolsPackage.Literals.CATEGORY_ABSTRACT__NB_ELEMENTS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Category Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CategoryAbstract_CategoryLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CategoryAbstract_CategoryLabel_feature", "_UI_CategoryAbstract_type"),
				 DatatoolsPackage.Literals.CATEGORY_ABSTRACT__CATEGORY_LABEL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Category Columnizer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryColumnizerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CategoryAbstract_CategoryColumnizer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CategoryAbstract_CategoryColumnizer_feature", "_UI_CategoryAbstract_type"),
				 DatatoolsPackage.Literals.CATEGORY_ABSTRACT__CATEGORY_COLUMNIZER,
				 true,
				 false,
				 true,
				 null,
				 null,
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
			childrenFeatures.add(DatatoolsPackage.Literals.CATEGORY_ABSTRACT__SUB_CATEGORIES);
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
		String label = ((CategoryAbstract)object).getCategoryLabel();
		return label == null || label.length() == 0 ?
			getString("_UI_CategoryAbstract_type") :
			getString("_UI_CategoryAbstract_type") + " " + label;
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

		switch (notification.getFeatureID(CategoryAbstract.class)) {
			case DatatoolsPackage.CATEGORY_ABSTRACT__NB_ELEMENTS:
			case DatatoolsPackage.CATEGORY_ABSTRACT__CATEGORY_LABEL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DatatoolsPackage.CATEGORY_ABSTRACT__SUB_CATEGORIES:
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
				(DatatoolsPackage.Literals.CATEGORY_ABSTRACT__SUB_CATEGORIES,
				 DatatoolsFactory.eINSTANCE.createCategory()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DatatoolsEditPlugin.INSTANCE;
	}

	/**
	 * Specified by com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider 
	 */
	@Override
	public Object getGrids(Object element) {
		CategoryAbstract cat = (CategoryAbstract)element;
		
		Columnizer columnizer = cat.getCategoryColumnizer();
		if ( columnizer==null) {
			return null;
		}

		IItemGridsProvider gridsProvider = new ColumnizerItemGridsProvider(columnizer, cat.getElements());	
		return gridsProvider;
	}
}
