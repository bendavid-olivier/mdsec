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
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link policy.Operation#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link policy.Operation#getObjects <em>Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see policy.PolicyPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends PolicyElement {
	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' reference list.
	 * The list contents are of type {@link policy.Permission}.
	 * It is bidirectional and its opposite is '{@link policy.Permission#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permissions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' reference list.
	 * @see policy.PolicyPackage#getOperation_Permissions()
	 * @see policy.Permission#getOperations
	 * @model opposite="operations"
	 * @generated
	 */
	EList<Permission> getPermissions();

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' reference list.
	 * The list contents are of type {@link policy.Object}.
	 * It is bidirectional and its opposite is '{@link policy.Object#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' reference list.
	 * @see policy.PolicyPackage#getOperation_Objects()
	 * @see policy.Object#getOperations
	 * @model opposite="operations" required="true"
	 * @generated
	 */
	EList<policy.Object> getObjects();

} // Operation
