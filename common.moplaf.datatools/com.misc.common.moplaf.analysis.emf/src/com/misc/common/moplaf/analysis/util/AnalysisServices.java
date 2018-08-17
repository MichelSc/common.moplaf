package com.misc.common.moplaf.analysis.util;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import com.misc.common.moplaf.analysis.AnalysisDomain;
import com.misc.common.moplaf.analysis.DocAnalysis;
import com.misc.common.moplaf.datatools.Columnizer;
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
    /**
     * 
     * @param self
     * @return
     */
    private EList<DataTool> getNewDataTools(AnalysisDomain domain, DocAnalysis analysis, DataToolType type) {
    	EList<DataTool> new_tools = domain.getNewDataTools(type);
    	Iterator<DataTool> iterator = new_tools.iterator();
    	while( iterator.hasNext() ) {
    		DataTool tool = iterator.next();
    		if ( !analysis.isValidTool(tool).isEnabled() ) {
    			iterator.remove();
    		}
    	}
  		return new_tools;
    }
    
//    public EList<DataTool> getNewExtractors(AnalysisDomain domain, DocAnalysis analysis) {
//  		return this.getNewDataTools(domain, analysis, DataToolType.EXTRACTOR);
//    }
//    
//    public EList<DataTool> getNewColumnizers(AnalysisDomain domain, DocAnalysis analysis) {
//  		return this.getNewDataTools(domain, analysis, DataToolType.COLUMNIZER);
//    }
    
    public EList<DataTool> getNewCategorizers(AnalysisDomain domain, DocAnalysis analysis) {
  		return this.getNewDataTools(domain, analysis, DataToolType.CATEGORIZER);
    }

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
