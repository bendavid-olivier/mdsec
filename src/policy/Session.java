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
 * A representation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link policy.Session#getUser <em>User</em>}</li>
 *   <li>{@link policy.Session#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see policy.PolicyPackage#getSession()
 * @model
 * @generated
 */
public interface Session extends PolicyElement {
	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link policy.User#getSession <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see policy.PolicyPackage#getSession_User()
	 * @see policy.User#getSession
	 * @model opposite="session"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link policy.Session#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link policy.Role}.
	 * It is bidirectional and its opposite is '{@link policy.Role#getSessions <em>Sessions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see policy.PolicyPackage#getSession_Roles()
	 * @see policy.Role#getSessions
	 * @model opposite="sessions"
	 * @generated
	 */
	EList<Role> getRoles();

} // Session
