/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extra Fonctional Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.ExtraFonctionalProperty#getPortTypes <em>Port Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getExtraFonctionalProperty()
 * @model
 * @generated
 */
public interface ExtraFonctionalProperty extends EObject {
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
	 * @see kevoree.KevoreePackage#getExtraFonctionalProperty_PortTypes()
	 * @model
	 * @generated
	 */
	EList<PortTypeRef> getPortTypes();

} // ExtraFonctionalProperty
