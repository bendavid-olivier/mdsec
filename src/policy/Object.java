/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package policy;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link policy.Object#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link policy.Object#getOperations <em>Operations</em>}</li>
 *   <li>{@link policy.Object#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link policy.Object#isIsInstance <em>Is Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see policy.PolicyPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends PolicyElement {
	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' reference list.
	 * The list contents are of type {@link policy.Permission}.
	 * It is bidirectional and its opposite is '{@link policy.Permission#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permissions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' reference list.
	 * @see policy.PolicyPackage#getObject_Permissions()
	 * @see policy.Permission#getObjects
	 * @model opposite="objects"
	 * @generated
	 */
	EList<Permission> getPermissions();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' reference list.
	 * The list contents are of type {@link policy.Operation}.
	 * It is bidirectional and its opposite is '{@link policy.Operation#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' reference list.
	 * @see policy.PolicyPackage#getObject_Operations()
	 * @see policy.Operation#getObjects
	 * @model opposite="objects" required="true"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * Returns the value of the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Name</em>' attribute.
	 * @see #setNodeName(String)
	 * @see policy.PolicyPackage#getObject_NodeName()
	 * @model
	 * @generated
	 */
	String getNodeName();

	/**
	 * Sets the value of the '{@link policy.Object#getNodeName <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Name</em>' attribute.
	 * @see #getNodeName()
	 * @generated
	 */
	void setNodeName(String value);

	/**
	 * Returns the value of the '<em><b>Is Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Instance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Instance</em>' attribute.
	 * @see #setIsInstance(boolean)
	 * @see policy.PolicyPackage#getObject_IsInstance()
	 * @model
	 * @generated
	 */
	boolean isIsInstance();

	/**
	 * Sets the value of the '{@link policy.Object#isIsInstance <em>Is Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Instance</em>' attribute.
	 * @see #isIsInstance()
	 * @generated
	 */
	void setIsInstance(boolean value);

} // Object
