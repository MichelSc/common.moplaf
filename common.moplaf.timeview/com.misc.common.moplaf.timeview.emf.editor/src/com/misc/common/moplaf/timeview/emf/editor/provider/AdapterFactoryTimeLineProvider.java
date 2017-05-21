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
package com.misc.common.moplaf.timeview.emf.editor.provider;



import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

import com.misc.common.moplaf.timeview.IIntervalEventProvider;
import com.misc.common.moplaf.timeview.emf.edit.IItemTimeLinesEventsIntervalsProvider;
import com.misc.common.moplaf.timeview.emf.edit.IItemTimeLinesEventsProvider;
import com.misc.common.moplaf.timeview.emf.edit.IItemTimeLinesIntervalsProvider;
import com.misc.common.moplaf.timeview.emf.edit.IItemTimeLinesProvider;

/**
 * An {@link AdapterFactoryTimeLineProvider} implements the interface {@link IIntervalEventProvider} for different kind of providers:
 * <ul>
 * <li> {@link IItemTimeLinesEventsProvider}</li>
 * <li> {@link IItemTimeLinesIntervalsProvider}</li>
 * <li> {@link IItemTimeLinesEventsIntervalsProvider}</li>
 * </ul>
 * <p>
 * @author MiSc
 *
 */
public class AdapterFactoryTimeLineProvider  {

	private AdapterFactory adapterFactory;
	
	private FactoryIntervalEventProvider intervalEventProviderFactory = new FactoryIntervalEventProvider(); 
	
	/**
	 * 
	 * @param adapterFactory
	 */
	public AdapterFactoryTimeLineProvider(AdapterFactory adapterFactory){
		this.adapterFactory = adapterFactory;
	}

	/**
	 * 
	 */
	public void dispose(){
		this.adapterFactory = null;
	}

	/**
	 * Return a collection of object extending the private class  {@link TimeLineProvider}, and implementing 
	 * the interfaces {@link IItemLabelProvider} and specific methods for supporting {@link IIntervalEventProvider}
	 * <p>
	 */
	public Object[]  getTimeLineProviders(Object[] childrenModelElement){
		LinkedList<Object> inputs = new LinkedList<Object>();
		for ( Object childElement : childrenModelElement){
			IItemTimeLinesProvider timeLinesProvider = (IItemTimeLinesProvider) this.adapterFactory.adapt(childElement, IItemTimeLinesProvider.class);
			if ( timeLinesProvider != null ){
				Collection<?> timeLines= timeLinesProvider.getTimeLines(childElement);
				if ( timeLines == null ) {
					Object provider = this.intervalEventProviderFactory.createTimeLineProvider(childElement, null, timeLinesProvider);
					inputs.add(provider);
				} else {
					for ( Object timeLine : timeLines){
						Object provider = this.intervalEventProviderFactory.createTimeLineProvider(childElement, timeLine, timeLinesProvider);
						inputs.add(provider);
					}
				}
			} 
		} // traverse the children
		
		Object[] returnArray = inputs.toArray();
		return returnArray;
	}
	
}
