package policyTools.guiEditor.commands;

import policyTools.guiEditor.graphicComponents.PolicyTextualEditor;
import policyTools.transformations.Policy2Xacml;

public class CommandPolicy2XACML extends Command{
	public CommandPolicy2XACML(PolicyTextualEditor e, String nme, String desc) {
		super(e, nme, desc);
	}
	@Override
	public void execute() {
		Policy2Xacml trans = new Policy2Xacml(editor.getPolicy());
		trans.transformation(); 
	}  
}