/**
 */
package com.misc.common.moplaf.common.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.common.ProgressFeedback;
import com.misc.common.moplaf.common.CommonPackage;
import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.common.Run;

import com.misc.common.moplaf.common.RunContext;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
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
			feedback = new ReturnFeedback("RunImpl.run ", e);
		}
		this.setReturnSuccess    (feedback.isSuccess());
		this.setReturnFeedback   (feedback.getFeedback());
		this.setReturnInformation(feedback.getInformation());
		return feedback;
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
		if ( this.runContext == null){
			return true;
		}
		boolean goOn = runContext.onProgress(progress);
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
		return new ReturnFeedback(this.isReturnSuccess(), this.getReturnInformation());
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
			case CommonPackage.RUN__CANCELED:
				return isCanceled();
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
			case CommonPackage.RUN___RUN__RUNCONTEXT:
				return run((RunContext)arguments.get(0));
			case CommonPackage.RUN___CANCEL:
				cancel();
				return null;
			case CommonPackage.RUN___SET_PROGRESS__STRING_FLOAT:
				return setProgress((String)arguments.get(0), (Float)arguments.get(1));
			case CommonPackage.RUN___SET_PROGRESS__PROGRESSFEEDBACK:
				return setProgress((ProgressFeedback)arguments.get(0));
			case CommonPackage.RUN___GET_RETURN:
				return getReturn();
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
