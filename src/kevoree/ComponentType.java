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
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.ComponentType#getRequired <em>Required</em>}</li>
 *   <li>{@link kevoree.ComponentType#getIntegrationPatterns <em>Integration Patterns</em>}</li>
 *   <li>{@link kevoree.ComponentType#getExtraFonctionalProperties <em>Extra Fonctional Properties</em>}</li>
 *   <li>{@link kevoree.ComponentType#getProvided <em>Provided</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getComponentType()
 * @model
 * @generated
 */
public interface ComponentType extends LifeCycleTypeDefinition {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' containment reference list.
	 * The list contents are of type {@link kevoree.PortTypeRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' containment reference list.
	 * @see kevoree.KevoreePackage#getComponentType_Required()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortTypeRef> getRequired();

	/**
	 * Returns the value of the '<em><b>Integration Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link kevoree.IntegrationPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integration Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integration Patterns</em>' containment reference list.
	 * @see kevoree.KevoreePackage#getComponentType_IntegrationPatterns()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntegrationPattern> getIntegrationPatterns();

	/**
	 * Returns the value of the '<em><b>Extra Fonctional Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra Fonctional Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Fonctional Properties</em>' containment reference.
	 * @see #setExtraFonctionalProperties(ExtraFonctionalProperty)
	 * @see kevoree.KevoreePackage#getComponentType_ExtraFonctionalProperties()
	 * @model containment="true"
	 * @generated
	 */
	ExtraFonctionalProperty getExtraFonctionalProperties();

	/**
	 * Sets the value of the '{@link kevoree.ComponentType#getExtraFonctionalProperties <em>Extra Fonctional Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Fonctional Properties</em>' containment reference.
	 * @see #getExtraFonctionalProperties()
	 * @generated
	 */
	void setExtraFonctionalProperties(ExtraFonctionalProperty value);

	/**
	 * Returns the value of the '<em><b>Provided</b></em>' containment reference list.
	 * The list contents are of type {@link kevoree.PortTypeRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided</em>' containment reference list.
	 * @see kevoree.KevoreePackage#getComponentType_Provided()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortTypeRef> getProvided();

} // ComponentType
