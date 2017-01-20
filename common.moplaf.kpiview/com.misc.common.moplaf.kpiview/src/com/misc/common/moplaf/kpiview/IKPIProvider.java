package com.misc.common.moplaf.kpiview;

public interface IKPIProvider {
	// collection of KPI's
	//  e.g. a Solution
	//  e.g. a Scenario
	Object[] getKPIs(Object element);

	// a KPI thing
	boolean isKPI(Object element);

	// a KPI value
	boolean isKPIValue(Object element);

	// a KPI Range
	boolean isKPIRange(Object element);

	// collection of KPIValues
	//  e.g TransportCost of TransportEfficiency
	//  supported by a KPI
	Object[] getKPIValues(Object element);
	
	// collection of KPIRanges
	//  e.g. CriticallyHigh 
	//  e.g. WarninglyHigh 
	//  e.g. Full Range 
	// supported by a KPI
	Object[] getKPIRanges(Object element);

	// identifies a KPI
	//   e.g. "projects.someclient.someapp.transport.efficiency"
	//   e.g. "projects.someclient.someapp.transport.cost"
	// allow to compare the same KPI of different objects
	String getKPIID(Object element);  

	// KPIValue properties, supported by a KPIValue
	float getAmount(Object element);
	float getMinAmount(Object element);
	float getMaxAmount(Object element);

	// KPIRange properties, supported by a KPIRange
	float getLowAmount(Object element);
	float getHighAmount(Object element);

	// identifies a value of a KPI  
	//   e.g. "projects.someclient.someapp.transport.cost.value.planned"
	//   e.g. "projects.someclient.someapp.transport.cost.value.actual"
	//   e.g. "projects.someclient.someapp.transport.cost.range.complete"
	//   e.g. "projects.someclient.someapp.transport.cost.range.low"
	//   e.g. "projects.someclient.someapp.transport.cost.range.high"
	//   allows to compare the same KPI value of different objects
	String getKPIAmountID(Object element);
}
