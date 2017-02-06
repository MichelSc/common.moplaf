/**
 */
package com.misc.common.moplaf.propagator2.impl;

import com.misc.common.moplaf.propagator2.Bindings;
import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import com.misc.common.moplaf.propagator2.Plugin;
import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;
import com.misc.common.moplaf.propagator2.PropagatorFunctionSource;
import com.misc.common.moplaf.propagator2.PropagatorFunctionVisitor;
import com.misc.common.moplaf.propagator2.PropagatorPackage;
import com.misc.common.moplaf.propagator2.util.Util;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * @implements PropagatorFunctionSource
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl#getAntecedents <em>Antecedents</em>}</li>
 *   <li>{@link com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl#getAntecedentsSibling <em>Antecedents Sibling</em>}</li>
 *   <li>{@link com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl#isTouched <em>Touched</em>}</li>
 *   <li>{@link com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl#getTouchedChildren <em>Touched Children</em>}</li>
 *   <li>{@link com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl#getTouchers <em>Touchers</em>}</li>
 *   <li>{@link com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl#getObjectWithPropagatorFunctions <em>Object With Propagator Functions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl#getObject <em>Object</em>}</li>
 *   <li>{@link com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropagatorFunctionImpl extends MinimalEObjectImpl.Container implements PropagatorFunction, PropagatorFunctionSource {
	
	private Bindings bindings = null;
	/**
	 * The default value of the '{@link #isTouched() <em>Touched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTouched()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TOUCHED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTouched() <em>Touched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTouched()
	 * @generated
	 * @ordered
	 */
	protected boolean touched = TOUCHED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTouchedChildren() <em>Touched Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTouchedChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<PropagatorFunction> touchedChildren;

	/**
	 * The cached value of the '{@link #getTouchers() <em>Touchers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTouchers()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> touchers;

	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getInstance() <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropagatorPackage.Literals.PROPAGATOR_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorFunction getParent() {
		PropagatorFunction parent = basicGetParent();
		return parent != null && parent.eIsProxy() ? (PropagatorFunction)eResolveProxy((InternalEObject)parent) : parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public PropagatorFunction basicGetParent() {
		return this.doGetParent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	private void getAntecedents_prvt(EList<PropagatorFunction> antecedents, Predicate<PropagatorFunction> doCollect) {
		// explicit antecedents
		EList<PropagatorFunction> explicitAntecedents = this.doGetExplicitAntecedents();
		antecedents.addAll(explicitAntecedents);
		
		// bound sibling antecedents
		Bindings bindings = this.doGetBindings();
		if ( bindings!=null){
			ObjectWithPropagatorFunctions object = this.getObjectWithPropagatorFunctions();
			PropagatorFunctionBindings adapter = (PropagatorFunctionBindings) Util.getAdapter(object, this.getBindings());
			if ( adapter!=null) {
				// the adapter may not be present
				// in that case, there are no antecedents
				adapter.collectAntecedents(antecedents, doCollect);
			}
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<PropagatorFunction> getAntecedents() {
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		EList<PropagatorFunction> antecedents = new EObjectEList<PropagatorFunction>(PropagatorFunction.class, this, PropagatorPackage.PROPAGATOR_FUNCTION__ANTECEDENTS){

			@Override
			protected boolean isNotificationRequired() {
				return false;
			}
		};
		
		this.getAntecedents_prvt(antecedents, null);
		
		return antecedents;

	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<PropagatorFunction> getAntecedentsSibling() {
		class IsSiblingPredicate implements Predicate<PropagatorFunction>{

			@Override
			public boolean test(PropagatorFunction arg0) {
				return PropagatorFunctionImpl.this.getParent()==arg0.getParent();
			}
			
		}
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		EList<PropagatorFunction> antecedents = new EObjectEList<PropagatorFunction>(PropagatorFunction.class, this, PropagatorPackage.PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING){

			@Override
			protected boolean isNotificationRequired() {
				return false;
			}
		};
		
		this.getAntecedents_prvt(antecedents, new IsSiblingPredicate());
		
		return antecedents;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTouched() {
		return touched;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTouched(boolean newTouched) {
		boolean oldTouched = touched;
		touched = newTouched;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropagatorPackage.PROPAGATOR_FUNCTION__TOUCHED, oldTouched, touched));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropagatorFunction> getTouchedChildren() {
		if (touchedChildren == null) {
			touchedChildren = new EObjectResolvingEList<PropagatorFunction>(PropagatorFunction.class, this, PropagatorPackage.PROPAGATOR_FUNCTION__TOUCHED_CHILDREN);
		}
		return touchedChildren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getTouchers() {
		if (touchers == null) {
			touchers = new EObjectResolvingEList<EObject>(EObject.class, this, PropagatorPackage.PROPAGATOR_FUNCTION__TOUCHERS);
		}
		return touchers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropagatorPackage.PROPAGATOR_FUNCTION__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectWithPropagatorFunctions getObjectWithPropagatorFunctions() {
		if (eContainerFeatureID() != PropagatorPackage.PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS) return null;
		return (ObjectWithPropagatorFunctions)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectWithPropagatorFunctions(ObjectWithPropagatorFunctions newObjectWithPropagatorFunctions, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newObjectWithPropagatorFunctions, PropagatorPackage.PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectWithPropagatorFunctions(ObjectWithPropagatorFunctions newObjectWithPropagatorFunctions) {
		if (newObjectWithPropagatorFunctions != eInternalContainer() || (eContainerFeatureID() != PropagatorPackage.PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS && newObjectWithPropagatorFunctions != null)) {
			if (EcoreUtil.isAncestor(this, newObjectWithPropagatorFunctions))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newObjectWithPropagatorFunctions != null)
				msgs = ((InternalEObject)newObjectWithPropagatorFunctions).eInverseAdd(this, PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS, ObjectWithPropagatorFunctions.class, msgs);
			msgs = basicSetObjectWithPropagatorFunctions(newObjectWithPropagatorFunctions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropagatorPackage.PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS, newObjectWithPropagatorFunctions, newObjectWithPropagatorFunctions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getType() {
		String type = this.eClass().getName();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getObject() {
		String objectAsString = "null";
		ObjectWithPropagatorFunctions object = this.getObjectWithPropagatorFunctions();
		if ( object!=null){
			objectAsString = String.format("%s(%s)", object.eClass().getName(), this.getInstance());
		}
		return objectAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getInstance() {
		ObjectWithPropagatorFunctions object = this.getObjectWithPropagatorFunctions();
		if ( object == null ) { return "null"; }
		return String.format("%d", object.hashCode() % 1000 +1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String description = String.format("%s.%s", this.getObject(), this.getType());
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void touch(EObject toucher) {
//		if ( !this.isEnabled() ){
//			return ;
//		}
		
		if ( this.isTouched() ){
			// already touched
			if ( toucher==null ){ return; }
			// already touched by touchers
			// some (new) toucher
			this.getTouchers().add(toucher);
			return;
			}

		// ok we touch
		// touch this
		Plugin.INSTANCE.logTouch(this);
		this.setTouched(true);
		
		// touch parent, if any
		PropagatorFunction parent = this.getParent();
		if ( parent != null ) {
			parent.touch(null);
			parent.getTouchedChildren().add(this);
		}
		
		// toucher tracking
		if ( toucher==null){
			this.getTouchers().clear(); // touchers are not tracked any longer
		} else {
			this.getTouchers().add(toucher);
		}
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

	/**
	 * <!-- begin-user-doc -->
	 * Refresh the Antecedents
	 * Do not assume that all the parent's antecedents are refreshed, but refresh them
	 * @return false when an error occurred, propagator not refreshed
	 * <!-- end-user-doc -->
	 */
	public boolean refreshAntecedents() {
	    PropagatorFunctionImpl parent = (PropagatorFunctionImpl)this.getParent();
	    if ( parent != null) {
	    	if ( !parent.refreshAntecedents() ){
	    		return false;
	    	}
	    }
		
	    // attention
	    //   I want to refresh the antecedents of this
	    //   this itself should not be refreshed
		EList<PropagatorFunction>  antecedents = this.getAntecedentsSibling();
		if ( antecedents!=null){
			for (PropagatorFunction antecedent : antecedents){
				if ( !depthFirstSearch(antecedent) ) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Do the actual refresh of the Propagator function.
	 * Call the appropriate doRefresh method(s)
	 */
	protected void doRefreshImpl(){
		if ( this.getTouchers().isEmpty()) {
			this.doRefresh();
		} else {
			for ( EObject toucher : this.getTouchers()){
				this.doRefresh(toucher);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Calculate this PropagatorFunction
	 * Assume that all Parent antecedents are calculated, and that all children are calculated
	 * @return false when an error occurred, propagtor not refreshed
	 * <!-- end-user-doc -->
	 */
	public boolean refreshThis() {
		if ( this.isTouched() ){
			Plugin.INSTANCE.logCalc(this);
			
			this.doRefreshImpl();

			this.untouch();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Refresh the PropagatorFunction, so as is becomes untouched.
	 * Assume that all the parent's antecedents are refreshed.
	 * Propagate all the touched children and their antecedents.
	 * Calculate the PropagatorFunction.
	 * @return false when an error occurred, propagator not refreshed
	 * <!-- end-user-doc -->
	 */
	public boolean refreshChildrenAndThis() {
		if ( !depthFirstSearch(this.getTouchedChildren()) ) {
			return false;
		}
	    // calculate this
		if ( !this.refreshThis() ) {
			return false;
		}
		return true;
	}
	
	/**
	 * Reset touched state
	 */
	public void untouch(){
		if ( this.isTouched() ){
			this.setTouched(false);
			this.getTouchers().clear();
			PropagatorFunction parent = this.getParent();
			if ( parent != null ) { 
				parent.getTouchedChildren().remove(this);
			}
		}
	}
	


	/**
	 * <!-- begin-user-doc -->
	 * Default does nothing
	 * <!-- end-user-doc -->
	 */
	public PropagatorFunction doGetParent() {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Default returns empty list
	 * <!-- end-user-doc -->
	 */
	public EList<PropagatorFunction> doGetExplicitAntecedents() {
		return new BasicEList<PropagatorFunction>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Default does nothing
	 * <!-- end-user-doc -->
	 */
	public Bindings doGetBindings() {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * To be implemented by the concrete class. Defautl implementation does nothing
	 * <!-- end-user-doc -->
	 */
	public void doRefresh() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * To be implemented by the concrete class. Defautl implementation does nothing
	 * <!-- end-user-doc -->
	 */
	public void doRefresh(EObject toucher) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isPropagatorFunctionOfType(Object type) {
		if ( type instanceof Class<?>) {
			return  ((Class<?>)type).isInstance(this);
		} else if ( type instanceof String ) {
			return this.getType().equals((String)type);
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public PropagatorFunction getScope() {
		PropagatorFunction parent = this.getParent();
		if ( parent == null ) { 
			return this;
		} else {
			return parent.getScope();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PropagatorPackage.PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetObjectWithPropagatorFunctions((ObjectWithPropagatorFunctions)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PropagatorPackage.PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS:
				return basicSetObjectWithPropagatorFunctions(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PropagatorPackage.PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS:
				return eInternalContainer().eInverseRemove(this, PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS, ObjectWithPropagatorFunctions.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Default implementation touch
	 * <!-- end-user-doc -->
	 */
	public void onObjectOwned() {
		this.touch(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Default implementation does nothing
	 * <!-- end-user-doc -->
	 */
	public void onObjectDispose() {
	}

	
	private  Bindings getBindings(){ 
		if ( this.bindings == null ) {
			this.bindings = this.doGetBindings();
		}
		return this.bindings; }
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void enable() {
		Bindings bindings = this.getBindings();
		if ( bindings!=null){
			ObjectWithPropagatorFunctions object = this.getObjectWithPropagatorFunctions();
			
			PropagatorFunctionBindings adapter = (PropagatorFunctionBindings) Util.getAdapter(object, bindings);
			
			// create the dependency
			if ( adapter == null) {
				adapter = new PropagatorFunctionBindings(bindings);
				object.eAdapters().add(adapter);
			}
			
			// add this adapter as source to the new one
			adapter.addSource(this);
	
			// activate the dependency
			adapter.initDependencies();
		}
		
		this.enabled = true;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void disable() {
		this.enabled = false;

		// unregister
		Bindings bindings = this.getBindings();
		if ( bindings!=null){
			ObjectWithPropagatorFunctions object = this.getObjectWithPropagatorFunctions();
		
			PropagatorFunctionBindings adapter = (PropagatorFunctionBindings) Util.getAdapter(object, bindings);
		
			// create the dependency
			if ( adapter != null) {
				// dactivate the dependency
				adapter.disposeDependencies();
			
				// add this adapter as source to the new one
				adapter.removeSource(this);
	
				if ( adapter.sourcesSetEmpty()){
					object.eAdapters().remove(adapter);
				}
			}
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PropagatorPackage.PROPAGATOR_FUNCTION__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case PropagatorPackage.PROPAGATOR_FUNCTION__ANTECEDENTS:
				return getAntecedents();
			case PropagatorPackage.PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING:
				return getAntecedentsSibling();
			case PropagatorPackage.PROPAGATOR_FUNCTION__TOUCHED:
				return isTouched();
			case PropagatorPackage.PROPAGATOR_FUNCTION__TOUCHED_CHILDREN:
				return getTouchedChildren();
			case PropagatorPackage.PROPAGATOR_FUNCTION__TOUCHERS:
				return getTouchers();
			case PropagatorPackage.PROPAGATOR_FUNCTION__ENABLED:
				return isEnabled();
			case PropagatorPackage.PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS:
				return getObjectWithPropagatorFunctions();
			case PropagatorPackage.PROPAGATOR_FUNCTION__TYPE:
				return getType();
			case PropagatorPackage.PROPAGATOR_FUNCTION__OBJECT:
				return getObject();
			case PropagatorPackage.PROPAGATOR_FUNCTION__INSTANCE:
				return getInstance();
			case PropagatorPackage.PROPAGATOR_FUNCTION__DESCRIPTION:
				return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PropagatorPackage.PROPAGATOR_FUNCTION__TOUCHED:
				setTouched((Boolean)newValue);
				return;
			case PropagatorPackage.PROPAGATOR_FUNCTION__TOUCHED_CHILDREN:
				getTouchedChildren().clear();
				getTouchedChildren().addAll((Collection<? extends PropagatorFunction>)newValue);
				return;
			case PropagatorPackage.PROPAGATOR_FUNCTION__TOUCHERS:
				getTouchers().clear();
				getTouchers().addAll((Collection<? extends EObject>)newValue);
				return;
			case PropagatorPackage.PROPAGATOR_FUNCTION__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case PropagatorPackage.PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS:
				setObjectWithPropagatorFunctions((ObjectWithPropagatorFunctions)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PropagatorPackage.PROPAGATOR_FUNCTION__TOUCHED:
				setTouched(TOUCHED_EDEFAULT);
				return;
			case PropagatorPackage.PROPAGATOR_FUNCTION__TOUCHED_CHILDREN:
				getTouchedChildren().clear();
				return;
			case PropagatorPackage.PROPAGATOR_FUNCTION__TOUCHERS:
				getTouchers().clear();
				return;
			case PropagatorPackage.PROPAGATOR_FUNCTION__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case PropagatorPackage.PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS:
				setObjectWithPropagatorFunctions((ObjectWithPropagatorFunctions)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PropagatorPackage.PROPAGATOR_FUNCTION__PARENT:
				return basicGetParent() != null;
			case PropagatorPackage.PROPAGATOR_FUNCTION__ANTECEDENTS:
				return !getAntecedents().isEmpty();
			case PropagatorPackage.PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING:
				return !getAntecedentsSibling().isEmpty();
			case PropagatorPackage.PROPAGATOR_FUNCTION__TOUCHED:
				return touched != TOUCHED_EDEFAULT;
			case PropagatorPackage.PROPAGATOR_FUNCTION__TOUCHED_CHILDREN:
				return touchedChildren != null && !touchedChildren.isEmpty();
			case PropagatorPackage.PROPAGATOR_FUNCTION__TOUCHERS:
				return touchers != null && !touchers.isEmpty();
			case PropagatorPackage.PROPAGATOR_FUNCTION__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case PropagatorPackage.PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS:
				return getObjectWithPropagatorFunctions() != null;
			case PropagatorPackage.PROPAGATOR_FUNCTION__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case PropagatorPackage.PROPAGATOR_FUNCTION__OBJECT:
				return OBJECT_EDEFAULT == null ? getObject() != null : !OBJECT_EDEFAULT.equals(getObject());
			case PropagatorPackage.PROPAGATOR_FUNCTION__INSTANCE:
				return INSTANCE_EDEFAULT == null ? getInstance() != null : !INSTANCE_EDEFAULT.equals(getInstance());
			case PropagatorPackage.PROPAGATOR_FUNCTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PropagatorPackage.PROPAGATOR_FUNCTION___ENABLE:
				enable();
				return null;
			case PropagatorPackage.PROPAGATOR_FUNCTION___DISABLE:
				disable();
				return null;
			case PropagatorPackage.PROPAGATOR_FUNCTION___TOUCH__EOBJECT:
				touch((EObject)arguments.get(0));
				return null;
			case PropagatorPackage.PROPAGATOR_FUNCTION___UNTOUCH:
				untouch();
				return null;
			case PropagatorPackage.PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS:
				return refreshAntecedents();
			case PropagatorPackage.PROPAGATOR_FUNCTION___REFRESH_THIS:
				return refreshThis();
			case PropagatorPackage.PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS:
				return refreshChildrenAndThis();
			case PropagatorPackage.PROPAGATOR_FUNCTION___REFRESH:
				return refresh();
			case PropagatorPackage.PROPAGATOR_FUNCTION___DO_GET_PARENT:
				return doGetParent();
			case PropagatorPackage.PROPAGATOR_FUNCTION___DO_GET_EXPLICIT_ANTECEDENTS:
				return doGetExplicitAntecedents();
			case PropagatorPackage.PROPAGATOR_FUNCTION___DO_GET_BINDINGS:
				return doGetBindings();
			case PropagatorPackage.PROPAGATOR_FUNCTION___DO_REFRESH:
				doRefresh();
				return null;
			case PropagatorPackage.PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT:
				doRefresh((EObject)arguments.get(0));
				return null;
			case PropagatorPackage.PROPAGATOR_FUNCTION___GET_SCOPE:
				return getScope();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Touched: ");
		result.append(touched);
		result.append(", Enabled: ");
		result.append(enabled);
		result.append(')');
		return result.toString();
	}

	@Override
	public void accept(PropagatorFunctionVisitor visitor) {
		visitor.visitPropagatorFunction(this);
	}
	
	// 
	// propagation logic
	//

	// set of PropagatorFunctionAdapters 
	static class PropagatorFunctionsSet extends HashSet<PropagatorFunction>{
		private static final long serialVersionUID = 1L;
	};
	// algorithms
	/**
	 * Construct the guarantee that parameter functionAdapter is up to date
	 */
	private static class DepthFirstSearchContext		{
		PropagatorFunctionsSet calculatedFunctionAdapters = new PropagatorFunctionsSet();
		PropagatorFunctionsSet reachedFunctionAdapters    = new PropagatorFunctionsSet();
	};

	/**
	 * Visit PropagatorFunction antecedents, the antecedents of this latter, and so on recursively. Insure all
	 * of them are refreshed. Then refresh functionAdapter
	 * @return false when an error occurred, propagator not refreshed
	 */
	private static boolean depthFirstSearch(DepthFirstSearchContext context, PropagatorFunction propagatorFunction) {
		// the node is reached
		context.reachedFunctionAdapters.add(propagatorFunction);
		EList<PropagatorFunction>  antecedents = propagatorFunction.getAntecedentsSibling();

		//this.logMessage("Visited, not refreshed");

		if ( antecedents!=null){
			for (PropagatorFunction antecedent : antecedents){
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
						
						Plugin.INSTANCE.logError("function revisited=cycle", antecedent);
						return false;
					}
				}
				else {
					// node not reached yet, go farther
				    if ( !depthFirstSearch(context, antecedent) ){
						Plugin.INSTANCE.logError("antecedents not traversed", antecedent);
				    	return false;
				    }; // recursive
				}
			} // traverse the antecedents
		}
		// at this point, all the antecedents of functionadapter have been visited, that is, calculated
		if ( !propagatorFunction.refreshChildrenAndThis() ){
			Plugin.INSTANCE.logError("this function not refreshed", propagatorFunction);
			return false;
		}
		context.calculatedFunctionAdapters.add(propagatorFunction);
		return true;
	}
	
	/**
	 * Start a depth first traversal of the antecedents and refresh every node visited, with as initial 
	 * node functionAdapter
	 * @return false when an error occurred, propagator not refreshed
	 */
	public static boolean depthFirstSearch(PropagatorFunction propagatorFunction) {
		DepthFirstSearchContext depthFirstSearchContext = new DepthFirstSearchContext();
		// calculate the touched children
		// traverse the adapters following a topological order induced by the dependencies
		if ( !depthFirstSearch(depthFirstSearchContext, propagatorFunction) ){
//			propagatorFunction.logError("this function not calculated");
			return false;
		}
		return true;
	}
	
	
	/**
	 * Start a depth first traversal of the antecedents and refresh every node visited, with as initial 
	 * nodes every node in the collection touchedfunctionadapter
	 * @return false when an error occurred, propagator not refreshed
	 */
	public static boolean depthFirstSearch(EList<PropagatorFunction> touchedPropagatorFunctions) {
		DepthFirstSearchContext depthFirstSearchContext = new DepthFirstSearchContext();
		// refresh the children
		// traverse the adapters following a topological order induced by the dependencies
		while ( !touchedPropagatorFunctions.isEmpty()){
			PropagatorFunction topofstack = touchedPropagatorFunctions.iterator().next(); 
			//PropagatorFunctionAdapter topofstack = touchedFunctionAdapters.removeLast();
			if ( !topofstack.isTouched()){
				Plugin.INSTANCE.logError("untouched adapter in touched adapters", topofstack);
				touchedPropagatorFunctions.remove(topofstack);
			} else {
				if (!depthFirstSearch(depthFirstSearchContext, topofstack)) {
					Plugin.INSTANCE.logError("this function not calculated", topofstack);
					return false;
				}
			}
		} // while some touched adapters
		return true;
	}
} //PropagatorFunctionImpl
