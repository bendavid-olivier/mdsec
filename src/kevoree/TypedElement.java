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
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.TypedElement#getGenericTypes <em>Generic Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getTypedElement()
 * @model
 * @generated
 */
public interface TypedElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Generic Types</b></em>' reference list.
	 * The list contents are of type {@link kevoree.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Types</em>' reference list.
	 * @see kevoree.KevoreePackage#getTypedElement_GenericTypes()
	 * @model
	 * @generated
	 */
	EList<TypedElement> getGenericTypes();

} // TypedElement
