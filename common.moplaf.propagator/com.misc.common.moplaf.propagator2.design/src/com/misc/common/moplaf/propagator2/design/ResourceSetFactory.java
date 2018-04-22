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
package com.misc.common.moplaf.propagator2.design;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.misc.common.moplaf.propagator2.Plugin;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionManagerAdapter;
import com.misc.common.moplaf.propagator2.util.Util;


public class ResourceSetFactory extends org.eclipse.sirius.common.tools.api.resource.ResourceSetFactory {

	public ResourceSetFactory() {
	}

	@Override
	public ResourceSet createResourceSet(URI resourceURI) {
		Plugin.INSTANCE.logInfo("com.misc.common.propagator2.design: Create Editing Resource Set : uri="+resourceURI.toString());
		ResourceSet resourceSet = new ResourceSetImpl(){

			
			@Override
			protected void demandLoad(Resource resource) throws IOException {
				Plugin.INSTANCE.logInfo( "com.misc.common.propagator2.design: resource doload ");
				// load the resource
				super.demandLoad(resource);
				// add the propagator manager
				URI uri = resource.getURI();
				Plugin.INSTANCE.logInfo( "com.misc.common.propagator2.design: resource loaded ");
				String fileExtension = uri.fileExtension(); 
				Plugin.INSTANCE.logInfo("com.misc.common.propagator2.design: add PropagatorFunctionAdapterManager ");
				PropagatorFunctionManagerAdapter manager = Util.createPropagatorFunctionManagerAdapter(fileExtension, null);
				if ( manager == null ) {
					Plugin.INSTANCE.logWarning("com.misc.common.propagator2.design: no manager for extension "+fileExtension);
				} else {
					resource.eAdapters().add(manager);
				}
				Plugin.INSTANCE.logInfo("com.misc.common.propagator2.design: inited ");
			}

			@Override
			protected void demandLoadHelper(Resource resource) {
				super.demandLoadHelper(resource);
			}

			@Override
			public Resource createResource(URI uri, String contentType) {
				Plugin.INSTANCE.logInfo("com.misc.common.propagator2.design: Create resource: uri="+uri.toString()+", contenttype="+contentType);
				Resource resource = super.createResource(uri, contentType);
				Plugin.INSTANCE.logInfo("com.misc.common.propagator2.design: resource created ");
			return resource;
			}
			
		};
		return resourceSet;
	}
}
