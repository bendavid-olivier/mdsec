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
 * A representation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link policy.Permission#getOperations <em>Operations</em>}</li>
 *   <li>{@link policy.Permission#getObjects <em>Objects</em>}</li>
 *   <li>{@link policy.Permission#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see policy.PolicyPackage#getPermission()
 * @model
 * @generated
 */
public interface Permission extends PolicyElement {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' reference list.
	 * The list contents are of type {@link policy.Operation}.
	 * It is bidirectional and its opposite is '{@link policy.Operation#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' reference list.
	 * @see policy.PolicyPackage#getPermission_Operations()
	 * @see policy.Operation#getPermissions
	 * @model opposite="permissions"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' reference list.
	 * The list contents are of type {@link policy.Object}.
	 * It is bidirectional and its opposite is '{@link policy.Object#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' reference list.
	 * @see policy.PolicyPackage#getPermission_Objects()
	 * @see policy.Object#getPermissions
	 * @model opposite="permissions"
	 * @generated
	 */
	EList<policy.Object> getObjects();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link policy.Role}.
	 * It is bidirectional and its opposite is '{@link policy.Role#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see policy.PolicyPackage#getPermission_Roles()
	 * @see policy.Role#getPermissions
	 * @model opposite="permissions"
	 * @generated
	 */
	EList<Role> getRoles();

} // Permission
