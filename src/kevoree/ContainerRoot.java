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
 * A representation of the model object '<em><b>Container Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.ContainerRoot#getNodes <em>Nodes</em>}</li>
 *   <li>{@link kevoree.ContainerRoot#getTypeDefinitions <em>Type Definitions</em>}</li>
 *   <li>{@link kevoree.ContainerRoot#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link kevoree.ContainerRoot#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link kevoree.ContainerRoot#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link kevoree.ContainerRoot#getHubs <em>Hubs</em>}</li>
 *   <li>{@link kevoree.ContainerRoot#getMBindings <em>MBindings</em>}</li>
 *   <li>{@link kevoree.ContainerRoot#getDeployUnits <em>Deploy Units</em>}</li>
 *   <li>{@link kevoree.ContainerRoot#getNodeNetworks <em>Node Networks</em>}</li>
 *   <li>{@link kevoree.ContainerRoot#getGroups <em>Groups</em>}</li>
 *   <li>{@link kevoree.ContainerRoot#getGroupTypes <em>Group Types</em>}</li>
 *   <li>{@link kevoree.ContainerRoot#getAdaptationPrimitiveTypes <em>Adaptation Primitive Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getContainerRoot()
 * @model
 * @generated
 */
public interface ContainerRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link kevoree.ContainerNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see kevoree.KevoreePackage#getContainerRoot_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainerNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Type Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link kevoree.TypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definitions</em>' containment reference list.
	 * @see kevoree.KevoreePackage#getContainerRoot_TypeDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeDefinition> getTypeDefinitions();

	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link kevoree.Repository}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositories</em>' containment reference list.
	 * @see kevoree.KevoreePackage#getContainerRoot_Repositories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Repository> getRepositories();

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link kevoree.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see kevoree.KevoreePackage#getContainerRoot_DataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypedElement> getDataTypes();

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link kevoree.TypeLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libraries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' containment reference list.
	 * @see kevoree.KevoreePackage#getContainerRoot_Libraries()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeLibrary> getLibraries();

	/**
	 * Returns the value of the '<em><b>Hubs</b></em>' containment reference list.
	 * The list contents are of type {@link kevoree.Channel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hubs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hubs</em>' containment reference list.
	 * @see kevoree.KevoreePackage#getContainerRoot_Hubs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Channel> getHubs();

	/**
	 * Returns the value of the '<em><b>MBindings</b></em>' containment reference list.
	 * The list contents are of type {@link kevoree.MBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MBindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MBindings</em>' containment reference list.
	 * @see kevoree.KevoreePackage#getContainerRoot_MBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<MBinding> getMBindings();

	/**
	 * Returns the value of the '<em><b>Deploy Units</b></em>' containment reference list.
	 * The list contents are of type {@link kevoree.DeployUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deploy Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy Units</em>' containment reference list.
	 * @see kevoree.KevoreePackage#getContainerRoot_DeployUnits()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeployUnit> getDeployUnits();

	/**
	 * Returns the value of the '<em><b>Node Networks</b></em>' containment reference list.
	 * The list contents are of type {@link kevoree.NodeNetwork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Networks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Networks</em>' containment reference list.
	 * @see kevoree.KevoreePackage#getContainerRoot_NodeNetworks()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeNetwork> getNodeNetworks();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link kevoree.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see kevoree.KevoreePackage#getContainerRoot_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Group Types</b></em>' containment reference list.
	 * The list contents are of type {@link kevoree.GroupType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Types</em>' containment reference list.
	 * @see kevoree.KevoreePackage#getContainerRoot_GroupTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<GroupType> getGroupTypes();

	/**
	 * Returns the value of the '<em><b>Adaptation Primitive Types</b></em>' containment reference list.
	 * The list contents are of type {@link kevoree.AdaptationPrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adaptation Primitive Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adaptation Primitive Types</em>' containment reference list.
	 * @see kevoree.KevoreePackage#getContainerRoot_AdaptationPrimitiveTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdaptationPrimitiveType> getAdaptationPrimitiveTypes();

} // ContainerRoot
