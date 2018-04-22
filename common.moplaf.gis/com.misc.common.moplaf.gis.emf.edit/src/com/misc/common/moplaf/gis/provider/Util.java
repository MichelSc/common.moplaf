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
package com.misc.common.moplaf.gis.provider;

import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;

import com.misc.common.moplaf.gis.GisAddressGeocoder;
import com.misc.common.moplaf.gis.GisLocationPinpointer;
import com.misc.common.moplaf.gis.GisRouteCalculator;
import com.misc.common.moplaf.gis.Plugin;
import com.misc.common.moplaf.gis.util.GeocoderFactory;
import com.misc.common.moplaf.gis.util.PinpointerFactory;
import com.misc.common.moplaf.gis.util.RouterFactory;


public class Util {

	public static void collectNewChildGeocoderDescriptors2(Collection<Object> newChildDescriptors, Object object, EStructuralFeature feature) {
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = reg.getConfigurationElementsFor("com.misc.common.moplaf.gis.emf.geocoder_factory");
		for ( IConfigurationElement element : elements){
			Object value;
			try {
				value = element.createExecutableExtension("class");
				if ( value instanceof GeocoderFactory) {
					GisAddressGeocoder newGeocoder = ((GeocoderFactory)value).createGeocoder();
					if ( newGeocoder!=null){
						newChildDescriptors.add(new CommandParameter(null, feature, newGeocoder));
					}
				}
			} catch (CoreException e) {
				e.printStackTrace();
				Plugin.INSTANCE.logError("com.misc.common.moplaf.gis.provider.Util.collectNewChildGeocoderDescriptors exception caught "+e.getMessage());
			}
		}
	}  // method collectNewChildGeocoderDescriptors2

	public static void collectNewChildRouterDescriptors2(Collection<Object> newChildDescriptors, Object object, EStructuralFeature feature) {
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = reg.getConfigurationElementsFor("com.misc.common.moplaf.gis.emf.router_factory");
		for ( IConfigurationElement element : elements){
			Object value;
			try {
				value = element.createExecutableExtension("class");
				if ( value instanceof RouterFactory) {
					GisRouteCalculator newRouter = ((RouterFactory)value).createRouter();
					if ( newRouter!=null){
						newChildDescriptors.add(new CommandParameter(null, feature, newRouter));
					}
				}
			} catch (CoreException e) {
				e.printStackTrace();
				Plugin.INSTANCE.logError("com.misc.common.moplaf.gis.provider.Util.collectNewChildRouterDescriptors exception caught "+e.getMessage());
			}
		}
	}  // method collectNewChildRouterDescriptors2

	public static void collectNewChildPinpointerDescriptors2(Collection<Object> newChildDescriptors, Object object, EStructuralFeature feature) {
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = reg.getConfigurationElementsFor("com.misc.common.moplaf.gis.emf.pinpointer_factory");
		for ( IConfigurationElement element : elements){
			Object value;
			try {
				value = element.createExecutableExtension("class");
				if ( value instanceof PinpointerFactory) {
					 GisLocationPinpointer pinpointer = ((PinpointerFactory)value).createPinpointer();
					if ( pinpointer!=null){
						newChildDescriptors.add(new CommandParameter(null, feature, pinpointer));
					}
				}
			} catch (CoreException e) {
				e.printStackTrace();
				Plugin.INSTANCE.logError("com.misc.common.moplaf.gis.provider.Util.collectNewChildPinpointerDescriptors2 exception caught "+e.getMessage());
			}
		}
	}  // method collectNewChildPinpointerDescriptors2
}
