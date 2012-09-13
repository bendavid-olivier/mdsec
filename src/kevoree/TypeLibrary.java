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
 * A representation of the model object '<em><b>Type Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.TypeLibrary#getSubTypes <em>Sub Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getTypeLibrary()
 * @model
 * @generated
 */
public interface TypeLibrary extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sub Types</b></em>' reference list.
	 * The list contents are of type {@link kevoree.TypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Types</em>' reference list.
	 * @see kevoree.KevoreePackage#getTypeLibrary_SubTypes()
	 * @model
	 * @generated
	 */
	EList<TypeDefinition> getSubTypes();

} // TypeLibrary
