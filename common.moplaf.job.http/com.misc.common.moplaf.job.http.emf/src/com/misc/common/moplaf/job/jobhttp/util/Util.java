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
package com.misc.common.moplaf.job.jobhttp.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

public class Util {
	
	public static Map<String, String> getQueryParams(String query) throws UnsupportedEncodingException {
	    Map<String, String> query_pairs = new LinkedHashMap<String, String>();
	    if ( query!=null ) {
		    String[] pairs = query.split("&");
		    for (String pair : pairs) {
		        int idx = pair.indexOf("=");
		        query_pairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF-8"), 
		        		        URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
		    }
	    }
	    return query_pairs;
	}	

}
