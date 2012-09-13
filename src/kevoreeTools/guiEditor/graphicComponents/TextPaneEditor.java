package kevoreeTools.guiEditor.graphicComponents;

import javax.swing.*;

public class TextPaneEditor  extends JTextPane{
private KevoreeTextualEditor parent;

public TextPaneEditor(KevoreeTextualEditor p){
parent = p;
setText("KevoreeScript{\n\n}");
}
}