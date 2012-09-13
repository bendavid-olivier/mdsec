package utils.editorGenerator.transformationGenerator;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import utils.writer.FileWriterO;

public class TransfoEditorGenerator {

private String name;
	
	public TransfoEditorGenerator(String s){
		name = s;
	}
	
	public void addModelScript2Model(){
		String packName =name.toLowerCase()+"Tools.transformations"; 
		String className = name+"Script2"+name;
		File f = new File("src/"+name.toLowerCase()+"Tools/transformations/"+className+".java");
		String scriptName =  name+"Script";
		String content = "package "+packName+";"+"\n"+			

			"import java.lang.reflect.InvocationTargetException;"+"\n"+
			"import java.lang.reflect.Method;"+"\n"+
			"import java.util.ArrayList;"+"\n"+
			"import "+name.toLowerCase()+"Tools.editor."+name+"Editor;"+ "\n"+
			"import "+name.toLowerCase()+".*;"+"\n"+

			"public class "+className+ "{"+"\n"+

				"private String script;"+"\n"+
				"private ArrayList<String> primitives;"+"\n"+
				
				"public "+className+ "(String txt) {"+"\n"+
					"script = txt.replaceAll(\"\\n\", \" \");"+"\n"+
					"script = script.substring(script.indexOf(\""+scriptName+"{\") + "+scriptName.length()+"+"+1+",script.indexOf(\"}\"));"+"\n"+
					"script = script.replace(\" \", \"\");"+"\n"+
					"primitives = new ArrayList<String>();"+"\n"+
					"initPrimitives();"+"\n"+
				"}"+"\n"+

				"public void initPrimitives() {"+"\n"+
					"for (Method m : "+name+"Editor.class.getMethods()){"+"\n"+
						"primitives.add(m.getName());"+"\n"+
					"}"+"\n"+
				"}"+"\n"+

				"public "+name+" transformation() {"+"\n"+
					"    "+name+" "+ name.toLowerCase()+"= "+name.substring(0, 1).toUpperCase()+name.substring(1,name.length()).toLowerCase()+"Factory.eINSTANCE.create"+name+"();"+"\n"+
					"    "+name.toLowerCase()+"Tools.editor."+name+"Editor "+name.toLowerCase()+"Editor = new "+name.toLowerCase()+"Tools.editor."+name+"Editor("+name.toLowerCase()+");"+"\n"+
					"	 parseExpressions("+name.toLowerCase()+"Editor);"+"\n"+
						 "return "+name.toLowerCase()+";"+"\n"+
				"}"+"\n"+
				
				"public void transformation("+name+" "+name.toLowerCase()+") {"+"\n"+
					"    "+name.toLowerCase()+"Tools.editor."+name+"Editor "+name.toLowerCase()+"Editor = new "+name.toLowerCase()+"Tools.editor."+name+"Editor("+name.toLowerCase()+");"+"\n"+
					"	 parseExpressions("+name.toLowerCase()+"Editor);"+"\n"+
				"}"+"\n"+

				"public void parseExpressions("+name.toLowerCase()+"Tools.editor."+name+"Editor "+name.toLowerCase()+"Editor) {"+"\n"+
					"for (String expr : script.split(\";\")) {"+"\n"+
						"String exprPrim = expr.substring(0,expr.indexOf(\"(\"));"+"\n"+
						"for (String prim : primitives) {"+"\n"+
							"if (exprPrim.equals(prim)) {"+"\n"+
								"triggerMethod("+name.toLowerCase()+"Editor, parseExpressionArguments(expr) ,prim);"+"\n"+
							"}"+"\n"+
						"}"+"\n"+
					"}"+"\n"+
				"}"+"\n"+

				"public java.lang.Object[] parseExpressionArguments(String expr) {"+"\n"+
					"String txt = expr.substring(expr.indexOf(\"(\") + 1, expr.indexOf(\")\"));"+"\n"+
					"java.lang.Object[] args = new java.lang.Object[txt.split(\",\").length];"+"\n"+
					"int cpt = 0;"+"\n"+
					"for (String arg : txt.split(\",\")) {"+"\n"+
						"args[cpt] = arg;"+"\n"+
						"cpt=cpt+1;"+"\n"+
					"}"+"\n"+
					"return args;"+"\n"+
				"}"+"\n"+

				"public void triggerMethod(java.lang.Object o, java.lang.Object[] args, String nomMethode) {"+"\n"+
					"Class[] paramTypes = null;"+"\n"+
					"if (args != null) {"+"\n"+
				"		paramTypes = new Class[args.length];"+"\n"+
				"		for (int i = 0; i < args.length; i++) {"+"\n"+
				"			boolean isInt = true;"+"\n"+
				"			for(char c : args[i].toString().toCharArray()){"+"\n"+
				"				if (!((c =='0')||(c =='1')||(c =='2')||(c =='3')||(c =='4')||(c =='5')||(c =='6')||(c =='7')||(c =='8')||(c =='9'))){"+"\n"+
				"					isInt = false;"+"\n"+
				"				}"+"\n"+
				"			}"+"\n"+
				"			if(isInt){"+"\n"+
				"				paramTypes[i] = int.class;"+"\n"+
				"				int arg = Integer.parseInt((String) args[i]);"+"\n"+
				"				args[i] = arg;"+"\n"+
				"			}"+"\n"+
				"			else if(args[i].toString().equals(\"true\")){"+"\n"+
				"				paramTypes[i] = boolean.class;"+"\n"+
				"				boolean arg = true;"+"\n"+
				"				args[i] = arg;"+"\n"+
				"			}"+"\n"+
				"			else if(args[i].toString().equals(\"false\")){"+"\n"+
				"				paramTypes[i] = boolean.class;"+"\n"+
				"				boolean arg = false;"+"\n"+
				"				args[i] = arg;"+"\n"+
				"			}"+"\n"+
				"			else{"+"\n"+
				"			paramTypes[i] = args[i].getClass();"+"\n"+
				"			}"+"\n"+
				"		}"+"\n"+
				"	}"+"\n"+
					"Method m = null;"+"\n"+
					"try {"+"\n"+
						"m = o.getClass().getMethod(nomMethode, paramTypes);"+"\n"+
						"m.setAccessible(true);"+"\n"+
						"m.invoke(o, args);"+"\n"+
					"} catch (SecurityException e) {"+"\n"+
						"// TODO Auto-generated catch block"+"\n"+
						"e.printStackTrace();"+"\n"+
					"} catch (NoSuchMethodException e) {"+"\n"+
						"// TODO Auto-generated catch block"+"\n"+
						"e.printStackTrace();"+"\n"+
					"} catch (IllegalArgumentException e) {"+"\n"+
						"// TODO Auto-generated catch block"+"\n"+
						"e.printStackTrace();"+"\n"+
					"} catch (IllegalAccessException e) {"+"\n"+
						"// TODO Auto-generated catch block"+"\n"+
						"e.printStackTrace();"+"\n"+
					"} catch (InvocationTargetException e) {"+"\n"+
						"// TODO Auto-generated catch block"+"\n"+
						"e.printStackTrace();"+"\n"+
					"}"+"\n"+
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
	
	
	public void addModel2GraphO(){ 
		String packName =name.toLowerCase()+"Tools.transformations"; 
		String className = name+"2GraphO";
		File f = new File("src/"+name.toLowerCase()+"Tools/transformations/"+className+".java");	
		
		
		String content = "package " + packName + ";" + "\n" +
				"import "+name.toLowerCase()+".*;"+"\n"+
				"import grapho.*;"+"\n"+
			    "public class " + className + "{" + "\n" +
		    
			"	private "+name+" "+ name.toLowerCase() +";" + "\n" +
			
			"	public "+className  +"("+name+" x) {" + "\n" +
			"		"+name.toLowerCase()+" = x;" + "\n" +
			"	}" + "\n" +
			
			"	public GraphO transformation() {" + "\n" +
			"		GraphO g = GraphoFactory.eINSTANCE.createGraphO();"+"\n"+
			"	    return g;"+ "\n" +
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
	
	public void addModel2ModelScript(){ 
		String packName =name.toLowerCase()+"Tools.transformations"; 
		String className = name+"2"+name+"Script";
		File f = new File("src/"+name.toLowerCase()+"Tools/transformations/"+className+".java");	
		
		
		String content = "package " + packName + ";" + "\n" +
				"import "+name.toLowerCase()+".*;"+"\n"+
			    "public class " + className + "{" + "\n" +
		    
			"	private "+name+" "+ name.toLowerCase() +";" + "\n" +
			
			"	public "+className  +"("+name+" x) {" + "\n" +
			"		"+name.toLowerCase()+" = x;" + "\n" +
			"	}" + "\n" +
			
			"	public String transformation() {" + "\n" +
			"	   return null;"+ "\n" +
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
	      while (scanner.hasNextLine()){
	        text.append(scanner.nextLine() + NL);
	      }
	    }
	    finally{
	      scanner.close();
	    }
	    return text.toString();
	  }
	  
	
}
