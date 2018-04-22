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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Events Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.EventsProvider#getProvidedEvents <em>Provided Events</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getEventsProvider()
 * @model abstract="true"
 * @generated
 */
public interface EventsProvider extends EventsProviderAbstract {
	/**
	 * Returns the value of the '<em><b>Provided Events</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.time.continuous.ProvidedEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Events</em>' reference list.
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getEventsProvider_ProvidedEvents()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<ProvidedEvent> getProvidedEvents();

} // EventsProvider
