/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.PortType#isSynchrone <em>Synchrone</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getPortType()
 * @model abstract="true"
 * @generated
 */
public interface PortType extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Synchrone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchrone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchrone</em>' attribute.
	 * @see #setSynchrone(boolean)
	 * @see kevoree.KevoreePackage#getPortType_Synchrone()
	 * @model
	 * @generated
	 */
	boolean isSynchrone();

	/**
	 * Sets the value of the '{@link kevoree.PortType#isSynchrone <em>Synchrone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchrone</em>' attribute.
	 * @see #isSynchrone()
	 * @generated
	 */
	void setSynchrone(boolean value);

} // PortType
