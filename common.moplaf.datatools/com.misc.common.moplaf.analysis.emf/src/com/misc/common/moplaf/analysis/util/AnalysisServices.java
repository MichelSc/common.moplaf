package com.misc.common.moplaf.analysis.util;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import com.misc.common.moplaf.analysis.AnalysisDomain;
import com.misc.common.moplaf.analysis.DocAnalysis;
import com.misc.common.moplaf.common.Plugin;
import com.misc.common.moplaf.datatools.Categorizer;
import com.misc.common.moplaf.datatools.ColumnizerAbstract;
import com.misc.common.moplaf.datatools.DataTool;
import com.misc.common.moplaf.datatools.DataToolType;
import com.misc.common.moplaf.datatools.Extractor;
import com.misc.common.moplaf.job.Doc;

/**
 * The services class used by VSM.
 */
public class AnalysisServices {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    
    public EList<DataTool> getNewExtractors(AnalysisDomain domain, Doc doc) {
    	EList<DataTool> new_tools = domain.getNewDataTools(DataToolType.EXTRACTOR);
    	Iterator<DataTool> iterator = new_tools.iterator();
    	while( iterator.hasNext() ) {
    		Extractor extractor = (Extractor) iterator.next();
    		if ( !extractor.isValidRoot(doc) ) {
    			iterator.remove();
    		}
    	}
  		return new_tools;
    }

    public EList<DataTool> getNewExtractors(DocAnalysis analysis) {
    	AnalysisDomain domain = analysis.getDomain();
    	Doc doc = analysis.getDoc();
    	return this.getNewExtractors(domain, doc);
    }

    public EList<DataTool> getNewColumnizers(AnalysisDomain domain, EClass element_type) {
    	EList<DataTool> new_tools = domain.getNewDataTools(DataToolType.COLUMNIZER);
    	Iterator<DataTool> iterator = new_tools.iterator();
    	while( iterator.hasNext() ) {
    		ColumnizerAbstract columnizer = (ColumnizerAbstract) iterator.next();
    		if ( !columnizer.isValidElementType(element_type) ) {
    			iterator.remove();
    		}
    	}
  		return new_tools;
    }
    
    public EList<DataTool> getNewColumnizers(DocAnalysis analysis) {
    	Plugin.INSTANCE.logInfo("Get new columniers");
    	AnalysisDomain domain = analysis.getDomain();
    	Extractor extractor = analysis.getExtractor();
    	if ( extractor == null ) { return null; }
    	EClass type = extractor.getExtractedType();
    	if ( type == null ) { return null; }
    	return this.getNewColumnizers(domain, type);
    }
    
    public EList<DataTool> getNewCategorizers(DocAnalysis analysis) {
    	AnalysisDomain domain = analysis.getDomain();
    	Extractor extractor = analysis.getExtractor();
    	if ( extractor == null ) { return null; }
    	EClass type = extractor.getExtractedType();
    	if ( type == null ) { return null; }
    	return this.getNewCategorizers(domain, type);
    }
    


    public EList<DataTool> getNewCategorizers(AnalysisDomain domain, EClass element_type) {
    	EList<DataTool> new_tools = domain.getNewDataTools(DataToolType.CATEGORIZER);
    	Iterator<DataTool> iterator = new_tools.iterator();
    	while( iterator.hasNext() ) {
    		Categorizer categorizer = (Categorizer) iterator.next();
    		if ( !categorizer.isValidElementType(element_type) ) {
    			iterator.remove();
    		}
    	}
  		return new_tools;
    }
    
    public boolean docAnalysisSetDataTools(DocAnalysis analysis, Extractor extractor, List<ColumnizerAbstract> columnizers, List<Categorizer> categorizers) {
    	analysis.setExtractor(extractor);
    	analysis.getColumnizers().clear();
    	analysis.getColumnizers().addAll(columnizers);
    	analysis.getCategorizers().clear();
    	analysis.getCategorizers().addAll(categorizers);
    	return true;
    }

    public boolean docAnalysisAddColumnizers(DocAnalysis analysis, List<ColumnizerAbstract> columnizers) {
    	analysis.getColumnizers().addAll(columnizers);
    	return true;
    }

    public boolean docAnalysisAddCategorizers(DocAnalysis analysis, List<Categorizer> categorizers) {
    	analysis.getCategorizers().addAll(categorizers);
    	return true;
    }

    /**
     * 
     * @param self
     * @return
     */
    public boolean analysisRefreshEnabled(DocAnalysis analysis) {
    	if ( analysis==null) {
    		return false;
    	}
    	
		return analysis.getRefreshFeedback().isEnabled();
    }

    /**
     * 
     * @param self
     * @return
     */
    public boolean analysisRefresh(DocAnalysis analysis) {
		analysis.refresh();
		return true;
    }

}
