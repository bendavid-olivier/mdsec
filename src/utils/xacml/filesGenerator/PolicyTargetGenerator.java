package utils.xacml.filesGenerator;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import com.sun.xacml.EvaluationCtx;
import com.sun.xacml.Indenter;
import com.sun.xacml.Target;
import com.sun.xacml.TargetMatch;
import com.sun.xacml.attr.AttributeValue;
import com.sun.xacml.cond.Evaluatable;
import com.sun.xacml.cond.EvaluationResult;
import com.sun.xacml.cond.Function;
import com.sun.xacml.cond.FunctionBase;

public class PolicyTargetGenerator {
	public ArrayList<ArrayList<TargetMatch>> resourceTargets;
	public ArrayList<ArrayList<TargetMatch>> actionTargets;
	public ArrayList<ArrayList<TargetMatch>> subjectTargets;

	public PolicyTargetGenerator(){
		resourceTargets = new ArrayList<ArrayList<TargetMatch>>();
		actionTargets = new ArrayList<ArrayList<TargetMatch>>();
		subjectTargets = new ArrayList<ArrayList<TargetMatch>>();
	}		
	public Target createTarget(){
		Target target = new Target(subjectTargets, resourceTargets, actionTargets);	
		return target;
	}
	//*******************************************SUBJECT****************************************************************
	private ArrayList<TargetMatch> addTargetSubjectMatch(String subjectName){
		ArrayList<TargetMatch> targetsSubject = new ArrayList<TargetMatch>();
		TargetMatch res = null;
		try {
			res = new TargetMatch(TargetMatch.SUBJECT, createFunctionSubject(subjectName) ,createEvaluatableSubject(), createAttributeValue("http://www.w3.org/2001/XMLSchema#anyURI",subjectName));
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}		
		targetsSubject.add(res);
		return targetsSubject;
	}
	public void addListTargetsSubject(String subjectName){
		subjectTargets.add(addTargetSubjectMatch(subjectName));
	}
	public static Evaluatable createEvaluatableSubject() throws URISyntaxException{
		final URI u = new URI("EvaluatableSubject");
		return new Evaluatable() {			
			@Override
			public URI getType() {
				return u ;
			}
			
			@Override
			public List getChildren() {
				return null;
			}
			
			@Override
			public boolean evaluatesToBag() {
				return false;
			}
			
			@Override
			public EvaluationResult evaluate(EvaluationCtx arg0) {
				EvaluationResult er= null;
				try {
					er= new EvaluationResult(new AttributeValue(new URI("subject")) {
						
						@Override
						public String encode() {
							return null;
						}
					});
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
				return er;
			}
			
			@Override
			public void encode(OutputStream arg0, Indenter arg1) {
				String s = " <SubjectAttributeDesignator DataType=\"http://www.w3.org/2001/XMLSchema#anyURI\" \n" +
						"AttributeId=\"urn:oasis:names:tc:xacml:1.0:subject:subject-id\"/>";
				try {
					arg0.write(s.getBytes());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			@Override
			public void encode(OutputStream arg0) {
				String s = " <SubjectAttributeDesignator DataType=\"http://www.w3.org/2001/XMLSchema#anyURI\" \n" +
						"AttributeId=\"urn:oasis:names:tc:xacml:1.0:subject:subject-id\"/>";
				try {
					arg0.write(s.getBytes());
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		};  
	}
	public Function createFunctionSubject(String subjectName) throws URISyntaxException{
		final AttributeValue attrVal = createAttributeValue("urn:oasis:names:tc:xacml:1.0:function:anyURI-equal", subjectName);
		return new FunctionBase("urn:oasis:names:tc:xacml:1.0:function:anyURI-equal", 0, "boolean", false) {
			
			@Override
			public EvaluationResult evaluate(List arg0, EvaluationCtx arg1) {
				return new EvaluationResult(attrVal);
			}
		};
	}
	//*******************************************RESOURCES************************************************************
	private ArrayList<TargetMatch> addTargetResourceMatch(String resourceName){
		ArrayList<TargetMatch> targetsResource = new ArrayList<TargetMatch>();
		TargetMatch res = null;
		try {
			res = new TargetMatch(TargetMatch.RESOURCE, createFunctionResource(resourceName) ,createEvaluatableResource(), createAttributeValue("http://www.w3.org/2001/XMLSchema#anyURI",resourceName));
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}		
		targetsResource.add(res);
		return targetsResource;
	}
	
	public void addListTargetsResource(String resourceName){
		resourceTargets.add(addTargetResourceMatch(resourceName));
	}
	
	public Evaluatable createEvaluatableResource() throws URISyntaxException{
		final URI u = new URI("EvaluatableResource");
		return new Evaluatable() {			
			@Override
			public URI getType() {
				return u ;
			}
			
			@Override
			public List getChildren() {
				return null;
			}
			
			@Override
			public boolean evaluatesToBag() {
				return false;
			}
			
			@Override
			public EvaluationResult evaluate(EvaluationCtx arg0) {
				EvaluationResult er= null;
				try {
					er= new EvaluationResult(new AttributeValue(new URI("resource")) {
						
						@Override
						public String encode() {
							return null;
						}
					});
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
				return er;
			}
			
			@Override
			public void encode(OutputStream arg0, Indenter arg1) {
				String s = " <ResourceAttributeDesignator DataType=\"http://www.w3.org/2001/XMLSchema#anyURI\" \n" +
						"AttributeId=\"urn:oasis:names:tc:xacml:1.0:resource:resource-id\"/>";
				try {
					arg0.write(s.getBytes());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			@Override
			public void encode(OutputStream arg0) {
				String s = " <ResourceAttributeDesignator DataType=\"http://www.w3.org/2001/XMLSchema#anyURI\" \n" +
						"AttributeId=\"urn:oasis:names:tc:xacml:1.0:resource:resource-id\"/>";
				try {
					arg0.write(s.getBytes());
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		};  
	}
	
	public Function createFunctionResource(String resourceName) throws URISyntaxException{
		final AttributeValue attrVal = createAttributeValue("urn:oasis:names:tc:xacml:1.0:function:anyURI-equal", resourceName);
		return new FunctionBase("urn:oasis:names:tc:xacml:1.0:function:anyURI-equal", 0, "boolean", false) {
			
			@Override
			public EvaluationResult evaluate(List arg0, EvaluationCtx arg1) {
				return new EvaluationResult(attrVal);
			}
		};
	}
	//*******************************************ACTIONS*************************************************************
	private ArrayList<TargetMatch> addTargetActionMatch(String actionName){
		ArrayList<TargetMatch> targetsAction = new ArrayList<TargetMatch>();
		TargetMatch res = null;
		try {
			res = new TargetMatch(TargetMatch.ACTION, createFunctionAction(actionName) ,createEvaluatableAction(), 
					createAttributeValue("http://www.w3.org/2001/XMLSchema#anyURI",actionName));
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}		
		targetsAction.add(res);
		return targetsAction;
	}
	
	public void addListTargetsAction(String actionName){
		actionTargets.add(addTargetActionMatch(actionName));
	}
	
	public Evaluatable createEvaluatableAction() throws URISyntaxException{
		final URI u = new URI("EvaluatableAction");
		return new Evaluatable() {			
			@Override
			public URI getType() {
				return u ;
			}
			
			@Override
			public List getChildren() {
				return null;
			}
			
			@Override
			public boolean evaluatesToBag() {
				return false;
			}
			
			@Override
			public EvaluationResult evaluate(EvaluationCtx arg0) {
				EvaluationResult er= null;
				try {
					er= new EvaluationResult(new AttributeValue(new URI("action")) {
						
						@Override
						public String encode() {
							return null;
						}
					});
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
				return er;
			}
			
			@Override
			public void encode(OutputStream arg0, Indenter arg1) {
				String s = " <ActionAttributeDesignator DataType=\"http://www.w3.org/2001/XMLSchema#anyURI\" \n" +
						"AttributeId=\"urn:oasis:names:tc:xacml:1.0:action:action-id\"/>";
				try {
					arg0.write(s.getBytes());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			@Override
			public void encode(OutputStream arg0) {
				String s = " <ActionAttributeDesignator DataType=\"http://www.w3.org/2001/XMLSchema#anyURI\" \n" +
						"AttributeId=\"urn:oasis:names:tc:xacml:1.0:action:action-id\"/>";
				try {
					arg0.write(s.getBytes());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};  
	}
	
	public Function createFunctionAction(String actionName) throws URISyntaxException{
		final AttributeValue attrVal = createAttributeValue("urn:oasis:names:tc:xacml:1.0:function:anyURI-equal", actionName);
		return new FunctionBase("urn:oasis:names:tc:xacml:1.0:function:anyURI-equal", 0, "boolean", false) {
			
			@Override
			public EvaluationResult evaluate(List arg0, EvaluationCtx arg1) {
				return new EvaluationResult(attrVal);
			}
		};
	}
	
	//OTHERS
	public AttributeValue createAttributeValue(String uriVal,final String encodeVal) throws URISyntaxException{
		return new AttributeValue(new URI(uriVal)) {
			@Override
			public String encode() {
				return encodeVal;
			}
		};
	}	
	public Evaluatable createEvaluatableConditionRole(final String roleName) throws URISyntaxException{
		final URI u = new URI("urn:oasis:names:tc:xacml:1.0:function:string-one-and-only");
		return new Evaluatable() {			
			@Override
			public URI getType() {
				return u ;
			}
			
			@Override
			public List getChildren() {
				return null;
			}
			
			@Override
			public boolean evaluatesToBag() {
				return false;
			}
			
			@Override
			public EvaluationResult evaluate(EvaluationCtx arg0) {
				EvaluationResult er= null;
				try {
					er= new EvaluationResult(new AttributeValue(new URI("http://www.w3.org/2001/XMLSchema#string")) {
						
						@Override
						public String encode() {
							return null;
						}
					});
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
				return er;
			}
			
			@Override
			public void encode(OutputStream arg0, Indenter arg1) {
				String s = "	<Apply FunctionId=\"urn:oasis:names:tc:xacml:1.0:function:string-one-and-only\">"+"\n"+
						   "		<SubjectAttributeDesignator DataType=\"http://www.w3.org/2001/XMLSchema#string\""+"\n"+
                     "		AttributeId= \"role\"/>"+"\n"+
						   "	</Apply>"+"\n"+
						   "	<AttributeValue DataType=\"http://www.w3.org/2001/XMLSchema#string\">"+roleName+"</AttributeValue>"+"\n";
				try {
					arg0.write(s.getBytes());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			@Override
			public void encode(OutputStream arg0) {
				String s = "	<Apply FunctionId=\"urn:oasis:names:tc:xacml:1.0:function:string-one-and-only\">"+"\n"+
						   "		<SubjectAttributeDesignator DataType=\"http://www.w3.org/2001/XMLSchema#string\""+"\n"+
                        "		AttributeId= \"role\"/>"+"\n"+
						   "	</Apply>"+"\n"+
						   "	<AttributeValue DataType=\"http://www.w3.org/2001/XMLSchema#string\">"+roleName+"</AttributeValue>"+"\n";
				try {
					arg0.write(s.getBytes());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};  
	}
}