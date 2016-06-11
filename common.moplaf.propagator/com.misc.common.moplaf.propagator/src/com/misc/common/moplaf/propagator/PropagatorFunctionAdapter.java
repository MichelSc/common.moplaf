package com.misc.common.moplaf.propagator;


import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;




/**
 * <p>
 * Manage the refresh of derived data elements by listening to changes, 
 * remembering when out of date, and declaring data elements this data element depends on.
 * <p>
 * A PropagatorFunctionAdapter: 
 * <ul>
 * <li>offers two call-backs methods that may be overridden
 * by the concrete PropagatorFunctionAdapter in order to implement the refresh logic for the derived elements
 * this adapter is responsible for; the whole purpose of the present framework is to call one of these methods 
 * exactly when needed:
 *   <ul>
 *   <li>{@link #calculate()}, that will be called when no touching Notifier has been tracked
 *   <li>{@link #calculate(Object)}, that will be called for every touching Notifier that has been tracked, if any 
 *   </ul>
 * <li>maintains its touched state 
 *   <ul>
 *   <li>whether this propagator is up to date or not (up to date = untouched, needs refresh = touched): accessor {@link #isTouched()}
 *   <li>a collection of touched children of this propagator: field {@link #touchedFunctionAdapters} 
 *   <li>a collection of Notifier's responsible for the touching: field {@link #touchers} 
 *   </ul>
 * <li> offers a method, insuring that this Propagator become up to date: method {@link #refresh()}; this entails
 *   <ul>
 *   <li>refreshing all antecedents ancestors: the parent, the parent's parent, ..., recursively
 *   <li>refreshing all antecedents siblings, antecedent's antecedents sibling, ... recursively 
 *   <li>refreshing all children
 *   <li>refreshing this Propagator: method  {@link #calculate()}
 *   </ul>
 * <li>listens to changes
 *   <ul>
 *   <li>of this PropagatorFunctionAdapter's notifier by accepting inbound bindings see {@link PropagatorAbstractAdapter}
 *   <li>of other navigated to Notifiers, by delegating to some extension of {@link PropagatorDependencyAdapter}, which will
 *   accept inbound bindings for the features in the navigated to object. 
 *   </ul>
 * <li>retrieve the direct antecedents of this PropagatorFunctionAdapter: the collection of PropagatorFunctionAdapters that need
 * to be proven up to date in order to update this adapter; this collection is calculated by traversing all the inbound bindings
 * of this PropagatorFunctionAdapter and by looking up other PropagatorFunctionAdapters (out) bound to the (in) bound features.
 *   <ul>
 *   <li>see {@link #getAllAntecedents()}: return all the direct antecedents
 *   <li>see {@link #getAntecedents()}: return the direct antecedents that are sibblings of this PropagatorFunctionAdapters
 *   </ul>
 * <li>declares  
 *   <ul>
 *   <li>a Parent {@link PropagatorFunctionAdapter}: accessor {@link #getParent()} 
 *   <li>a collection of siblings {@link PropagatorFunctionAdapter} it depends on: accessor {@link #getAntecedents()}
 *   </ul>
 * satisfying 
 *   <ul>
 *   <li>first the antecedents siblings will be refreshed</li> 
 *   <li>second the children will be refreshed
 *   <li>finally this propagator will be refreshed
 *   </ul>
 * </ul>
 * <p>
 * The {@link PropagatorFunctionAdapter} life cycle is as follows
 * <ul>
 *   <li>It is created by {@link ObjectWithPropagatorFunctionAdapter#addPropagatorFunctionAdapter()}, called by the method {@link PropagatorFunctionAdapterManager#onAdapterAdded}</li>
 *   <ul>
 *     <li>either when the object is contained</li>
 *     <li>or when the {@link PropagatorFunctionAdapterManager} is added to the scope of the propagation</li>
 *   </ul>
 *   <li>The propagator is removed by the method {@link PropagatorFunctionAdapterManager#onAdapterRemoved} </li>
 *   <ul>
 *     <li>either when the object is no longer contained</li>
 *     <li>or when the {@link PropagatorFunctionAdapterManager} is removed from the scope of the propagation</li>
 *   </ul>
 *   <li>The propagator removal will be delayed when touched, to the  {@link #untouch()} </li>
 *   <li>When a {@link PropagatorFunctionAdapter} is added, following methods are called to initialize it</li>
 *   <ul>
 *     <li>method {@link PropagatorAbstractAdapter#addPropagatorFunctionAdapters}</li>
 *     <li>method {@link PropagatorFunctionAdapter#refreshParent} </li>
 *   </ul>
 *   <li>The Parent of the a PropagatorFunctionAdapter is supposed to be available when the propagator is enabled
 *   (typically when the propagator is owned), and is
 *   supposed never change. Touches are lost with ownership.</li>
 * </ul>
 *   
 *   
 * @author michel
 */
public abstract class PropagatorFunctionAdapter extends PropagatorAbstractAdapter {
	
	// set of PropagatorFunctionAdapters 
	static class PropagatorFunctionAdaptersSet extends HashSet<PropagatorFunctionAdapter>{
		private static final long serialVersionUID = 1L;
	};
	// set of origins 
	static class TouchersSet extends HashSet<Object>{
		private static final long serialVersionUID = 2L;
	};
	
	// members
	private boolean isTouched = false;
	private PropagatorFunctionAdapter touchedParent = null;
	private TouchersSet touchers = null;
	private PropagatorFunctionAdaptersSet touchedFunctionAdapters = new PropagatorFunctionAdaptersSet();
	private PropagatorFunctionAdapter currentParent = null;
	private boolean isEnabled = false;
	
	public boolean isTouched() { 
		return  this.isTouched;
	}
	
	protected boolean isTouchOnOwned() { return true; }
	
	protected boolean isTouchOnDispose() { return false; }
	
	public void enable(){
		this.isEnabled = true;
		this.currentParent = this.getParent();
		this.addDependencyAdapters();
		if ( this.currentParent == null ){
			Plugin.INSTANCE.logError("No parent", this);
		}
	}
	
	public void disable(){
		this.removeDependencyAdapters();
		this.isEnabled = false;
	}

	/*
	protected boolean isActive(){
		// is the resource loading?
		Notifier target = this.getTarget();
		if (!(target instanceof EObject)) { return false; }
		
		EObject targetObject  = (EObject) target; 
		Resource resource = targetObject.eResource();

		if ( resource instanceof ResourceImpl) {
			ResourceImpl r = (ResourceImpl) resource;
			if (r.isLoading() ){ return false; }
		}

		if ( targetObject.eContainer()==null && resource == null ){
			// no resource means object under construction means not loading
			return false;
		}
		
		// this is  normal object in a normal resource, which is not loading
		// so we are active
		return true;
	}
		*/

	/** 
	 * Returns the set of touched function adapters which are children of this adpater
	 */
	public PropagatorFunctionAdaptersSet getTouchedAdapters() {
		return this.touchedFunctionAdapters;
	}
	
	/** 
	 * Returns the set of touchers 
	 */
	private TouchersSet getOrCreateTouchers() {
		if ( this.touchers==null) { 
			this.touchers = new TouchersSet();
		}
		return this.touchers;
	}
	
	/**
	 * Declares the parent PropagatorFunctionAdapter
	 * To be overridden. Default implementation returns null
	 * @return the parent of this propagator
	 */
	protected PropagatorFunctionAdapter getParent(){
		return null;
	}
	
	/**
	 * Gets the sibling PropagatorFunctionAdapters that must be calculated before this
	 * To be overridden. Default implementation returns null
	 * @return the sibling propagators this propagator depends directly on.
	 */
	protected PropagatorFunctionAdapters getAntecedents() {
		PropagatorFunctionAdapters antecedents = this.getAllAntecedents();
		// remove the non sibblings
		Iterator<PropagatorFunctionAdapter> iterator = antecedents.iterator();
		while ( iterator.hasNext() ){
			PropagatorFunctionAdapter antecedent = iterator.next();
			boolean sibbling = antecedent.getParent()==this.getParent();
			if ( !sibbling){
				iterator.remove();
			}
		}
		return antecedents;
	}
	
	/**
	 * Gets all PropagatorFunctionAdapters that must be calculated before this.
	 * Traverse all the features this propagator depends on. For every feature,
	 * queries the propagators responsible for setting it (if any) and collect them.
	 * @return the propagators this propagator depends directly on.
	 */
	protected PropagatorFunctionAdapters getAllAntecedents() {
		PropagatorFunctionAdapters antecedents = new PropagatorFunctionAdaptersImpl();
		this.collectAntecedents(antecedents);
		return antecedents;
	}
	

	/**
	 * The only PropagatorFunctionAdapter depending on a PropagatorFuctionAdapter is itself.
	 * So collect it self. 
	 */
	@Override
	protected void collectDependingPropagatorFunctionAdapters(PropagatorFunctionAdapters adapters) {
		adapters.add(this);
	}

	/**
	 * Calculate the data the PropagatorFunctionAdapter is monitoring. 
	 * To be overridden.
	 */
	protected void calculate(){}

	/**
	 * Calculate the data the PropagatorFunctionAdapter is monitoring, passing a toucher 
	 * To be overridden.
	 */
	protected void calculate(Object toucher){}

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
		this.touch(null);
		
	}
	
	public void touch(Object toucher){
		if ( !this.isEnabled ){
			return ;
		}
		
		if ( this.isTouched ){
			// already touched
			if ( this.touchers==null ) { return; };
			if ( toucher==null ){ return; }
			// already touched by touchers
			// some (new) toucher
			this.touchers.add(toucher);
			return;
			}

		// ok we touch
		super.touch(toucher);
		Plugin.INSTANCE.logTouch(this);

		// touch parent, if any
		PropagatorFunctionAdapter parent = this.currentParent;
		if ( parent != null ) {
			this.touchedParent = parent;
			parent.touch();
			parent.getTouchedAdapters().add(this);
		}
		
		// touch this
		this.isTouched = true;
		
		// toucher tracking
		if ( toucher==null){
			this.touchers = null; // touchers are not tracked any longer
		} else {
			this.getOrCreateTouchers().add(toucher);
		}
	}
	
	private void untouch(){
		if ( isTouched ){
			this.isTouched = false;
			this.touchers = null;
			PropagatorFunctionAdapter parent = this.touchedParent;
			if ( parent != null ) { 
				parent.getTouchedAdapters().remove(this);
				this.touchedParent = null;
			}
		}
	}
	
	private void refreshTouch(){
		this.logError("PropagatorFuntionAdapter.refreshTouch: no longer supported, touches are lost when parent changes");
		if ( this.isTouched ){
			PropagatorFunctionAdapter newparent = this.currentParent;
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
	 * Assume that all Parent antecedents are calculated, and that all children are calculated
	 * @return false when an error occurred, propagtor not refreshed
	 */
	private boolean refreshThis()
	{
		if ( this.isTouched ){
			EObject touchedObject = (EObject)this.getTarget();
			Plugin.INSTANCE.logCalc(this);
			if ( this.touchers==null) {
				this.calculate();
			} else {
				for ( Object toucher : this.touchers){
					this.calculate(toucher);
				}
			}
			this.untouch();
			if ( touchedObject.eContainer()==null && touchedObject.eResource()==null){
				// the object is no longer contained (has been disposed)
				// this PropagatorFunctionAdapter will no longer be used
				// dispose it
				touchedObject.eAdapters().remove(this);
			} 
		}
		return true;
	}

	/**
	 * Refresh the PropagatorFunctionAdapter, so as is becomes untouched.
	 * Assume that all the parent's antecedents are refreshed.
	 * Propagate all the touched children and their antecedents.
	 * Calculate the PropagatorFunctionAdapter.
	 * @return false when an error occurred, propagator not refreshed
	 */
	boolean refreshChildrenAndThis()  {
	
		if ( !depthFirstSearch(this.touchedFunctionAdapters) ) {
			return false;
		}
	    // calculate this
		if ( !this.refreshThis() ) {
			return false;
		}
		return true;
	}

	/**
	 * Refresh the Antecedents
	 * Do not assume that all the parent's antecedents are refreshed, but refresh them
	 * @return false when an error occurred, propagator not refreshed
	 */
	private boolean refreshAntecedents()  {
	
	    PropagatorFunctionAdapter parent = this.currentParent;
	    if ( parent instanceof PropagatorFunctionAdapter) {
	    	PropagatorFunctionAdapter parentaspropagatorfunctionadapter = (PropagatorFunctionAdapter)parent;
	    	if ( !parentaspropagatorfunctionadapter.refreshAntecedents() ){
	    		return false;
	    	}
	    }
		
		if ( !depthFirstSearch(this) ) {
			return false;
		}
		return true;
	}
	
	/**
	 * Refresh the PropagatorFunctionAdapter, so as is becomes untouched.
	 * Make no assumption on the antecedents states or parent states
	 * Propagate minimally so that this PropagatorFunctionAdapter becomes up to date
	 * @return false when an error occurred, propagator not refreshed
	 */
	public boolean refresh()  {

		
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

	// algorithms
	/**
	 * Construct the guarantee that parameter functionAdapter is up to date
	 */
	private static class DepthFirstSearchContext		{
		PropagatorFunctionAdaptersSet calculatedFunctionAdapters = new PropagatorFunctionAdaptersSet();
		PropagatorFunctionAdaptersSet reachedFunctionAdapters    = new PropagatorFunctionAdaptersSet();
	};

	/**
	 * Visit functionAdapter antecedents, the antecedents of this latter, and so on recursively. Insure all
	 * of them are refreshed. Then refresh functionAdapter
	 * @return false when an error occurred, propagator not refreshed
	 */
	private static boolean depthFirstSearch(DepthFirstSearchContext context, PropagatorFunctionAdapter functionAdapter) {
		// the node is reached
		context.reachedFunctionAdapters.add(functionAdapter);
		List<PropagatorFunctionAdapter> antecedents = functionAdapter.getAntecedents();

		//this.logMessage("Visited, not refreshed");

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
						//   this functionadapter is u
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
						
						antecedent.logError("function revisited=cycle");
						return false;
					}
				}
				else {
					// node not reached yet, go farther
				    if ( !depthFirstSearch(context, antecedent) ){
						antecedent.logError("antecedents not traversed");
				    	return false;
				    }; // recursive
				}
			} // traverse the antecedents
		}
		// at this point, all the antecedents of functionadapter have been visited, that is, calculated
		if ( !functionAdapter.refreshChildrenAndThis() ){
			functionAdapter.logError("this function not refreshed");
			return false;
		}
		context.calculatedFunctionAdapters.add(functionAdapter);
		return true;
	}
	
	/**
	 * Start a depth first traversal of the antecedents and refresh every node visited, with as initial 
	 * node functionAdapter
	 * @return false when an error occurred, propagator not refreshed
	 */
	public static boolean depthFirstSearch(PropagatorFunctionAdapter functionAdapter) {
		DepthFirstSearchContext depthFirstSearchContext = new DepthFirstSearchContext();
		// calculate the touched children
		// traverse the adapters following a topological order induced by the dependencies
		if ( !depthFirstSearch(depthFirstSearchContext, functionAdapter) ){
			functionAdapter.logError("this function not calculated");
			return false;
		}
		return true;
	}
	
	
	/**
	 * Start a depth first traversal of the antecedents and refresh every node visited, with as initial 
	 * nodes every node in the collection touchedfunctionadapter
	 * @return false when an error occurred, propagator not refreshed
	 */
	public static boolean depthFirstSearch(PropagatorFunctionAdaptersSet touchedfunctionadapters) {
		DepthFirstSearchContext depthFirstSearchContext = new DepthFirstSearchContext();
		// refresh the children
		// traverse the adapters following a topological order induced by the dependencies
		while ( !touchedfunctionadapters.isEmpty()){
			PropagatorFunctionAdapter topofstack = touchedfunctionadapters.iterator().next(); 
			//PropagatorFunctionAdapter topofstack = touchedFunctionAdapters.removeLast();
			if ( !topofstack.isTouched()){
				topofstack.logWarning("untouched adapter in touched adapters: ");
				touchedfunctionadapters.remove(topofstack);
			} else {
				if (!depthFirstSearch(depthFirstSearchContext, topofstack)) {
					topofstack.logError("this function not calculated");
					return false;
				}
			}
		} // while some touched adapters
		return true;
	}
}
