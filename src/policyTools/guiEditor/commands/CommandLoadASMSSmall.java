package policyTools.guiEditor.commands;
import policyTools.guiEditor.graphicComponents.PolicyTextualEditor;
import policy.*;
import policyTools.generator.Generator;
import policyTools.guiEditor.controllers.PolicyListener;
public class CommandLoadASMSSmall extends Command{
	
	public CommandLoadASMSSmall(PolicyTextualEditor e, String nme, String desc) {
		super(e, nme, desc);
	}
	@Override
	public void execute() {
		Policy policy = PolicyFactory.eINSTANCE.createPolicy();
		editor.setPolicy(policy);
		editor.policyListener = new PolicyListener(editor);
		editor.policyListener.listen();
		Generator gen = new Generator(policy);
		gen.generateModelExampleASMSvaryUsers(10);
	}

	public void execute(int size) {
		Policy policy = PolicyFactory.eINSTANCE.createPolicy();
		editor.setPolicy(policy);
		editor.policyListener = new PolicyListener(editor);
		editor.policyListener.listen();
		Generator gen = new Generator(policy);
		gen.generateModelExampleASMSvaryUsers(size);
	}
	
}