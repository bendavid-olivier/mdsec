package policyTools.guiEditor.commands;
import policyTools.guiEditor.graphicComponents.PolicyTextualEditor;
import javax.swing.Action;
public class CommandModelListener extends Command{
	public CommandModelListener(PolicyTextualEditor e, String nme, String desc) {
		super(e, nme, desc);
	}
	@Override
	public void execute() {
			editor.getPolicyListener().listen();
	 }
}