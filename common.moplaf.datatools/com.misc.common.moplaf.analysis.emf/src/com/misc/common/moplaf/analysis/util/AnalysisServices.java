package com.misc.common.moplaf.analysis.util;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import com.misc.common.moplaf.analysis.AnalysisDomain;
import com.misc.common.moplaf.analysis.DocAnalysis;
import com.misc.common.moplaf.datatools.Categorizer;
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
    
    public boolean docAnalysisSetDataTools(DocAnalysis analysis, Extractor extractor, ColumnizerAbstract columnizer, Categorizer categorizer) {
    	analysis.setExtractor(extractor);
    	analysis.setColumnizer(columnizer);
    	analysis.getCategorizers().clear();
    	analysis.getCategorizers().add(categorizer);
    	return true;
    }

    /**
     * 
     * @param self
     * @return
     */
    public boolean analysisRefreshEnabled(DocAnalysis analysis) {
		return true;
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
