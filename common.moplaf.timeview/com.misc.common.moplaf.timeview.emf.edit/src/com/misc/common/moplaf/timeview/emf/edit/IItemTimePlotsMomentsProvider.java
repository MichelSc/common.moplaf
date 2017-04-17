package com.misc.common.moplaf.timeview.emf.edit;

import java.util.Date;

public interface IItemTimePlotsMomentsProvider extends IItemTimePlotsProvider {
	// event properties
	int   getMoments(Object element, Object timeplot); // the number of moment for an event
	Date  getMoment (Object element, Object timeplot, int moment); // the date of the event for the timePlot and for this element
	float getAmount (Object element, Object timeplot, int moment); // the amount before of the event for the timePlot
}