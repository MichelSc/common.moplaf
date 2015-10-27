package com.misc.common.moplaf.timeview;

import java.util.Date;

public interface IIntervalEventProvider {
	// event properties
	Date getIntervalEventStart(Object element);
	Date getIntervalEventEnd(Object element);
	// collection of events
	boolean isIntervalEvents(Object element);
	Object[] getIntervalEvents(Object element);
}
