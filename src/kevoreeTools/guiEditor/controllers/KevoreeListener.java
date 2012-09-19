package kevoreeTools.guiEditor.controllers;

import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.BuilderRegistry;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.misc.DeltaMonitor;
import patternmatchers.kevoree.*;
import policyTools.editor.PolicyEditor;
import policyTools.simulation.Simulation;
import policyTools.simulation.SimulationSplit;
import signatures.kevoree.*;
import kevoree.*;
import kevoreeTools.guiEditor.graphicComponents.*;

public class KevoreeListener {

	private KevoreeTextualEditor editor;
	private ContainerRoot kevoree;
	private SimulationSplit simulation;

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

	public KevoreeListener(Simulation k) {
		kevoree = k.kevoree;
		registerLiteners();
//		simulation = k;
		initMatchers();
		monitorNode = nodeMatcher.newDeltaMonitor(false);
		monitorNodeComponent = nodeComponentMatcher.newDeltaMonitor(false);
		monitorChannel = channelMatcher.newDeltaMonitor(false);
		monitorEnforcedRule = enforcedRuleMatcher.newDeltaMonitor(false);
	}
	
	public KevoreeListener(SimulationSplit k) {
		kevoree = k.kevoree;
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
					//System.out.println("detection of the addition of a node : "+node);
					// check whether it is a new user ?
					// if yes then create a session
					if(simulation.policies.containsKey(node)){
//						PolicyEditor pe = new PolicyEditor(
//								simulation.policy);
						PolicyEditor pe = new PolicyEditor(
								simulation.policies.get(node).fst);
//						if (pe.getPolicyUserByName(simulation.policy.getName(), node) != null) {
//							pe.setPolicyUserSession(simulation.policy.getName(), node, "s" + node);
//						}
						System.out.println("add session in : "+simulation.policies.get(node).fst.getName());
						pe.setPolicyUserSession(simulation.policies.get(node).fst.getName(), node, "s" + node);
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
					
					if(simulation.policies.containsKey(node)){
						PolicyEditor pe = new PolicyEditor(
								simulation.policies.get(node).fst);
						// check whether it is a role activation ?
						boolean roleActivation = true;
						// check if it is a role
						if (pe.getPolicyRoleByName(simulation.policies.get(node).fst.getName(), compType) == null) {
							roleActivation = false;
						}
						// check if the role is associated to the user
						if (pe.getPolicyUserRoleByName(
								simulation.policies.get(node).fst
										.getName(), node, compType) == null) {
							roleActivation = false;
						}
						// check if the role can be activated
						// TODO smartly
						// activate the role
						if (roleActivation) {
							pe.addPolicySessionRole(simulation.policies.get(node).fst.getName(), "s" + node, compType);
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
}