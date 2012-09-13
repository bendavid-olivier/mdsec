package policyTools.guiEditor.graphicComponents;

import java.awt.Dimension;

import javax.swing.JTabbedPane;

public class OutputEditor extends JTabbedPane{

	public ConsoleEditor consoleEditor;
	public PolicyRules policyRules;
	public PolicyRulesActivated policyRulesActivated;
	public EnforcedPolicyRules enforcedPolicyRules;
	public ErrorEnforcement errorEnforcement;
	
	
	public OutputEditor(){
		
		Dimension d = new Dimension(600, 200); 
		setSize(d);
		setMaximumSize(d);
		setMinimumSize(d);
		setPreferredSize(d);
		
		consoleEditor = new ConsoleEditor();
		policyRules = new PolicyRules();
		policyRulesActivated = new PolicyRulesActivated();
		enforcedPolicyRules = new EnforcedPolicyRules();
		errorEnforcement = new ErrorEnforcement();
		
		addTab("Console", consoleEditor);
		addTab("Rules", policyRules);
		addTab("Rules activated", policyRulesActivated);
		addTab("Enforced rules", enforcedPolicyRules);
		addTab("Error Enforcement", errorEnforcement);
	}
}