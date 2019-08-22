package com.misc.common.moplaf.analysis.util;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import com.misc.common.moplaf.analysis.AnalysisSheet;
import com.misc.common.moplaf.analysis.AnalysisDoc;
import com.misc.common.moplaf.analysis.AnalysisElement;
import com.misc.common.moplaf.analysis.AnalysisElementKey;
import com.misc.common.moplaf.common.IPropertiesProvider;
import com.misc.common.moplaf.datatools.CategoryAbstract;

public class AnalysisSheetPropertiesProvider implements IPropertiesProvider {
	private AnalysisSheet sheet;
	private EList<AnalysisDoc> docs;
	private CategoryAbstract category;

	public AnalysisSheetPropertiesProvider(AnalysisSheet sheet, EList<AnalysisDoc> docs, CategoryAbstract category) {
		super();
		this.sheet = sheet;
		this.docs = docs;
		this.category = category;
	}

	private class Property {
		private Object property;
		private AnalysisDoc doc;
		private int doc_index;
		public Property(Object property, AnalysisDoc doc, int doc_index) {
			super();
			this.property = property;
			this.doc = doc;
			this.doc_index = doc_index;
		}
		public Object getProperty() {
			return property;
		}
		public AnalysisDoc getDoc() {
			return doc;
		}
		public int getDocIndex() {
			return doc_index;
		}
		public boolean isKey() {
			return this.doc==null;
		}
		public boolean isDoc() {
			return this.doc!=null;
		}
	}

	@Override
	public Collection<?> getProperties() {
		IPropertiesProvider propertiesProvider = sheet.getColumnizer().getPropertiesProvider();
		LinkedList<Property> properties = new LinkedList<Property>();
		for ( Object property : propertiesProvider.getProperties()) {
			if ( propertiesProvider.isPropertyKey(property) ) {
				properties.add(new Property(property, null, 0));
			}
		}
		for ( AnalysisDoc doc : this.docs) {
			int doc_index = doc.getDocIndex();
			for ( Object property : propertiesProvider.getProperties()) {
				if ( !propertiesProvider.isPropertyKey(property) ) {
					properties.add(new Property(property, doc, doc_index));
				}
			}
		}
		return properties;	
	}

	@Override
	public String getPropertyText(Object property) {
		Property analysisProperty = (Property)property;
		IPropertiesProvider propertiesProvider = sheet.getColumnizer().getPropertiesProvider();
		String text = propertiesProvider.getPropertyText(analysisProperty.getProperty());
		if ( analysisProperty.isDoc()) {
			text = String.format("%d:%s", analysisProperty.getDocIndex(), text);
		}
		return text;
	}

	@Override
	public Object getPropertyValue(Object element, Object property) {
		Property analysisProperty = (Property)property;
		AnalysisDoc doc = analysisProperty.getDoc();
		AnalysisElementKey keyElement = (AnalysisElementKey)element;
		AnalysisElement analysisElement = keyElement.getElement(analysisProperty.getDoc());
		if ( analysisElement==null) {
			return null;
		}
		if ( doc!=null && !analysisElement.isInCategory(this.category)) {
			return null;
		}
		EObject object = analysisElement.getElement();
		IPropertiesProvider propertiesProvider = sheet.getColumnizer().getPropertiesProvider();
		return propertiesProvider.getPropertyValue(object, analysisProperty.getProperty());
	}

	@Override
	public int getPropertyType(Object property) {
		Property analysisProperty = (Property)property;
		IPropertiesProvider propertiesProvider = sheet.getColumnizer().getPropertiesProvider();
		return propertiesProvider.getPropertyType(analysisProperty.getProperty());
	}

	@Override
	public int getPropertyTraits(Object property) {
		Property analysisProperty = (Property)property;
		IPropertiesProvider propertiesProvider = sheet.getColumnizer().getPropertiesProvider();
		return propertiesProvider.getPropertyTraits(analysisProperty.getProperty());
	}
	
	@Override
	public int getPropertyValueTraits(Object element, Object property) {
		if ( this.isDifference(element, property)) {
			return TRAITS_HIGHLIGHT;
		}
		return TRAITS_NONE;
	}

	@Override
	public int getPropertyAggregation(Object property) {
		Property analysisProperty = (Property)property;
		IPropertiesProvider propertiesProvider = sheet.getColumnizer().getPropertiesProvider();
		return propertiesProvider.getPropertyAggregation(analysisProperty.getProperty());
	}

	@Override
	public int getPropertyDisplayWidth(Object property) {
		Property analysisProperty = (Property)property;
		IPropertiesProvider propertiesProvider = sheet.getColumnizer().getPropertiesProvider();
		return propertiesProvider.getPropertyDisplayWidth(analysisProperty.getProperty());
	}

	@Override
	public int getPropertyDisplayAlignment(Object property) {
		Property analysisProperty = (Property)property;
		IPropertiesProvider propertiesProvider = sheet.getColumnizer().getPropertiesProvider();
		return propertiesProvider.getPropertyDisplayAlignment(analysisProperty.getProperty());
	}

	private boolean isDifference(Object element, Object property) {
		AnalysisElementKey keyElement = (AnalysisElementKey)element;
		IPropertiesProvider propertiesProvider = sheet.getColumnizer().getPropertiesProvider();
		Property analysisProperty = (Property)property;
		if ( analysisProperty.isKey()) {
			return false;
		}
		Object value_this_doc = this.getPropertyValue(element, property);
		for ( AnalysisDoc other_doc : this.docs) {
			if ( other_doc!=analysisProperty.doc ) {
				AnalysisElement analysisElement = keyElement.getElement(other_doc);
				if ( analysisElement!=null && analysisElement.isInCategory(this.category)) {
					EObject object = analysisElement.getElement();
					Object other_value = propertiesProvider.getPropertyValue(object, analysisProperty.getProperty());
				    if ( value_this_doc==null ) {
				    	if ( other_value!=null ) {
				    		return true;
				    	}
				    } else {
				    	if ( !value_this_doc.equals(other_value) ) {
				    		return true;
				    	}
				    }
				}
			}
		}
		return false;
	}
}
