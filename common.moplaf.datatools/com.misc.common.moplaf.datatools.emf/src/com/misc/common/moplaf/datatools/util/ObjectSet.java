package com.misc.common.moplaf.datatools.util;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;

public class ObjectSet extends HashSet<EObject>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean complete;
	
	public ObjectSet() {
		super();
		this.complete = true;
	}

	public ObjectSet(Collection<? extends EObject> c) {
		super(c);
		this.complete = true;
	}

	public boolean isComplete() {
		return this.complete;
	}
	
	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	
	

}
