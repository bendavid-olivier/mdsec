/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree.impl;

import java.util.Collection;

import kevoree.ComponentInstance;
import kevoree.Dictionary;
import kevoree.Instance;
import kevoree.KevoreePackage;
import kevoree.Namespace;
import kevoree.Port;
import kevoree.TypeDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kevoree.impl.ComponentInstanceImpl#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link kevoree.impl.ComponentInstanceImpl#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link kevoree.impl.ComponentInstanceImpl#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link kevoree.impl.ComponentInstanceImpl#getProvided <em>Provided</em>}</li>
 *   <li>{@link kevoree.impl.ComponentInstanceImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link kevoree.impl.ComponentInstanceImpl#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentInstanceImpl extends NamedElementImpl implements ComponentInstance {
	/**
	 * The cached value of the '{@link #getTypeDefinition() <em>Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected TypeDefinition typeDefinition;

	/**
	 * The cached value of the '{@link #getDictionary() <em>Dictionary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionary()
	 * @generated
	 * @ordered
	 */
	protected Dictionary dictionary;

	/**
	 * The default value of the '{@link #getMetaData() <em>Meta Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaData()
	 * @generated
	 * @ordered
	 */
	protected static final String META_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaData() <em>Meta Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaData()
	 * @generated
	 * @ordered
	 */
	protected String metaData = META_DATA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProvided() <em>Provided</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvided()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> provided;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> required;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected Namespace namespace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KevoreePackage.Literals.COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition getTypeDefinition() {
		if (typeDefinition != null && typeDefinition.eIsProxy()) {
			InternalEObject oldTypeDefinition = (InternalEObject)typeDefinition;
			typeDefinition = (TypeDefinition)eResolveProxy(oldTypeDefinition);
			if (typeDefinition != oldTypeDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KevoreePackage.COMPONENT_INSTANCE__TYPE_DEFINITION, oldTypeDefinition, typeDefinition));
			}
		}
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition basicGetTypeDefinition() {
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDefinition(TypeDefinition newTypeDefinition) {
		TypeDefinition oldTypeDefinition = typeDefinition;
		typeDefinition = newTypeDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.COMPONENT_INSTANCE__TYPE_DEFINITION, oldTypeDefinition, typeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dictionary getDictionary() {
		return dictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDictionary(Dictionary newDictionary, NotificationChain msgs) {
		Dictionary oldDictionary = dictionary;
		dictionary = newDictionary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KevoreePackage.COMPONENT_INSTANCE__DICTIONARY, oldDictionary, newDictionary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDictionary(Dictionary newDictionary) {
		if (newDictionary != dictionary) {
			NotificationChain msgs = null;
			if (dictionary != null)
				msgs = ((InternalEObject)dictionary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KevoreePackage.COMPONENT_INSTANCE__DICTIONARY, null, msgs);
			if (newDictionary != null)
				msgs = ((InternalEObject)newDictionary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KevoreePackage.COMPONENT_INSTANCE__DICTIONARY, null, msgs);
			msgs = basicSetDictionary(newDictionary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.COMPONENT_INSTANCE__DICTIONARY, newDictionary, newDictionary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaData() {
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaData(String newMetaData) {
		String oldMetaData = metaData;
		metaData = newMetaData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.COMPONENT_INSTANCE__META_DATA, oldMetaData, metaData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getProvided() {
		if (provided == null) {
			provided = new EObjectContainmentEList<Port>(Port.class, this, KevoreePackage.COMPONENT_INSTANCE__PROVIDED);
		}
		return provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getRequired() {
		if (required == null) {
			required = new EObjectContainmentEList<Port>(Port.class, this, KevoreePackage.COMPONENT_INSTANCE__REQUIRED);
		}
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		if (namespace != null && namespace.eIsProxy()) {
			InternalEObject oldNamespace = (InternalEObject)namespace;
			namespace = (Namespace)eResolveProxy(oldNamespace);
			if (namespace != oldNamespace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KevoreePackage.COMPONENT_INSTANCE__NAMESPACE, oldNamespace, namespace));
			}
		}
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(Namespace newNamespace) {
		Namespace oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.COMPONENT_INSTANCE__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KevoreePackage.COMPONENT_INSTANCE__DICTIONARY:
				return basicSetDictionary(null, msgs);
			case KevoreePackage.COMPONENT_INSTANCE__PROVIDED:
				return ((InternalEList<?>)getProvided()).basicRemove(otherEnd, msgs);
			case KevoreePackage.COMPONENT_INSTANCE__REQUIRED:
				return ((InternalEList<?>)getRequired()).basicRemove(otherEnd, msgs);
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
			case KevoreePackage.COMPONENT_INSTANCE__TYPE_DEFINITION:
				if (resolve) return getTypeDefinition();
				return basicGetTypeDefinition();
			case KevoreePackage.COMPONENT_INSTANCE__DICTIONARY:
				return getDictionary();
			case KevoreePackage.COMPONENT_INSTANCE__META_DATA:
				return getMetaData();
			case KevoreePackage.COMPONENT_INSTANCE__PROVIDED:
				return getProvided();
			case KevoreePackage.COMPONENT_INSTANCE__REQUIRED:
				return getRequired();
			case KevoreePackage.COMPONENT_INSTANCE__NAMESPACE:
				if (resolve) return getNamespace();
				return basicGetNamespace();
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
			case KevoreePackage.COMPONENT_INSTANCE__TYPE_DEFINITION:
				setTypeDefinition((TypeDefinition)newValue);
				return;
			case KevoreePackage.COMPONENT_INSTANCE__DICTIONARY:
				setDictionary((Dictionary)newValue);
				return;
			case KevoreePackage.COMPONENT_INSTANCE__META_DATA:
				setMetaData((String)newValue);
				return;
			case KevoreePackage.COMPONENT_INSTANCE__PROVIDED:
				getProvided().clear();
				getProvided().addAll((Collection<? extends Port>)newValue);
				return;
			case KevoreePackage.COMPONENT_INSTANCE__REQUIRED:
				getRequired().clear();
				getRequired().addAll((Collection<? extends Port>)newValue);
				return;
			case KevoreePackage.COMPONENT_INSTANCE__NAMESPACE:
				setNamespace((Namespace)newValue);
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
			case KevoreePackage.COMPONENT_INSTANCE__TYPE_DEFINITION:
				setTypeDefinition((TypeDefinition)null);
				return;
			case KevoreePackage.COMPONENT_INSTANCE__DICTIONARY:
				setDictionary((Dictionary)null);
				return;
			case KevoreePackage.COMPONENT_INSTANCE__META_DATA:
				setMetaData(META_DATA_EDEFAULT);
				return;
			case KevoreePackage.COMPONENT_INSTANCE__PROVIDED:
				getProvided().clear();
				return;
			case KevoreePackage.COMPONENT_INSTANCE__REQUIRED:
				getRequired().clear();
				return;
			case KevoreePackage.COMPONENT_INSTANCE__NAMESPACE:
				setNamespace((Namespace)null);
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
			case KevoreePackage.COMPONENT_INSTANCE__TYPE_DEFINITION:
				return typeDefinition != null;
			case KevoreePackage.COMPONENT_INSTANCE__DICTIONARY:
				return dictionary != null;
			case KevoreePackage.COMPONENT_INSTANCE__META_DATA:
				return META_DATA_EDEFAULT == null ? metaData != null : !META_DATA_EDEFAULT.equals(metaData);
			case KevoreePackage.COMPONENT_INSTANCE__PROVIDED:
				return provided != null && !provided.isEmpty();
			case KevoreePackage.COMPONENT_INSTANCE__REQUIRED:
				return required != null && !required.isEmpty();
			case KevoreePackage.COMPONENT_INSTANCE__NAMESPACE:
				return namespace != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Instance.class) {
			switch (derivedFeatureID) {
				case KevoreePackage.COMPONENT_INSTANCE__TYPE_DEFINITION: return KevoreePackage.INSTANCE__TYPE_DEFINITION;
				case KevoreePackage.COMPONENT_INSTANCE__DICTIONARY: return KevoreePackage.INSTANCE__DICTIONARY;
				case KevoreePackage.COMPONENT_INSTANCE__META_DATA: return KevoreePackage.INSTANCE__META_DATA;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Instance.class) {
			switch (baseFeatureID) {
				case KevoreePackage.INSTANCE__TYPE_DEFINITION: return KevoreePackage.COMPONENT_INSTANCE__TYPE_DEFINITION;
				case KevoreePackage.INSTANCE__DICTIONARY: return KevoreePackage.COMPONENT_INSTANCE__DICTIONARY;
				case KevoreePackage.INSTANCE__META_DATA: return KevoreePackage.COMPONENT_INSTANCE__META_DATA;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (metaData: ");
		result.append(metaData);
		result.append(')');
		return result.toString();
	}

} //ComponentInstanceImpl
