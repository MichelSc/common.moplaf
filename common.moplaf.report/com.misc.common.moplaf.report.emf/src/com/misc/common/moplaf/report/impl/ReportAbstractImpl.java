/**
 */
package com.misc.common.moplaf.report.impl;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Date;
import java.util.Map;

import org.eclipse.birt.report.engine.api.DocxRenderOption;
import org.eclipse.birt.report.engine.api.EXCELRenderOption;
import org.eclipse.birt.report.engine.api.EngineException;
import org.eclipse.birt.report.engine.api.HTMLRenderOption;
import org.eclipse.birt.report.engine.api.IRenderOption;
import org.eclipse.birt.report.engine.api.IReportEngine;
import org.eclipse.birt.report.engine.api.IReportRunnable;
import org.eclipse.birt.report.engine.api.IRunAndRenderTask;
import org.eclipse.birt.report.engine.api.PDFRenderOption;
import org.eclipse.birt.report.engine.api.RenderOption;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.misc.common.moplaf.report.Plugin;
import com.misc.common.moplaf.report.ReportAbstract;
import com.misc.common.moplaf.report.ReportEngine;
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
 *   <li>implement {@link #getContext()}, returning the context object</li>
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
 *   <li>{@link com.misc.common.moplaf.report.impl.ReportAbstractImpl#getEngine <em>Engine</em>}</li>
 *   <li>{@link com.misc.common.moplaf.report.impl.ReportAbstractImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link com.misc.common.moplaf.report.impl.ReportAbstractImpl#getOutputFilePath <em>Output File Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.report.impl.ReportAbstractImpl#getLastGenerated <em>Last Generated</em>}</li>
 *   <li>{@link com.misc.common.moplaf.report.impl.ReportAbstractImpl#isMayBeRun <em>May Be Run</em>}</li>
 *   <li>{@link com.misc.common.moplaf.report.impl.ReportAbstractImpl#getMayBeRunFeedback <em>May Be Run Feedback</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ReportAbstractImpl extends MinimalEObjectImpl.Container implements ReportAbstract {
	/**
	 * The default value of the '{@link #getEngine() <em>Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine()
	 * @generated
	 * @ordered
	 */
	protected static final ReportEngine ENGINE_EDEFAULT = ReportEngine.ENUM_REPORT_ENGINE_BIRT;

	/**
	 * The cached value of the '{@link #getEngine() <em>Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine()
	 * @generated
	 * @ordered
	 */
	protected ReportEngine engine = ENGINE_EDEFAULT;

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
	public ReportEngine getEngine() {
		return engine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngine(ReportEngine newEngine) {
		ReportEngine oldEngine = engine;
		engine = newEngine == null ? ENGINE_EDEFAULT : newEngine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.REPORT_ABSTRACT__ENGINE, oldEngine, engine));
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
		else if ( this.getContext()==null ){
			feedback = "No context object";
		}
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void run() {
		CommonPlugin.INSTANCE.log("Report.generate: called");
		CommonPlugin.INSTANCE.log("Report.generate: report "+this.eClass().toString());
		CommonPlugin.INSTANCE.log("Report.generate: object "+ this.getContext()==null? "null" : this.getContext().toString());
		try {
			IReportEngine engine = Plugin.getReportEngine();
			Map appContext = engine.getConfig().getAppContext();

			//Set parameter values and validate
			// this must be done before loading the report design and/or creating the task
			appContext.put(Plugin.APPCONTEXT_REPORTCONTEXTOBJECT_KEY, this.getContext());

			//Open the report design
			URL url = new URL(this.getReportDesignFileURL());
			URL fileUrl = FileLocator.resolve(url);
			InputStream file = fileUrl.openStream();
			IReportRunnable design = engine.openReportDesign(file); 
			file.close();
			IRunAndRenderTask task = engine.createRunAndRenderTask(design);
			
			// resource URL
			//    this gives a path relative to the platform
			//    should we not make a real url?
			//    something with "platform:/resource/..."
			/*
			Resource resource = this.eResource();
			URI resourceURI = resource.getURI();
			String platformString = resourceURI.toPlatformString(false);
			task.setParameterValue("ResourceURL", platformString);
			*/
			
			task.validateParameters();
			
			//Setup rendering to HTML
			RenderOption option = null;
			String outputFormat = "";
			switch ( this.getFormat() ){
				case ENUM_REDER_FORMAT_HTML:
					HTMLRenderOption optionsHtml = new HTMLRenderOption();		
					outputFormat = IRenderOption.OUTPUT_FORMAT_HTML;
					//Setting this to true removes html and body tags
					optionsHtml.setEmbeddable(false);
					option = optionsHtml;
					break;
				case ENUM_RENDER_FORMAT_PDF:
					PDFRenderOption optionsPdf = new PDFRenderOption();
					outputFormat = IRenderOption.OUTPUT_FORMAT_PDF;
					option = optionsPdf;
					break;
				case ENUM_RENDER_FORMAT_DOCX:
					DocxRenderOption optionsDocx = new DocxRenderOption();
					outputFormat = "docx";
					option = optionsDocx;
					break;
				case ENUM_RENDER_FORMAT_DOC:
					DocxRenderOption optionsDoc = new DocxRenderOption();
					outputFormat = "doc";
					option = optionsDoc;
					break;
				case ENUM_RENDER_FORMAT_XLSX:
					EXCELRenderOption optionsXlsx = new EXCELRenderOption();
					outputFormat = "xlsx";
					option = optionsXlsx;
					break;
				case ENUM_RENDER_FORMAT_XLS:
					EXCELRenderOption optionsXls = new EXCELRenderOption();
					outputFormat = "xls";
					option = optionsXls;
					break;
			}

			// add extension if none
			String outputPath = this.getOutputFilePath();
			int lastdot = outputPath.lastIndexOf('.');
			int lastslash = outputPath.lastIndexOf('/');
			String extension = "";
			if ( lastdot>=0 && lastdot>lastslash ){
				extension = outputPath.substring(lastdot+1);
			}
			else if ( extension.length()==0){
				outputPath= outputPath+"."+outputFormat;
			}

			option.setOutputFileName(outputPath);
			option.setOutputFormat(outputFormat);
			task.setRenderOption(option);

			//run and render report
			task.run();
			task.close();
			appContext.put(Plugin.APPCONTEXT_REPORTCONTEXTOBJECT_KEY, null);
			this.setLastGenerated(new Date());
		} catch (EngineException | IOException e) {
			e.printStackTrace();
		}
		CommonPlugin.INSTANCE.log("Report.generate: done");
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getContext() {
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
			case ReportPackage.REPORT_ABSTRACT__ENGINE:
				return getEngine();
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
			case ReportPackage.REPORT_ABSTRACT__ENGINE:
				setEngine((ReportEngine)newValue);
				return;
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
			case ReportPackage.REPORT_ABSTRACT__ENGINE:
				setEngine(ENGINE_EDEFAULT);
				return;
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
			case ReportPackage.REPORT_ABSTRACT__ENGINE:
				return engine != ENGINE_EDEFAULT;
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
			case ReportPackage.REPORT_ABSTRACT___GET_CONTEXT:
				return getContext();
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
		result.append(" (Engine: ");
		result.append(engine);
		result.append(", Format: ");
		result.append(format);
		result.append(", OutputFilePath: ");
		result.append(outputFilePath);
		result.append(", LastGenerated: ");
		result.append(lastGenerated);
		result.append(')');
		return result.toString();
	}

} //ReportAbstractImpl
