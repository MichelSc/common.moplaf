package com.misc.common.moplaf.timeview;

import java.util.Date;

public interface IAmountEventProvider {
	// event properties
	float getEventAmountBefore(Object element);
	float getEventAmountAfter(Object element);
	Date  getEventMoment(Object element);
	// collection of events
	boolean isAmountEvents(Object element);
	Object[] getAmountEvents(Object element);
}
