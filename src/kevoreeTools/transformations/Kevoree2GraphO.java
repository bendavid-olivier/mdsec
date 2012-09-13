package kevoreeTools.transformations;
import kevoree.*;
import grapho.*;
public class Kevoree2GraphO{
	private ContainerRoot kevoree;
	public Kevoree2GraphO(ContainerRoot x) {
		kevoree = x;
	}
	public GraphO transformation() {
		GraphO g = GraphoFactory.eINSTANCE.createGraphO();
	    return g;
	}
}