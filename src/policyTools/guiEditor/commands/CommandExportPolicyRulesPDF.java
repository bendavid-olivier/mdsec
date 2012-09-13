package policyTools.guiEditor.commands;

import grapho.GraphO;
import graphoTools.transformations.GraphOpolicy2DotFile;

import java.io.File;

import policyTools.guiEditor.graphicComponents.FileChooser;
import policyTools.guiEditor.graphicComponents.PolicyTextualEditor;
import policyTools.transformations.Policy2GraphO;
import policyTools.transformations.PolicyRules2GraphO;
import utils.graphStructure.dotThings.DotDisplayer;

public class CommandExportPolicyRulesPDF extends Command{
	public CommandExportPolicyRulesPDF(PolicyTextualEditor e, String nme, String desc) {
		super(e, nme, desc);
	}
	@Override
	public void execute() {
			
			
			FileChooser fc = new FileChooser(editor);
			System.out.println(fc.getChooser().getSelectedFile().getAbsolutePath());
			String path = fc.getChooser().getSelectedFile().getAbsolutePath();
			if(! path.endsWith(".dot")){
				path = path+".dot";
			}
			
			PolicyRules2GraphO transfo2Graph = new PolicyRules2GraphO(editor.getPolicy());
			GraphO g = transfo2Graph.transformation();
			GraphOpolicy2DotFile transfo2Dot = new GraphOpolicy2DotFile(g);
			//File f = transfo2Dot.transformation("graphs/Policy.dot");
			File f = transfo2Dot.transformation(path);
			DotDisplayer.createPdfFile(f);
		    String pngPath = f.getAbsolutePath();
		    pngPath = pngPath.substring(0,f.getAbsolutePath().length()-3);
		    pngPath = pngPath+"pdf";
		    
		    
	}
}