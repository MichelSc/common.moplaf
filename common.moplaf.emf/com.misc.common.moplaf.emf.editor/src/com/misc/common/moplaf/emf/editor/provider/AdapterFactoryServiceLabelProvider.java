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
package com.misc.common.moplaf.emf.editor.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import com.misc.common.moplaf.common.HttpServiceProvider;

public class AdapterFactoryServiceLabelProvider extends AdapterFactoryLabelProvider {

	public AdapterFactoryServiceLabelProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
		// TODO Auto-generated constructor stub
	}

//	@Override
//	public String getText(Object object) {
//		String original_text = super.getText(object); 
//		if ( object instanceof HttpServiceProvider ) {
//			HttpServiceProvider provider = (HttpServiceProvider)object;
//			if ( provider.getEnabledFeedback().isEnabled()) {
//				String url = String.format("%s&filename=%s",
//						RWT.getServiceManager().getServiceHandlerUrl(provider.getServiceID()),
//						provider.getObjectID());
//				String url_escaped = StringEscapeUtils.escapeHtml(url);
//				String new_text = String.format("<a href=\"%s\" > %s </a>",
//						url_escaped,
//						original_text);
//				
//				Plugin.INSTANCE.logInfo("link is: "+new_text);
//				return new_text;
//			}
//		}
//		return original_text;

}
