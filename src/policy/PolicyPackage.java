/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package policy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see policy.PolicyFactory
 * @model kind="package"
 * @generated
 */
public interface PolicyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "policy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://policy/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "policy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolicyPackage eINSTANCE = policy.impl.PolicyPackageImpl.init();

	/**
	 * The meta object id for the '{@link policy.impl.PolicyElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see policy.impl.PolicyElementImpl
	 * @see policy.impl.PolicyPackageImpl#getPolicyElement()
	 * @generated
	 */
	int POLICY_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Arch Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ELEMENT__ARCH_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ELEMENT__CONSTRAINTS = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link policy.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see policy.impl.UserImpl
	 * @see policy.impl.PolicyPackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = POLICY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Arch Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ARCH_TYPE = POLICY_ELEMENT__ARCH_TYPE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CONSTRAINTS = POLICY_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ROLES = POLICY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SESSION = POLICY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DELEGATES = POLICY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Delegatees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DELEGATEES = POLICY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = POLICY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link policy.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see policy.impl.RoleImpl
	 * @see policy.impl.PolicyPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = POLICY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Arch Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ARCH_TYPE = POLICY_ELEMENT__ARCH_TYPE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CONSTRAINTS = POLICY_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PERMISSIONS = POLICY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__USERS = POLICY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sessions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SESSIONS = POLICY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ssod</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SSOD = POLICY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ssod Opp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SSOD_OPP = POLICY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dsod</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DSOD = POLICY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Dsod Opp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DSOD_OPP = POLICY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rh</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__RH = POLICY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Rh Opp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__RH_OPP = POLICY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = POLICY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link policy.impl.PermissionImpl <em>Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see policy.impl.PermissionImpl
	 * @see policy.impl.PolicyPackageImpl#getPermission()
	 * @generated
	 */
	int PERMISSION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__NAME = POLICY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Arch Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__ARCH_TYPE = POLICY_ELEMENT__ARCH_TYPE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__CONSTRAINTS = POLICY_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__OPERATIONS = POLICY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__OBJECTS = POLICY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__ROLES = POLICY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_FEATURE_COUNT = POLICY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link policy.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see policy.impl.OperationImpl
	 * @see policy.impl.PolicyPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = POLICY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Arch Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ARCH_TYPE = POLICY_ELEMENT__ARCH_TYPE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CONSTRAINTS = POLICY_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PERMISSIONS = POLICY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OBJECTS = POLICY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = POLICY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link policy.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see policy.impl.ObjectImpl
	 * @see policy.impl.PolicyPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = POLICY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Arch Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__ARCH_TYPE = POLICY_ELEMENT__ARCH_TYPE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__CONSTRAINTS = POLICY_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__PERMISSIONS = POLICY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__OPERATIONS = POLICY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NODE_NAME = POLICY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__IS_INSTANCE = POLICY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = POLICY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link policy.impl.SessionImpl <em>Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see policy.impl.SessionImpl
	 * @see policy.impl.PolicyPackageImpl#getSession()
	 * @generated
	 */
	int SESSION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__NAME = POLICY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Arch Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__ARCH_TYPE = POLICY_ELEMENT__ARCH_TYPE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__CONSTRAINTS = POLICY_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__USER = POLICY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__ROLES = POLICY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_FEATURE_COUNT = POLICY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link policy.impl.PolicyImpl <em>Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see policy.impl.PolicyImpl
	 * @see policy.impl.PolicyPackageImpl#getPolicy()
	 * @generated
	 */
	int POLICY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__NAME = POLICY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Arch Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__ARCH_TYPE = POLICY_ELEMENT__ARCH_TYPE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__CONSTRAINTS = POLICY_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__ELEMENTS = POLICY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_FEATURE_COUNT = POLICY_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link policy.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see policy.impl.ConstraintImpl
	 * @see policy.impl.PolicyPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link policy.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see policy.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the reference list '{@link policy.User#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see policy.User#getRoles()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Roles();

	/**
	 * Returns the meta object for the reference '{@link policy.User#getSession <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Session</em>'.
	 * @see policy.User#getSession()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Session();

	/**
	 * Returns the meta object for the reference list '{@link policy.User#getDelegates <em>Delegates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delegates</em>'.
	 * @see policy.User#getDelegates()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Delegates();

	/**
	 * Returns the meta object for the reference list '{@link policy.User#getDelegatees <em>Delegatees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delegatees</em>'.
	 * @see policy.User#getDelegatees()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Delegatees();

	/**
	 * Returns the meta object for class '{@link policy.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see policy.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference list '{@link policy.Role#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Permissions</em>'.
	 * @see policy.Role#getPermissions()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Permissions();

	/**
	 * Returns the meta object for the reference list '{@link policy.Role#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Users</em>'.
	 * @see policy.Role#getUsers()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Users();

	/**
	 * Returns the meta object for the reference list '{@link policy.Role#getSessions <em>Sessions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sessions</em>'.
	 * @see policy.Role#getSessions()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Sessions();

	/**
	 * Returns the meta object for the reference list '{@link policy.Role#getSsod <em>Ssod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ssod</em>'.
	 * @see policy.Role#getSsod()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Ssod();

	/**
	 * Returns the meta object for the reference list '{@link policy.Role#getSsodOpp <em>Ssod Opp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ssod Opp</em>'.
	 * @see policy.Role#getSsodOpp()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_SsodOpp();

	/**
	 * Returns the meta object for the reference list '{@link policy.Role#getDsod <em>Dsod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dsod</em>'.
	 * @see policy.Role#getDsod()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Dsod();

	/**
	 * Returns the meta object for the reference list '{@link policy.Role#getDsodOpp <em>Dsod Opp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dsod Opp</em>'.
	 * @see policy.Role#getDsodOpp()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_DsodOpp();

	/**
	 * Returns the meta object for the reference list '{@link policy.Role#getRh <em>Rh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rh</em>'.
	 * @see policy.Role#getRh()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Rh();

	/**
	 * Returns the meta object for the reference list '{@link policy.Role#getRhOpp <em>Rh Opp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rh Opp</em>'.
	 * @see policy.Role#getRhOpp()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_RhOpp();

	/**
	 * Returns the meta object for class '{@link policy.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission</em>'.
	 * @see policy.Permission
	 * @generated
	 */
	EClass getPermission();

	/**
	 * Returns the meta object for the reference list '{@link policy.Permission#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operations</em>'.
	 * @see policy.Permission#getOperations()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_Operations();

	/**
	 * Returns the meta object for the reference list '{@link policy.Permission#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Objects</em>'.
	 * @see policy.Permission#getObjects()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_Objects();

	/**
	 * Returns the meta object for the reference list '{@link policy.Permission#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see policy.Permission#getRoles()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_Roles();

	/**
	 * Returns the meta object for class '{@link policy.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see policy.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the reference list '{@link policy.Operation#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Permissions</em>'.
	 * @see policy.Operation#getPermissions()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Permissions();

	/**
	 * Returns the meta object for the reference list '{@link policy.Operation#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Objects</em>'.
	 * @see policy.Operation#getObjects()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Objects();

	/**
	 * Returns the meta object for class '{@link policy.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see policy.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the reference list '{@link policy.Object#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Permissions</em>'.
	 * @see policy.Object#getPermissions()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Permissions();

	/**
	 * Returns the meta object for the reference list '{@link policy.Object#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operations</em>'.
	 * @see policy.Object#getOperations()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Operations();

	/**
	 * Returns the meta object for the attribute '{@link policy.Object#getNodeName <em>Node Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Name</em>'.
	 * @see policy.Object#getNodeName()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_NodeName();

	/**
	 * Returns the meta object for the attribute '{@link policy.Object#isIsInstance <em>Is Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Instance</em>'.
	 * @see policy.Object#isIsInstance()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_IsInstance();

	/**
	 * Returns the meta object for class '{@link policy.Session <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session</em>'.
	 * @see policy.Session
	 * @generated
	 */
	EClass getSession();

	/**
	 * Returns the meta object for the reference '{@link policy.Session#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see policy.Session#getUser()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_User();

	/**
	 * Returns the meta object for the reference list '{@link policy.Session#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see policy.Session#getRoles()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_Roles();

	/**
	 * Returns the meta object for class '{@link policy.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy</em>'.
	 * @see policy.Policy
	 * @generated
	 */
	EClass getPolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link policy.Policy#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see policy.Policy#getElements()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_Elements();

	/**
	 * Returns the meta object for class '{@link policy.PolicyElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see policy.PolicyElement
	 * @generated
	 */
	EClass getPolicyElement();

	/**
	 * Returns the meta object for the attribute '{@link policy.PolicyElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see policy.PolicyElement#getName()
	 * @see #getPolicyElement()
	 * @generated
	 */
	EAttribute getPolicyElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link policy.PolicyElement#getArchType <em>Arch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arch Type</em>'.
	 * @see policy.PolicyElement#getArchType()
	 * @see #getPolicyElement()
	 * @generated
	 */
	EAttribute getPolicyElement_ArchType();

	/**
	 * Returns the meta object for the containment reference list '{@link policy.PolicyElement#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see policy.PolicyElement#getConstraints()
	 * @see #getPolicyElement()
	 * @generated
	 */
	EReference getPolicyElement_Constraints();

	/**
	 * Returns the meta object for class '{@link policy.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see policy.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link policy.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see policy.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

	/**
	 * Returns the meta object for the attribute '{@link policy.Constraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see policy.Constraint#getExpression()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Expression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PolicyFactory getPolicyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link policy.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see policy.impl.UserImpl
		 * @see policy.impl.PolicyPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__ROLES = eINSTANCE.getUser_Roles();

		/**
		 * The meta object literal for the '<em><b>Session</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__SESSION = eINSTANCE.getUser_Session();

		/**
		 * The meta object literal for the '<em><b>Delegates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__DELEGATES = eINSTANCE.getUser_Delegates();

		/**
		 * The meta object literal for the '<em><b>Delegatees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__DELEGATEES = eINSTANCE.getUser_Delegatees();

		/**
		 * The meta object literal for the '{@link policy.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see policy.impl.RoleImpl
		 * @see policy.impl.PolicyPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__PERMISSIONS = eINSTANCE.getRole_Permissions();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__USERS = eINSTANCE.getRole_Users();

		/**
		 * The meta object literal for the '<em><b>Sessions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__SESSIONS = eINSTANCE.getRole_Sessions();

		/**
		 * The meta object literal for the '<em><b>Ssod</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__SSOD = eINSTANCE.getRole_Ssod();

		/**
		 * The meta object literal for the '<em><b>Ssod Opp</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__SSOD_OPP = eINSTANCE.getRole_SsodOpp();

		/**
		 * The meta object literal for the '<em><b>Dsod</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__DSOD = eINSTANCE.getRole_Dsod();

		/**
		 * The meta object literal for the '<em><b>Dsod Opp</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__DSOD_OPP = eINSTANCE.getRole_DsodOpp();

		/**
		 * The meta object literal for the '<em><b>Rh</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__RH = eINSTANCE.getRole_Rh();

		/**
		 * The meta object literal for the '<em><b>Rh Opp</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__RH_OPP = eINSTANCE.getRole_RhOpp();

		/**
		 * The meta object literal for the '{@link policy.impl.PermissionImpl <em>Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see policy.impl.PermissionImpl
		 * @see policy.impl.PolicyPackageImpl#getPermission()
		 * @generated
		 */
		EClass PERMISSION = eINSTANCE.getPermission();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__OPERATIONS = eINSTANCE.getPermission_Operations();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__OBJECTS = eINSTANCE.getPermission_Objects();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__ROLES = eINSTANCE.getPermission_Roles();

		/**
		 * The meta object literal for the '{@link policy.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see policy.impl.OperationImpl
		 * @see policy.impl.PolicyPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PERMISSIONS = eINSTANCE.getOperation_Permissions();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OBJECTS = eINSTANCE.getOperation_Objects();

		/**
		 * The meta object literal for the '{@link policy.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see policy.impl.ObjectImpl
		 * @see policy.impl.PolicyPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__PERMISSIONS = eINSTANCE.getObject_Permissions();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__OPERATIONS = eINSTANCE.getObject_Operations();

		/**
		 * The meta object literal for the '<em><b>Node Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__NODE_NAME = eINSTANCE.getObject_NodeName();

		/**
		 * The meta object literal for the '<em><b>Is Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__IS_INSTANCE = eINSTANCE.getObject_IsInstance();

		/**
		 * The meta object literal for the '{@link policy.impl.SessionImpl <em>Session</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see policy.impl.SessionImpl
		 * @see policy.impl.PolicyPackageImpl#getSession()
		 * @generated
		 */
		EClass SESSION = eINSTANCE.getSession();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__USER = eINSTANCE.getSession_User();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__ROLES = eINSTANCE.getSession_Roles();

		/**
		 * The meta object literal for the '{@link policy.impl.PolicyImpl <em>Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see policy.impl.PolicyImpl
		 * @see policy.impl.PolicyPackageImpl#getPolicy()
		 * @generated
		 */
		EClass POLICY = eINSTANCE.getPolicy();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__ELEMENTS = eINSTANCE.getPolicy_Elements();

		/**
		 * The meta object literal for the '{@link policy.impl.PolicyElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see policy.impl.PolicyElementImpl
		 * @see policy.impl.PolicyPackageImpl#getPolicyElement()
		 * @generated
		 */
		EClass POLICY_ELEMENT = eINSTANCE.getPolicyElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_ELEMENT__NAME = eINSTANCE.getPolicyElement_Name();

		/**
		 * The meta object literal for the '<em><b>Arch Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_ELEMENT__ARCH_TYPE = eINSTANCE.getPolicyElement_ArchType();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_ELEMENT__CONSTRAINTS = eINSTANCE.getPolicyElement_Constraints();

		/**
		 * The meta object literal for the '{@link policy.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see policy.impl.ConstraintImpl
		 * @see policy.impl.PolicyPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__EXPRESSION = eINSTANCE.getConstraint_Expression();

	}

} //PolicyPackage
