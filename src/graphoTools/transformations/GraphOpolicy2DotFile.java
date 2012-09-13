package graphoTools.transformations;

import grapho.*;
import grapho.impl.*;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;


import utils.writer.FileWriterO;


/**
 * This class allows to transform a Graph0 representing a policy into a dot File
 * @author obendavi
 *
 */

public class GraphOpolicy2DotFile {

	private GraphO grapho;
	
	public GraphOpolicy2DotFile(GraphO g){
		grapho =g;
	}
	
	public File transformation(String path) {
		String output = "";
		output = output + "digraph G { \n";	

		for (GraphElement e : grapho.getElements()) {
			if (e instanceof NodeImpl){
				output = output + e.getName()+ " [color=" + ((Node)e).getColor() + " shape=" + ((Node)e).getShape()+" style=" + ((Node)e).getStyle() + " label=" +((Node)e).getLabel()+"  ];\n";
			}
		}
		for (GraphElement e : grapho.getElements()) {
			if (e instanceof EdgeImpl){
				output = output +  ((Edge)e).getNodeA().getName() + " -> " + ((Edge)e).getNodeB().getName() + "[constraint=" + ((Edge)e).isConstraintRank() +  " color=" + ((Edge)e).getColor()+" style=" + ((Edge)e).getStyle() + "]" + ";\n";
			}
		}
		output = output + "}";
		
		FileWriterO fw = new FileWriterO();
		File f = fw.writeStringOnFile(output, path);
		return f;
	}
}
