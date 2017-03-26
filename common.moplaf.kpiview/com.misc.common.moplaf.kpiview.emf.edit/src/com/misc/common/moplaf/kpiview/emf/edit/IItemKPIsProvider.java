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
package com.misc.common.moplaf.kpiview.emf.edit;

import java.util.Collection;

/**
 * <p>
 * This interface declare the method(s) to be supported by an object to provide KPI's
 * <p>
 * To implement this interface by an {@link ItemProviderAdapter}, in the concrete class, do the following 
 * <ul>
 *   <li>add <code>@implements IItemKPIsProvider</code> in the user doc</li>
 *   <li>regenerate the code</li>
 *   <li>add the unimplemented methods</li>
 *   <li>implement {@link #getKPIs(Object)}</li>
 *   <li>override {@link #isAdapterForType(Object)} and return true when the type is IItemKPIsProvider (apparently, this is not necessary)</li>
 * </ul> 
 * In the project's ProviderAdapterFactory, you may need to change 
 * <ul>
 *   <li>the method {@link #isFactoryForType} (apparently not)</li>
 *   <li> add the following lines in the constructors (apparenlty yes)
 *     <ul>
 *     <li>	<code>supportedTypes.add(IItemKPIsProvider.class); // non emf interface </code></li>
 *     <li>	<code>supportedTypes.add(IItemKPIProvider.class); // non emf interface </code></li>
 *     <li>	<code>supportedTypes.add(IItemKPIRangeProvider.class); // non emf interface </code></li>
 *     </ul>
 * </ul> 
 * In the plugin.xml,  
 * <ul>
 *   <li>you may need to add the type IItemKPIsProvider in the field SupportedTypes for extension org.eclipse.emf.edit.itemProviderAdapterFactories </li>
 * </ul> 
 * <p>
 * @author michel
 */

public interface IItemKPIsProvider {
	Collection<?> getKPIs(Object element);
}
