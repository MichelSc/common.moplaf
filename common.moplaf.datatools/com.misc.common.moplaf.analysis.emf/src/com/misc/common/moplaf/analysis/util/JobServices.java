package com.misc.common.moplaf.analysis.util;

import org.eclipse.emf.common.util.EList;

import com.misc.common.moplaf.analysis.DocAnalysis;
import com.misc.common.moplaf.datatools.DataTool;
import com.misc.common.moplaf.datatools.DataToolType;
import com.misc.common.moplaf.job.Doc;

/**
 * The services class used by VSM.
 */
public class JobServices {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    /**
     * 
     * @param self
     * @return
     */
    public EList<DataTool> getNewDataTools(Doc doc, DataToolType type) {
    	// TODO
   		return null;
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
