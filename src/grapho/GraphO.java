/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package grapho;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph O</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link grapho.GraphO#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see grapho.GraphoPackage#getGraphO()
 * @model
 * @generated
 */
public interface GraphO extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link grapho.GraphElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see grapho.GraphoPackage#getGraphO_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphElement> getElements();

} // GraphO
