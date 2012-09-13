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
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.Port#getPortTypeRef <em>Port Type Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Port Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Type Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Type Ref</em>' reference.
	 * @see #setPortTypeRef(PortTypeRef)
	 * @see kevoree.KevoreePackage#getPort_PortTypeRef()
	 * @model required="true"
	 * @generated
	 */
	PortTypeRef getPortTypeRef();

	/**
	 * Sets the value of the '{@link kevoree.Port#getPortTypeRef <em>Port Type Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Type Ref</em>' reference.
	 * @see #getPortTypeRef()
	 * @generated
	 */
	void setPortTypeRef(PortTypeRef value);

} // Port
