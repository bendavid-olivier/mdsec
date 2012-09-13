package policyTools.guiEditor.graphicComponents;

import policy.*;
import policyTools.transformations.*;
import grapho.GraphO;
import graphoTools.transformations.GraphOpolicy2DotFile;

import java.awt.Color;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import utils.graphStructure.dotThings.DotDisplayer;
public class GraphMonitor extends JFrame{
private JScrollPane scroll;
private PolicyTextualEditor editor;
public GraphMonitor(PolicyTextualEditor x){
    editor =x;
    setBackground(Color.WHITE);
	Policy2GraphO transfo2Graph = new Policy2GraphO(editor.getPolicy());
	 GraphO g = transfo2Graph.transformation();
	 GraphOpolicy2DotFile transfo2Dot = new GraphOpolicy2DotFile(g);
	 File f = transfo2Dot.transformation("graphs/Policy.dot");
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

public GraphMonitor(Policy x){
	setBackground(Color.WHITE);
	Policy2GraphO transfo2Graph = new Policy2GraphO(x);
	 GraphO g = transfo2Graph.transformation();
	 GraphOpolicy2DotFile transfo2Dot = new GraphOpolicy2DotFile(g);
	 File f = transfo2Dot.transformation("graphs/Policy.dot");
	 DotDisplayer.createPngFile(f);
	 DotDisplayer.createPdfFile(f);
    String pngPath = f.getAbsolutePath();
    pngPath = pngPath.substring(0,f.getAbsolutePath().length()-3);
    pngPath = pngPath+"png";
    File pngFile = new File(pngPath);
    scroll = new JScrollPane(new ImageComponent(pngFile));
    add(scroll);
    setTitle("Graph Monitor");
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setSize(400, 400);
    setVisible(true);
}
public void update()
{
	Policy2GraphO transfo2Graph = new Policy2GraphO(editor.getPolicy());
	GraphO g = transfo2Graph.transformation();
	GraphOpolicy2DotFile transfo2Dot = new GraphOpolicy2DotFile(g);
	File f = transfo2Dot.transformation("graphs/Policy.dot");
	DotDisplayer.createPngFile(f);
    String pngPath = f.getAbsolutePath();
    pngPath = pngPath.substring(0,f.getAbsolutePath().length()-3);
    pngPath = pngPath+"png";
    File pngFile = new File(pngPath);
    setContentPane(new JScrollPane(new ImageComponent(pngFile)));
}
}