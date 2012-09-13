/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree.impl;

import java.util.Collection;

import kevoree.ExtraFonctionalProperty;
import kevoree.IntegrationPattern;
import kevoree.KevoreePackage;
import kevoree.PortTypeRef;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integration Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kevoree.impl.IntegrationPatternImpl#getExtraFonctionalProperties <em>Extra Fonctional Properties</em>}</li>
 *   <li>{@link kevoree.impl.IntegrationPatternImpl#getPortTypes <em>Port Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegrationPatternImpl extends NamedElementImpl implements IntegrationPattern {
	/**
	 * The cached value of the '{@link #getExtraFonctionalProperties() <em>Extra Fonctional Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraFonctionalProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtraFonctionalProperty> extraFonctionalProperties;

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
	protected IntegrationPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KevoreePackage.Literals.INTEGRATION_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtraFonctionalProperty> getExtraFonctionalProperties() {
		if (extraFonctionalProperties == null) {
			extraFonctionalProperties = new EObjectContainmentEList<ExtraFonctionalProperty>(ExtraFonctionalProperty.class, this, KevoreePackage.INTEGRATION_PATTERN__EXTRA_FONCTIONAL_PROPERTIES);
		}
		return extraFonctionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortTypeRef> getPortTypes() {
		if (portTypes == null) {
			portTypes = new EObjectResolvingEList<PortTypeRef>(PortTypeRef.class, this, KevoreePackage.INTEGRATION_PATTERN__PORT_TYPES);
		}
		return portTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KevoreePackage.INTEGRATION_PATTERN__EXTRA_FONCTIONAL_PROPERTIES:
				return ((InternalEList<?>)getExtraFonctionalProperties()).basicRemove(otherEnd, msgs);
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
			case KevoreePackage.INTEGRATION_PATTERN__EXTRA_FONCTIONAL_PROPERTIES:
				return getExtraFonctionalProperties();
			case KevoreePackage.INTEGRATION_PATTERN__PORT_TYPES:
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
			case KevoreePackage.INTEGRATION_PATTERN__EXTRA_FONCTIONAL_PROPERTIES:
				getExtraFonctionalProperties().clear();
				getExtraFonctionalProperties().addAll((Collection<? extends ExtraFonctionalProperty>)newValue);
				return;
			case KevoreePackage.INTEGRATION_PATTERN__PORT_TYPES:
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
			case KevoreePackage.INTEGRATION_PATTERN__EXTRA_FONCTIONAL_PROPERTIES:
				getExtraFonctionalProperties().clear();
				return;
			case KevoreePackage.INTEGRATION_PATTERN__PORT_TYPES:
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
			case KevoreePackage.INTEGRATION_PATTERN__EXTRA_FONCTIONAL_PROPERTIES:
				return extraFonctionalProperties != null && !extraFonctionalProperties.isEmpty();
			case KevoreePackage.INTEGRATION_PATTERN__PORT_TYPES:
				return portTypes != null && !portTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntegrationPatternImpl
