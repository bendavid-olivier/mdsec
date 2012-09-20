package policyTools.guiEditor.controllers;

import java.util.HashSet;

import kevoreeTools.editor.KevoreeEditor;

import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.BuilderRegistry;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.misc.DeltaMonitor;

import patternbuilders.policy.*;
import patternmatchers.policy.*;
import signatures.kevoree.EnforcedRuleSignature;
import signatures.policy.*;

import policy.Operation;
import policy.Permission;
import policy.Policy;
import policy.Role;
import policy.Session;
import policy.User;
import policyTools.guiEditor.graphicComponents.*;
import policyTools.simulation.SimulationSplit;
import policyTools.transformations.IPolicy2KevScript;
import policyTools.transformations.Policy2KevScript;
import policyTools.transformations.Policy2KevScriptXACML;


public class PolicyListener {

	
	public static final String MODE_XACML = "MODE_XACML";
	public static final String MODE_MDSEC = "MODE_MDSEC";
	private String CURRENT_MODE ="MODE_MDSEC";

	private Policy2KevScriptXACML transfo2XACML;
	private Policy2KevScript transfo2MDSEC;
	
	private PolicyTextualEditor editor;

	private Policy policy; 

	// matchers
	private UserMatcher userMatcher;
	private RoleMatcher roleMatcher;
	private PermissionMatcher permissionMatcher;
	private OperationMatcher operationMatcher;	
	private ObjectMatcher objectMatcher;
	private SessionMatcher sessionMatcher;
	
	private UserRoleRuleMatcher userRuleMatcher;
	private UserActivatedRoleRuleMatcher userActivatedRuleMatcher;
	
	// monitors
	final DeltaMonitor<UserSignature> monitorUser;
	final DeltaMonitor<RoleSignature> monitorRole;
	final DeltaMonitor<PermissionSignature> monitorPermission;
	final DeltaMonitor<OperationSignature> monitorOperation;
	final DeltaMonitor<ObjectSignature> monitorObject;
	final DeltaMonitor<SessionSignature> monitorSession;
	
	final DeltaMonitor<UserRoleRuleSignature> monitorUserRule;
	final DeltaMonitor<UserActivatedRoleRuleSignature> monitorActivatedUserRule;

	private SimulationSplit simulation;

	private int portNumber;
	
	
	public void registerMatchers(){
		BuilderRegistry.getContributedStatelessPatternBuilders().put(
				UserMatcher.FACTORY.getPatternName(),
				new patternbuilders.policy.PatternBuilderForuser()); 
		BuilderRegistry.getContributedStatelessPatternBuilders().put(
				RoleMatcher.FACTORY.getPatternName(),
				new PatternBuilderForrole());
		BuilderRegistry.getContributedStatelessPatternBuilders().put(
				PermissionMatcher.FACTORY.getPatternName(),
				new PatternBuilderForpermission());
		BuilderRegistry.getContributedStatelessPatternBuilders().put(
				OperationMatcher.FACTORY.getPatternName(),
				new PatternBuilderForoperation());
		BuilderRegistry.getContributedStatelessPatternBuilders().put(
				ObjectMatcher.FACTORY.getPatternName(),
				new PatternBuilderForobject());
		BuilderRegistry.getContributedStatelessPatternBuilders().put(
				SessionMatcher.FACTORY.getPatternName(),
				new PatternBuilderForsession());
		
		BuilderRegistry.getContributedStatelessPatternBuilders().put(
				UserRoleRuleMatcher.FACTORY.getPatternName(),
				new PatternBuilderForuserRoleRule());
		BuilderRegistry.getContributedStatelessPatternBuilders().put(
				UserActivatedRoleRuleMatcher.FACTORY.getPatternName(),
				new PatternBuilderForuserActivatedRoleRule());
	}
	
	public void initMatchers(){
		try {
			userMatcher = UserMatcher.FACTORY.getMatcher(policy);
			roleMatcher = RoleMatcher.FACTORY.getMatcher(policy);
			permissionMatcher = PermissionMatcher.FACTORY.getMatcher(policy);			
			operationMatcher = OperationMatcher.FACTORY.getMatcher(policy);
			objectMatcher = ObjectMatcher.FACTORY.getMatcher(policy);
			sessionMatcher = SessionMatcher.FACTORY.getMatcher(policy);
			userRuleMatcher = UserRoleRuleMatcher.FACTORY.getMatcher(policy);
			userActivatedRuleMatcher = UserActivatedRoleRuleMatcher.FACTORY.getMatcher(policy);
		
		} catch (IncQueryRuntimeException e) {
			e.printStackTrace();
		}	
	}
	
	
	public PolicyListener(PolicyTextualEditor edit){
		editor = edit;
		policy = editor.getPolicy();
		transfo2XACML  = new Policy2KevScriptXACML(editor.getPolicy());
		transfo2MDSEC = new Policy2KevScript(editor.getPolicy());
		
		registerMatchers();
		initMatchers();
		
		portNumber = 42000;
		monitorUser = userMatcher.newDeltaMonitor(false);
		monitorRole = roleMatcher.newDeltaMonitor(false);
		monitorPermission = permissionMatcher.newDeltaMonitor(false);
		monitorOperation = operationMatcher.newDeltaMonitor(false);
		monitorObject = objectMatcher.newDeltaMonitor(false);
		monitorSession = sessionMatcher.newDeltaMonitor(false);
		
		monitorUserRule = userRuleMatcher.newDeltaMonitor(false);
		monitorActivatedUserRule = userActivatedRuleMatcher.newDeltaMonitor(false);
	}
	
	public PolicyListener(SimulationSplit s){
		simulation = s;
		policy = simulation.policy;
		transfo2XACML  = new Policy2KevScriptXACML(policy);
		transfo2MDSEC = new Policy2KevScript(policy);
		registerMatchers();
		initMatchers();
		
		portNumber = 42000;
		monitorUser = userMatcher.newDeltaMonitor(false);
		monitorRole = roleMatcher.newDeltaMonitor(false);
		monitorPermission = permissionMatcher.newDeltaMonitor(false);
		monitorOperation = operationMatcher.newDeltaMonitor(false);
		monitorObject = objectMatcher.newDeltaMonitor(false);
		monitorSession = sessionMatcher.newDeltaMonitor(false);
		
		monitorUserRule = userRuleMatcher.newDeltaMonitor(false);
		monitorActivatedUserRule = userActivatedRuleMatcher.newDeltaMonitor(false);
	}
	
	public PolicyListener(SimulationSplit s, Policy p){
		simulation = s;
		policy = p;
		transfo2XACML  = new Policy2KevScriptXACML(policy);
		transfo2MDSEC = new Policy2KevScript(policy);
		registerMatchers();
		initMatchers();
		
		portNumber = 42000;
		monitorUser = userMatcher.newDeltaMonitor(false);
		monitorRole = roleMatcher.newDeltaMonitor(false);
		monitorPermission = permissionMatcher.newDeltaMonitor(false);
		monitorOperation = operationMatcher.newDeltaMonitor(false);
		monitorObject = objectMatcher.newDeltaMonitor(false);
		monitorSession = sessionMatcher.newDeltaMonitor(false);
		
		monitorUserRule = userRuleMatcher.newDeltaMonitor(false);
		monitorActivatedUserRule = userActivatedRuleMatcher.newDeltaMonitor(false);
	}
	
	public void listen(){
		//add user
		userMatcher.addCallbackAfterUpdates(new Runnable() {			
			//add remove subjects
			@Override
			public void run() {
				for (UserSignature sig : monitorUser.matchFoundEvents) {
					String user = ((User)sig.getValueOfU()).getName();
					//String script = getTransformator().addSubject(user);
					//applyScript(script);
//					System.out.println(user);
//					editor.policyTreeMonitor.addUser(user);
//					editor.update();
				}				
				
				for (UserSignature sig : monitorUser.matchLostEvents) {
					String user = ((User)sig.getValueOfU()).getName();
//					String script = getTransformator().removeSubject(user);
//					applyScript(script);
				}				
				monitorUser.clear();
			}
		});
		
		roleMatcher.addCallbackAfterUpdates(new Runnable() {			
			@Override
			public void run() {
				for (RoleSignature sig : monitorRole.matchFoundEvents) {
					String role = ((Role)sig.getValueOfR()).getName();
//					String script = getTransformator().addSubject(role);
//					applyScript(script);
//					editor.policyTreeMonitor.addRole(role);
//					editor.update();
				}				
				for (RoleSignature sig : monitorRole.matchLostEvents) {
					String role = ((Role)sig.getValueOfR()).getName();
//					String script = getTransformator().removeSubject(role);
//					applyScript(script);
				}				
				monitorRole.clear();
			}
		});
		
		permissionMatcher.addCallbackAfterUpdates(new Runnable() {			
			@Override
			public void run() {
				for (PermissionSignature sig : monitorPermission.matchFoundEvents) {
					String permission = ((Permission)sig.getValueOfP()).getName();
//					editor.policyTreeMonitor.addPermission(permission);
//					editor.update();
				}				
				for (PermissionSignature sig : monitorPermission.matchLostEvents) {
					String permission = ((Permission)sig.getValueOfP()).getName();
				}				
				monitorPermission.clear();
			}
		});
		
		operationMatcher.addCallbackAfterUpdates(new Runnable() {			
			@Override
			public void run() {
				for (OperationSignature sig : monitorOperation.matchFoundEvents) {
					String operation = ((Operation)sig.getValueOfOP()).getName();
//					editor.policyTreeMonitor.addOperation(operation);
//					editor.update();
				}				
				for (OperationSignature sig : monitorOperation.matchLostEvents) {
					String operation = ((Operation)sig.getValueOfOP()).getName();
				}				
				monitorOperation.clear();
			}
		});
		
		//add remove objects
		objectMatcher.addCallbackAfterUpdates(new Runnable() {
			@Override
			public void run() {
				//vers topology
				for (ObjectSignature sig : monitorObject.matchFoundEvents) {
					String object = ((policy.Object)sig.getValueOfOB()).getName();
//					editor.policyTreeMonitor.addObjectP(object);
//					editor.update();
//					String script = getTransformator().addObject(object);
//					applyScript(script);
					
				}
				for (ObjectSignature sig : monitorObject.matchLostEvents) {
					String object = ((policy.Object)sig.getValueOfOB()).getName();
//					String script = getTransformator().removeObject(object);
//					applyScript(script);
				}				
				monitorObject.clear();
			}
		});
		
		//add remove objects
		sessionMatcher.addCallbackAfterUpdates(new Runnable() {
			@Override
			public void run() {
				for (SessionSignature sig : monitorSession.matchFoundEvents) {
					String session = ((Session)sig.getValueOfS()).getName();
//					System.out.println("detection addition session : "+session+" in : "+policy.getName());
//					editor.policyTreeMonitor.addSession(session);
//					editor.update();
				}
				for (SessionSignature sig : monitorSession.matchLostEvents) {
					String session = ((Session)sig.getValueOfS()).getName();
				}				
				monitorSession.clear();
			}
		});

		userRuleMatcher.addCallbackAfterUpdates(new Runnable() {
			@Override
			public void run() {
				for (UserRoleRuleSignature sig : monitorUserRule.matchFoundEvents) {
//					String user = ((policy.User)sig.getValueOfUSER()).getName();
//					String operation = ((policy.Operation)sig.getValueOfOPERATION()).getName();
//					String object = ((policy.Object)sig.getValueOfOBJECT()).getName();
//					String script = getTransformator().addUserRule(user, operation, object);
//					applyScript(script);
//					editor.outputEditor.policyRules.updateTable(getPolicyRules());
//					editor.update();
				}
				monitorUserRule.clear();
			}
		});	
		
		userActivatedRuleMatcher.addCallbackAfterUpdates(new Runnable() {
			@Override
			public void run() {
				for (UserActivatedRoleRuleSignature sig : monitorActivatedUserRule.matchFoundEvents) {
					String user = ((policy.User)sig.getValueOfUSER()).getName();
					String operation = ((policy.Operation)sig.getValueOfOPERATION()).getName();
					String object = ((policy.Object)sig.getValueOfOBJECT()).getName();
					String role = ((policy.Role)sig.getValueOfROLE()).getName();
					String script = getTransformator().addUserRule(user, operation, object);
					applyScript(script);
//					editor.outputEditor.policyRulesActivated.updateTable(getPolicyRulesActivated());
					
//					System.out.println("rule : "+user+":"+role+":"+operation+":"+object);
					
					//adaptation 
					HashSet<String> causes = new HashSet<String>();
					boolean canAdapt = true;
					//ajout channel pas de risque c'est juste une representation virtuelle
					KevoreeEditor ked = new KevoreeEditor(simulation.kevoree);
//					editor.simulation.k  editor.addChannel(user+role+operation);
					ked.addChannel(user+role+operation);
					//ajout binding : risque, l'user, le role ou l'operation ne sont pas la ?
					if(ked.getNodeByName(user) == null){
						causes.add("node "+user);
						canAdapt = false;
					}
					if(ked.getNodeComponentByName(user, role) == null){
						causes.add("component "+role);
						canAdapt = false;
					}
					if(ked.getNodeComponentPortByName(user, role, operation) == null){
						causes.add("user port "+operation);
						canAdapt = false;
					}
											
					//ajout binding : risque, l'objectnode, l object ou l'operation ne sont pas la ?
					if(ked.getNodeByName(object) == null){
						causes.add("node "+object);
						canAdapt = false;
					}
					if(ked.getNodeComponentByName(object, object) == null){
						causes.add("component "+object);
						canAdapt = false;
					}
					if(ked.getNodeComponentPortByName(object, object, operation) == null){
						causes.add("object port "+operation);
						canAdapt = false;
					}
					if(canAdapt){
						ked.addBinding(user, role, operation, user+role+operation);
						ked.addBinding(object, object, operation, user+role+operation);
					}
					else{
//						for(String causeX : causes){
//							java.lang.Object[][] dataTemp = editor.outputEditor.errorEnforcement.data;
//							java.lang.Object[][] data = new java.lang.Object[dataTemp.length+1][5]; 
//							for(int i =0; i< dataTemp.length; i++){
//								data[i] = dataTemp[i];
//							}
//							String userX = ((policy.User)sig.getValueOfUSER()).getName();
//							String operationX = ((policy.Operation)sig.getValueOfOPERATION()).getName();
//							String objectX = ((policy.Object)sig.getValueOfOBJECT()).getName();
//							String roleX = ((policy.Role)sig.getValueOfROLE()).getName();
//							java.lang.Object[] line = {userX,roleX,operationX,objectX,causeX};
//							data[dataTemp.length] = line;
//							editor.outputEditor.errorEnforcement.updateTable(data);
//						}
					}
					
//					verifyEnforcement("rule activation");	
					
//					editor.update();
				}
				monitorActivatedUserRule.clear();
			}
		});	
	}
	
	
	public void verifyEnforcement(String policyChange){
		boolean rulesEnforced = true;
		boolean shouldContinue =true;
		while(shouldContinue){
			for(Object[]  sigX : getPolicyRulesActivated()){
				String userXX = sigX[0].toString();
				String roleXX = sigX[1].toString();
				String operationXX = sigX[2].toString();
				String objectXX = sigX[3].toString();
				boolean isEnforced = false;
				for(Object[] sigX2 : simulation.kevoreeListener.getPolicyRulesEnforced()){
					String userXX2 = sigX2[0].toString();
					String roleXX2 = sigX2[1].toString();
					String operationXX2 = sigX2[2].toString();
					String objectXX2 = sigX2[3].toString();
					if(userXX.equals(userXX2) && roleXX.equals(roleXX2) && operationXX.equals(operationXX2) && objectXX.equals(objectXX2)){
						isEnforced = true;
					}
				}
				if (!isEnforced){
					shouldContinue = false;
				}
			}
			shouldContinue = false;
		}		
//		editor.outputEditor.consoleEditor.print(policyChange +"  "+rulesEnforced);
	}
	
	
	public java.lang.Object[][] getPolicyRules(){
		java.lang.Object[][] data = new java.lang.Object[userRuleMatcher.getAllMatchesAsSignature().size()][4];
		int cpt = 0;
		for(UserRoleRuleSignature rule : userRuleMatcher.getAllMatchesAsSignature()){
			String userX = ((policy.User)rule.getValueOfUSER()).getName();
			String operationX = ((policy.Operation)rule.getValueOfOPERATION()).getName();
			String objectX = ((policy.Object)rule.getValueOfOBJECT()).getName();
			String roleX = ((policy.Role)rule.getValueOfROLE()).getName();
			java.lang.Object[] line = {userX,roleX,operationX,objectX};
			data[cpt] = line;
			cpt =cpt+1;
		}
		return data;
	}
	
	public java.lang.Object[][] getPolicyRulesActivated(){
		java.lang.Object[][] data = new java.lang.Object[userActivatedRuleMatcher.getAllMatchesAsSignature().size()][4];
		int cpt = 0;
		for(UserActivatedRoleRuleSignature rule : userActivatedRuleMatcher.getAllMatchesAsSignature()){
			String userX = ((policy.User)rule.getValueOfUSER()).getName();
			String operationX = ((policy.Operation)rule.getValueOfOPERATION()).getName();
			String objectX = ((policy.Object)rule.getValueOfOBJECT()).getName();
			String roleX = ((policy.Role)rule.getValueOfROLE()).getName();
			java.lang.Object[] line = {userX,roleX,operationX,objectX};
			data[cpt] = line;
			cpt =cpt+1;
		}
		return data;
	}
	
	public String removeRule(String userName,String operationName,String objectName){
		Policy2KevScript policy2KevScript = new Policy2KevScript(policy);
		String res = "";
		int haveToSuppressChannel = 0;
		for(UserRoleRuleSignature sig : userRuleMatcher.getAllMatchesAsSignature()){
			String user = ((User) sig.getValueOfUSER()).getName();
			String operation = ((Operation) sig.getValueOfOPERATION()).getName();
			if(user.equals(userName)&&operation.equals(operationName)){
				res = res + "\n"+ policy2KevScript.removeUserRuleBindingChannelObjectOperation(userName, operationName, objectName);
				return res;
			}
		}
		res =res +"\n"+policy2KevScript.removeUserRule(userName, operationName, objectName);
		return res;
	}
	
	public void applyScript(String s){
//		editor.update();
		Boolean scriptApplied = true; 
//		editor.outputEditor.consoleEditor.print(s);
//		if (! (editor.kevGuard == null)){
//			KevScriptEngine kse = editor.kevGuard.getKevScriptEngineFactory().createKevScriptEngine();
//			kse.append(s);
//			System.out.println("script : "+s+" on : "+kse);
//			scriptApplied = kse.atomicInterpretDeploy();
//		}
//		JOptionPane.showMessageDialog(editor, scriptApplied+":"+s,
//				"IncTransf", JOptionPane.INFORMATION_MESSAGE);
//		editor.update();
	}
	
	public IPolicy2KevScript getTransformator(){
		IPolicy2KevScript transfo = null;
		if(CURRENT_MODE.equals(MODE_MDSEC)){
			transfo = transfo2MDSEC;
		}
		if(CURRENT_MODE.equals(MODE_XACML)){
			transfo = transfo2XACML;
		}
		return transfo;
	}
	
	public void setCURRENT_MODE(String cURRENT_MODE) {
		CURRENT_MODE = cURRENT_MODE;
	}	
}