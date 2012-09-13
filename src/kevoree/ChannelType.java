/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.ChannelType#getLowerBindings <em>Lower Bindings</em>}</li>
 *   <li>{@link kevoree.ChannelType#getUpperBindings <em>Upper Bindings</em>}</li>
 *   <li>{@link kevoree.ChannelType#getLowerFragments <em>Lower Fragments</em>}</li>
 *   <li>{@link kevoree.ChannelType#getUpperFragments <em>Upper Fragments</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getChannelType()
 * @model
 * @generated
 */
public interface ChannelType extends LifeCycleTypeDefinition {
	/**
	 * Returns the value of the '<em><b>Lower Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bindings</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bindings</em>' attribute.
	 * @see #setLowerBindings(Integer)
	 * @see kevoree.KevoreePackage#getChannelType_LowerBindings()
	 * @model
	 * @generated
	 */
	Integer getLowerBindings();

	/**
	 * Sets the value of the '{@link kevoree.ChannelType#getLowerBindings <em>Lower Bindings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bindings</em>' attribute.
	 * @see #getLowerBindings()
	 * @generated
	 */
	void setLowerBindings(Integer value);

	/**
	 * Returns the value of the '<em><b>Upper Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bindings</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bindings</em>' attribute.
	 * @see #setUpperBindings(Integer)
	 * @see kevoree.KevoreePackage#getChannelType_UpperBindings()
	 * @model
	 * @generated
	 */
	Integer getUpperBindings();

	/**
	 * Sets the value of the '{@link kevoree.ChannelType#getUpperBindings <em>Upper Bindings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bindings</em>' attribute.
	 * @see #getUpperBindings()
	 * @generated
	 */
	void setUpperBindings(Integer value);

	/**
	 * Returns the value of the '<em><b>Lower Fragments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Fragments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Fragments</em>' attribute.
	 * @see #setLowerFragments(Integer)
	 * @see kevoree.KevoreePackage#getChannelType_LowerFragments()
	 * @model
	 * @generated
	 */
	Integer getLowerFragments();

	/**
	 * Sets the value of the '{@link kevoree.ChannelType#getLowerFragments <em>Lower Fragments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Fragments</em>' attribute.
	 * @see #getLowerFragments()
	 * @generated
	 */
	void setLowerFragments(Integer value);

	/**
	 * Returns the value of the '<em><b>Upper Fragments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Fragments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Fragments</em>' attribute.
	 * @see #setUpperFragments(Integer)
	 * @see kevoree.KevoreePackage#getChannelType_UpperFragments()
	 * @model
	 * @generated
	 */
	Integer getUpperFragments();

	/**
	 * Sets the value of the '{@link kevoree.ChannelType#getUpperFragments <em>Upper Fragments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Fragments</em>' attribute.
	 * @see #getUpperFragments()
	 * @generated
	 */
	void setUpperFragments(Integer value);

} // ChannelType
