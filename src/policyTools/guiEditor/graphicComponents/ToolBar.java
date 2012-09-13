package policyTools.guiEditor.graphicComponents;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

import policyTools.guiEditor.commands.CommandExportPolicyPDF;
import policyTools.guiEditor.commands.CommandInterpretScript;
import policyTools.guiEditor.commands.CommandLoad;
import policyTools.guiEditor.commands.CommandLoadModelExample;
import policyTools.guiEditor.commands.CommandModelListener;
import policyTools.guiEditor.commands.CommandPolicyCheck;
import policyTools.guiEditor.commands.CommandSave;
import policyTools.guiEditor.commands.CommandSimulation;

public class ToolBar extends JPanel{
	
	private JButton load;
	private JButton loadExample;
	private JButton save;
	
	private JButton interpret;
	
	private JButton listenPolicy;
	private JButton checkPolicy;
	
	private JButton exportPDF;
	private PolicyTextualEditor editor;
	
	private JButton launchSimulation;

	public ToolBar (PolicyTextualEditor e){
		Dimension d = new Dimension(600, 100); 
		setSize(d);
		setMaximumSize(d);
		setMinimumSize(d);
		setPreferredSize(d);
		setBackground(Color.BLACK);
		editor = e;
		
		initButtons();
		addButtons();
	}
	
	public void initButtons(){
		load = new JButton("load policy");
		load.setAction(new CommandLoad(editor, "load", "load"));
		load.setText("load policy");
		loadExample = new JButton("load policy example");
		loadExample.setAction(new CommandLoadModelExample(editor, "load policy example", "load policy example"));
		loadExample.setText("load policy example");
		
		save = new JButton("save policy");
		save.setAction(new CommandSave(editor, "save policy", "save policy"));
		save.setText("save policy");
		
		interpret = new JButton("interpret policy script");
		interpret.setAction(new CommandInterpretScript(editor, "interpret", "interpret"));
		interpret.setText("interpret");
		
		listenPolicy = new JButton("listen policy");
		listenPolicy.setAction(new CommandModelListener(editor, "listen policy", "listen policy"));
		listenPolicy.setText("listen policy");
		
		checkPolicy = new JButton("check policy");
		checkPolicy.setAction(new CommandPolicyCheck(editor, "check policy", "check policy"));
		checkPolicy.setText("check policy");
		
		exportPDF = new JButton("export PDF policy");
		exportPDF.setAction(new CommandExportPolicyPDF(editor, "export PDF policy", "export PDF policy"));
		exportPDF.setText("export PDF policy");
		
		launchSimulation = new JButton("simulation");
		launchSimulation.setAction(new CommandSimulation(editor, "simulation", "simulation"));
		launchSimulation.setText("simulation");
	}
	
	
	public void addButtons(){
		add(load);
		add(loadExample);
		add(save);
		add(interpret);
		add(listenPolicy);
		add(checkPolicy);
		add(exportPDF);
		add(launchSimulation);
	}
	
}
