/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package grapho;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link grapho.Edge#getNodeA <em>Node A</em>}</li>
 *   <li>{@link grapho.Edge#getNodeB <em>Node B</em>}</li>
 *   <li>{@link grapho.Edge#getColor <em>Color</em>}</li>
 *   <li>{@link grapho.Edge#getStyle <em>Style</em>}</li>
 *   <li>{@link grapho.Edge#isConstraintRank <em>Constraint Rank</em>}</li>
 * </ul>
 * </p>
 *
 * @see grapho.GraphoPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Node A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node A</em>' reference.
	 * @see #setNodeA(Node)
	 * @see grapho.GraphoPackage#getEdge_NodeA()
	 * @model required="true"
	 * @generated
	 */
	Node getNodeA();

	/**
	 * Sets the value of the '{@link grapho.Edge#getNodeA <em>Node A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node A</em>' reference.
	 * @see #getNodeA()
	 * @generated
	 */
	void setNodeA(Node value);

	/**
	 * Returns the value of the '<em><b>Node B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node B</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node B</em>' reference.
	 * @see #setNodeB(Node)
	 * @see grapho.GraphoPackage#getEdge_NodeB()
	 * @model required="true"
	 * @generated
	 */
	Node getNodeB();

	/**
	 * Sets the value of the '{@link grapho.Edge#getNodeB <em>Node B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node B</em>' reference.
	 * @see #getNodeB()
	 * @generated
	 */
	void setNodeB(Node value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see grapho.GraphoPackage#getEdge_Color()
	 * @model required="true"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link grapho.Edge#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see grapho.GraphoPackage#getEdge_Style()
	 * @model required="true"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link grapho.Edge#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Constraint Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Rank</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Rank</em>' attribute.
	 * @see #setConstraintRank(boolean)
	 * @see grapho.GraphoPackage#getEdge_ConstraintRank()
	 * @model required="true"
	 * @generated
	 */
	boolean isConstraintRank();

	/**
	 * Sets the value of the '{@link grapho.Edge#isConstraintRank <em>Constraint Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Rank</em>' attribute.
	 * @see #isConstraintRank()
	 * @generated
	 */
	void setConstraintRank(boolean value);

} // Edge
