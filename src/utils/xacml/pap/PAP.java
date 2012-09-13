package utils.xacml.pap;

import java.util.HashSet;
import java.util.Set;

import com.sun.xacml.finder.PolicyFinder;
import com.sun.xacml.finder.impl.FilePolicyModule;

public class PAP {

	private FilePolicyModule policyModule;
	private PolicyFinder policyFinder;
	private Set<Object> policyModules;
	
	public PAP(){
		policyModule = new FilePolicyModule();
		policyModule.addPolicy("policy.xml");
		policyFinder = new PolicyFinder();
		policyModules = new HashSet<Object>();
		policyModules.add(policyModule);
		policyFinder.setModules(policyModules);
	}

	public FilePolicyModule getPolicyModule() {
		return policyModule;
	}

	public void setPolicyModule(FilePolicyModule policyModule) {
		this.policyModule = policyModule;
	}

	public PolicyFinder getPolicyFinder() {
		return policyFinder;
	}

	public void setPolicyFinder(PolicyFinder policyFinder) {
		this.policyFinder = policyFinder;
	}

	public Set<Object> getPolicyModules() {
		return policyModules;
	}

	public void setPolicyModules(Set<Object> policyModules) {
		this.policyModules = policyModules;
	}

	public void removePolicy() {
		System.out.println("remove old policy");
		System.out.println(policyModules.size());
		policyModules.remove(policyModule);
		System.out.println(policyModules.size());
	}
	
	public void putPolicy() {
		System.out.println("put target policy");
		policyModule = new FilePolicyModule();
		policyModule.addPolicy("policy.xml");
		policyFinder = new PolicyFinder();
		policyModules = new HashSet<Object>();
		policyModules.add(policyModule);
		policyFinder.setModules(policyModules);
	}
	


	
}