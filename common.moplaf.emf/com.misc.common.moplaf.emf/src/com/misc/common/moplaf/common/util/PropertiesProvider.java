/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
package com.misc.common.moplaf.common.util;

import java.util.Collection;
import java.util.LinkedList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import com.misc.common.moplaf.common.Color;
import com.misc.common.moplaf.common.IPropertiesProvider;

/**
 * An implementation of the interface {@link IPropertiesProvider }
 * <p>
 * The implemented properties are EMF properties, specified by 
 * <ul>
 *   <li>a path (possibly empty) of EReferences</li>
 *   <li>an EAttribute</li>
 * </ul>
 * </p>
 * For every Property, this provider provides
 * <ul>
 *   <li>a text: String</li>
 *   <li>a moplaf type: int</li>
 *   <li>moplaf traits: int</li>
 *   <li>getter for the property value: Object</li>
 *   <li>an aggregation type: int</li>
 *   <li>a display width: int</li>
 * </ul>
 */
public class PropertiesProvider implements IPropertiesProvider {

	private static final int DEFAULT_WIDTH = 200;

	private LinkedList<Property> properties = new LinkedList<Property>();
	
	/**
	 * Generic interface for a Property, can be used to implement the interface IPropertiesProvider
	 * @author Michel.Schaffers
	 *
	 */
	public interface Property {
		public String getPropertyText();
		public int getPropertyType();
		public int getPropertyTraits();
		public Object getPropertyValue(Object element);
		public Color getPropertyValueForegroundColor(Object element);
		public Color getPropertyValueBackgroundColor(Object element);
		public int getPropertyAggregation();
		public int getPropertyDisplayWidth();
	};
	
	/**
	 * Abstract class that can be used as base class to implement the interface Property
	 * @author Michel.Schaffers
	 *
	 */
	static public abstract class PropertyAbstract implements Property {
		private int aggregation;
		private int width;
		private int traits;
		
		public PropertyAbstract(
				int width, 
				int aggregation,
				int traits) {
			this.aggregation = aggregation;
			this.width = width;
			this.traits = traits; // no traits
		}
		
		@Override 
		public int getPropertyTraits() {
			return this.traits;
		}

		@Override
		public int getPropertyAggregation() {
			return this.aggregation;
		}
		
		@Override
		public int getPropertyDisplayWidth() {
			return this.width;
		}

		@Override
		public Color getPropertyValueForegroundColor(Object element) {
			return null;
		}

		@Override
		public Color getPropertyValueBackgroundColor(Object element) {
			return null;
		}		
	} // class PropertyAbstract

	/**
	 * 
	 */
	static private class PropertyFeature extends PropertyAbstract {
	
		private EReference[] path;
		private EAttribute attribute;

		public PropertyFeature(
				EReference[] path, 
				EAttribute attribute, 
				int width, 
				int aggregation,
				int traits) {
			super(width, aggregation, traits);
			this.path = path;
			this.attribute = attribute;
		}
		
		@Override
		public String getPropertyText() {
			return attribute.getName();
		}

		@Override
		public int getPropertyType() {
			EDataType attribute_type = this.attribute.getEAttributeType();
			return com.misc.common.moplaf.common.util.Util.toPropertyType(attribute_type);
		}
		
		@Override
		public Object getPropertyValue(Object element)  {
			EObject object = (EObject)element;
			for ( int i=0; i<this.path.length && object!=null; i++) {
				EReference ref = this.path[i];
				if ( !ref.getEContainingClass().isSuperTypeOf(object.eClass())) {
					// the reference is not implemented by the object
					return null;
				}
				object  = (EObject) object.eGet(ref);
			}
			if ( object == null ) { return null; }
			if ( !this.attribute.getEContainingClass().isSuperTypeOf(object.eClass())) {
				// the attribute is not implemented by object
				return null;
			}
			return object.eGet(this.attribute);
		}
	}
	
	public PropertiesProvider() {
		super();
	}
	
	/*
	 * Convenience methods for constructing PropertiesProvider
	 */
	static public PropertiesProvider constructPropertiesProvider(){
		return new PropertiesProvider();
	};

	/*
	 * Convenience methods for adding an path/attribute property, or an abstract property
	 */
	public Property addProperty(Property property) {
		this.properties.add(property);
		return property;
	}
	public Property addProperty(EReference[] refs, EAttribute attribute, int width, int aggregation, int traits) {
		PropertyFeature property_feature = new PropertyFeature(refs, attribute, width, aggregation, traits);
		this.properties.add(property_feature);
		return property_feature;
	}
	public Property addProperty(EReference[] refs, EAttribute attribute, int width, int aggregation) {
		return this.addProperty(refs, attribute, width, aggregation, TRAITS_NONE);
	}
	public Property addProperty(EReference[] refs, EAttribute attribute, int width) {
		return this.addProperty(refs, attribute, width, AGGREGATE_NONE);
	}
	public Property addProperty(EReference[] refs, EAttribute attribute) {
		return this.addProperty(refs, attribute, DEFAULT_WIDTH, AGGREGATE_NONE);
	}
	
	/*
	 * Convenience method for adding an attribute column
	 */
	public Property addProperty(EAttribute attribute, int width, int aggregation, int traits) {
		EReference[] empty_path = {};
		return this.addProperty(empty_path , attribute, width, aggregation, traits);
	}
	public Property addProperty(EAttribute attribute, int width, int aggregation) {
		return this.addProperty(attribute, width, aggregation, TRAITS_NONE);
	}

	public Property addProperty(EAttribute attribute, int width) {
		return this.addProperty(attribute, width, AGGREGATE_NONE);
	}

	public Property addProperty(EAttribute attribute) {
		return this.addProperty(attribute, DEFAULT_WIDTH, AGGREGATE_NONE);
	}
	
	/**
	 * Specified by IPropertiesProvider
	 */
	@Override
	public Collection<?> getProperties(){
		return this.properties;
	}
	
	/**
	 * Specified by IPropertiesProvider
	 */
	@Override
	public String getPropertyText(Object property) {
		Property this_property = (Property)property;
		return this_property.getPropertyText();
	}

	/**
	 * Specified by IPropertiesProvider
	 */
	@Override
	public Object getPropertyValue(Object element, Object property) {
		Property this_property = (Property)property;
		return this_property.getPropertyValue(element);
	}

	/**
	 * Specified by IPropertiesProvider
	 */
	@Override
	public int getPropertyType(Object property) {
		Property this_property = (Property)property;
		return this_property.getPropertyType();
	}
	
	@Override
	public int getPropertyTraits(Object property) {
		Property this_property = (Property)property;
		return this_property.getPropertyTraits();
	}


	/**
	 * Specified by IPropertiesProvider
	 */
	@Override
	public int getPropertyAggregation(Object property) {
		Property this_property = (Property)property;
		return this_property.getPropertyAggregation();
	}

	/**
	 * Specified by IPropertiesProvider
	 */
	@Override
	public int getPropertyDisplayWidth(Object property) {
		Property this_property = (Property)property;
		return this_property.getPropertyDisplayWidth();
	}
	
	/**
	 * Specified by IPropertiesProvider
	 */
	@Override
	public int getPropertyDisplayAlignment (Object property) {
		int type = this.getPropertyType(property);
		switch ( type ) {
		case DATA_TYPE_STRING: 
			return HORIZONTAL_ALIGN_LEFT;
		case DATA_TYPE_FLOAT:
		case DATA_TYPE_DOUBLE:
		case DATA_TYPE_INT:
		case DATA_TYPE_LONG:
			return HORIZONTAL_ALIGN_RIGHT;
		default: 
			return NO_ALIGN;
		}
	}
	/**
	 * Specified by IPropertiesProvider
	 * Return the color used as foreground for the property
	 * @param property
	 * @return
	 */
	@Override
	public Color getPropertyValueForegroundColor(Object element, Object property) {
		Property this_property = (Property)property;
		return this_property.getPropertyValueForegroundColor(element);
	}

	/**
	 * Specified by IPropertiesProvider
	 * Return the color used as background for the property
	 * @param property
	 * @return
	 */
	@Override
	public Color getPropertyValueBackgroundColor(Object element, Object property) {
		Property this_property = (Property)property;
		return this_property.getPropertyValueBackgroundColor(element);
	}
}
