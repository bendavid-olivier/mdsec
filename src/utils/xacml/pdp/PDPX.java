package utils.xacml.pdp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import utils.xacml.pap.PAP;
import utils.xacml.pip.PIP;

//import useful.GUI;

import com.sun.xacml.PDP;
import com.sun.xacml.PDPConfig;
import com.sun.xacml.ParsingException;
import com.sun.xacml.ctx.RequestCtx;
import com.sun.xacml.ctx.ResponseCtx;
import com.sun.xacml.ctx.Result;
import com.sun.xacml.finder.AttributeFinder;
import com.sun.xacml.finder.ResourceFinder;

public class PDPX {
	public PDP pdp;
	public PAP pap;
	public PIP pip;
	public DummyGUIPDP gui;
	
	private AttributeFinder attrFinder;
	private List<Object> attrModules;
	private PDPConfig pdpConfig;
	private ResourceFinder resourceFinder;
	
	private boolean changePo;
	
	public PDPX(){
		changePo = true;
		pap = new PAP();
		pip = new PIP();
		
		attrFinder = new AttributeFinder();
		attrModules = new ArrayList<Object>();
		attrModules.add(pip.getEnvModule());
		attrFinder.setModules(attrModules);
		
		resourceFinder = new ResourceFinder();
		
		pdpConfig = new PDPConfig(attrFinder, pap.getPolicyFinder(), resourceFinder);
		pdp = new PDP(pdpConfig);
		
		gui = new DummyGUIPDP(this);		
		gui.setVisible(true);
	}
	
	public boolean evaluate(File arg0){
		RequestCtx request = null;
		try {
			request = RequestCtx.getInstance(new FileInputStream(arg0));
			} catch (FileNotFoundException e) {
			gui.updateTextArea("FileNotFoundException : "+e.getMessage());
		} catch (ParsingException e) {
			gui.updateTextArea("ParsingException : "+e.getMessage());
		}
		ResponseCtx res = pdp.evaluate(request);
		
		boolean resBool = false;
	    int eval = 0;
	    for(Object o : res.getResults()){
	    	if(o instanceof Result)
	    	{
	    		((Result)o).getStatus();
//	    		System.out.println(o);
//	    		System.out.println("the response decision : "+((Result)o).getDecision());	
//	    		System.out.println("DECISION_DENY "+Result.DECISION_DENY);
//	    		System.out.println("DECISION_INDETERMINATE  "+Result.DECISION_INDETERMINATE);
//	    		System.out.println("DECISION_NOT_APPLICABLE  "+Result.DECISION_NOT_APPLICABLE);
//	    		System.out.println("DECISION_PERMIT  "+Result.DECISION_PERMIT);
	    		eval = eval +((Result)o).getDecision();  
	    	}
	    }
	    if (eval ==0){
	    	resBool = true;
	    }
		gui.updateTextArea(res.toString()+" : "+resBool);
		return resBool;	 
	}
	
	public void removePolicy(){
		pap.removePolicy();
		pdpConfig = new PDPConfig(attrFinder, pap.getPolicyFinder(), resourceFinder);
		pdp = new PDP(pdpConfig);
	}
	
	public void putPolicy(){
		pap.putPolicy();
		pdpConfig = new PDPConfig(attrFinder, pap.getPolicyFinder(), resourceFinder);
		pdp = new PDP(pdpConfig);
	}
	
	public void updatePolicy(){
		removePolicy();
		putPolicy();
	}

}
