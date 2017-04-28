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
package com.misc.common.moplaf.common.util;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectEList;

/**
 * List of objects used for returning values for derived relations.
 * It may be used for not notifying.
 * 
 * @author michel
 *
 * @param <E>
 */
public class EObjectListDerived<E> extends EObjectEList<E> {
	/**
	 * 
	 */
	private boolean skipNotifications = false;

	public EObjectListDerived(Class<?> dataClass, InternalEObject owner, int featureID) {
		super(dataClass, owner, featureID);
	}

	public EObjectListDerived(Class<?> dataClass, InternalEObject owner, int featureID, boolean skipNotifications) {
		super(dataClass, owner, featureID);
		this.skipNotifications = skipNotifications;
	}
	
	@Override
	protected boolean isNotificationRequired() {
		if ( this.skipNotifications){
			return false;
		}
	return super.isNotificationRequired();
	}
}