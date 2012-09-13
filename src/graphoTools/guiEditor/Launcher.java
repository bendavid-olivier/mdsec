package graphoTools.guiEditor;

import graphoTools.guiEditor.graphicComponents.GraphOTextualEditor;
import grapho.*;

public class Launcher{
	private GraphOTextualEditor editor;
	public Launcher(GraphO x){
		editor = new GraphOTextualEditor(x);
	}
	public void start(){
		editor.setVisible(true);
	}
public static void main(String[] args) {
GraphOTextualEditor editor = new GraphOTextualEditor();
editor.setVisible(true);
editor.update();
}
}