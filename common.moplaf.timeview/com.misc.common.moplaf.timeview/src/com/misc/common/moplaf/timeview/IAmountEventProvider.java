package com.misc.common.moplaf.timeview;

import java.util.Date;

public interface IAmountEventProvider {
	float getEventAmount(Object element);
	Date getEventMoment(Object element);
	boolean isAmountEvent(Object element);
}
