package policyTools.checker;

import java.util.HashSet;
import java.util.Set;

import policy.*;
import policy.impl.*;
import policyTools.generator.Generator;

import utils.time.Chrono;

public class PolicyChecker { 
	private Policy policy;
	public static void main(String[] args) {
		Policy policy = PolicyFactoryImpl.eINSTANCE.createPolicy();
		Generator policyGenerator = new Generator(policy);
		policyGenerator.generateModelExample();
		Chrono c = new Chrono();
		c.start();
		PolicyChecker r = new PolicyChecker(policy);
		c.stop();
		System.out.println("temps de generation : "+c.displayTime());
		
		
		c.start();
		System.out.println("checkPolicyElementsNameNotNull : "
				+ r.checkPolicyElementsNameNotNull());
		System.out.println("checkAcyclicDelegation : "
				+ r.checkAcyclicDelegation());
		System.out.println("checkAcyclicHierachy : "
				+ r.checkAcyclicHierachy());
		System.out.println("checkSSoD : " + r.checkSSoD());
		System.out.println("checkDSoD : " + r.checkDSoD());
		c.stop();
		System.out.println("temps de verication : "+c.displayTime());
	}

	public PolicyChecker(Policy p) {
		// policy = RbacFactoryImpl.eINSTANCE.createPolicy();
		// initPolicy();
		// initPolicy(5, 3);
		// initPolicyCyclicDelegation(5,3);
		// initPolicyCyclicHierarchy(5,3);
		// initPolicySSoDViolated(5,3);
		//initPolicyExamples(1000, 3, false, true, true, true, true);
		policy = p;

	}

	
	
	public String checkPolicy(){
		String res ="\n";
		Chrono c = new Chrono();
		c.start();
		//System.out.println("checkPolicyElementsNameNotNull : "+ checkPolicyElementsNameNotNull());
		res = res+ "checkPolicyElementsNameNotNull : "	+ checkPolicyElementsNameNotNull();
		//System.out.println("checkAcyclicDelegation : "+ checkAcyclicDelegation());
		res = res +"\n"+"checkAcyclicDelegation : "+ checkAcyclicDelegation();
		//System.out.println("checkAcyclicHierachy : "+ checkAcyclicHierachy());
		res = res +"\n"+"checkAcyclicHierachy : "+ checkAcyclicHierachy();
		//System.out.println("checkSSoD : " + checkSSoD());
		res = res +"\n"+"checkSSoD : " + checkSSoD();
		//System.out.println("checkDSoD : " + checkDSoD());
		res = res +"\n"+"checkDSoD : " + checkDSoD();
		c.stop();
		res = res +"\n"+"temps de verication : "+c.displayTime();
		//System.out.println("temps de verication : "+c.displayTime());
		return res;
	}
	
	public String checkPolicyWithoutTime(){
		String res ="";
		//System.out.println("checkPolicyElementsNameNotNull : "+ checkPolicyElementsNameNotNull());
		res = res+ "checkPolicyElementsNameNotNull : "	+ checkPolicyElementsNameNotNull();
		//System.out.println("checkAcyclicDelegation : "+ checkAcyclicDelegation());
		res = res +"\n"+"checkAcyclicDelegation : "+ checkAcyclicDelegation();
		//System.out.println("checkAcyclicHierachy : "+ checkAcyclicHierachy());
		res = res +"\n"+"checkAcyclicHierachy : "+ checkAcyclicHierachy();
		//System.out.println("checkSSoD : " + checkSSoD());
		res = res +"\n"+"checkSSoD : " + checkSSoD();
		//System.out.println("checkDSoD : " + checkDSoD());
	//	res = res +"\n"+"checkDSoD : " + checkDSoD();
		//System.out.println("temps de verication : "+c.displayTime());
		return res;
	}
	
	// code false means that the invariant is not verified
	// else true means that the property defined by the invariant is verified

	/**
	 * @return
	 */
	public boolean checkPolicyElementsNameNotNull() {
		for (PolicyElement e : policy.getElements()) {
			if (e.getName() == null) {
				return false;
			}
		}
		return true;
	}

	public boolean checkSSoD() {
		// verifier qu'aucun user n'est assigné à deux roles qui soient associés
		// à une relation de SSoD
		for (PolicyElement e : policy.getElements()) {
			if (e instanceof UserImpl) {
				for (Role r : ((User) e).getRoles()) {
					for (Role r2 : ((User) e).getRoles()) {
						if (!r.equals(r2)) {
							if (r.getSsod().contains(r2)) {
								return false;
							}
						}
					}
				}
			}
		}
		return true;
	}

	public boolean checkDSoD() {
		// verifier qu'aucune session n'est assignée à deux roles qui soient
		// associés à une relation de SSoD
		for (PolicyElement e : policy.getElements()) {
			if (e instanceof UserImpl) {
				if (!(((User) e).getSession() == null)) {
					for (Role r : ((User) e).getSession().getRoles()) {
						for (Role r2 : ((User) e).getSession().getRoles()) {
							if (!r.equals(r2)) {
								if (r.getDsod().contains(r2)) {
									return false;
								}
							}
						}
					}
				}
			}
		}
		return true;
	}

	public boolean checkAcyclicDelegation() {
		for (PolicyElement e : policy.getElements()) {
			if (e instanceof UserImpl) {
				boolean res = checkAcyclicDelegation(new HashSet<User>(),
						(User) e);
				if (!res) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean checkAcyclicHierachy() {
		for (PolicyElement e : policy.getElements()) {
			if (e instanceof RoleImpl) {
				boolean res = checkAcyclicHirerachy(new HashSet<Role>(),
						(Role) e);
				if (!res) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean checkAcyclicDelegation(Set<User> explored, User u) {
		explored.add(u);
		for (User du : u.getDelegatees()) {
			if (!explored.contains(u)) {
				checkAcyclicDelegation(explored, du);
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean checkAcyclicHirerachy(Set<Role> explored, Role r) {
		explored.add(r);
		for (Role rj : r.getRh()) {
			if (!explored.contains(r)) {
				checkAcyclicHirerachy(explored, rj);
			} else {
				return false;
			}
		}
		return true;
	}
}