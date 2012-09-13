package policyTools.transformations;

public interface IPolicy2KevScript {
	
	public String addSubject(String userName);
	public String removeSubject(String userName);
	
	public String addObject(String objectName);
	public String removeObject(String objectName);
	
	
	public String addUserRule(String userName, String operationName,
			String objectName);
	public String removeUserRule(String userName, String operationName,
			String objectName);
	
	
	
	
	
	
	
}
