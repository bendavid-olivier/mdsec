package policyTools.guiEditor.graphicComponents;

import java.awt.Dimension;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class ConsoleEditor extends JScrollPane{
	
	private JTextPane output;	
	public ConsoleEditor(){	
		Dimension d =new Dimension(600, 150);
		setSize(d);
		setPreferredSize(d);
		setMinimumSize(d);
		
		output = new JTextPane();
		setViewportView(output);
	}
	
	public void print(String txt){
		Locale locale = Locale.getDefault();
		DateFormat dateFormat = new SimpleDateFormat("hh'h'mm dd-MM-yy");
		String timeStamp = dateFormat.format(new Date());
		output.setText(output.getText() +"\n"+ timeStamp+"\n"+txt);
	}
	
}
