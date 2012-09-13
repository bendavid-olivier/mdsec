/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree.impl;

import java.util.Collection;

import kevoree.ExtraFonctionalProperty;
import kevoree.KevoreePackage;
import kevoree.PortTypeRef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extra Fonctional Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kevoree.impl.ExtraFonctionalPropertyImpl#getPortTypes <em>Port Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtraFonctionalPropertyImpl extends EObjectImpl implements ExtraFonctionalProperty {
	/**
	 * The cached value of the '{@link #getPortTypes() <em>Port Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PortTypeRef> portTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtraFonctionalPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KevoreePackage.Literals.EXTRA_FONCTIONAL_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortTypeRef> getPortTypes() {
		if (portTypes == null) {
			portTypes = new EObjectResolvingEList<PortTypeRef>(PortTypeRef.class, this, KevoreePackage.EXTRA_FONCTIONAL_PROPERTY__PORT_TYPES);
		}
		return portTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KevoreePackage.EXTRA_FONCTIONAL_PROPERTY__PORT_TYPES:
				return getPortTypes();
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
			case KevoreePackage.EXTRA_FONCTIONAL_PROPERTY__PORT_TYPES:
				getPortTypes().clear();
				getPortTypes().addAll((Collection<? extends PortTypeRef>)newValue);
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
			case KevoreePackage.EXTRA_FONCTIONAL_PROPERTY__PORT_TYPES:
				getPortTypes().clear();
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
			case KevoreePackage.EXTRA_FONCTIONAL_PROPERTY__PORT_TYPES:
				return portTypes != null && !portTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExtraFonctionalPropertyImpl
