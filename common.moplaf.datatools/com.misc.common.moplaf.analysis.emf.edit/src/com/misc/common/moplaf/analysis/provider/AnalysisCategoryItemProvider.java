/**
 */
package com.misc.common.moplaf.analysis.provider;


import com.misc.common.moplaf.analysis.Analysis;
import com.misc.common.moplaf.analysis.AnalysisCategory;
import com.misc.common.moplaf.analysis.AnalysisDoc;
import com.misc.common.moplaf.analysis.AnalysisElement;
import com.misc.common.moplaf.analysis.AnalysisElementKey;
import com.misc.common.moplaf.analysis.AnalysisFactory;
import com.misc.common.moplaf.analysis.AnalysisSheet;
import com.misc.common.moplaf.analysis.util.AnalysisSheetPropertiesProvider;
import com.misc.common.moplaf.common.IPropertiesProvider;
import com.misc.common.moplaf.datatools.DatatoolsPackage;

import com.misc.common.moplaf.datatools.provider.CategoryItemProvider;
import com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider;
import com.misc.common.moplaf.gridview.emf.edit.util.PropertiesProviderGridsProvider;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.analysis.AnalysisCategory} object.
 * <!-- begin-user-doc -->
 * @implements IItemGridsProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysisCategoryItemProvider extends CategoryItemProvider implements IItemGridsProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisCategoryItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}


	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		this.itemPropertyDescriptors = null;
		return super.getPropertyDescriptors(object);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AnalysisCategory)object).getCategoryLabel();
		return label == null || label.length() == 0 ?
			getString("_UI_AnalysisCategory_type") :
			getString("_UI_AnalysisCategory_type") + " " + label;
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
				 AnalysisFactory.eINSTANCE.createAnalysisCategory()));
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
		AnalysisCategory category = (AnalysisCategory)element;
		Analysis analysis = category.getAnalysis();
		EList<AnalysisDoc> docs = analysis.getDocs();
		
		PropertiesProviderGridsProvider grids_provider = PropertiesProviderGridsProvider.constructPropertiesProviderGridsProvider();
		for ( AnalysisSheet sheet : analysis.getSheets()) {
			IPropertiesProvider properties = new AnalysisSheetPropertiesProvider(sheet, docs, category);
			List<AnalysisElementKey> keys = category.getElements().stream().map(e -> ((AnalysisElement)e).getKey()).collect(Collectors.toList());
			String sheet_name = sheet.getColumnizer().getSheetLabel();
			grids_provider.addSheet(sheet_name, keys, properties).setAggregation(false);
		}
		return grids_provider;
	}
}
