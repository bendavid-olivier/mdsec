/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBinding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.MBinding#getPort <em>Port</em>}</li>
 *   <li>{@link kevoree.MBinding#getHub <em>Hub</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getMBinding()
 * @model
 * @generated
 */
public interface MBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(Port)
	 * @see kevoree.KevoreePackage#getMBinding_Port()
	 * @model required="true"
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link kevoree.MBinding#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

	/**
	 * Returns the value of the '<em><b>Hub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hub</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hub</em>' reference.
	 * @see #setHub(Channel)
	 * @see kevoree.KevoreePackage#getMBinding_Hub()
	 * @model required="true"
	 * @generated
	 */
	Channel getHub();

	/**
	 * Sets the value of the '{@link kevoree.MBinding#getHub <em>Hub</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hub</em>' reference.
	 * @see #getHub()
	 * @generated
	 */
	void setHub(Channel value);

} // MBinding
