package com.misc.common.moplaf.job.design;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.job.Doc;
import com.misc.common.moplaf.job.Plugin;
import com.misc.common.moplaf.job.Run;
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

    /**
     * 
     * @param self
     * @return
     */
    public EList<Task> getNewTasks(EObject self) {
    	if ( self instanceof TaskDomain ) {
    		TaskDomain domain = (TaskDomain)self;
    		return domain.getNewTasks();
    	}
      return null;
    }
    
    /**
     * 
     * @param self
     * @return
     */
    public boolean runRunEnabled(EObject self) {
    	if ( self instanceof Run ) {
    		Run run = (Run)self;
    		return run.getRunFeedback().isEnabled();
    	}
    	return false;
    }
    /**
     * 
     * @param self
     * @return
     */
    public boolean runRun(EObject self) {
    	if ( self instanceof Run ) {
    		Run run = (Run)self;
    		ReturnFeedback feedback = run.run();
    		return feedback.isSuccess();
    	}
    	return false;
    }
    /**
     * 
     * @param self
     * @return
     */
    public boolean runResetEnabled(EObject self) {
    	if ( self instanceof Run ) {
    		Run run = (Run)self;
    		return run.getResetFeedback().isEnabled();
    	}
    	return false;
    }
    /**
     * 
     * @param self
     * @return
     */
    public boolean runReset(EObject self) {
    	if ( self instanceof Run ) {
    		Run run = (Run)self;
    		run.reset();
    		return true;
    	}
    	return false;
    }
    /**
     * 
     * @param self
     * @return
     */
    public boolean runCancelEnabled(EObject self) {
    	if ( self instanceof Run ) {
    		Run run = (Run)self;
    		return run.getCancelFeedback().isEnabled();
    	}
    	return false;
    }
    /**
     * 
     * @param self
     * @return
     */
    public boolean runCancel(EObject self) {
    	if ( self instanceof Run ) {
    		Run run = (Run)self;
    		run.reset();
    		return true;
    	}
    	return false;
    }
    /**
     * 
     * @param self
     * @return
     */
    public boolean docFlushEnabled(EObject self) {
    	if ( self instanceof Doc ) {
    		Doc doc = (Doc)self;
    		return doc.getFlushFeedback().isEnabled();
    	}
    	return false;
    }
    /**
     * 
     * @param self
     * @return
     */
    public boolean docFlush(EObject self) {
    	if ( self instanceof Doc ) {
    		Doc doc = (Doc)self;
    		doc.flush();
    		return true;
    	}
    	return false;
    }
    /**
     * 
     * @param self
     * @return
     */
    public boolean docCloneEnabled(EObject self) {
    	if ( self instanceof Doc ) {
    		Doc doc = (Doc)self;
    		return doc.getCloneFeedback().isEnabled();
    	}
    	return false;
    }
    /**
     * 
     * @param self
     * @return
     */
    public boolean docClone(EObject self) {
    	if ( self instanceof Doc ) {
    		Doc doc = (Doc)self;
    		doc.clone();
    		return true;
    	}
    	return false;
    }

    public boolean taskIsValidInput(Task task, Doc doc) {
   		return task.isValidInput(doc).isEnabled();
    }
    
    public boolean taskIsValidOutput(Task task, Doc doc) {
   		return task.isValidOutput(doc).isEnabled();
    }

}
