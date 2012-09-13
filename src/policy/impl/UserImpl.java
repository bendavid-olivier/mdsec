/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package policy.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import policy.PolicyPackage;
import policy.Role;
import policy.Session;
import policy.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link policy.impl.UserImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link policy.impl.UserImpl#getSession <em>Session</em>}</li>
 *   <li>{@link policy.impl.UserImpl#getDelegates <em>Delegates</em>}</li>
 *   <li>{@link policy.impl.UserImpl#getDelegatees <em>Delegatees</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserImpl extends PolicyElementImpl implements User {
	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getSession() <em>Session</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSession()
	 * @generated
	 * @ordered
	 */
	protected Session session;

	/**
	 * The cached value of the '{@link #getDelegates() <em>Delegates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegates()
	 * @generated
	 * @ordered
	 */
	protected EList<User> delegates;

	/**
	 * The cached value of the '{@link #getDelegatees() <em>Delegatees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegatees()
	 * @generated
	 * @ordered
	 */
	protected EList<User> delegatees;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, PolicyPackage.USER__ROLES, PolicyPackage.ROLE__USERS);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Session getSession() {
		if (session != null && session.eIsProxy()) {
			InternalEObject oldSession = (InternalEObject)session;
			session = (Session)eResolveProxy(oldSession);
			if (session != oldSession) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PolicyPackage.USER__SESSION, oldSession, session));
			}
		}
		return session;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Session basicGetSession() {
		return session;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSession(Session newSession, NotificationChain msgs) {
		Session oldSession = session;
		session = newSession;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolicyPackage.USER__SESSION, oldSession, newSession);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSession(Session newSession) {
		if (newSession != session) {
			NotificationChain msgs = null;
			if (session != null)
				msgs = ((InternalEObject)session).eInverseRemove(this, PolicyPackage.SESSION__USER, Session.class, msgs);
			if (newSession != null)
				msgs = ((InternalEObject)newSession).eInverseAdd(this, PolicyPackage.SESSION__USER, Session.class, msgs);
			msgs = basicSetSession(newSession, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyPackage.USER__SESSION, newSession, newSession));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getDelegates() {
		if (delegates == null) {
			delegates = new EObjectWithInverseResolvingEList.ManyInverse<User>(User.class, this, PolicyPackage.USER__DELEGATES, PolicyPackage.USER__DELEGATEES);
		}
		return delegates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getDelegatees() {
		if (delegatees == null) {
			delegatees = new EObjectWithInverseResolvingEList.ManyInverse<User>(User.class, this, PolicyPackage.USER__DELEGATEES, PolicyPackage.USER__DELEGATES);
		}
		return delegatees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PolicyPackage.USER__ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoles()).basicAdd(otherEnd, msgs);
			case PolicyPackage.USER__SESSION:
				if (session != null)
					msgs = ((InternalEObject)session).eInverseRemove(this, PolicyPackage.SESSION__USER, Session.class, msgs);
				return basicSetSession((Session)otherEnd, msgs);
			case PolicyPackage.USER__DELEGATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDelegates()).basicAdd(otherEnd, msgs);
			case PolicyPackage.USER__DELEGATEES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDelegatees()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PolicyPackage.USER__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case PolicyPackage.USER__SESSION:
				return basicSetSession(null, msgs);
			case PolicyPackage.USER__DELEGATES:
				return ((InternalEList<?>)getDelegates()).basicRemove(otherEnd, msgs);
			case PolicyPackage.USER__DELEGATEES:
				return ((InternalEList<?>)getDelegatees()).basicRemove(otherEnd, msgs);
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
			case PolicyPackage.USER__ROLES:
				return getRoles();
			case PolicyPackage.USER__SESSION:
				if (resolve) return getSession();
				return basicGetSession();
			case PolicyPackage.USER__DELEGATES:
				return getDelegates();
			case PolicyPackage.USER__DELEGATEES:
				return getDelegatees();
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
			case PolicyPackage.USER__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case PolicyPackage.USER__SESSION:
				setSession((Session)newValue);
				return;
			case PolicyPackage.USER__DELEGATES:
				getDelegates().clear();
				getDelegates().addAll((Collection<? extends User>)newValue);
				return;
			case PolicyPackage.USER__DELEGATEES:
				getDelegatees().clear();
				getDelegatees().addAll((Collection<? extends User>)newValue);
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
			case PolicyPackage.USER__ROLES:
				getRoles().clear();
				return;
			case PolicyPackage.USER__SESSION:
				setSession((Session)null);
				return;
			case PolicyPackage.USER__DELEGATES:
				getDelegates().clear();
				return;
			case PolicyPackage.USER__DELEGATEES:
				getDelegatees().clear();
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
			case PolicyPackage.USER__ROLES:
				return roles != null && !roles.isEmpty();
			case PolicyPackage.USER__SESSION:
				return session != null;
			case PolicyPackage.USER__DELEGATES:
				return delegates != null && !delegates.isEmpty();
			case PolicyPackage.USER__DELEGATEES:
				return delegatees != null && !delegatees.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UserImpl
