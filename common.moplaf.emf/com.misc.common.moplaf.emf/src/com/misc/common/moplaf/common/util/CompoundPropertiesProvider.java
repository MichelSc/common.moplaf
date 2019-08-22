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

import com.misc.common.moplaf.common.IPropertiesProvider;

public class CompoundPropertiesProvider implements IPropertiesProvider {
	private IPropertiesProvider[] providers;
	private class IPropertiesProviderProperty{
		private IPropertiesProvider provider;
		private Object property;
		public IPropertiesProviderProperty(IPropertiesProvider provider, Object property) {
			super();
			this.provider = provider;
			this.property = property;
		}
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CompoundPropertiesProvider(IPropertiesProvider provider) {
		super();
		this.providers = new IPropertiesProvider[1];
		this.providers[0] = provider;
	}
	
	public CompoundPropertiesProvider(IPropertiesProvider[] providers) {
		super();
		this.providers = providers;
	}
	
	public CompoundPropertiesProvider(Collection<IPropertiesProvider> providers) {
		super();
		this.providers = (IPropertiesProvider[]) providers.toArray();
	}
	
	/**
	 * Specified by IPropertiesProvider
	 */
	@Override
	public Collection<?> getProperties(){
		LinkedList<Object> properties = new LinkedList<>();
		for ( int i=0; i<this.providers.length; i++) {
			IPropertiesProvider provider = this.providers[i];
			Collection<?> this_provider_properties = provider.getProperties();
			if ( this_provider_properties!=null) {
				for ( Object property : this_provider_properties) {
					properties.add(new IPropertiesProviderProperty(provider, property));
				}
			} else {
				int nr_properties = provider.getNrProperties();
				for (int property=0; property<nr_properties; property++) {
					properties.add(new IPropertiesProviderProperty(provider, property));
				}
			}
		}
		return properties;
	}
	
	/**
	 * Specified by IPropertiesProvider
	 */
	@Override
	public String getPropertyText(Object property) {
		IPropertiesProviderProperty provider_property = (IPropertiesProviderProperty)property;
		IPropertiesProvider provider = provider_property.provider;
		Object property_object = provider_property.property;
		return provider.getPropertyText(property_object);
	}

	/**
	 * Specified by IPropertiesProvider
	 */
	@Override
	public Object getPropertyValue(Object element, Object property) {
		IPropertiesProviderProperty provider_property = (IPropertiesProviderProperty)property;
		IPropertiesProvider provider = provider_property.provider;
		Object property_object = provider_property.property;
		return provider.getPropertyValue(element, property_object);
	}

	/**
	 * Specified by IPropertiesProvider
	 */
	@Override
	public int getPropertyType(Object property) {
		IPropertiesProviderProperty provider_property = (IPropertiesProviderProperty)property;
		IPropertiesProvider provider = provider_property.provider;
		Object property_object = provider_property.property;
		return provider.getPropertyType(property_object);
	}


	/**
	 * Specified by IPropertiesProvider
	 */
	@Override
	public int getPropertyAggregation(Object property) {
		IPropertiesProviderProperty provider_property = (IPropertiesProviderProperty)property;
		IPropertiesProvider provider = provider_property.provider;
		Object property_object = provider_property.property;
		return provider.getPropertyAggregation(property_object);
	}

	/**
	 * Specified by IPropertiesProvider
	 */
	@Override
	public int getPropertyDisplayWidth(Object property) {
		IPropertiesProviderProperty provider_property = (IPropertiesProviderProperty)property;
		IPropertiesProvider provider = provider_property.provider;
		Object property_object = provider_property.property;
		return provider.getPropertyDisplayWidth(property_object);
	}
	
	/**
	 * Specified by IPropertiesProvider
	 */
	@Override
	public int getPropertyDisplayAlignment (Object property) {
		IPropertiesProviderProperty provider_property = (IPropertiesProviderProperty)property;
		IPropertiesProvider provider = provider_property.provider;
		Object property_object = provider_property.property;
		return provider.getPropertyDisplayAlignment(property_object);
	}
}
