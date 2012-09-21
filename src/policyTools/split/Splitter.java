package policyTools.split;
import java.util.HashSet;
import policy.Operation;
import policy.Permission;
import policy.Policy;
import policy.PolicyFactory;
import policy.Role;
import policy.User;
import policyTools.editor.PolicyEditor;
public class Splitter {
	public Policy policy;
	public PolicyFactory factory;
	
	
	public Splitter(Policy p){
		policy = p;
		factory = PolicyFactory.eINSTANCE;
	}
	
	
	
	public HashSet<Policy> splitByUsers(){
		HashSet<Policy> res = new HashSet<Policy>();
		PolicyEditor policyEditor = new PolicyEditor(policy);
		for (User u : policyEditor.getPolicyUsers(policy.getName())){
			String policyName = u.getName();
			Policy p = factory.createPolicy();
			p.setName(policyName);
			PolicyEditor pe = new PolicyEditor(p);
			User usr = pe.cloneUser(u);   
			p.getElements().add(usr);
			for(Role r : u.getRoles()){
				Role rol = pe.cloneRole(r);
				p.getElements().add(rol);
				pe.addPolicyUserRole(policyName, u.getName(), rol.getName());
				for (Permission per : r.getPermissions()){
					Permission perm = pe.clonePermission(per);
					p.getElements().add(perm);
					pe.addPolicyRolePermission(policyName, rol.getName(),perm.getName());	
					for (Operation op : per.getOperations()){
						Operation ope = pe.cloneOperation(op);
						p.getElements().add(ope);
						pe.addPolicyPermissionOperation(policyName, per.getName(), op.getName());
						for(policy.Object ob : op.getObjects()){
							policy.Object obj = pe.cloneObject(ob);
							p.getElements().add(obj);
							pe.addPolicyPermissionOperationObject(policyName, per.getName(), op.getName(), ob.getName());
						}
					}
				}
			}
			res.add(p);
		}
		return res;
	}
	
	
	
	public HashSet<Policy> splitByRoles(){
		HashSet<Policy> res = new HashSet<Policy>();
		PolicyEditor policyEditor = new PolicyEditor(policy);
		for (User u : policyEditor.getPolicyUsers(policy.getName())){
			String policyName = u.getName();
			Policy p = factory.createPolicy();
			p.setName(policyName);
			PolicyEditor pe = new PolicyEditor(p);
			User usr = pe.cloneUser(u);   
			p.getElements().add(usr);
			for(Role r : u.getRoles()){
				Role rol = pe.cloneRole(r);
				p.getElements().add(rol);
				pe.addPolicyUserRole(policyName, u.getName(), rol.getName());
				for (Permission per : r.getPermissions()){
					Permission perm = pe.clonePermission(per);
					p.getElements().add(perm);
					pe.addPolicyRolePermission(policyName, rol.getName(),perm.getName());	
					for (Operation op : per.getOperations()){
						Operation ope = pe.cloneOperation(op);
						p.getElements().add(ope);
						pe.addPolicyPermissionOperation(policyName, per.getName(), op.getName());
						for(policy.Object ob : op.getObjects()){
							policy.Object obj = pe.cloneObject(ob);
							p.getElements().add(obj);
							pe.addPolicyPermissionOperationObject(policyName, per.getName(), op.getName(), ob.getName());
						}
					}
				}
			}
			res.add(p);
		}
		return res;
	}
	
	
}