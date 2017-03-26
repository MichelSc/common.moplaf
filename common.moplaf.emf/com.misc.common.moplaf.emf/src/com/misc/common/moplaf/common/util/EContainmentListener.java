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

/**
 * The interface EContainmentListener must be implemented by EObject using EContainmentListener
 * for being notified when
 * <ul>
 * <li>added to containment</li>
 * <li>removed from containment</li>
 * <li>loaded from persistence</li>
 * </ul>
 * When an atomic object is added/removed to/from containment or loaded, the corresponding 
 * call back will be invoked.
 * <p>
 * When a containment hierarchy is added/removed to/from containment by applicative logic or
 * persistence, question is in which sequence the call backs should be invoked
 * <ul>
 * <li>top down: first the parent, then the children: makes sense for the onContained, onLoaded 
 * (when called on the child, the parent has been notified and may be assumed to be fully initialized,
 * so the child can used what hab been initialized by the parent)</li>
 * <li>down top: first the children, then the parent: makes sense for the onNotContained 
 * (when called on the parent, the children have been notified and may be assumed to be fully released) </li>
 * <li>nothing guaranteed: the only guarantee is they all will be called </li>
 * </ul>
 * 
 * 
 * @author MiSc
 *
 */

public interface EContainmentListener {
	/**
	 * Method called when the EObject is contained and fully loaded from persistence. 
	 * That is, when all its children are also loaded.
	 */
	void onLoaded();
	
	/** Method called when the EObject is contained but not loaded from persistence. 
	 * 
	 */
	void onContained();
	
	/**
	 * Method called when the EObject is no longer contained.
	 */
	void onNotContained();
}
