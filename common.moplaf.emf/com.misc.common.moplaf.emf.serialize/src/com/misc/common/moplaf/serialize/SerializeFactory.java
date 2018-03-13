/**
 */
package com.misc.common.moplaf.serialize;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.serialize.SerializePackage
 * @generated
 */
public interface SerializeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SerializeFactory eINSTANCE = com.misc.common.moplaf.serialize.impl.SerializeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Serializable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serializable</em>'.
	 * @generated
	 */
	Serializable createSerializable();

	/**
	 * Returns a new object of class '<em>Deserializable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deserializable</em>'.
	 * @generated
	 */
	Deserializable createDeserializable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SerializePackage getSerializePackage();

} //SerializeFactory
