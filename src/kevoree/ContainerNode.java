/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.ContainerNode#getComponents <em>Components</em>}</li>
 *   <li>{@link kevoree.ContainerNode#getHosts <em>Hosts</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getContainerNode()
 * @model
 * @generated
 */
public interface ContainerNode extends NamedElement, Instance {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link kevoree.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see kevoree.KevoreePackage#getContainerNode_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentInstance> getComponents();

	/**
	 * Returns the value of the '<em><b>Hosts</b></em>' reference list.
	 * The list contents are of type {@link kevoree.ContainerNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hosts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosts</em>' reference list.
	 * @see kevoree.KevoreePackage#getContainerNode_Hosts()
	 * @model
	 * @generated
	 */
	EList<ContainerNode> getHosts();

} // ContainerNode
