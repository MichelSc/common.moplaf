package com.misc.common.moplaf.timeview;

import java.util.Date;

public interface IIntervalEventProvider {
	Date getIntervalEventStart(Object element);
	Date getIntervalEventEnd(Object element);
	boolean isIntervalEvent(Object element);
}
