package graphoTools.guiEditor.commands;
import graphoTools.guiEditor.graphicComponents.GraphOTextualEditor;
import grapho.*;
import graphoTools.generator.Generator;
import graphoTools.transformations.GraphO2GraphOScript;
import graphoTools.transformations.GraphOScript2GraphO;
import javax.swing.Action;
public class CommandInterpretScript extends Command{
	public CommandInterpretScript(GraphOTextualEditor e, String nme, String desc) {
		super(e, nme, desc);
	}
	@Override
	public void execute() {
			GraphOScript2GraphO transfo = new GraphOScript2GraphO(editor.getTextPaneEditor().getText());
			transfo.transformation(editor.getGraphO());
			editor.getTextPaneEditor().setText("GraphOScript{\n\n}");
	}
}