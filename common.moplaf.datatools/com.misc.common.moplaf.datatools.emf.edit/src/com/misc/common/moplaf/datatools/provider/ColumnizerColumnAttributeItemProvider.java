/**
 */
package com.misc.common.moplaf.datatools.provider;


import com.misc.common.moplaf.datatools.ColumnizerColumnAttribute;
import com.misc.common.moplaf.datatools.DatatoolsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.provider.EAttributeItemProvider;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.datatools.ColumnizerColumnAttribute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ColumnizerColumnAttributeItemProvider extends NavigationPathItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnizerColumnAttributeItemProvider(AdapterFactory adapterFactory) {
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

			addColumnNamePropertyDescriptor(object);
			addColumnWidthPropertyDescriptor(object);
			addAggregationTypePropertyDescriptor(object);
			addAttributePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Column Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ColumnizerColumn_ColumnName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnizerColumn_ColumnName_feature", "_UI_ColumnizerColumn_type"),
				 DatatoolsPackage.Literals.COLUMNIZER_COLUMN__COLUMN_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Column Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ColumnizerColumn_ColumnWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnizerColumn_ColumnWidth_feature", "_UI_ColumnizerColumn_type"),
				 DatatoolsPackage.Literals.COLUMNIZER_COLUMN__COLUMN_WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected void addAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			( new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ColumnizerColumnAttribute_Attribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnizerColumnAttribute_Attribute_feature", "_UI_ColumnizerColumnAttribute_type"),
				 DatatoolsPackage.Literals.COLUMNIZER_COLUMN_ATTRIBUTE__ATTRIBUTE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null) {

					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						ColumnizerColumnAttribute column = (ColumnizerColumnAttribute)object;
						EClass target_type = column.getTargetType();
						if ( target_type==null ) { 
							return null;
						}
						return target_type.getEAllAttributes();
					}
				
			});
	}

	/**
	 * This adds a property descriptor for the Aggregation Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAggregationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ColumnizerColumn_AggregationType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnizerColumn_AggregationType_feature", "_UI_ColumnizerColumn_type"),
				 DatatoolsPackage.Literals.COLUMNIZER_COLUMN__AGGREGATION_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ColumnizerColumnAttribute.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		EAttributeItemProvider provider = new EAttributeItemProvider(this.getAdapterFactory());
		ColumnizerColumnAttribute columnizer = (ColumnizerColumnAttribute)object;
		EAttribute attribute = columnizer.getAttribute();
		if ( attribute == null) { 
			return super.getImage(object); 
		}
		return provider.getImage(attribute);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ColumnizerColumnAttribute)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_ColumnizerColumnAttribute_type") :
			getString("_UI_ColumnizerColumnAttribute_type") + " " + label;
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

		switch (notification.getFeatureID(ColumnizerColumnAttribute.class)) {
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMN_NAME:
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMN_WIDTH:
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__AGGREGATION_TYPE:
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

}
