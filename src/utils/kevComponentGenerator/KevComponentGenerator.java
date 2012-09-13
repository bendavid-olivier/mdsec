package utils.kevComponentGenerator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

import policy.Operation;
import policy.Permission;
import policy.Policy;
import policy.PolicyElement;
import policy.PolicyFactory;
import policy.Role;
import policy.impl.ObjectImpl;
import policy.impl.RoleImpl;
import policyTools.editor.PolicyEditor;
import policyTools.guiEditor.graphicComponents.GraphMonitor;

import utils.writer.FileWriterO;

public class KevComponentGenerator {
	
	
	
	public void mdsec(String policyName){
		Policy policy = PolicyFactory.eINSTANCE.createPolicy();
		policy.setName(policyName);
		PolicyEditor pe = new PolicyEditor(policy);
		pe.setMainPolicyName(policyName);
		pe.addPolicyUser(policyName, "user");
		pe.addPolicyRole(policyName, "Buyer");
		pe.addPolicyRole(policyName, "Seller");
		pe.addPolicyPermission(policyName, "perm");
		pe.addPolicyPermission(policyName, "perm2");
		pe.addPolicyOperation(policyName, "bid");
		pe.addPolicyOperation(policyName, "register");
		pe.addPolicyOperation(policyName, "create");
		pe.addPolicyOperation(policyName, "delete");
		pe.addPolicyObject(policyName, "Sale");
		pe.addPolicyObject(policyName, "SaleManager");
		
		pe.addPolicyUserRole(policyName, "user", "Buyer");
		pe.addPolicyUserRole(policyName, "user", "Seller");
		pe.addPolicyRolePermission(policyName, "Buyer", "perm");
		pe.addPolicyRolePermission(policyName, "Seller", "perm2");
		pe.addPolicyPermissionOperation(policyName, "perm", "bid");
		pe.addPolicyPermissionOperation(policyName, "perm", "register");
		pe.addPolicyPermissionOperation(policyName, "perm2", "create");
		pe.addPolicyPermissionOperation(policyName, "perm2", "delete");
		pe.addPolicyPermissionOperationObject(policyName, "perm","bid","Sale");
		pe.addPolicyPermissionOperationObject(policyName, "perm","register","Sale");
		pe.addPolicyPermissionOperationObject(policyName, "perm2","create","SaleManager");
		pe.addPolicyPermissionOperationObject(policyName, "perm2","delete","SaleManager");
	
		GraphMonitor gm = new GraphMonitor(policy);
		
	     for(PolicyElement e : pe.getPolicyByName(policyName).getElements()){
	     	HashSet<String> ops = new HashSet<String>();
	     	if(e instanceof RoleImpl){
	     		Role r = (Role) e;
	     		System.out.println(e);
	     		for(Permission p : r.getPermissions()){
	     			for (Operation op : p.getOperations()){
	     				ops.add(op.getName());
	     			}
	     		}
	     		addComponent(r.getName(), "kevComps", policyName, new HashSet<String>(),ops);
	     	}
	     }
	     
	     
	     for(PolicyElement e : pe.getPolicyByName(policyName).getElements()){
	     	HashSet<String> ops = new HashSet<String>();
	     	if(e instanceof ObjectImpl){
	     		policy.Object r = (policy.Object) e;
	     		System.out.println(e);
	     		for(Operation p : r.getOperations()){
	     			ops.add(p.getName());
	     		}
	     		addComponent(r.getName(), "kevComps",policyName, ops,new HashSet<String>());
	     	}
	     
	     }
	}
	
	
	public void addComponent(String name, String packName, String libraryName, HashSet<String> operationsP, HashSet<String> operationsR) {
		String className = name;
		File f = new File("src/"+packName+"/"+ className + ".java");
		String content = "package " + packName  +";" + "\n" +
				
			"import org.kevoree.annotation.ComponentType;"+"\n"+
			"import org.kevoree.annotation.Library;"+"\n"+
			"import org.kevoree.annotation.PortType;"+"\n"+
			"import org.kevoree.annotation.ProvidedPort;"+"\n"+
			"import org.kevoree.annotation.Provides;"+"\n"+
			"import org.kevoree.annotation.RequiredPort;"+"\n"+
			"import org.kevoree.annotation.Requires;"+"\n"+
			"import org.kevoree.annotation.Start;"+"\n"+
			"import org.kevoree.annotation.Stop;"+"\n"+
			"import org.kevoree.annotation.Update;"+"\n"+
			"import org.kevoree.framework.AbstractComponentType;"+"\n"+
			"import org.kevoree.annotation.Port;"+"\n"+
			
			"@Library(name = \""+libraryName+"\")"+"\n"+
			"@ComponentType()"+"\n";
			
			if(!operationsP.isEmpty()){
				int cptComa = operationsP.size();
				content = content + "@Provides({"+"\n";
				for(String opp : operationsP){
					cptComa = cptComa -1;
					if (cptComa > 0){
						content = content +"	@ProvidedPort(name = \""+opp+"\", type = PortType.MESSAGE), "+"\n";	
					}
					else{
						content = content +"	@ProvidedPort(name = \""+opp+"\", type = PortType.MESSAGE) "+"\n";
					}
				}
				content = content + "})"+"\n";
			}
			
			if(!operationsR.isEmpty()){
				int cptComa = operationsR.size();
				content = content + "@Requires({"+"\n";
				for(String opr : operationsR){
					cptComa = cptComa -1;
					if (cptComa > 0){
					content = content +"	@RequiredPort(name = \""+opr+"\", type = PortType.MESSAGE, optional = true), "+"\n";
					}
					else{
					content = content +"	@RequiredPort(name = \""+opr+"\", type = PortType.MESSAGE, optional = true) "+"\n";
					}
				}
				content = content + "})"+"\n";
			}
			
			content = content + "	public class "+name+"  extends AbstractComponentType{"+"\n"+
			"    @Start"+"\n"+
			"    public void start() {"+"\n"+
			
			"    }"+"\n"+

			"    @Stop"+"\n"+
			    
			"    public void stop() {"+"\n"+
			    
			"    }"+"\n"+

			"    @Update"+"\n"+
			"    public void update() {"+"\n"+
			    	
			"    }"+"\n";

			    
			    if(!operationsP.isEmpty()){
					
					for(String opp : operationsP){
						content = content +  "	@Port(name = \""+opp+"\")"+"\n"+
						"	public void "+opp+"(Object o) {"+"\n"+
				   			
						"	}"+"\n";
					}
				}   	

			 content = content +"}";
			

		String existingFile = read(f);
		if (existingFile.equals("")) {
			System.out.println("file do not exist");
			FileWriterO fw = new FileWriterO();
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			fw.writeStringOnFile(content, f.getAbsolutePath());
		} else {
			System.out.println(existingFile);
			//to remove following lines if do not rewrite
			FileWriterO fw = new FileWriterO();
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			fw.writeStringOnFile(content, f.getAbsolutePath());
		}
	}
	
	
	
	/** Read the contents of the given file. */
	public String read(File f) {
		System.out.println(f.getAbsolutePath());
		StringBuilder text = new StringBuilder();
		String NL = System.getProperty("line.separator");
		Scanner scanner = null;
		try {
			scanner = new Scanner(new FileInputStream(f));
		} catch (FileNotFoundException e) {
			return "";
		}
		try {
			while (scanner.hasNextLine()) {
				text.append(scanner.nextLine() + NL);
			}
		} finally {
			scanner.close();
		}
		return text.toString();
	}
	
	
	public static void main(String[] args){
		KevComponentGenerator kcg = new KevComponentGenerator();
		//kcg.addComponent("Test", "kevComps", "lib", new HashSet<String>(), new HashSet<String>());
		kcg.mdsec("mdsec");
	}

}
