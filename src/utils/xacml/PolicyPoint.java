package utils.xacml;

import java.io.File;

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

import policyTools.guiEditor.graphicComponents.PolicyTextualEditor;

import utils.xacml.pdp.PDPX;
import utils.xacml.pep.PEP;
 

//@Library(name = "XACML")
//@ComponentType()
//
//@Provides({
//    @ProvidedPort(name = "evaluate", type = PortType.MESSAGE),
//    @ProvidedPort(name = "constructResult", type = PortType.MESSAGE) ,
//    @ProvidedPort(name = "updatePP", type = PortType.MESSAGE)
//})
//@Requires({
//    @RequiredPort(name = "result", type = PortType.MESSAGE, optional = true),
//    @RequiredPort(name = "accessResource", type = PortType.MESSAGE, optional = true)
//
//})
//
//public class PolicyPoint extends AbstractComponentType {
//	
//	public PDPX pdp;
//	//private PolicyTextualEditor editor;
//	private PEP pep;
//	private boolean waitResponse;
//	private String objectAsked;
//	
//	@Start
//	public void start() {
//		pdp = new PDPX();
////		editor = new PolicyTextualEditor(this);
////		editor.setVisible(true);
////		editor.update();
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
//	  @Port(name = "evaluate")
//		public void evaluate(Object o) {
//			String res = o.toString();
//			pdp.gui.updateTextArea("receiveRequest : " + res);
//			String request = res;
//			
//			String role = request.substring(0,request.indexOf(":"));
//			request = request.substring(request.indexOf(":")+1,request.length());
//			String subject =request.substring(0,request.indexOf(":"));
//			request = request.substring(request.indexOf(":")+1,request.length());
//			String operation =request.substring(0,request.indexOf(":"));
//			request = request.substring(request.indexOf(":")+1,request.length());
//			String object =request.substring(0,request.length());
//			waitResponse = true;
//			objectAsked = object;
//			File f = pep.generateRequest(subject,object,operation,role);
//			boolean resEvaluation = (boolean) pdp.evaluate(f);
//			if(resEvaluation){
//				getPortByName("accessResource",MessagePort.class).process(getName()+":"+object);
//			}
//			else{
//				getPortByName("result",MessagePort.class).process("not allowed");
//			}
//		}
//	   
//	  @Port(name = "constructResult")
//		public void constructResult(Object o) {
//		  		String txt = o.toString();
//		  		String policyPointName =txt.substring(0,txt.indexOf(":"));
//		  		String obj = txt.substring(txt.indexOf(":")+1,txt.length());
//		  		if (policyPointName.equals(getName())){
//		  			String res = "operation asked on : "+obj+" authorized";
//		  			pdp.gui.updateTextArea(res);
//					getPortByName("result",MessagePort.class).process(res);
//		  		}
//		}
//	  
//	  @Port(name = "updatePP")
//		public void updatePP(Object o) {
//		  		pdp.updatePolicy();
//		  		pdp.gui.updateTextArea("update policy");
//		}
//
//}
