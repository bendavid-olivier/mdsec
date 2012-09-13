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
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link policy.Role#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link policy.Role#getUsers <em>Users</em>}</li>
 *   <li>{@link policy.Role#getSessions <em>Sessions</em>}</li>
 *   <li>{@link policy.Role#getSsod <em>Ssod</em>}</li>
 *   <li>{@link policy.Role#getSsodOpp <em>Ssod Opp</em>}</li>
 *   <li>{@link policy.Role#getDsod <em>Dsod</em>}</li>
 *   <li>{@link policy.Role#getDsodOpp <em>Dsod Opp</em>}</li>
 *   <li>{@link policy.Role#getRh <em>Rh</em>}</li>
 *   <li>{@link policy.Role#getRhOpp <em>Rh Opp</em>}</li>
 * </ul>
 * </p>
 *
 * @see policy.PolicyPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends PolicyElement {
	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' reference list.
	 * The list contents are of type {@link policy.Permission}.
	 * It is bidirectional and its opposite is '{@link policy.Permission#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permissions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' reference list.
	 * @see policy.PolicyPackage#getRole_Permissions()
	 * @see policy.Permission#getRoles
	 * @model opposite="roles"
	 * @generated
	 */
	EList<Permission> getPermissions();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' reference list.
	 * The list contents are of type {@link policy.User}.
	 * It is bidirectional and its opposite is '{@link policy.User#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' reference list.
	 * @see policy.PolicyPackage#getRole_Users()
	 * @see policy.User#getRoles
	 * @model opposite="roles"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Sessions</b></em>' reference list.
	 * The list contents are of type {@link policy.Session}.
	 * It is bidirectional and its opposite is '{@link policy.Session#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sessions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sessions</em>' reference list.
	 * @see policy.PolicyPackage#getRole_Sessions()
	 * @see policy.Session#getRoles
	 * @model opposite="roles"
	 * @generated
	 */
	EList<Session> getSessions();

	/**
	 * Returns the value of the '<em><b>Ssod</b></em>' reference list.
	 * The list contents are of type {@link policy.Role}.
	 * It is bidirectional and its opposite is '{@link policy.Role#getSsodOpp <em>Ssod Opp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssod</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssod</em>' reference list.
	 * @see policy.PolicyPackage#getRole_Ssod()
	 * @see policy.Role#getSsodOpp
	 * @model opposite="ssodOpp"
	 * @generated
	 */
	EList<Role> getSsod();

	/**
	 * Returns the value of the '<em><b>Ssod Opp</b></em>' reference list.
	 * The list contents are of type {@link policy.Role}.
	 * It is bidirectional and its opposite is '{@link policy.Role#getSsod <em>Ssod</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssod Opp</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssod Opp</em>' reference list.
	 * @see policy.PolicyPackage#getRole_SsodOpp()
	 * @see policy.Role#getSsod
	 * @model opposite="ssod"
	 * @generated
	 */
	EList<Role> getSsodOpp();

	/**
	 * Returns the value of the '<em><b>Dsod</b></em>' reference list.
	 * The list contents are of type {@link policy.Role}.
	 * It is bidirectional and its opposite is '{@link policy.Role#getDsodOpp <em>Dsod Opp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsod</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsod</em>' reference list.
	 * @see policy.PolicyPackage#getRole_Dsod()
	 * @see policy.Role#getDsodOpp
	 * @model opposite="dsodOpp"
	 * @generated
	 */
	EList<Role> getDsod();

	/**
	 * Returns the value of the '<em><b>Dsod Opp</b></em>' reference list.
	 * The list contents are of type {@link policy.Role}.
	 * It is bidirectional and its opposite is '{@link policy.Role#getDsod <em>Dsod</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsod Opp</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsod Opp</em>' reference list.
	 * @see policy.PolicyPackage#getRole_DsodOpp()
	 * @see policy.Role#getDsod
	 * @model opposite="dsod"
	 * @generated
	 */
	EList<Role> getDsodOpp();

	/**
	 * Returns the value of the '<em><b>Rh</b></em>' reference list.
	 * The list contents are of type {@link policy.Role}.
	 * It is bidirectional and its opposite is '{@link policy.Role#getRhOpp <em>Rh Opp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rh</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rh</em>' reference list.
	 * @see policy.PolicyPackage#getRole_Rh()
	 * @see policy.Role#getRhOpp
	 * @model opposite="rhOpp"
	 * @generated
	 */
	EList<Role> getRh();

	/**
	 * Returns the value of the '<em><b>Rh Opp</b></em>' reference list.
	 * The list contents are of type {@link policy.Role}.
	 * It is bidirectional and its opposite is '{@link policy.Role#getRh <em>Rh</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rh Opp</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rh Opp</em>' reference list.
	 * @see policy.PolicyPackage#getRole_RhOpp()
	 * @see policy.Role#getRh
	 * @model opposite="rh"
	 * @generated
	 */
	EList<Role> getRhOpp();

} // Role
