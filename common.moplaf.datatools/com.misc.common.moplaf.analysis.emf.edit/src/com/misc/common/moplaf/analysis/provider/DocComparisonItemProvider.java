/**
 */
package com.misc.common.moplaf.analysis.provider;


import com.misc.common.moplaf.analysis.AnalysisFactory;
import com.misc.common.moplaf.analysis.AnalysisPackage;
import com.misc.common.moplaf.analysis.DocComparison;

import com.misc.common.moplaf.datatools.DatatoolsFactory;
import com.misc.common.moplaf.job.JobFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.analysis.DocComparison} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocComparisonItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocComparisonItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(AnalysisPackage.Literals.DOC_COMPARISON__EXTRACTOR);
			childrenFeatures.add(AnalysisPackage.Literals.DOC_COMPARISON__COLUMNIZER_COMPARE);
			childrenFeatures.add(AnalysisPackage.Literals.DOC_COMPARISON__DOC1);
			childrenFeatures.add(AnalysisPackage.Literals.DOC_COMPARISON__DOC2);
			childrenFeatures.add(AnalysisPackage.Literals.DOC_COMPARISON__MATCHES);
			childrenFeatures.add(AnalysisPackage.Literals.DOC_COMPARISON__MATCHER);
			childrenFeatures.add(AnalysisPackage.Literals.DOC_COMPARISON__COLUMNIZER_KEY);
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
	 * This returns DocComparison.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocComparison"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DocComparison_type");
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

		switch (notification.getFeatureID(DocComparison.class)) {
			case AnalysisPackage.DOC_COMPARISON__EXTRACTOR:
			case AnalysisPackage.DOC_COMPARISON__COLUMNIZER_COMPARE:
			case AnalysisPackage.DOC_COMPARISON__DOC1:
			case AnalysisPackage.DOC_COMPARISON__DOC2:
			case AnalysisPackage.DOC_COMPARISON__MATCHES:
			case AnalysisPackage.DOC_COMPARISON__MATCHER:
			case AnalysisPackage.DOC_COMPARISON__COLUMNIZER_KEY:
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
				(AnalysisPackage.Literals.DOC_COMPARISON__EXTRACTOR,
				 DatatoolsFactory.eINSTANCE.createExtractorType()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_COMPARISON__EXTRACTOR,
				 DatatoolsFactory.eINSTANCE.createExtractorPath()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_COMPARISON__EXTRACTOR,
				 DatatoolsFactory.eINSTANCE.createExtractorCompound()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_COMPARISON__EXTRACTOR,
				 DatatoolsFactory.eINSTANCE.createExtractorPipe()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_COMPARISON__EXTRACTOR,
				 DatatoolsFactory.eINSTANCE.createExtractorUnion()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_COMPARISON__EXTRACTOR,
				 DatatoolsFactory.eINSTANCE.createExtractorIntersection()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_COMPARISON__COLUMNIZER_COMPARE,
				 DatatoolsFactory.eINSTANCE.createColumnizerAbstract()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_COMPARISON__COLUMNIZER_COMPARE,
				 DatatoolsFactory.eINSTANCE.createColumnizer()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_COMPARISON__DOC1,
				 AnalysisFactory.eINSTANCE.createDocAnalysis()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_COMPARISON__DOC1,
				 JobFactory.eINSTANCE.createDocInDocsHolder()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_COMPARISON__DOC1,
				 JobFactory.eINSTANCE.createTaskInput()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_COMPARISON__DOC1,
				 JobFactory.eINSTANCE.createTaskOutput()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_COMPARISON__DOC2,
				 AnalysisFactory.eINSTANCE.createDocAnalysis()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_COMPARISON__DOC2,
				 JobFactory.eINSTANCE.createDocInDocsHolder()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_COMPARISON__DOC2,
				 JobFactory.eINSTANCE.createTaskInput()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_COMPARISON__DOC2,
				 JobFactory.eINSTANCE.createTaskOutput()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_COMPARISON__MATCHES,
				 DatatoolsFactory.eINSTANCE.createMatch()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_COMPARISON__MATCHER,
				 DatatoolsFactory.eINSTANCE.createMatcher()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_COMPARISON__COLUMNIZER_KEY,
				 DatatoolsFactory.eINSTANCE.createColumnizerAbstract()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_COMPARISON__COLUMNIZER_KEY,
				 DatatoolsFactory.eINSTANCE.createColumnizer()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == AnalysisPackage.Literals.DOC_COMPARISON__COLUMNIZER_COMPARE ||
			childFeature == AnalysisPackage.Literals.DOC_COMPARISON__COLUMNIZER_KEY ||
			childFeature == AnalysisPackage.Literals.DOC_COMPARISON__DOC1 ||
			childFeature == AnalysisPackage.Literals.DOC_COMPARISON__DOC2;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
