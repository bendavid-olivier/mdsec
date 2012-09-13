package utils.xacml.pep;

//import org.kevoree.annotation.ComponentType;
//import org.kevoree.annotation.Library;
//import org.kevoree.annotation.Port;
//import org.kevoree.annotation.PortType;
//import org.kevoree.annotation.ProvidedPort;
//import org.kevoree.annotation.Provides;
//import org.kevoree.annotation.RequiredPort;
//import org.kevoree.annotation.Requires;
//import org.kevoree.annotation.Start;
//import org.kevoree.annotation.Stop;
//import org.kevoree.annotation.Update;
//import org.kevoree.framework.AbstractComponentType;
//import org.kevoree.framework.MessagePort;
//
//@Library(name = "XACML")
//@ComponentType()
//@Provides({ @ProvidedPort(name = "receiveRequest", type = PortType.MESSAGE),
//		@ProvidedPort(name = "receiveResponse", type = PortType.MESSAGE) })
//@Requires({
//		@RequiredPort(name = "sendRequest", type = PortType.MESSAGE, optional = true),
//		@RequiredPort(name = "sendResult", type = PortType.MESSAGE, optional = true) })
//public class PEPC extends AbstractComponentType {
//
//	private PEP pep;
//	private boolean waitResponse;
//	private String objectAsked;
//
//	@Start
//	public void start() {
//		pep = new PEP();
//		waitResponse = false;
//		objectAsked = "";
//	}
//
//	@Stop
//	public void stop() {
//
//	}
//
//	@Update
//	public void update() {
//
//	}
//
//	@Port(name = "receiveRequest")
//	public void receiveRequest(Object o) {
//		
//		String res = o.toString();
////		pep.gui.updateTextArea("receiveRequest : " + res);
//		String request = res;
//		
//		String role = request.substring(0,request.indexOf(":"));
//		request = request.substring(request.indexOf(":")+1,request.length());
//		String subject =request.substring(0,request.indexOf(":"));
//		request = request.substring(request.indexOf(":")+1,request.length());
//		String operation =request.substring(0,request.indexOf(":"));
//		request = request.substring(request.indexOf(":")+1,request.length());
//		String object =request.substring(0,request.length());
//		waitResponse = true;
//		objectAsked = object;
//		if (subject.equals(getName())){
//			getPortByName("sendRequest", MessagePort.class).process(
//					pep.generateRequest(subject,object,operation,role));
//		}
//	}
//
//	@Port(name = "receiveResponse")
//	public void receiveResponse(Object o) {
//		if(waitResponse && (o.toString().startsWith(objectAsked) ||  o.toString().equals("not allowed"))){
//			String res = o.toString();
//	//		pep.gui.updateTextArea("receiveResponse : " + res);
//			getPortByName("sendResult", MessagePort.class).process(res);
//			waitResponse = false;
//			objectAsked ="";
//		}
//	}
//}







//addUser(user0);
//addUser(user1);
//addRole(student);
//addRole(visitor);
//addPermission(permissionStudent);
//addPermission(permissionVisitor);
//addOperation(list);
//addOperation(download);
//addObject(obj0);
//addObject(obj1);
//addObject(obj3);
//addUserRole(user0,student);
//addUserRole(user1,visitor);
//addRolePermission(student,permissionStudent);
//addRolePermission(visitor,permissionVisitor);
//addPermissionOperation(permissionStudent,download);
//addPermissionOperation(permissionStudent,list);
//addPermissionOperation(permissionVisitor,list);
//addPermissionOperationObject(permissionStudent,download,obj0);
//addPermissionOperationObject(permissionStudent,download,obj1);
//addPermissionOperationObject(permissionStudent,download,obj3);
//addPermissionOperationObject(permissionStudent,list,obj0);
//addPermissionOperationObject(permissionStudent,list,obj1);
//addPermissionOperationObject(permissionStudent,list,obj3);
//addPermissionOperationObject(permissionVisitor,list,obj0);
//addPermissionOperationObject(permissionVisitor,list,obj1);
//addPermissionOperationObject(permissionVisitor,list,obj3);

//addPermissionOperationObject(permissionStudent,download,obj2);
