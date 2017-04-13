package com.misc.common.moplaf.timeview.emf.edit;

import java.util.Collection;
import java.util.Date;

public interface IItemTimePlotsEventsProvider extends IItemTimePlotsProvider {
	// event properties
	Collection<?> getAmountEvents(Object element, Object timeplot); // return the events for the element and a TimePlot of this element
	Date  getEventMoment (Object element, Object timeplot, Object event); // the date of the event for the timePlot and for this element
	float getEventAmount (Object element, Object timeplot, Object event); // the amount of the event for the timePlot
}