package policyTools.guiEditor.commands;
import policyTools.guiEditor.graphicComponents.PolicyTextualEditor;




public class CommandSimulation extends Command{
	public CommandSimulation(PolicyTextualEditor e, String nme, String desc) {
		super(e, nme, desc);
	}
	@Override
	public void execute() {
		CommandLoadModelExample loadModelExample = new CommandLoadModelExample(editor, "loadME", "loadME");
		loadModelExample.execute();		
		editor.simulation.loadTypes();
		editor.simulation.kevoreeListener.listen();
		editor.simulation.initSimulationArchitecturalChanges();
		
	}
}