/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree.impl;

import kevoree.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KevoreeFactoryImpl extends EFactoryImpl implements KevoreeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KevoreeFactory init() {
		try {
			KevoreeFactory theKevoreeFactory = (KevoreeFactory)EPackage.Registry.INSTANCE.getEFactory("http://kevoree/1.0"); 
			if (theKevoreeFactory != null) {
				return theKevoreeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KevoreeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KevoreeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case KevoreePackage.COMPONENT_INSTANCE: return createComponentInstance();
			case KevoreePackage.COMPONENT_TYPE: return createComponentType();
			case KevoreePackage.CONTAINER_NODE: return createContainerNode();
			case KevoreePackage.CONTAINER_ROOT: return createContainerRoot();
			case KevoreePackage.PORT: return createPort();
			case KevoreePackage.NAMESPACE: return createNamespace();
			case KevoreePackage.DICTIONARY: return createDictionary();
			case KevoreePackage.DICTIONARY_TYPE: return createDictionaryType();
			case KevoreePackage.DICTIONARY_ATTRIBUTE: return createDictionaryAttribute();
			case KevoreePackage.DICTIONARY_VALUE: return createDictionaryValue();
			case KevoreePackage.COMPOSITE_TYPE: return createCompositeType();
			case KevoreePackage.PORT_TYPE_REF: return createPortTypeRef();
			case KevoreePackage.WIRE: return createWire();
			case KevoreePackage.SERVICE_PORT_TYPE: return createServicePortType();
			case KevoreePackage.OPERATION: return createOperation();
			case KevoreePackage.PARAMETER: return createParameter();
			case KevoreePackage.TYPED_ELEMENT: return createTypedElement();
			case KevoreePackage.MESSAGE_PORT_TYPE: return createMessagePortType();
			case KevoreePackage.REPOSITORY: return createRepository();
			case KevoreePackage.DEPLOY_UNIT: return createDeployUnit();
			case KevoreePackage.TYPE_LIBRARY: return createTypeLibrary();
			case KevoreePackage.NAMED_ELEMENT: return createNamedElement();
			case KevoreePackage.INTEGRATION_PATTERN: return createIntegrationPattern();
			case KevoreePackage.EXTRA_FONCTIONAL_PROPERTY: return createExtraFonctionalProperty();
			case KevoreePackage.PORT_TYPE_MAPPING: return createPortTypeMapping();
			case KevoreePackage.CHANNEL: return createChannel();
			case KevoreePackage.MBINDING: return createMBinding();
			case KevoreePackage.NODE_NETWORK: return createNodeNetwork();
			case KevoreePackage.NODE_LINK: return createNodeLink();
			case KevoreePackage.NETWORK_PROPERTY: return createNetworkProperty();
			case KevoreePackage.CHANNEL_TYPE: return createChannelType();
			case KevoreePackage.INSTANCE: return createInstance();
			case KevoreePackage.GROUP: return createGroup();
			case KevoreePackage.GROUP_TYPE: return createGroupType();
			case KevoreePackage.NODE_TYPE: return createNodeType();
			case KevoreePackage.ADAPTATION_PRIMITIVE_TYPE: return createAdaptationPrimitiveType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance createComponentInstance() {
		ComponentInstanceImpl componentInstance = new ComponentInstanceImpl();
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType createComponentType() {
		ComponentTypeImpl componentType = new ComponentTypeImpl();
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerNode createContainerNode() {
		ContainerNodeImpl containerNode = new ContainerNodeImpl();
		return containerNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerRoot createContainerRoot() {
		ContainerRootImpl containerRoot = new ContainerRootImpl();
		return containerRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace createNamespace() {
		NamespaceImpl namespace = new NamespaceImpl();
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dictionary createDictionary() {
		DictionaryImpl dictionary = new DictionaryImpl();
		return dictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryType createDictionaryType() {
		DictionaryTypeImpl dictionaryType = new DictionaryTypeImpl();
		return dictionaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryAttribute createDictionaryAttribute() {
		DictionaryAttributeImpl dictionaryAttribute = new DictionaryAttributeImpl();
		return dictionaryAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryValue createDictionaryValue() {
		DictionaryValueImpl dictionaryValue = new DictionaryValueImpl();
		return dictionaryValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeType createCompositeType() {
		CompositeTypeImpl compositeType = new CompositeTypeImpl();
		return compositeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortTypeRef createPortTypeRef() {
		PortTypeRefImpl portTypeRef = new PortTypeRefImpl();
		return portTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wire createWire() {
		WireImpl wire = new WireImpl();
		return wire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicePortType createServicePortType() {
		ServicePortTypeImpl servicePortType = new ServicePortTypeImpl();
		return servicePortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedElement createTypedElement() {
		TypedElementImpl typedElement = new TypedElementImpl();
		return typedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagePortType createMessagePortType() {
		MessagePortTypeImpl messagePortType = new MessagePortTypeImpl();
		return messagePortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployUnit createDeployUnit() {
		DeployUnitImpl deployUnit = new DeployUnitImpl();
		return deployUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLibrary createTypeLibrary() {
		TypeLibraryImpl typeLibrary = new TypeLibraryImpl();
		return typeLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationPattern createIntegrationPattern() {
		IntegrationPatternImpl integrationPattern = new IntegrationPatternImpl();
		return integrationPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtraFonctionalProperty createExtraFonctionalProperty() {
		ExtraFonctionalPropertyImpl extraFonctionalProperty = new ExtraFonctionalPropertyImpl();
		return extraFonctionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortTypeMapping createPortTypeMapping() {
		PortTypeMappingImpl portTypeMapping = new PortTypeMappingImpl();
		return portTypeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel createChannel() {
		ChannelImpl channel = new ChannelImpl();
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBinding createMBinding() {
		MBindingImpl mBinding = new MBindingImpl();
		return mBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeNetwork createNodeNetwork() {
		NodeNetworkImpl nodeNetwork = new NodeNetworkImpl();
		return nodeNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeLink createNodeLink() {
		NodeLinkImpl nodeLink = new NodeLinkImpl();
		return nodeLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkProperty createNetworkProperty() {
		NetworkPropertyImpl networkProperty = new NetworkPropertyImpl();
		return networkProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelType createChannelType() {
		ChannelTypeImpl channelType = new ChannelTypeImpl();
		return channelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance createInstance() {
		InstanceImpl instance = new InstanceImpl();
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupType createGroupType() {
		GroupTypeImpl groupType = new GroupTypeImpl();
		return groupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType createNodeType() {
		NodeTypeImpl nodeType = new NodeTypeImpl();
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationPrimitiveType createAdaptationPrimitiveType() {
		AdaptationPrimitiveTypeImpl adaptationPrimitiveType = new AdaptationPrimitiveTypeImpl();
		return adaptationPrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KevoreePackage getKevoreePackage() {
		return (KevoreePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KevoreePackage getPackage() {
		return KevoreePackage.eINSTANCE;
	}

} //KevoreeFactoryImpl
