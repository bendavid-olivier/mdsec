package policyTools.guiEditor.graphicComponents;

import javax.swing.*;

public class TextPaneEditor  extends JTextPane{
private PolicyTextualEditor parent;

public TextPaneEditor(PolicyTextualEditor p){
parent = p;
setText("PolicyScript{\n\n}");
}
}