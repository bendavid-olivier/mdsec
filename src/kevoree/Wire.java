/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.Wire#getPorts <em>Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getWire()
 * @model
 * @generated
 */
public interface Wire extends EObject {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' reference list.
	 * The list contents are of type {@link kevoree.PortTypeRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' reference list.
	 * @see kevoree.KevoreePackage#getWire_Ports()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<PortTypeRef> getPorts();

} // Wire
