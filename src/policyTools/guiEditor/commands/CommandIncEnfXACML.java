package policyTools.guiEditor.commands;
import policyTools.guiEditor.controllers.PolicyListener;
import policyTools.guiEditor.graphicComponents.PolicyTextualEditor;
import javax.swing.Action;
public class CommandIncEnfXACML extends Command{
	public CommandIncEnfXACML(PolicyTextualEditor e, String nme, String desc) {
		super(e, nme, desc);
	}
	@Override 
	public void execute() {
			editor.getPolicyListener().setCURRENT_MODE(PolicyListener.MODE_XACML);
	 }
}