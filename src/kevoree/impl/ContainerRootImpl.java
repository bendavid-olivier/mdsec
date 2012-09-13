/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree.impl;

import java.util.Collection;

import kevoree.AdaptationPrimitiveType;
import kevoree.Channel;
import kevoree.ContainerNode;
import kevoree.ContainerRoot;
import kevoree.DeployUnit;
import kevoree.Group;
import kevoree.GroupType;
import kevoree.KevoreePackage;
import kevoree.MBinding;
import kevoree.NodeNetwork;
import kevoree.Repository;
import kevoree.TypeDefinition;
import kevoree.TypeLibrary;
import kevoree.TypedElement;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kevoree.impl.ContainerRootImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link kevoree.impl.ContainerRootImpl#getTypeDefinitions <em>Type Definitions</em>}</li>
 *   <li>{@link kevoree.impl.ContainerRootImpl#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link kevoree.impl.ContainerRootImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link kevoree.impl.ContainerRootImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link kevoree.impl.ContainerRootImpl#getHubs <em>Hubs</em>}</li>
 *   <li>{@link kevoree.impl.ContainerRootImpl#getMBindings <em>MBindings</em>}</li>
 *   <li>{@link kevoree.impl.ContainerRootImpl#getDeployUnits <em>Deploy Units</em>}</li>
 *   <li>{@link kevoree.impl.ContainerRootImpl#getNodeNetworks <em>Node Networks</em>}</li>
 *   <li>{@link kevoree.impl.ContainerRootImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link kevoree.impl.ContainerRootImpl#getGroupTypes <em>Group Types</em>}</li>
 *   <li>{@link kevoree.impl.ContainerRootImpl#getAdaptationPrimitiveTypes <em>Adaptation Primitive Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerRootImpl extends EObjectImpl implements ContainerRoot {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerNode> nodes;

	/**
	 * The cached value of the '{@link #getTypeDefinitions() <em>Type Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDefinition> typeDefinitions;

	/**
	 * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<Repository> repositories;

	/**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypedElement> dataTypes;

	/**
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeLibrary> libraries;

	/**
	 * The cached value of the '{@link #getHubs() <em>Hubs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHubs()
	 * @generated
	 * @ordered
	 */
	protected EList<Channel> hubs;

	/**
	 * The cached value of the '{@link #getMBindings() <em>MBindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<MBinding> mBindings;

	/**
	 * The cached value of the '{@link #getDeployUnits() <em>Deploy Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployUnit> deployUnits;

	/**
	 * The cached value of the '{@link #getNodeNetworks() <em>Node Networks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeNetwork> nodeNetworks;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> groups;

	/**
	 * The cached value of the '{@link #getGroupTypes() <em>Group Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<GroupType> groupTypes;

	/**
	 * The cached value of the '{@link #getAdaptationPrimitiveTypes() <em>Adaptation Primitive Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptationPrimitiveTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<AdaptationPrimitiveType> adaptationPrimitiveTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KevoreePackage.Literals.CONTAINER_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainerNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<ContainerNode>(ContainerNode.class, this, KevoreePackage.CONTAINER_ROOT__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDefinition> getTypeDefinitions() {
		if (typeDefinitions == null) {
			typeDefinitions = new EObjectContainmentEList<TypeDefinition>(TypeDefinition.class, this, KevoreePackage.CONTAINER_ROOT__TYPE_DEFINITIONS);
		}
		return typeDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Repository> getRepositories() {
		if (repositories == null) {
			repositories = new EObjectContainmentEList<Repository>(Repository.class, this, KevoreePackage.CONTAINER_ROOT__REPOSITORIES);
		}
		return repositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypedElement> getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectContainmentEList<TypedElement>(TypedElement.class, this, KevoreePackage.CONTAINER_ROOT__DATA_TYPES);
		}
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeLibrary> getLibraries() {
		if (libraries == null) {
			libraries = new EObjectContainmentEList<TypeLibrary>(TypeLibrary.class, this, KevoreePackage.CONTAINER_ROOT__LIBRARIES);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Channel> getHubs() {
		if (hubs == null) {
			hubs = new EObjectContainmentEList<Channel>(Channel.class, this, KevoreePackage.CONTAINER_ROOT__HUBS);
		}
		return hubs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MBinding> getMBindings() {
		if (mBindings == null) {
			mBindings = new EObjectContainmentEList<MBinding>(MBinding.class, this, KevoreePackage.CONTAINER_ROOT__MBINDINGS);
		}
		return mBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployUnit> getDeployUnits() {
		if (deployUnits == null) {
			deployUnits = new EObjectContainmentEList<DeployUnit>(DeployUnit.class, this, KevoreePackage.CONTAINER_ROOT__DEPLOY_UNITS);
		}
		return deployUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeNetwork> getNodeNetworks() {
		if (nodeNetworks == null) {
			nodeNetworks = new EObjectContainmentEList<NodeNetwork>(NodeNetwork.class, this, KevoreePackage.CONTAINER_ROOT__NODE_NETWORKS);
		}
		return nodeNetworks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<Group>(Group.class, this, KevoreePackage.CONTAINER_ROOT__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroupType> getGroupTypes() {
		if (groupTypes == null) {
			groupTypes = new EObjectContainmentEList<GroupType>(GroupType.class, this, KevoreePackage.CONTAINER_ROOT__GROUP_TYPES);
		}
		return groupTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdaptationPrimitiveType> getAdaptationPrimitiveTypes() {
		if (adaptationPrimitiveTypes == null) {
			adaptationPrimitiveTypes = new EObjectContainmentEList<AdaptationPrimitiveType>(AdaptationPrimitiveType.class, this, KevoreePackage.CONTAINER_ROOT__ADAPTATION_PRIMITIVE_TYPES);
		}
		return adaptationPrimitiveTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KevoreePackage.CONTAINER_ROOT__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case KevoreePackage.CONTAINER_ROOT__TYPE_DEFINITIONS:
				return ((InternalEList<?>)getTypeDefinitions()).basicRemove(otherEnd, msgs);
			case KevoreePackage.CONTAINER_ROOT__REPOSITORIES:
				return ((InternalEList<?>)getRepositories()).basicRemove(otherEnd, msgs);
			case KevoreePackage.CONTAINER_ROOT__DATA_TYPES:
				return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
			case KevoreePackage.CONTAINER_ROOT__LIBRARIES:
				return ((InternalEList<?>)getLibraries()).basicRemove(otherEnd, msgs);
			case KevoreePackage.CONTAINER_ROOT__HUBS:
				return ((InternalEList<?>)getHubs()).basicRemove(otherEnd, msgs);
			case KevoreePackage.CONTAINER_ROOT__MBINDINGS:
				return ((InternalEList<?>)getMBindings()).basicRemove(otherEnd, msgs);
			case KevoreePackage.CONTAINER_ROOT__DEPLOY_UNITS:
				return ((InternalEList<?>)getDeployUnits()).basicRemove(otherEnd, msgs);
			case KevoreePackage.CONTAINER_ROOT__NODE_NETWORKS:
				return ((InternalEList<?>)getNodeNetworks()).basicRemove(otherEnd, msgs);
			case KevoreePackage.CONTAINER_ROOT__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case KevoreePackage.CONTAINER_ROOT__GROUP_TYPES:
				return ((InternalEList<?>)getGroupTypes()).basicRemove(otherEnd, msgs);
			case KevoreePackage.CONTAINER_ROOT__ADAPTATION_PRIMITIVE_TYPES:
				return ((InternalEList<?>)getAdaptationPrimitiveTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KevoreePackage.CONTAINER_ROOT__NODES:
				return getNodes();
			case KevoreePackage.CONTAINER_ROOT__TYPE_DEFINITIONS:
				return getTypeDefinitions();
			case KevoreePackage.CONTAINER_ROOT__REPOSITORIES:
				return getRepositories();
			case KevoreePackage.CONTAINER_ROOT__DATA_TYPES:
				return getDataTypes();
			case KevoreePackage.CONTAINER_ROOT__LIBRARIES:
				return getLibraries();
			case KevoreePackage.CONTAINER_ROOT__HUBS:
				return getHubs();
			case KevoreePackage.CONTAINER_ROOT__MBINDINGS:
				return getMBindings();
			case KevoreePackage.CONTAINER_ROOT__DEPLOY_UNITS:
				return getDeployUnits();
			case KevoreePackage.CONTAINER_ROOT__NODE_NETWORKS:
				return getNodeNetworks();
			case KevoreePackage.CONTAINER_ROOT__GROUPS:
				return getGroups();
			case KevoreePackage.CONTAINER_ROOT__GROUP_TYPES:
				return getGroupTypes();
			case KevoreePackage.CONTAINER_ROOT__ADAPTATION_PRIMITIVE_TYPES:
				return getAdaptationPrimitiveTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KevoreePackage.CONTAINER_ROOT__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends ContainerNode>)newValue);
				return;
			case KevoreePackage.CONTAINER_ROOT__TYPE_DEFINITIONS:
				getTypeDefinitions().clear();
				getTypeDefinitions().addAll((Collection<? extends TypeDefinition>)newValue);
				return;
			case KevoreePackage.CONTAINER_ROOT__REPOSITORIES:
				getRepositories().clear();
				getRepositories().addAll((Collection<? extends Repository>)newValue);
				return;
			case KevoreePackage.CONTAINER_ROOT__DATA_TYPES:
				getDataTypes().clear();
				getDataTypes().addAll((Collection<? extends TypedElement>)newValue);
				return;
			case KevoreePackage.CONTAINER_ROOT__LIBRARIES:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends TypeLibrary>)newValue);
				return;
			case KevoreePackage.CONTAINER_ROOT__HUBS:
				getHubs().clear();
				getHubs().addAll((Collection<? extends Channel>)newValue);
				return;
			case KevoreePackage.CONTAINER_ROOT__MBINDINGS:
				getMBindings().clear();
				getMBindings().addAll((Collection<? extends MBinding>)newValue);
				return;
			case KevoreePackage.CONTAINER_ROOT__DEPLOY_UNITS:
				getDeployUnits().clear();
				getDeployUnits().addAll((Collection<? extends DeployUnit>)newValue);
				return;
			case KevoreePackage.CONTAINER_ROOT__NODE_NETWORKS:
				getNodeNetworks().clear();
				getNodeNetworks().addAll((Collection<? extends NodeNetwork>)newValue);
				return;
			case KevoreePackage.CONTAINER_ROOT__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case KevoreePackage.CONTAINER_ROOT__GROUP_TYPES:
				getGroupTypes().clear();
				getGroupTypes().addAll((Collection<? extends GroupType>)newValue);
				return;
			case KevoreePackage.CONTAINER_ROOT__ADAPTATION_PRIMITIVE_TYPES:
				getAdaptationPrimitiveTypes().clear();
				getAdaptationPrimitiveTypes().addAll((Collection<? extends AdaptationPrimitiveType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case KevoreePackage.CONTAINER_ROOT__NODES:
				getNodes().clear();
				return;
			case KevoreePackage.CONTAINER_ROOT__TYPE_DEFINITIONS:
				getTypeDefinitions().clear();
				return;
			case KevoreePackage.CONTAINER_ROOT__REPOSITORIES:
				getRepositories().clear();
				return;
			case KevoreePackage.CONTAINER_ROOT__DATA_TYPES:
				getDataTypes().clear();
				return;
			case KevoreePackage.CONTAINER_ROOT__LIBRARIES:
				getLibraries().clear();
				return;
			case KevoreePackage.CONTAINER_ROOT__HUBS:
				getHubs().clear();
				return;
			case KevoreePackage.CONTAINER_ROOT__MBINDINGS:
				getMBindings().clear();
				return;
			case KevoreePackage.CONTAINER_ROOT__DEPLOY_UNITS:
				getDeployUnits().clear();
				return;
			case KevoreePackage.CONTAINER_ROOT__NODE_NETWORKS:
				getNodeNetworks().clear();
				return;
			case KevoreePackage.CONTAINER_ROOT__GROUPS:
				getGroups().clear();
				return;
			case KevoreePackage.CONTAINER_ROOT__GROUP_TYPES:
				getGroupTypes().clear();
				return;
			case KevoreePackage.CONTAINER_ROOT__ADAPTATION_PRIMITIVE_TYPES:
				getAdaptationPrimitiveTypes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KevoreePackage.CONTAINER_ROOT__NODES:
				return nodes != null && !nodes.isEmpty();
			case KevoreePackage.CONTAINER_ROOT__TYPE_DEFINITIONS:
				return typeDefinitions != null && !typeDefinitions.isEmpty();
			case KevoreePackage.CONTAINER_ROOT__REPOSITORIES:
				return repositories != null && !repositories.isEmpty();
			case KevoreePackage.CONTAINER_ROOT__DATA_TYPES:
				return dataTypes != null && !dataTypes.isEmpty();
			case KevoreePackage.CONTAINER_ROOT__LIBRARIES:
				return libraries != null && !libraries.isEmpty();
			case KevoreePackage.CONTAINER_ROOT__HUBS:
				return hubs != null && !hubs.isEmpty();
			case KevoreePackage.CONTAINER_ROOT__MBINDINGS:
				return mBindings != null && !mBindings.isEmpty();
			case KevoreePackage.CONTAINER_ROOT__DEPLOY_UNITS:
				return deployUnits != null && !deployUnits.isEmpty();
			case KevoreePackage.CONTAINER_ROOT__NODE_NETWORKS:
				return nodeNetworks != null && !nodeNetworks.isEmpty();
			case KevoreePackage.CONTAINER_ROOT__GROUPS:
				return groups != null && !groups.isEmpty();
			case KevoreePackage.CONTAINER_ROOT__GROUP_TYPES:
				return groupTypes != null && !groupTypes.isEmpty();
			case KevoreePackage.CONTAINER_ROOT__ADAPTATION_PRIMITIVE_TYPES:
				return adaptationPrimitiveTypes != null && !adaptationPrimitiveTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerRootImpl
