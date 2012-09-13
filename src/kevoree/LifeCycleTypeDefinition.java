/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Life Cycle Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.LifeCycleTypeDefinition#getStartMethod <em>Start Method</em>}</li>
 *   <li>{@link kevoree.LifeCycleTypeDefinition#getStopMethod <em>Stop Method</em>}</li>
 *   <li>{@link kevoree.LifeCycleTypeDefinition#getUpdateMethod <em>Update Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getLifeCycleTypeDefinition()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface LifeCycleTypeDefinition extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Start Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Method</em>' attribute.
	 * @see #setStartMethod(String)
	 * @see kevoree.KevoreePackage#getLifeCycleTypeDefinition_StartMethod()
	 * @model
	 * @generated
	 */
	String getStartMethod();

	/**
	 * Sets the value of the '{@link kevoree.LifeCycleTypeDefinition#getStartMethod <em>Start Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Method</em>' attribute.
	 * @see #getStartMethod()
	 * @generated
	 */
	void setStartMethod(String value);

	/**
	 * Returns the value of the '<em><b>Stop Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Method</em>' attribute.
	 * @see #setStopMethod(String)
	 * @see kevoree.KevoreePackage#getLifeCycleTypeDefinition_StopMethod()
	 * @model
	 * @generated
	 */
	String getStopMethod();

	/**
	 * Sets the value of the '{@link kevoree.LifeCycleTypeDefinition#getStopMethod <em>Stop Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Method</em>' attribute.
	 * @see #getStopMethod()
	 * @generated
	 */
	void setStopMethod(String value);

	/**
	 * Returns the value of the '<em><b>Update Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Method</em>' attribute.
	 * @see #setUpdateMethod(String)
	 * @see kevoree.KevoreePackage#getLifeCycleTypeDefinition_UpdateMethod()
	 * @model
	 * @generated
	 */
	String getUpdateMethod();

	/**
	 * Sets the value of the '{@link kevoree.LifeCycleTypeDefinition#getUpdateMethod <em>Update Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Method</em>' attribute.
	 * @see #getUpdateMethod()
	 * @generated
	 */
	void setUpdateMethod(String value);

} // LifeCycleTypeDefinition
