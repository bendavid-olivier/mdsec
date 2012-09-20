package kevoreeTools.guiEditor;

import kevoreeTools.guiEditor.graphicComponents.KevoreeTextualEditor;
import kevoree.*;

public class Launcher{
	private KevoreeTextualEditor editor;
	public Launcher(ContainerRoot x){
		editor = new KevoreeTextualEditor(x);
	}
	public void start(){
		editor.setVisible(true);
	}
public static void main(String[] args) { 
KevoreeTextualEditor editor = new KevoreeTextualEditor();
editor.setVisible(true);
editor.update();
}
}