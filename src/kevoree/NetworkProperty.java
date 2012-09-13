/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.NetworkProperty#getValue <em>Value</em>}</li>
 *   <li>{@link kevoree.NetworkProperty#getLastCheck <em>Last Check</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getNetworkProperty()
 * @model
 * @generated
 */
public interface NetworkProperty extends NamedElement {
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
	 * @see kevoree.KevoreePackage#getNetworkProperty_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link kevoree.NetworkProperty#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Last Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Check</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Check</em>' attribute.
	 * @see #setLastCheck(String)
	 * @see kevoree.KevoreePackage#getNetworkProperty_LastCheck()
	 * @model
	 * @generated
	 */
	String getLastCheck();

	/**
	 * Sets the value of the '{@link kevoree.NetworkProperty#getLastCheck <em>Last Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Check</em>' attribute.
	 * @see #getLastCheck()
	 * @generated
	 */
	void setLastCheck(String value);

} // NetworkProperty
