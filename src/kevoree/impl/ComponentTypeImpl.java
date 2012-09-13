/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree.impl;

import java.util.Collection;

import kevoree.ComponentType;
import kevoree.DeployUnit;
import kevoree.DictionaryType;
import kevoree.ExtraFonctionalProperty;
import kevoree.IntegrationPattern;
import kevoree.KevoreePackage;
import kevoree.PortTypeRef;
import kevoree.TypeDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kevoree.impl.ComponentTypeImpl#getDeployUnits <em>Deploy Units</em>}</li>
 *   <li>{@link kevoree.impl.ComponentTypeImpl#getFactoryBean <em>Factory Bean</em>}</li>
 *   <li>{@link kevoree.impl.ComponentTypeImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link kevoree.impl.ComponentTypeImpl#getDictionaryType <em>Dictionary Type</em>}</li>
 *   <li>{@link kevoree.impl.ComponentTypeImpl#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link kevoree.impl.ComponentTypeImpl#getStartMethod <em>Start Method</em>}</li>
 *   <li>{@link kevoree.impl.ComponentTypeImpl#getStopMethod <em>Stop Method</em>}</li>
 *   <li>{@link kevoree.impl.ComponentTypeImpl#getUpdateMethod <em>Update Method</em>}</li>
 *   <li>{@link kevoree.impl.ComponentTypeImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link kevoree.impl.ComponentTypeImpl#getIntegrationPatterns <em>Integration Patterns</em>}</li>
 *   <li>{@link kevoree.impl.ComponentTypeImpl#getExtraFonctionalProperties <em>Extra Fonctional Properties</em>}</li>
 *   <li>{@link kevoree.impl.ComponentTypeImpl#getProvided <em>Provided</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentTypeImpl extends NamedElementImpl implements ComponentType {
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
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected EList<PortTypeRef> required;

	/**
	 * The cached value of the '{@link #getIntegrationPatterns() <em>Integration Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrationPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegrationPattern> integrationPatterns;

	/**
	 * The cached value of the '{@link #getExtraFonctionalProperties() <em>Extra Fonctional Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraFonctionalProperties()
	 * @generated
	 * @ordered
	 */
	protected ExtraFonctionalProperty extraFonctionalProperties;

	/**
	 * The cached value of the '{@link #getProvided() <em>Provided</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvided()
	 * @generated
	 * @ordered
	 */
	protected EList<PortTypeRef> provided;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KevoreePackage.Literals.COMPONENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployUnit> getDeployUnits() {
		if (deployUnits == null) {
			deployUnits = new EObjectResolvingEList<DeployUnit>(DeployUnit.class, this, KevoreePackage.COMPONENT_TYPE__DEPLOY_UNITS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.COMPONENT_TYPE__FACTORY_BEAN, oldFactoryBean, factoryBean));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.COMPONENT_TYPE__BEAN, oldBean, bean));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KevoreePackage.COMPONENT_TYPE__DICTIONARY_TYPE, oldDictionaryType, newDictionaryType);
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
				msgs = ((InternalEObject)dictionaryType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KevoreePackage.COMPONENT_TYPE__DICTIONARY_TYPE, null, msgs);
			if (newDictionaryType != null)
				msgs = ((InternalEObject)newDictionaryType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KevoreePackage.COMPONENT_TYPE__DICTIONARY_TYPE, null, msgs);
			msgs = basicSetDictionaryType(newDictionaryType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.COMPONENT_TYPE__DICTIONARY_TYPE, newDictionaryType, newDictionaryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDefinition> getSuperTypes() {
		if (superTypes == null) {
			superTypes = new EObjectResolvingEList<TypeDefinition>(TypeDefinition.class, this, KevoreePackage.COMPONENT_TYPE__SUPER_TYPES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.COMPONENT_TYPE__START_METHOD, oldStartMethod, startMethod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.COMPONENT_TYPE__STOP_METHOD, oldStopMethod, stopMethod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.COMPONENT_TYPE__UPDATE_METHOD, oldUpdateMethod, updateMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortTypeRef> getRequired() {
		if (required == null) {
			required = new EObjectContainmentEList<PortTypeRef>(PortTypeRef.class, this, KevoreePackage.COMPONENT_TYPE__REQUIRED);
		}
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegrationPattern> getIntegrationPatterns() {
		if (integrationPatterns == null) {
			integrationPatterns = new EObjectContainmentEList<IntegrationPattern>(IntegrationPattern.class, this, KevoreePackage.COMPONENT_TYPE__INTEGRATION_PATTERNS);
		}
		return integrationPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtraFonctionalProperty getExtraFonctionalProperties() {
		return extraFonctionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtraFonctionalProperties(ExtraFonctionalProperty newExtraFonctionalProperties, NotificationChain msgs) {
		ExtraFonctionalProperty oldExtraFonctionalProperties = extraFonctionalProperties;
		extraFonctionalProperties = newExtraFonctionalProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KevoreePackage.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES, oldExtraFonctionalProperties, newExtraFonctionalProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraFonctionalProperties(ExtraFonctionalProperty newExtraFonctionalProperties) {
		if (newExtraFonctionalProperties != extraFonctionalProperties) {
			NotificationChain msgs = null;
			if (extraFonctionalProperties != null)
				msgs = ((InternalEObject)extraFonctionalProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KevoreePackage.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES, null, msgs);
			if (newExtraFonctionalProperties != null)
				msgs = ((InternalEObject)newExtraFonctionalProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KevoreePackage.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES, null, msgs);
			msgs = basicSetExtraFonctionalProperties(newExtraFonctionalProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES, newExtraFonctionalProperties, newExtraFonctionalProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortTypeRef> getProvided() {
		if (provided == null) {
			provided = new EObjectContainmentEList<PortTypeRef>(PortTypeRef.class, this, KevoreePackage.COMPONENT_TYPE__PROVIDED);
		}
		return provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KevoreePackage.COMPONENT_TYPE__DICTIONARY_TYPE:
				return basicSetDictionaryType(null, msgs);
			case KevoreePackage.COMPONENT_TYPE__REQUIRED:
				return ((InternalEList<?>)getRequired()).basicRemove(otherEnd, msgs);
			case KevoreePackage.COMPONENT_TYPE__INTEGRATION_PATTERNS:
				return ((InternalEList<?>)getIntegrationPatterns()).basicRemove(otherEnd, msgs);
			case KevoreePackage.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES:
				return basicSetExtraFonctionalProperties(null, msgs);
			case KevoreePackage.COMPONENT_TYPE__PROVIDED:
				return ((InternalEList<?>)getProvided()).basicRemove(otherEnd, msgs);
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
			case KevoreePackage.COMPONENT_TYPE__DEPLOY_UNITS:
				return getDeployUnits();
			case KevoreePackage.COMPONENT_TYPE__FACTORY_BEAN:
				return getFactoryBean();
			case KevoreePackage.COMPONENT_TYPE__BEAN:
				return getBean();
			case KevoreePackage.COMPONENT_TYPE__DICTIONARY_TYPE:
				return getDictionaryType();
			case KevoreePackage.COMPONENT_TYPE__SUPER_TYPES:
				return getSuperTypes();
			case KevoreePackage.COMPONENT_TYPE__START_METHOD:
				return getStartMethod();
			case KevoreePackage.COMPONENT_TYPE__STOP_METHOD:
				return getStopMethod();
			case KevoreePackage.COMPONENT_TYPE__UPDATE_METHOD:
				return getUpdateMethod();
			case KevoreePackage.COMPONENT_TYPE__REQUIRED:
				return getRequired();
			case KevoreePackage.COMPONENT_TYPE__INTEGRATION_PATTERNS:
				return getIntegrationPatterns();
			case KevoreePackage.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES:
				return getExtraFonctionalProperties();
			case KevoreePackage.COMPONENT_TYPE__PROVIDED:
				return getProvided();
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
			case KevoreePackage.COMPONENT_TYPE__DEPLOY_UNITS:
				getDeployUnits().clear();
				getDeployUnits().addAll((Collection<? extends DeployUnit>)newValue);
				return;
			case KevoreePackage.COMPONENT_TYPE__FACTORY_BEAN:
				setFactoryBean((String)newValue);
				return;
			case KevoreePackage.COMPONENT_TYPE__BEAN:
				setBean((String)newValue);
				return;
			case KevoreePackage.COMPONENT_TYPE__DICTIONARY_TYPE:
				setDictionaryType((DictionaryType)newValue);
				return;
			case KevoreePackage.COMPONENT_TYPE__SUPER_TYPES:
				getSuperTypes().clear();
				getSuperTypes().addAll((Collection<? extends TypeDefinition>)newValue);
				return;
			case KevoreePackage.COMPONENT_TYPE__START_METHOD:
				setStartMethod((String)newValue);
				return;
			case KevoreePackage.COMPONENT_TYPE__STOP_METHOD:
				setStopMethod((String)newValue);
				return;
			case KevoreePackage.COMPONENT_TYPE__UPDATE_METHOD:
				setUpdateMethod((String)newValue);
				return;
			case KevoreePackage.COMPONENT_TYPE__REQUIRED:
				getRequired().clear();
				getRequired().addAll((Collection<? extends PortTypeRef>)newValue);
				return;
			case KevoreePackage.COMPONENT_TYPE__INTEGRATION_PATTERNS:
				getIntegrationPatterns().clear();
				getIntegrationPatterns().addAll((Collection<? extends IntegrationPattern>)newValue);
				return;
			case KevoreePackage.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES:
				setExtraFonctionalProperties((ExtraFonctionalProperty)newValue);
				return;
			case KevoreePackage.COMPONENT_TYPE__PROVIDED:
				getProvided().clear();
				getProvided().addAll((Collection<? extends PortTypeRef>)newValue);
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
			case KevoreePackage.COMPONENT_TYPE__DEPLOY_UNITS:
				getDeployUnits().clear();
				return;
			case KevoreePackage.COMPONENT_TYPE__FACTORY_BEAN:
				setFactoryBean(FACTORY_BEAN_EDEFAULT);
				return;
			case KevoreePackage.COMPONENT_TYPE__BEAN:
				setBean(BEAN_EDEFAULT);
				return;
			case KevoreePackage.COMPONENT_TYPE__DICTIONARY_TYPE:
				setDictionaryType((DictionaryType)null);
				return;
			case KevoreePackage.COMPONENT_TYPE__SUPER_TYPES:
				getSuperTypes().clear();
				return;
			case KevoreePackage.COMPONENT_TYPE__START_METHOD:
				setStartMethod(START_METHOD_EDEFAULT);
				return;
			case KevoreePackage.COMPONENT_TYPE__STOP_METHOD:
				setStopMethod(STOP_METHOD_EDEFAULT);
				return;
			case KevoreePackage.COMPONENT_TYPE__UPDATE_METHOD:
				setUpdateMethod(UPDATE_METHOD_EDEFAULT);
				return;
			case KevoreePackage.COMPONENT_TYPE__REQUIRED:
				getRequired().clear();
				return;
			case KevoreePackage.COMPONENT_TYPE__INTEGRATION_PATTERNS:
				getIntegrationPatterns().clear();
				return;
			case KevoreePackage.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES:
				setExtraFonctionalProperties((ExtraFonctionalProperty)null);
				return;
			case KevoreePackage.COMPONENT_TYPE__PROVIDED:
				getProvided().clear();
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
			case KevoreePackage.COMPONENT_TYPE__DEPLOY_UNITS:
				return deployUnits != null && !deployUnits.isEmpty();
			case KevoreePackage.COMPONENT_TYPE__FACTORY_BEAN:
				return FACTORY_BEAN_EDEFAULT == null ? factoryBean != null : !FACTORY_BEAN_EDEFAULT.equals(factoryBean);
			case KevoreePackage.COMPONENT_TYPE__BEAN:
				return BEAN_EDEFAULT == null ? bean != null : !BEAN_EDEFAULT.equals(bean);
			case KevoreePackage.COMPONENT_TYPE__DICTIONARY_TYPE:
				return dictionaryType != null;
			case KevoreePackage.COMPONENT_TYPE__SUPER_TYPES:
				return superTypes != null && !superTypes.isEmpty();
			case KevoreePackage.COMPONENT_TYPE__START_METHOD:
				return START_METHOD_EDEFAULT == null ? startMethod != null : !START_METHOD_EDEFAULT.equals(startMethod);
			case KevoreePackage.COMPONENT_TYPE__STOP_METHOD:
				return STOP_METHOD_EDEFAULT == null ? stopMethod != null : !STOP_METHOD_EDEFAULT.equals(stopMethod);
			case KevoreePackage.COMPONENT_TYPE__UPDATE_METHOD:
				return UPDATE_METHOD_EDEFAULT == null ? updateMethod != null : !UPDATE_METHOD_EDEFAULT.equals(updateMethod);
			case KevoreePackage.COMPONENT_TYPE__REQUIRED:
				return required != null && !required.isEmpty();
			case KevoreePackage.COMPONENT_TYPE__INTEGRATION_PATTERNS:
				return integrationPatterns != null && !integrationPatterns.isEmpty();
			case KevoreePackage.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES:
				return extraFonctionalProperties != null;
			case KevoreePackage.COMPONENT_TYPE__PROVIDED:
				return provided != null && !provided.isEmpty();
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

} //ComponentTypeImpl
