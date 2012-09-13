package kevoreeTools.transformations;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kevoreeTools.editor.KevoreeEditor;
import kevoree.*;
public class KevoreeScript2Kevoree{
private String script;
private ArrayList<String> primitives;
public KevoreeScript2Kevoree(String txt) {
script = txt.replaceAll("\n", " ");
script = script.substring(script.indexOf("KevoreeScript{") + 13+1,script.indexOf("}"));
script = script.replace(" ", "");
primitives = new ArrayList<String>();
initPrimitives();
}
public void initPrimitives() {
for (Method m : KevoreeEditor.class.getMethods()){
primitives.add(m.getName());
}
}
public ContainerRoot transformation() {
	ContainerRoot kevoree= KevoreeFactory.eINSTANCE.createContainerRoot();
    kevoreeTools.editor.KevoreeEditor kevoreeEditor = new kevoreeTools.editor.KevoreeEditor(kevoree);
	 parseExpressions(kevoreeEditor);
return kevoree;
}
public void transformation(ContainerRoot kevoree) {
    kevoreeTools.editor.KevoreeEditor kevoreeEditor = new kevoreeTools.editor.KevoreeEditor(kevoree);
	 parseExpressions(kevoreeEditor);
}
public void parseExpressions(kevoreeTools.editor.KevoreeEditor kevoreeEditor) {
for (String expr : script.split(";")) {
String exprPrim = expr.substring(0,expr.indexOf("("));
for (String prim : primitives) {
if (exprPrim.equals(prim)) {
triggerMethod(kevoreeEditor, parseExpressionArguments(expr) ,prim);
}
}
}
}
public java.lang.Object[] parseExpressionArguments(String expr) {
String txt = expr.substring(expr.indexOf("(") + 1, expr.indexOf(")"));
java.lang.Object[] args = new java.lang.Object[txt.split(",").length];
int cpt = 0;
for (String arg : txt.split(",")) {
args[cpt] = arg;
cpt=cpt+1;
}
return args;
}
public void triggerMethod(java.lang.Object o, java.lang.Object[] args, String nomMethode) {
Class[] paramTypes = null;
if (args != null) {
		paramTypes = new Class[args.length];
		for (int i = 0; i < args.length; i++) {
			boolean isInt = true;
			for(char c : args[i].toString().toCharArray()){
				if (!((c =='0')||(c =='1')||(c =='2')||(c =='3')||(c =='4')||(c =='5')||(c =='6')||(c =='7')||(c =='8')||(c =='9'))){
					isInt = false;
				}
			}
			if(isInt){
				paramTypes[i] = int.class;
				int arg = Integer.parseInt((String) args[i]);
				args[i] = arg;
			}
			else if(args[i].toString().equals("true")){
				paramTypes[i] = boolean.class;
				boolean arg = true;
				args[i] = arg;
			}
			else if(args[i].toString().equals("false")){
				paramTypes[i] = boolean.class;
				boolean arg = false;
				args[i] = arg;
			}
			else{
			paramTypes[i] = args[i].getClass();
			}
		}
	}
Method m = null;
try {
m = o.getClass().getMethod(nomMethode, paramTypes);
m.setAccessible(true);
m.invoke(o, args);
} catch (SecurityException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (NoSuchMethodException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (IllegalArgumentException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (IllegalAccessException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (InvocationTargetException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}