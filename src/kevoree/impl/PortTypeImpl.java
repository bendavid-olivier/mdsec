/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree.impl;

import java.util.Collection;

import kevoree.DeployUnit;
import kevoree.DictionaryType;
import kevoree.KevoreePackage;
import kevoree.PortType;
import kevoree.TypeDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kevoree.impl.PortTypeImpl#getDeployUnits <em>Deploy Units</em>}</li>
 *   <li>{@link kevoree.impl.PortTypeImpl#getFactoryBean <em>Factory Bean</em>}</li>
 *   <li>{@link kevoree.impl.PortTypeImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link kevoree.impl.PortTypeImpl#getDictionaryType <em>Dictionary Type</em>}</li>
 *   <li>{@link kevoree.impl.PortTypeImpl#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link kevoree.impl.PortTypeImpl#isSynchrone <em>Synchrone</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PortTypeImpl extends NamedElementImpl implements PortType {
	/**
	 * The cached value of the '{@link #getDeployUnits() <em>Deploy Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployUnit> deployUnits;

	/**
	 * The default value of the '{@link #getFactoryBean() <em>Factory Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryBean()
	 * @generated
	 * @ordered
	 */
	protected static final String FACTORY_BEAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFactoryBean() <em>Factory Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryBean()
	 * @generated
	 * @ordered
	 */
	protected String factoryBean = FACTORY_BEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBean() <em>Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBean()
	 * @generated
	 * @ordered
	 */
	protected static final String BEAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBean() <em>Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBean()
	 * @generated
	 * @ordered
	 */
	protected String bean = BEAN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDictionaryType() <em>Dictionary Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionaryType()
	 * @generated
	 * @ordered
	 */
	protected DictionaryType dictionaryType;

	/**
	 * The cached value of the '{@link #getSuperTypes() <em>Super Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDefinition> superTypes;

	/**
	 * The default value of the '{@link #isSynchrone() <em>Synchrone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchrone()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNCHRONE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSynchrone() <em>Synchrone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchrone()
	 * @generated
	 * @ordered
	 */
	protected boolean synchrone = SYNCHRONE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KevoreePackage.Literals.PORT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployUnit> getDeployUnits() {
		if (deployUnits == null) {
			deployUnits = new EObjectResolvingEList<DeployUnit>(DeployUnit.class, this, KevoreePackage.PORT_TYPE__DEPLOY_UNITS);
		}
		return deployUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFactoryBean() {
		return factoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactoryBean(String newFactoryBean) {
		String oldFactoryBean = factoryBean;
		factoryBean = newFactoryBean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.PORT_TYPE__FACTORY_BEAN, oldFactoryBean, factoryBean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBean() {
		return bean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBean(String newBean) {
		String oldBean = bean;
		bean = newBean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.PORT_TYPE__BEAN, oldBean, bean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryType getDictionaryType() {
		return dictionaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDictionaryType(DictionaryType newDictionaryType, NotificationChain msgs) {
		DictionaryType oldDictionaryType = dictionaryType;
		dictionaryType = newDictionaryType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KevoreePackage.PORT_TYPE__DICTIONARY_TYPE, oldDictionaryType, newDictionaryType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDictionaryType(DictionaryType newDictionaryType) {
		if (newDictionaryType != dictionaryType) {
			NotificationChain msgs = null;
			if (dictionaryType != null)
				msgs = ((InternalEObject)dictionaryType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KevoreePackage.PORT_TYPE__DICTIONARY_TYPE, null, msgs);
			if (newDictionaryType != null)
				msgs = ((InternalEObject)newDictionaryType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KevoreePackage.PORT_TYPE__DICTIONARY_TYPE, null, msgs);
			msgs = basicSetDictionaryType(newDictionaryType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.PORT_TYPE__DICTIONARY_TYPE, newDictionaryType, newDictionaryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDefinition> getSuperTypes() {
		if (superTypes == null) {
			superTypes = new EObjectResolvingEList<TypeDefinition>(TypeDefinition.class, this, KevoreePackage.PORT_TYPE__SUPER_TYPES);
		}
		return superTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSynchrone() {
		return synchrone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchrone(boolean newSynchrone) {
		boolean oldSynchrone = synchrone;
		synchrone = newSynchrone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.PORT_TYPE__SYNCHRONE, oldSynchrone, synchrone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KevoreePackage.PORT_TYPE__DICTIONARY_TYPE:
				return basicSetDictionaryType(null, msgs);
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
			case KevoreePackage.PORT_TYPE__DEPLOY_UNITS:
				return getDeployUnits();
			case KevoreePackage.PORT_TYPE__FACTORY_BEAN:
				return getFactoryBean();
			case KevoreePackage.PORT_TYPE__BEAN:
				return getBean();
			case KevoreePackage.PORT_TYPE__DICTIONARY_TYPE:
				return getDictionaryType();
			case KevoreePackage.PORT_TYPE__SUPER_TYPES:
				return getSuperTypes();
			case KevoreePackage.PORT_TYPE__SYNCHRONE:
				return isSynchrone();
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
			case KevoreePackage.PORT_TYPE__DEPLOY_UNITS:
				getDeployUnits().clear();
				getDeployUnits().addAll((Collection<? extends DeployUnit>)newValue);
				return;
			case KevoreePackage.PORT_TYPE__FACTORY_BEAN:
				setFactoryBean((String)newValue);
				return;
			case KevoreePackage.PORT_TYPE__BEAN:
				setBean((String)newValue);
				return;
			case KevoreePackage.PORT_TYPE__DICTIONARY_TYPE:
				setDictionaryType((DictionaryType)newValue);
				return;
			case KevoreePackage.PORT_TYPE__SUPER_TYPES:
				getSuperTypes().clear();
				getSuperTypes().addAll((Collection<? extends TypeDefinition>)newValue);
				return;
			case KevoreePackage.PORT_TYPE__SYNCHRONE:
				setSynchrone((Boolean)newValue);
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
			case KevoreePackage.PORT_TYPE__DEPLOY_UNITS:
				getDeployUnits().clear();
				return;
			case KevoreePackage.PORT_TYPE__FACTORY_BEAN:
				setFactoryBean(FACTORY_BEAN_EDEFAULT);
				return;
			case KevoreePackage.PORT_TYPE__BEAN:
				setBean(BEAN_EDEFAULT);
				return;
			case KevoreePackage.PORT_TYPE__DICTIONARY_TYPE:
				setDictionaryType((DictionaryType)null);
				return;
			case KevoreePackage.PORT_TYPE__SUPER_TYPES:
				getSuperTypes().clear();
				return;
			case KevoreePackage.PORT_TYPE__SYNCHRONE:
				setSynchrone(SYNCHRONE_EDEFAULT);
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
			case KevoreePackage.PORT_TYPE__DEPLOY_UNITS:
				return deployUnits != null && !deployUnits.isEmpty();
			case KevoreePackage.PORT_TYPE__FACTORY_BEAN:
				return FACTORY_BEAN_EDEFAULT == null ? factoryBean != null : !FACTORY_BEAN_EDEFAULT.equals(factoryBean);
			case KevoreePackage.PORT_TYPE__BEAN:
				return BEAN_EDEFAULT == null ? bean != null : !BEAN_EDEFAULT.equals(bean);
			case KevoreePackage.PORT_TYPE__DICTIONARY_TYPE:
				return dictionaryType != null;
			case KevoreePackage.PORT_TYPE__SUPER_TYPES:
				return superTypes != null && !superTypes.isEmpty();
			case KevoreePackage.PORT_TYPE__SYNCHRONE:
				return synchrone != SYNCHRONE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (factoryBean: ");
		result.append(factoryBean);
		result.append(", bean: ");
		result.append(bean);
		result.append(", synchrone: ");
		result.append(synchrone);
		result.append(')');
		return result.toString();
	}

} //PortTypeImpl
