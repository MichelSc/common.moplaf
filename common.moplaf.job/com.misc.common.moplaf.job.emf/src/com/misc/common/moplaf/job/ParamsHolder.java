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
 */
package com.misc.common.moplaf.job;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Params Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.ParamsHolder#getRunsParams <em>Runs Params</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.JobPackage#getParamsHolder()
 * @model
 * @generated
 */
public interface ParamsHolder extends EObject {
	/**
	 * Returns the value of the '<em><b>Runs Params</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.RunParams}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runs Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs Params</em>' containment reference list.
	 * @see com.misc.common.moplaf.job.JobPackage#getParamsHolder_RunsParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<RunParams> getRunsParams();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RunParams constructParams(Run run);

} // ParamsHolder
