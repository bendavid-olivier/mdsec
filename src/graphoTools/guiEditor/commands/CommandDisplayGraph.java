package graphoTools.guiEditor.commands;
import graphoTools.guiEditor.graphicComponents.GraphOTextualEditor;
import javax.swing.Action;
public class CommandDisplayGraph extends Command{
	public CommandDisplayGraph(GraphOTextualEditor e, String nme, String desc) {
		super(e, nme, desc);
	}
	@Override
	public void execute() {
			editor.graphMonitor.update();
			editor.graphMonitor.setVisible(true);
	}
}