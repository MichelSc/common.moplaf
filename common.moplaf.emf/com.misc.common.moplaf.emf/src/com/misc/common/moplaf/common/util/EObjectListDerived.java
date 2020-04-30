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
package com.misc.common.moplaf.common.util;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectEList;

/**
 * List of objects used for returning values for derived relations.
 * <p>
 * It may be used for not notifying (i.e. disabling notification)
 * 
 * @author michel
 *
 * @param <E> the interface type of the objects in the list
 */
public class EObjectListDerived<E> extends EObjectEList<E> {
	/**
	 * 
	 */
	private boolean skipNotifications = false;

	public EObjectListDerived(Class<?> dataClass, InternalEObject owner, int featureID) {
		super(dataClass, owner, featureID);
	}

	/**
	 * @param dataClass the type of the objects references in the lists
	 * @param owner the object owning the list (i.e. owning the reference)
	 * @param featureID the reference
	 * @param skipNotifications whether to skip notifications (default is no skipping)
	 */	
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
