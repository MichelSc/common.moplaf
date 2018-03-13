/**
 */
package com.misc.common.moplaf.serialize.impl;

import com.misc.common.moplaf.serialize.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SerializeFactoryImpl extends EFactoryImpl implements SerializeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SerializeFactory init() {
		try {
			SerializeFactory theSerializeFactory = (SerializeFactory)EPackage.Registry.INSTANCE.getEFactory(SerializePackage.eNS_URI);
			if (theSerializeFactory != null) {
				return theSerializeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SerializeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SerializePackage.SERIALIZABLE: return createSerializable();
			case SerializePackage.DESERIALIZABLE: return createDeserializable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Serializable createSerializable() {
		SerializableImpl serializable = new SerializableImpl();
		return serializable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deserializable createDeserializable() {
		DeserializableImpl deserializable = new DeserializableImpl();
		return deserializable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializePackage getSerializePackage() {
		return (SerializePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SerializePackage getPackage() {
		return SerializePackage.eINSTANCE;
	}

} //SerializeFactoryImpl
