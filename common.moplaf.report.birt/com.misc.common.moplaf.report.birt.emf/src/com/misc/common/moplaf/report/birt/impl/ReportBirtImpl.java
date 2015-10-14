/**
 */
package com.misc.common.moplaf.report.birt.impl;

import com.misc.common.moplaf.report.birt.BirtPackage;
import com.misc.common.moplaf.report.birt.Plugin;
import com.misc.common.moplaf.report.birt.ReportBirt;

import com.misc.common.moplaf.report.impl.ReportAbstractImpl;

import java.io.IOException;
import java.io.InputStream;
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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 *
 * @generated
 */
public class ReportBirtImpl extends ReportAbstractImpl implements ReportBirt {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportBirtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BirtPackage.Literals.REPORT_BIRT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void run() {
		CommonPlugin.INSTANCE.log("Report.generate: called");
		CommonPlugin.INSTANCE.log("Report.generate: report "+this.eClass().toString());
		CommonPlugin.INSTANCE.log("Report.generate: object "+ this.getReportContext()==null? "null" : this.getReportContext().toString());
		try {
			IReportEngine engine = Plugin.getReportEngine();
			Map<String, EObject> appContext = engine.getConfig().getAppContext();
	
			//Set parameter values and validate
			// this must be done before loading the report design and/or creating the task
			appContext.put(Plugin.APPCONTEXT_REPORTCONTEXTOBJECT_KEY, this.getReportContext());
	
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

} //ReportBirtImpl
