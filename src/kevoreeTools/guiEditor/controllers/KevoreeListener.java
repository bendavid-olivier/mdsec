package kevoreeTools.guiEditor.controllers;

import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.BuilderRegistry;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.misc.DeltaMonitor;
import patternmatchers.kevoree.*;
import policy.Policy;
import policy.Role;
import policyTools.checker.PolicyChecker;
import policyTools.editor.PolicyEditor;
import policyTools.simulation.Simulation;
import policyTools.simulation.SimulationSplit;
import signatures.kevoree.*;
import kevoree.*;
import kevoreeTools.guiEditor.graphicComponents.*;

public class KevoreeListener {

	public final static String STRATEGY_SPLITUSERS = "STRATEGY_SPLITUSERS";
	public final static String STRATEGY_SPLITROLES = "STRATEGY_SPLITROLES";
	public final static String STRATEGY_SIMPLE = "STRATEGY_SIMPLE";
	public String current_strategy = STRATEGY_SIMPLE;
	
	private KevoreeTextualEditor editor;
	private ContainerRoot kevoree;
	private Simulation simulation;

	private NodeMatcher nodeMatcher;
	private NodeComponentMatcher nodeComponentMatcher;
	private ChannelMatcher channelMatcher;
	private EnforcedRuleMatcher enforcedRuleMatcher;

	final DeltaMonitor<NodeSignature> monitorNode;
	final DeltaMonitor<NodeComponentSignature> monitorNodeComponent;
	final DeltaMonitor<ChannelSignature> monitorChannel;
	final DeltaMonitor<EnforcedRuleSignature> monitorEnforcedRule;

	public void registerLiteners() {
		BuilderRegistry.getContributedStatelessPatternBuilders().put(
				NodeMatcher.FACTORY.getPatternName(),
				new patternbuilders.kevoree.PatternBuilderFornode());

		BuilderRegistry.getContributedStatelessPatternBuilders().put(
				NodeComponentMatcher.FACTORY.getPatternName(),
				new patternbuilders.kevoree.PatternBuilderFornodeComponent());

		BuilderRegistry.getContributedStatelessPatternBuilders().put(
				ChannelMatcher.FACTORY.getPatternName(),
				new patternbuilders.kevoree.PatternBuilderForchannel());

		BuilderRegistry.getContributedStatelessPatternBuilders().put(
				EnforcedRuleMatcher.FACTORY.getPatternName(),
				new patternbuilders.kevoree.PatternBuilderForenforcedRule());
	}

	public void initMatchers() {
		try {
			
			nodeMatcher = NodeMatcher.FACTORY.getMatcher(kevoree);
			nodeComponentMatcher = NodeComponentMatcher.FACTORY
					.getMatcher(kevoree);
			channelMatcher = ChannelMatcher.FACTORY
					.getMatcher(kevoree);
			enforcedRuleMatcher = EnforcedRuleMatcher.FACTORY
					.getMatcher(kevoree);
		} catch (IncQueryRuntimeException e) {
			e.printStackTrace();
		}
	}

	public KevoreeListener(KevoreeTextualEditor e) {
		editor = e;
		kevoree = e.getKevoree();
		registerLiteners();
		initMatchers();
		monitorNode = nodeMatcher.newDeltaMonitor(false);
		monitorNodeComponent = nodeComponentMatcher.newDeltaMonitor(false);
		monitorChannel = channelMatcher.newDeltaMonitor(false);
		monitorEnforcedRule = enforcedRuleMatcher.newDeltaMonitor(false);
	}
	
	public KevoreeListener(ContainerRoot cr) {
		kevoree = cr;
		registerLiteners();
		initMatchers();
		monitorNode = nodeMatcher.newDeltaMonitor(false);
		monitorNodeComponent = nodeComponentMatcher.newDeltaMonitor(false);
		monitorChannel = channelMatcher.newDeltaMonitor(false);
		monitorEnforcedRule = enforcedRuleMatcher.newDeltaMonitor(false);
	}

	public KevoreeListener(Simulation k, String strategy) {
		kevoree = k.kevoree;
//		System.out.println(k);
//		System.out.println(k.kevoree);
		current_strategy=strategy; 
		registerLiteners();
		simulation = k;
		initMatchers();
		monitorNode = nodeMatcher.newDeltaMonitor(false);
		monitorNodeComponent = nodeComponentMatcher.newDeltaMonitor(false);
		monitorChannel = channelMatcher.newDeltaMonitor(false);
		monitorEnforcedRule = enforcedRuleMatcher.newDeltaMonitor(false);
	}
	

	public void listen() {
		// add remove nodes
		nodeMatcher.addCallbackAfterUpdates(new Runnable() {
			@Override
			public void run() {
				for (NodeSignature sig : monitorNode.matchFoundEvents) {
					String node = ((ContainerNode) sig.getValueOfN()).getName();
					
					if(getAppropriatePolicy(node) != null){
						PolicyEditor pe = new PolicyEditor(getAppropriatePolicy(node));
						
						if(pe.getPolicyUserByName(getAppropriatePolicy(node).getName(), node) != null){						
							pe.setPolicyUserSession(getAppropriatePolicy(node).getName(), node, "s" + node);
						}
					}
				}
				for (NodeSignature sig : monitorNode.matchLostEvents) {
					String node = ((ContainerNode) sig.getValueOfN()).getName();
				}
				monitorNode.clear();
			}
		});

		// add remove components
		nodeComponentMatcher.addCallbackAfterUpdates(new Runnable() {
			@Override
			public void run() {
				for (NodeComponentSignature sig : monitorNodeComponent.matchFoundEvents) {
					String node = ((ContainerNode) sig.getValueOfN()).getName();
					String comp = ((ComponentInstance) sig.getValueOfC())
							.getName();
					String compType = ((ComponentInstance) sig.getValueOfC())
							.getTypeDefinition().getName();
				
					if(current_strategy.equals(STRATEGY_SPLITUSERS)){
						if(getAppropriatePolicy(node) != null){							
							PolicyEditor pe = new PolicyEditor(getAppropriatePolicy(node));
							String policyName = getAppropriatePolicy(node).getName();
							if(pe.getPolicyUserByName(getAppropriatePolicy(node).getName(), node) != null){		
								
								// check whether it is a role activation ?
								boolean roleActivation = true;
								// check if it is a role
								if (pe.getPolicyRoleByName(getAppropriatePolicy(node).getName(), compType) == null) {
									roleActivation = false;
								}
								// check if the role is associated to the user
								if (pe.getPolicyUserRoleByName(
										getAppropriatePolicy(node)
												.getName(), node, compType) == null) {
									roleActivation = false;
								}
								// check if the role can be activated
								// TODO smartly
								// activate the role
								if (roleActivation) {
									boolean dsod = true;
										for(Role rr : pe.getPolicyUserByName(policyName, node).getSession().getRoles()){
											dsod = dsod && PolicyChecker.checkDSoD(simulation.policy,rr.getName() ,comp);
										}
										if(dsod){	
											pe.addPolicySessionRole(getAppropriatePolicy(node).getName(), "s" + node, compType);
										}
										else{
	//										System.out.println("dsod violation");
											simulation.kevoreeEditor.removeNodeComponent(node, comp);
										}
								}	
							}
						}
					}
					
					if(current_strategy.equals(STRATEGY_SPLITROLES)){
						if(getAppropriatePolicy(compType) != null){							
							PolicyEditor pe = new PolicyEditor(getAppropriatePolicy(node));
							String policyName = getAppropriatePolicy(node).getName();
							if(pe.getPolicyUserByName(getAppropriatePolicy(node).getName(), node) != null){		
								
								// check whether it is a role activation ?
								boolean roleActivation = true;
								// check if it is a role
								if (pe.getPolicyRoleByName(getAppropriatePolicy(node).getName(), compType) == null) {
									roleActivation = false;
								}
								// check if the role is associated to the user
								if (pe.getPolicyUserRoleByName(
										getAppropriatePolicy(node)
												.getName(), node, compType) == null) {
									roleActivation = false;
								}
								// check if the role can be activated
								// TODO smartly
								// activate the role
								if (roleActivation) {
									boolean dsod = true;
										for(Role rr : pe.getPolicyUserByName(policyName, node).getSession().getRoles()){
											dsod = dsod && PolicyChecker.checkDSoD(simulation.policy,rr.getName() ,comp);
										}
										if(dsod){	
											pe.addPolicySessionRole(getAppropriatePolicy(node).getName(), "s" + node, compType);
										}
										else{
	//										System.out.println("dsod violation");
											simulation.kevoreeEditor.removeNodeComponent(node, comp);
										}
								}	
							}
						}
					}
					
				}

				for (NodeComponentSignature sig : monitorNodeComponent.matchLostEvents) {
					String node = ((ContainerNode) sig.getValueOfN()).getName();
					String comp = ((ComponentInstance) sig.getValueOfC())
							.getName();
				}
				monitorNodeComponent.clear();
			}
		});

		// add remove channels
		channelMatcher.addCallbackAfterUpdates(new Runnable() {
			@Override
			public void run() {
				for (ChannelSignature sig : monitorChannel.matchFoundEvents) {
					String channel = ((Channel) sig.getValueOfCHA()).getName();
//					System.out.println(sig.prettyPrint());
//					simulation.policyTextualEditor.simulationPanel.archiTreeMonitor
//							.addChannel(channel);
				}
				for (ChannelSignature sig : monitorChannel.matchFoundEvents) {
					String channel = ((Channel) sig.getValueOfCHA()).getName();
				}
				monitorChannel.clear();
			}
		});

		// enforced rules
		enforcedRuleMatcher.addCallbackAfterUpdates(new Runnable() {
			@Override
			public void run() {
				for (EnforcedRuleSignature sig : monitorEnforcedRule.matchFoundEvents) {
					String userX = ((ContainerNode) sig.getValueOfN1())
							.getName();
					String operationX = ((Port) sig.getValueOfPORT1())
							.getPortTypeRef().getName();
					String objectX = ((ComponentInstance) sig.getValueOfCOMP2())
							.getName();
					String roleX = ((ComponentInstance) sig.getValueOfCOMP1())
							.getTypeDefinition().getName();
//					System.out.println("number policy rules enforced : "+getPolicyRulesEnforced());
//					simulation.policyTextualEditor.outputEditor.enforcedPolicyRules
//							.updateTable(getPolicyRulesEnforced());
//					simulation.policyTextualEditor.update();
				}
				for (ChannelSignature sig : monitorChannel.matchFoundEvents) {
					String channel = ((Channel) sig.getValueOfCHA()).getName();
				}
				monitorChannel.clear();
			}
		});
	}

	public java.lang.Object[][] getPolicyRulesEnforced() {
		java.lang.Object[][] data = new java.lang.Object[enforcedRuleMatcher
				.getAllMatchesAsSignature().size()][4];
		int cpt = 0;
		for (EnforcedRuleSignature rule : enforcedRuleMatcher
				.getAllMatchesAsSignature()) {
			String userX = ((ContainerNode) rule.getValueOfN1()).getName();
			String operationX = ((Port) rule.getValueOfPORT1())
					.getPortTypeRef().getName();
			String objectX = ((ComponentInstance) rule.getValueOfCOMP2())
					.getName();
			String roleX = ((ComponentInstance) rule.getValueOfCOMP1())
					.getTypeDefinition().getName();
			java.lang.Object[] line = { userX, roleX, operationX, objectX };
			data[cpt] = line;
			cpt = cpt + 1;
		}
		return data;
	}
	
	public Policy getAppropriatePolicy(String name){
		Policy res = null;
		if(current_strategy.equals(STRATEGY_SIMPLE)){
			return simulation.policy;
		}
		if(current_strategy.equals(STRATEGY_SPLITUSERS)){
			if(simulation.policies.get(name) != null)
				return simulation.policies.get(name).fst;
		}
		if(current_strategy.equals(STRATEGY_SPLITROLES)){
			if(simulation.policies.get(name) != null)
				return simulation.policies.get(name).fst;
		}
		return res;
	}
}