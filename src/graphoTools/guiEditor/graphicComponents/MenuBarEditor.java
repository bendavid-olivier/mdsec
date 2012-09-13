package graphoTools.guiEditor.graphicComponents;

import javax.swing.*;
import graphoTools.guiEditor.commands.*;

public class MenuBarEditor  extends JMenuBar{
private JMenu menuFile;
private JMenu menuRun;
private JMenu menuTools;
private JMenu menuViews;
private JMenu menuHelp;
private GraphOTextualEditor editor;
public MenuBarEditor(GraphOTextualEditor e){
	editor = e;
menuFile = new JMenu("File");
menuRun = new JMenu("Run");
menuTools = new JMenu("Tools");
menuViews = new JMenu("Views");
menuHelp = new JMenu("Help");
JMenuItem ml = new JMenuItem("load");
ml.setAction(new CommandLoad(editor, "load", "load"));
ml.setText("load");
ml.setName("load");
ml.setVisible(true);
menuFile.add(ml);
JMenuItem ms = new JMenuItem("save");
ms.setAction(new CommandSave(editor, "save", "save"));
ms.setText("save");
ms.setName("save");
ms.setVisible(true);
menuFile.add(ms);

JMenuItem m2 = new JMenuItem("interpret");
m2.setAction(new CommandInterpretScript(editor, "interpret", "interpret"));
m2.setText("interpret");
m2.setName("interpret");
m2.setVisible(true);
menuRun.add(m2);


JMenuItem m = new JMenuItem("loadModelExample");
m.setAction(new CommandLoadModelExample(editor, "loadModelExample", "loadModelExample"));
m.setText("loadModelExample");
m.setName("loadModelExample");
m.setVisible(true);
menuTools.add(m);


JMenuItem m1 = new JMenuItem("loadScriptExample");
m1.setAction(new CommandLoadScriptExample(editor, "loadScriptExample", "loadScriptExample"));
m1.setText("loadScriptExample");
m1.setName("loadScriptExample");
m1.setVisible(true);
menuTools.add(m1);

JMenuItem menuMl = new JMenuItem("listenModel");
menuMl.setAction(new CommandModelListener(editor, "listenModel", "listenModel"));
menuMl.setText("listenModel");
menuMl.setName("listenModel");
menuMl.setVisible(true);
menuTools.add(menuMl);

JMenuItem m3 = new JMenuItem("displayGraph");
m3.setAction(new CommandDisplayGraph(editor, "displayGraph", "displayGraph"));
m3.setText("displayGraph");
m3.setName("displayGraph");
m3.setVisible(true);
menuViews.add(m3);

add(menuFile);
add(menuRun);
add(menuTools);
add(menuViews);
add(menuHelp);
}
}