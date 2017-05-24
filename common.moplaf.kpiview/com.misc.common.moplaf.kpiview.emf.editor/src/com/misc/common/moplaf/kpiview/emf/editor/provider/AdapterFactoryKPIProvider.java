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
import com.misc.common.moplaf.kpiview.emf.edit.IItemKPIsProvider;


public class AdapterFactoryKPIProvider implements IKPIProvider {
	private AdapterFactory adapterFactory;
	
	private Object adapt(Object target, Object type){
		return this.adapterFactory.adapt(target, type);
		//return Util.adapt(target, type);
	}
	
	// cached KPIs
	private Object            lastKPIsElement = null;
	private IItemKPIsProvider lastKPIsElementItemProvider = null;
	
	// maintain cache
	private void getKPIsItemProvider(Object element){
		if ( element == this.lastKPIsElement ) { return ; }
		IItemKPIsProvider KPIsItemProvider = (IItemKPIsProvider) this.adapt(element, IItemKPIsProvider.class);
		this.lastKPIsElement = element;
		this.lastKPIsElementItemProvider = KPIsItemProvider;
		return;
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
	public String getKPIID(Object element, Object kpi) {
		this.getKPIsItemProvider(element);
		return this.lastKPIsElementItemProvider.getKPIID(element, kpi);
	}

	@Override
	public String getUnit(Object element, Object kpi) {
		this.getKPIsItemProvider(element);
		return this.lastKPIsElementItemProvider.getKPIUnit(element, kpi);
	}

	@Override
	public float getAmount(Object element, Object kpi) {
		this.getKPIsItemProvider(element);
		return this.lastKPIsElementItemProvider.getKPIAmount(element, kpi);
	}

	@Override
	public float getMinAmount(Object element, Object kpi) {
		this.getKPIsItemProvider(element);
		return this.lastKPIsElementItemProvider.getKPIMinAmount(element, kpi);
	}

	@Override
	public float getMaxAmount(Object element, Object kpi) {
		this.getKPIsItemProvider(element);
		return this.lastKPIsElementItemProvider.getKPIMaxAmount(element, kpi);
	}

	@Override
	public Object[] getKPIRanges(Object element, Object kpi) {
		this.getKPIsItemProvider(element);
		Collection<?> collection = this.lastKPIsElementItemProvider.getKPIRanges(element, kpi);
		if ( collection == null ) { return null;}
		return collection.toArray();
	}

	// KPI range methods ------------------------------------------------------------

	@Override
	public float getLowAmount(Object element, Object kpi, Object range) {
		this.getKPIsItemProvider(element);
		return this.lastKPIsElementItemProvider.getKPIRangeLowAmount(element, kpi, range);
	}

	@Override
	public float getHighAmount(Object element, Object kpi, Object range) {
		this.getKPIsItemProvider(element);
		return this.lastKPIsElementItemProvider.getKPIRangeHighAmount(element, kpi, range);
	}

}
