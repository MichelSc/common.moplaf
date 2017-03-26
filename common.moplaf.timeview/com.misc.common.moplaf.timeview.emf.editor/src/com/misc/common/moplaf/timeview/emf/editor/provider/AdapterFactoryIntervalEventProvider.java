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

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.AdapterFactory;

import com.misc.common.moplaf.timeview.IIntervalEventProvider;
import com.misc.common.moplaf.timeview.emf.edit.IItemIntervalEventProvider;
import com.misc.common.moplaf.timeview.emf.edit.IItemIntervalEventsProvider;

public class AdapterFactoryIntervalEventProvider implements
		IIntervalEventProvider {
	private AdapterFactory adapterFactory;
	
	// cached event
	private Object lastElement = null;
	private Date lastElementEventStart = null;
	private Date lastElementEventEnd = null;
//	private IItemIntervalEventProvider lastElementItemIntervalEventProvider = null;
	
	// cached events
	private Object   lastEventsElement = null;
	private Collection<?> lastEventsElementEvents;
	private boolean  lastEventsIsEvents = false;
	
	private void getIntervalEventItemProvider(Object element){
		if ( element == this.lastElement ) { return ; }
		IItemIntervalEventProvider intervalEventItemProvider = (IItemIntervalEventProvider) this.adapterFactory.adapt(element, IItemIntervalEventProvider.class);
		this.lastElement = element;
		this.lastElementEventStart = intervalEventItemProvider.getIntervalEventStart(element);
		this.lastElementEventEnd   = intervalEventItemProvider.getIntervalEventEnd(element);
	}
	
	private void getIntervalEventsItemProvider(Object element){
		if ( element == this.lastEventsElement ) { return ; }
		IItemIntervalEventsProvider intervalEventsItemProvider = (IItemIntervalEventsProvider) this.adapterFactory.adapt(element, IItemIntervalEventsProvider.class);
		this.lastEventsElement = element;
		if ( intervalEventsItemProvider==null ){
			this.lastEventsIsEvents = false;
			this.lastEventsElementEvents = null;
			return;
		}
		this.lastEventsIsEvents = true;
		this.lastEventsElementEvents = intervalEventsItemProvider.getIntervalEvents(element);
		return;
	}
	
	// constructor
	public AdapterFactoryIntervalEventProvider(AdapterFactory adapterFactory){
		this.adapterFactory = adapterFactory;
	}
	
	// dispose
	public void dispose(){
		this.lastElement = null;
		this.lastEventsElement = null;
		this.lastEventsElementEvents = null;
	}

	@Override
	public Date getIntervalEventStart(Object element) {
		this.getIntervalEventItemProvider(element);
		return this.lastElementEventStart;
	}

	@Override
	public Date getIntervalEventEnd(Object element) {
		this.getIntervalEventItemProvider(element);
		return this.lastElementEventEnd;
	}

	@Override
	public boolean isIntervalEvents(Object element){
		this.getIntervalEventsItemProvider(element);
		return this.lastEventsIsEvents;
	}
	@Override
	public Object[] getIntervalEvents(Object element) {
		this.getIntervalEventsItemProvider(element);
		return this.lastEventsElementEvents.toArray();
	}

}
