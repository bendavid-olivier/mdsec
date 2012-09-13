package utils.editorGenerator;

import java.io.File;
import java.util.ArrayList;

import utils.editorGenerator.editorGenerator.EditorGenerator;
import utils.editorGenerator.generatorGenerator.GeneratorGenerator;
import utils.editorGenerator.guiEditorGenerator.CommandGenerator;
import utils.editorGenerator.guiEditorGenerator.GraphicComponentsGenerator;
import utils.editorGenerator.guiEditorGenerator.ControllerGenerator;
import utils.editorGenerator.transformationGenerator.TransfoEditorGenerator;

public class MetaModelToolsGenerator {

	private String name;
	
	public MetaModelToolsGenerator(String s){
		name = s;
	}
	
	public void generate(){
		addPackages();
		addGuiEditor();
		addListeners();
		addCommands();
		addTransfoEditor();		
		addGenerator();
		addEditor();
	}
	
	public void addPackages(){
		String pck = name.toLowerCase();
		ArrayList<String> packages = new ArrayList<String>();
		packages.add("src/"+pck+"Tools");
		packages.add("src/"+pck+"Tools/editor");
		packages.add("src/"+pck+"Tools/generator");
		packages.add("src/"+pck+"Tools/transformations");
		packages.add("src/"+pck+"Tools/guiEditor");
		packages.add("src/"+pck+"Tools/guiEditor/commands");
		packages.add("src/"+pck+"Tools/guiEditor/controllers");
		packages.add("src/"+pck+"Tools/guiEditor/graphicComponents");
		for(String s : packages){
			File f = new File(s);
			f.mkdirs();	
		}	
	}
	
	public void addGuiEditor(){
		GraphicComponentsGenerator gen = new GraphicComponentsGenerator(name);
		gen.addLauncher();
		gen.addTextualEditor();
		gen.addTextPaneEditor();
		gen.addMenuBarEditor();
		gen.addImageComponent();
		gen.addPopupCompletion();
		gen.addGraphMonitor();
		gen.addFileChooser();
		
	}
	
	public void addListeners(){
		ControllerGenerator gen = new ControllerGenerator(name);
		gen.addKeyListener();
		gen.addDocumentListener();
		gen.addModelListener();
	}
	
	public void addCommands(){
		CommandGenerator gen = new CommandGenerator(name);
		gen.addICommand();
		gen.addCommand();
		gen.addCommandCompletion();
		gen.addCommandLoadModelExample();
		gen.addCommandLoadScriptExample();
		gen.addCommandInterpretScript();
		gen.addCommandDisplayGraph();
		gen.addCommandModelListener();
		gen.addCommandSave();
		gen.addCommandLoad();
		gen.addCommandColoration();
	}
	
	
	public void addTransfoEditor(){
		TransfoEditorGenerator gen = new TransfoEditorGenerator(name);
		gen.addModelScript2Model();
		gen.addModel2ModelScript();
		gen.addModel2GraphO();
	}
	
	public void addGenerator(){
		GeneratorGenerator gen = new GeneratorGenerator(name);
		gen.addGenerator();
	}
	
	public void addEditor(){
		EditorGenerator gen = new EditorGenerator(name);
		gen.addEditor();
	}
	
	public static void main(String[] args){
		MetaModelToolsGenerator g = new MetaModelToolsGenerator("GraphO");
		g.generate();
//		g = new MetaModelToolsGenerator("Policy");
//		g.generate();
	}
	
}
