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

import com.misc.common.moplaf.localsearch.Delta;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.MoveSchedule#getTaskToSchedule <em>Task To Schedule</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getMoveSchedule()
 * @model abstract="true"
 * @generated
 */
public interface MoveSchedule extends Delta {
	/**
	 * Returns the value of the '<em><b>Task To Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task To Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task To Schedule</em>' reference.
	 * @see #setTaskToSchedule(Task)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getMoveSchedule_TaskToSchedule()
	 * @model required="true"
	 * @generated
	 */
	Task getTaskToSchedule();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.MoveSchedule#getTaskToSchedule <em>Task To Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task To Schedule</em>' reference.
	 * @see #getTaskToSchedule()
	 * @generated
	 */
	void setTaskToSchedule(Task value);

} // MoveSchedule
