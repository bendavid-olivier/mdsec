/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.Instance#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link kevoree.Instance#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link kevoree.Instance#getMetaData <em>Meta Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definition</em>' reference.
	 * @see #setTypeDefinition(TypeDefinition)
	 * @see kevoree.KevoreePackage#getInstance_TypeDefinition()
	 * @model required="true"
	 * @generated
	 */
	TypeDefinition getTypeDefinition();

	/**
	 * Sets the value of the '{@link kevoree.Instance#getTypeDefinition <em>Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definition</em>' reference.
	 * @see #getTypeDefinition()
	 * @generated
	 */
	void setTypeDefinition(TypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Dictionary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dictionary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dictionary</em>' containment reference.
	 * @see #setDictionary(Dictionary)
	 * @see kevoree.KevoreePackage#getInstance_Dictionary()
	 * @model containment="true"
	 * @generated
	 */
	Dictionary getDictionary();

	/**
	 * Sets the value of the '{@link kevoree.Instance#getDictionary <em>Dictionary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictionary</em>' containment reference.
	 * @see #getDictionary()
	 * @generated
	 */
	void setDictionary(Dictionary value);

	/**
	 * Returns the value of the '<em><b>Meta Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Data</em>' attribute.
	 * @see #setMetaData(String)
	 * @see kevoree.KevoreePackage#getInstance_MetaData()
	 * @model
	 * @generated
	 */
	String getMetaData();

	/**
	 * Sets the value of the '{@link kevoree.Instance#getMetaData <em>Meta Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Data</em>' attribute.
	 * @see #getMetaData()
	 * @generated
	 */
	void setMetaData(String value);

} // Instance
