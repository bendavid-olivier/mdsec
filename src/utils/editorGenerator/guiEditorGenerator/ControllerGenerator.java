package utils.editorGenerator.guiEditorGenerator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import utils.writer.FileWriterO;

public class ControllerGenerator {
	
	private String name;
	
	public ControllerGenerator(String x){
		name = x;
	}

	public void addKeyListener(){
		String packName =name.toLowerCase()+"Tools.guiEditor.controllers"; 
		String className = "KeyListenerEditor";
		File f = new File("src/"+name.toLowerCase()+"Tools/guiEditor"+"/controllers/"+className+".java");
		
		String content = "package "+packName+";"+"\n"+
		"\n"+				
		"import java.awt.*;"+"\n"+
		"import java.awt.event.*;"+"\n"+
		"import "+name.toLowerCase()+"Tools.guiEditor.graphicComponents.*;"+"\n"+
		"import "+name.toLowerCase()+"Tools.guiEditor.commands.*;"+"\n"+
		"\n"+	
		"public class "+className+ "  implements KeyListener{"+"\n"+
			"private "+name+"TextualEditor editor;"+"\n"+
			"public "+className+"("+name+"TextualEditor e){"+"\n"+
				"editor = e;"+"\n"+
			"}"+"\n"+
			
			"@Override"+"\n"+
			"public void keyPressed(KeyEvent e) {"+"\n"+
			"	int code = e.getKeyCode();"+"\n"+
			"	if (e.isControlDown()) {"+"\n"+
			"		editor.getTextPaneEditor().setBackground(Color.lightGray);"+"\n"+
			"		if (code == KeyEvent.VK_SPACE) {"+"\n"+				
			"			if (!(editor.getTextPaneEditor().getCaret().getMagicCaretPosition() == null)) {"+"\n"+
			"					editor.popupCompletion.completion();"+"\n"+
			"					editor.popupCompletion.show(editor.getTextPaneEditor(),editor.getTextPaneEditor().getCaret().getMagicCaretPosition().x+5,editor.getTextPaneEditor().getCaret().getMagicCaretPosition().y+13);"+"\n"+
			"			}"+"\n"+
			"		}"+"\n"+
			"	}"+"\n"+
			"	if (code == KeyEvent.VK_ESCAPE) {"+"\n"+
			"		//popupCompletion.setVisible(false);"+"\n"+
			"	}"+"\n"+
			"	if (e.isControlDown()) {"+"\n"+
			"		if (code == KeyEvent.VK_K) {"+"\n"+
			"			//popupCompletion = new PopupCompletion(textPaneEditor);"+"\n"+
			"			//if (!(textPaneEditor.getCaret().getMagicCaretPosition() == null)) {"+"\n"+
			"				//CommandColoration coloration = new CommandColoration(textPaneEditor, \"coloration\");"+"\n"+
			"				//coloration.execute();"+"\n"+
			"			//}"+"\n"+
			"		}"+"\n"+
			"	}"+"\n"+
			"	if (e.isControlDown()) {"+"\n"+
			"		if (code == KeyEvent.VK_SHIFT) {"+"\n"+
			"			CommandInterpretScript ci = new CommandInterpretScript(editor, \"interpret\", \"interpret\");"+"\n"+
			"			ci.execute();"+"\n"+
			"			editor.getTextPaneEditor().setBackground(Color.white);"+"\n"+
			"		}"+"\n"+
			"	}"+"\n"+
			"}"+"\n"+
			
			"@Override"+"\n"+
			"public void keyReleased(KeyEvent e) {"+"\n"+
			"	editor.getTextPaneEditor().setBackground(Color.white);"+"\n"+
			"}"+"\n"+
			
			"@Override"+"\n"+
			"public void keyTyped(KeyEvent e) {"+"\n"+
			"	editor.getTextPaneEditor().setBackground(Color.white);"+"\n"+
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
	
	public void addDocumentListener(){
		String packName =name.toLowerCase()+"Tools.guiEditor.controllers"; 
		String className = "DocumentListenerEditor";
		File f = new File("src/"+name.toLowerCase()+"Tools/guiEditor"+"/controllers/"+className+".java");
		
		String content = "package "+packName+";"+"\n"+
		"\n"+				
		"import java.awt.*;"+"\n"+
		"import java.util.regex.*;"+"\n"+
		"import javax.swing.*;"+"\n"+
		"import javax.swing.event.*;"+"\n"+
		"import javax.swing.text.*;"+"\n"+
		"import javax.swing.event.*;"+"\n"+
		"import "+name.toLowerCase()+"Tools.guiEditor.graphicComponents.*;"+"\n"+
		"public class "+className+ "  implements DocumentListener{"+"\n"+
		"\n"+	
		"	private "+name+"TextualEditor editor;"+"\n"+
		"	public "+className+"("+name+"TextualEditor e){"+"\n"+
		"		editor = e;"+"\n"+
		"	}"+"\n"+
			
		"	@Override"+"\n"+
		"	public void changedUpdate(DocumentEvent e) {"+"\n"+
		"		// TODO Auto-generated method stub	"+"\n"+	
		"	}"+"\n"+

		"	@Override"+"\n"+
		"	public void insertUpdate(DocumentEvent e) {	"+"\n"+	
		"		Runnable r = new Runnable() {"+"\n"+
		"			@Override"+"\n"+
		"			public void run() {"+"\n"+
		"				coloration();"+"\n"+
		"			}"+"\n"+
		"		};"+"\n"+
		"		SwingUtilities.invokeLater(r);"+"\n"+
		"	}"+"\n"+

		"	@Override"+"\n"+
		"	public void removeUpdate(DocumentEvent e) {"+"\n"+
		"		// TODO Auto-generated method stub"+"\n"+
				
		"	}"+"\n"+
		
		"	public void coloration() {"+"\n"+
		"		String text = editor.getTextPaneEditor().getText().replaceAll(\"\\n\", \" \");"+"\n"+
		"		final StyledDocument doc = editor.getTextPaneEditor().getStyledDocument();"+"\n"+
		"		final MutableAttributeSet normal = new SimpleAttributeSet();"+"\n"+
		"		StyleConstants.setForeground(normal, Color.black);"+"\n"+
		"		StyleConstants.setBold(normal, false);"+"\n"+
		"		SwingUtilities.invokeLater(new Runnable() {"+"\n"+
		"			public void run() {"+"\n"+
		"				doc.setCharacterAttributes(0, doc.getLength(), normal, true);"+"\n"+
		"			}"+"\n"+
		"		});"+"\n"+
		"		colorationPrimitives(text, doc);"+"\n"+
		"		colorationPolicyScript(text, doc);"+"\n"+
		"	}"+"\n"+
			
		"	public void colorationPrimitives(String text, final StyledDocument doc){"+"\n"+
		"		for (String statements : editor.primitives) {"+"\n"+
		"			Pattern p = Pattern.compile(\"(\" + statements + \")\");"+"\n"+
		"			Matcher m = p.matcher(text);"+"\n"+
		"			while (m.find() == true) {"+"\n"+
		"				MutableAttributeSet attri = new SimpleAttributeSet();"+"\n"+
		"				StyleConstants.setForeground(attri, Color.blue);"+"\n"+
		"				StyleConstants.setBold(attri, true);"+"\n"+
		"				final int start = m.start(0);"+"\n"+
		"				final int end = m.end(0);"+"\n"+
		"				final int length = end - start;"+"\n"+
		"				final MutableAttributeSet style = attri;"+"\n"+
		"				SwingUtilities.invokeLater(new Runnable() {"+"\n"+
		"					public void run() {"+"\n"+
		"						doc.setCharacterAttributes(start, length, style, true);"+"\n"+
		"					}"+"\n"+
		"				});"+"\n"+
		"			}"+"\n"+
		"		}"+"\n"+
		"	}"+"\n"+
			
		"	public void colorationPolicyScript(String text, final StyledDocument doc){"+"\n"+
		"		Pattern p = Pattern.compile(\"("+name+"Script)\");"+"\n"+
		"		Matcher m = p.matcher(text);"+"\n"+
		"		while (m.find() == true) {"+"\n"+
		"			MutableAttributeSet attri = new SimpleAttributeSet();"+"\n"+
		"			StyleConstants.setForeground(attri, Color.orange);"+"\n"+
		"			StyleConstants.setBold(attri, true);"+"\n"+
		"			final int start = m.start(0);"+"\n"+
		"			final int end = m.end(0);"+"\n"+
		"			final int length = end - start;"+"\n"+
		"			final MutableAttributeSet style = attri;"+"\n"+
		"			SwingUtilities.invokeLater(new Runnable() {"+"\n"+
		"				public void run() {"+"\n"+
		"					doc.setCharacterAttributes(start, length, style, true);"+"\n"+
		"				}"+"\n"+
		"			});"+"\n"+
		"		}"+"\n"+
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

	
	public void addModelListener(){
		String packName =name.toLowerCase()+"Tools.guiEditor.controllers"; 
		String className = name+"Listener";
		File f = new File("src/"+name.toLowerCase()+"Tools/guiEditor"+"/controllers/"+className+".java");
		
		String content = "package "+packName+";"+"\n"+
		"import "+name.toLowerCase()+"Tools.guiEditor.graphicComponents.*;"+"\n"+
		"\n"+				
		"public class "+className+ " {"+"\n"+
		"\n"+	
		"	private "+name+"TextualEditor editor;"+"\n"+
		"	public "+className+"("+name+"TextualEditor e){"+"\n"+
		"		editor = e;"+"\n"+
		"	}"+"\n"+
		"	public void listen(){"+"\n"+
		"	}"+"\n"+
		"}";
		String existingFile = read(f);
		if (existingFile.equals("")) {
			System.out.println("file do not exist");
			FileWriterO fw = new FileWriterO();
			System.out.println(f.getAbsolutePath());
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			fw.writeStringOnFile(content, f.getAbsolutePath());
		} else {
			System.out.println(existingFile);
		}
	}
	
	/** Read the contents of the given file. */
	public String read(File f) {
		System.out.println(f.getAbsolutePath());
		StringBuilder text = new StringBuilder();
		String NL = System.getProperty("line.separator");
		Scanner scanner = null;
		try {
			scanner = new Scanner(new FileInputStream(f));
		} catch (FileNotFoundException e) {
			return "";
		}
		try {
			while (scanner.hasNextLine()) {
				text.append(scanner.nextLine() + NL);
			}
		} finally {
			scanner.close();
		}
		return text.toString();
	}
	
}

