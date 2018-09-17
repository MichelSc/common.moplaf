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
import org.eclipse.emf.ecore.EcorePackage;

import com.misc.common.moplaf.common.IPropertiesProvider;

public class PropertiesProvider implements IPropertiesProvider {
	private LinkedList<Property> properties = new LinkedList<Property>();
	public interface Property {
		public String getPropertyText();
		public int getPropertyType();
		public Object getPropertyValue(Object element);
		public int getPropertyAggregation();
		public int getPropertyDispalyWidth();
	};
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final int DEFAULT_WIDTH = 200;

	private class PropertyFeature implements Property {
		
		private EReference[] path;
		private EAttribute attribute;
		private int aggregation;
		private int width;
		
		public PropertyFeature(EReference[] path, EAttribute attribute, int width, int aggregation) {
			this.path = path;
			this.attribute = attribute;
			this.aggregation = aggregation;
			this.width = width;
		}

		@Override
		public String getPropertyText() {
			return attribute.getName();
		}

		@Override
		public int getPropertyType() {
			EDataType attribute_type = this.attribute.getEAttributeType();
			if ( attribute_type==EcorePackage.Literals.ESTRING )         { return PROPERTY_TYPE_STRING; }
			if ( attribute_type==EcorePackage.Literals.EDATE )           { return PROPERTY_TYPE_DATE; }
			if ( attribute_type==EcorePackage.Literals.EFLOAT )          { return PROPERTY_TYPE_FLOAT; }
			if ( attribute_type==EcorePackage.Literals.EDOUBLE)          { return PROPERTY_TYPE_DOUBLE; }
			if ( attribute_type==EcorePackage.Literals.ELONG )           { return PROPERTY_TYPE_DOUBLE; }
			if ( attribute_type==EcorePackage.Literals.EINT )            { return PROPERTY_TYPE_INT; }
			if ( attribute_type==EcorePackage.Literals.EBOOLEAN_OBJECT ) { return PROPERTY_TYPE_BOOLEAN; }
		
			return PROPERTY_TYPE_UNKOWN;
		}

		@Override
		public Object getPropertyValue(Object element)  {
			EObject object = (EObject)element;
			for ( int i=0; i<this.path.length && object!=null; i++) {
				EReference ref = this.path[i];
				object  = (EObject) object.eGet(ref);
			}
			if ( object == null ) { return null; }
			return object.eGet(this.attribute);
		}

		@Override
		public int getPropertyAggregation() {
			return this.aggregation;
		}
		
		@Override
		public int getPropertyDispalyWidth() {
			return this.width;
		}		
		
	}
	
	private PropertiesProvider() {
		super();
	}
	
	/*
	 * Convenience methods for constructing PropertiesProvider
	 */
	static public PropertiesProvider constructPropertiesProvider(){
		return new PropertiesProvider();
	};

	/*
	 * Convenience methods for adding an path/attribute property
	 */
	public PropertiesProvider addProperty(EReference[] refs, EAttribute attribute, int width, int aggregation) {
		PropertyFeature property_feature = new PropertyFeature(refs, attribute, width, aggregation);
		this.properties.add(property_feature);
		return this;
	}
	public PropertiesProvider addProperty(EReference[] refs, EAttribute attribute, int width) {
		return this.addProperty(refs, attribute, width, AGGREGATE_NONE);
	}

	public PropertiesProvider addProperty(EReference[] refs, EAttribute attribute) {
		return this.addProperty(refs, attribute, DEFAULT_WIDTH, AGGREGATE_NONE);
	}
	
	/*
	 * Convenience method for adding an attribute column
	 */
	public PropertiesProvider addProperty(EAttribute attribute, int width, int aggregation) {
		EReference[] empty_path = {};
		this.addProperty(empty_path , attribute, width, aggregation);
		return this;
	}

	public PropertiesProvider addProperty(EAttribute attribute, int width) {
		return this.addProperty(attribute, width, AGGREGATE_NONE);
	}

	public PropertiesProvider addProperty(EAttribute attribute) {
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
		return this_property.getPropertyDispalyWidth();
	}
	
	/**
	 * Specified by IPropertiesProvider
	 */
	@Override
	public int getPropertyDisplayALignment (Object property) {
		int type = this.getPropertyType(property);
		switch ( type ) {
		case PROPERTY_TYPE_STRING: 
			return HORIZONTAL_ALIGN_LEFT;
		case PROPERTY_TYPE_FLOAT:
		case PROPERTY_TYPE_DOUBLE:
		case PROPERTY_TYPE_INT:
		case PROPERTY_TYPE_LONG:
			return HORIZONTAL_ALIGN_RIGHT;
		default: 
			return NO_ALIGN;
		}
	}
}
