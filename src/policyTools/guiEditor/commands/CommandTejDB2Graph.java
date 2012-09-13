package policyTools.guiEditor.commands;

import policyTools.guiEditor.graphicComponents.PolicyTextualEditor;

public class CommandTejDB2Graph extends Command{
	
	public CommandTejDB2Graph(PolicyTextualEditor e, String nme, String desc) {
		super(e, nme, desc);
	}
	
	
	
	@Override
	public void execute() {
			editor.graphMonitor.update();
			editor.graphMonitor.setVisible(true);
	}
}