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
package com.misc.common.moplaf.serialize;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public interface Scheme {
	
	public boolean serialize(EList<EObject> objects, Writer writer) throws IOException;

	public boolean deserialize(EList<EObject> objects, Reader reader) throws IOException;
}
