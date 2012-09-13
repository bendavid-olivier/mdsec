package utils.editorGenerator.guiEditorGenerator;

import java.io.File;
import java.io.IOException;

import utils.writer.FileWriterO;

public class GraphicComponentsGenerator {

	private String name;
	
	public GraphicComponentsGenerator(String s){
		name = s;
	}
	
	public void addLauncher(){
		String packName =name.toLowerCase()+"Tools.guiEditor"; 
		String className = "Launcher";
		String classTextEditorName = name+"TextualEditor";
		String importTextEditor = name.toLowerCase()+"Tools.guiEditor.graphicComponents."+classTextEditorName;
		File f = new File("src/"+name.toLowerCase()+"Tools/guiEditor"+"/"+className+".java");
		
		String content = "package "+packName+";"+"\n"+
		"\n"+				
		"import "+importTextEditor+";"+"\n"+
		"import "+name.toLowerCase()+".*;"+"\n"+
		"\n"+		
		"public class "+className+ "{"+"\n"+
		
		"	private "+name+"TextualEditor editor;"+"\n"+
		"	public Launcher("+name+" x){"+"\n"+
		"		editor = new "+name+"TextualEditor(x);"+"\n"+
		"	}"+"\n"+
			
		"	public void start(){"+"\n"+
		"		editor.setVisible(true);"+"\n"+
		"	}" +"\n"+
		
			"public static void main(String[] args) {"+"\n"+
				classTextEditorName+ " editor = new "+classTextEditorName+"();"+"\n"+
				"editor.setVisible(true);"+"\n"+
				"editor.update();"+"\n"+
			"}"+"\n"+
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
	
	public void addTextualEditor(){
		String packName =name.toLowerCase()+"Tools.guiEditor.graphicComponents"; 
		String className = name+"TextualEditor";
		File f = new File("src/"+name.toLowerCase()+"Tools/guiEditor"+"/graphicComponents/"+className+".java");
		
		String content = "package "+packName+";"+"\n"+
		"\n"+				
		"import java.awt.*;"+"\n"+
		"import javax.swing.*;"+"\n"+
		"import java.util.*;"+"\n"+
		"import java.util.List;"+"\n"+
		"import java.lang.reflect.*;"+"\n"+
		"import "+name.toLowerCase()+".*;"+"\n"+
		"import "+name.toLowerCase()+"Tools.guiEditor.controllers.*;"+"\n"+
		"import "+name.toLowerCase()+"Tools.guiEditor.commands.*;"+"\n"+
		"import "+name.toLowerCase()+"Tools.editor."+name+"Editor;"+ "\n"+
		"\n"+	
		"public class "+className+ " extends JFrame{"+"\n"+
			"private TextPaneEditor textPaneEditor;"+"\n"+
			"private MenuBarEditor menuBar;"+"\n"+
			"private "+name+" "+name.toLowerCase()+";"+"\n"+
			"private KeyListenerEditor keyListenerEditor;"+"\n"+
			"private DocumentListenerEditor documentListenerEditor;"+"\n"+
			"public "+name+"Listener " +name.toLowerCase()+ "Listener;"+"\n"+
			"public PopupCompletion popupCompletion;"+"\n"+
			"public GraphMonitor graphMonitor;"+"\n"+
			"public List<String> primitives;"+"\n"+
			"\n"+
			"	public "+className+"(){"+"\n"+
			"		"+name.toLowerCase()+" = "+name.substring(0, 1).toUpperCase()+name.substring(1, name.length()).toLowerCase()+"Factory.eINSTANCE.create"+name+"();"+"\n"+
			"		initGraphicalComponents();"+"\n"+
			"		initControllers();"+"\n"+		
			"       initPrimitives();"+"\n"+
			"	}"+"\n"+
			"\n"+
			
			"\n"+
			"	public "+className+"("+name+" x) {"+"\n"+
			"		"+name.toLowerCase()+" = x;"+"\n"+
			"		initGraphicalComponents();"+"\n"+
			"		initControllers();"+"\n"+
			"		initPrimitives();"+"\n"+
			"	}"+"\n"+
			"\n"+
			
			"\n"+
			"	public void update(){"+"\n"+
			"		graphMonitor.update();"+"\n"+
			"		CommandColoration c= new CommandColoration(this, \"coloration\", \"coloration\");"+"\n"+
			"		c.execute();"+"\n"+
			"	}		"+"\n"+
			"\n"+
			
			"\n"+
			"	public void initGraphicalComponents(){"+"\n"+
			"		setTitle(\""+name.toUpperCase()+" Editor \");"+"\n"+
			"		setSize(600, 400);"+"\n"+
			"		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);"+"\n"+
			"		popupCompletion =new PopupCompletion(this);"+"\n"+
			"		textPaneEditor = new TextPaneEditor(this);"+"\n"+
			"		JScrollPane scroll = new JScrollPane();"+"\n"+
			"		Dimension d =new Dimension(600, 400);"+"\n"+
			"		scroll.setSize(d);"+"\n"+
			"		scroll.setPreferredSize(d);"+"\n"+
			"		scroll.setMinimumSize(d);"+"\n"+
			"		setContentPane(scroll);"+"\n"+
			"		scroll.setViewportView(textPaneEditor);"+"\n"+
			"		menuBar = new MenuBarEditor(this);"+"\n"+
			"		setJMenuBar(menuBar);"+"\n"+
			"		graphMonitor = new GraphMonitor(this);"+"\n"+
			"	}"+"\n"+
			"\n"+
				
			"\n"+				
			"	public void initControllers(){"+"\n"+
			"		"+name.toLowerCase()+"Listener = new "+name+"Listener(this);"+"\n"+
			"		keyListenerEditor = new KeyListenerEditor(this);"+"\n"+
			"		documentListenerEditor = new DocumentListenerEditor(this);"+"\n"+
			"		textPaneEditor.addKeyListener(keyListenerEditor);"+"\n"+
			"		textPaneEditor.getDocument().addDocumentListener(documentListenerEditor);"+"\n"+
			"	}"+"\n"+
			"\n"+
			
			
			"\n"+
			"	public void initPrimitives() {"+"\n"+
			"		primitives = new ArrayList<String>();"+"\n"+
			"		for (Method m : "+name+"Editor.class.getDeclaredMethods()){"+"\n"+
			"			primitives.add(m.getName());"+"\n"+
			"		}"+"\n"+
			"	}"+"\n"+
			"\n"+
			
			"	public "+ name + " get"+name+"(){"+"\n"+
			"		return "+name.toLowerCase()+";"+"\n"+
			"   }"+"\n"+
			
			"	public void set"+name+"("+name+" "+"x){"+"\n"+
			"		"+name.toLowerCase()+"=x;"+"\n"+
			"   }"+"\n"+
			
			"	public TextPaneEditor getTextPaneEditor() {"+"\n"+
			"		return textPaneEditor;"+"\n"+
			"	}	"+"\n"+
	
			"	public "+name+"Listener get"+name+"Listener() {"+"\n"+
			"		return "+name.toLowerCase()+"Listener;"+"\n"+
			"	}"+"\n"+
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
	
	public void addTextPaneEditor(){
		String packName =name.toLowerCase()+"Tools.guiEditor.graphicComponents"; 
		String className = "TextPaneEditor";
		File f = new File("src/"+name.toLowerCase()+"Tools/guiEditor"+"/graphicComponents/"+className+".java");
		
		String content = "package "+packName+";"+"\n"+
		"\n"+				
		"import javax.swing.*;"+"\n"+
		"\n"+	
		"public class "+className+ "  extends JTextPane{"+"\n"+
			"private "+name+"TextualEditor parent;"+"\n"+
			"\n"+
			
			"public "+className+"("+name+"TextualEditor p){"+"\n"+
				"parent = p;"+"\n"+
			
				"setText(\""+name+"Script{\\n\\n}\");"+"\n"+
			"}"+"\n"+
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
	
	public void addMenuBarEditor(){
		String packName =name.toLowerCase()+"Tools.guiEditor.graphicComponents"; 
		String className = "MenuBarEditor";
		File f = new File("src/"+name.toLowerCase()+"Tools/guiEditor"+"/graphicComponents/"+className+".java");
		
		String content = "package "+packName+";"+"\n"+
		"\n"+				
		"import javax.swing.*;"+"\n"+
		"import "+name.toLowerCase()+"Tools.guiEditor.commands.*;"+"\n"+
		"\n"+	
		"public class "+className+ "  extends JMenuBar{"+"\n"+
		"private JMenu menuFile;"+"\n"+
		"private JMenu menuRun;"+"\n"+
		"private JMenu menuTools;"+"\n"+
		"private JMenu menuViews;"+"\n"+
		"private JMenu menuHelp;"+"\n"+
		"private "+name+"TextualEditor editor;"+"\n"+
			"public "+className+"("+name+"TextualEditor e){"+"\n"+
			"	editor = e;"+"\n"+
				"menuFile = new JMenu(\"File\");"+"\n"+
				"menuRun = new JMenu(\"Run\");"+"\n"+
				"menuTools = new JMenu(\"Tools\");"+"\n"+
				"menuViews = new JMenu(\"Views\");"+"\n"+
				"menuHelp = new JMenu(\"Help\");"+"\n"+
				
				//MENUFILE
				"JMenuItem ml = new JMenuItem(\"load\");"+"\n"+
				"ml.setAction(new CommandLoad(editor, \"load\", \"load\"));"+"\n"+	
				"ml.setText(\"load\");"+"\n"+
				"ml.setName(\"load\");"+"\n"+
				"ml.setVisible(true);"+"\n"+										
				"menuFile.add(ml);"+"\n"+
				
				"JMenuItem ms = new JMenuItem(\"save\");"+"\n"+
				"ms.setAction(new CommandSave(editor, \"save\", \"save\"));"+"\n"+	
				"ms.setText(\"save\");"+"\n"+
				"ms.setName(\"save\");"+"\n"+
				"ms.setVisible(true);"+"\n"+										
				"menuFile.add(ms);"+"\n"+
				
				
				//MENURUN
				"\n"+
				"JMenuItem m2 = new JMenuItem(\"interpret\");"+"\n"+
				"m2.setAction(new CommandInterpretScript(editor, \"interpret\", \"interpret\"));"+"\n"+	
				"m2.setText(\"interpret\");"+"\n"+
				"m2.setName(\"interpret\");"+"\n"+
				"m2.setVisible(true);"+"\n"+										
				"menuRun.add(m2);"+"\n"+
				"\n"+
				
				//MENUTOOLS
				"\n"+
				"JMenuItem m = new JMenuItem(\"loadModelExample\");"+"\n"+
				"m.setAction(new CommandLoadModelExample(editor, \"loadModelExample\", \"loadModelExample\"));"+"\n"+	
				"m.setText(\"loadModelExample\");"+"\n"+
				"m.setName(\"loadModelExample\");"+"\n"+
				"m.setVisible(true);"+"\n"+										
				"menuTools.add(m);"+"\n"+
				"\n"+
				"\n"+
				"JMenuItem m1 = new JMenuItem(\"loadScriptExample\");"+"\n"+
				"m1.setAction(new CommandLoadScriptExample(editor, \"loadScriptExample\", \"loadScriptExample\"));"+"\n"+	
				"m1.setText(\"loadScriptExample\");"+"\n"+
				"m1.setName(\"loadScriptExample\");"+"\n"+
				"m1.setVisible(true);"+"\n"+										
				"menuTools.add(m1);"+"\n"+
				"\n"+
				"JMenuItem menuMl = new JMenuItem(\"listenModel\");"+"\n"+
				"menuMl.setAction(new CommandModelListener(editor, \"listenModel\", \"listenModel\"));"+"\n"+
				"menuMl.setText(\"listenModel\");"+"\n"+
				"menuMl.setName(\"listenModel\");"+"\n"+
				"menuMl.setVisible(true);"+"\n"+
				"menuTools.add(menuMl);"+"\n"+
				
				
				//MENUVIEWS
				"\n"+
				"JMenuItem m3 = new JMenuItem(\"displayGraph\");"+"\n"+
				"m3.setAction(new CommandDisplayGraph(editor, \"displayGraph\", \"displayGraph\"));"+"\n"+	
				"m3.setText(\"displayGraph\");"+"\n"+
				"m3.setName(\"displayGraph\");"+"\n"+
				"m3.setVisible(true);"+"\n"+
				"menuViews.add(m3);"+"\n"+
				"\n"+
				
				//MENUHELP				
				
				"add(menuFile);"+"\n"+
				"add(menuRun);"+"\n"+
				"add(menuTools);"+"\n"+
				"add(menuViews);"+"\n"+
				"add(menuHelp);"+"\n"+
			"}"+"\n"+
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
	
	public void addPopupCompletion(){
		String packName =name.toLowerCase()+"Tools.guiEditor.graphicComponents"; 
		String className = "PopupCompletion";
		File f = new File("src/"+name.toLowerCase()+"Tools/guiEditor"+"/graphicComponents/"+className+".java");
		
		String content = "package "+packName+";"+"\n"+
		"\n"+				
		"import javax.swing.*;"+"\n"+		
		"import java.util.ArrayList;"+"\n"+
		"import java.util.Collections;"+"\n"+
		"import javax.swing.JMenuItem;"+"\n"+
		"import javax.swing.JPopupMenu;"+"\n"+
		"import javax.swing.text.BadLocationException;"+"\n"+
		"import "+name.toLowerCase()+"Tools.guiEditor.commands.CommandCompletion;"+"\n"+
		
		"\n"+	
		"public class PopupCompletion extends JPopupMenu{"+"\n"+
		"	private ArrayList<String> propositions;"+"\n"+
		"	private "+name+"TextualEditor editor;"+"\n"+
			
		"	public PopupCompletion("+name+"TextualEditor e){"+"\n"+
		"		super();"+"\n"+
		"		editor = e;"+"\n"+
		"		propositions =new ArrayList<String>();"+"\n"+
		"	}"+"\n"+
		"\n"+
		
		"	public void updateItems(){"+"\n"+
		"		removeAll();"+"\n"+
		"		for(String s : propositions){"+"\n"+
		"			JMenuItem menu = new JMenuItem(s);"+"\n"+
		"			CommandCompletion c = new CommandCompletion(editor, s, s);"+"\n"+
		"			menu.setAction(c);"+"\n"+
		"			menu.setText(s);"+"\n"+
		"			menu.setName(s);"+"\n"+
		"			menu.setVisible(true);"+"\n"+
		"			add(menu);"+"\n"+
		"		}"+"\n"+
		"	}"+"\n"+
		"\n"+
		
		"	public void completion() {"+"\n"+
		"		int pos = editor.getTextPaneEditor().getCaretPosition() - 1;"+"\n"+
		"		String content = null;"+"\n"+
		"		try {"+"\n"+
		"			content = editor.getTextPaneEditor().getText(0, pos + 1);"+"\n"+
		"		} catch (BadLocationException e) {"+"\n"+
		"			e.printStackTrace();"+"\n"+
		"		}"+"\n"+
		"		int w;"+"\n"+
		"		for (w = pos; w >= 0; w--) {"+"\n"+
		"			if (!Character.isLetter(content.charAt(w))) {"+"\n"+
		"				break;"+"\n"+
		"			}"+"\n"+
		"		}"+"\n"+
		"		if (pos - w < 1) {"+"\n"+
		"			propositions.clear();"+"\n"+
		"			for (String val : editor.primitives) {"+"\n"+
		"				propositions.add(val);"+"\n"+
		"			}"+"\n"+
		"			updateItems();"+"\n"+
		"			return;"+"\n"+
		"		}"+"\n"+
		"		String prefix = content.substring(w + 1);"+"\n"+
		"		int n = Collections.binarySearch(editor.primitives, prefix);"+"\n"+
		"		if (n < 0 && -n <= editor.primitives.size()) {"+"\n"+
		"			propositions.clear();"+"\n"+
		"			for (String val : editor.primitives) {"+"\n"+
		"				if (val.startsWith(prefix)) {"+"\n"+
		"					propositions.add(val);"+"\n"+
		"				}"+"\n"+
		"			}"+"\n"+
		"		}"+"\n"+
		"		updateItems();"+"\n"+
		"	}"+"\n"+
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
	
	public void addImageComponent(){
		String packName =name.toLowerCase()+"Tools.guiEditor.graphicComponents"; 
		String className = "ImageComponent";
		File f = new File("src/"+name.toLowerCase()+"Tools/guiEditor"+"/graphicComponents/"+className+".java");
		
		String content = "package "+packName+";"+"\n"+
		"\n"+			
		"import java.awt.*;"+"\n"+
		"import java.awt.image.BufferedImage;"+"\n"+
		"import java.io.File;"+"\n"+
		"import java.io.IOException;"+"\n"+
		"import javax.imageio.ImageIO;"+"\n"+
		"import javax.swing.JComponent;"+"\n"+
		"import javax.swing.JFrame;"+"\n"+
		"import javax.swing.JScrollPane;"+"\n"+
		"public class ImageComponent extends JComponent {"+"\n"+
		    
		"	private BufferedImage bufferedImage;"+"\n"+
		    
		"   public void paint(Graphics g) {"+"\n"+
		"        g.drawImage(getBufferedImage(), 0, 0, null);"+"\n"+
		"   }"+"\n"+
	
		"   public static BufferedImage scale(BufferedImage source, int width, int height) {"+"\n"+
		"        BufferedImage buf = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);"+"\n"+
		"        Graphics2D g = buf.createGraphics();"+"\n"+
		"        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);"+"\n"+
		"        g.drawImage(source, 0, 0, width, height, null);"+"\n"+
		"        g.dispose();"+"\n"+
		"        return buf;"+"\n"+
		"    }"+"\n"+
	
		"    public ImageComponent() {"+"\n"+
		"        setBackground(Color.white);"+"\n"+
		"        try {"+"\n"+
		"            bufferedImage = ImageIO.read(new File(\"Graph.png\"));"+"\n"+
		"        } catch (IOException e) {"+"\n"+
		"        }"+"\n"+
		"    }"+"\n"+
		    
		"    public ImageComponent(File f) {"+"\n"+
		"        try {"+"\n"+
		"            bufferedImage = ImageIO.read(f);"+"\n"+
		"        } catch (IOException e) {"+"\n"+
		"        }"+"\n"+
		"    }"+"\n"+
	
		"    public ImageComponent(BufferedImage bi) {"+"\n"+
		"        bufferedImage = bi;"+"\n"+
		"    }"+"\n"+
	
		"    public Dimension getPreferredSize() {"+"\n"+
		"        if (getBufferedImage() == null) {"+"\n"+
		"            return new Dimension(100, 100);"+"\n"+
		"        } else {"+"\n"+
		"            return new Dimension(getBufferedImage().getWidth(null), getBufferedImage().getHeight(null));"+"\n"+
		"        }"+"\n"+
		"    }"+"\n"+
	
		"    public static void main(String[] args) {"+"\n"+
		"        JFrame f = new JFrame(\"Load Image Sample\");"+"\n"+
		"        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);"+"\n"+
		"        f.setSize(400, 400);"+"\n"+
		"        JScrollPane jsp = new JScrollPane(new ImageComponent(new File(\"/home/obendavi/Bureau/coding/workspaceKEVOREE/kevoree-experiment/org.kevoree.experiment.kevoreeAndIncQuery/graphs/ola.png\")));"+"\n"+
		"        f.add(jsp);"+"\n"+
		"        f.setVisible(true);"+"\n"+
		"    }"+"\n"+
	
		"    public BufferedImage getBufferedImage() {"+"\n"+
		"        return bufferedImage;"+"\n"+
		"    }"+"\n"+
	
		"    public void setBufferedImage(BufferedImage img) {"+"\n"+
		"        this.bufferedImage = img;"+"\n"+
		"     }"+"\n"+
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
	
	public void addGraphMonitor(){
		String packName =name.toLowerCase()+"Tools.guiEditor.graphicComponents"; 
		String className = "GraphMonitor";
		File f = new File("src/"+name.toLowerCase()+"Tools/guiEditor"+"/graphicComponents/"+className+".java");
		
		String content = "package "+packName+";"+"\n"+
		"\n"+			
		"import "+name.toLowerCase()+".*;"+"\n"+
		"import "+name.toLowerCase()+"Tools.transformations.*;"+"\n"+
		"import "+name.toLowerCase()+"Tools.transformations."+name+"2GraphO;"+"\n"+
		"import grapho.GraphO;"+"\n"+
		"import graphoTools.transformations.GraphOpolicy2DotFile;"+"\n"+
		"import java.io.File;"+"\n"+
		"import javax.swing.JFrame;"+"\n"+
		"import javax.swing.JScrollPane;"+"\n"+
		"import utils.graphStructure.dotThings.DotDisplayer;"+"\n"+

		"public class GraphMonitor extends JFrame{"+"\n"+
			
			"private JScrollPane scroll;"+"\n"+
			//"private "+ name+" "+name.toLowerCase()+";"+"\n"+
			"private "+ name	+ "TextualEditor editor;"+ "\n"	+
			
			"public GraphMonitor("+name+"TextualEditor x){"+"\n"+
			"    editor =x;"+"\n"+
			//"	"+name.toLowerCase()+" = x;"+"\n"+
			"	"+name+"2GraphO transfo2Graph = new "+name+"2GraphO(editor.get"+name+"());"+"\n"+
			"	 GraphO g = transfo2Graph.transformation();"+"\n"+
			"	 GraphOpolicy2DotFile transfo2Dot = new GraphOpolicy2DotFile(g);"+"\n"+
			"	 File f = transfo2Dot.transformation(\"graphs/"+name+".dot\");"+"\n"+
			"	 DotDisplayer.createPngFile(f);"+"\n"+
				        
		    "    String pngPath = f.getAbsolutePath();"+"\n"+
		    "    pngPath = pngPath.substring(0,f.getAbsolutePath().length()-3);"+"\n"+
		    "    pngPath = pngPath+\"png\";"+"\n"+
		        
		    "    File pngFile = new File(pngPath);"+"\n"+ 
		    "    scroll = new JScrollPane(new ImageComponent(pngFile));"+"\n"+
		    "    add(scroll);"+"\n"+
		        
		    "    setTitle(\"Graph Monitor\");"+"\n"+
		    "    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);"+"\n"+
		    "    setSize(400, 400);"+"\n"+
			"}"+"\n"+
			
			"public void update()"+"\n"+
			"{"+"\n"+
			"	"+name+"2GraphO transfo2Graph = new "+name+"2GraphO(editor.get"+name+"());"+"\n"+
			"	GraphO g = transfo2Graph.transformation();"+"\n"+
			"	GraphOpolicy2DotFile transfo2Dot = new GraphOpolicy2DotFile(g);"+"\n"+
			"	File f = transfo2Dot.transformation(\"graphs/"+name+".dot\");"+"\n"+
			"	DotDisplayer.createPngFile(f);"+"\n"+
				        
		    "    String pngPath = f.getAbsolutePath();"+"\n"+
		    "    pngPath = pngPath.substring(0,f.getAbsolutePath().length()-3);"+"\n"+
		    "    pngPath = pngPath+\"png\";"+"\n"+
		    "    File pngFile = new File(pngPath);"+"\n"+ 
		        
		    "    setContentPane(new JScrollPane(new ImageComponent(pngFile)));"+"\n"+
		        
			"}"+"\n"+
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
	
	
	public void addFileChooser(){
		String packName =name.toLowerCase()+"Tools.guiEditor.graphicComponents"; 
		String className = "FileChooser";
		File f = new File("src/"+name.toLowerCase()+"Tools/guiEditor"+"/graphicComponents/"+className+".java");
		
		String content = "package "+packName+";"+"\n"+

		"import java.io.File;"+"\n"+

		"import javax.swing.JFileChooser;"+"\n"+
		"import javax.swing.JFrame;"+"\n"+
		"import javax.swing.filechooser.FileFilter;"+"\n"+

		"/**"+"\n"+
		"*"+"\n"+
		"* @author obendavi"+"\n"+
		"*/"+"\n"+
		"public class FileChooser {"+"\n"+
		"    private JFileChooser chooser;"+"\n"+
		"    public FileChooser(JFrame parent) {"+"\n"+
		"        chooser = new JFileChooser();"+"\n"+
		"        chooser.addChoosableFileFilter(new FileFilter() {"+"\n"+
		"@Override"+"\n"+
		"public String getDescription() {"+"\n"+
		"return \"models xmi files\";"+"\n"+
		"}"+"\n"+

		"@Override"+"\n"+
		"public boolean accept(File arg0) {"+"\n"+
		"return arg0.getName().endsWith(\".xmi\");"+"\n"+
		"}"+"\n"+
		"});"+"\n"+
		"        int returnVal = chooser.showOpenDialog(parent);"+"\n"+
		"        if (returnVal == JFileChooser.APPROVE_OPTION) {"+"\n"+
		"            System.out.println(\"You chose to open this file: \""+"\n"+
		"                    + chooser.getSelectedFile().getName());"+"\n"+
		"        }"+"\n"+
		"    }"+"\n"+

		"/**"+"\n"+
		"* @return the chooser"+"\n"+
		"*/"+"\n"+
		"    public JFileChooser getChooser() {"+"\n"+
		"        return chooser;"+"\n"+
		"    }"+"\n"+

		"/**"+"\n"+
		"* @param chooser the chooser to set"+"\n"+
		"*/"+"\n"+
		"    public void setChooser(JFileChooser chooser) {"+"\n"+
		"        this.chooser = chooser;"+"\n"+
		"    }"+"\n"+
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
	
	
	
	
}