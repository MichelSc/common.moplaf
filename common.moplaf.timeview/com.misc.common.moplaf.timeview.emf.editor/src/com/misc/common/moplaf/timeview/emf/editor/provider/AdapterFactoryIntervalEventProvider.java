/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
package com.misc.common.moplaf.timeview.emf.editor.provider;


import java.util.Date;

import org.eclipse.emf.common.notify.AdapterFactory;

import com.misc.common.moplaf.timeview.IIntervalEventProvider;
import com.misc.common.moplaf.timeview.emf.edit.IItemIntervalEventsProvider;

public class AdapterFactoryIntervalEventProvider implements
		IIntervalEventProvider {
	private AdapterFactory adapterFactory;
	
	// cached events
	private Object   lastEventsElement = null;
	private IItemIntervalEventsProvider lastEventsElementProvider = null;
	private boolean  lastEventsIsEvents = false;
	
	private void getIntervalEventsItemProvider(Object element){
		if ( element == this.lastEventsElement ) { return ; }
		IItemIntervalEventsProvider intervalEventsItemProvider = (IItemIntervalEventsProvider) this.adapterFactory.adapt(element, IItemIntervalEventsProvider.class);
		this.lastEventsElement = element;
		this.lastEventsElementProvider = intervalEventsItemProvider;
		this.lastEventsIsEvents =  intervalEventsItemProvider!=null;
		return;
	}
	
	// constructor
	public AdapterFactoryIntervalEventProvider(AdapterFactory adapterFactory){
		this.adapterFactory = adapterFactory;
	}
	
	// dispose
	public void dispose(){
		this.lastEventsElement = null;
		this.lastEventsElementProvider = null;
	}

	@Override
	public Date getIntervalEventStart(Object events_provider, Object event) {
		this.getIntervalEventsItemProvider(events_provider);
		return this.lastEventsElementProvider.getIntervalEventStart(events_provider, event);
	}

	@Override
	public Date getIntervalEventEnd(Object events_provider, Object event) {
		this.getIntervalEventsItemProvider(events_provider);
		return this.lastEventsElementProvider.getIntervalEventEnd(events_provider, event);
	}

	@Override
	public boolean isIntervalEvents(Object element){
		this.getIntervalEventsItemProvider(element);
		return this.lastEventsIsEvents;
	}
	
	@Override
	public Object[] getIntervalEvents(Object element) {
		this.getIntervalEventsItemProvider(element);
		return this.lastEventsElementProvider.getIntervalEvents(element).toArray();
	}

}
