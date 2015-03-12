package com.misc.common.moplaf.timeview;

import java.util.Date;

public interface IDiscontinuousAmountEventProvider {
	float getEventAmountBefore(Object element);
	float getEventAmountAfter(Object element);
	Date getEventMoment(Object element);
	boolean isDiscontinuousAmountEvent(Object element);
}
