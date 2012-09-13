package kevoreeTools.guiEditor.commands;
import kevoreeTools.guiEditor.graphicComponents.KevoreeTextualEditor;
import javax.swing.Action;
public class CommandModelListener extends Command{
	public CommandModelListener(KevoreeTextualEditor e, String nme, String desc) {
		super(e, nme, desc);
	}
	@Override
	public void execute() {
			editor.getKevoreeListener().listen();
	 }
}