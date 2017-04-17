package com.misc.common.moplaf.timeview.emf.edit;

import java.util.Collection;
import java.util.Date;

public interface IItemTimePlotsEventsProvider extends IItemTimePlotsProvider {
	// event properties
	Collection<?> getEvents(Object element, Object timeplot); // return the events for the element and a TimePlot of this element
	Date  getMoment (Object element, Object timeplot, Object event); // the date of the event for the timePlot and for this element
	float getAmount (Object element, Object timeplot, Object event); // the amount of the event for the timePlot
}