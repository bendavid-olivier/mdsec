package graphoTools.editor;

import grapho.*;
import grapho.impl.*;

public class GraphOEditor {

	private GraphO graphO;
	private GraphoFactory factory;
	
	public GraphOEditor(GraphO g){
		graphO = g;
		factory = GraphoFactory.eINSTANCE;
	}

	
	public Node getNodeByName(String nodeName) {
		Node res = null;
		for (GraphElement e : graphO.getElements()) {
			if (e instanceof NodeImpl && e.getName().equals(nodeName)) {
				res = (Node) e;
			}
		}
		return res;
	}
	
	public void addNode(String e) {
		if (getNodeByName(e) == null){
			Node n = GraphoFactory.eINSTANCE.createNode();
			n.setColor("black");
			n.setLabel(e);
			n.setName(e);
			n.setShape("ellipse");
			n.setStyle("solid");		
			graphO.getElements().add(n);
		}
	}
	
	public void addNode(String e, String color) {
		if (getNodeByName(e) == null){
			Node n = GraphoFactory.eINSTANCE.createNode();
			n.setColor(color);
			n.setLabel(e);
			n.setName(e);
			n.setShape("ellipse");
			n.setStyle("solid");		
			graphO.getElements().add(n);
		}
	}
	
	public Edge getEdgeByName(String edgeName) {
		Edge res = null;
		for (GraphElement e : graphO.getElements()) {
			if (e instanceof EdgeImpl && e.getName().equals(edgeName)) {
				res = (Edge) e;
			}
		}
		return res;
	}
	
	public void addEdge(String n1,String n2){
		if (getEdgeByName(n1+n2) == null){
			Edge ed = GraphoFactory.eINSTANCE.createEdge();
			ed.setName(n1+n2);
			ed.setColor("black");
			ed.setStyle("solid");
			ed.setConstraintRank(true);
			ed.setNodeA(getNodeByName(n1));
			ed.setNodeB(getNodeByName(n2));
			graphO.getElements().add(ed);
		}
	}
}
