package kevoreeTools.guiEditor.commands;
import javax.swing.Action;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import kevoreeTools.guiEditor.graphicComponents.KevoreeTextualEditor;
public class Command implements ICommand,Action{
private String name, description;
public KevoreeTextualEditor editor;
	public Command(KevoreeTextualEditor e,String nme,String desc){
		editor = e;
		name = nme;
		description= desc;	
	}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public void addPropertyChangeListener(PropertyChangeListener arg0) {
}
@Override
public Object getValue(String arg0) {
	return null;
}
@Override
public boolean isEnabled() {
	return true;
}
@Override
public void putValue(String arg0, Object arg1) {
}
@Override
public void removePropertyChangeListener(PropertyChangeListener arg0) {
	// TODO Auto-generated method stub
}
@Override
public void setEnabled(boolean arg0) {
	// TODO Auto-generated method stub
}
@Override
public void actionPerformed(ActionEvent arg0) {
	execute();
}
@Override
public void execute() {
	// TODO Auto-generated method stub
}
}