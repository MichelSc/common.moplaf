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
package com.misc.common.moplaf.scheduler;

import com.misc.common.moplaf.localsearch.Score;
import com.misc.common.moplaf.localsearch.Strategy;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.Scheduler#getSchedules <em>Schedules</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getScheduler()
 * @model abstract="true"
 * @generated
 */
public interface Scheduler extends Strategy {
	/**
	 * Returns the value of the '<em><b>Schedules</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.Schedule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedules</em>' reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getScheduler_Schedules()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Schedule> getSchedules();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Score constructScore();

} // Scheduler
