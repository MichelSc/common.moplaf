package com.misc.common.moplaf.analysis.util;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import com.misc.common.moplaf.analysis.AnalysisDomain;
import com.misc.common.moplaf.analysis.DocAnalysis;
import com.misc.common.moplaf.datatools.DataTool;
import com.misc.common.moplaf.datatools.DataToolType;

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
    public EList<DataTool> getNewDataTools(AnalysisDomain domain, DocAnalysis analysis, DataToolType type) {
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
