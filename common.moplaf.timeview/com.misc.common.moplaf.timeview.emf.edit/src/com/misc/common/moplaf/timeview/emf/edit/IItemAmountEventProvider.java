package com.misc.common.moplaf.timeview.emf.edit;

import java.util.Date;

public interface IItemAmountEventProvider {
	Date getEventMoment(Object element);
	float getEventAmount(Object element);
}
