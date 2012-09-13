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
 * A representation of the model object '<em><b>Integration Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.IntegrationPattern#getExtraFonctionalProperties <em>Extra Fonctional Properties</em>}</li>
 *   <li>{@link kevoree.IntegrationPattern#getPortTypes <em>Port Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getIntegrationPattern()
 * @model
 * @generated
 */
public interface IntegrationPattern extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Extra Fonctional Properties</b></em>' containment reference list.
	 * The list contents are of type {@link kevoree.ExtraFonctionalProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra Fonctional Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Fonctional Properties</em>' containment reference list.
	 * @see kevoree.KevoreePackage#getIntegrationPattern_ExtraFonctionalProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtraFonctionalProperty> getExtraFonctionalProperties();

	/**
	 * Returns the value of the '<em><b>Port Types</b></em>' reference list.
	 * The list contents are of type {@link kevoree.PortTypeRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Types</em>' reference list.
	 * @see kevoree.KevoreePackage#getIntegrationPattern_PortTypes()
	 * @model
	 * @generated
	 */
	EList<PortTypeRef> getPortTypes();

} // IntegrationPattern
