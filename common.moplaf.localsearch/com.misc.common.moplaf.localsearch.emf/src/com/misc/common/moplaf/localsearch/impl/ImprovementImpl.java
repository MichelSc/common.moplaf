/**
 */
package com.misc.common.moplaf.localsearch.impl;

import com.misc.common.moplaf.localsearch.Action;
import com.misc.common.moplaf.localsearch.Improvement;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Solution;
import com.misc.common.moplaf.localsearch.Strategy;
import com.misc.common.moplaf.propagator2.Plugin;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Improvement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovementImpl#getMaxIterations <em>Max Iterations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovementImpl#getMaxSeconds <em>Max Seconds</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovementImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovementImpl#getSolution <em>Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovementImpl#getImprovmentsStart <em>Improvments Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovementImpl#getImprovmentsEnd <em>Improvments End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovementImpl#getIterations <em>Iterations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovementImpl#getDurationTotal <em>Duration Total</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovementImpl#getDurationAverage <em>Duration Average</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovementImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovementImpl#getCurrentActionNr <em>Current Action Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovementImpl#getStrategy <em>Strategy</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ImprovementImpl extends MinimalEObjectImpl.Container implements Improvement {
	/**
	 * The default value of the '{@link #getMaxIterations() <em>Max Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxIterations()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ITERATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxIterations() <em>Max Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxIterations()
	 * @generated
	 * @ordered
	 */
	protected int maxIterations = MAX_ITERATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSeconds() <em>Max Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_SECONDS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxSeconds() <em>Max Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSeconds()
	 * @generated
	 * @ordered
	 */
	protected float maxSeconds = MAX_SECONDS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getSolution() <em>Solution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolution()
	 * @generated
	 * @ordered
	 */
	protected Solution solution;

	/**
	 * The default value of the '{@link #getImprovmentsStart() <em>Improvments Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImprovmentsStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date IMPROVMENTS_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImprovmentsStart() <em>Improvments Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImprovmentsStart()
	 * @generated
	 * @ordered
	 */
	protected Date improvmentsStart = IMPROVMENTS_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getImprovmentsEnd() <em>Improvments End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImprovmentsEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date IMPROVMENTS_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImprovmentsEnd() <em>Improvments End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImprovmentsEnd()
	 * @generated
	 * @ordered
	 */
	protected Date improvmentsEnd = IMPROVMENTS_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getIterations() <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterations()
	 * @generated
	 * @ordered
	 */
	protected static final int ITERATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIterations() <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterations()
	 * @generated
	 * @ordered
	 */
	protected int iterations = ITERATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDurationTotal() <em>Duration Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationTotal()
	 * @generated
	 * @ordered
	 */
	protected static final float DURATION_TOTAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDurationTotal() <em>Duration Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationTotal()
	 * @generated
	 * @ordered
	 */
	protected float durationTotal = DURATION_TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDurationAverage() <em>Duration Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationAverage()
	 * @generated
	 * @ordered
	 */
	protected static final float DURATION_AVERAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDurationAverage() <em>Duration Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationAverage()
	 * @generated
	 * @ordered
	 */
	protected float durationAverage = DURATION_AVERAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentActionNr() <em>Current Action Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentActionNr()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_ACTION_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrentActionNr() <em>Current Action Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentActionNr()
	 * @generated
	 * @ordered
	 */
	protected int currentActionNr = CURRENT_ACTION_NR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImprovementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocalSearchPackage.Literals.IMPROVEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxIterations() {
		return maxIterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxIterations(int newMaxIterations) {
		int oldMaxIterations = maxIterations;
		maxIterations = newMaxIterations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.IMPROVEMENT__MAX_ITERATIONS, oldMaxIterations, maxIterations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxSeconds() {
		return maxSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSeconds(float newMaxSeconds) {
		float oldMaxSeconds = maxSeconds;
		maxSeconds = newMaxSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.IMPROVEMENT__MAX_SECONDS, oldMaxSeconds, maxSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentWithInverseEList<Action>(Action.class, this, LocalSearchPackage.IMPROVEMENT__ACTIONS, LocalSearchPackage.ACTION__IMPROVEMENT);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution getSolution() {
		if (solution != null && solution.eIsProxy()) {
			InternalEObject oldSolution = (InternalEObject)solution;
			solution = (Solution)eResolveProxy(oldSolution);
			if (solution != oldSolution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocalSearchPackage.IMPROVEMENT__SOLUTION, oldSolution, solution));
			}
		}
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution basicGetSolution() {
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolution(Solution newSolution) {
		Solution oldSolution = solution;
		solution = newSolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.IMPROVEMENT__SOLUTION, oldSolution, solution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getImprovmentsStart() {
		return improvmentsStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImprovmentsStart(Date newImprovmentsStart) {
		Date oldImprovmentsStart = improvmentsStart;
		improvmentsStart = newImprovmentsStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.IMPROVEMENT__IMPROVMENTS_START, oldImprovmentsStart, improvmentsStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getImprovmentsEnd() {
		return improvmentsEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImprovmentsEnd(Date newImprovmentsEnd) {
		Date oldImprovmentsEnd = improvmentsEnd;
		improvmentsEnd = newImprovmentsEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.IMPROVEMENT__IMPROVMENTS_END, oldImprovmentsEnd, improvmentsEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIterations() {
		return iterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterations(int newIterations) {
		int oldIterations = iterations;
		iterations = newIterations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.IMPROVEMENT__ITERATIONS, oldIterations, iterations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDurationTotal() {
		return durationTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationTotal(float newDurationTotal) {
		float oldDurationTotal = durationTotal;
		durationTotal = newDurationTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.IMPROVEMENT__DURATION_TOTAL, oldDurationTotal, durationTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDurationAverage() {
		return durationAverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationAverage(float newDurationAverage) {
		float oldDurationAverage = durationAverage;
		durationAverage = newDurationAverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.IMPROVEMENT__DURATION_AVERAGE, oldDurationAverage, durationAverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.IMPROVEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurrentActionNr() {
		return currentActionNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentActionNr(int newCurrentActionNr) {
		int oldCurrentActionNr = currentActionNr;
		currentActionNr = newCurrentActionNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.IMPROVEMENT__CURRENT_ACTION_NR, oldCurrentActionNr, currentActionNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strategy getStrategy() {
		if (eContainerFeatureID() != LocalSearchPackage.IMPROVEMENT__STRATEGY) return null;
		return (Strategy)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrategy(Strategy newStrategy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStrategy, LocalSearchPackage.IMPROVEMENT__STRATEGY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategy(Strategy newStrategy) {
		if (newStrategy != eInternalContainer() || (eContainerFeatureID() != LocalSearchPackage.IMPROVEMENT__STRATEGY && newStrategy != null)) {
			if (EcoreUtil.isAncestor(this, newStrategy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStrategy != null)
				msgs = ((InternalEObject)newStrategy).eInverseAdd(this, LocalSearchPackage.STRATEGY__IMPROVEMENTS, Strategy.class, msgs);
			msgs = basicSetStrategy(newStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.IMPROVEMENT__STRATEGY, newStrategy, newStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void doIteration() {
		String message1 = String.format("Improvment %s iteration %d started", this.getName(), this.getIterations());
		Plugin.INSTANCE.logInfo(message1);

		this.doIterationImpl();
	
		String message2 = String.format("Improvment %s iteration %d finished", this.getName(), this.getIterations());
		Plugin.INSTANCE.logInfo(message2);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LocalSearchPackage.IMPROVEMENT__ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActions()).basicAdd(otherEnd, msgs);
			case LocalSearchPackage.IMPROVEMENT__STRATEGY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStrategy((Strategy)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * 
	 */
	protected void doIterationImpl() {
		// default implementation does nothing, to be overloaded
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LocalSearchPackage.IMPROVEMENT__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case LocalSearchPackage.IMPROVEMENT__STRATEGY:
				return basicSetStrategy(null, msgs);
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
			case LocalSearchPackage.IMPROVEMENT__STRATEGY:
				return eInternalContainer().eInverseRemove(this, LocalSearchPackage.STRATEGY__IMPROVEMENTS, Strategy.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LocalSearchPackage.IMPROVEMENT__MAX_ITERATIONS:
				return getMaxIterations();
			case LocalSearchPackage.IMPROVEMENT__MAX_SECONDS:
				return getMaxSeconds();
			case LocalSearchPackage.IMPROVEMENT__ACTIONS:
				return getActions();
			case LocalSearchPackage.IMPROVEMENT__SOLUTION:
				if (resolve) return getSolution();
				return basicGetSolution();
			case LocalSearchPackage.IMPROVEMENT__IMPROVMENTS_START:
				return getImprovmentsStart();
			case LocalSearchPackage.IMPROVEMENT__IMPROVMENTS_END:
				return getImprovmentsEnd();
			case LocalSearchPackage.IMPROVEMENT__ITERATIONS:
				return getIterations();
			case LocalSearchPackage.IMPROVEMENT__DURATION_TOTAL:
				return getDurationTotal();
			case LocalSearchPackage.IMPROVEMENT__DURATION_AVERAGE:
				return getDurationAverage();
			case LocalSearchPackage.IMPROVEMENT__NAME:
				return getName();
			case LocalSearchPackage.IMPROVEMENT__CURRENT_ACTION_NR:
				return getCurrentActionNr();
			case LocalSearchPackage.IMPROVEMENT__STRATEGY:
				return getStrategy();
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
			case LocalSearchPackage.IMPROVEMENT__MAX_ITERATIONS:
				setMaxIterations((Integer)newValue);
				return;
			case LocalSearchPackage.IMPROVEMENT__MAX_SECONDS:
				setMaxSeconds((Float)newValue);
				return;
			case LocalSearchPackage.IMPROVEMENT__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case LocalSearchPackage.IMPROVEMENT__SOLUTION:
				setSolution((Solution)newValue);
				return;
			case LocalSearchPackage.IMPROVEMENT__IMPROVMENTS_START:
				setImprovmentsStart((Date)newValue);
				return;
			case LocalSearchPackage.IMPROVEMENT__IMPROVMENTS_END:
				setImprovmentsEnd((Date)newValue);
				return;
			case LocalSearchPackage.IMPROVEMENT__ITERATIONS:
				setIterations((Integer)newValue);
				return;
			case LocalSearchPackage.IMPROVEMENT__DURATION_TOTAL:
				setDurationTotal((Float)newValue);
				return;
			case LocalSearchPackage.IMPROVEMENT__DURATION_AVERAGE:
				setDurationAverage((Float)newValue);
				return;
			case LocalSearchPackage.IMPROVEMENT__NAME:
				setName((String)newValue);
				return;
			case LocalSearchPackage.IMPROVEMENT__CURRENT_ACTION_NR:
				setCurrentActionNr((Integer)newValue);
				return;
			case LocalSearchPackage.IMPROVEMENT__STRATEGY:
				setStrategy((Strategy)newValue);
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
			case LocalSearchPackage.IMPROVEMENT__MAX_ITERATIONS:
				setMaxIterations(MAX_ITERATIONS_EDEFAULT);
				return;
			case LocalSearchPackage.IMPROVEMENT__MAX_SECONDS:
				setMaxSeconds(MAX_SECONDS_EDEFAULT);
				return;
			case LocalSearchPackage.IMPROVEMENT__ACTIONS:
				getActions().clear();
				return;
			case LocalSearchPackage.IMPROVEMENT__SOLUTION:
				setSolution((Solution)null);
				return;
			case LocalSearchPackage.IMPROVEMENT__IMPROVMENTS_START:
				setImprovmentsStart(IMPROVMENTS_START_EDEFAULT);
				return;
			case LocalSearchPackage.IMPROVEMENT__IMPROVMENTS_END:
				setImprovmentsEnd(IMPROVMENTS_END_EDEFAULT);
				return;
			case LocalSearchPackage.IMPROVEMENT__ITERATIONS:
				setIterations(ITERATIONS_EDEFAULT);
				return;
			case LocalSearchPackage.IMPROVEMENT__DURATION_TOTAL:
				setDurationTotal(DURATION_TOTAL_EDEFAULT);
				return;
			case LocalSearchPackage.IMPROVEMENT__DURATION_AVERAGE:
				setDurationAverage(DURATION_AVERAGE_EDEFAULT);
				return;
			case LocalSearchPackage.IMPROVEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LocalSearchPackage.IMPROVEMENT__CURRENT_ACTION_NR:
				setCurrentActionNr(CURRENT_ACTION_NR_EDEFAULT);
				return;
			case LocalSearchPackage.IMPROVEMENT__STRATEGY:
				setStrategy((Strategy)null);
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
			case LocalSearchPackage.IMPROVEMENT__MAX_ITERATIONS:
				return maxIterations != MAX_ITERATIONS_EDEFAULT;
			case LocalSearchPackage.IMPROVEMENT__MAX_SECONDS:
				return maxSeconds != MAX_SECONDS_EDEFAULT;
			case LocalSearchPackage.IMPROVEMENT__ACTIONS:
				return actions != null && !actions.isEmpty();
			case LocalSearchPackage.IMPROVEMENT__SOLUTION:
				return solution != null;
			case LocalSearchPackage.IMPROVEMENT__IMPROVMENTS_START:
				return IMPROVMENTS_START_EDEFAULT == null ? improvmentsStart != null : !IMPROVMENTS_START_EDEFAULT.equals(improvmentsStart);
			case LocalSearchPackage.IMPROVEMENT__IMPROVMENTS_END:
				return IMPROVMENTS_END_EDEFAULT == null ? improvmentsEnd != null : !IMPROVMENTS_END_EDEFAULT.equals(improvmentsEnd);
			case LocalSearchPackage.IMPROVEMENT__ITERATIONS:
				return iterations != ITERATIONS_EDEFAULT;
			case LocalSearchPackage.IMPROVEMENT__DURATION_TOTAL:
				return durationTotal != DURATION_TOTAL_EDEFAULT;
			case LocalSearchPackage.IMPROVEMENT__DURATION_AVERAGE:
				return durationAverage != DURATION_AVERAGE_EDEFAULT;
			case LocalSearchPackage.IMPROVEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LocalSearchPackage.IMPROVEMENT__CURRENT_ACTION_NR:
				return currentActionNr != CURRENT_ACTION_NR_EDEFAULT;
			case LocalSearchPackage.IMPROVEMENT__STRATEGY:
				return getStrategy() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LocalSearchPackage.IMPROVEMENT___DO_ITERATION:
				doIteration();
				return null;
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
		result.append(" (MaxIterations: ");
		result.append(maxIterations);
		result.append(", MaxSeconds: ");
		result.append(maxSeconds);
		result.append(", ImprovmentsStart: ");
		result.append(improvmentsStart);
		result.append(", ImprovmentsEnd: ");
		result.append(improvmentsEnd);
		result.append(", Iterations: ");
		result.append(iterations);
		result.append(", DurationTotal: ");
		result.append(durationTotal);
		result.append(", DurationAverage: ");
		result.append(durationAverage);
		result.append(", Name: ");
		result.append(name);
		result.append(", CurrentActionNr: ");
		result.append(currentActionNr);
		result.append(')');
		return result.toString();
	}

} //ImprovementImpl
