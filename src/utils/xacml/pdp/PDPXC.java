package utils.xacml.pdp;

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
//
//
//@Library(name = "XACML")
//@ComponentType()
//@Provides({
//    @ProvidedPort(name = "evaluate", type = PortType.MESSAGE),
//    @ProvidedPort(name = "updatePolicy", type = PortType.MESSAGE)
//})
//@Requires({
//    @RequiredPort(name = "result", type = PortType.MESSAGE, optional = true)
//})
//
//public class PDPXC  extends AbstractComponentType{
//	
//	private PDPX pdp;
//	
//    @Start
//    public void start() {
//      pdp = new PDPX();
//    }
//
//    @Stop
//    public void stop() {
//    	
//    }
//
//    @Update
//    public void update() {
//    	
//    }
//
//    @Port(name = "evaluate")
//	public void create(Object o) {
//			String res = o.toString(); 
//			boolean resEvaluation = pdp.evaluate((File) o);
//			getPortByName("result",MessagePort.class).process(resEvaluation);
//	}
//    
//    @Port(name = "updatePolicy")
//   	public void updatePolicy(Object o) {
//   			String res = o.toString(); 
//   			pdp.updatePolicy();   			
//   	}
//
//}
