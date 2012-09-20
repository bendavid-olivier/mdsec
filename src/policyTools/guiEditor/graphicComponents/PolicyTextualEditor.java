package policyTools.guiEditor.graphicComponents;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import java.util.*;
import java.util.List;
import java.lang.reflect.*;
import policy.*;
import policyTools.editor.PolicyEditor;
import policyTools.guiEditor.controllers.*;
import policyTools.guiEditor.commands.*;
import policyTools.simulation.Simulation;

public class PolicyTextualEditor extends JFrame{
public TextPaneEditor textPaneEditor;
private MenuBarEditor menuBar;
public Policy policy;
private KeyListenerEditor keyListenerEditor;
private DocumentListenerEditor documentListenerEditor;
public PolicyListener policyListener;
public PopupCompletion popupCompletion;
public GraphMonitor graphMonitor;
public List<String> primitives;
public OutputEditor outputEditor;
public PolicyTreeMonitor policyTreeMonitor;
public ToolBar toolBar;
public Simulation simulation;
public SimulationPanel simulationPanel;
public PolicyEditor policyEditor;


	public PolicyTextualEditor(){
		policy = PolicyFactory.eINSTANCE.createPolicy();
		policyEditor = new PolicyEditor(policy);	
		initGraphicalComponents();
		initControllers();
		initPrimitives();
		initOthers();
	}
	
	public PolicyTextualEditor(boolean display){
		policy = PolicyFactory.eINSTANCE.createPolicy();
		policyEditor = new PolicyEditor(policy);
		if(display){
			initGraphicalComponents();
			initPrimitives();	
		}
		initControllers(display);	
		initOthers();
	}

	public PolicyTextualEditor(Policy x) {
		policy = x;
		policyEditor = new PolicyEditor(policy);
		initGraphicalComponents();
		initControllers();
		initPrimitives();
		initOthers();
	}

	public void update(){
//		graphMonitor.update();
//		graphMonitor.setVisible(true);
//		CommandColoration c = new CommandColoration(this, "coloration", "coloration");
//		c.execute();
//		simulationPanel.setPolicy(policy);
		policyEditor = new PolicyEditor(policy);
	}		

	
	public void initOthers(){
//		simulation = new Simulation(this);
	}
	
	public void initGraphicalComponents(){
		setTitle("POLICY Editor ");
		setSize(1200, 700);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		popupCompletion =new PopupCompletion(this);
		textPaneEditor = new TextPaneEditor(this);
		outputEditor = new OutputEditor();
		policyTreeMonitor = new PolicyTreeMonitor();
		toolBar = new ToolBar(this);
		simulationPanel = new SimulationPanel(this);
		
		JScrollPane scroll = new JScrollPane();
		Dimension d =new Dimension(400, 300);
		scroll.setSize(d);
		scroll.setPreferredSize(d);
		scroll.setMinimumSize(d);
		scroll.setViewportView(textPaneEditor);
		
		panel.add(toolBar, BorderLayout.PAGE_START);
		panel.add(policyTreeMonitor, BorderLayout.LINE_START);
		panel.add(scroll, BorderLayout.CENTER);	
		
		panel.add(simulationPanel, BorderLayout.LINE_END);
		panel.add(outputEditor, BorderLayout.PAGE_END);
		
		setContentPane(panel);
		
		menuBar = new MenuBarEditor(this);
		setJMenuBar(menuBar);
		graphMonitor = new GraphMonitor(this);
	}


	public void initControllers(){
		policyListener = new PolicyListener(this);
		keyListenerEditor = new KeyListenerEditor(this);
		documentListenerEditor = new DocumentListenerEditor(this);
		textPaneEditor.addKeyListener(keyListenerEditor);
		textPaneEditor.getDocument().addDocumentListener(documentListenerEditor);
	}

	
	public void initControllers(boolean display){
		if(! display){
			policyListener = new PolicyListener(this);
		}
		//keyListenerEditor = new KeyListenerEditor(this);
		//documentListenerEditor = new DocumentListenerEditor(this);
		//textPaneEditor.addKeyListener(keyListenerEditor);
		//textPaneEditor.getDocument().addDocumentListener(documentListenerEditor);
	}
	
	
	public void initPrimitives() {
		primitives = new ArrayList<String>();
		for (Method m : PolicyEditor.class.getDeclaredMethods()){
			primitives.add(m.getName());
		}
	}

	
	public Policy getPolicy(){
		return policy;
	}
	
	
	public void setPolicy(Policy x){
		policy=x;
	}
	
	
	public TextPaneEditor getTextPaneEditor() {
		return textPaneEditor;
	}	
	

	public PolicyListener getPolicyListener() {
		return policyListener;
	}

}