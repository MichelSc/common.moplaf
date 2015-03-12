/**
 */
package com.misc.common.moplaf.dataextractor.provider;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import org.eclipse.emf.edit.provider.ViewerNotification;
import com.misc.common.moplaf.dataextractor.DataExtractorElement;
import com.misc.common.moplaf.dataextractor.DataSelectorFeature;
import com.misc.common.moplaf.dataextractor.DataextractorPackage;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.dataextractor.DataSelectorFeature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataSelectorFeatureItemProvider extends DataSelectorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSelectorFeatureItemProvider(AdapterFactory adapterFactory) {
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

			addFeaturePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected void addFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataSelectorFeature_Feature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataSelectorFeature_Feature_feature", "_UI_DataSelectorFeature_type"),
				 DataextractorPackage.Literals.DATA_SELECTOR_FEATURE__FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null){
				public Collection<?> getChoiceOfValues(Object object) {
					DataSelectorFeature thisDataSelector = (DataSelectorFeature)object;
					DataExtractorElement thisDataExtractorElement = thisDataSelector.getExtractorElement();
					EClass targetType = thisDataExtractorElement.getTargetType();
					List resultList = new ArrayList();
					if ( targetType!=null){
						for ( EStructuralFeature feature : targetType.getEAllStructuralFeatures()){
							if ( feature.isMany() ) { continue; }
							if ( feature.getEType()!=thisDataSelector.getFeatureClassifier() ) { continue; }
							resultList.add(feature);
						}
					}
					
					return resultList;
				}  // getChoiceOfValues
			});  // add
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataSelectorFeature)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_DataSelectorFeature_type") :
			getString("_UI_DataSelectorFeature_type") + " " + label;
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

		switch (notification.getFeatureID(DataSelectorFeature.class)) {
			case DataextractorPackage.DATA_SELECTOR_FEATURE__FEATURE:
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
