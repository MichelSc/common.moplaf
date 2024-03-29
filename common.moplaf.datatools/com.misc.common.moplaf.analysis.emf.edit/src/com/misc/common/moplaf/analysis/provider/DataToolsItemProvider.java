/**
 */
package com.misc.common.moplaf.analysis.provider;


import com.misc.common.moplaf.analysis.AnalysisPackage;
import com.misc.common.moplaf.analysis.DataTools;
import com.misc.common.moplaf.datatools.DataToolType;
import com.misc.common.moplaf.datatools.DatatoolsFactory;

import com.misc.common.moplaf.datatools.provider.DataToolContextItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.analysis.DataTools} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataToolsItemProvider extends DataToolContextItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataToolsItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(AnalysisPackage.Literals.DATA_TOOLS__DATA_TOOLS);
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
	 * This returns DataTools.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/moplaf_folder.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DataTools_type");
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

		switch (notification.getFeatureID(DataTools.class)) {
			case AnalysisPackage.DATA_TOOLS__DATA_TOOLS:
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
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DATA_TOOLS__DATA_TOOLS,
				 DatatoolsFactory.eINSTANCE.createExtractorType()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DATA_TOOLS__DATA_TOOLS,
				 DatatoolsFactory.eINSTANCE.createExtractorPath()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DATA_TOOLS__DATA_TOOLS,
				 DatatoolsFactory.eINSTANCE.createExtractorCompound()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DATA_TOOLS__DATA_TOOLS,
				 DatatoolsFactory.eINSTANCE.createExtractorPipe()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DATA_TOOLS__DATA_TOOLS,
				 DatatoolsFactory.eINSTANCE.createExtractorUnion()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DATA_TOOLS__DATA_TOOLS,
				 DatatoolsFactory.eINSTANCE.createExtractorIntersection()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DATA_TOOLS__DATA_TOOLS,
				 DatatoolsFactory.eINSTANCE.createColumnizer()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DATA_TOOLS__DATA_TOOLS,
				 DatatoolsFactory.eINSTANCE.createCategorizerStructuralFeature()));

		Util.collectNewChildRunDescriptors2(newChildDescriptors, object, AnalysisPackage.Literals.DATA_TOOLS__DATA_TOOLS, DataToolType.EXTRACTOR);
		Util.collectNewChildRunDescriptors2(newChildDescriptors, object, AnalysisPackage.Literals.DATA_TOOLS__DATA_TOOLS, DataToolType.COLUMNIZER);
		Util.collectNewChildRunDescriptors2(newChildDescriptors, object, AnalysisPackage.Literals.DATA_TOOLS__DATA_TOOLS, DataToolType.CATEGORIZER);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AnalysisEditPlugin.INSTANCE;
	}

}
