package utils.xacml.filesGenerator;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import com.sun.xacml.EvaluationCtx;
import com.sun.xacml.Rule;
import com.sun.xacml.cond.Apply;
import com.sun.xacml.cond.BagFunction;
import com.sun.xacml.cond.EvaluationResult;

public class PolicyRuleGenerator {
	
	public ArrayList<Rule> rules;
	
	public PolicyRuleGenerator(){
		rules = new ArrayList<Rule>();
	}

	public void addRule(String subjectName,String resourceName,String actionName){
		int effect = 0; //0 to permit or 1 to deny
		String description = subjectName+actionName+resourceName;
		PolicyTargetGenerator policyTargetGenerator = new PolicyTargetGenerator();
		policyTargetGenerator.addListTargetsSubject(subjectName);
		policyTargetGenerator.addListTargetsResource(resourceName);
		policyTargetGenerator.addListTargetsAction(actionName);
		Rule rule= null;
		try {
			rule = new Rule(new URI(description), effect, description, policyTargetGenerator.createTarget(), null);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		rules.add(rule);
	}
	
	public void addRule(String subjectName,String resourceName,String actionName,String roleName){
		int effect = 0; //0 to permit or 1 to deny
		String description = subjectName+actionName+resourceName;
		PolicyTargetGenerator policyTargetGenerator = new PolicyTargetGenerator();
		policyTargetGenerator.addListTargetsSubject(subjectName);
		policyTargetGenerator.addListTargetsResource(resourceName);
		policyTargetGenerator.addListTargetsAction(actionName);
		Rule rule= null;
		try {
			rule = new Rule(new URI(description), effect, description, policyTargetGenerator.createTarget(), createApplyRole(roleName));
		} catch (URISyntaxException e) {
			e.printStackTrace();	
		}
		rules.add(rule);
	}
	
	

	public Apply createApplyRole(String roleName) throws IllegalArgumentException, URISyntaxException{
		PolicyTargetGenerator policyTargetGenerator = new PolicyTargetGenerator();
		//1st arg
		String[] args = new String[1];
		args[0] = "urn:oasis:names:tc:xacml:1.0:function:string-one-and-only";
		BagFunction f = new BagFunction("urn:oasis:names:tc:xacml:1.0:function:string-equal",0,args) {
			@Override
			public EvaluationResult evaluate(List arg0, EvaluationCtx arg1) {
				return null;
			}
		};
		//2nd arg
		ArrayList<Object> lst = new ArrayList<Object>();
		lst.add(policyTargetGenerator.createEvaluatableConditionRole(roleName));
		//3
		Apply apply = new Apply(f, lst, true);
		return apply;
	}
}