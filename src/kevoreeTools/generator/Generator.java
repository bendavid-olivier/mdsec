package kevoreeTools.generator;
import kevoree.*;
import kevoreeTools.editor.KevoreeEditor;


public class Generator{
	private ContainerRoot kevoree;
	private KevoreeEditor editor;
	
	public Generator(ContainerRoot x) {
		kevoree = x;
		editor = new KevoreeEditor(kevoree);
	}
	public void generateModelExample() {
		editor.addNode("test");
		editor.addNodeComponent("test", "cp", "COMP");
		editor.addChannel("chacha");
		editor.addNode("test2");
		editor.addNodeComponent("test2", "cp2", "COMP");
		editor.addBinding("test", "cp", "PTP", "chacha");
		editor.addBinding("test2", "cp2", "PTR", "chacha");
		
	}
}