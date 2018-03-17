/**
 */
package com.misc.common.moplaf.serialize;

import com.misc.common.moplaf.file.FileReaderWriter;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serializable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.serialize.Serializable#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.serialize.Serializable#getScheme <em>Scheme</em>}</li>
 *   <li>{@link com.misc.common.moplaf.serialize.Serializable#getSelectedObjects <em>Selected Objects</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.serialize.SerializePackage#getSerializable()
 * @model
 * @generated
 */
public interface Serializable extends FileReaderWriter {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.common.moplaf.serialize.SerializePackage#getSerializable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.serialize.Serializable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scheme</b></em>' attribute.
	 * The default value is <code>"com.misc.common.moplaf.emf.serialize.xmi.schemes.xmi"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheme</em>' attribute.
	 * @see #setScheme(String)
	 * @see com.misc.common.moplaf.serialize.SerializePackage#getSerializable_Scheme()
	 * @model default="com.misc.common.moplaf.emf.serialize.xmi.schemes.xmi"
	 * @generated
	 */
	String getScheme();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.serialize.Serializable#getScheme <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme</em>' attribute.
	 * @see #getScheme()
	 * @generated
	 */
	void setScheme(String value);

	/**
	 * Returns the value of the '<em><b>Selected Objects</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Objects</em>' reference list.
	 * @see com.misc.common.moplaf.serialize.SerializePackage#getSerializable_SelectedObjects()
	 * @model
	 * @generated
	 */
	EList<EObject> getSelectedObjects();

} // Serializable
