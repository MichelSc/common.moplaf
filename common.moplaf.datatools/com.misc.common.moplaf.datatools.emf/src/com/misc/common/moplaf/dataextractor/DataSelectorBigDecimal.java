/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
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
package com.misc.common.moplaf.dataextractor;

import java.math.BigDecimal;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Selector Big Decimal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataSelectorBigDecimal#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataSelectorBigDecimal()
 * @model
 * @generated
 */
public interface DataSelectorBigDecimal extends DataSelectorFeature {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigDecimal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataSelectorBigDecimal_Values()
	 * @model
	 * @generated
	 */
	EList<BigDecimal> getValues();

} // DataSelectorBigDecimal
