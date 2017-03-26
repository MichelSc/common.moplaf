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
package com.misc.common.moplaf.kpiview.emf.editor.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;

import com.misc.common.moplaf.kpiview.IKPIProvider;
import com.misc.common.moplaf.kpiview.emf.edit.IItemKPIProvider;
import com.misc.common.moplaf.kpiview.emf.edit.IItemKPIRangeProvider;
import com.misc.common.moplaf.kpiview.emf.edit.IItemKPIsProvider;


public class AdapterFactoryKPIProvider implements
		IKPIProvider {
	private AdapterFactory adapterFactory;
	
	private Object adapt(Object target, Object type){
		return this.adapterFactory.adapt(target, type);
		//return Util.adapt(target, type);
	}
	
	// cached KPIs
	private Object            lastKPIsElement = null;
	private IItemKPIsProvider lastKPIsElementItemProvider = null;
	
	// cached KPI
	private Object lastKPIElement = null;
	private IItemKPIProvider  lastKPIElementItemProvider = null;
	
	// cached KPI
	private Object lastKPIRangeElement = null;
	private IItemKPIRangeProvider  lastKPIRangeElementItemProvider = null;
	
	// maintain cache

	private void getKPIsItemProvider(Object element){
		if ( element == this.lastKPIsElement ) { return ; }
		IItemKPIsProvider KPIsItemProvider = (IItemKPIsProvider) this.adapt(element, IItemKPIsProvider.class);
		this.lastKPIsElement = element;
		this.lastKPIsElementItemProvider = KPIsItemProvider;
		return;
	}

	private void getKPIItemProvider(Object element){
		if ( element == this.lastKPIElement ) { return ; }
		IItemKPIProvider KPIItemProvider = (IItemKPIProvider) this.adapt(element, IItemKPIProvider.class);
		this.lastKPIElement = element;
		this.lastKPIElementItemProvider = KPIItemProvider;
	}
	
	private void getKPIRangeItemProvider(Object element){
		if ( element == this.lastKPIRangeElement ) { return ; }
		IItemKPIRangeProvider KPIRangeItemProvider = (IItemKPIRangeProvider) this.adapt(element, IItemKPIRangeProvider.class);
		this.lastKPIRangeElement = element;
		this.lastKPIRangeElementItemProvider = KPIRangeItemProvider;
	}
	
	// object management  ------------------------------------------------------------
	
	// constructor
	public AdapterFactoryKPIProvider(AdapterFactory adapterFactory){
		this.adapterFactory = adapterFactory;
	}
	
	// dispose
	public void dispose(){
		this.lastKPIsElement = null;
		this.lastKPIsElementItemProvider = null;
		this.lastKPIElement = null;
		this.lastKPIElementItemProvider = null;
		this.lastKPIRangeElement = null;
		this.lastKPIRangeElementItemProvider = null;
	}

	// KPIs collection methods ------------------------------------------------------------
	@Override
	public boolean hasKPIs(Object element) {
		this.getKPIsItemProvider(element);
		return this.lastKPIsElementItemProvider!=null;
	}

	@Override
	public Object[] getKPIs(Object element) {
		this.getKPIsItemProvider(element);
		return this.lastKPIsElementItemProvider.getKPIs(element).toArray();
	}

	// KPI methods ------------------------------------------------------------
	@Override
	public String getKPIID(Object element) {
		this.getKPIItemProvider(element);
		return this.lastKPIElementItemProvider.getKPIID(element);
	}

	@Override
	public String getUnit(Object element) {
		this.getKPIItemProvider(element);
		return this.lastKPIElementItemProvider.getUnit(element);
	}

	@Override
	public float getAmount(Object element) {
		this.getKPIItemProvider(element);
		return this.lastKPIElementItemProvider.getKPIAmount(element);
	}

	@Override
	public float getMinAmount(Object element) {
		this.getKPIItemProvider(element);
		return this.lastKPIElementItemProvider.getMinAmount(element);
	}

	@Override
	public float getMaxAmount(Object element) {
		this.getKPIItemProvider(element);
		return this.lastKPIElementItemProvider.getMaxAmount(element);
	}

	@Override
	public Object[] getKPIRanges(Object element) {
		this.getKPIItemProvider(element);
		Collection<?> collection = this.lastKPIElementItemProvider.getKPIRanges(element);
		if ( collection == null ) { return null;}
		return collection.toArray();
	}

	// KPI range methods ------------------------------------------------------------

	@Override
	public float getLowAmount(Object element) {
		this.getKPIRangeItemProvider(element);
		return this.lastKPIRangeElementItemProvider.getLowAmount(element);
	}

	@Override
	public float getHighAmount(Object element) {
		this.getKPIRangeItemProvider(element);
		return this.lastKPIRangeElementItemProvider.getHighAmount(element);
	}

}
