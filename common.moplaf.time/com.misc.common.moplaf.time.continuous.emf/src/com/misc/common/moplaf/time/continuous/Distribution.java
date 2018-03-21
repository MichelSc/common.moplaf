/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.time.continuous;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distribution</b></em>'.
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
 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistribution()
 * @model
 * @generated
 */
public interface Distribution extends ObjectWithPropagatorFunctions {
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
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistribution_TimeUnit()
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
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistribution_HorizonStart()
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
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistribution_HorizonEnd()
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
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistribution_ChildEvents()
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
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistribution_SequenceEvents()
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#getDistributionAsSequence
	 * @model opposite="DistributionAsSequence"
	 * @generated
	 */
	EList<DistributionEvent> getSequenceEvents();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(StartEvent)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistribution_Start()
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
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(EndEvent)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistribution_End()
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
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistribution_EventsProviders()
	 * @see com.misc.common.moplaf.time.continuous.EventsProviderAbstract#getDistribution
	 * @model opposite="Distribution" containment="true"
	 * @generated
	 */
	EList<EventsProviderAbstract> getEventsProviders();

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
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistribution_ParentDistribution()
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
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistribution_ChildDistribution()
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
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistribution_ProvidedEvents()
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
	 * @model
	 * @generated
	 */
	void refresh();

} // Distribution
