package com.misc.common.moplaf.propagator;

import java.util.LinkedList;

public class PropagatorFunctionAdaptersImpl extends LinkedList<PropagatorFunctionAdapter>
                                            implements PropagatorFunctionAdapters  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/* (non-Javadoc)
	 * @see java.util.LinkedList#add(int, java.lang.Object)
	 */
	@Override
	public void add(int index, PropagatorFunctionAdapter element) {
		if ( element == null) { return; }
		super.add(index, element);
	}

	/* (non-Javadoc)
	 * @see java.util.LinkedList#add(java.lang.Object)
	 */
	@Override
	public boolean add(PropagatorFunctionAdapter e) {
		if ( e == null) { return false; }
		return super.add(e);
	}


	/* (non-Javadoc)
	 * @see java.util.LinkedList#addFirst(java.lang.Object)
	 */
	@Override
	public void addFirst(PropagatorFunctionAdapter e) {
		if ( e == null) { return; }
		super.addFirst(e);
	}

	/* (non-Javadoc)
	 * @see java.util.LinkedList#addLast(java.lang.Object)
	 */
	@Override
	public void addLast(PropagatorFunctionAdapter e) {
		if ( e == null) { return; }
		super.addLast(e);
	}

}
