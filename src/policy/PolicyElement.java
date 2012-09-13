/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package policy;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link policy.PolicyElement#getName <em>Name</em>}</li>
 *   <li>{@link policy.PolicyElement#getArchType <em>Arch Type</em>}</li>
 *   <li>{@link policy.PolicyElement#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see policy.PolicyPackage#getPolicyElement()
 * @model
 * @generated
 */
public interface PolicyElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see policy.PolicyPackage#getPolicyElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link policy.PolicyElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Arch Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arch Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arch Type</em>' attribute.
	 * @see #setArchType(String)
	 * @see policy.PolicyPackage#getPolicyElement_ArchType()
	 * @model required="true"
	 * @generated
	 */
	String getArchType();

	/**
	 * Sets the value of the '{@link policy.PolicyElement#getArchType <em>Arch Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arch Type</em>' attribute.
	 * @see #getArchType()
	 * @generated
	 */
	void setArchType(String value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link policy.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see policy.PolicyPackage#getPolicyElement_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

} // PolicyElement
