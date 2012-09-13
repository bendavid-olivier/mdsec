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
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link policy.User#getRoles <em>Roles</em>}</li>
 *   <li>{@link policy.User#getSession <em>Session</em>}</li>
 *   <li>{@link policy.User#getDelegates <em>Delegates</em>}</li>
 *   <li>{@link policy.User#getDelegatees <em>Delegatees</em>}</li>
 * </ul>
 * </p>
 *
 * @see policy.PolicyPackage#getUser()
 * @model
 * @generated
 */
public interface User extends PolicyElement {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link policy.Role}.
	 * It is bidirectional and its opposite is '{@link policy.Role#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see policy.PolicyPackage#getUser_Roles()
	 * @see policy.Role#getUsers
	 * @model opposite="users"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Session</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link policy.Session#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session</em>' reference.
	 * @see #setSession(Session)
	 * @see policy.PolicyPackage#getUser_Session()
	 * @see policy.Session#getUser
	 * @model opposite="user"
	 * @generated
	 */
	Session getSession();

	/**
	 * Sets the value of the '{@link policy.User#getSession <em>Session</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session</em>' reference.
	 * @see #getSession()
	 * @generated
	 */
	void setSession(Session value);

	/**
	 * Returns the value of the '<em><b>Delegates</b></em>' reference list.
	 * The list contents are of type {@link policy.User}.
	 * It is bidirectional and its opposite is '{@link policy.User#getDelegatees <em>Delegatees</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegates</em>' reference list.
	 * @see policy.PolicyPackage#getUser_Delegates()
	 * @see policy.User#getDelegatees
	 * @model opposite="delegatees"
	 * @generated
	 */
	EList<User> getDelegates();

	/**
	 * Returns the value of the '<em><b>Delegatees</b></em>' reference list.
	 * The list contents are of type {@link policy.User}.
	 * It is bidirectional and its opposite is '{@link policy.User#getDelegates <em>Delegates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegatees</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegatees</em>' reference list.
	 * @see policy.PolicyPackage#getUser_Delegatees()
	 * @see policy.User#getDelegates
	 * @model opposite="delegates"
	 * @generated
	 */
	EList<User> getDelegatees();

} // User
