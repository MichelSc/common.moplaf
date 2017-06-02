/**
 * Provides functions to managing runs
 * <ul>
 * <li>
 * {@link Run}: a run of some logic, with support for 
 *   <ul>
 *   <li> controlling if its start is possible</li>
 *   <li> controlling if its cancel is possible</li>
 *   <li> controlling if its reset is possible</li>
 *   <li> returning feedback when returned </li>
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
 * An infrastructure is available for externalizing the parameters: {@link RunParams}. 
 */

package com.misc.common.moplaf.job;

