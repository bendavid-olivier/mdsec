/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.DictionaryAttribute#isOptional <em>Optional</em>}</li>
 *   <li>{@link kevoree.DictionaryAttribute#isState <em>State</em>}</li>
 *   <li>{@link kevoree.DictionaryAttribute#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link kevoree.DictionaryAttribute#isFragmentDependant <em>Fragment Dependant</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getDictionaryAttribute()
 * @model
 * @generated
 */
public interface DictionaryAttribute extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see kevoree.KevoreePackage#getDictionaryAttribute_Optional()
	 * @model
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link kevoree.DictionaryAttribute#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(boolean)
	 * @see kevoree.KevoreePackage#getDictionaryAttribute_State()
	 * @model
	 * @generated
	 */
	boolean isState();

	/**
	 * Sets the value of the '{@link kevoree.DictionaryAttribute#isState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #isState()
	 * @generated
	 */
	void setState(boolean value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' attribute.
	 * @see #setDatatype(String)
	 * @see kevoree.KevoreePackage#getDictionaryAttribute_Datatype()
	 * @model
	 * @generated
	 */
	String getDatatype();

	/**
	 * Sets the value of the '{@link kevoree.DictionaryAttribute#getDatatype <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' attribute.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(String value);

	/**
	 * Returns the value of the '<em><b>Fragment Dependant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragment Dependant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragment Dependant</em>' attribute.
	 * @see #setFragmentDependant(boolean)
	 * @see kevoree.KevoreePackage#getDictionaryAttribute_FragmentDependant()
	 * @model
	 * @generated
	 */
	boolean isFragmentDependant();

	/**
	 * Sets the value of the '{@link kevoree.DictionaryAttribute#isFragmentDependant <em>Fragment Dependant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fragment Dependant</em>' attribute.
	 * @see #isFragmentDependant()
	 * @generated
	 */
	void setFragmentDependant(boolean value);

} // DictionaryAttribute
