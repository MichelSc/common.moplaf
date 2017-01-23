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
	
	// cached KPIs
	private Object        lastKPIsElement = null;
	private Collection<?> lastKPIsElementKPIs = null;
	private boolean       lastKPIsElementHasKPIs = false;
	
	// cached KPI
	private Object lastKPIElement = null;
	private float  lastKPIElementAmount = 0.0f;
	private float  lastKPIElementMinAmount = 0.0f;
	private float  lastKPIElementMaxAmount = 0.0f;
	private String lastKPIElementKPIID = "";
	private Collection<?> lastKPIElementKPIRanges = null;
	
	// cached KPI
	private Object lastKPIRangeElement = null;
	private float  lastKPIRangeElementLowAmount = 0.0f;
	private float  lastKPIRangeElementHighAmount = 0.0f;
	
	// maintain cache

	private void getKPIsItemProvider(Object element){
		if ( element == this.lastKPIsElement ) { return ; }
		IItemKPIsProvider KPIsItemProvider = (IItemKPIsProvider) this.adapterFactory.adapt(element, IItemKPIsProvider.class);
		this.lastKPIsElement = element;
		if ( KPIsItemProvider==null ){
			this.lastKPIsElementHasKPIs = false;
			this.lastKPIsElementKPIs = null;
			return;
		}
		this.lastKPIsElementHasKPIs = true;
		this.lastKPIsElementKPIs = KPIsItemProvider.getKPIs(element);
		return;
	}

	private void getKPIItemProvider(Object element){
		if ( element == this.lastKPIElement ) { return ; }
		IItemKPIProvider KPIItemProvider = (IItemKPIProvider) this.adapterFactory.adapt(element, IItemKPIProvider.class);
		this.lastKPIElement = element;
		this.lastKPIElementAmount    = KPIItemProvider.getKPIAmount(element);
		this.lastKPIElementMinAmount = KPIItemProvider.getMinAmount(element);
		this.lastKPIElementMaxAmount = KPIItemProvider.getMaxAmount(element);
		this.lastKPIElementKPIID     = KPIItemProvider.getKPIID(element);
		this.lastKPIElementKPIRanges = KPIItemProvider.getKPIRanges(element);
	}
	
	private void getKPIRangeItemProvider(Object element){
		if ( element == this.lastKPIRangeElement ) { return ; }
		IItemKPIRangeProvider KPIRangeItemProvider = (IItemKPIRangeProvider) this.adapterFactory.adapt(element, IItemKPIRangeProvider.class);
		this.lastKPIRangeElement = element;
		this.lastKPIRangeElementLowAmount  = KPIRangeItemProvider.getLowAmount(element);
		this.lastKPIRangeElementHighAmount = KPIRangeItemProvider.getHighAmount(element);
	}
	
	
	
	// object management  ------------------------------------------------------------
	
	// constructor
	public AdapterFactoryKPIProvider(AdapterFactory adapterFactory){
		this.adapterFactory = adapterFactory;
	}
	
	// dispose
	public void dispose(){
		this.lastKPIElement = null;
		this.lastKPIsElement = null;
		this.lastKPIsElementKPIs = null;
	}

	// KPIs collection methods ------------------------------------------------------------
	@Override
	public boolean hasKPIs(Object element) {
		this.getKPIsItemProvider(element);
		return this.lastKPIsElementHasKPIs;
	}

	@Override
	public Object[] getKPIs(Object element) {
		this.getKPIsItemProvider(element);
		return this.lastKPIsElementKPIs.toArray();
	}

	// KPI methods ------------------------------------------------------------
	@Override
	public String getKPIID(Object element) {
		this.getKPIItemProvider(element);
		return this.lastKPIElementKPIID;
	}

	@Override
	public float getAmount(Object element) {
		this.getKPIItemProvider(element);
		return this.lastKPIElementAmount;
	}

	@Override
	public float getMinAmount(Object element) {
		this.getKPIItemProvider(element);
		return this.lastKPIElementMinAmount;
	}

	@Override
	public float getMaxAmount(Object element) {
		this.getKPIItemProvider(element);
		return this.lastKPIElementMaxAmount;
	}

	@Override
	public Object[] getKPIRanges(Object element) {
		this.getKPIItemProvider(element);
		return this.lastKPIElementKPIRanges.toArray();
	}

	// KPI range methods ------------------------------------------------------------

	@Override
	public float getLowAmount(Object element) {
		this.getKPIRangeItemProvider(element);
		return this.lastKPIRangeElementLowAmount;
	}

	@Override
	public float getHighAmount(Object element) {
		this.getKPIRangeItemProvider(element);
		return this.lastKPIRangeElementHighAmount;
	}


}
