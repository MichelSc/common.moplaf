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
package com.misc.common.moplaf.time.continuous;

import java.util.Date;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distribution Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getDistributionVisitor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DistributionVisitor  {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	boolean visit(Date moment, double amount);

} // DistributionVisitor
