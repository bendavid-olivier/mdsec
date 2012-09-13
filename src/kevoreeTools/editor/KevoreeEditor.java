package kevoreeTools.editor;
import kevoree.*;
public class KevoreeEditor{
	private ContainerRoot kevoree;
	private KevoreeFactory factory;
	
	public KevoreeEditor(ContainerRoot x) {
		kevoree = x;
		factory = KevoreeFactory.eINSTANCE;	
		loadDefaultLibrary();
	}
	
	public void loadDefaultLibrary(){
		GroupType gt = factory.createGroupType();
		gt.setName("GROUP");
		kevoree.getTypeDefinitions().add(gt);
		
		NodeType nt = factory.createNodeType();
		nt.setName("NODE");
		kevoree.getTypeDefinitions().add(nt);
		
		PortType ptp = factory.createMessagePortType();
		ptp.setName("PTP");
		kevoree.getTypeDefinitions().add(ptp);
		
		PortType ptr = factory.createMessagePortType();
		ptr.setName("PTR");
		kevoree.getTypeDefinitions().add(ptr);
		
		ComponentType ct = factory.createComponentType();
		ct.setName("COMP");
		
		PortTypeRef ptpref = factory.createPortTypeRef();
		ptpref.setName("PTP");
		ptpref.setNoDependency(true);
		ptpref.setOptional(true);
		ptpref.setRef(ptp);
		
		PortTypeRef ptrref = factory.createPortTypeRef();
		ptrref.setName("PTR");
		ptrref.setNoDependency(true);
		ptrref.setOptional(true);
		ptrref.setRef(ptr);
		
		ct.getProvided().add(ptpref);
		ct.getRequired().add(ptrref);
		kevoree.getTypeDefinitions().add(ct);
		
		ChannelType cht = factory.createChannelType();
		cht.setName("CHAN");
		kevoree.getTypeDefinitions().add(cht);
	}
	
	
	//managing types
	
	public void addPortType(String name){
		PortType pt = factory.createMessagePortType();
		pt.setName(name);
		kevoree.getTypeDefinitions().add(pt);
	}
	
	public void addComponentType(String name){
		ComponentType ct = factory.createComponentType();
		ct.setName(name);
		kevoree.getTypeDefinitions().add(ct);
	}
	
	public void addComponentTypePortProv(String compTypeName,String portTypName){
		PortTypeRef portRef = factory.createPortTypeRef();
		portRef.setName(portTypName);
		portRef.setNoDependency(true);
		portRef.setOptional(true);
		portRef.setRef((PortType) getTypeDef(portTypName));
		((ComponentType)getTypeDef(compTypeName)).getProvided().add(portRef);
	}
	
	public void addComponentTypePortReq(String compTypeName,String portTypName){
		PortTypeRef portRef = factory.createPortTypeRef();
		portRef.setName(portTypName);
		portRef.setNoDependency(true);
		portRef.setOptional(true);
		portRef.setRef((PortType) getTypeDef(portTypName));
		((ComponentType)getTypeDef(compTypeName)).getRequired().add(portRef);
	}
	
	
	public TypeDefinition getTypeDef(String name){
		TypeDefinition res = null;
		for(TypeDefinition td : kevoree.getTypeDefinitions()){
			if(td.getName().equals(name)){
				res = td;
			}
		}
		return res;
	}
	
	
	
	
	//managing instances
	
	public void addNode(String name){
		ContainerNode cn = factory.createContainerNode();
		cn.setName(name);
		cn.setTypeDefinition(getTypeDef("NODE"));
		kevoree.getNodes().add(cn);
	}
	
	public void removeNode(String name){
		kevoree.getNodes().remove(getNodeByName(name));
	}
	
	public ContainerNode getNodeByName(String name){
		ContainerNode res = null;
		for(ContainerNode cn : kevoree.getNodes()) { 
			if(cn.getName().equals(name)){
				res = cn;
			}
		}
		return res;
	}
	
	public void addNodeComponent(String nodeName, String name, String type){
		ComponentInstance ci = factory.createComponentInstance();
		for(PortTypeRef ptr : ((ComponentType)getTypeDef(type)).getProvided()){
			Port pt = factory.createPort();
			pt.setPortTypeRef(ptr);
			ci.getProvided().add(pt);
		}
			
		for(PortTypeRef ptr : ((ComponentType)getTypeDef(type)).getRequired()){
			Port pt = factory.createPort();
			pt.setPortTypeRef(ptr);
			ci.getRequired().add(pt);
		}
			
		ci.setName(name);
		ci.setTypeDefinition(getTypeDef(type));
		getNodeByName(nodeName).getComponents().add(ci);
	}
	
	public void removeNodeComponent(String nodeName, String name){
		getNodeByName(nodeName).getComponents().remove(getNodeComponentByName(nodeName, name));
	}
	
	public ComponentInstance getNodeComponentByName(String nodeName, String name){
		ComponentInstance res = null;
		if(getNodeByName(nodeName) != null){
			for(ComponentInstance ci : getNodeByName(nodeName).getComponents()){
				if(ci.getName().equals(name)){
					res = ci;
				}
			}
		}
		return res;
	}
	
	public void addChannel(String name){
		Channel c = factory.createChannel();
		c.setTypeDefinition(getTypeDef("CHAN"));
		c.setName(name);
		kevoree.getHubs().add(c);
	}
	
	public void removeChannel(String name){
		kevoree.getHubs().remove(getChannelByName(name));
	}
	
	public Channel getChannelByName(String name){
		Channel res = null;
		for(Channel c: kevoree.getHubs()){
			if(c.getName().equals(name)){
				res = c;
			}
		}
		return res;
	}
	
	public Port getNodeComponentPortByName(String nodeName,String compName,String name){
		Port res = null;
		if(getNodeComponentByName(nodeName, compName) != null){
			for(Port p: getNodeComponentByName(nodeName, compName).getProvided()){
				if(p.getPortTypeRef().getName().equals(name)){
					res = p;
				}
			}
			for(Port p: getNodeComponentByName(nodeName, compName).getRequired()){
				if(p.getPortTypeRef().getName().equals(name)){
					res = p;
				}
			}
		}
		return res;
	}
	
	public void addBinding(String nodeName,String compName,String portName,String channelName){
		MBinding b = factory.createMBinding();
//		System.out.println(getChannelByName(channelName).getName());
//		System.out.println(getNodeComponentPortByName(nodeName, compName, portName).getPortTypeRef().getName());
		
		b.setPort(getNodeComponentPortByName(nodeName, compName, portName));
		b.setHub(getChannelByName(channelName));
		kevoree.getMBindings().add(b);
	}
	
	public void removeBinding(String nodeName,String compName,String portName,String channelName){
		kevoree.getMBindings().remove(getBinding(nodeName, compName, portName, channelName));
	}
	
	public MBinding getBinding(String nodeName,String compName,String portName,String channelName){
		MBinding res = null;
		for(MBinding b : kevoree.getMBindings()){
			if((b.getHub().getName().equals(channelName)) && (b.getPort().getPortTypeRef().getName().equals(portName)) && (b.getPort().equals(getNodeComponentPortByName(nodeName, compName, portName)))){
				 res = b;
			}
		}
		return res;
	}
	
	
	
	
	
}