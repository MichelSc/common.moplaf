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
	boolean visit(Date moment, float amount);

} // DistributionVisitor
