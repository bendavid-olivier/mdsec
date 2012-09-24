package policyTools.simulation;

public enum Strategy {
	SIMPLE("Simple"),
	USER_SPLIT("Split by User"),
	ROLE_SPLIT("Split by Role");
	
	private final String type; 

	Strategy(String type) {
		this.type = type;  
	}

	public String getType() {
		return type;
	}

	public String toString() {
		return type;
	}
}
