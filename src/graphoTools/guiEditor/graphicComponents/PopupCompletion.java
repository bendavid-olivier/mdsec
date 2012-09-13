package graphoTools.guiEditor.graphicComponents;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.text.BadLocationException;
import graphoTools.guiEditor.commands.CommandCompletion;

public class PopupCompletion extends JPopupMenu{
	private ArrayList<String> propositions;
	private GraphOTextualEditor editor;
	public PopupCompletion(GraphOTextualEditor e){
		super();
		editor = e;
		propositions =new ArrayList<String>();
	}

	public void updateItems(){
		removeAll();
		for(String s : propositions){
			JMenuItem menu = new JMenuItem(s);
			CommandCompletion c = new CommandCompletion(editor, s, s);
			menu.setAction(c);
			menu.setText(s);
			menu.setName(s);
			menu.setVisible(true);
			add(menu);
		}
	}

	public void completion() {
		int pos = editor.getTextPaneEditor().getCaretPosition() - 1;
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
		if (pos - w < 1) {
			propositions.clear();
			for (String val : editor.primitives) {
				propositions.add(val);
			}
			updateItems();
			return;
		}
		String prefix = content.substring(w + 1);
		int n = Collections.binarySearch(editor.primitives, prefix);
		if (n < 0 && -n <= editor.primitives.size()) {
			propositions.clear();
			for (String val : editor.primitives) {
				if (val.startsWith(prefix)) {
					propositions.add(val);
				}
			}
		}
		updateItems();
	}
}