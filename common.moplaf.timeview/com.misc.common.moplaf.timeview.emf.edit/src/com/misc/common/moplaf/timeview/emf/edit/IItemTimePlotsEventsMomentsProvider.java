package com.misc.common.moplaf.timeview.emf.edit;

import java.util.Collection;
import java.util.Date;

public interface IItemTimePlotsEventsMomentsProvider extends IItemTimePlotsProvider {
	// event properties
	Collection<?> getAmountEvents(Object element, Object timeplot); // return the events for the element and a TimePlot of this element
	int   getEventMoments(Object element, Object timeplot, Object event); // the number of moment for an event
	Date  getEventMoment (Object element, Object timeplot, Object event, int moment); // the date of the event for the timePlot and for this element
	float getEventAmount (Object element, Object timeplot, Object event, int moment); // the amount before of the event for the timePlot
}