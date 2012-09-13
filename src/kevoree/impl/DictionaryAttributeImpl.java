/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree.impl;

import kevoree.DictionaryAttribute;
import kevoree.KevoreePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dictionary Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kevoree.impl.DictionaryAttributeImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link kevoree.impl.DictionaryAttributeImpl#isState <em>State</em>}</li>
 *   <li>{@link kevoree.impl.DictionaryAttributeImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link kevoree.impl.DictionaryAttributeImpl#isFragmentDependant <em>Fragment Dependant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DictionaryAttributeImpl extends TypedElementImpl implements DictionaryAttribute {
	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isState()
	 * @generated
	 * @ordered
	 */
	protected boolean state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatatype() <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected static final String DATATYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected String datatype = DATATYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isFragmentDependant() <em>Fragment Dependant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFragmentDependant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FRAGMENT_DEPENDANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFragmentDependant() <em>Fragment Dependant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFragmentDependant()
	 * @generated
	 * @ordered
	 */
	protected boolean fragmentDependant = FRAGMENT_DEPENDANT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DictionaryAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KevoreePackage.Literals.DICTIONARY_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.DICTIONARY_ATTRIBUTE__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(boolean newState) {
		boolean oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.DICTIONARY_ATTRIBUTE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatatype() {
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(String newDatatype) {
		String oldDatatype = datatype;
		datatype = newDatatype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.DICTIONARY_ATTRIBUTE__DATATYPE, oldDatatype, datatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFragmentDependant() {
		return fragmentDependant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFragmentDependant(boolean newFragmentDependant) {
		boolean oldFragmentDependant = fragmentDependant;
		fragmentDependant = newFragmentDependant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.DICTIONARY_ATTRIBUTE__FRAGMENT_DEPENDANT, oldFragmentDependant, fragmentDependant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KevoreePackage.DICTIONARY_ATTRIBUTE__OPTIONAL:
				return isOptional();
			case KevoreePackage.DICTIONARY_ATTRIBUTE__STATE:
				return isState();
			case KevoreePackage.DICTIONARY_ATTRIBUTE__DATATYPE:
				return getDatatype();
			case KevoreePackage.DICTIONARY_ATTRIBUTE__FRAGMENT_DEPENDANT:
				return isFragmentDependant();
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
			case KevoreePackage.DICTIONARY_ATTRIBUTE__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
			case KevoreePackage.DICTIONARY_ATTRIBUTE__STATE:
				setState((Boolean)newValue);
				return;
			case KevoreePackage.DICTIONARY_ATTRIBUTE__DATATYPE:
				setDatatype((String)newValue);
				return;
			case KevoreePackage.DICTIONARY_ATTRIBUTE__FRAGMENT_DEPENDANT:
				setFragmentDependant((Boolean)newValue);
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
			case KevoreePackage.DICTIONARY_ATTRIBUTE__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
				return;
			case KevoreePackage.DICTIONARY_ATTRIBUTE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case KevoreePackage.DICTIONARY_ATTRIBUTE__DATATYPE:
				setDatatype(DATATYPE_EDEFAULT);
				return;
			case KevoreePackage.DICTIONARY_ATTRIBUTE__FRAGMENT_DEPENDANT:
				setFragmentDependant(FRAGMENT_DEPENDANT_EDEFAULT);
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
			case KevoreePackage.DICTIONARY_ATTRIBUTE__OPTIONAL:
				return optional != OPTIONAL_EDEFAULT;
			case KevoreePackage.DICTIONARY_ATTRIBUTE__STATE:
				return state != STATE_EDEFAULT;
			case KevoreePackage.DICTIONARY_ATTRIBUTE__DATATYPE:
				return DATATYPE_EDEFAULT == null ? datatype != null : !DATATYPE_EDEFAULT.equals(datatype);
			case KevoreePackage.DICTIONARY_ATTRIBUTE__FRAGMENT_DEPENDANT:
				return fragmentDependant != FRAGMENT_DEPENDANT_EDEFAULT;
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
		result.append(", state: ");
		result.append(state);
		result.append(", datatype: ");
		result.append(datatype);
		result.append(", fragmentDependant: ");
		result.append(fragmentDependant);
		result.append(')');
		return result.toString();
	}

} //DictionaryAttributeImpl
