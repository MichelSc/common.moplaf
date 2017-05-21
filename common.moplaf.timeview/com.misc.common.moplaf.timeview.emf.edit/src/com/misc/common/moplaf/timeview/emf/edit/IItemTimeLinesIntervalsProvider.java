package com.misc.common.moplaf.timeview.emf.edit;

import java.util.Date;

public interface IItemTimeLinesIntervalsProvider extends IItemTimeLinesProvider{
	
	int getIntervals(Object element, Object timeline);

	Date   getStart     (Object element, Object timeline, int interval);
	Date   getEnd       (Object element, Object timeline, int interval);
	Object getForeground(Object element, Object timeline, int interval);
	Object getBackground(Object element, Object timeline, int interval);
	String getText      (Object element, Object timeline, int interval);
}
