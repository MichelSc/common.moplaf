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
package com.misc.common.moplaf.report.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import com.misc.common.moplaf.report.ReportAbstract;
import com.misc.common.moplaf.report.ReportPackage;
import com.misc.common.moplaf.report.ReportRenderFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract</b></em>'.
 * <p>
 * Base class for reports based on some EObject context:
 * <ul>
 *   <li>get the report design doc</li>
 *   <li>set the context object</li>
 *   <li>generate the report</li>
 *   <li>write the report</li>
 * </ul>
 * <p>
 * In order to use this class, create a concrete class inheriting from this class:
 * <ul>
 *   <li>implement {@link #getReportDesignFileURL()}, returning the url of the report design file, like "platform:/plugin/path/file.rptdesign"</li>
 *   <li>implement {@link #basicGetReportContext()}, returning the context object</li>
 *   <li>implement {@link #getDescription()}, returning a description for the report being generated</li>
 *   <li>create a root ODA EMF Dataset, receiving the context object </li>
 *   <ul>
 *     <li>set as event handler for the root dataset the class com.misc.common.moplaf.report.birt.RootDataSetEventHandler</li>
 *     <li>the function of this event handler is to set the parameter @target with the context object</li>
 *   </ul>
 * </ul>
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.report.impl.ReportAbstractImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link com.misc.common.moplaf.report.impl.ReportAbstractImpl#getOutputFilePath <em>Output File Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.report.impl.ReportAbstractImpl#getLastGenerated <em>Last Generated</em>}</li>
 *   <li>{@link com.misc.common.moplaf.report.impl.ReportAbstractImpl#isMayBeRun <em>May Be Run</em>}</li>
 *   <li>{@link com.misc.common.moplaf.report.impl.ReportAbstractImpl#getMayBeRunFeedback <em>May Be Run Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.report.impl.ReportAbstractImpl#getReportContext <em>Report Context</em>}</li>
 *   <li>{@link com.misc.common.moplaf.report.impl.ReportAbstractImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ReportAbstractImpl extends MinimalEObjectImpl.Container implements ReportAbstract {
	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final ReportRenderFormat FORMAT_EDEFAULT = ReportRenderFormat.ENUM_RENDER_FORMAT_PDF;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected ReportRenderFormat format = FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputFilePath() <em>Output File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_FILE_PATH_EDEFAULT = "/home/michel/tmp/output";

	/**
	 * The cached value of the '{@link #getOutputFilePath() <em>Output File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFilePath()
	 * @generated
	 * @ordered
	 */
	protected String outputFilePath = OUTPUT_FILE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastGenerated() <em>Last Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastGenerated()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_GENERATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastGenerated() <em>Last Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastGenerated()
	 * @generated
	 * @ordered
	 */
	protected Date lastGenerated = LAST_GENERATED_EDEFAULT;

	/**
	 * The default value of the '{@link #isMayBeRun() <em>May Be Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMayBeRun()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAY_BE_RUN_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getMayBeRunFeedback() <em>May Be Run Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMayBeRunFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final String MAY_BE_RUN_FEEDBACK_EDEFAULT = null;

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
	protected ReportAbstractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportPackage.Literals.REPORT_ABSTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportRenderFormat getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(ReportRenderFormat newFormat) {
		ReportRenderFormat oldFormat = format;
		format = newFormat == null ? FORMAT_EDEFAULT : newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.REPORT_ABSTRACT__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputFilePath() {
		return outputFilePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputFilePath(String newOutputFilePath) {
		String oldOutputFilePath = outputFilePath;
		outputFilePath = newOutputFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.REPORT_ABSTRACT__OUTPUT_FILE_PATH, oldOutputFilePath, outputFilePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastGenerated() {
		return lastGenerated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastGenerated(Date newLastGenerated) {
		Date oldLastGenerated = lastGenerated;
		lastGenerated = newLastGenerated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.REPORT_ABSTRACT__LAST_GENERATED, oldLastGenerated, lastGenerated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isMayBeRun() {
		return this.getMayBeRunFeedback().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getMayBeRunFeedback() {
		String feedback = "";
		if ( this.getOutputFilePath().isEmpty() ){
			feedback = "No output file";
		}
		else if ( this.getReportContext()==null ){
			feedback = "No context object";
		}
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getReportContext() {
		EObject reportContext = basicGetReportContext();
		return reportContext != null && reportContext.eIsProxy() ? eResolveProxy((InternalEObject)reportContext) : reportContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetReportContext() {
		// TODO: implement this method to return the 'Report Context' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String description = this.getClass().getName();
		return description;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void run() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReportDesignFileURL() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportPackage.REPORT_ABSTRACT__FORMAT:
				return getFormat();
			case ReportPackage.REPORT_ABSTRACT__OUTPUT_FILE_PATH:
				return getOutputFilePath();
			case ReportPackage.REPORT_ABSTRACT__LAST_GENERATED:
				return getLastGenerated();
			case ReportPackage.REPORT_ABSTRACT__MAY_BE_RUN:
				return isMayBeRun();
			case ReportPackage.REPORT_ABSTRACT__MAY_BE_RUN_FEEDBACK:
				return getMayBeRunFeedback();
			case ReportPackage.REPORT_ABSTRACT__REPORT_CONTEXT:
				if (resolve) return getReportContext();
				return basicGetReportContext();
			case ReportPackage.REPORT_ABSTRACT__DESCRIPTION:
				return getDescription();
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
			case ReportPackage.REPORT_ABSTRACT__FORMAT:
				setFormat((ReportRenderFormat)newValue);
				return;
			case ReportPackage.REPORT_ABSTRACT__OUTPUT_FILE_PATH:
				setOutputFilePath((String)newValue);
				return;
			case ReportPackage.REPORT_ABSTRACT__LAST_GENERATED:
				setLastGenerated((Date)newValue);
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
			case ReportPackage.REPORT_ABSTRACT__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case ReportPackage.REPORT_ABSTRACT__OUTPUT_FILE_PATH:
				setOutputFilePath(OUTPUT_FILE_PATH_EDEFAULT);
				return;
			case ReportPackage.REPORT_ABSTRACT__LAST_GENERATED:
				setLastGenerated(LAST_GENERATED_EDEFAULT);
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
			case ReportPackage.REPORT_ABSTRACT__FORMAT:
				return format != FORMAT_EDEFAULT;
			case ReportPackage.REPORT_ABSTRACT__OUTPUT_FILE_PATH:
				return OUTPUT_FILE_PATH_EDEFAULT == null ? outputFilePath != null : !OUTPUT_FILE_PATH_EDEFAULT.equals(outputFilePath);
			case ReportPackage.REPORT_ABSTRACT__LAST_GENERATED:
				return LAST_GENERATED_EDEFAULT == null ? lastGenerated != null : !LAST_GENERATED_EDEFAULT.equals(lastGenerated);
			case ReportPackage.REPORT_ABSTRACT__MAY_BE_RUN:
				return isMayBeRun() != MAY_BE_RUN_EDEFAULT;
			case ReportPackage.REPORT_ABSTRACT__MAY_BE_RUN_FEEDBACK:
				return MAY_BE_RUN_FEEDBACK_EDEFAULT == null ? getMayBeRunFeedback() != null : !MAY_BE_RUN_FEEDBACK_EDEFAULT.equals(getMayBeRunFeedback());
			case ReportPackage.REPORT_ABSTRACT__REPORT_CONTEXT:
				return basicGetReportContext() != null;
			case ReportPackage.REPORT_ABSTRACT__DESCRIPTION:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ReportPackage.REPORT_ABSTRACT___RUN:
				run();
				return null;
			case ReportPackage.REPORT_ABSTRACT___GET_REPORT_DESIGN_FILE_URL:
				return getReportDesignFileURL();
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
		result.append(" (Format: ");
		result.append(format);
		result.append(", OutputFilePath: ");
		result.append(outputFilePath);
		result.append(", LastGenerated: ");
		result.append(lastGenerated);
		result.append(')');
		return result.toString();
	}

} //ReportAbstractImpl
