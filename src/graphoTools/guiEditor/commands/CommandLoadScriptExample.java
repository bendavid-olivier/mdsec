package graphoTools.guiEditor.commands;
import graphoTools.guiEditor.graphicComponents.GraphOTextualEditor;
import grapho.*;
import graphoTools.generator.Generator;
import graphoTools.transformations.GraphO2GraphOScript;
public class CommandLoadScriptExample extends Command{
	public CommandLoadScriptExample(GraphOTextualEditor e, String nme, String desc) {
		super(e, nme, desc);
	}
	@Override
	public void execute() {
		GraphO grapho = GraphoFactory.eINSTANCE.createGraphO();
		Generator gen = new Generator(grapho);
		gen.generateModelExample();
		GraphO2GraphOScript t=new GraphO2GraphOScript(grapho);
       String script = "GraphOScript{\n";
       script = script + t.transformation();
       script = script + "}";
		editor.getTextPaneEditor().setText(script);
	}
}