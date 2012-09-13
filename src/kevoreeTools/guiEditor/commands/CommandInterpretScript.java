package kevoreeTools.guiEditor.commands;
import kevoreeTools.guiEditor.graphicComponents.KevoreeTextualEditor;
import kevoree.*;
import kevoreeTools.generator.Generator;
import kevoreeTools.transformations.Kevoree2KevoreeScript;
import kevoreeTools.transformations.KevoreeScript2Kevoree;
import javax.swing.Action;
public class CommandInterpretScript extends Command{
	public CommandInterpretScript(KevoreeTextualEditor e, String nme, String desc) {
		super(e, nme, desc);
	}
	@Override
	public void execute() {
			KevoreeScript2Kevoree transfo = new KevoreeScript2Kevoree(editor.getTextPaneEditor().getText());
			transfo.transformation(editor.getKevoree());
			editor.getTextPaneEditor().setText("KevoreeScript{\n\n}");
	}
}