package com.misc.common.moplaf.kpiview.emf.edit;

import java.util.Collection;

/**
 * <p>
 * This interface declare the method(s) to be supported by an object that the Gantt must show as a Row
 * <p>
 * To implement this interface by an {@link ItemProviderAdapter}, in the concrete class, do the following 
 * <ul>
 *   <li>add <code>@implements IItemIntervalEventsProvider</code> in the user doc</li>
 *   <li>regenerate the code</li>
 *   <li>add the unimplemented methods</li>
 *   <li>implement {@link #getIntervalEvents(Object)}</li>
 *   <li>override {@link #isAdapterForType(Object)} and return true when the type is IItemIntervalEventsProvider</li>
 * </ul> 
 * In the project's ProviderAdapterFactory, you may need to change 
 * <ul>
 *   <li>the method {@link #isFactoryForType} (apparently not)</li>
 *   <li> add the following lines in the constructors (apparenlty yes)
 *     <ul>
 *     <li>	<code>supportedTypes.add(IItemIntervalEventProvider.class); // non emf interface </code></li>
 *     <li>	<code>supportedTypes.add(IItemIntervalEventsProvider.class); // non emf interface </code></li>
 *     </ul>
 * </ul> 
 * In the plugin.xml,  
 * <ul>
 *   <li>you may need to add the type IItemIntervalEventsProvider in the field SupportedTypes for extension org.eclipse.emf.edit.itemProviderAdapterFactories </li>
 * </ul> 
 * <p>
 * @author michel
 */

public interface IItemKPIsProvider {
	Collection<?> getKPIs(Object element);
}
