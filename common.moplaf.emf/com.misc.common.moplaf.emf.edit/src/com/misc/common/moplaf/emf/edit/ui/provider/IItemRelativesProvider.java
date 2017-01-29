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
package com.misc.common.moplaf.emf.edit.ui.provider;

import java.util.Collection;

public interface IItemRelativesProvider {

	  /**
	   * Get the relatives of the object. This includes typically non-children objects
	   */
	  public Collection<?> getRelatives(Object object);
}
