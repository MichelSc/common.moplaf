package com.misc.common.moplaf.analysis.util;

import java.util.Collection;
import java.util.LinkedList;

import com.misc.common.moplaf.analysis.Analysis;
import com.misc.common.moplaf.analysis.AnalysisDoc;
import com.misc.common.moplaf.analysis.AnalysisSheet;
import com.misc.common.moplaf.common.Constants;
import com.misc.common.moplaf.common.IPropertiesProvider;
import com.misc.common.moplaf.datatools.CategoryAbstract;
import com.misc.common.moplaf.datatools.ColumnizerAbstract;

public class CategoryPropertiesProvider implements IPropertiesProvider {
	private Analysis analysis;
	private IPropertiesProvider provider;
	public CategoryPropertiesProvider(IPropertiesProvider provider, Analysis analysis) {
		this.provider = provider;
		this.analysis = analysis;
	}
	private class AggregationProperty {
		IPropertiesProvider provider; // the provider for the aggregated property
		Object property; // the aggregated property
		AnalysisDoc doc; // the doc to aggregate on
		public AggregationProperty(IPropertiesProvider provider, Object property, AnalysisDoc doc) {
			super();
			this.provider = provider; // is never null
			this.property = property; // if null, this is the number of property
			this.doc = doc; // is never null
		}
		public String getPropertyText() {
			String text = "Nb";
			if ( property!=null ) {
				String property_text = this.provider.getPropertyText(this.property);
				int aggregation = this.provider.getPropertyAggregation(this.property);
				String aggregation_text = this.provider.getAggregationText(aggregation);
				text = String.format("%s (%s)", property_text, aggregation_text);
			}
			return String.format("%d:%s", this.doc.getDocIndex(), text); 
		}
		public Object getPropertyValue(Object row) {
			CategoryAbstract category = (CategoryAbstract)row;
			Object value = this.doc.getPropertyAggregation(this.provider, this.property, category);
			return value;
		}
		public int getPropertyType(Object property) {
			return this.property==null
					? Constants.DATA_TYPE_INT
					: this.provider.getAggregationType(this.property);
		}
	}
	@Override
	public Collection<?> getProperties() {
		LinkedList<Object> properties = new LinkedList<Object>();
		properties.addAll(this.provider.getProperties());
		for ( AnalysisDoc doc : this.analysis.getDocs()) {
			properties.add(new AggregationProperty(null, null, doc));
			for ( AnalysisSheet sheet : this.analysis.getSheets()) {
				ColumnizerAbstract columnizer = sheet.getColumnizer();
				IPropertiesProvider provider = columnizer.getPropertiesProvider();
				if ( provider!=null ) {
					for ( Object property : provider.getProperties()) {
						if ( provider.getPropertyAggregation(property)!=IPropertiesProvider.AGGREGATE_NONE) {
							AggregationProperty aggregation_property = new AggregationProperty(provider, property, doc);
							properties.add(aggregation_property);
						}
					}
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
			return Constants.TRAITS_NONE;
		}
		return this.provider.getPropertyTraits(property);
	}
	@Override
	public int getPropertyAggregation(Object property) {
		if ( property instanceof AggregationProperty) {
			return Constants.AGGREGATE_NONE;
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
			return Constants.HORIZONTAL_ALIGN_RIGHT;
		}
		return this.provider.getPropertyDisplayALignment(property);
	}
}
