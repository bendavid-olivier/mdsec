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
 * A representation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.TypeDefinition#getDeployUnits <em>Deploy Units</em>}</li>
 *   <li>{@link kevoree.TypeDefinition#getFactoryBean <em>Factory Bean</em>}</li>
 *   <li>{@link kevoree.TypeDefinition#getBean <em>Bean</em>}</li>
 *   <li>{@link kevoree.TypeDefinition#getDictionaryType <em>Dictionary Type</em>}</li>
 *   <li>{@link kevoree.TypeDefinition#getSuperTypes <em>Super Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getTypeDefinition()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TypeDefinition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Deploy Units</b></em>' reference list.
	 * The list contents are of type {@link kevoree.DeployUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deploy Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy Units</em>' reference list.
	 * @see kevoree.KevoreePackage#getTypeDefinition_DeployUnits()
	 * @model required="true"
	 * @generated
	 */
	EList<DeployUnit> getDeployUnits();

	/**
	 * Returns the value of the '<em><b>Factory Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Bean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Bean</em>' attribute.
	 * @see #setFactoryBean(String)
	 * @see kevoree.KevoreePackage#getTypeDefinition_FactoryBean()
	 * @model
	 * @generated
	 */
	String getFactoryBean();

	/**
	 * Sets the value of the '{@link kevoree.TypeDefinition#getFactoryBean <em>Factory Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Bean</em>' attribute.
	 * @see #getFactoryBean()
	 * @generated
	 */
	void setFactoryBean(String value);

	/**
	 * Returns the value of the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bean</em>' attribute.
	 * @see #setBean(String)
	 * @see kevoree.KevoreePackage#getTypeDefinition_Bean()
	 * @model
	 * @generated
	 */
	String getBean();

	/**
	 * Sets the value of the '{@link kevoree.TypeDefinition#getBean <em>Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bean</em>' attribute.
	 * @see #getBean()
	 * @generated
	 */
	void setBean(String value);

	/**
	 * Returns the value of the '<em><b>Dictionary Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dictionary Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dictionary Type</em>' containment reference.
	 * @see #setDictionaryType(DictionaryType)
	 * @see kevoree.KevoreePackage#getTypeDefinition_DictionaryType()
	 * @model containment="true"
	 * @generated
	 */
	DictionaryType getDictionaryType();

	/**
	 * Sets the value of the '{@link kevoree.TypeDefinition#getDictionaryType <em>Dictionary Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictionary Type</em>' containment reference.
	 * @see #getDictionaryType()
	 * @generated
	 */
	void setDictionaryType(DictionaryType value);

	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' reference list.
	 * The list contents are of type {@link kevoree.TypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Types</em>' reference list.
	 * @see kevoree.KevoreePackage#getTypeDefinition_SuperTypes()
	 * @model
	 * @generated
	 */
	EList<TypeDefinition> getSuperTypes();

} // TypeDefinition
