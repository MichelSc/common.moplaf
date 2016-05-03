package com.misc.common.moplaf.dbsynch.impl;



import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class TableRowKeyImpl {
	// fields
	private Object[] keys;
	
	// constructor
	public TableRowKeyImpl(Object[] keys){
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
	   
	    TableRowKeyImpl otherKey = (TableRowKeyImpl) other;
	   
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
