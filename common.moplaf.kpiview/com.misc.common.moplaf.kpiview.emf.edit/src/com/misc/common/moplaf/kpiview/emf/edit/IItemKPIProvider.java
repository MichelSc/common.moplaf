package com.misc.common.moplaf.kpiview.emf.edit;

import java.util.Collection;

public interface IItemKPIProvider {
	float getKPIAmount(Object element);
	float getMinAmount(Object element);
	float getMaxAmount(Object element);
	String getKPIID(Object element);  
	String getUnit(Object element);  
	Collection<?> getKPIRanges(Object element);
}
