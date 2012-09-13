package graphoTools.guiEditor.graphicComponents;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.util.List;
import java.lang.reflect.*;
import grapho.*;
import graphoTools.guiEditor.controllers.*;
import graphoTools.guiEditor.commands.*;
import graphoTools.editor.GraphOEditor;

public class GraphOTextualEditor extends JFrame{
private TextPaneEditor textPaneEditor;
private MenuBarEditor menuBar;
private GraphO grapho;
private KeyListenerEditor keyListenerEditor;
private DocumentListenerEditor documentListenerEditor;
public GraphOListener graphoListener;
public PopupCompletion popupCompletion;
public GraphMonitor graphMonitor;
public List<String> primitives;

	public GraphOTextualEditor(){
		grapho = GraphoFactory.eINSTANCE.createGraphO();
		initGraphicalComponents();
		initControllers();
       initPrimitives();
	}


	public GraphOTextualEditor(GraphO x) {
		grapho = x;
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
		setTitle("GRAPHO Editor ");
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
		graphoListener = new GraphOListener(this);
		keyListenerEditor = new KeyListenerEditor(this);
		documentListenerEditor = new DocumentListenerEditor(this);
		textPaneEditor.addKeyListener(keyListenerEditor);
		textPaneEditor.getDocument().addDocumentListener(documentListenerEditor);
	}


	public void initPrimitives() {
		primitives = new ArrayList<String>();
		for (Method m : GraphOEditor.class.getDeclaredMethods()){
			primitives.add(m.getName());
		}
	}

	public GraphO getGraphO(){
		return grapho;
   }
	public void setGraphO(GraphO x){
		grapho=x;
   }
	public TextPaneEditor getTextPaneEditor() {
		return textPaneEditor;
	}	
	public GraphOListener getGraphOListener() {
		return graphoListener;
	}
}