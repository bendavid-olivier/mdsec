package policyTools.guiEditor.commands;
import policyTools.guiEditor.graphicComponents.PolicyTextualEditor;
import policy.*;
import policyTools.generator.Generator;
import policyTools.transformations.Policy2PolicyScript;
public class CommandLoadScriptExample extends Command{
	public CommandLoadScriptExample(PolicyTextualEditor e, String nme, String desc) {
		super(e, nme, desc);
	}
	@Override
	public void execute() {
		Policy policy = PolicyFactory.eINSTANCE.createPolicy();
		Generator gen = new Generator(policy);
		gen.generateModelExample();
		Policy2PolicyScript t=new Policy2PolicyScript(policy);
       String script = "PolicyScript{\n";
       script = script + t.transformation();
       script = script + "}";
		editor.getTextPaneEditor().setText(script);
	}
}