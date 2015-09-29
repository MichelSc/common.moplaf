/**
 */
package com.misc.common.moplaf.Report.impl;

import com.misc.common.moplaf.Report.Plugin;
import com.misc.common.moplaf.Report.ReportAbstract;
import com.misc.common.moplaf.Report.ReportEngine;
import com.misc.common.moplaf.Report.ReportPackage;
import com.misc.common.moplaf.Report.ReportRenderFormat;

import com.misc.common.moplaf.Report.ReportRunMode;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Date;

import org.eclipse.birt.report.engine.api.DocxRenderOption;
import org.eclipse.birt.report.engine.api.EXCELRenderOption;
import org.eclipse.birt.report.engine.api.EngineConstants;
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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.Report.impl.ReportAbstractImpl#getEngine <em>Engine</em>}</li>
 *   <li>{@link com.misc.common.moplaf.Report.impl.ReportAbstractImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link com.misc.common.moplaf.Report.impl.ReportAbstractImpl#isGenerated <em>Generated</em>}</li>
 *   <li>{@link com.misc.common.moplaf.Report.impl.ReportAbstractImpl#getOutputFilePath <em>Output File Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.Report.impl.ReportAbstractImpl#getLastGenerated <em>Last Generated</em>}</li>
 *   <li>{@link com.misc.common.moplaf.Report.impl.ReportAbstractImpl#getRunMode <em>Run Mode</em>}</li>
 *   <li>{@link com.misc.common.moplaf.Report.impl.ReportAbstractImpl#isMayBeRun <em>May Be Run</em>}</li>
 *   <li>{@link com.misc.common.moplaf.Report.impl.ReportAbstractImpl#getMayBeRunFeedback <em>May Be Run Feedback</em>}</li>
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
	 * The default value of the '{@link #isGenerated() <em>Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerated() <em>Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerated()
	 * @generated
	 * @ordered
	 */
	protected boolean generated = GENERATED_EDEFAULT;

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
	 * The default value of the '{@link #getRunMode() <em>Run Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunMode()
	 * @generated
	 * @ordered
	 */
	protected static final ReportRunMode RUN_MODE_EDEFAULT = ReportRunMode.ENUM_GENERATE_AND_RENDER;

	/**
	 * The cached value of the '{@link #getRunMode() <em>Run Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunMode()
	 * @generated
	 * @ordered
	 */
	protected ReportRunMode runMode = RUN_MODE_EDEFAULT;

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
	public boolean isGenerated() {
		return generated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerated(boolean newGenerated) {
		boolean oldGenerated = generated;
		generated = newGenerated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.REPORT_ABSTRACT__GENERATED, oldGenerated, generated));
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
	 * @generated
	 */
	public ReportRunMode getRunMode() {
		return runMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunMode(ReportRunMode newRunMode) {
		ReportRunMode oldRunMode = runMode;
		runMode = newRunMode == null ? RUN_MODE_EDEFAULT : newRunMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.REPORT_ABSTRACT__RUN_MODE, oldRunMode, runMode));
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
		switch  ( this.getRunMode() )
		{
		case ENUM_GENERATE_AND_WRITE:
		case ENUM_GENERATE_AND_RENDER:
			feedback = "Report not generated";
			break;
		default:
			break;
		}
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean generate() {
		boolean generated = false;
		CommonPlugin.INSTANCE.log("Report.generate: called");
		try {
			IReportEngine engine = Plugin.getReportEngine();
			//Open the report design
			//Bundle bundle = Platform.getBundle(this.getReportBundleID());
			//InputStream file = FileLocator.openStream(bundle, new Path(this.getReportDesignFilePath()), false);
			URL url = new URL(this.getReportDesignFileURL());
			URL fileUrl = FileLocator.resolve(url);
			InputStream file = fileUrl.openStream();
			IReportRunnable design = engine.openReportDesign(file); 
			file.close();
			
			//Create task to run and render the report,
			IRunAndRenderTask task = engine.createRunAndRenderTask(design);
			
			//Set parent classloader for engine
			task.getAppContext().put(EngineConstants.APPCONTEXT_CLASSLOADER_KEY, 
									ReportAbstractImpl.class.getClassLoader()); 
			
			//Set parameter values and validate
			URI resourceURI = this.eResource().getURI();
			// resource URL
			//    this gives a path relative to the platform
			//    should we not make a real url?
			//    something with "platform:/resource/..."
			String platformString = resourceURI.toPlatformString(false);
			task.setParameterValue("ResourceURL", platformString);
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
			generated = true;
		} catch (EngineException | IOException e) {
			e.printStackTrace();
		}
		this.setGenerated(generated);
		CommonPlugin.INSTANCE.log("Report.generate: done, generated="+generated);
		return generated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void render() {
		CommonPlugin.INSTANCE.log("Report.render: called");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void write() {
		CommonPlugin.INSTANCE.log("Report.write: called");
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
	 */
	public void run() {
		switch  ( this.getRunMode() )
		{
		case ENUM_GENERATE_ONLY:
			this.generate();
			break;
		case ENUM_RENDER_ONLY:
			this.render();
			break;
		case ENUM_WRITE_ONLY:
			this.write();
			break;
		case ENUM_GENERATE_AND_WRITE:
			this.generate();
			this.write();
			break;
		case ENUM_GENERATE_AND_RENDER:
			this.generate();
			this.render();
			break;
		}
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
			case ReportPackage.REPORT_ABSTRACT__GENERATED:
				return isGenerated();
			case ReportPackage.REPORT_ABSTRACT__OUTPUT_FILE_PATH:
				return getOutputFilePath();
			case ReportPackage.REPORT_ABSTRACT__LAST_GENERATED:
				return getLastGenerated();
			case ReportPackage.REPORT_ABSTRACT__RUN_MODE:
				return getRunMode();
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
			case ReportPackage.REPORT_ABSTRACT__GENERATED:
				setGenerated((Boolean)newValue);
				return;
			case ReportPackage.REPORT_ABSTRACT__OUTPUT_FILE_PATH:
				setOutputFilePath((String)newValue);
				return;
			case ReportPackage.REPORT_ABSTRACT__LAST_GENERATED:
				setLastGenerated((Date)newValue);
				return;
			case ReportPackage.REPORT_ABSTRACT__RUN_MODE:
				setRunMode((ReportRunMode)newValue);
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
			case ReportPackage.REPORT_ABSTRACT__GENERATED:
				setGenerated(GENERATED_EDEFAULT);
				return;
			case ReportPackage.REPORT_ABSTRACT__OUTPUT_FILE_PATH:
				setOutputFilePath(OUTPUT_FILE_PATH_EDEFAULT);
				return;
			case ReportPackage.REPORT_ABSTRACT__LAST_GENERATED:
				setLastGenerated(LAST_GENERATED_EDEFAULT);
				return;
			case ReportPackage.REPORT_ABSTRACT__RUN_MODE:
				setRunMode(RUN_MODE_EDEFAULT);
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
			case ReportPackage.REPORT_ABSTRACT__GENERATED:
				return generated != GENERATED_EDEFAULT;
			case ReportPackage.REPORT_ABSTRACT__OUTPUT_FILE_PATH:
				return OUTPUT_FILE_PATH_EDEFAULT == null ? outputFilePath != null : !OUTPUT_FILE_PATH_EDEFAULT.equals(outputFilePath);
			case ReportPackage.REPORT_ABSTRACT__LAST_GENERATED:
				return LAST_GENERATED_EDEFAULT == null ? lastGenerated != null : !LAST_GENERATED_EDEFAULT.equals(lastGenerated);
			case ReportPackage.REPORT_ABSTRACT__RUN_MODE:
				return runMode != RUN_MODE_EDEFAULT;
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
			case ReportPackage.REPORT_ABSTRACT___GENERATE:
				return generate();
			case ReportPackage.REPORT_ABSTRACT___RENDER:
				render();
				return null;
			case ReportPackage.REPORT_ABSTRACT___WRITE:
				write();
				return null;
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
		result.append(", Generated: ");
		result.append(generated);
		result.append(", OutputFilePath: ");
		result.append(outputFilePath);
		result.append(", LastGenerated: ");
		result.append(lastGenerated);
		result.append(", RunMode: ");
		result.append(runMode);
		result.append(')');
		return result.toString();
	}

} //ReportAbstractImpl
