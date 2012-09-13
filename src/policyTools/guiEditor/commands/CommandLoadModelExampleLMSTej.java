package policyTools.guiEditor.commands;
import policyTools.guiEditor.controllers.PolicyListener;
import policyTools.guiEditor.graphicComponents.PolicyTextualEditor;
import utils.db.TejDB;

public class CommandLoadModelExampleLMSTej extends Command{
	public CommandLoadModelExampleLMSTej(PolicyTextualEditor e, String nme, String desc) {
		super(e, nme, desc);
	}
	@Override
	public void execute() {
//		Policy policy = PolicyFactory.eINSTANCE.createPolicy();
//		editor.setPolicy(policy);
//		editor.policyListener = new PolicyListener(editor);
//		editor.policyListener.listen();
//		Generator gen = new Generator(policy);
//		gen.generateModelExampleLMSTej();
		
		TejDB tejDB = new TejDB();
		editor.setPolicy(tejDB.getLMSUsers());
		editor.policyListener = new PolicyListener(editor);
		editor.policyListener.listen();
		editor.update();
	}
}