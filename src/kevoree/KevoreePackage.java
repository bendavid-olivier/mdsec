/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see kevoree.KevoreeFactory
 * @model kind="package"
 * @generated
 */
public interface KevoreePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kevoree";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://kevoree/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kevoree";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KevoreePackage eINSTANCE = kevoree.impl.KevoreePackageImpl.init();

	/**
	 * The meta object id for the '{@link kevoree.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.NamedElementImpl
	 * @see kevoree.impl.KevoreePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link kevoree.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.ComponentInstanceImpl
	 * @see kevoree.impl.KevoreePackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__TYPE_DEFINITION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__DICTIONARY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__META_DATA = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Provided</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PROVIDED = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__REQUIRED = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__NAMESPACE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link kevoree.TypeDefinition <em>Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.TypeDefinition
	 * @see kevoree.impl.KevoreePackageImpl#getTypeDefinition()
	 * @generated
	 */
	int TYPE_DEFINITION = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Deploy Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__DEPLOY_UNITS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Factory Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__FACTORY_BEAN = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__BEAN = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dictionary Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__DICTIONARY_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__SUPER_TYPES = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link kevoree.LifeCycleTypeDefinition <em>Life Cycle Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.LifeCycleTypeDefinition
	 * @see kevoree.impl.KevoreePackageImpl#getLifeCycleTypeDefinition()
	 * @generated
	 */
	int LIFE_CYCLE_TYPE_DEFINITION = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_TYPE_DEFINITION__NAME = TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Deploy Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_TYPE_DEFINITION__DEPLOY_UNITS = TYPE_DEFINITION__DEPLOY_UNITS;

	/**
	 * The feature id for the '<em><b>Factory Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_TYPE_DEFINITION__FACTORY_BEAN = TYPE_DEFINITION__FACTORY_BEAN;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_TYPE_DEFINITION__BEAN = TYPE_DEFINITION__BEAN;

	/**
	 * The feature id for the '<em><b>Dictionary Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_TYPE_DEFINITION__DICTIONARY_TYPE = TYPE_DEFINITION__DICTIONARY_TYPE;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_TYPE_DEFINITION__SUPER_TYPES = TYPE_DEFINITION__SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Start Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_TYPE_DEFINITION__START_METHOD = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stop Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_TYPE_DEFINITION__STOP_METHOD = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Update Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_TYPE_DEFINITION__UPDATE_METHOD = TYPE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Life Cycle Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link kevoree.impl.ComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.ComponentTypeImpl
	 * @see kevoree.impl.KevoreePackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__NAME = LIFE_CYCLE_TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Deploy Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__DEPLOY_UNITS = LIFE_CYCLE_TYPE_DEFINITION__DEPLOY_UNITS;

	/**
	 * The feature id for the '<em><b>Factory Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__FACTORY_BEAN = LIFE_CYCLE_TYPE_DEFINITION__FACTORY_BEAN;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__BEAN = LIFE_CYCLE_TYPE_DEFINITION__BEAN;

	/**
	 * The feature id for the '<em><b>Dictionary Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__DICTIONARY_TYPE = LIFE_CYCLE_TYPE_DEFINITION__DICTIONARY_TYPE;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__SUPER_TYPES = LIFE_CYCLE_TYPE_DEFINITION__SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Start Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__START_METHOD = LIFE_CYCLE_TYPE_DEFINITION__START_METHOD;

	/**
	 * The feature id for the '<em><b>Stop Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__STOP_METHOD = LIFE_CYCLE_TYPE_DEFINITION__STOP_METHOD;

	/**
	 * The feature id for the '<em><b>Update Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__UPDATE_METHOD = LIFE_CYCLE_TYPE_DEFINITION__UPDATE_METHOD;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__REQUIRED = LIFE_CYCLE_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Integration Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__INTEGRATION_PATTERNS = LIFE_CYCLE_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extra Fonctional Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES = LIFE_CYCLE_TYPE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Provided</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__PROVIDED = LIFE_CYCLE_TYPE_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_FEATURE_COUNT = LIFE_CYCLE_TYPE_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link kevoree.impl.ContainerNodeImpl <em>Container Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.ContainerNodeImpl
	 * @see kevoree.impl.KevoreePackageImpl#getContainerNode()
	 * @generated
	 */
	int CONTAINER_NODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NODE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NODE__TYPE_DEFINITION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NODE__DICTIONARY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NODE__META_DATA = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NODE__COMPONENTS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hosts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NODE__HOSTS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Container Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link kevoree.impl.ContainerRootImpl <em>Container Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.ContainerRootImpl
	 * @see kevoree.impl.KevoreePackageImpl#getContainerRoot()
	 * @generated
	 */
	int CONTAINER_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT__NODES = 0;

	/**
	 * The feature id for the '<em><b>Type Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT__TYPE_DEFINITIONS = 1;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT__REPOSITORIES = 2;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT__DATA_TYPES = 3;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT__LIBRARIES = 4;

	/**
	 * The feature id for the '<em><b>Hubs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT__HUBS = 5;

	/**
	 * The feature id for the '<em><b>MBindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT__MBINDINGS = 6;

	/**
	 * The feature id for the '<em><b>Deploy Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT__DEPLOY_UNITS = 7;

	/**
	 * The feature id for the '<em><b>Node Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT__NODE_NETWORKS = 8;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT__GROUPS = 9;

	/**
	 * The feature id for the '<em><b>Group Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT__GROUP_TYPES = 10;

	/**
	 * The feature id for the '<em><b>Adaptation Primitive Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT__ADAPTATION_PRIMITIVE_TYPES = 11;

	/**
	 * The number of structural features of the '<em>Container Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link kevoree.impl.PortTypeImpl <em>Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.PortTypeImpl
	 * @see kevoree.impl.KevoreePackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__NAME = TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Deploy Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__DEPLOY_UNITS = TYPE_DEFINITION__DEPLOY_UNITS;

	/**
	 * The feature id for the '<em><b>Factory Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__FACTORY_BEAN = TYPE_DEFINITION__FACTORY_BEAN;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__BEAN = TYPE_DEFINITION__BEAN;

	/**
	 * The feature id for the '<em><b>Dictionary Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__DICTIONARY_TYPE = TYPE_DEFINITION__DICTIONARY_TYPE;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__SUPER_TYPES = TYPE_DEFINITION__SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Synchrone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__SYNCHRONE = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kevoree.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.PortImpl
	 * @see kevoree.impl.KevoreePackageImpl#getPort()
	 * @generated
	 */
	int PORT = 5;

	/**
	 * The feature id for the '<em><b>Port Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PORT_TYPE_REF = 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link kevoree.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.NamespaceImpl
	 * @see kevoree.impl.KevoreePackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__CHILDS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__PARENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kevoree.impl.DictionaryImpl <em>Dictionary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.DictionaryImpl
	 * @see kevoree.impl.KevoreePackageImpl#getDictionary()
	 * @generated
	 */
	int DICTIONARY = 7;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__VALUES = 0;

	/**
	 * The number of structural features of the '<em>Dictionary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link kevoree.impl.DictionaryTypeImpl <em>Dictionary Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.DictionaryTypeImpl
	 * @see kevoree.impl.KevoreePackageImpl#getDictionaryType()
	 * @generated
	 */
	int DICTIONARY_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Default Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__DEFAULT_VALUES = 1;

	/**
	 * The number of structural features of the '<em>Dictionary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link kevoree.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.TypedElementImpl
	 * @see kevoree.impl.KevoreePackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Generic Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__GENERIC_TYPES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kevoree.impl.DictionaryAttributeImpl <em>Dictionary Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.DictionaryAttributeImpl
	 * @see kevoree.impl.KevoreePackageImpl#getDictionaryAttribute()
	 * @generated
	 */
	int DICTIONARY_ATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_ATTRIBUTE__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Generic Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_ATTRIBUTE__GENERIC_TYPES = TYPED_ELEMENT__GENERIC_TYPES;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_ATTRIBUTE__OPTIONAL = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_ATTRIBUTE__STATE = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_ATTRIBUTE__DATATYPE = TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fragment Dependant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_ATTRIBUTE__FRAGMENT_DEPENDANT = TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Dictionary Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_ATTRIBUTE_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link kevoree.impl.DictionaryValueImpl <em>Dictionary Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.DictionaryValueImpl
	 * @see kevoree.impl.KevoreePackageImpl#getDictionaryValue()
	 * @generated
	 */
	int DICTIONARY_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_VALUE__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_VALUE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Target Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_VALUE__TARGET_NODE = 2;

	/**
	 * The number of structural features of the '<em>Dictionary Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_VALUE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link kevoree.impl.CompositeTypeImpl <em>Composite Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.CompositeTypeImpl
	 * @see kevoree.impl.KevoreePackageImpl#getCompositeType()
	 * @generated
	 */
	int COMPOSITE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__NAME = COMPONENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Deploy Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__DEPLOY_UNITS = COMPONENT_TYPE__DEPLOY_UNITS;

	/**
	 * The feature id for the '<em><b>Factory Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__FACTORY_BEAN = COMPONENT_TYPE__FACTORY_BEAN;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__BEAN = COMPONENT_TYPE__BEAN;

	/**
	 * The feature id for the '<em><b>Dictionary Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__DICTIONARY_TYPE = COMPONENT_TYPE__DICTIONARY_TYPE;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__SUPER_TYPES = COMPONENT_TYPE__SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Start Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__START_METHOD = COMPONENT_TYPE__START_METHOD;

	/**
	 * The feature id for the '<em><b>Stop Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__STOP_METHOD = COMPONENT_TYPE__STOP_METHOD;

	/**
	 * The feature id for the '<em><b>Update Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__UPDATE_METHOD = COMPONENT_TYPE__UPDATE_METHOD;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__REQUIRED = COMPONENT_TYPE__REQUIRED;

	/**
	 * The feature id for the '<em><b>Integration Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__INTEGRATION_PATTERNS = COMPONENT_TYPE__INTEGRATION_PATTERNS;

	/**
	 * The feature id for the '<em><b>Extra Fonctional Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__EXTRA_FONCTIONAL_PROPERTIES = COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Provided</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__PROVIDED = COMPONENT_TYPE__PROVIDED;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__CHILDS = COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__WIRES = COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE_FEATURE_COUNT = COMPONENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kevoree.impl.PortTypeRefImpl <em>Port Type Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.PortTypeRefImpl
	 * @see kevoree.impl.KevoreePackageImpl#getPortTypeRef()
	 * @generated
	 */
	int PORT_TYPE_REF = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_REF__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_REF__REF = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_REF__MAPPINGS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_REF__OPTIONAL = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>No Dependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_REF__NO_DEPENDENCY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Port Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_REF_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link kevoree.impl.WireImpl <em>Wire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.WireImpl
	 * @see kevoree.impl.KevoreePackageImpl#getWire()
	 * @generated
	 */
	int WIRE = 13;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__PORTS = 0;

	/**
	 * The number of structural features of the '<em>Wire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link kevoree.impl.ServicePortTypeImpl <em>Service Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.ServicePortTypeImpl
	 * @see kevoree.impl.KevoreePackageImpl#getServicePortType()
	 * @generated
	 */
	int SERVICE_PORT_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PORT_TYPE__NAME = PORT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Deploy Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PORT_TYPE__DEPLOY_UNITS = PORT_TYPE__DEPLOY_UNITS;

	/**
	 * The feature id for the '<em><b>Factory Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PORT_TYPE__FACTORY_BEAN = PORT_TYPE__FACTORY_BEAN;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PORT_TYPE__BEAN = PORT_TYPE__BEAN;

	/**
	 * The feature id for the '<em><b>Dictionary Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PORT_TYPE__DICTIONARY_TYPE = PORT_TYPE__DICTIONARY_TYPE;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PORT_TYPE__SUPER_TYPES = PORT_TYPE__SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Synchrone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PORT_TYPE__SYNCHRONE = PORT_TYPE__SYNCHRONE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PORT_TYPE__OPERATIONS = PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PORT_TYPE__INTERFACE = PORT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PORT_TYPE_FEATURE_COUNT = PORT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kevoree.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.OperationImpl
	 * @see kevoree.impl.KevoreePackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kevoree.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.ParameterImpl
	 * @see kevoree.impl.KevoreePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kevoree.impl.MessagePortTypeImpl <em>Message Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.MessagePortTypeImpl
	 * @see kevoree.impl.KevoreePackageImpl#getMessagePortType()
	 * @generated
	 */
	int MESSAGE_PORT_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT_TYPE__NAME = PORT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Deploy Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT_TYPE__DEPLOY_UNITS = PORT_TYPE__DEPLOY_UNITS;

	/**
	 * The feature id for the '<em><b>Factory Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT_TYPE__FACTORY_BEAN = PORT_TYPE__FACTORY_BEAN;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT_TYPE__BEAN = PORT_TYPE__BEAN;

	/**
	 * The feature id for the '<em><b>Dictionary Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT_TYPE__DICTIONARY_TYPE = PORT_TYPE__DICTIONARY_TYPE;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT_TYPE__SUPER_TYPES = PORT_TYPE__SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Synchrone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT_TYPE__SYNCHRONE = PORT_TYPE__SYNCHRONE;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT_TYPE__FILTERS = PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT_TYPE_FEATURE_COUNT = PORT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kevoree.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.RepositoryImpl
	 * @see kevoree.impl.KevoreePackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__UNITS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__URL = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kevoree.impl.DeployUnitImpl <em>Deploy Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.DeployUnitImpl
	 * @see kevoree.impl.KevoreePackageImpl#getDeployUnit()
	 * @generated
	 */
	int DEPLOY_UNIT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_UNIT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_UNIT__GROUP_NAME = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_UNIT__UNIT_NAME = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_UNIT__VERSION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_UNIT__URL = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hashcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_UNIT__HASHCODE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Required Libs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_UNIT__REQUIRED_LIBS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Node Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_UNIT__TARGET_NODE_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_UNIT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Deploy Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_UNIT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link kevoree.impl.TypeLibraryImpl <em>Type Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.TypeLibraryImpl
	 * @see kevoree.impl.KevoreePackageImpl#getTypeLibrary()
	 * @generated
	 */
	int TYPE_LIBRARY = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LIBRARY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LIBRARY__SUB_TYPES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LIBRARY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kevoree.impl.IntegrationPatternImpl <em>Integration Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.IntegrationPatternImpl
	 * @see kevoree.impl.KevoreePackageImpl#getIntegrationPattern()
	 * @generated
	 */
	int INTEGRATION_PATTERN = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_PATTERN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Extra Fonctional Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_PATTERN__EXTRA_FONCTIONAL_PROPERTIES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_PATTERN__PORT_TYPES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integration Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_PATTERN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kevoree.impl.ExtraFonctionalPropertyImpl <em>Extra Fonctional Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.ExtraFonctionalPropertyImpl
	 * @see kevoree.impl.KevoreePackageImpl#getExtraFonctionalProperty()
	 * @generated
	 */
	int EXTRA_FONCTIONAL_PROPERTY = 24;

	/**
	 * The feature id for the '<em><b>Port Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_FONCTIONAL_PROPERTY__PORT_TYPES = 0;

	/**
	 * The number of structural features of the '<em>Extra Fonctional Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_FONCTIONAL_PROPERTY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link kevoree.impl.PortTypeMappingImpl <em>Port Type Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.PortTypeMappingImpl
	 * @see kevoree.impl.KevoreePackageImpl#getPortTypeMapping()
	 * @generated
	 */
	int PORT_TYPE_MAPPING = 25;

	/**
	 * The feature id for the '<em><b>Bean Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_MAPPING__BEAN_METHOD_NAME = 0;

	/**
	 * The feature id for the '<em><b>Service Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_MAPPING__SERVICE_METHOD_NAME = 1;

	/**
	 * The number of structural features of the '<em>Port Type Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link kevoree.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.ChannelImpl
	 * @see kevoree.impl.KevoreePackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__TYPE_DEFINITION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__DICTIONARY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__META_DATA = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link kevoree.impl.MBindingImpl <em>MBinding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.MBindingImpl
	 * @see kevoree.impl.KevoreePackageImpl#getMBinding()
	 * @generated
	 */
	int MBINDING = 27;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBINDING__PORT = 0;

	/**
	 * The feature id for the '<em><b>Hub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBINDING__HUB = 1;

	/**
	 * The number of structural features of the '<em>MBinding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBINDING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link kevoree.impl.NodeNetworkImpl <em>Node Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.NodeNetworkImpl
	 * @see kevoree.impl.KevoreePackageImpl#getNodeNetwork()
	 * @generated
	 */
	int NODE_NETWORK = 28;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_NETWORK__LINK = 0;

	/**
	 * The feature id for the '<em><b>Init By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_NETWORK__INIT_BY = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_NETWORK__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Node Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_NETWORK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link kevoree.impl.NodeLinkImpl <em>Node Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.NodeLinkImpl
	 * @see kevoree.impl.KevoreePackageImpl#getNodeLink()
	 * @generated
	 */
	int NODE_LINK = 29;

	/**
	 * The feature id for the '<em><b>Network Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LINK__NETWORK_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Estimated Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LINK__ESTIMATED_RATE = 1;

	/**
	 * The feature id for the '<em><b>Network Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LINK__NETWORK_PROPERTIES = 2;

	/**
	 * The feature id for the '<em><b>Last Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LINK__LAST_CHECK = 3;

	/**
	 * The number of structural features of the '<em>Node Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LINK_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link kevoree.impl.NetworkPropertyImpl <em>Network Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.NetworkPropertyImpl
	 * @see kevoree.impl.KevoreePackageImpl#getNetworkProperty()
	 * @generated
	 */
	int NETWORK_PROPERTY = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_PROPERTY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_PROPERTY__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_PROPERTY__LAST_CHECK = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Network Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_PROPERTY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kevoree.impl.ChannelTypeImpl <em>Channel Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.ChannelTypeImpl
	 * @see kevoree.impl.KevoreePackageImpl#getChannelType()
	 * @generated
	 */
	int CHANNEL_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__NAME = LIFE_CYCLE_TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Deploy Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__DEPLOY_UNITS = LIFE_CYCLE_TYPE_DEFINITION__DEPLOY_UNITS;

	/**
	 * The feature id for the '<em><b>Factory Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__FACTORY_BEAN = LIFE_CYCLE_TYPE_DEFINITION__FACTORY_BEAN;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__BEAN = LIFE_CYCLE_TYPE_DEFINITION__BEAN;

	/**
	 * The feature id for the '<em><b>Dictionary Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__DICTIONARY_TYPE = LIFE_CYCLE_TYPE_DEFINITION__DICTIONARY_TYPE;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__SUPER_TYPES = LIFE_CYCLE_TYPE_DEFINITION__SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Start Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__START_METHOD = LIFE_CYCLE_TYPE_DEFINITION__START_METHOD;

	/**
	 * The feature id for the '<em><b>Stop Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__STOP_METHOD = LIFE_CYCLE_TYPE_DEFINITION__STOP_METHOD;

	/**
	 * The feature id for the '<em><b>Update Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__UPDATE_METHOD = LIFE_CYCLE_TYPE_DEFINITION__UPDATE_METHOD;

	/**
	 * The feature id for the '<em><b>Lower Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__LOWER_BINDINGS = LIFE_CYCLE_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__UPPER_BINDINGS = LIFE_CYCLE_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower Fragments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__LOWER_FRAGMENTS = LIFE_CYCLE_TYPE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper Fragments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__UPPER_FRAGMENTS = LIFE_CYCLE_TYPE_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Channel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE_FEATURE_COUNT = LIFE_CYCLE_TYPE_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link kevoree.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.InstanceImpl
	 * @see kevoree.impl.KevoreePackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__TYPE_DEFINITION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__DICTIONARY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__META_DATA = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link kevoree.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.GroupImpl
	 * @see kevoree.impl.KevoreePackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TYPE_DEFINITION = INSTANCE__TYPE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DICTIONARY = INSTANCE__DICTIONARY;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__META_DATA = INSTANCE__META_DATA;

	/**
	 * The feature id for the '<em><b>Sub Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SUB_NODES = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kevoree.impl.GroupTypeImpl <em>Group Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.GroupTypeImpl
	 * @see kevoree.impl.KevoreePackageImpl#getGroupType()
	 * @generated
	 */
	int GROUP_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__NAME = LIFE_CYCLE_TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Deploy Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__DEPLOY_UNITS = LIFE_CYCLE_TYPE_DEFINITION__DEPLOY_UNITS;

	/**
	 * The feature id for the '<em><b>Factory Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__FACTORY_BEAN = LIFE_CYCLE_TYPE_DEFINITION__FACTORY_BEAN;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__BEAN = LIFE_CYCLE_TYPE_DEFINITION__BEAN;

	/**
	 * The feature id for the '<em><b>Dictionary Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__DICTIONARY_TYPE = LIFE_CYCLE_TYPE_DEFINITION__DICTIONARY_TYPE;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__SUPER_TYPES = LIFE_CYCLE_TYPE_DEFINITION__SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Start Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__START_METHOD = LIFE_CYCLE_TYPE_DEFINITION__START_METHOD;

	/**
	 * The feature id for the '<em><b>Stop Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__STOP_METHOD = LIFE_CYCLE_TYPE_DEFINITION__STOP_METHOD;

	/**
	 * The feature id for the '<em><b>Update Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__UPDATE_METHOD = LIFE_CYCLE_TYPE_DEFINITION__UPDATE_METHOD;

	/**
	 * The number of structural features of the '<em>Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE_FEATURE_COUNT = LIFE_CYCLE_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kevoree.impl.NodeTypeImpl <em>Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.NodeTypeImpl
	 * @see kevoree.impl.KevoreePackageImpl#getNodeType()
	 * @generated
	 */
	int NODE_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__NAME = LIFE_CYCLE_TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Deploy Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__DEPLOY_UNITS = LIFE_CYCLE_TYPE_DEFINITION__DEPLOY_UNITS;

	/**
	 * The feature id for the '<em><b>Factory Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__FACTORY_BEAN = LIFE_CYCLE_TYPE_DEFINITION__FACTORY_BEAN;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__BEAN = LIFE_CYCLE_TYPE_DEFINITION__BEAN;

	/**
	 * The feature id for the '<em><b>Dictionary Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__DICTIONARY_TYPE = LIFE_CYCLE_TYPE_DEFINITION__DICTIONARY_TYPE;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__SUPER_TYPES = LIFE_CYCLE_TYPE_DEFINITION__SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Start Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__START_METHOD = LIFE_CYCLE_TYPE_DEFINITION__START_METHOD;

	/**
	 * The feature id for the '<em><b>Stop Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__STOP_METHOD = LIFE_CYCLE_TYPE_DEFINITION__STOP_METHOD;

	/**
	 * The feature id for the '<em><b>Update Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__UPDATE_METHOD = LIFE_CYCLE_TYPE_DEFINITION__UPDATE_METHOD;

	/**
	 * The feature id for the '<em><b>Managed Primitive Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__MANAGED_PRIMITIVE_TYPES = LIFE_CYCLE_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_FEATURE_COUNT = LIFE_CYCLE_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kevoree.impl.AdaptationPrimitiveTypeImpl <em>Adaptation Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kevoree.impl.AdaptationPrimitiveTypeImpl
	 * @see kevoree.impl.KevoreePackageImpl#getAdaptationPrimitiveType()
	 * @generated
	 */
	int ADAPTATION_PRIMITIVE_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_PRIMITIVE_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Adaptation Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_PRIMITIVE_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link kevoree.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see kevoree.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.ComponentInstance#getProvided <em>Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided</em>'.
	 * @see kevoree.ComponentInstance#getProvided()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Provided();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.ComponentInstance#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required</em>'.
	 * @see kevoree.ComponentInstance#getRequired()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Required();

	/**
	 * Returns the meta object for the reference '{@link kevoree.ComponentInstance#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Namespace</em>'.
	 * @see kevoree.ComponentInstance#getNamespace()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Namespace();

	/**
	 * Returns the meta object for class '{@link kevoree.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see kevoree.ComponentType
	 * @generated
	 */
	EClass getComponentType();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.ComponentType#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required</em>'.
	 * @see kevoree.ComponentType#getRequired()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Required();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.ComponentType#getIntegrationPatterns <em>Integration Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integration Patterns</em>'.
	 * @see kevoree.ComponentType#getIntegrationPatterns()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_IntegrationPatterns();

	/**
	 * Returns the meta object for the containment reference '{@link kevoree.ComponentType#getExtraFonctionalProperties <em>Extra Fonctional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extra Fonctional Properties</em>'.
	 * @see kevoree.ComponentType#getExtraFonctionalProperties()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_ExtraFonctionalProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.ComponentType#getProvided <em>Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided</em>'.
	 * @see kevoree.ComponentType#getProvided()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Provided();

	/**
	 * Returns the meta object for class '{@link kevoree.ContainerNode <em>Container Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Node</em>'.
	 * @see kevoree.ContainerNode
	 * @generated
	 */
	EClass getContainerNode();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.ContainerNode#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see kevoree.ContainerNode#getComponents()
	 * @see #getContainerNode()
	 * @generated
	 */
	EReference getContainerNode_Components();

	/**
	 * Returns the meta object for the reference list '{@link kevoree.ContainerNode#getHosts <em>Hosts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hosts</em>'.
	 * @see kevoree.ContainerNode#getHosts()
	 * @see #getContainerNode()
	 * @generated
	 */
	EReference getContainerNode_Hosts();

	/**
	 * Returns the meta object for class '{@link kevoree.ContainerRoot <em>Container Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Root</em>'.
	 * @see kevoree.ContainerRoot
	 * @generated
	 */
	EClass getContainerRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.ContainerRoot#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see kevoree.ContainerRoot#getNodes()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.ContainerRoot#getTypeDefinitions <em>Type Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Definitions</em>'.
	 * @see kevoree.ContainerRoot#getTypeDefinitions()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_TypeDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.ContainerRoot#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repositories</em>'.
	 * @see kevoree.ContainerRoot#getRepositories()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_Repositories();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.ContainerRoot#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Types</em>'.
	 * @see kevoree.ContainerRoot#getDataTypes()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_DataTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.ContainerRoot#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Libraries</em>'.
	 * @see kevoree.ContainerRoot#getLibraries()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_Libraries();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.ContainerRoot#getHubs <em>Hubs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hubs</em>'.
	 * @see kevoree.ContainerRoot#getHubs()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_Hubs();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.ContainerRoot#getMBindings <em>MBindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MBindings</em>'.
	 * @see kevoree.ContainerRoot#getMBindings()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_MBindings();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.ContainerRoot#getDeployUnits <em>Deploy Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deploy Units</em>'.
	 * @see kevoree.ContainerRoot#getDeployUnits()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_DeployUnits();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.ContainerRoot#getNodeNetworks <em>Node Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Networks</em>'.
	 * @see kevoree.ContainerRoot#getNodeNetworks()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_NodeNetworks();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.ContainerRoot#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see kevoree.ContainerRoot#getGroups()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.ContainerRoot#getGroupTypes <em>Group Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group Types</em>'.
	 * @see kevoree.ContainerRoot#getGroupTypes()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_GroupTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.ContainerRoot#getAdaptationPrimitiveTypes <em>Adaptation Primitive Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adaptation Primitive Types</em>'.
	 * @see kevoree.ContainerRoot#getAdaptationPrimitiveTypes()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_AdaptationPrimitiveTypes();

	/**
	 * Returns the meta object for class '{@link kevoree.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type</em>'.
	 * @see kevoree.PortType
	 * @generated
	 */
	EClass getPortType();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.PortType#isSynchrone <em>Synchrone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchrone</em>'.
	 * @see kevoree.PortType#isSynchrone()
	 * @see #getPortType()
	 * @generated
	 */
	EAttribute getPortType_Synchrone();

	/**
	 * Returns the meta object for class '{@link kevoree.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see kevoree.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference '{@link kevoree.Port#getPortTypeRef <em>Port Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Type Ref</em>'.
	 * @see kevoree.Port#getPortTypeRef()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_PortTypeRef();

	/**
	 * Returns the meta object for class '{@link kevoree.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see kevoree.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.Namespace#getChilds <em>Childs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Childs</em>'.
	 * @see kevoree.Namespace#getChilds()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_Childs();

	/**
	 * Returns the meta object for the reference '{@link kevoree.Namespace#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see kevoree.Namespace#getParent()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_Parent();

	/**
	 * Returns the meta object for class '{@link kevoree.Dictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary</em>'.
	 * @see kevoree.Dictionary
	 * @generated
	 */
	EClass getDictionary();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.Dictionary#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see kevoree.Dictionary#getValues()
	 * @see #getDictionary()
	 * @generated
	 */
	EReference getDictionary_Values();

	/**
	 * Returns the meta object for class '{@link kevoree.DictionaryType <em>Dictionary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary Type</em>'.
	 * @see kevoree.DictionaryType
	 * @generated
	 */
	EClass getDictionaryType();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.DictionaryType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see kevoree.DictionaryType#getAttributes()
	 * @see #getDictionaryType()
	 * @generated
	 */
	EReference getDictionaryType_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.DictionaryType#getDefaultValues <em>Default Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Default Values</em>'.
	 * @see kevoree.DictionaryType#getDefaultValues()
	 * @see #getDictionaryType()
	 * @generated
	 */
	EReference getDictionaryType_DefaultValues();

	/**
	 * Returns the meta object for class '{@link kevoree.DictionaryAttribute <em>Dictionary Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary Attribute</em>'.
	 * @see kevoree.DictionaryAttribute
	 * @generated
	 */
	EClass getDictionaryAttribute();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.DictionaryAttribute#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see kevoree.DictionaryAttribute#isOptional()
	 * @see #getDictionaryAttribute()
	 * @generated
	 */
	EAttribute getDictionaryAttribute_Optional();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.DictionaryAttribute#isState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see kevoree.DictionaryAttribute#isState()
	 * @see #getDictionaryAttribute()
	 * @generated
	 */
	EAttribute getDictionaryAttribute_State();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.DictionaryAttribute#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see kevoree.DictionaryAttribute#getDatatype()
	 * @see #getDictionaryAttribute()
	 * @generated
	 */
	EAttribute getDictionaryAttribute_Datatype();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.DictionaryAttribute#isFragmentDependant <em>Fragment Dependant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fragment Dependant</em>'.
	 * @see kevoree.DictionaryAttribute#isFragmentDependant()
	 * @see #getDictionaryAttribute()
	 * @generated
	 */
	EAttribute getDictionaryAttribute_FragmentDependant();

	/**
	 * Returns the meta object for class '{@link kevoree.DictionaryValue <em>Dictionary Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary Value</em>'.
	 * @see kevoree.DictionaryValue
	 * @generated
	 */
	EClass getDictionaryValue();

	/**
	 * Returns the meta object for the reference '{@link kevoree.DictionaryValue#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see kevoree.DictionaryValue#getAttribute()
	 * @see #getDictionaryValue()
	 * @generated
	 */
	EReference getDictionaryValue_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.DictionaryValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kevoree.DictionaryValue#getValue()
	 * @see #getDictionaryValue()
	 * @generated
	 */
	EAttribute getDictionaryValue_Value();

	/**
	 * Returns the meta object for the reference '{@link kevoree.DictionaryValue#getTargetNode <em>Target Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Node</em>'.
	 * @see kevoree.DictionaryValue#getTargetNode()
	 * @see #getDictionaryValue()
	 * @generated
	 */
	EReference getDictionaryValue_TargetNode();

	/**
	 * Returns the meta object for class '{@link kevoree.CompositeType <em>Composite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Type</em>'.
	 * @see kevoree.CompositeType
	 * @generated
	 */
	EClass getCompositeType();

	/**
	 * Returns the meta object for the reference list '{@link kevoree.CompositeType#getChilds <em>Childs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Childs</em>'.
	 * @see kevoree.CompositeType#getChilds()
	 * @see #getCompositeType()
	 * @generated
	 */
	EReference getCompositeType_Childs();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.CompositeType#getWires <em>Wires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wires</em>'.
	 * @see kevoree.CompositeType#getWires()
	 * @see #getCompositeType()
	 * @generated
	 */
	EReference getCompositeType_Wires();

	/**
	 * Returns the meta object for class '{@link kevoree.PortTypeRef <em>Port Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type Ref</em>'.
	 * @see kevoree.PortTypeRef
	 * @generated
	 */
	EClass getPortTypeRef();

	/**
	 * Returns the meta object for the reference '{@link kevoree.PortTypeRef#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see kevoree.PortTypeRef#getRef()
	 * @see #getPortTypeRef()
	 * @generated
	 */
	EReference getPortTypeRef_Ref();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.PortTypeRef#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see kevoree.PortTypeRef#getMappings()
	 * @see #getPortTypeRef()
	 * @generated
	 */
	EReference getPortTypeRef_Mappings();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.PortTypeRef#getOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see kevoree.PortTypeRef#getOptional()
	 * @see #getPortTypeRef()
	 * @generated
	 */
	EAttribute getPortTypeRef_Optional();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.PortTypeRef#getNoDependency <em>No Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Dependency</em>'.
	 * @see kevoree.PortTypeRef#getNoDependency()
	 * @see #getPortTypeRef()
	 * @generated
	 */
	EAttribute getPortTypeRef_NoDependency();

	/**
	 * Returns the meta object for class '{@link kevoree.Wire <em>Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wire</em>'.
	 * @see kevoree.Wire
	 * @generated
	 */
	EClass getWire();

	/**
	 * Returns the meta object for the reference list '{@link kevoree.Wire#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ports</em>'.
	 * @see kevoree.Wire#getPorts()
	 * @see #getWire()
	 * @generated
	 */
	EReference getWire_Ports();

	/**
	 * Returns the meta object for class '{@link kevoree.ServicePortType <em>Service Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Port Type</em>'.
	 * @see kevoree.ServicePortType
	 * @generated
	 */
	EClass getServicePortType();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.ServicePortType#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see kevoree.ServicePortType#getOperations()
	 * @see #getServicePortType()
	 * @generated
	 */
	EReference getServicePortType_Operations();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.ServicePortType#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface</em>'.
	 * @see kevoree.ServicePortType#getInterface()
	 * @see #getServicePortType()
	 * @generated
	 */
	EAttribute getServicePortType_Interface();

	/**
	 * Returns the meta object for class '{@link kevoree.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see kevoree.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.Operation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see kevoree.Operation#getParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Parameters();

	/**
	 * Returns the meta object for the reference '{@link kevoree.Operation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see kevoree.Operation#getReturnType()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ReturnType();

	/**
	 * Returns the meta object for class '{@link kevoree.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see kevoree.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the reference '{@link kevoree.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see kevoree.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for class '{@link kevoree.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see kevoree.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the reference list '{@link kevoree.TypedElement#getGenericTypes <em>Generic Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generic Types</em>'.
	 * @see kevoree.TypedElement#getGenericTypes()
	 * @see #getTypedElement()
	 * @generated
	 */
	EReference getTypedElement_GenericTypes();

	/**
	 * Returns the meta object for class '{@link kevoree.MessagePortType <em>Message Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Port Type</em>'.
	 * @see kevoree.MessagePortType
	 * @generated
	 */
	EClass getMessagePortType();

	/**
	 * Returns the meta object for the reference list '{@link kevoree.MessagePortType#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Filters</em>'.
	 * @see kevoree.MessagePortType#getFilters()
	 * @see #getMessagePortType()
	 * @generated
	 */
	EReference getMessagePortType_Filters();

	/**
	 * Returns the meta object for class '{@link kevoree.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see kevoree.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the reference list '{@link kevoree.Repository#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Units</em>'.
	 * @see kevoree.Repository#getUnits()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Units();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.Repository#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see kevoree.Repository#getUrl()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Url();

	/**
	 * Returns the meta object for class '{@link kevoree.DeployUnit <em>Deploy Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deploy Unit</em>'.
	 * @see kevoree.DeployUnit
	 * @generated
	 */
	EClass getDeployUnit();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.DeployUnit#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name</em>'.
	 * @see kevoree.DeployUnit#getGroupName()
	 * @see #getDeployUnit()
	 * @generated
	 */
	EAttribute getDeployUnit_GroupName();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.DeployUnit#getUnitName <em>Unit Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Name</em>'.
	 * @see kevoree.DeployUnit#getUnitName()
	 * @see #getDeployUnit()
	 * @generated
	 */
	EAttribute getDeployUnit_UnitName();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.DeployUnit#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see kevoree.DeployUnit#getVersion()
	 * @see #getDeployUnit()
	 * @generated
	 */
	EAttribute getDeployUnit_Version();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.DeployUnit#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see kevoree.DeployUnit#getUrl()
	 * @see #getDeployUnit()
	 * @generated
	 */
	EAttribute getDeployUnit_Url();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.DeployUnit#getHashcode <em>Hashcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hashcode</em>'.
	 * @see kevoree.DeployUnit#getHashcode()
	 * @see #getDeployUnit()
	 * @generated
	 */
	EAttribute getDeployUnit_Hashcode();

	/**
	 * Returns the meta object for the reference list '{@link kevoree.DeployUnit#getRequiredLibs <em>Required Libs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Libs</em>'.
	 * @see kevoree.DeployUnit#getRequiredLibs()
	 * @see #getDeployUnit()
	 * @generated
	 */
	EReference getDeployUnit_RequiredLibs();

	/**
	 * Returns the meta object for the reference '{@link kevoree.DeployUnit#getTargetNodeType <em>Target Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Node Type</em>'.
	 * @see kevoree.DeployUnit#getTargetNodeType()
	 * @see #getDeployUnit()
	 * @generated
	 */
	EReference getDeployUnit_TargetNodeType();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.DeployUnit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see kevoree.DeployUnit#getType()
	 * @see #getDeployUnit()
	 * @generated
	 */
	EAttribute getDeployUnit_Type();

	/**
	 * Returns the meta object for class '{@link kevoree.TypeLibrary <em>Type Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Library</em>'.
	 * @see kevoree.TypeLibrary
	 * @generated
	 */
	EClass getTypeLibrary();

	/**
	 * Returns the meta object for the reference list '{@link kevoree.TypeLibrary#getSubTypes <em>Sub Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Types</em>'.
	 * @see kevoree.TypeLibrary#getSubTypes()
	 * @see #getTypeLibrary()
	 * @generated
	 */
	EReference getTypeLibrary_SubTypes();

	/**
	 * Returns the meta object for class '{@link kevoree.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see kevoree.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kevoree.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link kevoree.IntegrationPattern <em>Integration Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integration Pattern</em>'.
	 * @see kevoree.IntegrationPattern
	 * @generated
	 */
	EClass getIntegrationPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.IntegrationPattern#getExtraFonctionalProperties <em>Extra Fonctional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extra Fonctional Properties</em>'.
	 * @see kevoree.IntegrationPattern#getExtraFonctionalProperties()
	 * @see #getIntegrationPattern()
	 * @generated
	 */
	EReference getIntegrationPattern_ExtraFonctionalProperties();

	/**
	 * Returns the meta object for the reference list '{@link kevoree.IntegrationPattern#getPortTypes <em>Port Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Types</em>'.
	 * @see kevoree.IntegrationPattern#getPortTypes()
	 * @see #getIntegrationPattern()
	 * @generated
	 */
	EReference getIntegrationPattern_PortTypes();

	/**
	 * Returns the meta object for class '{@link kevoree.ExtraFonctionalProperty <em>Extra Fonctional Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extra Fonctional Property</em>'.
	 * @see kevoree.ExtraFonctionalProperty
	 * @generated
	 */
	EClass getExtraFonctionalProperty();

	/**
	 * Returns the meta object for the reference list '{@link kevoree.ExtraFonctionalProperty#getPortTypes <em>Port Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Types</em>'.
	 * @see kevoree.ExtraFonctionalProperty#getPortTypes()
	 * @see #getExtraFonctionalProperty()
	 * @generated
	 */
	EReference getExtraFonctionalProperty_PortTypes();

	/**
	 * Returns the meta object for class '{@link kevoree.PortTypeMapping <em>Port Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type Mapping</em>'.
	 * @see kevoree.PortTypeMapping
	 * @generated
	 */
	EClass getPortTypeMapping();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.PortTypeMapping#getBeanMethodName <em>Bean Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bean Method Name</em>'.
	 * @see kevoree.PortTypeMapping#getBeanMethodName()
	 * @see #getPortTypeMapping()
	 * @generated
	 */
	EAttribute getPortTypeMapping_BeanMethodName();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.PortTypeMapping#getServiceMethodName <em>Service Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Method Name</em>'.
	 * @see kevoree.PortTypeMapping#getServiceMethodName()
	 * @see #getPortTypeMapping()
	 * @generated
	 */
	EAttribute getPortTypeMapping_ServiceMethodName();

	/**
	 * Returns the meta object for class '{@link kevoree.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see kevoree.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for class '{@link kevoree.MBinding <em>MBinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBinding</em>'.
	 * @see kevoree.MBinding
	 * @generated
	 */
	EClass getMBinding();

	/**
	 * Returns the meta object for the reference '{@link kevoree.MBinding#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see kevoree.MBinding#getPort()
	 * @see #getMBinding()
	 * @generated
	 */
	EReference getMBinding_Port();

	/**
	 * Returns the meta object for the reference '{@link kevoree.MBinding#getHub <em>Hub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hub</em>'.
	 * @see kevoree.MBinding#getHub()
	 * @see #getMBinding()
	 * @generated
	 */
	EReference getMBinding_Hub();

	/**
	 * Returns the meta object for class '{@link kevoree.NodeNetwork <em>Node Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Network</em>'.
	 * @see kevoree.NodeNetwork
	 * @generated
	 */
	EClass getNodeNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.NodeNetwork#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see kevoree.NodeNetwork#getLink()
	 * @see #getNodeNetwork()
	 * @generated
	 */
	EReference getNodeNetwork_Link();

	/**
	 * Returns the meta object for the reference '{@link kevoree.NodeNetwork#getInitBy <em>Init By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Init By</em>'.
	 * @see kevoree.NodeNetwork#getInitBy()
	 * @see #getNodeNetwork()
	 * @generated
	 */
	EReference getNodeNetwork_InitBy();

	/**
	 * Returns the meta object for the reference '{@link kevoree.NodeNetwork#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see kevoree.NodeNetwork#getTarget()
	 * @see #getNodeNetwork()
	 * @generated
	 */
	EReference getNodeNetwork_Target();

	/**
	 * Returns the meta object for class '{@link kevoree.NodeLink <em>Node Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Link</em>'.
	 * @see kevoree.NodeLink
	 * @generated
	 */
	EClass getNodeLink();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.NodeLink#getNetworkType <em>Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Type</em>'.
	 * @see kevoree.NodeLink#getNetworkType()
	 * @see #getNodeLink()
	 * @generated
	 */
	EAttribute getNodeLink_NetworkType();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.NodeLink#getEstimatedRate <em>Estimated Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Rate</em>'.
	 * @see kevoree.NodeLink#getEstimatedRate()
	 * @see #getNodeLink()
	 * @generated
	 */
	EAttribute getNodeLink_EstimatedRate();

	/**
	 * Returns the meta object for the containment reference list '{@link kevoree.NodeLink#getNetworkProperties <em>Network Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Network Properties</em>'.
	 * @see kevoree.NodeLink#getNetworkProperties()
	 * @see #getNodeLink()
	 * @generated
	 */
	EReference getNodeLink_NetworkProperties();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.NodeLink#getLastCheck <em>Last Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Check</em>'.
	 * @see kevoree.NodeLink#getLastCheck()
	 * @see #getNodeLink()
	 * @generated
	 */
	EAttribute getNodeLink_LastCheck();

	/**
	 * Returns the meta object for class '{@link kevoree.NetworkProperty <em>Network Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Property</em>'.
	 * @see kevoree.NetworkProperty
	 * @generated
	 */
	EClass getNetworkProperty();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.NetworkProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kevoree.NetworkProperty#getValue()
	 * @see #getNetworkProperty()
	 * @generated
	 */
	EAttribute getNetworkProperty_Value();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.NetworkProperty#getLastCheck <em>Last Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Check</em>'.
	 * @see kevoree.NetworkProperty#getLastCheck()
	 * @see #getNetworkProperty()
	 * @generated
	 */
	EAttribute getNetworkProperty_LastCheck();

	/**
	 * Returns the meta object for class '{@link kevoree.ChannelType <em>Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel Type</em>'.
	 * @see kevoree.ChannelType
	 * @generated
	 */
	EClass getChannelType();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.ChannelType#getLowerBindings <em>Lower Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bindings</em>'.
	 * @see kevoree.ChannelType#getLowerBindings()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_LowerBindings();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.ChannelType#getUpperBindings <em>Upper Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bindings</em>'.
	 * @see kevoree.ChannelType#getUpperBindings()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_UpperBindings();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.ChannelType#getLowerFragments <em>Lower Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Fragments</em>'.
	 * @see kevoree.ChannelType#getLowerFragments()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_LowerFragments();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.ChannelType#getUpperFragments <em>Upper Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Fragments</em>'.
	 * @see kevoree.ChannelType#getUpperFragments()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_UpperFragments();

	/**
	 * Returns the meta object for class '{@link kevoree.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Definition</em>'.
	 * @see kevoree.TypeDefinition
	 * @generated
	 */
	EClass getTypeDefinition();

	/**
	 * Returns the meta object for the reference list '{@link kevoree.TypeDefinition#getDeployUnits <em>Deploy Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deploy Units</em>'.
	 * @see kevoree.TypeDefinition#getDeployUnits()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	EReference getTypeDefinition_DeployUnits();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.TypeDefinition#getFactoryBean <em>Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factory Bean</em>'.
	 * @see kevoree.TypeDefinition#getFactoryBean()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	EAttribute getTypeDefinition_FactoryBean();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.TypeDefinition#getBean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bean</em>'.
	 * @see kevoree.TypeDefinition#getBean()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	EAttribute getTypeDefinition_Bean();

	/**
	 * Returns the meta object for the containment reference '{@link kevoree.TypeDefinition#getDictionaryType <em>Dictionary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dictionary Type</em>'.
	 * @see kevoree.TypeDefinition#getDictionaryType()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	EReference getTypeDefinition_DictionaryType();

	/**
	 * Returns the meta object for the reference list '{@link kevoree.TypeDefinition#getSuperTypes <em>Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Types</em>'.
	 * @see kevoree.TypeDefinition#getSuperTypes()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	EReference getTypeDefinition_SuperTypes();

	/**
	 * Returns the meta object for class '{@link kevoree.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see kevoree.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the reference '{@link kevoree.Instance#getTypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Definition</em>'.
	 * @see kevoree.Instance#getTypeDefinition()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_TypeDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link kevoree.Instance#getDictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dictionary</em>'.
	 * @see kevoree.Instance#getDictionary()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Dictionary();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.Instance#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Data</em>'.
	 * @see kevoree.Instance#getMetaData()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_MetaData();

	/**
	 * Returns the meta object for class '{@link kevoree.LifeCycleTypeDefinition <em>Life Cycle Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Life Cycle Type Definition</em>'.
	 * @see kevoree.LifeCycleTypeDefinition
	 * @generated
	 */
	EClass getLifeCycleTypeDefinition();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.LifeCycleTypeDefinition#getStartMethod <em>Start Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Method</em>'.
	 * @see kevoree.LifeCycleTypeDefinition#getStartMethod()
	 * @see #getLifeCycleTypeDefinition()
	 * @generated
	 */
	EAttribute getLifeCycleTypeDefinition_StartMethod();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.LifeCycleTypeDefinition#getStopMethod <em>Stop Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Method</em>'.
	 * @see kevoree.LifeCycleTypeDefinition#getStopMethod()
	 * @see #getLifeCycleTypeDefinition()
	 * @generated
	 */
	EAttribute getLifeCycleTypeDefinition_StopMethod();

	/**
	 * Returns the meta object for the attribute '{@link kevoree.LifeCycleTypeDefinition#getUpdateMethod <em>Update Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Method</em>'.
	 * @see kevoree.LifeCycleTypeDefinition#getUpdateMethod()
	 * @see #getLifeCycleTypeDefinition()
	 * @generated
	 */
	EAttribute getLifeCycleTypeDefinition_UpdateMethod();

	/**
	 * Returns the meta object for class '{@link kevoree.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see kevoree.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the reference list '{@link kevoree.Group#getSubNodes <em>Sub Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Nodes</em>'.
	 * @see kevoree.Group#getSubNodes()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_SubNodes();

	/**
	 * Returns the meta object for class '{@link kevoree.GroupType <em>Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Type</em>'.
	 * @see kevoree.GroupType
	 * @generated
	 */
	EClass getGroupType();

	/**
	 * Returns the meta object for class '{@link kevoree.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Type</em>'.
	 * @see kevoree.NodeType
	 * @generated
	 */
	EClass getNodeType();

	/**
	 * Returns the meta object for the reference list '{@link kevoree.NodeType#getManagedPrimitiveTypes <em>Managed Primitive Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Managed Primitive Types</em>'.
	 * @see kevoree.NodeType#getManagedPrimitiveTypes()
	 * @see #getNodeType()
	 * @generated
	 */
	EReference getNodeType_ManagedPrimitiveTypes();

	/**
	 * Returns the meta object for class '{@link kevoree.AdaptationPrimitiveType <em>Adaptation Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptation Primitive Type</em>'.
	 * @see kevoree.AdaptationPrimitiveType
	 * @generated
	 */
	EClass getAdaptationPrimitiveType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KevoreeFactory getKevoreeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link kevoree.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.ComponentInstanceImpl
		 * @see kevoree.impl.KevoreePackageImpl#getComponentInstance()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE = eINSTANCE.getComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Provided</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__PROVIDED = eINSTANCE.getComponentInstance_Provided();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__REQUIRED = eINSTANCE.getComponentInstance_Required();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__NAMESPACE = eINSTANCE.getComponentInstance_Namespace();

		/**
		 * The meta object literal for the '{@link kevoree.impl.ComponentTypeImpl <em>Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.ComponentTypeImpl
		 * @see kevoree.impl.KevoreePackageImpl#getComponentType()
		 * @generated
		 */
		EClass COMPONENT_TYPE = eINSTANCE.getComponentType();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__REQUIRED = eINSTANCE.getComponentType_Required();

		/**
		 * The meta object literal for the '<em><b>Integration Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__INTEGRATION_PATTERNS = eINSTANCE.getComponentType_IntegrationPatterns();

		/**
		 * The meta object literal for the '<em><b>Extra Fonctional Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES = eINSTANCE.getComponentType_ExtraFonctionalProperties();

		/**
		 * The meta object literal for the '<em><b>Provided</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__PROVIDED = eINSTANCE.getComponentType_Provided();

		/**
		 * The meta object literal for the '{@link kevoree.impl.ContainerNodeImpl <em>Container Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.ContainerNodeImpl
		 * @see kevoree.impl.KevoreePackageImpl#getContainerNode()
		 * @generated
		 */
		EClass CONTAINER_NODE = eINSTANCE.getContainerNode();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_NODE__COMPONENTS = eINSTANCE.getContainerNode_Components();

		/**
		 * The meta object literal for the '<em><b>Hosts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_NODE__HOSTS = eINSTANCE.getContainerNode_Hosts();

		/**
		 * The meta object literal for the '{@link kevoree.impl.ContainerRootImpl <em>Container Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.ContainerRootImpl
		 * @see kevoree.impl.KevoreePackageImpl#getContainerRoot()
		 * @generated
		 */
		EClass CONTAINER_ROOT = eINSTANCE.getContainerRoot();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROOT__NODES = eINSTANCE.getContainerRoot_Nodes();

		/**
		 * The meta object literal for the '<em><b>Type Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROOT__TYPE_DEFINITIONS = eINSTANCE.getContainerRoot_TypeDefinitions();

		/**
		 * The meta object literal for the '<em><b>Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROOT__REPOSITORIES = eINSTANCE.getContainerRoot_Repositories();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROOT__DATA_TYPES = eINSTANCE.getContainerRoot_DataTypes();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROOT__LIBRARIES = eINSTANCE.getContainerRoot_Libraries();

		/**
		 * The meta object literal for the '<em><b>Hubs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROOT__HUBS = eINSTANCE.getContainerRoot_Hubs();

		/**
		 * The meta object literal for the '<em><b>MBindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROOT__MBINDINGS = eINSTANCE.getContainerRoot_MBindings();

		/**
		 * The meta object literal for the '<em><b>Deploy Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROOT__DEPLOY_UNITS = eINSTANCE.getContainerRoot_DeployUnits();

		/**
		 * The meta object literal for the '<em><b>Node Networks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROOT__NODE_NETWORKS = eINSTANCE.getContainerRoot_NodeNetworks();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROOT__GROUPS = eINSTANCE.getContainerRoot_Groups();

		/**
		 * The meta object literal for the '<em><b>Group Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROOT__GROUP_TYPES = eINSTANCE.getContainerRoot_GroupTypes();

		/**
		 * The meta object literal for the '<em><b>Adaptation Primitive Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROOT__ADAPTATION_PRIMITIVE_TYPES = eINSTANCE.getContainerRoot_AdaptationPrimitiveTypes();

		/**
		 * The meta object literal for the '{@link kevoree.impl.PortTypeImpl <em>Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.PortTypeImpl
		 * @see kevoree.impl.KevoreePackageImpl#getPortType()
		 * @generated
		 */
		EClass PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '<em><b>Synchrone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE__SYNCHRONE = eINSTANCE.getPortType_Synchrone();

		/**
		 * The meta object literal for the '{@link kevoree.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.PortImpl
		 * @see kevoree.impl.KevoreePackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Port Type Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__PORT_TYPE_REF = eINSTANCE.getPort_PortTypeRef();

		/**
		 * The meta object literal for the '{@link kevoree.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.NamespaceImpl
		 * @see kevoree.impl.KevoreePackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '<em><b>Childs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__CHILDS = eINSTANCE.getNamespace_Childs();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__PARENT = eINSTANCE.getNamespace_Parent();

		/**
		 * The meta object literal for the '{@link kevoree.impl.DictionaryImpl <em>Dictionary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.DictionaryImpl
		 * @see kevoree.impl.KevoreePackageImpl#getDictionary()
		 * @generated
		 */
		EClass DICTIONARY = eINSTANCE.getDictionary();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY__VALUES = eINSTANCE.getDictionary_Values();

		/**
		 * The meta object literal for the '{@link kevoree.impl.DictionaryTypeImpl <em>Dictionary Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.DictionaryTypeImpl
		 * @see kevoree.impl.KevoreePackageImpl#getDictionaryType()
		 * @generated
		 */
		EClass DICTIONARY_TYPE = eINSTANCE.getDictionaryType();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY_TYPE__ATTRIBUTES = eINSTANCE.getDictionaryType_Attributes();

		/**
		 * The meta object literal for the '<em><b>Default Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY_TYPE__DEFAULT_VALUES = eINSTANCE.getDictionaryType_DefaultValues();

		/**
		 * The meta object literal for the '{@link kevoree.impl.DictionaryAttributeImpl <em>Dictionary Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.DictionaryAttributeImpl
		 * @see kevoree.impl.KevoreePackageImpl#getDictionaryAttribute()
		 * @generated
		 */
		EClass DICTIONARY_ATTRIBUTE = eINSTANCE.getDictionaryAttribute();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICTIONARY_ATTRIBUTE__OPTIONAL = eINSTANCE.getDictionaryAttribute_Optional();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICTIONARY_ATTRIBUTE__STATE = eINSTANCE.getDictionaryAttribute_State();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICTIONARY_ATTRIBUTE__DATATYPE = eINSTANCE.getDictionaryAttribute_Datatype();

		/**
		 * The meta object literal for the '<em><b>Fragment Dependant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICTIONARY_ATTRIBUTE__FRAGMENT_DEPENDANT = eINSTANCE.getDictionaryAttribute_FragmentDependant();

		/**
		 * The meta object literal for the '{@link kevoree.impl.DictionaryValueImpl <em>Dictionary Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.DictionaryValueImpl
		 * @see kevoree.impl.KevoreePackageImpl#getDictionaryValue()
		 * @generated
		 */
		EClass DICTIONARY_VALUE = eINSTANCE.getDictionaryValue();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY_VALUE__ATTRIBUTE = eINSTANCE.getDictionaryValue_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICTIONARY_VALUE__VALUE = eINSTANCE.getDictionaryValue_Value();

		/**
		 * The meta object literal for the '<em><b>Target Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY_VALUE__TARGET_NODE = eINSTANCE.getDictionaryValue_TargetNode();

		/**
		 * The meta object literal for the '{@link kevoree.impl.CompositeTypeImpl <em>Composite Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.CompositeTypeImpl
		 * @see kevoree.impl.KevoreePackageImpl#getCompositeType()
		 * @generated
		 */
		EClass COMPOSITE_TYPE = eINSTANCE.getCompositeType();

		/**
		 * The meta object literal for the '<em><b>Childs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TYPE__CHILDS = eINSTANCE.getCompositeType_Childs();

		/**
		 * The meta object literal for the '<em><b>Wires</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TYPE__WIRES = eINSTANCE.getCompositeType_Wires();

		/**
		 * The meta object literal for the '{@link kevoree.impl.PortTypeRefImpl <em>Port Type Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.PortTypeRefImpl
		 * @see kevoree.impl.KevoreePackageImpl#getPortTypeRef()
		 * @generated
		 */
		EClass PORT_TYPE_REF = eINSTANCE.getPortTypeRef();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_TYPE_REF__REF = eINSTANCE.getPortTypeRef_Ref();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_TYPE_REF__MAPPINGS = eINSTANCE.getPortTypeRef_Mappings();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE_REF__OPTIONAL = eINSTANCE.getPortTypeRef_Optional();

		/**
		 * The meta object literal for the '<em><b>No Dependency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE_REF__NO_DEPENDENCY = eINSTANCE.getPortTypeRef_NoDependency();

		/**
		 * The meta object literal for the '{@link kevoree.impl.WireImpl <em>Wire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.WireImpl
		 * @see kevoree.impl.KevoreePackageImpl#getWire()
		 * @generated
		 */
		EClass WIRE = eINSTANCE.getWire();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIRE__PORTS = eINSTANCE.getWire_Ports();

		/**
		 * The meta object literal for the '{@link kevoree.impl.ServicePortTypeImpl <em>Service Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.ServicePortTypeImpl
		 * @see kevoree.impl.KevoreePackageImpl#getServicePortType()
		 * @generated
		 */
		EClass SERVICE_PORT_TYPE = eINSTANCE.getServicePortType();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PORT_TYPE__OPERATIONS = eINSTANCE.getServicePortType_Operations();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PORT_TYPE__INTERFACE = eINSTANCE.getServicePortType_Interface();

		/**
		 * The meta object literal for the '{@link kevoree.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.OperationImpl
		 * @see kevoree.impl.KevoreePackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RETURN_TYPE = eINSTANCE.getOperation_ReturnType();

		/**
		 * The meta object literal for the '{@link kevoree.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.ParameterImpl
		 * @see kevoree.impl.KevoreePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link kevoree.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.TypedElementImpl
		 * @see kevoree.impl.KevoreePackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Generic Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ELEMENT__GENERIC_TYPES = eINSTANCE.getTypedElement_GenericTypes();

		/**
		 * The meta object literal for the '{@link kevoree.impl.MessagePortTypeImpl <em>Message Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.MessagePortTypeImpl
		 * @see kevoree.impl.KevoreePackageImpl#getMessagePortType()
		 * @generated
		 */
		EClass MESSAGE_PORT_TYPE = eINSTANCE.getMessagePortType();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_PORT_TYPE__FILTERS = eINSTANCE.getMessagePortType_Filters();

		/**
		 * The meta object literal for the '{@link kevoree.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.RepositoryImpl
		 * @see kevoree.impl.KevoreePackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__UNITS = eINSTANCE.getRepository_Units();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__URL = eINSTANCE.getRepository_Url();

		/**
		 * The meta object literal for the '{@link kevoree.impl.DeployUnitImpl <em>Deploy Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.DeployUnitImpl
		 * @see kevoree.impl.KevoreePackageImpl#getDeployUnit()
		 * @generated
		 */
		EClass DEPLOY_UNIT = eINSTANCE.getDeployUnit();

		/**
		 * The meta object literal for the '<em><b>Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY_UNIT__GROUP_NAME = eINSTANCE.getDeployUnit_GroupName();

		/**
		 * The meta object literal for the '<em><b>Unit Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY_UNIT__UNIT_NAME = eINSTANCE.getDeployUnit_UnitName();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY_UNIT__VERSION = eINSTANCE.getDeployUnit_Version();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY_UNIT__URL = eINSTANCE.getDeployUnit_Url();

		/**
		 * The meta object literal for the '<em><b>Hashcode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY_UNIT__HASHCODE = eINSTANCE.getDeployUnit_Hashcode();

		/**
		 * The meta object literal for the '<em><b>Required Libs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY_UNIT__REQUIRED_LIBS = eINSTANCE.getDeployUnit_RequiredLibs();

		/**
		 * The meta object literal for the '<em><b>Target Node Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY_UNIT__TARGET_NODE_TYPE = eINSTANCE.getDeployUnit_TargetNodeType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY_UNIT__TYPE = eINSTANCE.getDeployUnit_Type();

		/**
		 * The meta object literal for the '{@link kevoree.impl.TypeLibraryImpl <em>Type Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.TypeLibraryImpl
		 * @see kevoree.impl.KevoreePackageImpl#getTypeLibrary()
		 * @generated
		 */
		EClass TYPE_LIBRARY = eINSTANCE.getTypeLibrary();

		/**
		 * The meta object literal for the '<em><b>Sub Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_LIBRARY__SUB_TYPES = eINSTANCE.getTypeLibrary_SubTypes();

		/**
		 * The meta object literal for the '{@link kevoree.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.NamedElementImpl
		 * @see kevoree.impl.KevoreePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link kevoree.impl.IntegrationPatternImpl <em>Integration Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.IntegrationPatternImpl
		 * @see kevoree.impl.KevoreePackageImpl#getIntegrationPattern()
		 * @generated
		 */
		EClass INTEGRATION_PATTERN = eINSTANCE.getIntegrationPattern();

		/**
		 * The meta object literal for the '<em><b>Extra Fonctional Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_PATTERN__EXTRA_FONCTIONAL_PROPERTIES = eINSTANCE.getIntegrationPattern_ExtraFonctionalProperties();

		/**
		 * The meta object literal for the '<em><b>Port Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_PATTERN__PORT_TYPES = eINSTANCE.getIntegrationPattern_PortTypes();

		/**
		 * The meta object literal for the '{@link kevoree.impl.ExtraFonctionalPropertyImpl <em>Extra Fonctional Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.ExtraFonctionalPropertyImpl
		 * @see kevoree.impl.KevoreePackageImpl#getExtraFonctionalProperty()
		 * @generated
		 */
		EClass EXTRA_FONCTIONAL_PROPERTY = eINSTANCE.getExtraFonctionalProperty();

		/**
		 * The meta object literal for the '<em><b>Port Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRA_FONCTIONAL_PROPERTY__PORT_TYPES = eINSTANCE.getExtraFonctionalProperty_PortTypes();

		/**
		 * The meta object literal for the '{@link kevoree.impl.PortTypeMappingImpl <em>Port Type Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.PortTypeMappingImpl
		 * @see kevoree.impl.KevoreePackageImpl#getPortTypeMapping()
		 * @generated
		 */
		EClass PORT_TYPE_MAPPING = eINSTANCE.getPortTypeMapping();

		/**
		 * The meta object literal for the '<em><b>Bean Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE_MAPPING__BEAN_METHOD_NAME = eINSTANCE.getPortTypeMapping_BeanMethodName();

		/**
		 * The meta object literal for the '<em><b>Service Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE_MAPPING__SERVICE_METHOD_NAME = eINSTANCE.getPortTypeMapping_ServiceMethodName();

		/**
		 * The meta object literal for the '{@link kevoree.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.ChannelImpl
		 * @see kevoree.impl.KevoreePackageImpl#getChannel()
		 * @generated
		 */
		EClass CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '{@link kevoree.impl.MBindingImpl <em>MBinding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.MBindingImpl
		 * @see kevoree.impl.KevoreePackageImpl#getMBinding()
		 * @generated
		 */
		EClass MBINDING = eINSTANCE.getMBinding();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MBINDING__PORT = eINSTANCE.getMBinding_Port();

		/**
		 * The meta object literal for the '<em><b>Hub</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MBINDING__HUB = eINSTANCE.getMBinding_Hub();

		/**
		 * The meta object literal for the '{@link kevoree.impl.NodeNetworkImpl <em>Node Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.NodeNetworkImpl
		 * @see kevoree.impl.KevoreePackageImpl#getNodeNetwork()
		 * @generated
		 */
		EClass NODE_NETWORK = eINSTANCE.getNodeNetwork();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_NETWORK__LINK = eINSTANCE.getNodeNetwork_Link();

		/**
		 * The meta object literal for the '<em><b>Init By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_NETWORK__INIT_BY = eINSTANCE.getNodeNetwork_InitBy();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_NETWORK__TARGET = eINSTANCE.getNodeNetwork_Target();

		/**
		 * The meta object literal for the '{@link kevoree.impl.NodeLinkImpl <em>Node Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.NodeLinkImpl
		 * @see kevoree.impl.KevoreePackageImpl#getNodeLink()
		 * @generated
		 */
		EClass NODE_LINK = eINSTANCE.getNodeLink();

		/**
		 * The meta object literal for the '<em><b>Network Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_LINK__NETWORK_TYPE = eINSTANCE.getNodeLink_NetworkType();

		/**
		 * The meta object literal for the '<em><b>Estimated Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_LINK__ESTIMATED_RATE = eINSTANCE.getNodeLink_EstimatedRate();

		/**
		 * The meta object literal for the '<em><b>Network Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_LINK__NETWORK_PROPERTIES = eINSTANCE.getNodeLink_NetworkProperties();

		/**
		 * The meta object literal for the '<em><b>Last Check</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_LINK__LAST_CHECK = eINSTANCE.getNodeLink_LastCheck();

		/**
		 * The meta object literal for the '{@link kevoree.impl.NetworkPropertyImpl <em>Network Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.NetworkPropertyImpl
		 * @see kevoree.impl.KevoreePackageImpl#getNetworkProperty()
		 * @generated
		 */
		EClass NETWORK_PROPERTY = eINSTANCE.getNetworkProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_PROPERTY__VALUE = eINSTANCE.getNetworkProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Last Check</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_PROPERTY__LAST_CHECK = eINSTANCE.getNetworkProperty_LastCheck();

		/**
		 * The meta object literal for the '{@link kevoree.impl.ChannelTypeImpl <em>Channel Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.ChannelTypeImpl
		 * @see kevoree.impl.KevoreePackageImpl#getChannelType()
		 * @generated
		 */
		EClass CHANNEL_TYPE = eINSTANCE.getChannelType();

		/**
		 * The meta object literal for the '<em><b>Lower Bindings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_TYPE__LOWER_BINDINGS = eINSTANCE.getChannelType_LowerBindings();

		/**
		 * The meta object literal for the '<em><b>Upper Bindings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_TYPE__UPPER_BINDINGS = eINSTANCE.getChannelType_UpperBindings();

		/**
		 * The meta object literal for the '<em><b>Lower Fragments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_TYPE__LOWER_FRAGMENTS = eINSTANCE.getChannelType_LowerFragments();

		/**
		 * The meta object literal for the '<em><b>Upper Fragments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_TYPE__UPPER_FRAGMENTS = eINSTANCE.getChannelType_UpperFragments();

		/**
		 * The meta object literal for the '{@link kevoree.TypeDefinition <em>Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.TypeDefinition
		 * @see kevoree.impl.KevoreePackageImpl#getTypeDefinition()
		 * @generated
		 */
		EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Deploy Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEFINITION__DEPLOY_UNITS = eINSTANCE.getTypeDefinition_DeployUnits();

		/**
		 * The meta object literal for the '<em><b>Factory Bean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DEFINITION__FACTORY_BEAN = eINSTANCE.getTypeDefinition_FactoryBean();

		/**
		 * The meta object literal for the '<em><b>Bean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DEFINITION__BEAN = eINSTANCE.getTypeDefinition_Bean();

		/**
		 * The meta object literal for the '<em><b>Dictionary Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEFINITION__DICTIONARY_TYPE = eINSTANCE.getTypeDefinition_DictionaryType();

		/**
		 * The meta object literal for the '<em><b>Super Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEFINITION__SUPER_TYPES = eINSTANCE.getTypeDefinition_SuperTypes();

		/**
		 * The meta object literal for the '{@link kevoree.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.InstanceImpl
		 * @see kevoree.impl.KevoreePackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Type Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__TYPE_DEFINITION = eINSTANCE.getInstance_TypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Dictionary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__DICTIONARY = eINSTANCE.getInstance_Dictionary();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__META_DATA = eINSTANCE.getInstance_MetaData();

		/**
		 * The meta object literal for the '{@link kevoree.LifeCycleTypeDefinition <em>Life Cycle Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.LifeCycleTypeDefinition
		 * @see kevoree.impl.KevoreePackageImpl#getLifeCycleTypeDefinition()
		 * @generated
		 */
		EClass LIFE_CYCLE_TYPE_DEFINITION = eINSTANCE.getLifeCycleTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Start Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFE_CYCLE_TYPE_DEFINITION__START_METHOD = eINSTANCE.getLifeCycleTypeDefinition_StartMethod();

		/**
		 * The meta object literal for the '<em><b>Stop Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFE_CYCLE_TYPE_DEFINITION__STOP_METHOD = eINSTANCE.getLifeCycleTypeDefinition_StopMethod();

		/**
		 * The meta object literal for the '<em><b>Update Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFE_CYCLE_TYPE_DEFINITION__UPDATE_METHOD = eINSTANCE.getLifeCycleTypeDefinition_UpdateMethod();

		/**
		 * The meta object literal for the '{@link kevoree.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.GroupImpl
		 * @see kevoree.impl.KevoreePackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Sub Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__SUB_NODES = eINSTANCE.getGroup_SubNodes();

		/**
		 * The meta object literal for the '{@link kevoree.impl.GroupTypeImpl <em>Group Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.GroupTypeImpl
		 * @see kevoree.impl.KevoreePackageImpl#getGroupType()
		 * @generated
		 */
		EClass GROUP_TYPE = eINSTANCE.getGroupType();

		/**
		 * The meta object literal for the '{@link kevoree.impl.NodeTypeImpl <em>Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.NodeTypeImpl
		 * @see kevoree.impl.KevoreePackageImpl#getNodeType()
		 * @generated
		 */
		EClass NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '<em><b>Managed Primitive Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TYPE__MANAGED_PRIMITIVE_TYPES = eINSTANCE.getNodeType_ManagedPrimitiveTypes();

		/**
		 * The meta object literal for the '{@link kevoree.impl.AdaptationPrimitiveTypeImpl <em>Adaptation Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kevoree.impl.AdaptationPrimitiveTypeImpl
		 * @see kevoree.impl.KevoreePackageImpl#getAdaptationPrimitiveType()
		 * @generated
		 */
		EClass ADAPTATION_PRIMITIVE_TYPE = eINSTANCE.getAdaptationPrimitiveType();

	}

} //KevoreePackage
