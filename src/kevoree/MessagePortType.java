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
 * A representation of the model object '<em><b>Message Port Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.MessagePortType#getFilters <em>Filters</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getMessagePortType()
 * @model
 * @generated
 */
public interface MessagePortType extends PortType {
	/**
	 * Returns the value of the '<em><b>Filters</b></em>' reference list.
	 * The list contents are of type {@link kevoree.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' reference list.
	 * @see kevoree.KevoreePackage#getMessagePortType_Filters()
	 * @model
	 * @generated
	 */
	EList<TypedElement> getFilters();

} // MessagePortType
