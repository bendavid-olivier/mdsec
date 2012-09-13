package graphoTools.guiEditor.commands;
import graphoTools.guiEditor.graphicComponents.GraphOTextualEditor;
import grapho.*;
import graphoTools.generator.Generator;
import graphoTools.guiEditor.controllers.GraphOListener;
public class CommandLoadModelExample extends Command{
	public CommandLoadModelExample(GraphOTextualEditor e, String nme, String desc) {
		super(e, nme, desc);
	}
	@Override
	public void execute() {
		GraphO grapho = GraphoFactory.eINSTANCE.createGraphO();
		editor.setGraphO(grapho);
		editor.graphoListener = new GraphOListener(editor);
		editor.graphoListener.listen();
		Generator gen = new Generator(grapho);
		gen.generateModelExample();

	}
}