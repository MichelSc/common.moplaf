/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distribution Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getMoment <em>Moment</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getEventNr <em>Event Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getNext <em>Next</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getPrevious <em>Previous</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getAmountBefore <em>Amount Before</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getAmountAfter <em>Amount After</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getSlopeBefore <em>Slope Before</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getSlopeAfter <em>Slope After</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getDistributionAsSequence <em>Distribution As Sequence</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getDistributionAsProvidedEvent <em>Distribution As Provided Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.DistributionEvent#isSegmentAfter <em>Segment After</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.DistributionEvent#isSegmentBefore <em>Segment Before</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistributionEvent()
 * @model abstract="true"
 *        annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Thing'"
 * @generated
 */
public interface DistributionEvent extends ObjectWithPropagatorFunctions {
	/**
	 * Returns the value of the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment</em>' attribute.
	 * @see #setMoment(Date)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistributionEvent_Moment()
	 * @model
	 * @generated
	 */
	Date getMoment();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getMoment <em>Moment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment</em>' attribute.
	 * @see #getMoment()
	 * @generated
	 */
	void setMoment(Date value);

	/**
	 * Returns the value of the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Nr</em>' attribute.
	 * @see #setEventNr(int)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistributionEvent_EventNr()
	 * @model
	 * @generated
	 */
	int getEventNr();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getEventNr <em>Event Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Nr</em>' attribute.
	 * @see #getEventNr()
	 * @generated
	 */
	void setEventNr(int value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(DistributionEvent)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistributionEvent_Next()
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#getPrevious
	 * @model opposite="Previous"
	 * @generated
	 */
	DistributionEvent getNext();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(DistributionEvent value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(DistributionEvent)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistributionEvent_Previous()
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#getNext
	 * @model opposite="Next"
	 * @generated
	 */
	DistributionEvent getPrevious();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(DistributionEvent value);

	/**
	 * Returns the value of the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Before</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Before</em>' attribute.
	 * @see #setAmountBefore(double)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistributionEvent_AmountBefore()
	 * @model
	 * @generated
	 */
	double getAmountBefore();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getAmountBefore <em>Amount Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Before</em>' attribute.
	 * @see #getAmountBefore()
	 * @generated
	 */
	void setAmountBefore(double value);

	/**
	 * Returns the value of the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount After</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount After</em>' attribute.
	 * @see #setAmountAfter(double)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistributionEvent_AmountAfter()
	 * @model
	 * @generated
	 */
	double getAmountAfter();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getAmountAfter <em>Amount After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount After</em>' attribute.
	 * @see #getAmountAfter()
	 * @generated
	 */
	void setAmountAfter(double value);

	/**
	 * Returns the value of the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slope Before</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slope Before</em>' attribute.
	 * @see #setSlopeBefore(double)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistributionEvent_SlopeBefore()
	 * @model
	 * @generated
	 */
	double getSlopeBefore();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getSlopeBefore <em>Slope Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slope Before</em>' attribute.
	 * @see #getSlopeBefore()
	 * @generated
	 */
	void setSlopeBefore(double value);

	/**
	 * Returns the value of the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slope After</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slope After</em>' attribute.
	 * @see #setSlopeAfter(double)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistributionEvent_SlopeAfter()
	 * @model
	 * @generated
	 */
	double getSlopeAfter();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getSlopeAfter <em>Slope After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slope After</em>' attribute.
	 * @see #getSlopeAfter()
	 * @generated
	 */
	void setSlopeAfter(double value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistributionEvent_Description()
	 * @model default="" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Distribution As Sequence</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.Distribution#getSequenceEvents <em>Sequence Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution As Sequence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution As Sequence</em>' reference.
	 * @see #setDistributionAsSequence(Distribution)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistributionEvent_DistributionAsSequence()
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getSequenceEvents
	 * @model opposite="SequenceEvents"
	 * @generated
	 */
	Distribution getDistributionAsSequence();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getDistributionAsSequence <em>Distribution As Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution As Sequence</em>' reference.
	 * @see #getDistributionAsSequence()
	 * @generated
	 */
	void setDistributionAsSequence(Distribution value);

	/**
	 * Returns the value of the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution</em>' reference.
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistributionEvent_Distribution()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Distribution getDistribution();

	/**
	 * Returns the value of the '<em><b>Distribution As Provided Event</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.Distribution#getProvidedEvents <em>Provided Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution As Provided Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution As Provided Event</em>' reference.
	 * @see #setDistributionAsProvidedEvent(Distribution)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistributionEvent_DistributionAsProvidedEvent()
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getProvidedEvents
	 * @model opposite="ProvidedEvents"
	 * @generated
	 */
	Distribution getDistributionAsProvidedEvent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getDistributionAsProvidedEvent <em>Distribution As Provided Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution As Provided Event</em>' reference.
	 * @see #getDistributionAsProvidedEvent()
	 * @generated
	 */
	void setDistributionAsProvidedEvent(Distribution value);

	/**
	 * Returns the value of the '<em><b>Segment After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment After</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment After</em>' attribute.
	 * @see #setSegmentAfter(boolean)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistributionEvent_SegmentAfter()
	 * @model
	 * @generated
	 */
	boolean isSegmentAfter();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#isSegmentAfter <em>Segment After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment After</em>' attribute.
	 * @see #isSegmentAfter()
	 * @generated
	 */
	void setSegmentAfter(boolean value);

	/**
	 * Returns the value of the '<em><b>Segment Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment Before</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Before</em>' attribute.
	 * @see #setSegmentBefore(boolean)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getDistributionEvent_SegmentBefore()
	 * @model
	 * @generated
	 */
	boolean isSegmentBefore();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#isSegmentBefore <em>Segment Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment Before</em>' attribute.
	 * @see #isSegmentBefore()
	 * @generated
	 */
	void setSegmentBefore(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double getAmountBefore(Date moment);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double getAmountAfter(Date moment);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isBefore(DistributionEvent other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isStrictBefore(DistributionEvent other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshSlopeBefore();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshAmountBefore();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshAmountAfter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshSlopeAfter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshMoment();

} // DistributionEvent
