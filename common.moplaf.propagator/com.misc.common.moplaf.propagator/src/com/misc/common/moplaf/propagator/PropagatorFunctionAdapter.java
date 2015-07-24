package com.misc.common.moplaf.propagator;


import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;




/**
 * <p>
 * Manage the refresh of derived data elements by listening to changes, 
 * remembering when out of date, and declaring data elements this data element depends on.
 * <p>
 * A PropagatorFunctionAdapter: 
 * <ul>
 * <li>implements some refresh logic: method {@link #calculate()}
 * <li>maintains its touched state 
 *   <ul>
 *   <li>whether this propagator is up to date or not (up to date = untouched, needs refresh = touched): {@link #isTouched()}
 *   <li>a collection of touched children of this propagator{@link #touchedFunctionAdapters} 
 *   </ul>
 * <li> offers a method, insuring that this Propagator become up to date: {@link #refresh()}; this entails
 *   <ul>
 *   <li>refreshing all antecedents ancestors: the parent, the parent's parent, ..., recursively
 *   <li>refreshing all antecedents siblings, antecedent's antecedents sibling, ... recursively 
 *   <li>refreshing all children
 *   <li>refreshing this Propagator (method  {@link #calculate()})
 *   </ul>
 * <li>listens to change notifications 
 *   <ul>
 *   <li>of this PropagatorFunctionAdapter's notifier by overriding see {@link #notifyChanged(Notification)}
 *   <li>of other Notifiers, by delegating to some extension of {@link PropagatorDependencyAdapter} 
 * </ul>
 * <li>declares  
 *   <ul>
 *   <li>a Parent {@link PropagatorFunctionAdapter}: method {@link #getParent()} 
 *   <li>a collection of siblings {@link PropagatorFunctionAdapter} it depends on {@link #getAntecedents()}
 *   </ul>
 * satisfying 
 *   <ul>
 *   <li>first the antecedents siblings will be refreshed</li> 
 *   <li>second the children will be refreshed
 *   <li>finally this propagator will be refreshed
 *   </ul>
 * </ul>
 * <p>
 * The PropagatorFunctionAdapter life cycle is as follows
 *   It is created by {@link ObjectWithPropagatorFunctionAdapter#addPropagatorFunctionAdapters}.
 *   The method addPropagatorFunctionAdapters is called by the {@link PropagatorFunctionAdapterManager} when the object is contained.
 *   The propagator is removed, when the object is no longer contained (if not touched) or by the method calculate (if it is touched)
 * @author michel
 */
public abstract class PropagatorFunctionAdapter extends PropagatorAbstractAdapter {
	
	// members
	private boolean isTouched = false;
	private boolean isActive = true;
	private PropagatorFunctionAdapter touchedParent = null;
	private PropagatorFunctionAdapter currentParent = null;
	protected PropagatorFunctionAdaptersSet touchedFunctionAdapters = new PropagatorFunctionAdaptersSet();
	
	private PropagatorFunctionAdapter getCurrentParent(){
		if ( this.currentParent==null){
			this.currentParent = this.getParent();
		}
		return this.currentParent;
	}
	
	public boolean isTouched() { 
		return this.isTouched; }
	
	protected boolean isTouchOnOwned() { return true; }
	
	protected boolean isTouchOnDispose() { return false; }

	/** 
	 * Returns the set of touched function adapters which are children of this adpater
	 */
	public PropagatorFunctionAdaptersSet getTouchedAdapters() {
		return this.touchedFunctionAdapters;
	}


	/**
	 * Declares the parent PropagatorFunctionAdapter
	 * To be overridden. Default implementation returns null
	 * @return
	 */
	protected PropagatorFunctionAdapter getParent(){
		return null;
	}
	
	/**
	 * Gets the sibling PropagatorFunctionAdapters that must be calculated before this
	 * To be overridden. Default implementation returns null
	 * @return
	 */
	protected PropagatorFunctionAdapters getAntecedents() {
		return new PropagatorFunctionAdaptersImpl();
	}
	

	/**
	 * Calculate the data the PropagatorFunctionAdapter is monitoring. 
	 * To be overridden.
	 * @return
	 */
	protected void calculate(){}



	// -------------------------------------------------------------------------------------
	// onowned-onunwoned ---------------------------------------------------------------
	// -------------------------------------------------------------------------------------
	public void onContained(Notifier newcontainer){
		this.refreshTouch();
	}
	
	public void onNotContained(Notifier oldcontainer){
		this.refreshTouch();
	}
	
	// -------------------------------------------------------------------------------------
	// touch management ------------------------------------------------------------------
	// -------------------------------------------------------------------------------------
	/**
	 * Manage the touched status of the FunctionAdapter
	 */
	
	public void resetTouched(){
		while ( !this.touchedFunctionAdapters.isEmpty()){
			PropagatorFunctionAdapter topofstack = this.touchedFunctionAdapters.iterator().next(); 
				topofstack.resetTouched();
		}
		this.untouch();
	}
	
	public void touch(){
		// already touched
		if ( this.isTouched ){ return; }
		
		if (!this.isActive) { return; }

		// is the resource loading?
		Notifier target = this.getTarget();
		if (!(target instanceof EObject)) { return; }
		
		Resource resource = ((EObject) target).eResource();
		if (resource == null) { return ; } // no resource means object under construction means not loading
		
		if (!(resource instanceof ResourceImpl) ) { return ; }
		
		ResourceImpl r = (ResourceImpl) resource;
					if (r.isLoading() ){
			return;
		}

		// if no parent, the touch is not done
		//   we want to keep track of the touched elements
		PropagatorFunctionAdapter parent = this.getCurrentParent();
		if ( parent == null ) { return; } 

		// ok, we touch
		CommonPlugin.INSTANCE.log( "Touched function: object "
		         + Util.LastTokenDotSeparated(this.target.getClass().getName())
		         + ", function "
		         + Util.LastTokenDotSeparated(this.getClass().getName()));
		super.touch();
		this.isTouched = true;
		parent.getTouchedAdapters().add(this);
		this.touchedParent = parent;
		parent.touch();
	}
	
	private void untouch(){
		if ( isTouched ){
			isTouched = false;
			/*
			CommonPlugin.INSTANCE.log( "Untouched function: object "
			         + Util.LastTokenDotSeparated(this.target.getClass().getName())
			         + ", function "
			         + Util.LastTokenDotSeparated(this.getClass().getName()));*/
			PropagatorFunctionAdapter parent = this.touchedParent;
			if ( parent != null ) { 
				parent.getTouchedAdapters().remove(this);
				this.touchedParent = null;
			}
		}
	}
	
	private void refreshTouch(){
		if ( this.isTouched ){
			PropagatorFunctionAdapter newparent = this.getCurrentParent();
			PropagatorFunctionAdapter oldparent = this.touchedParent;
			if ( newparent != oldparent){
				if ( oldparent != null){
					oldparent.getTouchedAdapters().remove(this);
				}
				if ( newparent != null){
					newparent.getTouchedAdapters().add(this);
				}
				this.touchedParent = newparent;
			}
		}
	}
	
	// -------------------------------------------------------------------------------------
	// refresh management ------------------------------------------------------------------
	// -------------------------------------------------------------------------------------

	/**
	 * Calculate this PropagatorFunctionAdapter
	 * Assume that all Parent antecedents are calculated, and that all childre are calculated
	 */
	private void refreshThis()
	{
		if ( this.isTouched ){
			EObject touchedObject = (EObject)this.getTarget();
			CommonPlugin.INSTANCE.log( "CalculateInternal function: object "
	                + com.misc.common.moplaf.propagator.Util.LastTokenDotSeparated(touchedObject.getClass().getName())
	                + ", function "
	                + com.misc.common.moplaf.propagator.Util.LastTokenDotSeparated(this.getClass().getName())
	                + ", objet "
	                + target.toString());
			this.calculate();
			this.untouch();
			if ( touchedObject.eContainer()==null && touchedObject.eResource()==null){
				// the object is no longer contained (has been disposed)
				// this PropagatorFunctionAdapter will no longer be used
				// dispose it
				touchedObject.eAdapters().remove(this);
			} 
		}
	}

	/**
	 * Refresh the PropagatorFunctionAdapter, so as is becomes untouched.
	 * Assume that all the parent's antecedents are refreshed.
	 * Propagate all the touched children and their antecedents.
	 * Calculate the PropagatorFunctionAdapter.
	 * @return
	 */
	boolean refreshChildrenAndThis()  {
	
		try{
		/*
		CommonPlugin.INSTANCE.log( "Propagate function: object "
	            + Util.LastTokenDotSeparated(this.getClass().getName())
	            + ", touched "
	            + (touchedFunctionAdapters==null ? 0 : touchedFunctionAdapters.size()));
	            */
			depthFistSearch(this.touchedFunctionAdapters);
		    // calculate this
			this.refreshThis();
		
			
		} catch (Exception e) {
			CommonPlugin.INSTANCE.log("propagate: exception caught: "+e.getMessage());
			for (StackTraceElement el : e.getStackTrace()) {
				CommonPlugin.INSTANCE.log("..: "+el.toString());
			}
			return false;
		}
		return true;
	}

	/**
	 * Refresh the Antecedents
	 * Do not assume that all the parent's antecedents are refreshed, but refresh them
	 * @return
	 */
	private boolean refreshAntecedents()  {
	
		/*
		CommonPlugin.INSTANCE.log( "PropagateAntecedents function: object "
	            + Util.LastTokenDotSeparated(this.getClass().getName())
	            + ", touched "
	            + (touchedFunctionAdapters==null ? 0 : touchedFunctionAdapters.size()));
	            */
	    PropagatorFunctionAdapter parent = this.getCurrentParent();
	    if ( parent instanceof PropagatorFunctionAdapter) {
	    	PropagatorFunctionAdapter parentaspropagatorfunctionadapter = (PropagatorFunctionAdapter)parent;
	    	if ( !parentaspropagatorfunctionadapter.refreshAntecedents() ){
	    		return false;
	    	}
	    }
		
		try {
			depthFistSearch(this);
		} catch (Exception e) {
			CommonPlugin.INSTANCE.log("propagateAntecedents: exception caught: "+e.getMessage());
			for (StackTraceElement el : e.getStackTrace()) {
				CommonPlugin.INSTANCE.log("..: "+el.toString());
			}
			return false;
		}
		return true;
	}
	
	/**
	 * Refresh the PropagatorFunctionAdapter, so as is becomes untouched.
	 * Make no assumption on the antecedents states or parent states
	 * Propagate minimally so that this PropagatorFunctionAdapter becomes up to date
	 * @return
	 */
	public boolean refresh()  {

		/*
		CommonPlugin.INSTANCE.log( "Refesh function: object "
                + Util.LastTokenDotSeparated(this.getClass().getName())
                + ", touched "
                + (touchedFunctionAdapters==null ? 0 : touchedFunctionAdapters.size()));
                */
		
		// refresh the parent's antecedents and antecedents of this FunctionAdapter
		if ( !this.refreshAntecedents()){
			return false;
		}
		
	    // refresh the children and this propagatorFunction
		if ( !refreshChildrenAndThis() ){
			return false;
		}

		return true;
	}

	// nested class 
	static class PropagatorFunctionAdaptersSet extends HashSet<PropagatorFunctionAdapter>{
		private static final long serialVersionUID = 1L;
	};
	// algorithms
	/**
	 * Construct the guarantee that parameter functionAdapter is up to date
	 */
	private static class DepthFirstSearchContext		{
		PropagatorFunctionAdaptersSet calculatedFunctionAdapters = new PropagatorFunctionAdaptersSet();
		PropagatorFunctionAdaptersSet reachedFunctionAdapters    = new PropagatorFunctionAdaptersSet();
	};

	private static void depthFirstSearch(DepthFirstSearchContext context, PropagatorFunctionAdapter functionAdapter) throws Exception{
		// the node is reached
		context.reachedFunctionAdapters.add(functionAdapter);
		List<PropagatorFunctionAdapter> antecedents = functionAdapter.getAntecedents();

		/*
		CommonPlugin.INSTANCE.log( "Propagate depth first search "
                + Util.LastTokenDotSeparated(functionAdapter.getClass().getName())
                + ", antecedents "
                + (antecedents==null ? 0 : antecedents.size()));
                */
		
		if ( antecedents!=null){
			for (PropagatorFunctionAdapter antecedent : antecedents){
				if ( context.reachedFunctionAdapters.contains(antecedent)){
					// node already visited
					if ( context.calculatedFunctionAdapters.contains(antecedent))	{
						// normal case, node may be ignored
						// this is a forward edge
						//   i.e. parallel to the call tree
					} else {
						// this is a backward edge (u,v)
						//   functionadapter is u
						//   antecedent is v
						// edge (u,v) means
						//    u depends on v
						// v is visited but not calculated
						//   u is the current node, top of call tree
						//   u is in the call tree of v
						//      v is somewhere in the tree, because visited (or reached)
						//      v is still in the call, because, not closed, because not calculated
						//   there is a path from v to u
						//      this is the call stack, from v to u (current top)
						//   this implies v depends on u
						// so there is a cycle, which is the call stack, from v to top
						// Improvement: remove the recursivity
						//   datastructure: 
						//      currentpath
						//         node in path: (functionadapter)
						//   note: I need the fields iscalculated and isreached for the nodes not in the path
						//      iscalculated means: has been in the path, is no more in the path
						//      isreached means: has been in the path, is possibly still in the path
						// with this improvement
						//   when backward edge is met
						//   then the top part of the path, as from the antecedent (which is in the path) is a cycle
						//   cycle should be logged, to help debugging
						throw new Exception("PropagatorLayerDependent.Propagate: circularity");
					}
				}
				else {
					// node not reached yet, go farther
				    depthFirstSearch(context, antecedent); // recursive
				}
			} // traverse the antecedents
		}
		// at this point, all the antecedents of functionadapter have been visited, that is, calculated
		if ( !functionAdapter.refreshChildrenAndThis() ){
			throw new Exception("PropagatorLayerDependent.Propagate: failed");
		}
		context.calculatedFunctionAdapters.add(functionAdapter);
	}
	
	public static void depthFistSearch(PropagatorFunctionAdapter functionAdapter) throws Exception{
		DepthFirstSearchContext depthFirstSearchContext = new DepthFirstSearchContext();
		// calculate the touched children
		// traverse the adapters following a topological order induced by the dependencies
		depthFirstSearch(depthFirstSearchContext, functionAdapter);
	}
	
	
	public static void depthFistSearch(PropagatorFunctionAdaptersSet touchedfunctionadapters) throws Exception{
		DepthFirstSearchContext depthFirstSearchContext = new DepthFirstSearchContext();
		// refresh the children
		// traverse the adapters following a topological order induced by the dependencies
		while ( !touchedfunctionadapters.isEmpty()){
			PropagatorFunctionAdapter topofstack = touchedfunctionadapters.iterator().next(); 
			//PropagatorFunctionAdapter topofstack = touchedFunctionAdapters.removeLast();
			if ( !topofstack.isTouched()){
				CommonPlugin.INSTANCE.log("propagate: error untouched adapter in touched adapters: ");
				touchedfunctionadapters.remove(topofstack);
			} else {
				depthFirstSearch(depthFirstSearchContext, topofstack);
			}
		} // while some touched adapters
	}
}
