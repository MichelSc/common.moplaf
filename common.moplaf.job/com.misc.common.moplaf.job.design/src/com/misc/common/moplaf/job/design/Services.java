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
    public EList<Task> getNewTasks(TaskDomain domain) {
   		return domain.getNewTasks();
    }
    
    /**
     * 
     * @param self
     * @return
     */
    public boolean runRunEnabled(Run run) {
   		return run.getRunFeedback().isEnabled();
    }
    /**
     * 
     * @param self
     * @return
     */
    public boolean runRun(Run run) {
		ReturnFeedback feedback = run.run();
		return feedback.isSuccess();
    }
    /**
     * 
     * @param self
     * @return
     */
    public boolean runResetEnabled(Run run) {
   		return run.getResetFeedback().isEnabled();
    }
    /**
     * 
     * @param self
     * @return
     */
    public boolean runReset(Run run) {
		run.reset();
		return true;
    }
    /**
     * 
     * @param self
     * @return
     */
    public boolean runCancelEnabled(Run run) {
   		return run.getCancelFeedback().isEnabled();
    }
    /**
     * 
     * @param self
     * @return
     */
    public boolean runCancel(Run run) {
		run.reset();
		return true;
    }
    /**
     * 
     * @param self
     * @return
     */
    public boolean docFlushEnabled(Doc doc) {
   		return doc.getFlushFeedback().isEnabled();
    }
    /**
     * 
     * @param self
     * @return
     */
    public boolean docFlush(Doc doc) {
   		doc.flush();
   		return true;
    }
    /**
     * 
     * @param self
     * @return
     */
    public boolean docCloneEnabled(Doc doc) {
   		return doc.getCloneFeedback().isEnabled();
    }
    /**
     * 
     * @param self
     * @return
     */
    public boolean docClone(Doc doc) {
		doc.clone();
		return true;
    }

    public boolean taskIsValidInput(Task task, Doc doc) {
   		return task.isValidInput(doc).isEnabled();
    }
    
    public boolean taskIsValidOutput(Task task, Doc doc) {
   		return task.isValidOutput(doc).isEnabled();
    }

}
