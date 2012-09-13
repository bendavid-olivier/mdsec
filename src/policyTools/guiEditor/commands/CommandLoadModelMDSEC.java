package policyTools.guiEditor.commands;

import policy.Policy;
import policy.PolicyFactory;
import policyTools.generator.Generator;
import policyTools.guiEditor.controllers.PolicyListener;
import policyTools.guiEditor.graphicComponents.PolicyTextualEditor;
import utils.db.TejDB;

public class CommandLoadModelMDSEC extends Command{
	public CommandLoadModelMDSEC(PolicyTextualEditor e, String nme, String desc) {
		super(e, nme, desc);
	}
	@Override
	public void execute() {
		Policy policy = PolicyFactory.eINSTANCE.createPolicy();
		editor.setPolicy(policy);
		editor.policyListener = new PolicyListener(editor);
		editor.policyListener.listen();
		Generator gen = new Generator(policy);
		gen.generateModelExampleMDSEC();
	}
}