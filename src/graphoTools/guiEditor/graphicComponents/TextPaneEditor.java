package graphoTools.guiEditor.graphicComponents;

import javax.swing.*;

public class TextPaneEditor  extends JTextPane{
private GraphOTextualEditor parent;

public TextPaneEditor(GraphOTextualEditor p){
parent = p;
setText("GraphOScript{\n\n}");
}
}