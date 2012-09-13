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
 * A representation of the model object '<em><b>Port Type Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.PortTypeMapping#getBeanMethodName <em>Bean Method Name</em>}</li>
 *   <li>{@link kevoree.PortTypeMapping#getServiceMethodName <em>Service Method Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getPortTypeMapping()
 * @model
 * @generated
 */
public interface PortTypeMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Bean Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bean Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bean Method Name</em>' attribute.
	 * @see #setBeanMethodName(String)
	 * @see kevoree.KevoreePackage#getPortTypeMapping_BeanMethodName()
	 * @model
	 * @generated
	 */
	String getBeanMethodName();

	/**
	 * Sets the value of the '{@link kevoree.PortTypeMapping#getBeanMethodName <em>Bean Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bean Method Name</em>' attribute.
	 * @see #getBeanMethodName()
	 * @generated
	 */
	void setBeanMethodName(String value);

	/**
	 * Returns the value of the '<em><b>Service Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Method Name</em>' attribute.
	 * @see #setServiceMethodName(String)
	 * @see kevoree.KevoreePackage#getPortTypeMapping_ServiceMethodName()
	 * @model
	 * @generated
	 */
	String getServiceMethodName();

	/**
	 * Sets the value of the '{@link kevoree.PortTypeMapping#getServiceMethodName <em>Service Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Method Name</em>' attribute.
	 * @see #getServiceMethodName()
	 * @generated
	 */
	void setServiceMethodName(String value);

} // PortTypeMapping
