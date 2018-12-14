/**
 */
package com.misc.common.moplaf.analysis.provider;


import com.misc.common.moplaf.analysis.Analysis;
import com.misc.common.moplaf.analysis.AnalysisDoc;
import com.misc.common.moplaf.analysis.AnalysisElementKey;
import com.misc.common.moplaf.analysis.AnalysisPackage;
import com.misc.common.moplaf.analysis.AnalysisSheet;
import com.misc.common.moplaf.analysis.util.AnalysisSheetPropertiesProvider;
import com.misc.common.moplaf.common.IPropertiesProvider;
import com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider;
import com.misc.common.moplaf.gridview.emf.edit.util.PropertiesProviderGridsProvider;
import com.misc.common.moplaf.job.provider.DocRefItemProvider;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.analysis.AnalysisDoc} object.
 * <!-- begin-user-doc -->
 * @implements IItemGridsProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysisDocItemProvider extends DocRefItemProvider implements IItemGridsProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisDocItemProvider(AdapterFactory adapterFactory) {
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

			addCompletePropertyDescriptor(object);
			addNbElementsPropertyDescriptor(object);
			addDocIndexPropertyDescriptor(object);
			addColorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Complete feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompletePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnalysisDoc_Complete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnalysisDoc_Complete_feature", "_UI_AnalysisDoc_type"),
				 AnalysisPackage.Literals.ANALYSIS_DOC__COMPLETE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__30DataPropertyCategory"),
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
				 getString("_UI_AnalysisDoc_NbElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnalysisDoc_NbElements_feature", "_UI_AnalysisDoc_type"),
				 AnalysisPackage.Literals.ANALYSIS_DOC__NB_ELEMENTS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__30DataPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Doc Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnalysisDoc_DocIndex_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnalysisDoc_DocIndex_feature", "_UI_AnalysisDoc_type"),
				 AnalysisPackage.Literals.ANALYSIS_DOC__DOC_INDEX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__10DocumentPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnalysisDoc_Color_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnalysisDoc_Color_feature", "_UI_AnalysisDoc_type"),
				 AnalysisPackage.Literals.ANALYSIS_DOC__COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__20ConfigSetUpPropertyCategory"),
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		AnalysisDoc analysisDoc = (AnalysisDoc)object;
		return getString("_UI_AnalysisDoc_type") + " " + analysisDoc.isComplete();
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

		switch (notification.getFeatureID(AnalysisDoc.class)) {
			case AnalysisPackage.ANALYSIS_DOC__ELEMENTS:
			case AnalysisPackage.ANALYSIS_DOC__COMPLETE:
			case AnalysisPackage.ANALYSIS_DOC__NB_ELEMENTS:
			case AnalysisPackage.ANALYSIS_DOC__DOC_INDEX:
			case AnalysisPackage.ANALYSIS_DOC__COLOR:
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
		return AnalysisEditPlugin.INSTANCE;
	}

	/**
	 * Specified by com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider 
	 */
	@Override
	public Object getGrids(Object element) {
		AnalysisDoc doc = (AnalysisDoc)element;
		Analysis analysis = doc.getAnalysis();
		EList<AnalysisDoc> docs = new BasicEList<>();
		docs.add(doc);
		
		PropertiesProviderGridsProvider grids_provider = PropertiesProviderGridsProvider.constructPropertiesProviderGridsProvider();
		for ( AnalysisSheet sheet : analysis.getSheets()) {
			IPropertiesProvider properties = new AnalysisSheetPropertiesProvider(sheet, docs, analysis);
			List<AnalysisElementKey> keys = doc.getElements().stream().map(e -> e.getKey()).collect(Collectors.toList());
			String sheet_name = sheet.getColumnizer().getSheetLabel();
			grids_provider.addSheet(sheet_name, keys, properties).setAggregation(true);
		}
		return grids_provider;
	}
}
