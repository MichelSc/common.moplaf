package com.misc.common.moplaf.job.design;

import org.eclipse.emf.ecore.EObject;

import com.misc.common.moplaf.job.Plugin;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
    	Plugin.INSTANCE.logInfo("Job myService arg ");
    	Plugin.INSTANCE.logInfo(".. self "+(self == null ? "null" : self.eClass().getName()));
    	Plugin.INSTANCE.logInfo(".. arg "+arg);
       // TODO Auto-generated code
      return self;
    }
    public EObject myService2(EObject self) {
       	Plugin.INSTANCE.logInfo("Job myService2 no arg ");
    	Plugin.INSTANCE.logInfo(".. self "+(self == null ? "null" : self.eClass().getName()));
      return self;
    }
    public EObject myService3(EObject self, EObject param) {
       	Plugin.INSTANCE.logInfo("Job myService3 object param ");
    	Plugin.INSTANCE.logInfo(".. self "+(self == null ? "null" : self.eClass().getName()));
    	Plugin.INSTANCE.logInfo(".. param "+(param == null ? "null" : param.eClass().getName()));
      return self;
    }
    public String generateName(EObject self, String arg) {
       	Plugin.INSTANCE.logInfo("Job generateName ");
    	Plugin.INSTANCE.logInfo(".. self "+self == null ? "null" : self.eClass().getName());
    	Plugin.INSTANCE.logInfo(".. arg "+arg);
       return "new name";
    }


}
