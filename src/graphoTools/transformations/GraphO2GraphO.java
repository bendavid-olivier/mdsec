package graphoTools.transformations;
import grapho.*;
import grapho.*;
public class GraphO2GraphO{
	private GraphO grapho;
	public GraphO2GraphO(GraphO x) {
		grapho = x;
	}
	public GraphO transformation() {
		GraphO g = GraphoFactory.eINSTANCE.createGraphO();
	    return g;
	}
}