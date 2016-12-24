package com.misc.common.moplaf.timeview.emf.edit;

import java.util.Date;

public interface IItemDiscontinuousAmountEventProvider {
	Date getEventMoment(Object element);
	float getEventAmountBefore(Object element);
	float getEventAmountAfter(Object element);
}
