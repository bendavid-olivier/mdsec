package policyTools.guiEditor.commands;
import policyTools.guiEditor.graphicComponents.PolicyTextualEditor;
import javax.swing.Action;
public class CommandDisplayGraph extends Command{
	public CommandDisplayGraph(PolicyTextualEditor e, String nme, String desc) {
		super(e, nme, desc);
	}
	@Override
	public void execute() {
			editor.graphMonitor.update();
			editor.graphMonitor.setVisible(true);
	}
}