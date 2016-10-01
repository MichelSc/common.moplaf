/**
 */
package com.misc.common.moplaf.common.impl;

import com.misc.common.moplaf.common.CommandFeedback;
import com.misc.common.moplaf.common.CommonPackage;
import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.common.Run;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Run</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.common.impl.RunImpl#isCanceled <em>Canceled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.impl.RunImpl#getParentRun <em>Parent Run</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.impl.RunImpl#getRunFeedback <em>Run Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.impl.RunImpl#getCancelFeedback <em>Cancel Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.impl.RunImpl#isReturnSuccess <em>Return Success</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.impl.RunImpl#getReturnFeedback <em>Return Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.impl.RunImpl#getReturnInformation <em>Return Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RunImpl extends MinimalEObjectImpl.Container implements Run {
	/**
	 * The default value of the '{@link #isCanceled() <em>Canceled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanceled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CANCELED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanceled() <em>Canceled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanceled()
	 * @generated
	 * @ordered
	 */
	protected boolean canceled = CANCELED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentRun() <em>Parent Run</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentRun()
	 * @generated
	 * @ordered
	 */
	protected Run parentRun;

	/**
	 * The default value of the '{@link #getRunFeedback() <em>Run Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final CommandFeedback RUN_FEEDBACK_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCancelFeedback() <em>Cancel Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final CommandFeedback CANCEL_FEEDBACK_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isReturnSuccess() <em>Return Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnSuccess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETURN_SUCCESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReturnSuccess() <em>Return Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnSuccess()
	 * @generated
	 * @ordered
	 */
	protected boolean returnSuccess = RETURN_SUCCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnFeedback() <em>Return Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_FEEDBACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnFeedback() <em>Return Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnFeedback()
	 * @generated
	 * @ordered
	 */
	protected String returnFeedback = RETURN_FEEDBACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnInformation() <em>Return Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnInformation()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_INFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnInformation() <em>Return Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnInformation()
	 * @generated
	 * @ordered
	 */
	protected String returnInformation = RETURN_INFORMATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.RUN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanceled() {
		return canceled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanceled(boolean newCanceled) {
		boolean oldCanceled = canceled;
		canceled = newCanceled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.RUN__CANCELED, oldCanceled, canceled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Run getParentRun() {
		if (parentRun != null && parentRun.eIsProxy()) {
			InternalEObject oldParentRun = (InternalEObject)parentRun;
			parentRun = (Run)eResolveProxy(oldParentRun);
			if (parentRun != oldParentRun) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.RUN__PARENT_RUN, oldParentRun, parentRun));
			}
		}
		return parentRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Run basicGetParentRun() {
		return parentRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentRun(Run newParentRun) {
		Run oldParentRun = parentRun;
		parentRun = newParentRun;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.RUN__PARENT_RUN, oldParentRun, parentRun));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public CommandFeedback getRunFeedback() {
		return CommandFeedback.NOFEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public CommandFeedback getCancelFeedback() {
		if ( this.isCanceled()){
			return new CommandFeedback(false, "canceled");
		}
		return CommandFeedback.NOFEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReturnSuccess() {
		return returnSuccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnSuccess(boolean newReturnSuccess) {
		boolean oldReturnSuccess = returnSuccess;
		returnSuccess = newReturnSuccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.RUN__RETURN_SUCCESS, oldReturnSuccess, returnSuccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReturnFeedback() {
		return returnFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnFeedback(String newReturnFeedback) {
		String oldReturnFeedback = returnFeedback;
		returnFeedback = newReturnFeedback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.RUN__RETURN_FEEDBACK, oldReturnFeedback, returnFeedback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReturnInformation() {
		return returnInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnInformation(String newReturnInformation) {
		String oldReturnInformation = returnInformation;
		returnInformation = newReturnInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.RUN__RETURN_INFORMATION, oldReturnInformation, returnInformation));
	}

	/*
	 * 
	 */
	private IProgressMonitor eMonitor = null;

	/*
	 * 
	 */
	protected ReturnFeedback runImpl() {
		// to be implemented by the run implementation
		throw new UnsupportedOperationException();
	}

	/**
	 * Non monitored run
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ReturnFeedback run(Run parentRun) {
		ReturnFeedback feedback = null;
		try {
			this.setReturnFeedback(null);
			this.setParentRun(parentRun);
			feedback = this.runImpl();
		} catch (Exception e){
			feedback = new ReturnFeedback("RunImpl.run ", e);
		}
		this.setReturnSuccess    (feedback.isSuccess());
		this.setReturnFeedback   (feedback.getFeedback());
		this.setReturnInformation(feedback.getInformation());
		return feedback;
	}

	/**
	 * Run monitored by the parent
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ReturnFeedback run() {
		return this.run(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void runBackground() {
		  Job job = new Job("Run in Background") {
			     protected IStatus run(IProgressMonitor monitor) {
			    	    eMonitor = monitor;
			    	    monitor.beginTask("Initialization", 100);
			    	    //Plugin.INSTANCE.logInfo("Solve, job started");
	  					RunImpl.this.run(null);
						eMonitor = null;
			            return Status.OK_STATUS;
			        }
			     };  // class Job
		  job.setPriority(Job.SHORT);
		  job.setUser(true);
		  job.setSystem(false);
		  //Plugin.INSTANCE.logInfo("solve, job submitted");
		  job.schedule(); // start as soon as possible			}
	}
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void cancel() {
		this.setCanceled(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean onProgress(String task, float work) {
		boolean goOn = true;
		if ( this.eMonitor!= null){
			if ( this.eMonitor.isCanceled())				{
				goOn = false;
			}
			this.eMonitor.setTaskName(task);
		} else if ( this.basicGetParentRun()!=null){
			goOn = this.getParentRun().onProgress(task, work) && goOn;
		}
		if ( this.isCanceled() ){
			goOn = false;
		}
		return goOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.RUN__CANCELED:
				return isCanceled();
			case CommonPackage.RUN__PARENT_RUN:
				if (resolve) return getParentRun();
				return basicGetParentRun();
			case CommonPackage.RUN__RUN_FEEDBACK:
				return getRunFeedback();
			case CommonPackage.RUN__CANCEL_FEEDBACK:
				return getCancelFeedback();
			case CommonPackage.RUN__RETURN_SUCCESS:
				return isReturnSuccess();
			case CommonPackage.RUN__RETURN_FEEDBACK:
				return getReturnFeedback();
			case CommonPackage.RUN__RETURN_INFORMATION:
				return getReturnInformation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommonPackage.RUN__CANCELED:
				setCanceled((Boolean)newValue);
				return;
			case CommonPackage.RUN__PARENT_RUN:
				setParentRun((Run)newValue);
				return;
			case CommonPackage.RUN__RETURN_SUCCESS:
				setReturnSuccess((Boolean)newValue);
				return;
			case CommonPackage.RUN__RETURN_FEEDBACK:
				setReturnFeedback((String)newValue);
				return;
			case CommonPackage.RUN__RETURN_INFORMATION:
				setReturnInformation((String)newValue);
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
			case CommonPackage.RUN__CANCELED:
				setCanceled(CANCELED_EDEFAULT);
				return;
			case CommonPackage.RUN__PARENT_RUN:
				setParentRun((Run)null);
				return;
			case CommonPackage.RUN__RETURN_SUCCESS:
				setReturnSuccess(RETURN_SUCCESS_EDEFAULT);
				return;
			case CommonPackage.RUN__RETURN_FEEDBACK:
				setReturnFeedback(RETURN_FEEDBACK_EDEFAULT);
				return;
			case CommonPackage.RUN__RETURN_INFORMATION:
				setReturnInformation(RETURN_INFORMATION_EDEFAULT);
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
			case CommonPackage.RUN__CANCELED:
				return canceled != CANCELED_EDEFAULT;
			case CommonPackage.RUN__PARENT_RUN:
				return parentRun != null;
			case CommonPackage.RUN__RUN_FEEDBACK:
				return RUN_FEEDBACK_EDEFAULT == null ? getRunFeedback() != null : !RUN_FEEDBACK_EDEFAULT.equals(getRunFeedback());
			case CommonPackage.RUN__CANCEL_FEEDBACK:
				return CANCEL_FEEDBACK_EDEFAULT == null ? getCancelFeedback() != null : !CANCEL_FEEDBACK_EDEFAULT.equals(getCancelFeedback());
			case CommonPackage.RUN__RETURN_SUCCESS:
				return returnSuccess != RETURN_SUCCESS_EDEFAULT;
			case CommonPackage.RUN__RETURN_FEEDBACK:
				return RETURN_FEEDBACK_EDEFAULT == null ? returnFeedback != null : !RETURN_FEEDBACK_EDEFAULT.equals(returnFeedback);
			case CommonPackage.RUN__RETURN_INFORMATION:
				return RETURN_INFORMATION_EDEFAULT == null ? returnInformation != null : !RETURN_INFORMATION_EDEFAULT.equals(returnInformation);
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
			case CommonPackage.RUN___RUN:
				return run();
			case CommonPackage.RUN___RUN__RUN:
				return run((Run)arguments.get(0));
			case CommonPackage.RUN___RUN_BACKGROUND:
				runBackground();
				return null;
			case CommonPackage.RUN___CANCEL:
				cancel();
				return null;
			case CommonPackage.RUN___ON_PROGRESS__STRING_FLOAT:
				return onProgress((String)arguments.get(0), (Float)arguments.get(1));
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
		result.append(" (Canceled: ");
		result.append(canceled);
		result.append(", ReturnSuccess: ");
		result.append(returnSuccess);
		result.append(", ReturnFeedback: ");
		result.append(returnFeedback);
		result.append(", ReturnInformation: ");
		result.append(returnInformation);
		result.append(')');
		return result.toString();
	}

} //RunImpl
