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
 * A representation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.NodeType#getManagedPrimitiveTypes <em>Managed Primitive Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getNodeType()
 * @model
 * @generated
 */
public interface NodeType extends LifeCycleTypeDefinition {
	/**
	 * Returns the value of the '<em><b>Managed Primitive Types</b></em>' reference list.
	 * The list contents are of type {@link kevoree.AdaptationPrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managed Primitive Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managed Primitive Types</em>' reference list.
	 * @see kevoree.KevoreePackage#getNodeType_ManagedPrimitiveTypes()
	 * @model
	 * @generated
	 */
	EList<AdaptationPrimitiveType> getManagedPrimitiveTypes();

} // NodeType
