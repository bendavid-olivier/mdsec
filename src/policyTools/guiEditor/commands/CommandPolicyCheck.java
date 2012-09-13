package policyTools.guiEditor.commands;

import policyTools.checker.PolicyChecker;
import policyTools.guiEditor.graphicComponents.PolicyTextualEditor;

public class CommandPolicyCheck extends Command{
	public CommandPolicyCheck(PolicyTextualEditor e, String nme, String desc) {
		super(e, nme, desc);
	}
		
	public void execute(){
		PolicyChecker pc = new PolicyChecker(editor.getPolicy());
		editor.outputEditor.consoleEditor.print(pc.checkPolicy());
	}
}