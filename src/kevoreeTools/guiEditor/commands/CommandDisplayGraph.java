package kevoreeTools.guiEditor.commands;
import kevoreeTools.guiEditor.graphicComponents.KevoreeTextualEditor;
import javax.swing.Action;
public class CommandDisplayGraph extends Command{
	public CommandDisplayGraph(KevoreeTextualEditor e, String nme, String desc) {
		super(e, nme, desc);
	}
	@Override
	public void execute() {
			editor.graphMonitor.update();
			editor.graphMonitor.setVisible(true);
	}
}