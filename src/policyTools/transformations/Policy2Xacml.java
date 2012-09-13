package policyTools.transformations;

import java.net.URISyntaxException;

import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.BuilderRegistry;

import patternbuilders.policy.PatternBuilderForobject;
import patternbuilders.policy.PatternBuilderForoperation;
import patternbuilders.policy.PatternBuilderForuserRoleRule;
import patternmatchers.policy.ObjectMatcher;
import patternmatchers.policy.OperationMatcher;
import patternmatchers.policy.UserMatcher;
import patternmatchers.policy.UserRoleRuleMatcher;
import policy.Operation;
import policy.Policy;
import policy.Role;
import policy.User;
import policy.Object;
import signatures.policy.ObjectSignature;
import signatures.policy.OperationSignature;
import signatures.policy.UserRoleRuleSignature;
import signatures.policy.UserSignature;
import utils.xacml.filesGenerator.PolicyGenerator;

public class Policy2Xacml {
	private Policy policy;
	private PolicyGenerator policyGenerator;
	
	private UserMatcher userMatcher;
	private ObjectMatcher objectMatcher;
	private UserRoleRuleMatcher userRoleRuleMatcher;
	private OperationMatcher operationMatcher;
	
	public Policy2Xacml(Policy x) {
		policy = x;
		policyGenerator = new PolicyGenerator();

		BuilderRegistry.getContributedStatelessPatternBuilders().put(
				UserMatcher.FACTORY.getPatternName(),
				new patternbuilders.policy.PatternBuilderForuser());
		BuilderRegistry.getContributedStatelessPatternBuilders().put(
				ObjectMatcher.FACTORY.getPatternName(),
				new PatternBuilderForobject());
		BuilderRegistry.getContributedStatelessPatternBuilders().put(
				UserRoleRuleMatcher.FACTORY.getPatternName(),
				new PatternBuilderForuserRoleRule());
		BuilderRegistry.getContributedStatelessPatternBuilders().put(
				OperationMatcher.FACTORY.getPatternName(),
				new PatternBuilderForoperation());
		try {
			userMatcher = UserMatcher.FACTORY.getMatcher(policy);
			objectMatcher = ObjectMatcher.FACTORY.getMatcher(policy);
			userRoleRuleMatcher = UserRoleRuleMatcher.FACTORY.getMatcher(policy);
			operationMatcher = OperationMatcher.FACTORY.getMatcher(policy);
		} catch (IncQueryRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	public void transformation() {
		policyGenerator = new PolicyGenerator();
		addUsers();
		addOperations();
		addObjects();
		addRules();
		try {
			policyGenerator.createPolicy();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
	
	public void addUsers(){
		for(UserSignature sig : userMatcher.getAllMatchesAsSignature()){
			User u = (User) sig.getValueOfU();
			policyGenerator.policyTargetGenerator.addListTargetsSubject(u.getName());
		}
	}
	
	public void addObjects(){
		for(OperationSignature sig : operationMatcher.getAllMatchesAsSignature()){
			Operation op = (Operation) sig.getValueOfOP();
			policyGenerator.policyTargetGenerator.addListTargetsAction(op.getName());
		}
	}
	
	public void addOperations(){
		for(ObjectSignature sig : objectMatcher.getAllMatchesAsSignature()){
			Object ob = (Object)sig.getValueOfOB();
			policyGenerator.policyTargetGenerator.addListTargetsResource(ob.getName());
		}
	}
	
	public void addRules(){
		for(UserRoleRuleSignature sig : userRoleRuleMatcher.getAllMatchesAsSignature()){
			User u = (User) sig.getValueOfUSER();
			Operation op = (Operation) sig.getValueOfOPERATION();
			Object ob = (Object)sig.getValueOfOBJECT();
			Role r = (Role)sig.getValueOfROLE();
			policyGenerator.policyRuleGenerator.addRule(u.getName(), ob.getName(), op.getName(),r.getName());
		}
	}	
}