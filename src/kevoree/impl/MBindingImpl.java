/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree.impl;

import kevoree.Channel;
import kevoree.KevoreePackage;
import kevoree.MBinding;
import kevoree.Port;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MBinding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kevoree.impl.MBindingImpl#getPort <em>Port</em>}</li>
 *   <li>{@link kevoree.impl.MBindingImpl#getHub <em>Hub</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MBindingImpl extends EObjectImpl implements MBinding {
	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Port port;

	/**
	 * The cached value of the '{@link #getHub() <em>Hub</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHub()
	 * @generated
	 * @ordered
	 */
	protected Channel hub;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KevoreePackage.Literals.MBINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPort() {
		if (port != null && port.eIsProxy()) {
			InternalEObject oldPort = (InternalEObject)port;
			port = (Port)eResolveProxy(oldPort);
			if (port != oldPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KevoreePackage.MBINDING__PORT, oldPort, port));
			}
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Port newPort) {
		Port oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.MBINDING__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel getHub() {
		if (hub != null && hub.eIsProxy()) {
			InternalEObject oldHub = (InternalEObject)hub;
			hub = (Channel)eResolveProxy(oldHub);
			if (hub != oldHub) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KevoreePackage.MBINDING__HUB, oldHub, hub));
			}
		}
		return hub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel basicGetHub() {
		return hub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHub(Channel newHub) {
		Channel oldHub = hub;
		hub = newHub;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.MBINDING__HUB, oldHub, hub));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KevoreePackage.MBINDING__PORT:
				if (resolve) return getPort();
				return basicGetPort();
			case KevoreePackage.MBINDING__HUB:
				if (resolve) return getHub();
				return basicGetHub();
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
			case KevoreePackage.MBINDING__PORT:
				setPort((Port)newValue);
				return;
			case KevoreePackage.MBINDING__HUB:
				setHub((Channel)newValue);
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
			case KevoreePackage.MBINDING__PORT:
				setPort((Port)null);
				return;
			case KevoreePackage.MBINDING__HUB:
				setHub((Channel)null);
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
			case KevoreePackage.MBINDING__PORT:
				return port != null;
			case KevoreePackage.MBINDING__HUB:
				return hub != null;
		}
		return super.eIsSet(featureID);
	}

} //MBindingImpl
