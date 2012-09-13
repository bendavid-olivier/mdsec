package policyTools.transformations;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.BuilderRegistry;
import patternbuilders.policy.*;
import patternmatchers.policy.*;
import signatures.policy.*;
import utils.writer.FileWriterO;

import policy.*;
import policy.Object;

public class Policy2KevScriptXACML implements IPolicy2KevScript{
	
	// matchers
	private UserMatcher userMatcher;
	private ObjectMatcher objectMatcher;
	private UserOperationMatcher userOperationMatcher;
	private UserRuleMatcher userRuleMatcher;
	private Policy policy;
	private int portNumber;

	public Policy2KevScriptXACML(Policy p) {
		policy = p;
		BuilderRegistry.getContributedStatelessPatternBuilders().put(
				UserMatcher.FACTORY.getPatternName(),
				new PatternBuilderForuser());
		BuilderRegistry.getContributedStatelessPatternBuilders().put(
				ObjectMatcher.FACTORY.getPatternName(),
				new PatternBuilderForobject());
		BuilderRegistry.getContributedStatelessPatternBuilders().put(
				UserOperationMatcher.FACTORY.getPatternName(),
				new PatternBuilderForuserOperation());
		BuilderRegistry.getContributedStatelessPatternBuilders().put(
				UserRuleMatcher.FACTORY.getPatternName(),
				new PatternBuilderForuserRule());
		try {
			userMatcher = UserMatcher.FACTORY.getMatcher(policy);
			objectMatcher = ObjectMatcher.FACTORY.getMatcher(policy);
			userOperationMatcher = UserOperationMatcher.FACTORY
					.getMatcher(policy);
			userRuleMatcher = UserRuleMatcher.FACTORY.getMatcher(policy);
		} catch (IncQueryRuntimeException e) {
			e.printStackTrace();
		}
		portNumber = 50000;
	}
	
	public String transformation() {
		String script = "";
		script = script + addSubjects();
		script = script + addObjects();
		script = script + addUserRules();
		return script;
	}

	public File transformation(String path) {
		String script = "";
		script = script + addSubjects();
		script = script + addObjects();
		script = script + addUserRules();
		FileWriterO fw = new FileWriterO();
		File f = fw.writeStringOnFile(script, path);
		return f;
	}

	public String addSubject(String userName) {
		//add node and comp subject
		portNumber = portNumber+1;
		String script = "";
		script = script + "\n" + "addNode "+userName+" : JavaSENode";
		script = script + "\n" + "addChild  "+userName+"@nodeMC";
		script = script + "\n" + "addToGroup sync "+userName;
		script = script + "\n" + "updateDictionary sync{ port=\""+portNumber+"\"}@"+userName;
		script = script + "\n" + "addComponent " + userName
				+ "@"+userName+" : SubjectKXACML";
		
		//add node and comp policypoint
		portNumber = portNumber+1;
		script = script + "\n" + "addNode "+userName+"PolicyPoint : JavaSENode";
		script = script + "\n" + "addChild  "+userName+"PolicyPoint@nodeMC";
		script = script + "\n" + "addToGroup sync "+userName+"PolicyPoint";
		script = script + "\n" + "updateDictionary sync{ port=\""+portNumber+"\"}@"+userName+"PolicyPoint";
		script = script + "\n" + "addComponent " + userName+"PolicyPoint"
				+ "@"+userName+"PolicyPoint : PolicyPoint";
		
		//connect subject comp to policyPoint request
		String channelNameReq = "subjectPolicyPointReq" + userName;	
		portNumber = portNumber + 1;
		script = script + "\n" + "addChannel " + channelNameReq
				+ " : SocketChannel";
		script = script + "\n" + "bind " + userName + ".request"
				+ "@"+userName + "=>" + channelNameReq;
		script = script + "\n" + "updateDictionary " + channelNameReq
				+ "{ port=\"" + portNumber + "\"}@"+userName;
		portNumber = portNumber + 1;		
		script = script + "\n" + "bind " + userName+"PolicyPoint" + ".evaluate"
				+ "@" + userName+"PolicyPoint" + " =>" + channelNameReq;		
		script = script + "\n" + "updateDictionary " + channelNameReq
				+ "{ port=\"" + portNumber + "\"}@"+userName+"PolicyPoint";
		
		//connect subject comp to policyPoint request
		String channelNameRes = "subjectPolicyPointRes" + userName;
		portNumber = portNumber + 1;
		script = script + "\n" + "addChannel " + channelNameRes
				+ " : SocketChannel";
		script = script + "\n" + "bind " + userName + ".receive"
				+ "@"+userName + "=>" + channelNameRes;
		script = script + "\n" + "updateDictionary " + channelNameRes
				+ "{ port=\"" + portNumber + "\"}@"+userName;
		portNumber = portNumber + 1;				
		script = script + "\n" + "bind " + userName+"PolicyPoint" + ".result"
				+ "@" + userName+"PolicyPoint" + " =>" + channelNameRes;			
		script = script + "\n" + "updateDictionary " + channelNameRes
				+ "{ port=\"" + portNumber + "\"}@"+userName+"PolicyPoint";
		
		//access resource
		String channelNameAccess = "subject" +userName+ "access";
		script = script + "\n" + "addChannel " + channelNameAccess
				+ " : SocketChannel";		
		
		portNumber = portNumber + 1;
		script = script + "\n" + "bind " + userName+"PolicyPoint.accessResource" 
				+ "@"+userName + "PolicyPoint=>" + channelNameAccess;
		script = script + "\n" + "updateDictionary " + channelNameAccess
				+ "{ port=\"" + portNumber + "\"}@"+userName+ "PolicyPoint";	
		script = script + "\n" + "updateDictionary " + channelNameAccess
				+ "{ replay=\"" + false + "\"}@"+userName+ "PolicyPoint";	
		//update PP
		String channelUpdatePP = "updatePPs";
		script = script + "\n" + "addChannel " + channelUpdatePP
			+ " : SocketChannel";
				
		portNumber = portNumber + 1;
		script = script + "\n" + "bind " + userName+"PolicyPoint.updatePP" 
			+ "@"+userName + "PolicyPoint=>" + channelUpdatePP;
		script = script + "\n" + "updateDictionary " + channelUpdatePP
			+ "{ port=\"" + portNumber + "\"}@"+userName+ "PolicyPoint";
				
		portNumber = portNumber + 1;
		script = script + "\n" + "bind " + "KevGuard.updatePPs"
			+ "@nodeAC" + " =>" + channelUpdatePP;
		script = script + "\n" + "updateDictionary " + channelUpdatePP
			+ "{ port=\"" + portNumber + "\"}@nodeAC";
		return script;
	}
	
	public String removeSubject(String userName) {
		String script = "";
		for(UserRuleSignature sig : userRuleMatcher.getAllMatchesAsSignature()){
			if ( ((User)sig.getValueOfUSER()).getName().equals(userName)){
				String objectName = ((Object) sig.getValueOfOBJECT()).getName();
				String operationName = ((Operation) sig.getValueOfOPERATION())
						.getName();						
				script = script + "\n"  + removeUserRule(userName, operationName, objectName);
			}
		}
		script = script + "\n" + "removeComponent " + userName	+ "@"+userName;
		return script;
	}

	public String addSubjects() {
		String script = "";
		for (UserSignature  sig : userMatcher.getAllMatchesAsSignature()) {
			String userName = ((User) sig.getValueOfU()).getName();
			script = script + "\n" + "addComponent " + userName
					+ "@subjects : AddressBookClient";
		}
		return script;
	}
	
	public String addObject(String objectName) {
		portNumber = portNumber+1;
		String script = "";
		script = script + "\n" + "addNode "+objectName+" : JavaSENode";
		script = script + "\n" + "addChild  "+objectName+"@nodeMC";
		script = script + "\n" + "addToGroup sync "+objectName;
		script = script + "\n" + "updateDictionary sync{ port=\""+portNumber+"\"}@"+objectName;
		script = script + "\n" + "addComponent " + objectName
				+ "@"+objectName+" : ObjectK";
	
		//construct result
		String channelNameConst = "subject" +"const"+objectName;
		script = script + "\n" + "addChannel " + channelNameConst
				+ " : SocketChannel";
			
		portNumber = portNumber + 1;
		script = script + "\n" + "bind " + objectName + ".send"
				+ "@" + objectName + " =>" + channelNameConst;
		script = script + "\n" + "updateDictionary " + channelNameConst
				+ "{ port=\"" + portNumber + "\"}@"+objectName;	
		return script;
	}
	
	public String removeObject(String objectName){
		String script = "";
		script = script + "\n" + "removeComponent " + objectName
				+ "@resources";
		return script;
	}

	public String addObjects() {
		String script = "";
		for (ObjectSignature sig : objectMatcher.getAllMatchesAsSignature()) {
			String objectName = ((Object) sig.getValueOfOB()).getName();
			script = script + "\n" + "addComponent " + objectName
					+ "@resources : AddressBook { }";
		}
		return script;
	}

	public String addUserRule(String userName, String operationName,
			String objectName) {
		String script = "";
		//access resource
		String channelNameAccess = "subject" +userName+ "access";
		
		portNumber = portNumber + 1;
		script = script + "\n" + "bind " + objectName + ".receive"
				+ "@" + objectName + " =>" + channelNameAccess;
		script = script + "\n" + "updateDictionary " + channelNameAccess
				+ "{ port=\"" + portNumber + "\"}@"+objectName;
				
		//construct result
		String channelNameConst = "subject"  +"const"+objectName;
		
		portNumber = portNumber + 1;
		script = script + "\n" + "bind " + userName+"PolicyPoint.constructResult" 
				+ "@"+userName + "PolicyPoint=>" + channelNameConst;
		script = script + "\n" + "updateDictionary " + channelNameConst
				+ "{ port=\"" + portNumber + "\"}@"+userName+ "PolicyPoint";
		
		return script;
	}
	
	public String removeUserRule(String userName, String operationName,
			String objectName) {
		String script = "";
		String channelName = "subject" + userName + operationName;
 
		script = script + "\n" + "unbind " + userName + "." + operationName
				+ "@subjects" + "=>" + channelName; 
		
		script = script + "\n" + "unbind " + objectName + "." + operationName
				+ "@resources" + " =>" + channelName;
		
		script = script + "\n" + "removeChannel " + channelName;
		
		return script;
	}
	
	public String removeUserRuleChannel(String userName, String operationName, String objectName) {
		String script = "";
		String channelName = "subject" + userName + operationName;
		script = script + "\n" + "removeChannel " + channelName;
		return script;
	}
	
	public String removeUserRuleBindingSubjectOperationChannel(String userName, String operationName,
			String objectName) {
		String script = "";
		String channelName = "subject" + userName + operationName;
		script = script + "\n" + "unbind " + userName + "." + operationName
				+ "@subjects" + "=>" + channelName;
		return script;
	}
	
	public String removeUserRuleBindingChannelObjectOperation(String userName, String operationName,
			String objectName) {
		String script = "";
		String channelName = "subject" + userName + operationName;
		script = script + "\n" + "unbind " + objectName + "." + operationName
				+ "@resources" + " =>" + channelName;
		return script;
	}
	
	public String addUserRules() {
		String script = "";
		for (UserRuleSignature sig : userRuleMatcher.getAllMatchesAsSignature()) {		
			String userName = ((User) sig.getValueOfUSER()).getName();
			String objectName = ((Object) sig.getValueOfOBJECT()).getName();
			String operationName = ((Operation) sig.getValueOfOPERATION()).getName();
			script = script + "\n"+addUserRule(userName, operationName, objectName);
		}
		return script;
	}
}