/**
 */
package com.misc.common.moplaf.analysis.provider;


import com.misc.common.moplaf.analysis.Analysis;
import com.misc.common.moplaf.analysis.AnalysisCategory;
import com.misc.common.moplaf.analysis.AnalysisDoc;
import com.misc.common.moplaf.analysis.AnalysisElement;
import com.misc.common.moplaf.analysis.AnalysisFactory;
import com.misc.common.moplaf.analysis.AnalysisSheet;
import com.misc.common.moplaf.analysis.util.AnalysisSheetPropertiesProvider;
import com.misc.common.moplaf.common.Constants;
import com.misc.common.moplaf.common.IPropertiesProvider;
import com.misc.common.moplaf.datatools.CategoryAbstract;
import com.misc.common.moplaf.datatools.ColumnizerAbstract;
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
import org.eclipse.emf.edit.provider.IItemLabelProvider;
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
	
	// this adds property descriptors for every aggregated property in this category
	protected void addAggregationProperties(CategoryAbstract category) {
		AnalysisCategory analysis_category = (AnalysisCategory)category;
		Analysis analysis = analysis_category.getAnalysis();
		for ( AnalysisDoc doc : analysis.getDocs()) {
			IItemPropertyDescriptor descriptor1 = new CategoryAggregatedPropertyDescriptor(null, null, doc); 
			this.itemPropertyDescriptors.add(descriptor1);
			for ( AnalysisSheet sheet : analysis.getSheets()) {
				ColumnizerAbstract columnizer = sheet.getColumnizer();
				IPropertiesProvider provider = columnizer.getPropertiesProvider();
				if ( provider!=null) {
					for ( Object property : provider.getProperties()) {
						if ( provider.getPropertyAggregation(property)!=IPropertiesProvider.AGGREGATE_NONE) {
							// this property support aggregation, add a property descriptor
							IItemPropertyDescriptor descriptor = new CategoryAggregatedPropertyDescriptor(provider, property, doc); 
							this.itemPropertyDescriptors.add(descriptor);
						}
					}
				}
			}
		}
	}
	
	private class CategoryAggregatedPropertyDescriptor implements IItemPropertyDescriptor, IItemLabelProvider{
		private IPropertiesProvider properties;
		private Object property;
		int aggregation;
		int type;
		AnalysisDoc doc;
		
		public CategoryAggregatedPropertyDescriptor(IPropertiesProvider properties, Object property, AnalysisDoc doc) {
			super();
			this.properties = properties;
			this.property = property;
			this.aggregation = property == null 
					? Constants.AGGREGATE_COUNT
					: this.properties.getPropertyAggregation(this.property);
			this.type = property==null
					? Constants.DATA_TYPE_INT
					: this.properties.getPropertyType(this.property);
			this.doc = doc;
		}

		// specified by IItemPropertyDescriptor
		@Override
		public Object getPropertyValue(Object object) {
			CategoryAbstract category = (CategoryAbstract)object;
			Analysis analysis = doc.getAnalysis();
			Object value = analysis.getPropertyAggregation(this.properties, this.property, category, this.doc);
			return value;
		}

		// specified by IItemPropertyDescriptor
		@Override
		public boolean isPropertySet(Object object) {
			return false;
		}

		// specified by IItemPropertyDescriptor
		@Override
		public boolean canSetProperty(Object object) {
			return false;
		}

		// specified by IItemPropertyDescriptor
		@Override
		public void resetPropertyValue(Object object) {
		}

		// specified by IItemPropertyDescriptor
		@Override
		public void setPropertyValue(Object object, Object value) {
		}

		// specified by IItemPropertyDescriptor
		@Override
		public String getCategory(Object object) {
			return "40 Aggregations";
		}

		// specified by IItemPropertyDescriptor
		@Override
		public String getDescription(Object object) {
			return null;
		}

		// specified by IItemPropertyDescriptor
		@Override
		public String getDisplayName(Object object) {
			String name = "";
			if ( this.property==null) {
				name = "Nb";
				
			} else {
				String property = this.properties.getPropertyText(this.property);
				String aggregation = this.properties.getAggregationText(this.aggregation);
				name = String.format("%s (%s)", property, aggregation);
			}
			return String.format("%d:%s", this.doc.getDocIndex(), name);
		}

		// specified by IItemPropertyDescriptor
		@Override
		public String[] getFilterFlags(Object object) {
			return null;
		}

		// specified by IItemPropertyDescriptor
		@Override
		public Object getHelpContextIds(Object object) {
			return null;
		}

		// specified by IItemPropertyDescriptor
		@Override
		public String getId(Object object) {
			String property_text = this.property==null
					? "count"
					: this.properties.getPropertyText(this.property);
			return String.format("%s(%d)", property_text, this.doc.getDocIndex());
		}

		// specified by IItemPropertyDescriptor
		@Override
		public IItemLabelProvider getLabelProvider(Object object) {
			return this;
		}

		// specified by IItemPropertyDescriptor
		@Override
		public boolean isCompatibleWith(Object object, Object anotherObject,
				IItemPropertyDescriptor anotherPropertyDescriptor) {
			return false;
		}

		// specified by IItemPropertyDescriptor
		@Override
		public Object getFeature(Object object) {
			return null;
		}

		// specified by IItemPropertyDescriptor
		@Override
		public boolean isMany(Object object) {
			return false;
		}

		// specified by IItemPropertyDescriptor
		@Override
		public Collection<?> getChoiceOfValues(Object object) {
			return null;
		}

		// specified by IItemPropertyDescriptor
		@Override
		public boolean isMultiLine(Object object) {
			return false;
		}

		// specified by IItemPropertyDescriptor
		@Override
		public boolean isSortChoices(Object object) {
			return false;
		}

		// specified by IItemLabelProvider 
		@Override
		public String getText(Object object) {
			String format = null;
			String text = com.misc.common.moplaf.common.util.Util.getTextFromValue(object, this.type, format);
			return text;
		}

		// specified by IItemLabelProvider 
		@Override
		public Object getImage(Object object) {
			// TODO Auto-generated method stub
			return null;
		}
		
	};


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
			Collection<?> keys = category.getElements().stream().map(e -> ((AnalysisElement)e).getKey()).collect(Collectors.toSet());
			String sheet_name = sheet.getColumnizer().getSheetLabel();
			grids_provider.addSheet(sheet_name, keys, properties).setAggregation(true);
		}
		return grids_provider;
	}
}
