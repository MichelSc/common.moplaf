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
package org.neos.client;

/**
 * Class for creating Job description XML for NEOS
 * 
 * @author Thawan Kooburat
 * 
 */
public class NeosJobXml {

	private StringBuffer xml = new StringBuffer();

	public NeosJobXml(String category, String solver, String input) {

		xml.append("<document>\n<category>" + category
				+ "</category>\n<solver>" + solver + "</solver>\n<inputMethod>"
				+ input + "</inputMethod>\n");

	}

	/**
	 * Add parameter to job description
	 * 
	 * @param name
	 * @param value
	 */
	public void addParam(String name, String value) {

		xml.append("<" + name + ">\n<![CDATA[\n" + value + "\n]]>\n</" + name
				+ ">\n");
	}

	/**
	 * Add binary parameter to job description (will be converted to Base64)
	 * 
	 * @param name
	 * @param value
	 */
	public void addBinaryParam(String name, byte[] value) {
		addBinaryParam(name, value, 0, value.length);
	}

	/**
	 * Add binary parameter to job description (will be converted to Base64)
	 * 
	 * @param name
	 * @param value
	 */
	public void addBinaryParam(String name, byte[] value, int offset, int len) {

		xml.append("<" + name + "><base64>\n");
		xml.append(Base64.encodeBytes(value, offset, len));
		xml.append("</base64></" + name + ">\n");
	}

	/**
	 * Create XML of this job
	 * 
	 * @return
	 */
	public String toXMLString() {
		return xml.toString() + "</document>";
	}
}
