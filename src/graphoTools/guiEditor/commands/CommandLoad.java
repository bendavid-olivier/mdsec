package graphoTools.guiEditor.commands;
import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import grapho.*;
import graphoTools.guiEditor.graphicComponents.*;
public class CommandLoad extends Command{
	public CommandLoad(GraphOTextualEditor e, String nme, String desc) {
		super(e, nme, desc);
	}
	public void execute(){
	ResourceSet resourceSetMetamodel;
	Resource resourceModel;
	// REGISTER THE METAMODEL
	resourceSetMetamodel = new ResourceSetImpl();
	resourceSetMetamodel.getPackageRegistry().put(GraphoPackage.eNS_URI,
	GraphoPackage.eINSTANCE);
	resourceSetMetamodel.getResourceFactoryRegistry()
	.getExtensionToFactoryMap()
	.put("xmi", new XMIResourceFactoryImpl());
	FileChooser fc = new FileChooser(editor);
	System.out.println(fc.getChooser().getSelectedFile().getAbsolutePath());
	String path = fc.getChooser().getSelectedFile().getAbsolutePath();
	// LOAD THE MODEL
	resourceModel = resourceSetMetamodel.createResource(URI
	.createFileURI(path));
	try {
	resourceModel.load(null);
	} catch (IOException e) {
	System.out.println("error during the model loading step");
	e.printStackTrace();
	}
	// INSTANTIATE ROOTELEMENT WITH THE CONTAINERROOT OF THE LOADED MODEL
	editor.setGraphO((GraphO) resourceModel.getContents().get(0));
	// getEditor().graphMonitorPolicy.update();
	 }
}