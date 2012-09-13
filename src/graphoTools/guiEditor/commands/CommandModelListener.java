package graphoTools.guiEditor.commands;
import graphoTools.guiEditor.graphicComponents.GraphOTextualEditor;
import javax.swing.Action;
public class CommandModelListener extends Command{
	public CommandModelListener(GraphOTextualEditor e, String nme, String desc) {
		super(e, nme, desc);
	}
	@Override
	public void execute() {
			editor.getGraphOListener().listen();
	 }
}