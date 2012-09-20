package utils.db;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

import policy.*;
import policy.impl.ObjectImpl;
import policyTools.editor.PolicyEditor;
import policyTools.guiEditor.graphicComponents.GraphMonitor;
import utils.kevComponentGenerator.KevComponentGenerator;

import com.mysql.jdbc.ResultSet;

public class TejDB {

    public static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
    public static final String VMS = "jdbc:mysql://localhost:3306/meeting";
    public static final String ASMS = "jdbc:mysql://localhost:3306/sales";
    public static final String LMS = "jdbc:mysql://localhost:3306/library";

    private static Connection getConnection() {
        Connection connection;
        connection = null;
        try {
            String password = "olivier";
            BufferedReader br = new BufferedReader(new FileReader("pass"));
            password = br.readLine();
            br.close();
            Class.forName(MYSQL_DRIVER);
            connection = DriverManager.getConnection(LMS, "root", password);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
    
    private static Connection getConnection(String select) {
        Connection connection;
        connection = null;
        try {
            String password = "olivier";
            BufferedReader br = new BufferedReader(new FileReader("pass"));
            password = br.readLine();
            br.close();
            Class.forName(MYSQL_DRIVER);
            connection = DriverManager.getConnection(select, "root", password);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
    
    
    public static void getLMS() {
        Statement statement;
        String query;
        Policy policy =  PolicyFactory.eINSTANCE.createPolicy();
        PolicyEditor pe = new PolicyEditor(policy);
        pe.setMainPolicyName("ROOT");
        String policyName= "LMS";
        pe.addPolicy(policyName);
        pe.addPolicyUser(policyName, "fakeUser");
        try {
        	query = "SELECT * FROM ORBAC_SECURITY_POLICY O LIMIT 0,1000";
            Connection connection;
            connection = getConnection(LMS);
            statement = connection.createStatement();
            statement.execute(query);
            ResultSet res = (ResultSet) statement.executeQuery(query);
            while (res.next()) {
            	String role = null;
            	String permission = null;
            	String operation = null;
            	String object = null;
            	String authType = null;
                try {
                	role = res.getString("ROLE");
                	permission = res.getString("ACTIVITY");
                	operation = res.getString("ACTIVITY");
                	object = res.getString("VIEW");
                	authType = res.getString("AUTH_TYPE");
                } catch (Exception ze) {
                }
//                if(authType.equals("Prohibition")){
                if(authType.equals("Permission")){
                	pe.addPolicyRole(policyName, role);
                	pe.addPolicyPermission(policyName, permission);
                	pe.addPolicyOperation(policyName, operation);
                	pe.addPolicyObject(policyName, object);
                	pe.addPolicyUserRole(policyName, "fakeUser", role);
                	pe.addPolicyRolePermission(policyName, role, permission);
                	pe.addPolicyPermissionOperation(policyName, permission, operation);
                	pe.addPolicyPermissionOperationObject(policyName, permission, operation, object);
                	System.out.println(res.toString());
                	System.out.println(role);
                	System.out.println(permission);
                	System.out.println(operation);
                	System.out.println(object);
                }
            }           
            System.out.println("OK");
            statement.close();
        } catch (SQLException e) {
           e.printStackTrace();
        }
       GraphMonitor gm = new GraphMonitor(policy);
       	
       //roles = subjects
//     KevComponentGenerator kge = new KevComponentGenerator();
//     for(PolicyElement e : pe.getPolicyByName(policyName).getElements()){
//     	HashSet<String> ops = new HashSet<String>();
//     	if(e instanceof RoleImpl){
//     		Role r = (Role) e;
//     		System.out.println(e);
//     		for(Permission p : r.getPermissions()){
//     			ops.add(p.getName());
//     		}
//     		kge.addComponent(r.getName(), "kevComps", "VMS", new HashSet<String>(),ops);
//     	}
//     
//     }
     
     
     //object = object
     KevComponentGenerator kge = new KevComponentGenerator();
     for(PolicyElement e : pe.getPolicyByName(policyName).getElements()){
     	HashSet<String> ops = new HashSet<String>();
     	if(e instanceof ObjectImpl){
     		policy.Object r = (policy.Object) e;
     		System.out.println(e);
     		for(Operation p : r.getOperations()){
     			ops.add(p.getName());
     		}
     		kge.addComponent(r.getName(), "kevComps", "VMS", ops,new HashSet<String>());
     	}
     
     }
    }

    
    
    public static Policy getLMSUsers() {
        Statement statement;
        String query;
        Policy policy =  PolicyFactory.eINSTANCE.createPolicy();
        PolicyEditor pe = new PolicyEditor(policy);
        pe.setMainPolicyName("LMS");
        String policyName= "LMS";
        try {
        	query = "SELECT * FROM ORBAC_SECURITY_POLICY O LIMIT 0,1000";
            Connection connection;
            connection = getConnection(LMS);
            statement = connection.createStatement();
            statement.execute(query);
            ResultSet res = (ResultSet) statement.executeQuery(query);
            while (res.next()) {
            	String role = null;
            	String permission = null;
            	String operation = null;
            	String object = null;
            	String authType = null;
                try {
                	role = res.getString("ROLE");
                	permission = "p"+res.getString("ROLE");
                	operation = res.getString("ACTIVITY");
                	object = res.getString("VIEW");
                	authType = res.getString("AUTH_TYPE");
                } catch (Exception ze) {
                }
//                if(authType.equals("Prohibition")){
                if(authType.equals("Permission")){
                	pe.addPolicyRole(policyName, role);
                	pe.addPolicyPermission(policyName, permission);
                	pe.addPolicyOperation(policyName, operation);
                	pe.addPolicyObject(policyName, object);
                	
                	pe.addPolicyRolePermission(policyName, role, permission);
                	pe.addPolicyPermissionOperation(policyName, permission, operation);
                	pe.addPolicyPermissionOperationObject(policyName, permission, operation, object);
                	System.out.println(res.toString());
                	System.out.println(role);
                	System.out.println(permission);
                	System.out.println(operation);
                	System.out.println(object);
                }
            }           
            System.out.println("OK");
            statement.close();
        } catch (SQLException e) {
           e.printStackTrace();
        }
        
        
        try {
        	query = "SELECT * FROM roles r LIMIT 0,1000";
            Connection connection;
            connection = getConnection(LMS);
            statement = connection.createStatement();
            statement.execute(query);
            ResultSet res = (ResultSet) statement.executeQuery(query);
            while (res.next()) {
            	String role = null;
            	String userId = null;
                try {
                	role = res.getString("ROLE");
                	role = role.toLowerCase();
                	role = role.substring(0, 1).toUpperCase() + role.substring(1,role.length());
                	if(role.equals("Admin")){
                		role = "Administrator";
                	}
                	if(role.equals("Personnel")){
                		role = "Administrator";
                	}
                	userId = res.getString("ID_USER");
                } catch (Exception ze) {
                }
                System.out.println(userId);
                System.out.println(role);
                pe.addPolicyUser(policyName, userId);
                pe.addPolicyUserRole(policyName, userId, role);
            }           
            System.out.println("OK");
            statement.close();
        } catch (SQLException e) {
           e.printStackTrace();
        }
        
        
        try {
        	query = "SELECT * FROM users u LIMIT 0,1000";
            Connection connection;
            connection = getConnection(LMS);
            statement = connection.createStatement();
            statement.execute(query);
            ResultSet res = (ResultSet) statement.executeQuery(query);
            while (res.next()) {
            	String userName = null;
            	String userId = null;
                try {
                	userName = res.getString("NAME");
                	userId = res.getString("ID_USER");
                } catch (Exception ze) {
                }
                pe.getPolicyUserByName(policyName, userId).setName(userName);
            }           
            System.out.println("OK");
            statement.close();
        } catch (SQLException e) {
           e.printStackTrace();
        }
        
       //GraphMonitor gm = new GraphMonitor(policy);
       return policy;
    }
    
    
    
    public static void getASMS() {
        Statement statement;
        String query;
        Policy policy =  PolicyFactory.eINSTANCE.createPolicy();
        String policyName ="ASMS";
        PolicyEditor pe = new PolicyEditor(policy);
        pe.setMainPolicyName("TEJ");
        pe.addPolicy(policyName);
        pe.addPolicyUser(policyName, "fakeUser");
        try {
        	query = "SELECT * FROM ORBAC_SECURITY_POLICY O LIMIT 0,1000";
            Connection connection;
            connection = getConnection(ASMS);
            statement = connection.createStatement();
            statement.execute(query);
            ResultSet res = (ResultSet) statement.executeQuery(query);
            while (res.next()) {
            	String role = null;
            	String permission = null;
            	String operation = null;
            	String object = null;
            	String authType = null;
                try {
                	role = res.getString("ROLE");
                	permission = res.getString("ACTIVITY");
                	operation = res.getString("ACTIVITY");
                	object = res.getString("VIEW");
                	authType = res.getString("AUTH_TYPE");
                } catch (Exception ze) {
                }
//                if(authType.equals("Prohibition")){
                if(authType.equals("Permission")){
	                pe.addPolicyRole(policyName, role);
	                pe.addPolicyPermission(policyName, permission);
	                pe.addPolicyOperation(policyName, operation);
	                pe.addPolicyObject(policyName, object);
	                pe.addPolicyUserRole(policyName, "fakeUser", role);
	                pe.addPolicyRolePermission(policyName, role, permission);
	                pe.addPolicyPermissionOperation(policyName, permission, operation);
	                pe.addPolicyPermissionOperationObject(policyName, permission, operation, object);
	                System.out.println(res.toString());
	                System.out.println(role);
	                System.out.println(permission);
	                System.out.println(operation);
	                System.out.println(object);
                }
            }           
            System.out.println("OK");
            statement.close();
        } catch (SQLException e) {
           e.printStackTrace();
        }
       GraphMonitor gm = new GraphMonitor(policy);
    }
    
    public static void getVMS() {
        Statement statement;
        String query;
        Policy policy =  PolicyFactory.eINSTANCE.createPolicy();
        PolicyEditor pe = new PolicyEditor(policy);
        String policyName ="VMS";
        pe.setMainPolicyName("TEJ");
        pe.addPolicy(policyName);
        pe.addPolicyUser(policyName, "fakeUser");
        try {
        	query = "SELECT * FROM ORBAC_SECURITY_POLICY O LIMIT 0,1000";
            Connection connection;
            connection = getConnection(VMS);
            statement = connection.createStatement();
            statement.execute(query);
            ResultSet res = (ResultSet) statement.executeQuery(query);
            while (res.next()) {
            	String role = null;
            	String permission = null;
            	String operation = null;
            	String object = null;
            	String authType = null;
                try {
                	role = res.getString("ROLE");
                	permission = res.getString("ACTIVITY");
                	operation = res.getString("ACTIVITY");
                	object = res.getString("VIEW");
                	authType = res.getString("AUTH_TYPE");
                } catch (Exception ze) {
                }
//                if(authType.equals("Prohibition")){
                if(authType.equals("Permission")){
	                pe.addPolicyRole(policyName, role);
	                pe.addPolicyPermission(policyName, permission);
	                pe.addPolicyOperation(policyName, operation);
	                pe.addPolicyObject(policyName, object);
	                pe.addPolicyUserRole(policyName, "fakeUser", role);
	                pe.addPolicyRolePermission(policyName, role, permission);
	                pe.addPolicyPermissionOperation(policyName, permission, operation);
	                pe.addPolicyPermissionOperationObject(policyName, permission, operation, object);
	                System.out.println(res.toString());
	                System.out.println(role);
	                System.out.println(permission);
	                System.out.println(operation);
	                System.out.println(object);
                }
            }           
            System.out.println("OK");
            statement.close();
        } catch (SQLException e) {
           e.printStackTrace();
        }
        
        
        //roles = subjects
        
//        KevComponentGenerator kge = new KevComponentGenerator();
//        for(PolicyElement e : pe.getPolicyByName(policyName).getElements()){
//        	HashSet<String> ops = new HashSet<String>();
//        	if(e instanceof RoleImpl){
//        		Role r = (Role) e;
//        		System.out.println(e);
//        		for(Permission p : r.getPermissions()){
//        			ops.add(p.getName());
//        		}
//        		kge.addComponent(r.getName(), "kevComps", "VMS", new HashSet<String>(),ops);
//        	}
//        
//        }
        
        
        //object = object
//        KevComponentGenerator kge = new KevComponentGenerator();
//        for(PolicyElement e : pe.getPolicyByName(policyName).getElements()){
//        	HashSet<String> ops = new HashSet<String>();
//        	if(e instanceof ObjectImpl){
//        		policy.Object r = (policy.Object) e;
//        		System.out.println(e);
//        		for(Operation p : r.getOperations()){
//        			ops.add(p.getName());
//        		}
//        		kge.addComponent(r.getName(), "kevComps", "VMS", ops,new HashSet<String>());
//        	}
//        
//        }
        
       GraphMonitor gm = new GraphMonitor(policy);
    }
    
    
    
    //boolean perm = true if you want permission false if you want prohibition
    public static void getDB(String policyName,String dbConnection, boolean perm){
        Statement statement;
        String query;
        Policy policy =  PolicyFactory.eINSTANCE.createPolicy();
        PolicyEditor pe = new PolicyEditor(policy);
        pe.setMainPolicyName("TEJ");
        pe.addPolicy(policyName);
        pe.addPolicyUser(policyName, "fakeUser");
        try {
        	query = "SELECT * FROM ORBAC_SECURITY_POLICY O LIMIT 0,1000";
            Connection connection;
            connection = getConnection(dbConnection);
            statement = connection.createStatement();
            statement.execute(query);
            ResultSet res = (ResultSet) statement.executeQuery(query);
            while (res.next()) {
            	String role = null;
            	String permission = null;
            	String operation = null;
            	String object = null;
            	String authType = null;
                try {
                	role = res.getString("ROLE");
                	permission = res.getString("ACTIVITY");
                	operation = res.getString("ACTIVITY");
                	object = res.getString("VIEW");
                	authType = res.getString("AUTH_TYPE");
                } catch (Exception ze) {
                }
                
                if(!perm){
                	if(authType.equals("Prohibition")){
                	     pe.addPolicyRole(policyName, role);
     	                pe.addPolicyPermission(policyName, permission);
     	                pe.addPolicyOperation(policyName, operation);
     	                pe.addPolicyObject(policyName, object);
     	                pe.addPolicyUserRole(policyName, "fakeUser", role);
     	                pe.addPolicyRolePermission(policyName, role, permission);
     	                pe.addPolicyPermissionOperation(policyName, permission, operation);
     	                pe.addPolicyPermissionOperationObject(policyName, permission, operation, object);
     	                System.out.println(res.toString());
     	                System.out.println(role);
     	                System.out.println(permission);
     	                System.out.println(operation);
     	                System.out.println(object);                		
                	}
                }
                
                if(perm){
	                if(authType.equals("Permission")){
		                pe.addPolicyRole(policyName, role);
		                pe.addPolicyPermission(policyName, permission);
		                pe.addPolicyOperation(policyName, operation);
		                pe.addPolicyObject(policyName, object);
		                pe.addPolicyUserRole(policyName, "fakeUser", role);
		                pe.addPolicyRolePermission(policyName, role, permission);
		                pe.addPolicyPermissionOperation(policyName, permission, operation);
		                pe.addPolicyPermissionOperationObject(policyName, permission, operation, object);
		                System.out.println(res.toString());
		                System.out.println(role);
		                System.out.println(permission);
		                System.out.println(operation);
		                System.out.println(object);
	                }
                }
            }           
            System.out.println("OK");
            statement.close();
        } catch (SQLException e) {
           e.printStackTrace();
        }
       GraphMonitor gm = new GraphMonitor(policy);
   
    }
    
    
    public static void getDB0(String policyName,String dbConnection, boolean perm, String objName){
        Statement statement;
        String query;
        Policy policy =  PolicyFactory.eINSTANCE.createPolicy();
        PolicyEditor pe = new PolicyEditor(policy);
        pe.setMainPolicyName("TEJ");
        pe.addPolicy(policyName);
        pe.addPolicyUser(policyName, "fakeUser");
        try {
        	query = "SELECT * FROM ORBAC_SECURITY_POLICY O LIMIT 0,1000";
            Connection connection;
            connection = getConnection(dbConnection);
            statement = connection.createStatement();
            statement.execute(query);
            ResultSet res = (ResultSet) statement.executeQuery(query);
            while (res.next()) {
            	String role = null;
            	String permission = null;
            	String operation = null;
            	String object = null;
            	String authType = null;
                try {
                	role = res.getString("ROLE");
                	permission = res.getString("ACTIVITY");
                	operation = res.getString("ACTIVITY");
                	object = res.getString("VIEW");
                	authType = res.getString("AUTH_TYPE");
                } catch (Exception ze) {
                }
                
                if(object.equals(objName)){
	                if(!perm){
	                	if(authType.equals("Prohibition")){
	                	     pe.addPolicyRole(policyName, role);
	     	                pe.addPolicyPermission(policyName, permission);
	     	                pe.addPolicyOperation(policyName, operation);
	     	                pe.addPolicyObject(policyName, object);
	     	                pe.addPolicyUserRole(policyName, "fakeUser", role);
	     	                pe.addPolicyRolePermission(policyName, role, permission);
	     	                pe.addPolicyPermissionOperation(policyName, permission, operation);
	     	                pe.addPolicyPermissionOperationObject(policyName, permission, operation, object);
	     	                System.out.println(res.toString());
	     	                System.out.println(role);
	     	                System.out.println(permission);
	     	                System.out.println(operation);
	     	                System.out.println(object);                		
	                	}
	                }
	                
	                if(perm){
		                if(authType.equals("Permission")){
			                pe.addPolicyRole(policyName, role);
			                pe.addPolicyPermission(policyName, permission);
			                pe.addPolicyOperation(policyName, operation);
			                pe.addPolicyObject(policyName, object);
			                pe.addPolicyUserRole(policyName, "fakeUser", role);
			                pe.addPolicyRolePermission(policyName, role, permission);
			                pe.addPolicyPermissionOperation(policyName, permission, operation);
			                pe.addPolicyPermissionOperationObject(policyName, permission, operation, object);
			                System.out.println(res.toString());
			                System.out.println(role);
			                System.out.println(permission);
			                System.out.println(operation);
			                System.out.println(object);
		                }
	                }
	            }           
            }
            System.out.println("OK");
            statement.close();
        } catch (SQLException e) {
           e.printStackTrace();
        }
       GraphMonitor gm = new GraphMonitor(policy);
    }
    
    
    
    public static void main(String[] args) {
//        getLMS();
//        getASMS();
//        getVMS();
//    	  getDB("LMS", TejDB.LMS, false);
//        getDB0("LMS", TejDB.LMS, false, "Book");
//        getDB0("LMS", TejDB.LMS, false, "PersonnelAccount");
//        getDB0("LMS", TejDB.LMS, false, "BorrowerAccount");
        
//        getDB0("VMS", TejDB.VMS, false, "PersonnelAccount");
//        getDB0("VMS", TejDB.VMS, false, "UserAccount");
//        getDB0("VMS", TejDB.VMS, false, "Meeting");
    	
//    	getDB0("ASMS", TejDB.ASMS, false, "PersonnelAccount");
//    	getDB0("ASMS", TejDB.ASMS, false, "UserAccount");
//    	getDB0("ASMS", TejDB.ASMS, false, "Sale");
//    	getDB0("ASMS", TejDB.ASMS, false, "Comment");
//    	getDB0("ASMS", TejDB.ASMS, false, "Bid");
    	
    	getLMSUsers();
    }

}
