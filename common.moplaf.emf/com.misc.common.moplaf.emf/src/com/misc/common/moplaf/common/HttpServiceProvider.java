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
package com.misc.common.moplaf.common;

import org.apache.commons.lang.StringEscapeUtils;

public interface HttpServiceProvider {
	
	public EnabledFeedback getServiceEnabledFeedback();
	
	public String getServiceID();
	
	public String getServiceData();
	
	static String HelperConstructUrl(String base_url, String data) {
		String url = String.format("%s&data=%s", base_url, data);
		return url;
	}
	
	static String HelperConstructHtmlTag(String url, String text) {
		String url_escaped = StringEscapeUtils.escapeHtml(url);
		String new_text = String.format("<a href=\"%s\" > %s </a>", url_escaped, text);
		return new_text;
	}
}
