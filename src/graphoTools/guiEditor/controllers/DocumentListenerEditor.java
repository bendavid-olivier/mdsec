package graphoTools.guiEditor.controllers;

import java.awt.*;
import java.util.regex.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
import javax.swing.event.*;
import graphoTools.guiEditor.graphicComponents.*;
public class DocumentListenerEditor  implements DocumentListener{

	private GraphOTextualEditor editor;
	public DocumentListenerEditor(GraphOTextualEditor e){
		editor = e;
	}
	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void insertUpdate(DocumentEvent e) {	
		Runnable r = new Runnable() {
			@Override
			public void run() {
				coloration();
			}
		};
		SwingUtilities.invokeLater(r);
	}
	@Override
	public void removeUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
	}
	public void coloration() {
		String text = editor.getTextPaneEditor().getText().replaceAll("\n", " ");
		final StyledDocument doc = editor.getTextPaneEditor().getStyledDocument();
		final MutableAttributeSet normal = new SimpleAttributeSet();
		StyleConstants.setForeground(normal, Color.black);
		StyleConstants.setBold(normal, false);
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				doc.setCharacterAttributes(0, doc.getLength(), normal, true);
			}
		});
		colorationPrimitives(text, doc);
		colorationPolicyScript(text, doc);
	}
	public void colorationPrimitives(String text, final StyledDocument doc){
		for (String statements : editor.primitives) {
			Pattern p = Pattern.compile("(" + statements + ")");
			Matcher m = p.matcher(text);
			while (m.find() == true) {
				MutableAttributeSet attri = new SimpleAttributeSet();
				StyleConstants.setForeground(attri, Color.blue);
				StyleConstants.setBold(attri, true);
				final int start = m.start(0);
				final int end = m.end(0);
				final int length = end - start;
				final MutableAttributeSet style = attri;
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						doc.setCharacterAttributes(start, length, style, true);
					}
				});
			}
		}
	}
	public void colorationPolicyScript(String text, final StyledDocument doc){
		Pattern p = Pattern.compile("(GraphOScript)");
		Matcher m = p.matcher(text);
		while (m.find() == true) {
			MutableAttributeSet attri = new SimpleAttributeSet();
			StyleConstants.setForeground(attri, Color.orange);
			StyleConstants.setBold(attri, true);
			final int start = m.start(0);
			final int end = m.end(0);
			final int length = end - start;
			final MutableAttributeSet style = attri;
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					doc.setCharacterAttributes(start, length, style, true);
				}
			});
		}
	}
}