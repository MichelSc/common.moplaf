package com.misc.common.moplaf.timeview.emf.edit;

import java.util.Date;

public interface IItemTimePlotsMomentsProvider extends IItemTimePlotsProvider {
	// event properties
	int   getEventMoments(Object element, Object timeplot); // the number of moment for an event
	Date  getEventMoment (Object element, Object timeplot, int moment); // the date of the event for the timePlot and for this element
	float getEventAmount (Object element, Object timeplot, int moment); // the amount before of the event for the timePlot
}