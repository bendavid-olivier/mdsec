package kevoreeTools.guiEditor.commands;
import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import kevoree.*;
import kevoreeTools.guiEditor.graphicComponents.*;
public class CommandSave extends Command{
	public CommandSave(KevoreeTextualEditor e, String nme, String desc) {
		super(e, nme, desc);
	}
	public void execute(){
	ResourceSet resourceSetMetamodel;
	Resource resourceModel;
	// REGISTER THE METAMODEL
	resourceSetMetamodel = new ResourceSetImpl();
	resourceSetMetamodel.getPackageRegistry().put(KevoreePackage.eNS_URI,
	KevoreePackage.eINSTANCE);
	resourceSetMetamodel.getResourceFactoryRegistry()
	.getExtensionToFactoryMap()
	.put("xmi", new XMIResourceFactoryImpl());
	FileChooser fc = new FileChooser(editor);
	System.out.println(fc.getChooser().getSelectedFile().getAbsolutePath());
	String path = fc.getChooser().getSelectedFile().getAbsolutePath();
	 // SAVE THE MODEL
	 resourceModel = resourceSetMetamodel.createResource(URI
	 .createFileURI(path));
	 resourceModel.getContents().add(editor.getKevoree());
	 try {
	 resourceModel.save(null);
	 } catch (IOException e) {
	 System.out.println("error during the model saving step");
	 e.printStackTrace();
	 }
	 }
}