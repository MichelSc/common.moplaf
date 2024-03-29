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
package com.misc.common.moplaf.time.discrete.impl;

import com.misc.common.moplaf.time.Util;
import com.misc.common.moplaf.time.discrete.TimeDiscreteFactory;
import com.misc.common.moplaf.time.discrete.TimeDiscretePackage;
import com.misc.common.moplaf.time.discrete.MergeElement;
import com.misc.common.moplaf.time.discrete.TimeBucket;
import com.misc.common.moplaf.time.discrete.TimeLine;
import com.misc.common.moplaf.time.discrete.TimeLineMerge;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Line Merge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.TimeLineMergeImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.TimeLineMergeImpl#getTimeLineTo <em>Time Line To</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.TimeLineMergeImpl#getFirstElement <em>First Element</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.TimeLineMergeImpl#getLastElement <em>Last Element</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.TimeLineMergeImpl#getTimeLineFrom <em>Time Line From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeLineMergeImpl extends MinimalEObjectImpl.Container implements TimeLineMerge {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<MergeElement> elements;

	/**
	 * The cached value of the '{@link #getTimeLineTo() <em>Time Line To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLineTo()
	 * @generated
	 * @ordered
	 */
	protected TimeLine timeLineTo;

	/**
	 * The cached value of the '{@link #getFirstElement() <em>First Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstElement()
	 * @generated
	 * @ordered
	 */
	protected MergeElement firstElement;

	/**
	 * The cached value of the '{@link #getLastElement() <em>Last Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastElement()
	 * @generated
	 * @ordered
	 */
	protected MergeElement lastElement;

	/**
	 * The cached value of the '{@link #getTimeLineFrom() <em>Time Line From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLineFrom()
	 * @generated
	 * @ordered
	 */
	protected TimeLine timeLineFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeLineMergeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeDiscretePackage.Literals.TIME_LINE_MERGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MergeElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<MergeElement>(MergeElement.class, this, TimeDiscretePackage.TIME_LINE_MERGE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLine getTimeLineTo() {
		if (timeLineTo != null && timeLineTo.eIsProxy()) {
			InternalEObject oldTimeLineTo = (InternalEObject)timeLineTo;
			timeLineTo = (TimeLine)eResolveProxy(oldTimeLineTo);
			if (timeLineTo != oldTimeLineTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeDiscretePackage.TIME_LINE_MERGE__TIME_LINE_TO, oldTimeLineTo, timeLineTo));
			}
		}
		return timeLineTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLine basicGetTimeLineTo() {
		return timeLineTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeLineTo(TimeLine newTimeLineTo) {
		TimeLine oldTimeLineTo = timeLineTo;
		timeLineTo = newTimeLineTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeDiscretePackage.TIME_LINE_MERGE__TIME_LINE_TO, oldTimeLineTo, timeLineTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeElement getFirstElement() {
		if (firstElement != null && firstElement.eIsProxy()) {
			InternalEObject oldFirstElement = (InternalEObject)firstElement;
			firstElement = (MergeElement)eResolveProxy(oldFirstElement);
			if (firstElement != oldFirstElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeDiscretePackage.TIME_LINE_MERGE__FIRST_ELEMENT, oldFirstElement, firstElement));
			}
		}
		return firstElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeElement basicGetFirstElement() {
		return firstElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstElement(MergeElement newFirstElement) {
		MergeElement oldFirstElement = firstElement;
		firstElement = newFirstElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeDiscretePackage.TIME_LINE_MERGE__FIRST_ELEMENT, oldFirstElement, firstElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeElement getLastElement() {
		if (lastElement != null && lastElement.eIsProxy()) {
			InternalEObject oldLastElement = (InternalEObject)lastElement;
			lastElement = (MergeElement)eResolveProxy(oldLastElement);
			if (lastElement != oldLastElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeDiscretePackage.TIME_LINE_MERGE__LAST_ELEMENT, oldLastElement, lastElement));
			}
		}
		return lastElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeElement basicGetLastElement() {
		return lastElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastElement(MergeElement newLastElement) {
		MergeElement oldLastElement = lastElement;
		lastElement = newLastElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeDiscretePackage.TIME_LINE_MERGE__LAST_ELEMENT, oldLastElement, lastElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLine getTimeLineFrom() {
		if (timeLineFrom != null && timeLineFrom.eIsProxy()) {
			InternalEObject oldTimeLineFrom = (InternalEObject)timeLineFrom;
			timeLineFrom = (TimeLine)eResolveProxy(oldTimeLineFrom);
			if (timeLineFrom != oldTimeLineFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeDiscretePackage.TIME_LINE_MERGE__TIME_LINE_FROM, oldTimeLineFrom, timeLineFrom));
			}
		}
		return timeLineFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLine basicGetTimeLineFrom() {
		return timeLineFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeLineFrom(TimeLine newTimeLineFrom) {
		TimeLine oldTimeLineFrom = timeLineFrom;
		timeLineFrom = newTimeLineFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeDiscretePackage.TIME_LINE_MERGE__TIME_LINE_FROM, oldTimeLineFrom, timeLineFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		// clear the structure
		while ( !this.getElements().isEmpty()){
			EcoreUtil.delete(this.getElements().get(0));
		}
		// get the time scales
		TimeLine from = this.getTimeLineFrom();
		TimeLine to   = this.getTimeLineTo();
		if ( from==null 
		  || to==null 
		  || from.getFirstBucket()==null 
		  || to.getFirstBucket()==null){
			return;
		}
		// initialisation
		Date farinfuture = Util.MIN_DATE;
		TimeBucket currentfrom = null; // null means before first
		TimeBucket currentto   = null; // null means before first
		Date earliestendfrom = from.getFirstBucket().getBucketStart();
		Date earliestendto   = to  .getFirstBucket().getBucketStart();
		Date currentstart = Util.MAX_DATE;
		MergeElement previouselement= null;
		boolean finished = false;
		while  ( !finished) {
			TimeBucket nextfrom = currentfrom;			
			TimeBucket nextto   = currentto;
			Date currentend = null;
			if ( earliestendfrom.compareTo(earliestendto)<0){
				// from qualifies to go ahead
				currentend = earliestendfrom;
				// increment from
				if ( currentfrom==null) nextfrom = from.getFirstBucket(); // from promotes from beforefirst to first
				else 					nextfrom = currentfrom.getNext();
				if ( nextfrom==null)	earliestendfrom = farinfuture;       // from is now after last
				else					earliestendfrom = nextfrom.getBucketEnd();
			}
			else {
				// to qualifies to go ahead
				currentend = earliestendto;
				if ( currentto==null) nextto = to.getFirstBucket(); // to promotes from before first to last
				else                  nextto = currentto.getNext();
				if ( nextto==null) earliestendto = farinfuture;     // to is now after last
				else               earliestendto = nextto.getBucketEnd();
			}
			// create the element
			MergeElement currentelement = TimeDiscreteFactory.eINSTANCE.createMergeElement();
			int seconds = Util.getSeconds(currentstart,  currentend);
			float partfrominto = currentto==null   ? 0f : (float)seconds/currentto.getSeconds();
			float parttoinfrom = currentfrom==null ? 0f : (float)seconds/currentfrom.getSeconds();
			currentelement.setBucketFrom  (currentfrom);
			currentelement.setBucketTo    (currentto);
			currentelement.setElementStart(currentstart);
			currentelement.setElementEnd  (currentend);
			currentelement.setSeconds(seconds);
			currentelement.setPartFromInTo(partfrominto);
			currentelement.setPartToInFrom(parttoinfrom);
			// previous, next, first, last
			currentelement.setPrevious(previouselement);
			if ( previouselement == null){
				this.setFirstElement(currentelement);
			}
			
			this.getElements().add(currentelement);
			// loop control
			finished = currentend==farinfuture; 
			currentstart = currentend;
			currentfrom  = nextfrom;
			currentto    = nextto;
			previouselement = currentelement;
		} // loop on the merge elements to be
		this.setLastElement(previouselement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimeDiscretePackage.TIME_LINE_MERGE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimeDiscretePackage.TIME_LINE_MERGE__ELEMENTS:
				return getElements();
			case TimeDiscretePackage.TIME_LINE_MERGE__TIME_LINE_TO:
				if (resolve) return getTimeLineTo();
				return basicGetTimeLineTo();
			case TimeDiscretePackage.TIME_LINE_MERGE__FIRST_ELEMENT:
				if (resolve) return getFirstElement();
				return basicGetFirstElement();
			case TimeDiscretePackage.TIME_LINE_MERGE__LAST_ELEMENT:
				if (resolve) return getLastElement();
				return basicGetLastElement();
			case TimeDiscretePackage.TIME_LINE_MERGE__TIME_LINE_FROM:
				if (resolve) return getTimeLineFrom();
				return basicGetTimeLineFrom();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TimeDiscretePackage.TIME_LINE_MERGE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends MergeElement>)newValue);
				return;
			case TimeDiscretePackage.TIME_LINE_MERGE__TIME_LINE_TO:
				setTimeLineTo((TimeLine)newValue);
				return;
			case TimeDiscretePackage.TIME_LINE_MERGE__FIRST_ELEMENT:
				setFirstElement((MergeElement)newValue);
				return;
			case TimeDiscretePackage.TIME_LINE_MERGE__LAST_ELEMENT:
				setLastElement((MergeElement)newValue);
				return;
			case TimeDiscretePackage.TIME_LINE_MERGE__TIME_LINE_FROM:
				setTimeLineFrom((TimeLine)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TimeDiscretePackage.TIME_LINE_MERGE__ELEMENTS:
				getElements().clear();
				return;
			case TimeDiscretePackage.TIME_LINE_MERGE__TIME_LINE_TO:
				setTimeLineTo((TimeLine)null);
				return;
			case TimeDiscretePackage.TIME_LINE_MERGE__FIRST_ELEMENT:
				setFirstElement((MergeElement)null);
				return;
			case TimeDiscretePackage.TIME_LINE_MERGE__LAST_ELEMENT:
				setLastElement((MergeElement)null);
				return;
			case TimeDiscretePackage.TIME_LINE_MERGE__TIME_LINE_FROM:
				setTimeLineFrom((TimeLine)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TimeDiscretePackage.TIME_LINE_MERGE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case TimeDiscretePackage.TIME_LINE_MERGE__TIME_LINE_TO:
				return timeLineTo != null;
			case TimeDiscretePackage.TIME_LINE_MERGE__FIRST_ELEMENT:
				return firstElement != null;
			case TimeDiscretePackage.TIME_LINE_MERGE__LAST_ELEMENT:
				return lastElement != null;
			case TimeDiscretePackage.TIME_LINE_MERGE__TIME_LINE_FROM:
				return timeLineFrom != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TimeDiscretePackage.TIME_LINE_MERGE___REFRESH:
				refresh();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //TimeLineMergeImpl
