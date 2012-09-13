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
 * A representation of the model object '<em><b>Dictionary Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.DictionaryType#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link kevoree.DictionaryType#getDefaultValues <em>Default Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getDictionaryType()
 * @model
 * @generated
 */
public interface DictionaryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link kevoree.DictionaryAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see kevoree.KevoreePackage#getDictionaryType_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DictionaryAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Default Values</b></em>' containment reference list.
	 * The list contents are of type {@link kevoree.DictionaryValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Values</em>' containment reference list.
	 * @see kevoree.KevoreePackage#getDictionaryType_DefaultValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<DictionaryValue> getDefaultValues();

} // DictionaryType
