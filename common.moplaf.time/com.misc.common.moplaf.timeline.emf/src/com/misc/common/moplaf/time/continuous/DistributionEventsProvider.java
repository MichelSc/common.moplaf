/**
 */
package com.misc.common.moplaf.time.continuous;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distribution Events Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.DistributionEventsProvider#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.DistributionEventsProvider#getProvidedEvents <em>Provided Events</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getDistributionEventsProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DistributionEventsProvider extends EObject {
	/**
	 * Returns the value of the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution</em>' reference.
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getDistributionEventsProvider_Distribution()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Distribution getDistribution();

	/**
	 * Returns the value of the '<em><b>Provided Events</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.time.continuous.DistributionEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Events</em>' reference list.
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getDistributionEventsProvider_ProvidedEvents()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<DistributionEvent> getProvidedEvents();

} // DistributionEventsProvider
