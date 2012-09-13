/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree.impl;

import java.util.Collection;

import kevoree.KevoreePackage;
import kevoree.NetworkProperty;
import kevoree.NodeLink;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kevoree.impl.NodeLinkImpl#getNetworkType <em>Network Type</em>}</li>
 *   <li>{@link kevoree.impl.NodeLinkImpl#getEstimatedRate <em>Estimated Rate</em>}</li>
 *   <li>{@link kevoree.impl.NodeLinkImpl#getNetworkProperties <em>Network Properties</em>}</li>
 *   <li>{@link kevoree.impl.NodeLinkImpl#getLastCheck <em>Last Check</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeLinkImpl extends EObjectImpl implements NodeLink {
	/**
	 * The default value of the '{@link #getNetworkType() <em>Network Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkType()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworkType() <em>Network Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkType()
	 * @generated
	 * @ordered
	 */
	protected String networkType = NETWORK_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedRate() <em>Estimated Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedRate()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ESTIMATED_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedRate() <em>Estimated Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedRate()
	 * @generated
	 * @ordered
	 */
	protected Integer estimatedRate = ESTIMATED_RATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNetworkProperties() <em>Network Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkProperty> networkProperties;

	/**
	 * The default value of the '{@link #getLastCheck() <em>Last Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCheck()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_CHECK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastCheck() <em>Last Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCheck()
	 * @generated
	 * @ordered
	 */
	protected String lastCheck = LAST_CHECK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KevoreePackage.Literals.NODE_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetworkType() {
		return networkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkType(String newNetworkType) {
		String oldNetworkType = networkType;
		networkType = newNetworkType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.NODE_LINK__NETWORK_TYPE, oldNetworkType, networkType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getEstimatedRate() {
		return estimatedRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatedRate(Integer newEstimatedRate) {
		Integer oldEstimatedRate = estimatedRate;
		estimatedRate = newEstimatedRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.NODE_LINK__ESTIMATED_RATE, oldEstimatedRate, estimatedRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkProperty> getNetworkProperties() {
		if (networkProperties == null) {
			networkProperties = new EObjectContainmentEList<NetworkProperty>(NetworkProperty.class, this, KevoreePackage.NODE_LINK__NETWORK_PROPERTIES);
		}
		return networkProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastCheck() {
		return lastCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastCheck(String newLastCheck) {
		String oldLastCheck = lastCheck;
		lastCheck = newLastCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.NODE_LINK__LAST_CHECK, oldLastCheck, lastCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KevoreePackage.NODE_LINK__NETWORK_PROPERTIES:
				return ((InternalEList<?>)getNetworkProperties()).basicRemove(otherEnd, msgs);
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
			case KevoreePackage.NODE_LINK__NETWORK_TYPE:
				return getNetworkType();
			case KevoreePackage.NODE_LINK__ESTIMATED_RATE:
				return getEstimatedRate();
			case KevoreePackage.NODE_LINK__NETWORK_PROPERTIES:
				return getNetworkProperties();
			case KevoreePackage.NODE_LINK__LAST_CHECK:
				return getLastCheck();
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
			case KevoreePackage.NODE_LINK__NETWORK_TYPE:
				setNetworkType((String)newValue);
				return;
			case KevoreePackage.NODE_LINK__ESTIMATED_RATE:
				setEstimatedRate((Integer)newValue);
				return;
			case KevoreePackage.NODE_LINK__NETWORK_PROPERTIES:
				getNetworkProperties().clear();
				getNetworkProperties().addAll((Collection<? extends NetworkProperty>)newValue);
				return;
			case KevoreePackage.NODE_LINK__LAST_CHECK:
				setLastCheck((String)newValue);
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
			case KevoreePackage.NODE_LINK__NETWORK_TYPE:
				setNetworkType(NETWORK_TYPE_EDEFAULT);
				return;
			case KevoreePackage.NODE_LINK__ESTIMATED_RATE:
				setEstimatedRate(ESTIMATED_RATE_EDEFAULT);
				return;
			case KevoreePackage.NODE_LINK__NETWORK_PROPERTIES:
				getNetworkProperties().clear();
				return;
			case KevoreePackage.NODE_LINK__LAST_CHECK:
				setLastCheck(LAST_CHECK_EDEFAULT);
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
			case KevoreePackage.NODE_LINK__NETWORK_TYPE:
				return NETWORK_TYPE_EDEFAULT == null ? networkType != null : !NETWORK_TYPE_EDEFAULT.equals(networkType);
			case KevoreePackage.NODE_LINK__ESTIMATED_RATE:
				return ESTIMATED_RATE_EDEFAULT == null ? estimatedRate != null : !ESTIMATED_RATE_EDEFAULT.equals(estimatedRate);
			case KevoreePackage.NODE_LINK__NETWORK_PROPERTIES:
				return networkProperties != null && !networkProperties.isEmpty();
			case KevoreePackage.NODE_LINK__LAST_CHECK:
				return LAST_CHECK_EDEFAULT == null ? lastCheck != null : !LAST_CHECK_EDEFAULT.equals(lastCheck);
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
		result.append(" (networkType: ");
		result.append(networkType);
		result.append(", estimatedRate: ");
		result.append(estimatedRate);
		result.append(", lastCheck: ");
		result.append(lastCheck);
		result.append(')');
		return result.toString();
	}

} //NodeLinkImpl
