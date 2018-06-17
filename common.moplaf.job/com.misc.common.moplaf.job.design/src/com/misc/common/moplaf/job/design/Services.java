package com.misc.common.moplaf.job.design;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.misc.common.moplaf.job.Plugin;
import com.misc.common.moplaf.job.Task;
import com.misc.common.moplaf.job.TaskDomain;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
    	Plugin.INSTANCE.logInfo("Job myService arg ");
    	Plugin.INSTANCE.logInfo(".. self "+self == null ? "null" : self.eClass().getName());
    	Plugin.INSTANCE.logInfo(".. arg "+arg);
       // TODO Auto-generated code
      return self;
    }
    public EObject myService2(EObject self) {
       	Plugin.INSTANCE.logInfo("Job myService2 no arg ");
    	Plugin.INSTANCE.logInfo(".. self "+self == null ? "null" : self.eClass().getName());
      return self;
    }
    public EList<Task> getNewTasks(EObject self) {
       	Plugin.INSTANCE.logInfo("Job getNewTasks ");
    	Plugin.INSTANCE.logInfo(".. self "+self == null ? "null" : self.eClass().getName());
    	if ( self instanceof TaskDomain ) {
    		TaskDomain domain = (TaskDomain)self;
    		return domain.getNewTasks();
    	}
      return null;
    }
    public String generateName(EObject self, String arg) {
       	Plugin.INSTANCE.logInfo("Job generateName ");
    	Plugin.INSTANCE.logInfo(".. self "+self == null ? "null" : self.eClass().getName());
    	Plugin.INSTANCE.logInfo(".. arg "+arg);
       return "new name";
    }
}
