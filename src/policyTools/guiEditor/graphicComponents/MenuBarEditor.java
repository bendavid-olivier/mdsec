package policyTools.guiEditor.graphicComponents;

import javax.swing.*;

import policyTools.guiEditor.commands.*;

public class MenuBarEditor  extends JMenuBar{
private JMenu menuFile;
private JMenu menuRun;
private JMenu menuTools;
private JMenu menuViews;
private JMenu menuHelp;
private PolicyTextualEditor editor;
public MenuBarEditor(PolicyTextualEditor e){
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

JMenuItem lmdsec = new JMenuItem("loadModelMDSEC");
lmdsec.setAction(new CommandLoadModelMDSEC(editor, "loadModelMDSEC", "loadModelMDSEC"));
lmdsec.setText("loadModelMDSEC");
lmdsec.setName("loadModelMDSEC");
lmdsec.setVisible(true);
menuTools.add(lmdsec);

JMenuItem mLMS = new JMenuItem("loadModelLMSTej");
mLMS.setAction(new CommandLoadModelExampleLMSTej(editor, "loadModelLMSTej", "loadModelLMSTej"));
mLMS.setText("loadModelLMSTej");
mLMS.setName("loadModelLMSTej");
mLMS.setVisible(true);
menuTools.add(mLMS);

menuTools.addSeparator();

JMenuItem m1 = new JMenuItem("loadScriptExample");
m1.setAction(new CommandLoadScriptExample(editor, "loadScriptExample", "loadScriptExample"));
m1.setText("loadScriptExample");
m1.setName("loadScriptExample");
m1.setVisible(true);
menuTools.add(m1);

menuTools.addSeparator();

JMenuItem menuMl = new JMenuItem("listenModel");
menuMl.setAction(new CommandModelListener(editor, "listenModel", "listenModel"));
menuMl.setText("listenModel");
menuMl.setName("listenModel");
menuMl.setVisible(true);
menuTools.add(menuMl);

menuTools.addSeparator();

JMenuItem mX = new JMenuItem("generateXacmlFile");
mX.setAction(new CommandPolicy2XACML(editor, "generateXacmlFile", "generateXacmlFile"));
mX.setText("generateXacmlFile");
mX.setName("generateXacmlFile");
mX.setVisible(true);
menuTools.add(mX);

JMenuItem menuIncEnfKev = new JMenuItem("incEnfKev");
menuIncEnfKev.setAction(new CommandIncEnfKev(editor, "incEnfKev", "incEnfKev"));
menuIncEnfKev.setText("incEnfKev");
menuIncEnfKev.setName("incEnfKev");
menuIncEnfKev.setVisible(true);
menuTools.add(menuIncEnfKev);

JMenuItem menuIncEnfXACML = new JMenuItem("incEnfXACML");
menuIncEnfXACML.setAction(new CommandIncEnfXACML(editor, "incEnfXACML", "incEnfXACML"));
menuIncEnfXACML.setText("incEnfXACML");
menuIncEnfXACML.setName("incEnfXACML");
menuIncEnfXACML.setVisible(true);
menuTools.add(menuIncEnfXACML);


menuTools.addSeparator();

JMenuItem menuChecker = new JMenuItem("check policy");
menuChecker.setAction(new CommandPolicyCheck(editor, "check policy", "check policy"));
menuChecker.setText("check policy");
menuChecker.setName("check policy");
menuChecker.setVisible(true);
menuTools.add(menuChecker);


JMenuItem m3 = new JMenuItem("displayGraph");
m3.setAction(new CommandDisplayGraph(editor, "displayGraph", "displayGraph"));
m3.setText("displayGraph");
m3.setName("displayGraph");
m3.setVisible(true);
menuViews.add(m3);

menuViews.addSeparator();

JMenuItem mExpPDF = new JMenuItem("exportPolicyPDf");
mExpPDF.setAction(new CommandExportPolicyPDF(editor, "exportPolicyPDf", "exportPolicyPDf"));
mExpPDF.setText("exportPolicyPDf");
mExpPDF.setName("exportPolicyPDf");
mExpPDF.setVisible(true);
menuViews.add(mExpPDF);

JMenuItem mExpPrulesPDF = new JMenuItem("exportPolicyRulesPDf");
mExpPrulesPDF.setAction(new CommandExportPolicyRulesPDF(editor, "exportPolicyRulesPDf", "exportPolicyRulesPDf"));
mExpPrulesPDF.setText("exportPolicyRulesPDf");
mExpPrulesPDF.setName("exportPolicyRulesPDf");
mExpPrulesPDF.setVisible(true);
menuViews.add(mExpPrulesPDF);

add(menuFile);
add(menuRun);
add(menuTools);
add(menuViews);
add(menuHelp);
}
}