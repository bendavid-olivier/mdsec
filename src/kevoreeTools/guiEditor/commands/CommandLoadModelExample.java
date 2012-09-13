package kevoreeTools.guiEditor.commands;
import kevoreeTools.guiEditor.graphicComponents.KevoreeTextualEditor;
import kevoree.*;
import kevoreeTools.generator.Generator;
import kevoreeTools.guiEditor.controllers.KevoreeListener;
public class CommandLoadModelExample extends Command{
	
	public CommandLoadModelExample(KevoreeTextualEditor e, String nme, String desc) {
		super(e, nme, desc);
	}
	
	@Override
	public void execute() {
		ContainerRoot kevoree = KevoreeFactory.eINSTANCE.createContainerRoot();
		editor.setKevoree(kevoree);
		editor.kevoreeListener = new KevoreeListener(editor);
		editor.kevoreeListener.listen();
		Generator gen = new Generator(kevoree);
		gen.generateModelExample();
	}
}