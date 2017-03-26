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
package com.misc.common.moplaf.flock;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chain Flock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.ChainFlock#getMountedFlocks <em>Mounted Flocks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.ChainFlock#getMounterFlock <em>Mounter Flock</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.ChainFlock#getNextFlock <em>Next Flock</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.ChainFlock#getPreviousFlock <em>Previous Flock</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.ChainFlock#getChain <em>Chain</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.ChainFlock#getFlock <em>Flock</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.ChainFlock#getSequenceNr <em>Sequence Nr</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.flock.FlockPackage#getChainFlock()
 * @model abstract="true"
 * @generated
 */
public interface ChainFlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Mounted Flocks</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.flock.ChainFlock}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.flock.ChainFlock#getMounterFlock <em>Mounter Flock</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mounted Flocks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounted Flocks</em>' reference list.
	 * @see com.misc.common.moplaf.flock.FlockPackage#getChainFlock_MountedFlocks()
	 * @see com.misc.common.moplaf.flock.ChainFlock#getMounterFlock
	 * @model opposite="MounterFlock"
	 * @generated
	 */
	EList<ChainFlock> getMountedFlocks();

	/**
	 * Returns the value of the '<em><b>Mounter Flock</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.flock.ChainFlock#getMountedFlocks <em>Mounted Flocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mounter Flock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounter Flock</em>' reference.
	 * @see #setMounterFlock(ChainFlock)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getChainFlock_MounterFlock()
	 * @see com.misc.common.moplaf.flock.ChainFlock#getMountedFlocks
	 * @model opposite="MountedFlocks"
	 * @generated
	 */
	ChainFlock getMounterFlock();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.ChainFlock#getMounterFlock <em>Mounter Flock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mounter Flock</em>' reference.
	 * @see #getMounterFlock()
	 * @generated
	 */
	void setMounterFlock(ChainFlock value);

	/**
	 * Returns the value of the '<em><b>Next Flock</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.flock.ChainFlock#getPreviousFlock <em>Previous Flock</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Flock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Flock</em>' reference.
	 * @see #setNextFlock(ChainFlock)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getChainFlock_NextFlock()
	 * @see com.misc.common.moplaf.flock.ChainFlock#getPreviousFlock
	 * @model opposite="PreviousFlock"
	 * @generated
	 */
	ChainFlock getNextFlock();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.ChainFlock#getNextFlock <em>Next Flock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Flock</em>' reference.
	 * @see #getNextFlock()
	 * @generated
	 */
	void setNextFlock(ChainFlock value);

	/**
	 * Returns the value of the '<em><b>Previous Flock</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.flock.ChainFlock#getNextFlock <em>Next Flock</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Flock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Flock</em>' reference.
	 * @see #setPreviousFlock(ChainFlock)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getChainFlock_PreviousFlock()
	 * @see com.misc.common.moplaf.flock.ChainFlock#getNextFlock
	 * @model opposite="NextFlock"
	 * @generated
	 */
	ChainFlock getPreviousFlock();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.ChainFlock#getPreviousFlock <em>Previous Flock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Flock</em>' reference.
	 * @see #getPreviousFlock()
	 * @generated
	 */
	void setPreviousFlock(ChainFlock value);

	/**
	 * Returns the value of the '<em><b>Chain</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.flock.Chain#getFlocks <em>Flocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chain</em>' reference.
	 * @see #setChain(Chain)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getChainFlock_Chain()
	 * @see com.misc.common.moplaf.flock.Chain#getFlocks
	 * @model opposite="Flocks"
	 * @generated
	 */
	Chain getChain();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.ChainFlock#getChain <em>Chain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chain</em>' reference.
	 * @see #getChain()
	 * @generated
	 */
	void setChain(Chain value);

	/**
	 * Returns the value of the '<em><b>Flock</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.flock.Flock#getChains <em>Chains</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flock</em>' reference.
	 * @see #setFlock(Flock)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getChainFlock_Flock()
	 * @see com.misc.common.moplaf.flock.Flock#getChains
	 * @model opposite="Chains"
	 * @generated
	 */
	Flock getFlock();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.ChainFlock#getFlock <em>Flock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flock</em>' reference.
	 * @see #getFlock()
	 * @generated
	 */
	void setFlock(Flock value);

	/**
	 * Returns the value of the '<em><b>Sequence Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Nr</em>' attribute.
	 * @see #setSequenceNr(int)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getChainFlock_SequenceNr()
	 * @model
	 * @generated
	 */
	int getSequenceNr();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.ChainFlock#getSequenceNr <em>Sequence Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Nr</em>' attribute.
	 * @see #getSequenceNr()
	 * @generated
	 */
	void setSequenceNr(int value);

} // ChainFlock
