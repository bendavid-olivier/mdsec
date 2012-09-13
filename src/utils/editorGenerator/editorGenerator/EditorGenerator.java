package utils.editorGenerator.editorGenerator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import utils.writer.FileWriterO;

public class EditorGenerator {
	
	private String name;

	public EditorGenerator(String s) {
		name = s;
	}

	public void addEditor() {
		String packName = name.toLowerCase() + "Tools.editor";
		String className = name+"Editor";
		File f = new File("src/" + name.toLowerCase() + "Tools/editor/"
				+ className + ".java");
		String content = "package " + packName  +";" + "\n" +
				"import "+name.toLowerCase()+".*;"+"\n"+
			    //"public class " + className + " implements "+name.toLowerCase()+"."+className+  "{" + "\n" +
			    "public class " + className +  "{" + "\n" +
		    
			"	private "+name+" "+ name.toLowerCase() +";" + "\n" +
			
			"	public "+className+"("+name+" x) {" + "\n" +
			"		"+name.toLowerCase()+" = x;" + "\n" +
			"	}" + "\n" +
			
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
