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
 * A representation of the model object '<em><b>Port Type Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.PortTypeRef#getRef <em>Ref</em>}</li>
 *   <li>{@link kevoree.PortTypeRef#getMappings <em>Mappings</em>}</li>
 *   <li>{@link kevoree.PortTypeRef#getOptional <em>Optional</em>}</li>
 *   <li>{@link kevoree.PortTypeRef#getNoDependency <em>No Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getPortTypeRef()
 * @model
 * @generated
 */
public interface PortTypeRef extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(PortType)
	 * @see kevoree.KevoreePackage#getPortTypeRef_Ref()
	 * @model required="true"
	 * @generated
	 */
	PortType getRef();

	/**
	 * Sets the value of the '{@link kevoree.PortTypeRef#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(PortType value);

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link kevoree.PortTypeMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see kevoree.KevoreePackage#getPortTypeRef_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortTypeMapping> getMappings();

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(Boolean)
	 * @see kevoree.KevoreePackage#getPortTypeRef_Optional()
	 * @model
	 * @generated
	 */
	Boolean getOptional();

	/**
	 * Sets the value of the '{@link kevoree.PortTypeRef#getOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #getOptional()
	 * @generated
	 */
	void setOptional(Boolean value);

	/**
	 * Returns the value of the '<em><b>No Dependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Dependency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Dependency</em>' attribute.
	 * @see #setNoDependency(Boolean)
	 * @see kevoree.KevoreePackage#getPortTypeRef_NoDependency()
	 * @model
	 * @generated
	 */
	Boolean getNoDependency();

	/**
	 * Sets the value of the '{@link kevoree.PortTypeRef#getNoDependency <em>No Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Dependency</em>' attribute.
	 * @see #getNoDependency()
	 * @generated
	 */
	void setNoDependency(Boolean value);

} // PortTypeRef
