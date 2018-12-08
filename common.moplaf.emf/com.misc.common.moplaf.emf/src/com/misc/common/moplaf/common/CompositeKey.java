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



import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class CompositeKey {
	// fields
	private Object[] keys;
	
	// constructor
	public CompositeKey(Object[] keys){
		this.keys = keys;
	}
	
	// accessor
	public Object getKey(int index){
		return this.keys[index];
	}
	
	// equals
	public boolean equals(Object other){
	  
		if (other == null) { return false; }
		if (other == this) { return true; }
		if (other.getClass() != getClass()) {
			return false;
		}
	   
	    CompositeKey otherKey = (CompositeKey) other;
	   
	    EqualsBuilder equalsBuilder = new EqualsBuilder();
	    for ( int i = 0; i<keys.length; i++ ){
	    	equalsBuilder.append(this.keys[i], otherKey.keys[i]);
	    }
	    return equalsBuilder.isEquals();
	}
	
	// hashCode
	public int hashCode(){
	     HashCodeBuilder hashBuilder = new HashCodeBuilder(17, 37);
	     for ( int i = 0; i<keys.length; i++ ){
	    	 hashBuilder.append(keys[i]);
	     }
		 return hashBuilder.toHashCode();
	}

}
