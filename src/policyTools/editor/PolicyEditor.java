package policyTools.editor;

import java.util.HashSet;

import org.eclipse.emf.common.util.EList;

import policy.*;
import policy.impl.*;

public class PolicyEditor {

	private Policy policy;
	private PolicyFactory factory;

	public PolicyEditor(Policy x) {
		policy = x;
		factory = PolicyFactory.eINSTANCE;
	}

	public void setMainPolicyName(String policyName) {
		policy.setName(policyName);
	}

	public void addPolicy(String policyName) {
		Policy pp = factory.createPolicy();
		pp.setName(policyName);
		policy.getElements().add(pp);
	}

	public void removePolicy(String policyName) {
		getPolicyByName(policyName).getElements().clear();
		policy.getElements().remove(getPolicyByName(policyName));

	}

	public Policy getPolicyByName(String id) {
		Policy res = null;
		if (id.equals(policy.getName())) {
			return policy;
		} else {
			EList<PolicyElement> test = policy.getElements();
			for (PolicyElement elt : policy.getElements()) {
				if (elt instanceof PolicyImpl && elt.getName().equals(id)) {
					res = (Policy) elt;
				}
			}
		}
		return res;
	}

	public HashSet<String> getPolicyUsersNames(String policyName){
		 HashSet<String> res = new HashSet<String>();
		 for(PolicyElement e :policy.getElements()){
				if(e instanceof UserImpl){
					res.add(e.getName());
				}
			}
		 return res;
	}
	
	public HashSet<String> getPolicyObjectsNames(String policyName){
		 HashSet<String> res = new HashSet<String>();
		 for(PolicyElement e :policy.getElements()){
//			 System.out.println(e.getName() + " " +e.getClass());
				if(e instanceof ObjectImpl){
					
					res.add(e.getName());
				}
			}
		 return res;
	}
	
	
	public void addPolicyUser(String policyName, String userName) {
		User x = factory.createUser();
		x.setName(userName);
		if (getPolicyUserByName(policyName, userName) == null) {
			getPolicyByName(policyName).getElements().add(x);
		}

	}

	public void removePolicyUser(String policyName, String userName) {
		getPolicyUserByName(policyName, userName).getDelegatees().clear();
		getPolicyUserByName(policyName, userName).getDelegates().clear();
		getPolicyUserByName(policyName, userName).getRoles().clear();
		getPolicyUserByName(policyName, userName).setSession(null);
		getPolicyByName(policyName).getElements().remove(
				getPolicyUserByName(policyName, userName));

	}

	public User getPolicyUserByName(String policyName, String id) {
		Policy pc = getPolicyByName(policyName);
		User res = null;
		for (PolicyElement elt : pc.getElements()) {
			if (elt instanceof UserImpl && elt.getName().equals(id)) {
				res = (User) elt;
			}
		}
		return res;
	}

	public Role getPolicyUserRoleByName(String policyName, String userName,
			String roleName) {
		Role res = null;
		if (getPolicyUserByName(policyName, userName) != null) {
			for (Role elt : getPolicyUserByName(policyName, userName)
					.getRoles()) {
				if (elt.getName().equals(roleName)) {
					res = elt;
				}
			}
		}
		return res;
	}

	public void addPolicyRole(String policyName, String roleName) {
		Role x = factory.createRole();
		x.setName(roleName);
		if (getPolicyRoleByName(policyName, roleName) == null) {
			getPolicyByName(policyName).getElements().add(x);
		}

	}

	public void removePolicyRole(String policyName, String roleName) {
		getPolicyRoleByName(policyName, roleName).getPermissions().clear();
		getPolicyRoleByName(policyName, roleName).getSessions().clear();
		getPolicyRoleByName(policyName, roleName).getRh().clear();
		getPolicyRoleByName(policyName, roleName).getRhOpp().clear();
		getPolicyRoleByName(policyName, roleName).getDsod().clear();
		getPolicyRoleByName(policyName, roleName).getDsodOpp().clear();
		getPolicyRoleByName(policyName, roleName).getSsod().clear();
		getPolicyRoleByName(policyName, roleName).getSsodOpp().clear();
		getPolicyByName(policyName).getElements().remove(
				getPolicyRoleByName(policyName, roleName));
	}

	public Role getPolicyRoleByName(String policyName, String id) {
		Policy pc = getPolicyByName(policyName);
		Role res = null;
		for (PolicyElement elt : pc.getElements()) {
			if (elt instanceof RoleImpl && elt.getName().equals(id)) {
				res = (Role) elt;
			}
		}
		return res;
	}

	public void addPolicyPermission(String policyName, String permissionName) {
		Permission x = factory.createPermission();
		x.setName(permissionName);
		if (getPolicyPermissionByName(policyName, permissionName) == null) {
			getPolicyByName(policyName).getElements().add(x);
		}

	}

	public void removePolicyPermission(String policyName, String permissionName) {
		getPolicyPermissionByName(policyName, permissionName).getOperations()
				.clear();
		getPolicyPermissionByName(policyName, permissionName).getRoles()
				.clear();
		getPolicyByName(policyName).getElements().remove(
				getPolicyPermissionByName(policyName, permissionName));
	}

	public Permission getPolicyPermissionByName(String policyName, String id) {
		Policy pc = getPolicyByName(policyName);
		Permission res = null;
		for (PolicyElement elt : pc.getElements()) {
			if (elt instanceof PermissionImpl && elt.getName().equals(id)) {
				res = (Permission) elt;
			}
		}
		return res;
	}

	public void addPolicyOperation(String policyName, String operationName) {
		Operation x = factory.createOperation();
		x.setName(operationName);
		if (getPolicyOperationByName(policyName, operationName) == null) {
			getPolicyByName(policyName).getElements().add(x);
		}
	}

	public void removePolicyOperation(String policyName, String operationName) {
		getPolicyOperationByName(policyName, operationName).getObjects()
				.clear();
		getPolicyOperationByName(policyName, operationName).getPermissions()
				.clear();
		getPolicyByName(policyName).getElements().remove(
				getPolicyOperationByName(policyName, operationName));
	}

	public Operation getPolicyOperationByName(String policyName, String id) {
		Policy pc = getPolicyByName(policyName);
		Operation res = null;
		for (PolicyElement elt : pc.getElements()) {
			if (elt instanceof OperationImpl && elt.getName().equals(id)) {
				res = (Operation) elt;
			}
		}
		return res;
	}

	public void addPolicyObject(String policyName, String objectName) {
		policy.Object x = factory.createObject();
		x.setName(objectName);
		if (getPolicyObjectByName(policyName, objectName) == null) {
			getPolicyByName(policyName).getElements().add(x);
		}
	}

	public void removePolicyObject(String policyName, String objectName) {
		getPolicyObjectByName(policyName, objectName).getOperations().clear();
		getPolicyByName(policyName).getElements().remove(
				getPolicyObjectByName(policyName, objectName));
	}

	public policy.Object getPolicyObjectByName(String policyName, String id) {
		Policy pc = getPolicyByName(policyName);
		policy.Object res = null;
		for (PolicyElement elt : pc.getElements()) {
			if (elt instanceof ObjectImpl && elt.getName().equals(id)) {
				res = (policy.Object) elt;
			}
		}
		return res;
	}

	public void addPolicyUserRole(String policyName, String userName,
			String roleName) {
		getPolicyUserByName(policyName, userName).getRoles().add(
				getPolicyRoleByName(policyName, roleName));
	}

	public void removePolicyUserRole(String policyName, String userName,
			String roleName) {
		getPolicyUserByName(policyName, userName).getRoles().remove(
				getPolicyRoleByName(policyName, roleName));
	}

	public void addPolicyRolePermission(String policyName, String roleName,
			String permissionName) {
		if (!getPolicyRoleByName(policyName, roleName)
				.getPermissions()
				.contains(getPolicyPermissionByName(policyName, permissionName))) {
			getPolicyRoleByName(policyName, roleName).getPermissions().add(
					getPolicyPermissionByName(policyName, permissionName));
		}
	}

	public void removePolicyRolePermission(String policyName, String roleName,
			String permissionName) {
		getPolicyRoleByName(policyName, roleName).getPermissions().remove(
				getPolicyPermissionByName(policyName, permissionName));
	}

	public void addPolicyPermissionOperation(String policyName,
			String permissionName, String operationName) {
		getPolicyPermissionByName(policyName, permissionName).getOperations()
				.add(getPolicyOperationByName(policyName, operationName));
	}

	public void removePolicyPermissionOperation(String policyName,
			String permissionName, String operationName) {
		getPolicyPermissionByName(policyName, permissionName).getOperations()
				.remove(getPolicyOperationByName(policyName, operationName));
	}

	public void addPolicyPermissionOperationObject(String policyName,
			String permissionName, String operationName, String objectName) {
		getPolicyPermissionOperationByName(policyName, permissionName,
				operationName).getObjects().add(
				getPolicyObjectByName(policyName, objectName));
	}

	public void removePolicyPermissionOperationObject(String policyName,
			String permissionName, String operationName, String objectName) {
		getPolicyPermissionOperationByName(policyName, permissionName,
				operationName).getObjects().remove(
				getPolicyObjectByName(policyName, objectName));
	}

	public Operation getPolicyPermissionOperationByName(String policyName,
			String permissionName, String operationName) {
		Operation res = null;
		for (Operation op : getPolicyPermissionByName(policyName,
				permissionName).getOperations()) {
			if (op.getName().equals(operationName)) {
				res = op;
			}
		}
		return res;
	}

	public void setPolicyUserSession(String policyName, String userName,
			String sessionName) {
		Session session = factory.createSession();
		session.setName(sessionName);
		session.setUser(getPolicyUserByName(policyName, userName));
		getPolicyByName(policyName).getElements().add(session);
		getPolicyUserByName(policyName, userName).setSession(
				getPolicySessionByName(policyName, sessionName));
	}

	public void unsetPolicyUserSession(String policyName, String userName,
			String sessionName) {
		getPolicyUserByName(policyName, userName).setSession(null);
		getPolicyByName(sessionName).getElements().remove(
				getPolicySessionByName(policyName, sessionName));
	}

	public void addPolicySessionRole(String policyName, String sessionName,
			String roleName) {
		getPolicySessionByName(policyName, sessionName).getRoles().add(
				getPolicyRoleByName(policyName, roleName));
	}

	public void removePolicySessionRole(String policyName, String sessionName,
			String roleName) {
		getPolicySessionByName(policyName, sessionName).getRoles().remove(
				getPolicyRoleByName(policyName, roleName));
	}

	public Session getPolicySessionByName(String policyName, String sessionName) {
		Session res = null;
		for (PolicyElement e : getPolicyByName(policyName).getElements()) {
			if (e instanceof Session && e.getName().equals(sessionName)) {
				res = (Session) e;
			}
		}
		return res;
	}

	public void addPolicyUserDelegate(String policyName, String userName,
			String userDelegateName) {
		getPolicyUserByName(policyName, userName).getDelegates().add(
				getPolicyUserByName(policyName, userDelegateName));

	}

	public void removePolicyUserDelegate(String policyName, String userName,
			String userDelegateName) {
		getPolicyUserByName(policyName, userName).getDelegates().remove(
				getPolicyUserByName(policyName, userDelegateName));

	}

	public void addPolicyRoleRoleSSOD(String policyName, String roleName,
			String roleSSODName) {
		getPolicyRoleByName(policyName, roleName).getSsod().add(
				getPolicyRoleByName(policyName, roleSSODName));
	}

	public void removePolicyRoleRoleSSOD(String policyName, String roleName,
			String roleSSODName) {
		getPolicyRoleByName(policyName, roleName).getSsod().remove(
				getPolicyRoleByName(policyName, roleSSODName));
	}

	public void addPolicyRoleRoleDSOD(String policyName, String roleName,
			String roleDSODName) {
		getPolicyRoleByName(policyName, roleName).getSsod().add(
				getPolicyRoleByName(policyName, roleDSODName));
	}

	public void removePolicyRoleRoleDSOD(String policyName, String roleName,
			String roleDSODName) {
		getPolicyRoleByName(policyName, roleName).getDsod().remove(
				getPolicyRoleByName(policyName, roleDSODName));
	}

	public void addPolicyRoleRoleChild(String policyName, String roleName,
			String roleChildName) {
		getPolicyRoleByName(policyName, roleName).getRh().add(
				getPolicyRoleByName(policyName, roleChildName));
	}

	public void removePolicyRoleRoleChild(String policyName, String roleName,
			String roleChildName) {
		getPolicyRoleByName(policyName, roleName).getRh().remove(
				getPolicyRoleByName(policyName, roleChildName));
	}

}