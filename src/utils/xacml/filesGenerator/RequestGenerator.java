package utils.xacml.filesGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashSet;

import com.sun.xacml.attr.AttributeValue;
import com.sun.xacml.ctx.Attribute;
import com.sun.xacml.ctx.RequestCtx;
import com.sun.xacml.ctx.Subject;

public class RequestGenerator {
	
	public static void createRequest(String path, final String userId,final String resourceId,final String actionId) throws URISyntaxException{
		HashSet<Subject> subjects = new HashSet<Subject>();
		HashSet<Attribute> subjectsAttributes = new HashSet<Attribute>();		
		AttributeValue attributeValueSubject = new AttributeValue(new URI("http://www.w3.org/2001/XMLSchema#anyURI")) {
			
			@Override
			public String encode() {
				// TODO Auto-generated method stub
				return userId;
			}
		}; 
		
		Attribute attributeUser = new Attribute(new URI("urn:oasis:names:tc:xacml:1.0:subject:subject-id"), "pep", null, attributeValueSubject);
		
		subjectsAttributes.add(attributeUser);
		Subject s = new Subject(subjectsAttributes);
		subjects.add(s);
	
		HashSet<Attribute> resources = new HashSet<Attribute>();
		AttributeValue attributeValueResource = new AttributeValue(new URI("http://www.w3.org/2001/XMLSchema#anyURI")) {
			
			@Override
			public String encode() {
				// TODO Auto-generated method stub
				return resourceId;
			}
		}; 
		Attribute attributeResource = new Attribute(new URI("urn:oasis:names:tc:xacml:1.0:resource:resource-id"), "pep", null, attributeValueResource);
		resources.add(attributeResource);
		
		HashSet<Object> actions = new HashSet<Object>();
		AttributeValue attributeValueAction = new AttributeValue(new URI("http://www.w3.org/2001/XMLSchema#anyURI")) {
			
			@Override
			public String encode() {
				// TODO Auto-generated method stub
				return actionId;
			}
		};
		
		Attribute attributeAction = new Attribute(new URI("urn:oasis:names:tc:xacml:1.0:action:action-id"), "pep", null, attributeValueAction);
		actions.add(attributeAction);
		
		HashSet<Object> environements = new HashSet<Object>();
		
		RequestCtx req = new RequestCtx(subjects,resources,actions,environements);
		try {
			req.encode(new FileOutputStream(new File(path)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void createRequest(String path, final String userId,final String resourceId,final String actionId,final String roleId) throws URISyntaxException{
		//SUBJECT
		HashSet<Subject> subjects = new HashSet<Subject>();
		HashSet<Attribute> subjectsAttributes = new HashSet<Attribute>();		
		AttributeValue attributeValueSubject = new AttributeValue(new URI("http://www.w3.org/2001/XMLSchema#anyURI")) {
			@Override
			public String encode() {
				return userId;
			}
		}; 
		
		Attribute attributeUser = new Attribute(new URI("urn:oasis:names:tc:xacml:1.0:subject:subject-id"), "pep", null, attributeValueSubject);
		subjectsAttributes.add(attributeUser);
		
		//SUBJECT ROLE
		AttributeValue attributeValueSubjectRole = new AttributeValue(new URI("http://www.w3.org/2001/XMLSchema#string")) {
			@Override
			public String encode() {
				return roleId;
			}
		}; 
		Attribute attributeRole = new Attribute(new URI("role"), "pep", null, attributeValueSubjectRole);
		subjectsAttributes.add(attributeRole);
		
		Subject s = new Subject(subjectsAttributes);
		subjects.add(s);
	
		
		
		//RESOURCE
		HashSet<Attribute> resources = new HashSet<Attribute>();
		AttributeValue attributeValueResource = new AttributeValue(new URI("http://www.w3.org/2001/XMLSchema#anyURI")) {
			
			@Override
			public String encode() {
				// TODO Auto-generated method stub
				return resourceId;
			}
		}; 
		Attribute attributeResource = new Attribute(new URI("urn:oasis:names:tc:xacml:1.0:resource:resource-id"), "pep", null, attributeValueResource);
		resources.add(attributeResource);
		
		
		//ACTIONS
		
		HashSet<Object> actions = new HashSet<Object>();
		AttributeValue attributeValueAction = new AttributeValue(new URI("http://www.w3.org/2001/XMLSchema#anyURI")) {
			
			@Override
			public String encode() {
				// TODO Auto-generated method stub
				return actionId;
			}
		};
		
		Attribute attributeAction = new Attribute(new URI("urn:oasis:names:tc:xacml:1.0:action:action-id"), "pep", null, attributeValueAction);
		actions.add(attributeAction);
		
		HashSet<Object> environements = new HashSet<Object>();
		
		RequestCtx req = new RequestCtx(subjects,resources,actions,environements);
		try {
			req.encode(new FileOutputStream(new File(path)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
