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
