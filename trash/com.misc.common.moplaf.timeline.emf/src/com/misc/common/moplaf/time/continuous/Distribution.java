/**
 */
package com.misc.common.moplaf.time.continuous;

import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter;
import com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A Distribution implements a generalized function of time (java Date). The function is piecewise linear.
 *  The Distribution nor its slope are continuous. For every time t, 
 * the value of the function (its amount) as well as its slope are maintained before and after any time.
 * <p>
 * A Distribution receives 
 *     <ul>
 *       <li>{@link EventsProvider}s through the relation {@link #eventsProviders}</li>
 *       <li>child {@link Distribution}s through the relation {@link #childDistribution}</li>
 *    </ul>
 * <p>
 * The Distribution
 * <ul>
 *   <li>considers the events </li>
 *     <ul>
 *       <li>{@link StartEvent} and {@link EndEvent}</li>
 *       <li>provided by the {@link EventsProvider}s</li>
 *       <li>belonging to the child {@link Distribution}s</li>
 *    </ul>
 *   <li>selects the considered events in the horizon
 *   <li>sorts the selected events </li>
 *   <li>publishes the resulting sets of events </li>
 *     <ul>
 *       <li>in the relation {@link DistributionImpl#sequenceEvents}</li>
 *       <li>in the attribute {@link DistributionEventImpl#eventNr}</li>
 *       <li>in the references {@link DistributionEventImpl#next} and {@link DistributionEventImpl#previous}</li>
 *    </ul>
 *   <li>maintains the value and slope of the distribution at every event</li>
 *     <ul>
 *       <li>in the attribute {@link DistributionEventImpl#amountBefore}</li>
 *       <li>in the attribute {@link DistributionEventImpl#amountAfter}</li>
 *       <li>in the attribute {@link DistributionEventImpl#slopeBefore}</li>
 *       <li>in the attribute {@link DistributionEventImpl#slopeAfter}</li>
 *    </ul>
 * </ul>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.Distribution#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.Distribution#getHorizonStart <em>Horizon Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.Distribution#getHorizonEnd <em>Horizon End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.Distribution#getChildEvents <em>Child Events</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.Distribution#getSequenceEvents <em>Sequence Events</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.Distribution#getStart <em>Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.Distribution#getEnd <em>End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.Distribution#getEventsProviders <em>Events Providers</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.Distribution#getParentDistribution <em>Parent Distribution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.Distribution#getChildDistribution <em>Child Distribution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.Distribution#getProvidedEvents <em>Provided Events</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getDistribution()
 * @model
 * @generated
 */
public interface Distribution extends ObjectWithPropagatorFunctionAdapter {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(StartEvent)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getDistribution_Start()
	 * @model containment="true" required="true"
	 *        extendedMetaData="name='End'"
	 * @generated
	 */
	StartEvent getStart();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.Distribution#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(StartEvent value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(EndEvent)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getDistribution_End()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EndEvent getEnd();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.Distribution#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(EndEvent value);

	/**
	 * Returns the value of the '<em><b>Events Providers</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.time.continuous.EventsProviderAbstract}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.EventsProviderAbstract#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events Providers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events Providers</em>' containment reference list.
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getDistribution_EventsProviders()
	 * @see com.misc.common.moplaf.time.continuous.EventsProviderAbstract#getDistribution
	 * @model opposite="Distribution" containment="true"
	 * @generated
	 */
	EList<EventsProviderAbstract> getEventsProviders();

	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.time.continuous.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see com.misc.common.moplaf.time.continuous.TimeUnit
	 * @see #setTimeUnit(TimeUnit)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getDistribution_TimeUnit()
	 * @model
	 * @generated
	 */
	TimeUnit getTimeUnit();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.Distribution#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see com.misc.common.moplaf.time.continuous.TimeUnit
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(TimeUnit value);

	/**
	 * Returns the value of the '<em><b>Horizon Start</b></em>' attribute.
	 * The default value is <code>"2000-01-01"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizon Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizon Start</em>' attribute.
	 * @see #setHorizonStart(Date)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getDistribution_HorizonStart()
	 * @model default="2000-01-01"
	 * @generated
	 */
	Date getHorizonStart();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.Distribution#getHorizonStart <em>Horizon Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizon Start</em>' attribute.
	 * @see #getHorizonStart()
	 * @generated
	 */
	void setHorizonStart(Date value);

	/**
	 * Returns the value of the '<em><b>Horizon End</b></em>' attribute.
	 * The default value is <code>"2099-12-31"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizon End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizon End</em>' attribute.
	 * @see #setHorizonEnd(Date)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getDistribution_HorizonEnd()
	 * @model default="2099-12-31"
	 * @generated
	 */
	Date getHorizonEnd();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.Distribution#getHorizonEnd <em>Horizon End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizon End</em>' attribute.
	 * @see #getHorizonEnd()
	 * @generated
	 */
	void setHorizonEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Child Events</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.time.continuous.ChildEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Events</em>' containment reference list.
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getDistribution_ChildEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChildEvent> getChildEvents();

	/**
	 * Returns the value of the '<em><b>Sequence Events</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.time.continuous.DistributionEvent}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getDistributionAsSequence <em>Distribution As Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Events</em>' reference list.
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getDistribution_SequenceEvents()
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#getDistributionAsSequence
	 * @model opposite="DistributionAsSequence"
	 * @generated
	 */
	EList<DistributionEvent> getSequenceEvents();

	/**
	 * Returns the value of the '<em><b>Parent Distribution</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.Distribution#getChildDistribution <em>Child Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Distribution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Distribution</em>' reference.
	 * @see #setParentDistribution(Distribution)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getDistribution_ParentDistribution()
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getChildDistribution
	 * @model opposite="ChildDistribution"
	 * @generated
	 */
	Distribution getParentDistribution();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.Distribution#getParentDistribution <em>Parent Distribution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Distribution</em>' reference.
	 * @see #getParentDistribution()
	 * @generated
	 */
	void setParentDistribution(Distribution value);

	/**
	 * Returns the value of the '<em><b>Child Distribution</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.time.continuous.Distribution}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.Distribution#getParentDistribution <em>Parent Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Distribution</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Distribution</em>' reference list.
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getDistribution_ChildDistribution()
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getParentDistribution
	 * @model opposite="ParentDistribution"
	 * @generated
	 */
	EList<Distribution> getChildDistribution();

	/**
	 * Returns the value of the '<em><b>Provided Events</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.time.continuous.DistributionEvent}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getDistributionAsProvidedEvent <em>Distribution As Provided Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Events</em>' reference list.
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getDistribution_ProvidedEvents()
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#getDistributionAsProvidedEvent
	 * @model opposite="DistributionAsProvidedEvent"
	 * @generated
	 */
	EList<DistributionEvent> getProvidedEvents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the duration between two times in the unit of the distribution
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	float getDuration(Date from, Date to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Date getMoment(Date from, float duration);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the latest event before
	 *  the given time
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	DistributionEvent getEventBefore(Date time);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the latest event before
	 *  the given time
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	DistributionEvent getEventStrictBefore(Date time);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the earliest event after the given time
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	DistributionEvent getEventAfter(Date time);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the latest event before
	 *  the given time
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	DistributionEvent getEventStrictAfter(Date time);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the value of the Distribution on the left of the given time
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	float getAmountBefore(Date time);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the value of the Distribution at the right of the given time
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	float getAmountAfter(Date time);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the value of the Distribution on the left of the given time
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	float getAmount(Date time);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the slope of the Distribution at the left of the given time
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	float getSlopeBefore(Date time);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the slope at the right of the given time
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	float getSlopeAfter(Date time);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the minimal amount of the Distribution between two given times
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	float getMinAmount(Date from, Date to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the maximal amount of the Distribution between two given times
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	float getMaxAmount(Date from, Date to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the average amount of the Distribution between two given times
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	float getAverageAmount(Date from, Date to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the integral of the amount between two given times
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	float getCumulatedAmount(Date from, Date to);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the earliest moment after the moment {@code after} when the distribution is at least {@code amount} for
	 * the given {@code duration}.
	 * <p>
	 * The returned earliestMoment 
	 * satisfies: for every {@code moment } between  {@code earliestMoment } and {@code earliestMoment + duration}, we 
	 * have: {@code amount} is below {@code this.getAmount(moment)}. 
	 * 
	 * @param after    the moment after which capacity must be available
	 * @param duration the duration for of the required capacity
	 * @param amount   the amount of the required capacity
	 * @return         earliest moment when the required capacity is available
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Date getEarliestBelow(Date after, float duration, float amount);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Date getLatestBelow(Date before, float duration, float amount);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Date getEarliestAbove(Date after, float duration, float amount);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Date getLatestAbove(Date before, float duration, float amount);

	/**
	 * <!-- begin-user-doc -->
	 * Return the earliest moment when it is possible to produce continuously a quantity {@code amount}
	 * during {@code duration} while staying under this Distribution and above a minimum 
	 * amount {@code above}.
	 * <p>
	 * Say {@code rate} is {@code amount / duration}. Then the returned earliestMoment 
	 * satisfies: for every {@code moment } between  {@code earliestMoment } and {@code earliestMoment + duration}, we 
	 * have: {@code above + moment * rate} is below {@code this.getAmount(moment)}. 
	 * 
	 * @param above    the minimal amount that may not be used
	 * @param after    the moment after which production must start
	 * @param duration the duration for the production
	 * @param amount   the amount to produce
	 * @return         earliest moment when possible to produce
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Date getEarliestOutputPossible(float above, Date after, float duration, float amount);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshInit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refreshes all the data elements related to the sequece of events (reference SequenceEvent, DistributionEvent EventNr, Next-Previous
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void refreshSequence();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshChildEvent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refreshes all the data elements related to the sequece of events (reference SequenceEvent, DistributionEvent EventNr, Next-Previous
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void refreshProvidedEvents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorDataType="com.misc.common.moplaf.time.continuous.DistributionVisitor"
	 * @generated
	 */
	void accept(Date from, Date to, DistributionVisitor visitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refreshes all the derived data elements of the Distribution (event sequence, amount and slope)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

} // Distribution