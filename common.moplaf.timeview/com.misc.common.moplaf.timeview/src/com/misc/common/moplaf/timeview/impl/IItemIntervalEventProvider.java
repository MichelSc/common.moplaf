package com.misc.common.moplaf.timeview.impl;

import java.util.Date;

public interface IItemIntervalEventProvider {
	Date getIntervalEventStart(Object element);
	Date getIntervalEventEnd(Object element);
}
