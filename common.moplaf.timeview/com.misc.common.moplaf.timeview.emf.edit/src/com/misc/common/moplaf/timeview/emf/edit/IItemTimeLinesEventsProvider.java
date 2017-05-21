package com.misc.common.moplaf.timeview.emf.edit;

import java.util.Collection;
import java.util.Date;

public interface IItemTimeLinesEventsProvider extends IItemTimeLinesProvider{
	
	Collection<?> getEvents(Object element, Object timeline);

	Date   getStart     (Object element, Object timeline, Object event);
	Date   getEnd       (Object element, Object timeline, Object event);
	Object getForeground(Object element, Object timeline, Object event);
	Object getBackground(Object element, Object timeline, Object event);
	String getText      (Object element, Object timeline, Object event);
}
