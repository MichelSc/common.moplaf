/**
 */
package com.misc.common.moplaf.datatools.provider;


import com.misc.common.moplaf.common.IPropertiesProvider;
import com.misc.common.moplaf.datatools.CategoryAbstract;
import com.misc.common.moplaf.datatools.ColumnizerAbstract;
import com.misc.common.moplaf.datatools.Columnizers;
import com.misc.common.moplaf.datatools.DatatoolsFactory;
import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider;
import com.misc.common.moplaf.gridview.emf.edit.util.PropertiesProviderGridsProvider;

import java.util.Collection;
import java.util.LinkedList;
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

			addNbElementsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI__30DataPropertyCategory"),
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
	 * This returns CategoryAbstract.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CategoryAbstract"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		CategoryAbstract categoryAbstract = (CategoryAbstract)object;
		return getString("_UI_CategoryAbstract_type") + " " + categoryAbstract.getNbElements();
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

		PropertiesProviderGridsProvider grids_provider = PropertiesProviderGridsProvider.constructPropertiesProviderGridsProvider()
				;
		
		Columnizers columnizers = cat.getColumnizerSet(); 
		if ( columnizers!=null ) {
			for ( ColumnizerAbstract columnizer : columnizers.getColumnizers()) {
				IPropertiesProvider properties_columnizer = columnizer.getPropertiesProvider();
				grids_provider.addSheet(columnizer.getSheetLabel(),
						                cat.getElements(),
						                properties_columnizer).setAggregation(columnizer.isAggregation());
			}
		}
		
		grids_provider.addSheet("Categories",
								DatatoolsPackage.Literals.CATEGORY_ABSTRACT__SUB_CATEGORIES, 
								DatatoolsPackage.Literals.CATEGORY__CATEGORY_LABEL, 
								new CategoryPropertiesProvider(CategoryAbstract.PROPERTIES, cat))
					  .setSheetTraits(IItemGridsProvider.TRAITS_BARCHART);
		
		return grids_provider;
	}
	
	private static class CategoryPropertiesProvider implements IPropertiesProvider {
		private CategoryAbstract category;
		private IPropertiesProvider provider;
		public CategoryPropertiesProvider(IPropertiesProvider provider, CategoryAbstract category) {
			this.provider = provider;
			this.category = category;
		}
		private class AggregationProperty {
			IPropertiesProvider provider;
			Object property;
			public AggregationProperty(IPropertiesProvider provider, Object property) {
				super();
				this.provider = provider;
				this.property = property;
			}
			public String getPropertyText() {
				String property_text = this.provider.getPropertyText(this.property);
				int aggregation = this.provider.getPropertyAggregation(this.property);
				String aggregation_text = this.provider.getAggregationText(aggregation);
				return String.format("%s (%s)", property_text, aggregation_text);
				}
			public Object getPropertyValue(Object row) {
				CategoryAbstract category = (CategoryAbstract)row;
				Object value = category.getPropertyAggregation(this.provider, this.property);
				return value;
			}
			public int getPropertyType(Object property) {
				return this.provider.getAggregationType(this.property);
			}
			public int getPropertyTraits(Object property) {
				return 0; // no traits
			}
		}
		@Override
		public Collection<?> getProperties() {
			LinkedList<Object> properties = new LinkedList<Object>();
			properties.addAll(this.provider.getProperties());
			for ( ColumnizerAbstract columnizer : this.category.getColumnizerSet().getColumnizers()) {
				IPropertiesProvider provider = columnizer.getPropertiesProvider();
				for ( Object property : provider.getProperties()) {
					if ( provider.getPropertyAggregation(property)!=IPropertiesProvider.AGGREGATE_NONE) {
						AggregationProperty aggregation_property = new AggregationProperty(provider, property);
						properties.add(aggregation_property);
					}
				}
			}
			return properties;
		}
		@Override
		public String getPropertyText(Object property) {
			if ( property instanceof AggregationProperty) {
				AggregationProperty aggregation_property = (AggregationProperty)property;
				return aggregation_property.getPropertyText();
			}
			return this.provider.getPropertyText(property);
		}
		@Override
		public Object getPropertyValue(Object element, Object property) {
			if ( property instanceof AggregationProperty) {
				AggregationProperty aggregation_property = (AggregationProperty)property;
				return aggregation_property.getPropertyValue(element);
			}
			return this.provider.getPropertyValue(element, property);
		}
		@Override
		public int getPropertyType(Object property) {
			if ( property instanceof AggregationProperty) {
				AggregationProperty aggregation_property = (AggregationProperty)property;
				return aggregation_property.getPropertyType(property);
			}
			return this.provider.getPropertyType(property);
		}
		@Override
		public int getPropertyTraits(Object property) {
			if ( property instanceof AggregationProperty) {
				AggregationProperty aggregation_property = (AggregationProperty)property;
				return aggregation_property.getPropertyTraits(property);
			}
			return this.provider.getPropertyTraits(property);
		}
		@Override
		public int getPropertyAggregation(Object property) {
			if ( property instanceof AggregationProperty) {
				return IPropertiesProvider.AGGREGATE_NONE;
			}
			return this.provider.getPropertyAggregation(property);
		}
		@Override
		public int getPropertyDisplayWidth(Object property) {
			if ( property instanceof AggregationProperty) {
				return 100;
			}
			return this.provider.getPropertyDisplayWidth(property);
		}
		@Override
		public int getPropertyDisplayALignment(Object property) {
			if ( property instanceof AggregationProperty) {
				return IPropertiesProvider.HORIZONTAL_ALIGN_RIGHT;
			}
			return this.provider.getPropertyDisplayALignment(property);
		}
		
	}
}
