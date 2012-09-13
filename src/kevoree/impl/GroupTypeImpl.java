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
import kevoree.GroupType;
import kevoree.KevoreePackage;
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
 * An implementation of the model object '<em><b>Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kevoree.impl.GroupTypeImpl#getDeployUnits <em>Deploy Units</em>}</li>
 *   <li>{@link kevoree.impl.GroupTypeImpl#getFactoryBean <em>Factory Bean</em>}</li>
 *   <li>{@link kevoree.impl.GroupTypeImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link kevoree.impl.GroupTypeImpl#getDictionaryType <em>Dictionary Type</em>}</li>
 *   <li>{@link kevoree.impl.GroupTypeImpl#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link kevoree.impl.GroupTypeImpl#getStartMethod <em>Start Method</em>}</li>
 *   <li>{@link kevoree.impl.GroupTypeImpl#getStopMethod <em>Stop Method</em>}</li>
 *   <li>{@link kevoree.impl.GroupTypeImpl#getUpdateMethod <em>Update Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupTypeImpl extends NamedElementImpl implements GroupType {
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
	 * The default value of the '{@link #getStartMethod() <em>Start Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String START_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartMethod() <em>Start Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartMethod()
	 * @generated
	 * @ordered
	 */
	protected String startMethod = START_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getStopMethod() <em>Stop Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String STOP_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStopMethod() <em>Stop Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopMethod()
	 * @generated
	 * @ordered
	 */
	protected String stopMethod = STOP_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdateMethod() <em>Update Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String UPDATE_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdateMethod() <em>Update Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateMethod()
	 * @generated
	 * @ordered
	 */
	protected String updateMethod = UPDATE_METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KevoreePackage.Literals.GROUP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployUnit> getDeployUnits() {
		if (deployUnits == null) {
			deployUnits = new EObjectResolvingEList<DeployUnit>(DeployUnit.class, this, KevoreePackage.GROUP_TYPE__DEPLOY_UNITS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.GROUP_TYPE__FACTORY_BEAN, oldFactoryBean, factoryBean));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.GROUP_TYPE__BEAN, oldBean, bean));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KevoreePackage.GROUP_TYPE__DICTIONARY_TYPE, oldDictionaryType, newDictionaryType);
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
				msgs = ((InternalEObject)dictionaryType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KevoreePackage.GROUP_TYPE__DICTIONARY_TYPE, null, msgs);
			if (newDictionaryType != null)
				msgs = ((InternalEObject)newDictionaryType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KevoreePackage.GROUP_TYPE__DICTIONARY_TYPE, null, msgs);
			msgs = basicSetDictionaryType(newDictionaryType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.GROUP_TYPE__DICTIONARY_TYPE, newDictionaryType, newDictionaryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDefinition> getSuperTypes() {
		if (superTypes == null) {
			superTypes = new EObjectResolvingEList<TypeDefinition>(TypeDefinition.class, this, KevoreePackage.GROUP_TYPE__SUPER_TYPES);
		}
		return superTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartMethod() {
		return startMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartMethod(String newStartMethod) {
		String oldStartMethod = startMethod;
		startMethod = newStartMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.GROUP_TYPE__START_METHOD, oldStartMethod, startMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStopMethod() {
		return stopMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopMethod(String newStopMethod) {
		String oldStopMethod = stopMethod;
		stopMethod = newStopMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.GROUP_TYPE__STOP_METHOD, oldStopMethod, stopMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpdateMethod() {
		return updateMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateMethod(String newUpdateMethod) {
		String oldUpdateMethod = updateMethod;
		updateMethod = newUpdateMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.GROUP_TYPE__UPDATE_METHOD, oldUpdateMethod, updateMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KevoreePackage.GROUP_TYPE__DICTIONARY_TYPE:
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
			case KevoreePackage.GROUP_TYPE__DEPLOY_UNITS:
				return getDeployUnits();
			case KevoreePackage.GROUP_TYPE__FACTORY_BEAN:
				return getFactoryBean();
			case KevoreePackage.GROUP_TYPE__BEAN:
				return getBean();
			case KevoreePackage.GROUP_TYPE__DICTIONARY_TYPE:
				return getDictionaryType();
			case KevoreePackage.GROUP_TYPE__SUPER_TYPES:
				return getSuperTypes();
			case KevoreePackage.GROUP_TYPE__START_METHOD:
				return getStartMethod();
			case KevoreePackage.GROUP_TYPE__STOP_METHOD:
				return getStopMethod();
			case KevoreePackage.GROUP_TYPE__UPDATE_METHOD:
				return getUpdateMethod();
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
			case KevoreePackage.GROUP_TYPE__DEPLOY_UNITS:
				getDeployUnits().clear();
				getDeployUnits().addAll((Collection<? extends DeployUnit>)newValue);
				return;
			case KevoreePackage.GROUP_TYPE__FACTORY_BEAN:
				setFactoryBean((String)newValue);
				return;
			case KevoreePackage.GROUP_TYPE__BEAN:
				setBean((String)newValue);
				return;
			case KevoreePackage.GROUP_TYPE__DICTIONARY_TYPE:
				setDictionaryType((DictionaryType)newValue);
				return;
			case KevoreePackage.GROUP_TYPE__SUPER_TYPES:
				getSuperTypes().clear();
				getSuperTypes().addAll((Collection<? extends TypeDefinition>)newValue);
				return;
			case KevoreePackage.GROUP_TYPE__START_METHOD:
				setStartMethod((String)newValue);
				return;
			case KevoreePackage.GROUP_TYPE__STOP_METHOD:
				setStopMethod((String)newValue);
				return;
			case KevoreePackage.GROUP_TYPE__UPDATE_METHOD:
				setUpdateMethod((String)newValue);
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
			case KevoreePackage.GROUP_TYPE__DEPLOY_UNITS:
				getDeployUnits().clear();
				return;
			case KevoreePackage.GROUP_TYPE__FACTORY_BEAN:
				setFactoryBean(FACTORY_BEAN_EDEFAULT);
				return;
			case KevoreePackage.GROUP_TYPE__BEAN:
				setBean(BEAN_EDEFAULT);
				return;
			case KevoreePackage.GROUP_TYPE__DICTIONARY_TYPE:
				setDictionaryType((DictionaryType)null);
				return;
			case KevoreePackage.GROUP_TYPE__SUPER_TYPES:
				getSuperTypes().clear();
				return;
			case KevoreePackage.GROUP_TYPE__START_METHOD:
				setStartMethod(START_METHOD_EDEFAULT);
				return;
			case KevoreePackage.GROUP_TYPE__STOP_METHOD:
				setStopMethod(STOP_METHOD_EDEFAULT);
				return;
			case KevoreePackage.GROUP_TYPE__UPDATE_METHOD:
				setUpdateMethod(UPDATE_METHOD_EDEFAULT);
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
			case KevoreePackage.GROUP_TYPE__DEPLOY_UNITS:
				return deployUnits != null && !deployUnits.isEmpty();
			case KevoreePackage.GROUP_TYPE__FACTORY_BEAN:
				return FACTORY_BEAN_EDEFAULT == null ? factoryBean != null : !FACTORY_BEAN_EDEFAULT.equals(factoryBean);
			case KevoreePackage.GROUP_TYPE__BEAN:
				return BEAN_EDEFAULT == null ? bean != null : !BEAN_EDEFAULT.equals(bean);
			case KevoreePackage.GROUP_TYPE__DICTIONARY_TYPE:
				return dictionaryType != null;
			case KevoreePackage.GROUP_TYPE__SUPER_TYPES:
				return superTypes != null && !superTypes.isEmpty();
			case KevoreePackage.GROUP_TYPE__START_METHOD:
				return START_METHOD_EDEFAULT == null ? startMethod != null : !START_METHOD_EDEFAULT.equals(startMethod);
			case KevoreePackage.GROUP_TYPE__STOP_METHOD:
				return STOP_METHOD_EDEFAULT == null ? stopMethod != null : !STOP_METHOD_EDEFAULT.equals(stopMethod);
			case KevoreePackage.GROUP_TYPE__UPDATE_METHOD:
				return UPDATE_METHOD_EDEFAULT == null ? updateMethod != null : !UPDATE_METHOD_EDEFAULT.equals(updateMethod);
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
		result.append(", startMethod: ");
		result.append(startMethod);
		result.append(", stopMethod: ");
		result.append(stopMethod);
		result.append(", updateMethod: ");
		result.append(updateMethod);
		result.append(')');
		return result.toString();
	}

} //GroupTypeImpl
