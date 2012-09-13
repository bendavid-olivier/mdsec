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
 * A representation of the model object '<em><b>Dictionary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.Dictionary#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getDictionary()
 * @model
 * @generated
 */
public interface Dictionary extends EObject {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link kevoree.DictionaryValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see kevoree.KevoreePackage#getDictionary_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<DictionaryValue> getValues();

} // Dictionary
