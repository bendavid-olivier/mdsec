package kevoreeTools.guiEditor.commands;
import kevoreeTools.guiEditor.graphicComponents.KevoreeTextualEditor;
import javax.swing.text.BadLocationException;
import kevoreeTools.editor.KevoreeEditor;
import java.lang.reflect.*;
public class CommandCompletion extends Command{
	public CommandCompletion(KevoreeTextualEditor e, String nme, String desc) {
		super(e, nme, desc);
	}
	@Override
	public void execute() {
		//to insert the selected string into the document
		int pos =editor.getTextPaneEditor().getCaretPosition() -1;
		String content = null;
		try {
			content = editor.getTextPaneEditor().getText(0, pos + 1);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		int w;
		for (w = pos; w >= 0; w--) {
			if (!Character.isLetter(content.charAt(w))) {
				break;
			}
		}
		String prefix = content.substring(w + 1).toLowerCase();
		try {	
			String toInsert = getName().substring(prefix.length(),getName().length());
			String[] args = null;
			for(Method m : KevoreeEditor.class.getMethods()){
				if (m.getName().equals(getName())){
					if(!(m.getParameterTypes().length == 0)){
						args = new String[m.getParameterTypes().length];
					}
					int cpt = 0;
					for(Class c : m.getParameterTypes()){
						args[cpt]= c.getSimpleName();
						cpt = cpt+1;
					}
				}
			}
			toInsert = toInsert + "(";
			if(! (args == null)){
				for(int i = 0;i<args.length;i++){
					if(i == (args.length - 1)){
						toInsert = toInsert + args[i];
					}
					else
					{
						toInsert = toInsert + args[i]+",";
					}
				}
			}
			toInsert = toInsert + ");";
			editor.getTextPaneEditor().getDocument().insertString(pos + 1, toInsert, null);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}
}