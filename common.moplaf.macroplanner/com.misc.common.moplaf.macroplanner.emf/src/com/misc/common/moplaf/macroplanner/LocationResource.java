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
package com.misc.common.moplaf.macroplanner;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.LocationResource#getLocation <em>Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.LocationResource#getResource <em>Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.LocationResource#getCode <em>Code</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.LocationResource#getAvailabilities <em>Availabilities</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getLocationResource()
 * @model
 * @generated
 */
public interface LocationResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.Location#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' container reference.
	 * @see #setLocation(Location)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getLocationResource_Location()
	 * @see com.misc.common.moplaf.macroplanner.Location#getResources
	 * @model opposite="Resources" required="true" transient="false"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.LocationResource#getLocation <em>Location</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' container reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Resource)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getLocationResource_Resource()
	 * @model
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.LocationResource#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getLocationResource_Code()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Returns the value of the '<em><b>Availabilities</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.Availability}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.Availability#getLocationResource <em>Location Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availabilities</em>' reference list.
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getLocationResource_Availabilities()
	 * @see com.misc.common.moplaf.macroplanner.Availability#getLocationResource
	 * @model opposite="LocationResource"
	 * @generated
	 */
	EList<Availability> getAvailabilities();

} // LocationResource
