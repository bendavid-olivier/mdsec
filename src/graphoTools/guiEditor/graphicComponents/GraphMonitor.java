package graphoTools.guiEditor.graphicComponents;

import grapho.*;
import graphoTools.transformations.*;
import graphoTools.transformations.GraphO2GraphO;
import grapho.GraphO;
import graphoTools.transformations.GraphOpolicy2DotFile;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import utils.graphStructure.dotThings.DotDisplayer;
public class GraphMonitor extends JFrame{
private JScrollPane scroll;
private GraphOTextualEditor editor;
public GraphMonitor(GraphOTextualEditor x){
    editor =x;
	GraphO2GraphO transfo2Graph = new GraphO2GraphO(editor.getGraphO());
	 GraphO g = transfo2Graph.transformation();
	 GraphOpolicy2DotFile transfo2Dot = new GraphOpolicy2DotFile(g);
	 File f = transfo2Dot.transformation("graphs/GraphO.dot");
	 DotDisplayer.createPngFile(f);
    String pngPath = f.getAbsolutePath();
    pngPath = pngPath.substring(0,f.getAbsolutePath().length()-3);
    pngPath = pngPath+"png";
    File pngFile = new File(pngPath);
    scroll = new JScrollPane(new ImageComponent(pngFile));
    add(scroll);
    setTitle("Graph Monitor");
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setSize(400, 400);
}
public void update()
{
	GraphO2GraphO transfo2Graph = new GraphO2GraphO(editor.getGraphO());
	GraphO g = transfo2Graph.transformation();
	GraphOpolicy2DotFile transfo2Dot = new GraphOpolicy2DotFile(g);
	File f = transfo2Dot.transformation("graphs/GraphO.dot");
	DotDisplayer.createPngFile(f);
    String pngPath = f.getAbsolutePath();
    pngPath = pngPath.substring(0,f.getAbsolutePath().length()-3);
    pngPath = pngPath+"png";
    File pngFile = new File(pngPath);
    setContentPane(new JScrollPane(new ImageComponent(pngFile)));
}
}