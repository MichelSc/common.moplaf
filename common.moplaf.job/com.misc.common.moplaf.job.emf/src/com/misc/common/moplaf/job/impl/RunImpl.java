/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.job.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.common.ReturnFeedback;

import com.misc.common.moplaf.job.Run;
import com.misc.common.moplaf.job.JobFactory;
import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.job.Plugin;
import com.misc.common.moplaf.job.ProgressFeedback;
import com.misc.common.moplaf.job.RunContext;

import com.misc.common.moplaf.job.RunParams;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Run</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.impl.RunImpl#getRunFeedback <em>Run Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.RunImpl#getCancelFeedback <em>Cancel Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.RunImpl#getResetFeedback <em>Reset Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.RunImpl#isCanceled <em>Canceled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.RunImpl#isReturned <em>Returned</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.RunImpl#isReturnSuccess <em>Return Success</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.RunImpl#getReturnFeedback <em>Return Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.RunImpl#getReturnInformation <em>Return Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RunImpl extends RunParamsImpl implements Run {
	/**
	 * The default value of the '{@link #getRunFeedback() <em>Run Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback RUN_FEEDBACK_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCancelFeedback() <em>Cancel Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback CANCEL_FEEDBACK_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getResetFeedback() <em>Reset Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback RESET_FEEDBACK_EDEFAULT = null;

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
	 * The default value of the '{@link #isReturned() <em>Returned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETURNED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReturned() <em>Returned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturned()
	 * @generated
	 * @ordered
	 */
	protected boolean returned = RETURNED_EDEFAULT;

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
		return JobPackage.Literals.RUN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.RUN__CANCELED, oldCanceled, canceled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReturned() {
		return returned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturned(boolean newReturned) {
		boolean oldReturned = returned;
		returned = newReturned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.RUN__RETURNED, oldReturned, returned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getRunFeedback() {
		return EnabledFeedback.NOFEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getCancelFeedback() {
		if ( this.isCanceled()){
			return new EnabledFeedback(false, "canceled");
		}
		return EnabledFeedback.NOFEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getResetFeedback() {
		return EnabledFeedback.NOFEEDBACK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.RUN__RETURN_SUCCESS, oldReturnSuccess, returnSuccess));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.RUN__RETURN_FEEDBACK, oldReturnFeedback, returnFeedback));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.RUN__RETURN_INFORMATION, oldReturnInformation, returnInformation));
	}

	/*
	 * 
	 */
	protected void resetImpl() {
		// default implementation does nothing
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void reset() {
		this.setCanceled(false);
		this.setReturnSuccess(false);
		this.setReturnFeedback("");
		this.setReturnInformation("");
		this.setReturned(false);
		
		this.resetImpl();
	}

	/*
	 * 
	 */
	private RunContext runContext = null;

	/*
	 * 
	 */
	protected ReturnFeedback runImpl(RunContext context) {
		// to be implemented by the run implementation
		throw new UnsupportedOperationException();
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
	public ReturnFeedback run(RunContext runContext) {
		this.runContext = runContext;
		ReturnFeedback feedback = null;
		try {
			this.setReturnFeedback(null);
			feedback = this.runImpl(runContext);
		} catch (Exception e){
			e.printStackTrace();
			feedback = new ReturnFeedback("RunImpl.run ", e);
		}
		this.setReturn(feedback);
		return feedback;
	}

	
	class BackgroundRunJob extends Job implements RunContext{
		
		public BackgroundRunJob(String name) {
			super(name);
		    this.setPriority(Job.SHORT);
		    this.setUser(true);
		    this.setSystem(false);
		    this.callerContext = null;
		}

		public BackgroundRunJob(String name, RunContext callerContext) {
			super(name);
		    this.setPriority(Job.SHORT);
		    this.setUser(true);
		    this.setSystem(false);
		    this.callerContext = callerContext;
		}

		private IProgressMonitor monitor = null;
		private RunContext callerContext = null;
		
		/**
		 * Call back from the applicative logic
		 * 
		 * @return true if the run may continue, false if the run must attempt to abort
			 */
		@Override
		public boolean onProgress(Run run, ProgressFeedback progress) {
			boolean goOn = true;
			if ( this.monitor != null){
				if ( this.monitor.isCanceled())				{
					goOn = false;
				}
				this.monitor.setTaskName(progress.getTask());
			}
			if ( this.callerContext!=null ) {
				if ( !this.callerContext.onProgress(run, progress)) {
					goOn = false;
				}
			}
			return goOn;
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			this.monitor = monitor;
    	    monitor.beginTask("Initialization", 100);

    	    // run the run and set the return feedback
    	    RunImpl.this.run(this);
    	    // tell the context it is finished 
    	    // note: the run is Returned, isReturned will give true
    	    // so can the context recognize that it is finished
    	    RunImpl.this.setProgress("finished", Float.MAX_VALUE);

    	    // run is finished
            this.monitor = null;
            return Status.OK_STATUS;
		}
		
	};
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void runAsynch(RunContext runContext) {
		 Job job = new BackgroundRunJob ("Run in Background");
	     //Plugin.INSTANCE.logInfo("solve, job submitted");
	     job.schedule(); // start as soon as possible			
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
	public boolean setProgress(String task, float work) {
		ProgressFeedback feedback = new ProgressFeedback(work, task);
		return this.setProgress(feedback);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean setProgress(ProgressFeedback progress) {
		String message = String.format("Progress %s %f", progress.getTask(), progress.getWork());
		Plugin.INSTANCE.logInfo(message);
		if ( this.runContext == null){
			return true;
		}
		boolean goOn = runContext.onProgress(this, progress);
		if ( !goOn){
			this.cancel();
		}
		return goOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ReturnFeedback getReturn() {
		if ( !this.isReturned() ) {
			return null;
		}
		return new ReturnFeedback(this.isReturnSuccess(), 
                                  this.getReturnFeedback(),
				                  this.getReturnInformation());
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setReturn(ReturnFeedback feedback) {
		this.setReturnSuccess    (feedback.isSuccess());
		this.setReturnFeedback   (feedback.getFeedback());
		this.setReturnInformation(feedback.getInformation());
		this.setReturned(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public RunParams constructParams() {
		return JobFactory.eINSTANCE.createRunParams();
	}

	//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 */
//	public boolean onProgress(String task, float work) {
//		boolean goOn = true;
//		if ( this.eMonitor!= null){
//			if ( this.eMonitor.isCanceled())				{
//				goOn = false;
//			}
//			this.eMonitor.setTaskName(task);
//		} else if ( this.basicGetParentRun()!=null){
//			goOn = this.getParentRun().onProgress(task, work) && goOn;
//		}
//		if ( this.isCanceled() ){
//			goOn = false;
//		}
//		return goOn;
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JobPackage.RUN__RUN_FEEDBACK:
				return getRunFeedback();
			case JobPackage.RUN__CANCEL_FEEDBACK:
				return getCancelFeedback();
			case JobPackage.RUN__RESET_FEEDBACK:
				return getResetFeedback();
			case JobPackage.RUN__CANCELED:
				return isCanceled();
			case JobPackage.RUN__RETURNED:
				return isReturned();
			case JobPackage.RUN__RETURN_SUCCESS:
				return isReturnSuccess();
			case JobPackage.RUN__RETURN_FEEDBACK:
				return getReturnFeedback();
			case JobPackage.RUN__RETURN_INFORMATION:
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
			case JobPackage.RUN__CANCELED:
				setCanceled((Boolean)newValue);
				return;
			case JobPackage.RUN__RETURNED:
				setReturned((Boolean)newValue);
				return;
			case JobPackage.RUN__RETURN_SUCCESS:
				setReturnSuccess((Boolean)newValue);
				return;
			case JobPackage.RUN__RETURN_FEEDBACK:
				setReturnFeedback((String)newValue);
				return;
			case JobPackage.RUN__RETURN_INFORMATION:
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
			case JobPackage.RUN__CANCELED:
				setCanceled(CANCELED_EDEFAULT);
				return;
			case JobPackage.RUN__RETURNED:
				setReturned(RETURNED_EDEFAULT);
				return;
			case JobPackage.RUN__RETURN_SUCCESS:
				setReturnSuccess(RETURN_SUCCESS_EDEFAULT);
				return;
			case JobPackage.RUN__RETURN_FEEDBACK:
				setReturnFeedback(RETURN_FEEDBACK_EDEFAULT);
				return;
			case JobPackage.RUN__RETURN_INFORMATION:
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
			case JobPackage.RUN__RUN_FEEDBACK:
				return RUN_FEEDBACK_EDEFAULT == null ? getRunFeedback() != null : !RUN_FEEDBACK_EDEFAULT.equals(getRunFeedback());
			case JobPackage.RUN__CANCEL_FEEDBACK:
				return CANCEL_FEEDBACK_EDEFAULT == null ? getCancelFeedback() != null : !CANCEL_FEEDBACK_EDEFAULT.equals(getCancelFeedback());
			case JobPackage.RUN__RESET_FEEDBACK:
				return RESET_FEEDBACK_EDEFAULT == null ? getResetFeedback() != null : !RESET_FEEDBACK_EDEFAULT.equals(getResetFeedback());
			case JobPackage.RUN__CANCELED:
				return canceled != CANCELED_EDEFAULT;
			case JobPackage.RUN__RETURNED:
				return returned != RETURNED_EDEFAULT;
			case JobPackage.RUN__RETURN_SUCCESS:
				return returnSuccess != RETURN_SUCCESS_EDEFAULT;
			case JobPackage.RUN__RETURN_FEEDBACK:
				return RETURN_FEEDBACK_EDEFAULT == null ? returnFeedback != null : !RETURN_FEEDBACK_EDEFAULT.equals(returnFeedback);
			case JobPackage.RUN__RETURN_INFORMATION:
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
			case JobPackage.RUN___RESET:
				reset();
				return null;
			case JobPackage.RUN___RUN:
				return run();
			case JobPackage.RUN___RUN__RUNCONTEXT:
				return run((RunContext)arguments.get(0));
			case JobPackage.RUN___RUN_ASYNCH__RUNCONTEXT:
				runAsynch((RunContext)arguments.get(0));
				return null;
			case JobPackage.RUN___CANCEL:
				cancel();
				return null;
			case JobPackage.RUN___SET_PROGRESS__STRING_FLOAT:
				return setProgress((String)arguments.get(0), (Float)arguments.get(1));
			case JobPackage.RUN___SET_PROGRESS__PROGRESSFEEDBACK:
				return setProgress((ProgressFeedback)arguments.get(0));
			case JobPackage.RUN___GET_RETURN:
				return getReturn();
			case JobPackage.RUN___SET_RETURN__RETURNFEEDBACK:
				setReturn((ReturnFeedback)arguments.get(0));
				return null;
			case JobPackage.RUN___CONSTRUCT_PARAMS:
				return constructParams();
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
		result.append(", Returned: ");
		result.append(returned);
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
