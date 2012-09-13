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
 * A representation of the model object '<em><b>Node Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.NodeNetwork#getLink <em>Link</em>}</li>
 *   <li>{@link kevoree.NodeNetwork#getInitBy <em>Init By</em>}</li>
 *   <li>{@link kevoree.NodeNetwork#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getNodeNetwork()
 * @model
 * @generated
 */
public interface NodeNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link kevoree.NodeLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see kevoree.KevoreePackage#getNodeNetwork_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeLink> getLink();

	/**
	 * Returns the value of the '<em><b>Init By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init By</em>' reference.
	 * @see #setInitBy(ContainerNode)
	 * @see kevoree.KevoreePackage#getNodeNetwork_InitBy()
	 * @model
	 * @generated
	 */
	ContainerNode getInitBy();

	/**
	 * Sets the value of the '{@link kevoree.NodeNetwork#getInitBy <em>Init By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init By</em>' reference.
	 * @see #getInitBy()
	 * @generated
	 */
	void setInitBy(ContainerNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ContainerNode)
	 * @see kevoree.KevoreePackage#getNodeNetwork_Target()
	 * @model required="true"
	 * @generated
	 */
	ContainerNode getTarget();

	/**
	 * Sets the value of the '{@link kevoree.NodeNetwork#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ContainerNode value);

} // NodeNetwork
