package com.misc.common.moplaf.timeview.emf.edit;

import java.util.Collection;
import java.util.Date;

public interface IItemTimePlotsEventsProvider extends IItemTimePlotsProvider {
	// event properties
	/**
	 * Return the events for the element and a TimePlot of this element
	 * @param element
	 * @param timeplot
	 * @return
	 */
	Collection<?> getEvents(Object element, Object timeplot);
	/**
	 * Return the moment of the event for the timePlot and for this element
	 * @param element
	 * @param timeplot
	 * @param event
	 * @return
	 */
	Date  getMoment (Object element, Object timeplot, Object event); //
	/**
	 * Return the amount of the event for the timePlot
	 * @param element
	 * @param timeplot
	 * @param event
	 * @return
	 */
	float getAmount (Object element, Object timeplot, Object event); 
}