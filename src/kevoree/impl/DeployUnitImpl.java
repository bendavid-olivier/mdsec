/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree.impl;

import java.util.Collection;

import kevoree.DeployUnit;
import kevoree.KevoreePackage;
import kevoree.NodeType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deploy Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kevoree.impl.DeployUnitImpl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link kevoree.impl.DeployUnitImpl#getUnitName <em>Unit Name</em>}</li>
 *   <li>{@link kevoree.impl.DeployUnitImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link kevoree.impl.DeployUnitImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link kevoree.impl.DeployUnitImpl#getHashcode <em>Hashcode</em>}</li>
 *   <li>{@link kevoree.impl.DeployUnitImpl#getRequiredLibs <em>Required Libs</em>}</li>
 *   <li>{@link kevoree.impl.DeployUnitImpl#getTargetNodeType <em>Target Node Type</em>}</li>
 *   <li>{@link kevoree.impl.DeployUnitImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeployUnitImpl extends NamedElementImpl implements DeployUnit {
	/**
	 * The default value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected String groupName = GROUP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitName() <em>Unit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitName()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitName() <em>Unit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitName()
	 * @generated
	 * @ordered
	 */
	protected String unitName = UNIT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getHashcode() <em>Hashcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashcode()
	 * @generated
	 * @ordered
	 */
	protected static final String HASHCODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHashcode() <em>Hashcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashcode()
	 * @generated
	 * @ordered
	 */
	protected String hashcode = HASHCODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredLibs() <em>Required Libs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredLibs()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployUnit> requiredLibs;

	/**
	 * The cached value of the '{@link #getTargetNodeType() <em>Target Node Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNodeType()
	 * @generated
	 * @ordered
	 */
	protected NodeType targetNodeType;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KevoreePackage.Literals.DEPLOY_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupName(String newGroupName) {
		String oldGroupName = groupName;
		groupName = newGroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.DEPLOY_UNIT__GROUP_NAME, oldGroupName, groupName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnitName() {
		return unitName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitName(String newUnitName) {
		String oldUnitName = unitName;
		unitName = newUnitName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.DEPLOY_UNIT__UNIT_NAME, oldUnitName, unitName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.DEPLOY_UNIT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.DEPLOY_UNIT__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHashcode() {
		return hashcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHashcode(String newHashcode) {
		String oldHashcode = hashcode;
		hashcode = newHashcode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.DEPLOY_UNIT__HASHCODE, oldHashcode, hashcode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployUnit> getRequiredLibs() {
		if (requiredLibs == null) {
			requiredLibs = new EObjectResolvingEList<DeployUnit>(DeployUnit.class, this, KevoreePackage.DEPLOY_UNIT__REQUIRED_LIBS);
		}
		return requiredLibs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType getTargetNodeType() {
		if (targetNodeType != null && targetNodeType.eIsProxy()) {
			InternalEObject oldTargetNodeType = (InternalEObject)targetNodeType;
			targetNodeType = (NodeType)eResolveProxy(oldTargetNodeType);
			if (targetNodeType != oldTargetNodeType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KevoreePackage.DEPLOY_UNIT__TARGET_NODE_TYPE, oldTargetNodeType, targetNodeType));
			}
		}
		return targetNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType basicGetTargetNodeType() {
		return targetNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNodeType(NodeType newTargetNodeType) {
		NodeType oldTargetNodeType = targetNodeType;
		targetNodeType = newTargetNodeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.DEPLOY_UNIT__TARGET_NODE_TYPE, oldTargetNodeType, targetNodeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KevoreePackage.DEPLOY_UNIT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KevoreePackage.DEPLOY_UNIT__GROUP_NAME:
				return getGroupName();
			case KevoreePackage.DEPLOY_UNIT__UNIT_NAME:
				return getUnitName();
			case KevoreePackage.DEPLOY_UNIT__VERSION:
				return getVersion();
			case KevoreePackage.DEPLOY_UNIT__URL:
				return getUrl();
			case KevoreePackage.DEPLOY_UNIT__HASHCODE:
				return getHashcode();
			case KevoreePackage.DEPLOY_UNIT__REQUIRED_LIBS:
				return getRequiredLibs();
			case KevoreePackage.DEPLOY_UNIT__TARGET_NODE_TYPE:
				if (resolve) return getTargetNodeType();
				return basicGetTargetNodeType();
			case KevoreePackage.DEPLOY_UNIT__TYPE:
				return getType();
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
			case KevoreePackage.DEPLOY_UNIT__GROUP_NAME:
				setGroupName((String)newValue);
				return;
			case KevoreePackage.DEPLOY_UNIT__UNIT_NAME:
				setUnitName((String)newValue);
				return;
			case KevoreePackage.DEPLOY_UNIT__VERSION:
				setVersion((String)newValue);
				return;
			case KevoreePackage.DEPLOY_UNIT__URL:
				setUrl((String)newValue);
				return;
			case KevoreePackage.DEPLOY_UNIT__HASHCODE:
				setHashcode((String)newValue);
				return;
			case KevoreePackage.DEPLOY_UNIT__REQUIRED_LIBS:
				getRequiredLibs().clear();
				getRequiredLibs().addAll((Collection<? extends DeployUnit>)newValue);
				return;
			case KevoreePackage.DEPLOY_UNIT__TARGET_NODE_TYPE:
				setTargetNodeType((NodeType)newValue);
				return;
			case KevoreePackage.DEPLOY_UNIT__TYPE:
				setType((String)newValue);
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
			case KevoreePackage.DEPLOY_UNIT__GROUP_NAME:
				setGroupName(GROUP_NAME_EDEFAULT);
				return;
			case KevoreePackage.DEPLOY_UNIT__UNIT_NAME:
				setUnitName(UNIT_NAME_EDEFAULT);
				return;
			case KevoreePackage.DEPLOY_UNIT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case KevoreePackage.DEPLOY_UNIT__URL:
				setUrl(URL_EDEFAULT);
				return;
			case KevoreePackage.DEPLOY_UNIT__HASHCODE:
				setHashcode(HASHCODE_EDEFAULT);
				return;
			case KevoreePackage.DEPLOY_UNIT__REQUIRED_LIBS:
				getRequiredLibs().clear();
				return;
			case KevoreePackage.DEPLOY_UNIT__TARGET_NODE_TYPE:
				setTargetNodeType((NodeType)null);
				return;
			case KevoreePackage.DEPLOY_UNIT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case KevoreePackage.DEPLOY_UNIT__GROUP_NAME:
				return GROUP_NAME_EDEFAULT == null ? groupName != null : !GROUP_NAME_EDEFAULT.equals(groupName);
			case KevoreePackage.DEPLOY_UNIT__UNIT_NAME:
				return UNIT_NAME_EDEFAULT == null ? unitName != null : !UNIT_NAME_EDEFAULT.equals(unitName);
			case KevoreePackage.DEPLOY_UNIT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case KevoreePackage.DEPLOY_UNIT__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case KevoreePackage.DEPLOY_UNIT__HASHCODE:
				return HASHCODE_EDEFAULT == null ? hashcode != null : !HASHCODE_EDEFAULT.equals(hashcode);
			case KevoreePackage.DEPLOY_UNIT__REQUIRED_LIBS:
				return requiredLibs != null && !requiredLibs.isEmpty();
			case KevoreePackage.DEPLOY_UNIT__TARGET_NODE_TYPE:
				return targetNodeType != null;
			case KevoreePackage.DEPLOY_UNIT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (groupName: ");
		result.append(groupName);
		result.append(", unitName: ");
		result.append(unitName);
		result.append(", version: ");
		result.append(version);
		result.append(", url: ");
		result.append(url);
		result.append(", hashcode: ");
		result.append(hashcode);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //DeployUnitImpl
