package utils.editorGenerator.generatorGenerator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import utils.writer.FileWriterO;

public class GeneratorGenerator {

	private String name;

	public GeneratorGenerator(String s) {
		name = s;
	}

	public void addGenerator() {
		String packName = name.toLowerCase() + "Tools.generator";
		String className = "Generator";
		File f = new File("src/" + name.toLowerCase() + "Tools/generator/"
				+ className + ".java");
		String content = "package " + packName + ";" + "\n" +
				"import "+name.toLowerCase()+".*;"+"\n"+
			    "public class " + className + "{" + "\n" +
		    
			"	private "+name+" "+ name.toLowerCase() +";" + "\n" +
			
			"	public Generator("+name+" x) {" + "\n" +
			"		"+name.toLowerCase()+" = x;" + "\n" +
			"	}" + "\n" +
			
			"	public void generateModelExample() {" + "\n" +
			"		"+name.toLowerCase()+" = "+name.substring(0, 1).toUpperCase()+name.substring(1,name.length()).toLowerCase()+"Factory.eINSTANCE.create"+name+"();"+"\n"+		
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
