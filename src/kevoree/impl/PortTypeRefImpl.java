/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree.impl;

import java.util.Collection;

import kevoree.KevoreePackage;
import kevoree.PortType;
import kevoree.PortTypeMapping;
import kevoree.PortTypeRef;

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
 * An implementation of the model object '<em><b>Port Type Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kevoree.impl.PortTypeRefImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link kevoree.impl.PortTypeRefImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link kevoree.impl.PortTypeRefImpl#getOptional <em>Optional</em>}</li>
 *   <li>{@link kevoree.impl.PortTypeRefImpl#getNoDependency <em>No Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortTypeRefImpl extends NamedElementImpl implements PortTypeRef {
	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected PortType ref;

	/**
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<PortTypeMapping> mappings;

	/**
	 * The default value of the '{@link #getOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptional()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean OPTIONAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptional()
	 * @generated
	 * @ordered
	 */
	protected Boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoDependency() <em>No Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoDependency()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NO_DEPENDENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNoDependency() <em>No Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoDependency()
	 * @generated
	 * @ordered
	 */
	protected Boolean noDependency = NO_DEPENDENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortTypeRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KevoreePackage.Literals.PORT_TYPE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject)ref;
			ref = (PortType)eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KevoreePackage.PORT_TYPE_REF__REF, oldRef, ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(PortType newRef) {
		PortType oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.PORT_TYPE_REF__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortTypeMapping> getMappings() {
		if (mappings == null) {
			mappings = new EObjectContainmentEList<PortTypeMapping>(PortTypeMapping.class, this, KevoreePackage.PORT_TYPE_REF__MAPPINGS);
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(Boolean newOptional) {
		Boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.PORT_TYPE_REF__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getNoDependency() {
		return noDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoDependency(Boolean newNoDependency) {
		Boolean oldNoDependency = noDependency;
		noDependency = newNoDependency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.PORT_TYPE_REF__NO_DEPENDENCY, oldNoDependency, noDependency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KevoreePackage.PORT_TYPE_REF__MAPPINGS:
				return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
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
			case KevoreePackage.PORT_TYPE_REF__REF:
				if (resolve) return getRef();
				return basicGetRef();
			case KevoreePackage.PORT_TYPE_REF__MAPPINGS:
				return getMappings();
			case KevoreePackage.PORT_TYPE_REF__OPTIONAL:
				return getOptional();
			case KevoreePackage.PORT_TYPE_REF__NO_DEPENDENCY:
				return getNoDependency();
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
			case KevoreePackage.PORT_TYPE_REF__REF:
				setRef((PortType)newValue);
				return;
			case KevoreePackage.PORT_TYPE_REF__MAPPINGS:
				getMappings().clear();
				getMappings().addAll((Collection<? extends PortTypeMapping>)newValue);
				return;
			case KevoreePackage.PORT_TYPE_REF__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
			case KevoreePackage.PORT_TYPE_REF__NO_DEPENDENCY:
				setNoDependency((Boolean)newValue);
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
			case KevoreePackage.PORT_TYPE_REF__REF:
				setRef((PortType)null);
				return;
			case KevoreePackage.PORT_TYPE_REF__MAPPINGS:
				getMappings().clear();
				return;
			case KevoreePackage.PORT_TYPE_REF__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
				return;
			case KevoreePackage.PORT_TYPE_REF__NO_DEPENDENCY:
				setNoDependency(NO_DEPENDENCY_EDEFAULT);
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
			case KevoreePackage.PORT_TYPE_REF__REF:
				return ref != null;
			case KevoreePackage.PORT_TYPE_REF__MAPPINGS:
				return mappings != null && !mappings.isEmpty();
			case KevoreePackage.PORT_TYPE_REF__OPTIONAL:
				return OPTIONAL_EDEFAULT == null ? optional != null : !OPTIONAL_EDEFAULT.equals(optional);
			case KevoreePackage.PORT_TYPE_REF__NO_DEPENDENCY:
				return NO_DEPENDENCY_EDEFAULT == null ? noDependency != null : !NO_DEPENDENCY_EDEFAULT.equals(noDependency);
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
		result.append(" (optional: ");
		result.append(optional);
		result.append(", noDependency: ");
		result.append(noDependency);
		result.append(')');
		return result.toString();
	}

} //PortTypeRefImpl
