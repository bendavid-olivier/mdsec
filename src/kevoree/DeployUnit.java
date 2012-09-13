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
 * A representation of the model object '<em><b>Deploy Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.DeployUnit#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link kevoree.DeployUnit#getUnitName <em>Unit Name</em>}</li>
 *   <li>{@link kevoree.DeployUnit#getVersion <em>Version</em>}</li>
 *   <li>{@link kevoree.DeployUnit#getUrl <em>Url</em>}</li>
 *   <li>{@link kevoree.DeployUnit#getHashcode <em>Hashcode</em>}</li>
 *   <li>{@link kevoree.DeployUnit#getRequiredLibs <em>Required Libs</em>}</li>
 *   <li>{@link kevoree.DeployUnit#getTargetNodeType <em>Target Node Type</em>}</li>
 *   <li>{@link kevoree.DeployUnit#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getDeployUnit()
 * @model
 * @generated
 */
public interface DeployUnit extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Name</em>' attribute.
	 * @see #setGroupName(String)
	 * @see kevoree.KevoreePackage#getDeployUnit_GroupName()
	 * @model
	 * @generated
	 */
	String getGroupName();

	/**
	 * Sets the value of the '{@link kevoree.DeployUnit#getGroupName <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Name</em>' attribute.
	 * @see #getGroupName()
	 * @generated
	 */
	void setGroupName(String value);

	/**
	 * Returns the value of the '<em><b>Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Name</em>' attribute.
	 * @see #setUnitName(String)
	 * @see kevoree.KevoreePackage#getDeployUnit_UnitName()
	 * @model
	 * @generated
	 */
	String getUnitName();

	/**
	 * Sets the value of the '{@link kevoree.DeployUnit#getUnitName <em>Unit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Name</em>' attribute.
	 * @see #getUnitName()
	 * @generated
	 */
	void setUnitName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see kevoree.KevoreePackage#getDeployUnit_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link kevoree.DeployUnit#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see kevoree.KevoreePackage#getDeployUnit_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link kevoree.DeployUnit#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Hashcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hashcode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hashcode</em>' attribute.
	 * @see #setHashcode(String)
	 * @see kevoree.KevoreePackage#getDeployUnit_Hashcode()
	 * @model
	 * @generated
	 */
	String getHashcode();

	/**
	 * Sets the value of the '{@link kevoree.DeployUnit#getHashcode <em>Hashcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hashcode</em>' attribute.
	 * @see #getHashcode()
	 * @generated
	 */
	void setHashcode(String value);

	/**
	 * Returns the value of the '<em><b>Required Libs</b></em>' reference list.
	 * The list contents are of type {@link kevoree.DeployUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Libs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Libs</em>' reference list.
	 * @see kevoree.KevoreePackage#getDeployUnit_RequiredLibs()
	 * @model
	 * @generated
	 */
	EList<DeployUnit> getRequiredLibs();

	/**
	 * Returns the value of the '<em><b>Target Node Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Node Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Node Type</em>' reference.
	 * @see #setTargetNodeType(NodeType)
	 * @see kevoree.KevoreePackage#getDeployUnit_TargetNodeType()
	 * @model
	 * @generated
	 */
	NodeType getTargetNodeType();

	/**
	 * Sets the value of the '{@link kevoree.DeployUnit#getTargetNodeType <em>Target Node Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Node Type</em>' reference.
	 * @see #getTargetNodeType()
	 * @generated
	 */
	void setTargetNodeType(NodeType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see kevoree.KevoreePackage#getDeployUnit_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link kevoree.DeployUnit#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // DeployUnit
