package utils.editorGenerator.guiEditorGenerator;

import java.io.File;
import java.io.IOException;


import utils.writer.FileWriterO;

public class CommandGenerator {

	private String name;

	public CommandGenerator(String x) {
		name = x;
	}

	public void addICommand() {
		String packName = name.toLowerCase() + "Tools.guiEditor.commands";
		String className = "ICommand";
		File f = new File("src/" + name.toLowerCase() + "Tools/guiEditor"
				+ "/commands/" + className + ".java");

		String content = "package " + packName + ";" + "\n"
				+ "public interface ICommand{" + "\n" + "	void execute();"
				+ "\n" + "}";

		FileWriterO fw = new FileWriterO();

		System.out.println(f.getAbsolutePath());
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fw.writeStringOnFile(content, f.getAbsolutePath());
	}

	public void addCommand() {
		String packName = name.toLowerCase() + "Tools.guiEditor.commands";
		String className = "Command";
		File f = new File("src/" + name.toLowerCase() + "Tools/guiEditor"
				+ "/commands/" + className + ".java");

		String content = "package "
				+ packName
				+ ";"
				+ "\n"
				+ "import javax.swing.Action;"
				+ "\n"
				+ "import java.awt.event.ActionEvent;"
				+ "\n"
				+ "import java.beans.PropertyChangeListener;"
				+ "\n"
				+ "import "
				+ name.toLowerCase()
				+ "Tools.guiEditor.graphicComponents."
				+ name
				+ "TextualEditor;"
				+ "\n"
				+ "public class Command implements ICommand,Action{"
				+ "\n"
				+ "private String name, description;"
				+ "\n"
				+

				"public "
				+ name
				+ "TextualEditor editor;"
				+ "\n"
				+

				"	public Command("
				+ name
				+ "TextualEditor e,String nme,String desc){"
				+ "\n"
				+ "		editor = e;"
				+ "\n"
				+ "		name = nme;"
				+ "\n"
				+ "		description= desc;	"
				+ "\n"
				+ "	}"
				+ "\n"
				+

				"public String getDescription() {"
				+ "\n"
				+ "	return description;"
				+ "\n"
				+ "}"
				+ "\n"
				+

				"public void setDescription(String description) {"
				+ "\n"
				+ "	this.description = description;"
				+ "\n"
				+ "}"
				+ "\n"
				+

				"public String getName() {"
				+ "\n"
				+ "	return name;"
				+ "\n"
				+ "}"
				+ "\n"
				+

				"public void setName(String name) {"
				+ "\n"
				+ "	this.name = name;"
				+ "\n"
				+ "}"
				+ "\n"
				+

				"@Override"
				+ "\n"
				+ "public void addPropertyChangeListener(PropertyChangeListener arg0) {"
				+ "\n"
				+

				"}"
				+ "\n"
				+

				"@Override"
				+ "\n"
				+ "public Object getValue(String arg0) {"
				+ "\n"
				+ "	return null;"
				+ "\n"
				+ "}"
				+ "\n"
				+

				"@Override"
				+ "\n"
				+ "public boolean isEnabled() {"
				+ "\n"
				+ "	return true;"
				+ "\n"
				+ "}"
				+ "\n"
				+

				"@Override"
				+ "\n"
				+ "public void putValue(String arg0, Object arg1) {"
				+ "\n"
				+

				"}"
				+ "\n"
				+

				"@Override"
				+ "\n"
				+ "public void removePropertyChangeListener(PropertyChangeListener arg0) {"
				+ "\n" + "	// TODO Auto-generated method stub" + "\n" +

				"}" + "\n" +

				"@Override" + "\n" + "public void setEnabled(boolean arg0) {"
				+ "\n" + "	// TODO Auto-generated method stub" + "\n" +

				"}" + "\n" +

				"@Override" + "\n"
				+ "public void actionPerformed(ActionEvent arg0) {" + "\n"
				+ "	execute();" + "\n" +

				"}" + "\n" +

				"@Override" + "\n" + "public void execute() {" + "\n"
				+ "	// TODO Auto-generated method stub" + "\n" +

				"}" + "\n" + "}";

		FileWriterO fw = new FileWriterO();

		System.out.println(f.getAbsolutePath());
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fw.writeStringOnFile(content, f.getAbsolutePath());
	}

	public void addCommandCompletion() {
		String packName = name.toLowerCase() + "Tools.guiEditor.commands";
		String className = "CommandCompletion";
		File f = new File("src/" + name.toLowerCase() + "Tools/guiEditor"
				+ "/commands/" + className + ".java");

		String content = "package "
				+ packName
				+ ";"
				+ "\n"
				+ "import "
				+ name.toLowerCase()
				+ "Tools.guiEditor.graphicComponents."
				+ name
				+ "TextualEditor;"
				+ "\n"
				
				+ "import javax.swing.text.BadLocationException;"
				+ "\n"
				
				+ "import "+name.toLowerCase()+"Tools.editor."+name+"Editor;"
				+ "\n"
				
//				+ "import "
//				+ name.toLowerCase()
//				+ "."
//				+ name
//				+ "Editor;"
//				+ "\n"
				
				
				+ "import java.lang.reflect.*;"
				+ "\n"
				
				+ "public class "
				+ className
				+ " extends Command{"
				+ "\n"
				
				+ "	public CommandCompletion("
				+ name
				+ "TextualEditor e, String nme, String desc) {"
				+ "\n"
				+ "		super(e, nme, desc);"
				+ "\n"
				+ "	}"
				+ "\n"
				+ "	@Override"
				+ "\n"
				+ "	public void execute() {"
				+ "\n"
				+ "		//to insert the selected string into the document"
				+ "\n"
				+ "		int pos =editor.getTextPaneEditor().getCaretPosition() -1;"
				+ "\n"
				+ "		String content = null;"
				+ "\n"
				+ "		try {"
				+ "\n"
				+ "			content = editor.getTextPaneEditor().getText(0, pos + 1);"
				+ "\n"
				+ "		} catch (BadLocationException e) {"
				+ "\n"
				+ "			e.printStackTrace();"
				+ "\n"
				+ "		}"
				+ "\n"
				+ "		int w;"
				+ "\n"
				+ "		for (w = pos; w >= 0; w--) {"
				+ "\n"
				+ "			if (!Character.isLetter(content.charAt(w))) {"
				+ "\n"
				+ "				break;"
				+ "\n"
				+ "			}"
				+ "\n"
				+ "		}"
				+ "\n"
				+ "		String prefix = content.substring(w + 1).toLowerCase();"
				+ "\n"
				+ "		try {	"
				+ "\n"
				+ "			String toInsert = getName().substring(prefix.length(),getName().length());"
				+ "\n"
				+

				"			String[] args = null;"
				+ "\n"
				+ "			for(Method m : "
				+ name
				+ "Editor.class.getMethods()){"
				+ "\n"
				+ "				if (m.getName().equals(getName())){"
				+ "\n"
				+ "					if(!(m.getParameterTypes().length == 0)){"
				+ "\n"
				+ "						args = new String[m.getParameterTypes().length];"
				+ "\n"
				+ "					}"
				+ "\n"
				+ "					int cpt = 0;"
				+ "\n"
				+ "					for(Class c : m.getParameterTypes()){"
				+ "\n"
				+ "						args[cpt]= c.getSimpleName();"
				+ "\n"
				+ "						cpt = cpt+1;"
				+ "\n"
				+ "					}"
				+ "\n"
				+ "				}"
				+ "\n"
				+ "			}"
				+ "\n"
				+ "			toInsert = toInsert + \"(\";"
				+ "\n"
				+ "			if(! (args == null)){"
				+ "\n"
				+ "				for(int i = 0;i<args.length;i++){"
				+ "\n"
				+ "					if(i == (args.length - 1)){"
				+ "\n"
				+ "						toInsert = toInsert + args[i];"
				+ "\n"
				+ "					}"
				+ "\n"
				+ "					else"
				+ "\n"
				+ "					{"
				+ "\n"
				+ "						toInsert = toInsert + args[i]+\",\";"
				+ "\n"
				+ "					}"
				+ "\n"
				+ "				}"
				+ "\n"
				+ "			}"
				+ "\n"
				+ "			toInsert = toInsert + \");\";"
				+ "\n"
				+

				"			editor.getTextPaneEditor().getDocument().insertString(pos + 1, toInsert, null);"
				+ "\n" + "		} catch (BadLocationException e) {" + "\n"
				+ "			e.printStackTrace();" + "\n" + "		}" + "\n" + "	}" + "\n"
				+ "}";
		FileWriterO fw = new FileWriterO();

		System.out.println(f.getAbsolutePath());
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fw.writeStringOnFile(content, f.getAbsolutePath());
	}

	public void addCommandLoadModelExample() {
		String packName = name.toLowerCase() + "Tools.guiEditor.commands";
		String className = "CommandLoadModelExample";
		File f = new File("src/" + name.toLowerCase() + "Tools/guiEditor"
				+ "/commands/" + className + ".java");

		String content = "package " + packName + ";" + "\n" + "import "
				+ name.toLowerCase() + "Tools.guiEditor.graphicComponents."
				+ name + "TextualEditor;" + "\n" + "import "
				+ name.toLowerCase() + ".*;" + "\n" + "import "
				+ name.toLowerCase() + "Tools.generator.Generator;" + "\n"
				+ "import "+name.toLowerCase() + "Tools.guiEditor.controllers."+name+"Listener;" + "\n"
				+ "public class " + className + " extends Command{" + "\n"
				+ "	public " + className + "(" + name
				+ "TextualEditor e, String nme, String desc) {" + "\n"
				+ "		super(e, nme, desc);" + "\n" + "	}" + "\n" + "	@Override"
			
				+ "\n" + "	public void execute() {" + "\n" 
				+ "		" + name + " "	+ name.toLowerCase() + " = "+ name.substring(0, 1).toUpperCase()+ name.substring(1, name.length()).toLowerCase()+ "Factory.eINSTANCE.create" + name + "();" + "\n"
				+ "		editor.set" + name + "(" + name.toLowerCase() + ");"+ "\n" 
				+ "		editor."+name.toLowerCase()+"Listener = new " + name+"Listener(editor);" + "\n" 
				+ "		editor."+name.toLowerCase()+"Listener.listen();" + "\n"

				
				+ "		Generator gen = new Generator(" + name.toLowerCase() + ");"+ "\n" 
				+ "		gen.generateModelExample();" + "\n"
				
				+ "\n" + "	}" + "\n" + "}";
		FileWriterO fw = new FileWriterO();

		System.out.println(f.getAbsolutePath());
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fw.writeStringOnFile(content, f.getAbsolutePath());
	}

	public void addCommandLoadScriptExample() {
		String packName = name.toLowerCase() + "Tools.guiEditor.commands";
		String className = "CommandLoadScriptExample";
		File f = new File("src/" + name.toLowerCase() + "Tools/guiEditor"
				+ "/commands/" + className + ".java");

		String content = "package " + packName + ";" + "\n" + "import "
				+ name.toLowerCase() + "Tools.guiEditor.graphicComponents."
				+ name + "TextualEditor;" + "\n" + "import "
				+ name.toLowerCase() + ".*;" + "\n" + "import "
				+ name.toLowerCase() + "Tools.generator.Generator;" + "\n"
				+ "import " + name.toLowerCase() + "Tools.transformations."
				+ name + "2" + name + "Script;" + "\n" + "public class "
				+ className + " extends Command{" + "\n" + "	public "
				+ className + "(" + name
				+ "TextualEditor e, String nme, String desc) {" + "\n"
				+ "		super(e, nme, desc);" + "\n" + "	}" + "\n" + "	@Override"
				+ "\n" + "	public void execute() {" + "\n" + "		" + name + " "
				+ name.toLowerCase() + " = "
				+ name.substring(0, 1).toUpperCase()
				+ name.substring(1, name.length()).toLowerCase()
				+ "Factory.eINSTANCE.create" + name + "();" + "\n"
				+ "		Generator gen = new Generator(" + name.toLowerCase()
				+ ");" + "\n" + "		gen.generateModelExample();" + "\n" + "		"
				+ name + "2" + name + "Script t=new " + name + "2" + name
				+ "Script(" + name.toLowerCase() + ");" + "\n"
				+ "       String script = \"" + name + "Script{\\n\";" + "\n"
				+ "       script = script + t.transformation();" + "\n"
				+ "       script = script + \"}\";" + "\n"
				+ "		editor.getTextPaneEditor().setText(script);" + "\n" + "	}"
				+ "\n" + "}";
		FileWriterO fw = new FileWriterO();

		System.out.println(f.getAbsolutePath());
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fw.writeStringOnFile(content, f.getAbsolutePath());
	}

	public void addCommandInterpretScript() {
		String packName = name.toLowerCase() + "Tools.guiEditor.commands";
		String className = "CommandInterpretScript";
		File f = new File("src/" + name.toLowerCase() + "Tools/guiEditor"
				+ "/commands/" + className + ".java");

		String content = "package " + packName + ";" + "\n" + "import "
				+ name.toLowerCase() + "Tools.guiEditor.graphicComponents."
				+ name + "TextualEditor;" + "\n" + "import "
				+ name.toLowerCase() + ".*;" + "\n" + "import "
				+ name.toLowerCase() + "Tools.generator.Generator;" + "\n"
				+ "import " + name.toLowerCase() + "Tools.transformations."
				+ name + "2" + name + "Script;" + "\n" + "import "
				+ name.toLowerCase() + "Tools.transformations." + name
				+ "Script2" + name + ";" + "\n" + "import javax.swing.Action;"
				+ "\n" + "public class " + className + " extends Command{"
				+ "\n" + "	public " + className + "(" + name
				+ "TextualEditor e, String nme, String desc) {" + "\n"
				+ "		super(e, nme, desc);" + "\n" + "	}" + "\n" + "	@Override"
				+ "\n" + "	public void execute() {" + "\n" + "			" + name
				+ "Script2" + name + " transfo = new " + name + "Script2"
				+ name + "(editor.getTextPaneEditor().getText());" + "\n"
				+ "			transfo.transformation(editor.get" + name + "());" + "\n"
				+ "			editor.getTextPaneEditor().setText(\"" + name
				+ "Script{\\n\\n}\");" + "\n" + "	}" + "\n" + "}";

		FileWriterO fw = new FileWriterO();

		System.out.println(f.getAbsolutePath());
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fw.writeStringOnFile(content, f.getAbsolutePath());
	}

	public void addCommandDisplayGraph() {
		String packName = name.toLowerCase() + "Tools.guiEditor.commands";
		String className = "CommandDisplayGraph";
		File f = new File("src/" + name.toLowerCase() + "Tools/guiEditor"
				+ "/commands/" + className + ".java");

		String content = "package " + packName + ";" + "\n" + "import "
				+ name.toLowerCase() + "Tools.guiEditor.graphicComponents."
				+ name + "TextualEditor;" + "\n" + "import javax.swing.Action;"
				+ "\n" + "public class " + className + " extends Command{"
				+ "\n" + "	public " + className + "(" + name
				+ "TextualEditor e, String nme, String desc) {" + "\n"
				+ "		super(e, nme, desc);" + "\n" + "	}" + "\n" + "	@Override"
				+ "\n" + "	public void execute() {" + "\n"
				+ "			editor.graphMonitor.update();" + "\n"
				+ "			editor.graphMonitor.setVisible(true);" + "\n" + "	}"
				+ "\n" + "}";

		FileWriterO fw = new FileWriterO();

		System.out.println(f.getAbsolutePath());
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fw.writeStringOnFile(content, f.getAbsolutePath());
	}
	
	
	public void addCommandModelListener() {
		String packName = name.toLowerCase() + "Tools.guiEditor.commands";
		String className = "CommandModelListener";
		File f = new File("src/" + name.toLowerCase() + "Tools/guiEditor"
				+ "/commands/" + className + ".java");

		String content = "package " + packName + ";" + "\n" + "import "
				+ name.toLowerCase() + "Tools.guiEditor.graphicComponents."
				+ name + "TextualEditor;" + "\n" + "import javax.swing.Action;"
				+ "\n" + "public class " + className + " extends Command{"
				+ "\n" + "	public " + className + "(" + name
				+ "TextualEditor e, String nme, String desc) {" + "\n"
				+ "		super(e, nme, desc);" + "\n" + "	}" + "\n" + "	@Override"
				+ "\n" + "	public void execute() {" + "\n"
				+ "			editor.get"+name+"Listener().listen();" + "\n"
				+ "	 }"
				+ "\n" + "}";

		FileWriterO fw = new FileWriterO();

		System.out.println(f.getAbsolutePath());
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fw.writeStringOnFile(content, f.getAbsolutePath());
	}

	public void addCommandLoad(){
		String packName =name.toLowerCase()+"Tools.guiEditor.commands"; 
		String className = "CommandLoad";
		File f = new File("src/"+name.toLowerCase()+"Tools/guiEditor"+"/commands/"+className+".java");
		
		String content = "package "+packName+";"+"\n"+

		"import java.io.IOException;"+"\n"+
		"import org.eclipse.emf.common.util.URI;"+"\n"+
		"import org.eclipse.emf.ecore.resource.Resource;"+"\n"+
		"import org.eclipse.emf.ecore.resource.ResourceSet;"+"\n"+
		"import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;"+"\n"+
		"import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;"+"\n"+
		"import "+name.toLowerCase()+".*;"+"\n"+
		"import "+name.toLowerCase()+"Tools.guiEditor.graphicComponents.*;"+"\n"+

		"public class CommandLoad extends Command{"+"\n"+

		"	public " + className + "(" + name+ "TextualEditor e, String nme, String desc) {" + "\n"
			+ "		super(e, nme, desc);" + "\n" + 
		"	}" + "\n" +
			
		"	public void execute(){" + "\n" +
		"	ResourceSet resourceSetMetamodel;" + "\n" +
		"	Resource resourceModel;" + "\n" +
		"	// REGISTER THE METAMODEL" + "\n" +
		"	resourceSetMetamodel = new ResourceSetImpl();" + "\n" +
		"	resourceSetMetamodel.getPackageRegistry().put("+name.substring(0,1) + name.substring(1,name.length()).toLowerCase()+ "Package.eNS_URI," + "\n" +
		"	"+name.substring(0,1) + name.substring(1,name.length()).toLowerCase()+"Package.eINSTANCE);" + "\n" +
		"	resourceSetMetamodel.getResourceFactoryRegistry()" + "\n" +
		"	.getExtensionToFactoryMap()" + "\n" +
		"	.put(\"xmi\", new XMIResourceFactoryImpl());" + "\n" +
		
		"	FileChooser fc = new FileChooser(editor);" + "\n" +
		"	System.out.println(fc.getChooser().getSelectedFile().getAbsolutePath());" + "\n" +
		"	String path = fc.getChooser().getSelectedFile().getAbsolutePath();" + "\n" +
		"	// LOAD THE MODEL" + "\n" +
		"	resourceModel = resourceSetMetamodel.createResource(URI" + "\n" +
		"	.createFileURI(path));" + "\n" +
		"	try {" + "\n" +
		"	resourceModel.load(null);" + "\n" +
		"	} catch (IOException e) {" + "\n" +
		"	System.out.println(\"error during the model loading step\");" + "\n" +
		"	e.printStackTrace();" + "\n" +
		"	}" + "\n" +
		"	// INSTANTIATE ROOTELEMENT WITH THE CONTAINERROOT OF THE LOADED MODEL" + "\n" +
		"	editor.set"+name+"(("+name+") resourceModel.getContents().get(0));" + "\n" +
		"	// getEditor().graphMonitorPolicy.update();" + "\n" +
		"	 }" + "\n" +
		"}";

		FileWriterO fw = new FileWriterO();
		
		System.out.println(f.getAbsolutePath());
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fw.writeStringOnFile(content, f.getAbsolutePath());
	}

	public void addCommandSave(){
		String packName =name.toLowerCase()+"Tools.guiEditor.commands"; 
		String className = "CommandSave";
		File f = new File("src/"+name.toLowerCase()+"Tools/guiEditor"+"/commands/"+className+".java");
		
		String content = "package "+packName+";"+"\n"+

		"import java.io.IOException;"+"\n"+
		"import org.eclipse.emf.common.util.URI;"+"\n"+
		"import org.eclipse.emf.ecore.resource.Resource;"+"\n"+
		"import org.eclipse.emf.ecore.resource.ResourceSet;"+"\n"+
		"import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;"+"\n"+
		"import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;"+"\n"+
		"import "+name.toLowerCase()+".*;"+"\n"+
		"import "+name.toLowerCase()+"Tools.guiEditor.graphicComponents.*;"+"\n"+

		"public class CommandSave extends Command{"+"\n"+

		"	public " + className + "(" + name+ "TextualEditor e, String nme, String desc) {" + "\n"
			+ "		super(e, nme, desc);" + "\n" + 
		"	}" + "\n" +
		

		"	public void execute(){" + "\n" +
		"	ResourceSet resourceSetMetamodel;" + "\n" +
		"	Resource resourceModel;" + "\n" +
		"	// REGISTER THE METAMODEL" + "\n" +
		"	resourceSetMetamodel = new ResourceSetImpl();" + "\n" +
		"	resourceSetMetamodel.getPackageRegistry().put("+name.substring(0,1) + name.substring(1,name.length()).toLowerCase()+ "Package.eNS_URI," + "\n" +
		"	"+name.substring(0,1) + name.substring(1,name.length()).toLowerCase()+"Package.eINSTANCE);" + "\n" +
		"	resourceSetMetamodel.getResourceFactoryRegistry()" + "\n" +
		"	.getExtensionToFactoryMap()" + "\n" +
		"	.put(\"xmi\", new XMIResourceFactoryImpl());" + "\n" +
	
		"	FileChooser fc = new FileChooser(editor);" + "\n" +
		"	System.out.println(fc.getChooser().getSelectedFile().getAbsolutePath());" + "\n" +
		"	String path = fc.getChooser().getSelectedFile().getAbsolutePath();" + "\n" +
	
		"	 // SAVE THE MODEL" + "\n" +
		"	 resourceModel = resourceSetMetamodel.createResource(URI" + "\n" +
		"	 .createFileURI(path));" + "\n" +
		"	 resourceModel.getContents().add(editor.get"+name+"());" + "\n" +
		"	 try {" + "\n" +
		"	 resourceModel.save(null);" + "\n" +
		"	 } catch (IOException e) {" + "\n" +
		"	 System.out.println(\"error during the model saving step\");" + "\n" +
		"	 e.printStackTrace();" + "\n" +
		"	 }" + "\n" +
		"	 }" + "\n" +
		"}";

	    FileWriterO fw = new FileWriterO();
		
		System.out.println(f.getAbsolutePath());
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fw.writeStringOnFile(content, f.getAbsolutePath());
	}
	
	public void addCommandColoration() {
		String packName = name.toLowerCase() + "Tools.guiEditor.commands";
		String className = "CommandColoration";
		File f = new File("src/" + name.toLowerCase() + "Tools/guiEditor"
				+ "/commands/" + className + ".java");

		String content = "package " + packName + ";" + "\n" + "import "
				+ name.toLowerCase() + "Tools.guiEditor.graphicComponents."
				+ name + "TextualEditor;" + "\n" + 
				"import javax.swing.Action;"+ "\n" +
				"import java.awt.Color;"+ "\n" +
				"import java.util.regex.Matcher;"+ "\n" +
				"import java.util.regex.Pattern;"+ "\n" +

				"import javax.swing.SwingUtilities;"+ "\n" +
				"import javax.swing.text.MutableAttributeSet;"+ "\n" +
				"import javax.swing.text.SimpleAttributeSet;"+ "\n" +
				"import javax.swing.text.StyleConstants;"+ "\n" +
				"import javax.swing.text.StyledDocument;"+ "\n" +


				"public class CommandColoration extends "+name.toLowerCase()+"Tools.guiEditor.commands.Command{"+ "\n" +

				"	public CommandColoration("+name+"TextualEditor e, String nme, String desc) {"+ "\n" +
				"		super(e, nme, desc);"+ "\n" +
				"	}"+ "\n" +
					
				"	public void execute(){"+ "\n" +
				"		Runnable r = new Runnable() {"+ "\n" +
				"			@Override"+ "\n" +
				"			public void run() {"+ "\n" +
				"				coloration();"+ "\n" +
				"			}"+ "\n" +
				"		};"+ "\n" +
				"		SwingUtilities.invokeLater(r);"+ "\n" +
				"	}"+ "\n" +

				"	public void coloration() {"+ "\n" +
				"		String text = editor.getTextPaneEditor().getText().replaceAll(\"\\n\", \" \");"+ "\n" +
				"		final StyledDocument doc = editor.getTextPaneEditor().getStyledDocument();"+ "\n" +
				"		final MutableAttributeSet normal = new SimpleAttributeSet();"+ "\n" +
				"		StyleConstants.setForeground(normal, Color.black);"+ "\n" +
				"		StyleConstants.setBold(normal, false);"+ "\n" +
				"		SwingUtilities.invokeLater(new Runnable() {"+ "\n" +
				"			public void run() {"+ "\n" +
				"				doc.setCharacterAttributes(0, doc.getLength(), normal, true);"+ "\n" +
				"			}"+ "\n" +
				"		});"+ "\n" +
				"		colorationPrimitives(text, doc);"+ "\n" +
				"		colorationPolicyScript(text, doc);"+ "\n" +
				"	}"+ "\n" +
				"	public void colorationPrimitives(String text, final StyledDocument doc){"+ "\n" +
				"		for (String statements : editor.primitives) {"+ "\n" +
				"			Pattern p = Pattern.compile(\"(\" + statements + \")\");"+ "\n" +
				"			Matcher m = p.matcher(text);"+ "\n" +
				"			while (m.find() == true) {"+ "\n" +
				"				MutableAttributeSet attri = new SimpleAttributeSet();"+ "\n" +
				"				StyleConstants.setForeground(attri, Color.blue);"+ "\n" +
				"				StyleConstants.setBold(attri, true);"+ "\n" +
				"				final int start = m.start(0);"+ "\n" +
				"				final int end = m.end(0);"+ "\n" +
				"				final int length = end - start;"+ "\n" +
				"				final MutableAttributeSet style = attri;"+ "\n" +
				"				SwingUtilities.invokeLater(new Runnable() {"+ "\n" +
				"					public void run() {"+ "\n" +
				"						doc.setCharacterAttributes(start, length, style, true);"+ "\n" +
				"					}"+ "\n" +
				"				});"+ "\n" +
				"			}"+ "\n" +
				"		}"+ "\n" +
				"	}"+ "\n" +
				"	public void colorationPolicyScript(String text, final StyledDocument doc){"+ "\n" +
				"		Pattern p = Pattern.compile(\"("+name+"Script)\");"+ "\n" +
				"		Matcher m = p.matcher(text);"+ "\n" +
				"		while (m.find() == true) {"+ "\n" +
				"			MutableAttributeSet attri = new SimpleAttributeSet();"+ "\n" +
				"			StyleConstants.setForeground(attri, Color.orange);"+ "\n" +
				"			StyleConstants.setBold(attri, true);"+ "\n" +
				"			final int start = m.start(0);"+ "\n" +
				"			final int end = m.end(0);"+ "\n" +
				"			final int length = end - start;"+ "\n" +
				"			final MutableAttributeSet style = attri;"+ "\n" +
				"			SwingUtilities.invokeLater(new Runnable() {"+ "\n" +
				"				public void run() {"+ "\n" +
				"					doc.setCharacterAttributes(start, length, style, true);"+ "\n" +
				"				}"+ "\n" +
				"			});"+ "\n" +
				"		}"+ "\n" +
				"	}"+ "\n" +
					
					
				"}"+ "\n" ;

		FileWriterO fw = new FileWriterO();

		System.out.println(f.getAbsolutePath());
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fw.writeStringOnFile(content, f.getAbsolutePath());
	}

}
