package policyTools.guiEditor.graphicComponents;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

import kevoree.KevoreePackage;
import kevoreeTools.guiEditor.controllers.KevoreeListener;
import kevoreeTools.guiEditor.graphicComponents.FileChooser;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import policy.Policy;
import policyTools.simulation.Simulation;

public class SimulationPanel extends JPanel {

	public Policy policy;
	
	public JPanel buttons;
	public JButton buttonLoadType;
	public JButton buttonSaveKev;
	public JButton buttonListenKev;
	
	
	
	public JPanel changes;
	public JTextField tfAddNode;
	public JButton buttonAddNode;
	
	public JTextField tfAddCompNodName;
	public JTextField tfAddCompTypName;
	public JTextField tfAddCompName;	
	public JButton buttonAddComp;
	
	public JTextField tfAddChannel;
	public JButton buttonAddCha;
	
	
	public JTextField tfAddBindNod;
	public JTextField tfAddBindComp;
	public JTextField tfAddBindPort;
	public JTextField tfAddBindCha;
	public JButton buttonAddBind;
	
	
	public ArchiTreeMonitor archiTreeMonitor;
	
	public PolicyTextualEditor policyTextualEditor ;

	public SimulationPanel(PolicyTextualEditor pe) {
		super();
		setLayout(new BorderLayout());
		policyTextualEditor = pe;
		policy = pe.getPolicy();
		initButtons();
		initChanges();
		archiTreeMonitor = new ArchiTreeMonitor();
		add(buttons,BorderLayout.PAGE_START);
		add(archiTreeMonitor,BorderLayout.LINE_START);
		add(changes,BorderLayout.CENTER);
	}
	

	public void setPolicy(Policy p){
		policy = p;
	}
	
	
	public void initButtons(){
		buttons = new JPanel();	
		
		buttonLoadType = new JButton("load types");
		buttonLoadType.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				policyTextualEditor.simulation.loadTypes();
			}
		});

		buttonSaveKev = new JButton("save kev");
		buttonSaveKev.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ResourceSet resourceSetMetamodel;
				Resource resourceModel;
				resourceSetMetamodel = new ResourceSetImpl();
				resourceSetMetamodel.getPackageRegistry().put(
						KevoreePackage.eNS_URI, KevoreePackage.eINSTANCE);
				resourceSetMetamodel.getResourceFactoryRegistry()
						.getExtensionToFactoryMap()
						.put("xmi", new XMIResourceFactoryImpl());
				FileChooser fc = new FileChooser(null);
				System.out.println(fc.getChooser().getSelectedFile()
						.getAbsolutePath());
				String path = fc.getChooser().getSelectedFile()
						.getAbsolutePath();
				// SAVE THE MODEL
				resourceModel = resourceSetMetamodel.createResource(URI
						.createFileURI(path));
				resourceModel.getContents().add(policyTextualEditor.simulation.kevoree);
				try {
					resourceModel.save(null);
				} catch (IOException err) {
					System.out.println("error during the model saving step");
					err.printStackTrace();
				}
			}
		});
		
		buttonListenKev = new JButton("listen Kev");
		buttonListenKev.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				policyTextualEditor.simulation.kevoreeListener.listen();
			}
		});
		
		
	
		
		buttons.add(buttonLoadType);
		buttons.add(buttonSaveKev);
		buttons.add(buttonListenKev);
		
	}
	
	public void initChanges(){
		changes = new JPanel();
		changes.setLayout(new GridLayout(13, 1));
		
		tfAddNode = new JTextField("nodeName");
		buttonAddNode = new JButton("add node");
		buttonAddNode.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				policyTextualEditor.simulation.editor.addNode(tfAddNode.getText());				
			}
		});
		changes.add(tfAddNode);
		changes.add(buttonAddNode);
		
		
		
		tfAddCompNodName = new JTextField("node name");
		tfAddCompTypName = new JTextField("typ name");
		tfAddCompName = new JTextField("comp name");		
		buttonAddComp = new JButton("add comp");
		buttonAddComp= new JButton("add comp");
		buttonAddComp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				policyTextualEditor.simulation.editor.addNodeComponent(tfAddCompNodName.getText(), tfAddCompName.getText(),tfAddCompTypName.getText());				
			}
		});
		changes.add(tfAddCompNodName);
		changes.add(tfAddCompTypName);
		changes.add(tfAddCompName);
		changes.add(buttonAddComp);
		
		
		
		tfAddChannel = new JTextField("channel name");
		buttonAddCha = new JButton("add channel");
		buttonAddCha.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				policyTextualEditor.simulation.editor.addChannel(tfAddChannel.getText());				
			}
		});
		changes.add(tfAddChannel);
		changes.add(buttonAddCha);
		
		
		tfAddBindNod = new JTextField("node name");
		tfAddBindComp = new JTextField("comp name");
		tfAddBindPort = new JTextField("port name");
		tfAddBindCha = new JTextField("channel name");
		buttonAddBind = new JButton("add binding");
		buttonAddBind.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				policyTextualEditor.simulation.editor.addBinding(tfAddBindNod.getText(), tfAddBindComp.getText(), tfAddBindPort.getText(), tfAddBindCha.getText());				
			}
		});
		changes.add(tfAddBindNod);
		changes.add(tfAddBindComp);
		changes.add(tfAddBindPort);
		changes.add(tfAddBindCha);
		changes.add(buttonAddBind);
		
		
	}


}
