package com.misc.common.moplaf.timeview.impl;

import java.util.Date;

public interface IItemAmountEventProvider {
	Date getEventMoment(Object element);
	float getEventAmount(Object element);
}
