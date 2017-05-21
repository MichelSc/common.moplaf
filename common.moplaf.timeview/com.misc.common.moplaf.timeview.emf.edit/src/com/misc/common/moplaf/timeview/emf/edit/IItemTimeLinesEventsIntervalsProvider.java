package com.misc.common.moplaf.timeview.emf.edit;

import java.util.Collection;
import java.util.Date;

public interface IItemTimeLinesEventsIntervalsProvider extends IItemTimeLinesProvider{
	
	Collection<?> getEvents(Object element, Object timeline);
	int getIntervals(Object element, Object timeline, Object event);

	Date   getStart     (Object element, Object timeline, Object event, int interval);
	Date   getEnd       (Object element, Object timeline, Object event, int interval);
	Object getForeground(Object element, Object timeline, Object event, int interval);
	Object getBackground(Object element, Object timeline, Object event, int interval);
	String getText      (Object element, Object timeline, Object event, int interval);
}

