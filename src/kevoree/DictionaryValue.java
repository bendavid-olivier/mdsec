/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.DictionaryValue#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link kevoree.DictionaryValue#getValue <em>Value</em>}</li>
 *   <li>{@link kevoree.DictionaryValue#getTargetNode <em>Target Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getDictionaryValue()
 * @model
 * @generated
 */
public interface DictionaryValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(DictionaryAttribute)
	 * @see kevoree.KevoreePackage#getDictionaryValue_Attribute()
	 * @model required="true"
	 * @generated
	 */
	DictionaryAttribute getAttribute();

	/**
	 * Sets the value of the '{@link kevoree.DictionaryValue#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(DictionaryAttribute value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see kevoree.KevoreePackage#getDictionaryValue_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link kevoree.DictionaryValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Target Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Node</em>' reference.
	 * @see #setTargetNode(ContainerNode)
	 * @see kevoree.KevoreePackage#getDictionaryValue_TargetNode()
	 * @model
	 * @generated
	 */
	ContainerNode getTargetNode();

	/**
	 * Sets the value of the '{@link kevoree.DictionaryValue#getTargetNode <em>Target Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Node</em>' reference.
	 * @see #getTargetNode()
	 * @generated
	 */
	void setTargetNode(ContainerNode value);

} // DictionaryValue
