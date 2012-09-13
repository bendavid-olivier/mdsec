/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree.impl;

import java.util.Collection;

import kevoree.ContainerNode;
import kevoree.KevoreePackage;
import kevoree.NodeLink;
import kevoree.NodeNetwork;

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
 * An implementation of the model object '<em><b>Node Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kevoree.impl.NodeNetworkImpl#getLink <em>Link</em>}</li>
 *   <li>{@link kevoree.impl.NodeNetworkImpl#getInitBy <em>Init By</em>}</li>
 *   <li>{@link kevoree.impl.NodeNetworkImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeNetworkImpl extends EObjectImpl implements NodeNetwork {
	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeLink> link;

	/**
	 * The cached value of the '{@link #getInitBy() <em>Init By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitBy()
	 * @generated
	 * @ordered
	 */
	protected ContainerNode initBy;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ContainerNode target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KevoreePackage.Literals.NODE_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeLink> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<NodeLink>(NodeLink.class, this, KevoreePackage.NODE_NETWORK__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerNode getInitBy() {
		if (initBy != null && initBy.eIsProxy()) {
			InternalEObject oldInitBy = (InternalEObject)initBy;
			initBy = (ContainerNode)eResolveProxy(oldInitBy);
			if (initBy != oldInitBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KevoreePackage.NODE_NETWORK__INIT_BY, oldInitBy, initBy));
			}
		}
		return initBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerNode basicGetInitBy() {
		return initBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitBy(ContainerNode newInitBy) {
		ContainerNode oldInitBy = initBy;
		initBy = newInitBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.NODE_NETWORK__INIT_BY, oldInitBy, initBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerNode getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ContainerNode)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KevoreePackage.NODE_NETWORK__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerNode basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ContainerNode newTarget) {
		ContainerNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.NODE_NETWORK__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KevoreePackage.NODE_NETWORK__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
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
			case KevoreePackage.NODE_NETWORK__LINK:
				return getLink();
			case KevoreePackage.NODE_NETWORK__INIT_BY:
				if (resolve) return getInitBy();
				return basicGetInitBy();
			case KevoreePackage.NODE_NETWORK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case KevoreePackage.NODE_NETWORK__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends NodeLink>)newValue);
				return;
			case KevoreePackage.NODE_NETWORK__INIT_BY:
				setInitBy((ContainerNode)newValue);
				return;
			case KevoreePackage.NODE_NETWORK__TARGET:
				setTarget((ContainerNode)newValue);
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
			case KevoreePackage.NODE_NETWORK__LINK:
				getLink().clear();
				return;
			case KevoreePackage.NODE_NETWORK__INIT_BY:
				setInitBy((ContainerNode)null);
				return;
			case KevoreePackage.NODE_NETWORK__TARGET:
				setTarget((ContainerNode)null);
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
			case KevoreePackage.NODE_NETWORK__LINK:
				return link != null && !link.isEmpty();
			case KevoreePackage.NODE_NETWORK__INIT_BY:
				return initBy != null;
			case KevoreePackage.NODE_NETWORK__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //NodeNetworkImpl
