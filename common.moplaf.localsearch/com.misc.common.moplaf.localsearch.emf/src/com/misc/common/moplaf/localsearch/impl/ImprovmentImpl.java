/**
 */
package com.misc.common.moplaf.localsearch.impl;

import com.misc.common.moplaf.localsearch.Action;
import com.misc.common.moplaf.localsearch.Improvment;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Solution;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Improvment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovmentImpl#getMaxIterations <em>Max Iterations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovmentImpl#getMaxSeconds <em>Max Seconds</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovmentImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovmentImpl#getSolution <em>Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovmentImpl#getImprovmentsStart <em>Improvments Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovmentImpl#getImprovmentsEnd <em>Improvments End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovmentImpl#getIterations <em>Iterations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovmentImpl#getDurationTotal <em>Duration Total</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovmentImpl#getDurationAverage <em>Duration Average</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovmentImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ImprovmentImpl extends MinimalEObjectImpl.Container implements Improvment {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImprovmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocalSearchPackage.Literals.IMPROVMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.IMPROVMENT__MAX_ITERATIONS, oldMaxIterations, maxIterations));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.IMPROVMENT__MAX_SECONDS, oldMaxSeconds, maxSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, LocalSearchPackage.IMPROVMENT__ACTIONS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocalSearchPackage.IMPROVMENT__SOLUTION, oldSolution, solution));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.IMPROVMENT__SOLUTION, oldSolution, solution));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.IMPROVMENT__IMPROVMENTS_START, oldImprovmentsStart, improvmentsStart));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.IMPROVMENT__IMPROVMENTS_END, oldImprovmentsEnd, improvmentsEnd));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.IMPROVMENT__ITERATIONS, oldIterations, iterations));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.IMPROVMENT__DURATION_TOTAL, oldDurationTotal, durationTotal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.IMPROVMENT__DURATION_AVERAGE, oldDurationAverage, durationAverage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.IMPROVMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void doIteration() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LocalSearchPackage.IMPROVMENT__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LocalSearchPackage.IMPROVMENT__MAX_ITERATIONS:
				return getMaxIterations();
			case LocalSearchPackage.IMPROVMENT__MAX_SECONDS:
				return getMaxSeconds();
			case LocalSearchPackage.IMPROVMENT__ACTIONS:
				return getActions();
			case LocalSearchPackage.IMPROVMENT__SOLUTION:
				if (resolve) return getSolution();
				return basicGetSolution();
			case LocalSearchPackage.IMPROVMENT__IMPROVMENTS_START:
				return getImprovmentsStart();
			case LocalSearchPackage.IMPROVMENT__IMPROVMENTS_END:
				return getImprovmentsEnd();
			case LocalSearchPackage.IMPROVMENT__ITERATIONS:
				return getIterations();
			case LocalSearchPackage.IMPROVMENT__DURATION_TOTAL:
				return getDurationTotal();
			case LocalSearchPackage.IMPROVMENT__DURATION_AVERAGE:
				return getDurationAverage();
			case LocalSearchPackage.IMPROVMENT__NAME:
				return getName();
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
			case LocalSearchPackage.IMPROVMENT__MAX_ITERATIONS:
				setMaxIterations((Integer)newValue);
				return;
			case LocalSearchPackage.IMPROVMENT__MAX_SECONDS:
				setMaxSeconds((Float)newValue);
				return;
			case LocalSearchPackage.IMPROVMENT__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case LocalSearchPackage.IMPROVMENT__SOLUTION:
				setSolution((Solution)newValue);
				return;
			case LocalSearchPackage.IMPROVMENT__IMPROVMENTS_START:
				setImprovmentsStart((Date)newValue);
				return;
			case LocalSearchPackage.IMPROVMENT__IMPROVMENTS_END:
				setImprovmentsEnd((Date)newValue);
				return;
			case LocalSearchPackage.IMPROVMENT__ITERATIONS:
				setIterations((Integer)newValue);
				return;
			case LocalSearchPackage.IMPROVMENT__DURATION_TOTAL:
				setDurationTotal((Float)newValue);
				return;
			case LocalSearchPackage.IMPROVMENT__DURATION_AVERAGE:
				setDurationAverage((Float)newValue);
				return;
			case LocalSearchPackage.IMPROVMENT__NAME:
				setName((String)newValue);
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
			case LocalSearchPackage.IMPROVMENT__MAX_ITERATIONS:
				setMaxIterations(MAX_ITERATIONS_EDEFAULT);
				return;
			case LocalSearchPackage.IMPROVMENT__MAX_SECONDS:
				setMaxSeconds(MAX_SECONDS_EDEFAULT);
				return;
			case LocalSearchPackage.IMPROVMENT__ACTIONS:
				getActions().clear();
				return;
			case LocalSearchPackage.IMPROVMENT__SOLUTION:
				setSolution((Solution)null);
				return;
			case LocalSearchPackage.IMPROVMENT__IMPROVMENTS_START:
				setImprovmentsStart(IMPROVMENTS_START_EDEFAULT);
				return;
			case LocalSearchPackage.IMPROVMENT__IMPROVMENTS_END:
				setImprovmentsEnd(IMPROVMENTS_END_EDEFAULT);
				return;
			case LocalSearchPackage.IMPROVMENT__ITERATIONS:
				setIterations(ITERATIONS_EDEFAULT);
				return;
			case LocalSearchPackage.IMPROVMENT__DURATION_TOTAL:
				setDurationTotal(DURATION_TOTAL_EDEFAULT);
				return;
			case LocalSearchPackage.IMPROVMENT__DURATION_AVERAGE:
				setDurationAverage(DURATION_AVERAGE_EDEFAULT);
				return;
			case LocalSearchPackage.IMPROVMENT__NAME:
				setName(NAME_EDEFAULT);
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
			case LocalSearchPackage.IMPROVMENT__MAX_ITERATIONS:
				return maxIterations != MAX_ITERATIONS_EDEFAULT;
			case LocalSearchPackage.IMPROVMENT__MAX_SECONDS:
				return maxSeconds != MAX_SECONDS_EDEFAULT;
			case LocalSearchPackage.IMPROVMENT__ACTIONS:
				return actions != null && !actions.isEmpty();
			case LocalSearchPackage.IMPROVMENT__SOLUTION:
				return solution != null;
			case LocalSearchPackage.IMPROVMENT__IMPROVMENTS_START:
				return IMPROVMENTS_START_EDEFAULT == null ? improvmentsStart != null : !IMPROVMENTS_START_EDEFAULT.equals(improvmentsStart);
			case LocalSearchPackage.IMPROVMENT__IMPROVMENTS_END:
				return IMPROVMENTS_END_EDEFAULT == null ? improvmentsEnd != null : !IMPROVMENTS_END_EDEFAULT.equals(improvmentsEnd);
			case LocalSearchPackage.IMPROVMENT__ITERATIONS:
				return iterations != ITERATIONS_EDEFAULT;
			case LocalSearchPackage.IMPROVMENT__DURATION_TOTAL:
				return durationTotal != DURATION_TOTAL_EDEFAULT;
			case LocalSearchPackage.IMPROVMENT__DURATION_AVERAGE:
				return durationAverage != DURATION_AVERAGE_EDEFAULT;
			case LocalSearchPackage.IMPROVMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
			case LocalSearchPackage.IMPROVMENT___DO_ITERATION:
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
		result.append(')');
		return result.toString();
	}

} //ImprovmentImpl
