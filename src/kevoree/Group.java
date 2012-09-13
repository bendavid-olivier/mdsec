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
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.Group#getSubNodes <em>Sub Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends Instance {
	/**
	 * Returns the value of the '<em><b>Sub Nodes</b></em>' reference list.
	 * The list contents are of type {@link kevoree.ContainerNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Nodes</em>' reference list.
	 * @see kevoree.KevoreePackage#getGroup_SubNodes()
	 * @model
	 * @generated
	 */
	EList<ContainerNode> getSubNodes();

} // Group
