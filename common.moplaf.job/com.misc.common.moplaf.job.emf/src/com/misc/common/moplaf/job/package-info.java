/**
 * Provides functions to manage runs
 * <ul>
 * <li>
 * {@link Run}: a run of some logic, with support for 
 *   <ul>
 *   <li> controlling if its start is possible</li>
 *   <li> controlling if its cancel is possible</li>
 *   <li> controlling if its reset is possible</li>
 *   <li> returning feedback when finished </li>
 *   <li> returning progress when busy </li>
 *   </ul>
 * </li>
 * <li>
 * {@link Job}: a Run implementing time stamps 
 * </li>
 * <li>
 * {@link JobConsole}: a Job managing parameters as received from the commande line 
 * </li>
 * </ul>
 * An infrastructure is available for externalizing the parameters of a run. This allows to 
 * extract the parameters of a given run or to initialize a run with parameters previously extracted. 
 *   <ul>
 *   <li> {@link RunParams}: an object supporting parameters</li>
 *   <li> {@link ParamsHoldeer}: an object holding set of parameters</li>
 *   </ul>
 */

package com.misc.common.moplaf.job;

