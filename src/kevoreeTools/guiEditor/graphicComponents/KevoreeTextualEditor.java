package kevoreeTools.guiEditor.graphicComponents;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.util.List;
import java.lang.reflect.*;
import kevoree.*;
import kevoreeTools.guiEditor.controllers.*;
import kevoreeTools.guiEditor.commands.*;
import kevoreeTools.editor.KevoreeEditor;

public class KevoreeTextualEditor extends JFrame{
private TextPaneEditor textPaneEditor;
private MenuBarEditor menuBar;
private ContainerRoot kevoree;
private KeyListenerEditor keyListenerEditor;
private DocumentListenerEditor documentListenerEditor;
public KevoreeListener kevoreeListener;
public PopupCompletion popupCompletion;
public GraphMonitor graphMonitor;
public List<String> primitives;

	public KevoreeTextualEditor(){
		kevoree = KevoreeFactory.eINSTANCE.createContainerRoot();
		initGraphicalComponents();
		initControllers();
       initPrimitives();
	}


	public KevoreeTextualEditor(ContainerRoot x) {
		kevoree = x;
		initGraphicalComponents();
		initControllers();
		initPrimitives();
	}


	public void update(){
		graphMonitor.update();
		CommandColoration c= new CommandColoration(this, "coloration", "coloration");
		c.execute();
	}		


	public void initGraphicalComponents(){
		setTitle("KEVOREE Editor ");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		popupCompletion =new PopupCompletion(this);
		textPaneEditor = new TextPaneEditor(this);
		JScrollPane scroll = new JScrollPane();
		Dimension d =new Dimension(600, 400);
		scroll.setSize(d);
		scroll.setPreferredSize(d);
		scroll.setMinimumSize(d);
		setContentPane(scroll);
		scroll.setViewportView(textPaneEditor);
		menuBar = new MenuBarEditor(this);
		setJMenuBar(menuBar);
		graphMonitor = new GraphMonitor(this);
	}


	public void initControllers(){
		kevoreeListener = new KevoreeListener(this);
		keyListenerEditor = new KeyListenerEditor(this);
		documentListenerEditor = new DocumentListenerEditor(this);
		textPaneEditor.addKeyListener(keyListenerEditor);
		textPaneEditor.getDocument().addDocumentListener(documentListenerEditor);
	}


	public void initPrimitives() {
		primitives = new ArrayList<String>();
		for (Method m : KevoreeEditor.class.getDeclaredMethods()){
			primitives.add(m.getName());
		}
	}

	public ContainerRoot getKevoree(){
		return kevoree;
   }
	public void setKevoree(ContainerRoot x){
		kevoree=x;
   }
	public TextPaneEditor getTextPaneEditor() {
		return textPaneEditor;
	}	
	public KevoreeListener getKevoreeListener() {
		return kevoreeListener;
	}
}