/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 * The package provides support for managing <em>Runs</em>. A Run is a piece a logic to be executed as a whole. 
 * Support is provided for enforcing its life cycle, for executing it, for monitoring its progress.
 * <p>
 * The end result of running a Run is a {@link com.misc.common.moplaf.common.ReturnFeedback}. A ReturnFeedback
 * informs the client whether the Run was successful or not, and gives the reason why this was possibly not
 * successful. 
 * <p> 
 * A {@link Run} supports the following operations
 *   <ul>
 *   <li> <code>Run.run()</code>: start the execution of the Run</li>
 *   <li> <code>Run.reset()</code>: initializes an already run Run</li>
 *   <li> <code>Run.cancel()</code>: instructs a running Run to Stop</li>
 *   </ul>
 * <p>
 * The package provides a mechanism for informing the client whether an operation is possible or not: {@link com.misc.common.moplaf.common.EnabledFeedback}.
 * An EnabledFeedback returns whether the operation is possible or not, and the reason why it is not possible. The EnabledFeedback can
 * be used e.g. for controlling when a user action must be enabled or not. A Run provides the following EnabledFeedbacks. 
 *   <ul>
 *   <li> <code>Run.getRunFeedback()</code>: the Run may be started (or run)</li>
 *   <li> <code>Run.getResetFeedback()</code>: the Run may be reset</li>
 *   <li> <code>Run.getCancelFeedback()</code>: the Run may be cancelled</li>
 *   </ul>
 * <p>
 * A Run can be executed synchronously or asynchronously. When executed asynchronously, the Run can inform its 
 * execution context ({@link com.misc.common.moplaf.job.RunContext}) about its progress. The execution context can then use it to display the
 * later in e.g. a progress bar. The execution context can inform the Run to stop with the method <code>Run.cancel()</code>.
 * The Run must then at some appropriate moment query if the Run is to be cancelled (<code>Run.isCancelled()</code>) 
 * and terminate if required.
 * <p> 
 * A {@link Job} is a Run implementing time stamps and a status field. 
 * <p> 
 * A {@link JobConsole} is a Job managing parameters as received from the commande line 
 * <p> 
 * An infrastructure is available for externalizing the parameters of a run. This allows to 
 * extract the parameters of a given run or to initialize a run with parameters previously extracted: 
 *   <ul>
 *   <li> {@link RunParams}: an object supporting parameters</li>
 *   <li> {@link ParamsHolder}: an object holding set of parameters</li>
 *   </ul>
 * <p>
 * A Run can be executed programatically, can be triggered by an action from the user, or can be scheduled.
 * The class {@link com.misc.common.moplaf.job.jobclient.JobScheduler} provides an infrastructure for scheduling Runs.
 * This packages provides as well functionality for executing the Run remotely.
 * <p>
 * Runs can be published in the host environment thanks to the extension point com.misc.common.moplaf.job.emf.run_factory. 
 */


package com.misc.common.moplaf.job;
