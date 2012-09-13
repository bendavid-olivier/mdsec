/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree.impl;

import kevoree.KevoreePackage;
import kevoree.PortTypeMapping;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Type Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kevoree.impl.PortTypeMappingImpl#getBeanMethodName <em>Bean Method Name</em>}</li>
 *   <li>{@link kevoree.impl.PortTypeMappingImpl#getServiceMethodName <em>Service Method Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortTypeMappingImpl extends EObjectImpl implements PortTypeMapping {
	/**
	 * The default value of the '{@link #getBeanMethodName() <em>Bean Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeanMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String BEAN_METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeanMethodName() <em>Bean Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeanMethodName()
	 * @generated
	 * @ordered
	 */
	protected String beanMethodName = BEAN_METHOD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceMethodName() <em>Service Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceMethodName() <em>Service Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceMethodName()
	 * @generated
	 * @ordered
	 */
	protected String serviceMethodName = SERVICE_METHOD_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortTypeMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KevoreePackage.Literals.PORT_TYPE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeanMethodName() {
		return beanMethodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeanMethodName(String newBeanMethodName) {
		String oldBeanMethodName = beanMethodName;
		beanMethodName = newBeanMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.PORT_TYPE_MAPPING__BEAN_METHOD_NAME, oldBeanMethodName, beanMethodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceMethodName() {
		return serviceMethodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceMethodName(String newServiceMethodName) {
		String oldServiceMethodName = serviceMethodName;
		serviceMethodName = newServiceMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.PORT_TYPE_MAPPING__SERVICE_METHOD_NAME, oldServiceMethodName, serviceMethodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KevoreePackage.PORT_TYPE_MAPPING__BEAN_METHOD_NAME:
				return getBeanMethodName();
			case KevoreePackage.PORT_TYPE_MAPPING__SERVICE_METHOD_NAME:
				return getServiceMethodName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KevoreePackage.PORT_TYPE_MAPPING__BEAN_METHOD_NAME:
				setBeanMethodName((String)newValue);
				return;
			case KevoreePackage.PORT_TYPE_MAPPING__SERVICE_METHOD_NAME:
				setServiceMethodName((String)newValue);
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
			case KevoreePackage.PORT_TYPE_MAPPING__BEAN_METHOD_NAME:
				setBeanMethodName(BEAN_METHOD_NAME_EDEFAULT);
				return;
			case KevoreePackage.PORT_TYPE_MAPPING__SERVICE_METHOD_NAME:
				setServiceMethodName(SERVICE_METHOD_NAME_EDEFAULT);
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
			case KevoreePackage.PORT_TYPE_MAPPING__BEAN_METHOD_NAME:
				return BEAN_METHOD_NAME_EDEFAULT == null ? beanMethodName != null : !BEAN_METHOD_NAME_EDEFAULT.equals(beanMethodName);
			case KevoreePackage.PORT_TYPE_MAPPING__SERVICE_METHOD_NAME:
				return SERVICE_METHOD_NAME_EDEFAULT == null ? serviceMethodName != null : !SERVICE_METHOD_NAME_EDEFAULT.equals(serviceMethodName);
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
		result.append(" (beanMethodName: ");
		result.append(beanMethodName);
		result.append(", serviceMethodName: ");
		result.append(serviceMethodName);
		result.append(')');
		return result.toString();
	}

} //PortTypeMappingImpl
