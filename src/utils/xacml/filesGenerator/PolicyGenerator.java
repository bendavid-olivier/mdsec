package utils.xacml.filesGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import com.sun.xacml.EvaluationCtx;
import com.sun.xacml.Indenter;
import com.sun.xacml.Policy;
import com.sun.xacml.Rule;
import com.sun.xacml.Target;
import com.sun.xacml.TargetMatch;
import com.sun.xacml.attr.AttributeValue;
import com.sun.xacml.combine.RuleCombiningAlgorithm;
import com.sun.xacml.cond.Apply;
import com.sun.xacml.cond.Evaluatable;
import com.sun.xacml.cond.EvaluationResult;
import com.sun.xacml.cond.Function;
import com.sun.xacml.cond.FunctionBase;
import com.sun.xacml.ctx.Attribute;
import com.sun.xacml.ctx.Result;

public class PolicyGenerator {
	
	public PolicyTargetGenerator policyTargetGenerator;
	public PolicyRuleGenerator policyRuleGenerator;
	

	public PolicyGenerator(){
		policyTargetGenerator = new PolicyTargetGenerator();
		policyRuleGenerator = new PolicyRuleGenerator();
	}
	
	public void createPolicy() throws URISyntaxException{
		Policy p  = new Policy(new URI("policyTest"), createRuleCombiningAlgorithm(), policyTargetGenerator.createTarget(), policyRuleGenerator.rules);
		try {
			p.encode(new FileOutputStream(new File("policy.xml")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static RuleCombiningAlgorithm createRuleCombiningAlgorithm() throws URISyntaxException{
		RuleCombiningAlgorithm ruleCombiningAlgorithm =  new RuleCombiningAlgorithm(new URI("urn:oasis:names:tc:xacml:1.0:rule-combining-algorithm:permit-overrides")) {
				
				@Override
				public Result combine(EvaluationCtx arg0, List arg1) {
					return null;
				}
			};
		return ruleCombiningAlgorithm;
	}
	
}
