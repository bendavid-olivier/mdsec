package policyTools.generator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.ResultSet;

import policy.*;
import policyTools.editor.PolicyEditor;
public class Generator{
	public Policy policy;
	public static final String LMS = "jdbc:mysql://localhost:3306/library";
    public static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
	public Generator(Policy x) {
		policy = x;
	}
	public void generateModelExample() {
		PolicyEditor pe = new PolicyEditor(policy);
		String policyName = "AuctionSaleSystemPolicy";
		
		pe.setMainPolicyName(policyName);
		pe.addPolicyUser(policyName, "Boris");
		pe.addPolicyUser(policyName, "Gary");
		pe.addPolicyUser(policyName, "Alicia");
		pe.addPolicyUser(policyName, "Jane");
		
		pe.addPolicyRole(policyName, "Buyer");
		pe.getPolicyRoleByName(policyName, "Buyer").setArchType("Buyer");
		pe.addPolicyRole(policyName, "Seller");
		pe.getPolicyRoleByName(policyName, "Seller").setArchType("Seller");		
		
		pe.addPolicyPermission(policyName, "pUser");
		pe.addPolicyPermission(policyName, "pAdmin");
		pe.addPolicyOperation(policyName, "bid");
		pe.addPolicyOperation(policyName, "register");
		pe.addPolicyOperation(policyName, "create");
		pe.addPolicyOperation(policyName, "delete");
		
		pe.addPolicyObject(policyName, "Sale");
		pe.getPolicyObjectByName(policyName, "Sale").setArchType("Sale");
		pe.addPolicyObject(policyName, "SaleManager");
		pe.getPolicyObjectByName(policyName, "SaleManager").setArchType("SaleManager");
		
		pe.addPolicyRoleRoleDSOD(policyName, "Buyer", "Seller");
		
		pe.addPolicyUserRole(policyName, "Boris", "Buyer");
		pe.addPolicyUserRole(policyName, "Boris", "Seller");
		pe.addPolicyUserRole(policyName, "Gary", "Buyer");
		pe.addPolicyUserRole(policyName, "Gary", "Seller");
		pe.addPolicyUserRole(policyName, "Alicia", "Buyer");
		pe.addPolicyUserRole(policyName, "Alicia", "Seller");
		pe.addPolicyUserRole(policyName, "Jane", "Buyer");
		pe.addPolicyUserRole(policyName, "Jane", "Seller");
		
		pe.addPolicyRolePermission(policyName, "Buyer", "pUser");
		pe.addPolicyRolePermission(policyName, "Seller", "pAdmin");
		pe.addPolicyPermissionOperation(policyName, "pUser", "bid");
		pe.addPolicyPermissionOperation(policyName, "pUser", "register");
		pe.addPolicyPermissionOperation(policyName, "pAdmin", "create");
		pe.addPolicyPermissionOperation(policyName, "pAdmin", "delete");
		pe.addPolicyPermissionOperationObject(policyName, "pUser","bid","Sale");
		pe.addPolicyPermissionOperationObject(policyName, "pUser","register","Sale");
		pe.addPolicyPermissionOperationObject(policyName, "pAdmin","create","SaleManager");
		pe.addPolicyPermissionOperationObject(policyName, "pAdmin","delete","SaleManager");
	}
	
	public void generateModelExampleMDSEC() {
		PolicyEditor pe = new PolicyEditor(policy);
		String policyName = "AuctionSaleSystemPolicy";
		
		pe.setMainPolicyName(policyName);
		pe.addPolicyUser(policyName, "Boris");
		pe.addPolicyUser(policyName, "Gary");
		pe.addPolicyUser(policyName, "Alicia");
		pe.addPolicyUser(policyName, "Jane");
		
		pe.setPolicyUserSession(policyName, "Boris", "SBoris");
		pe.setPolicyUserSession(policyName, "Gary", "SGary");
		pe.setPolicyUserSession(policyName, "Alicia", "SAlicia");
		pe.setPolicyUserSession(policyName, "Jane", "SJane");
		
		pe.addPolicyRole(policyName, "Buyer");
		pe.getPolicyRoleByName(policyName, "Buyer").setArchType("Buyer");
		pe.addPolicyRole(policyName, "Seller");
		pe.getPolicyRoleByName(policyName, "Seller").setArchType("Seller");
		
		pe.addPolicySessionRole(policyName, "SBoris", "Buyer");
		pe.addPolicySessionRole(policyName, "SGary", "Buyer");
		pe.addPolicySessionRole(policyName, "SJane", "Buyer");
		pe.addPolicySessionRole(policyName, "SAlicia", "Seller");
		
		
		pe.addPolicyPermission(policyName, "pUser");
		pe.addPolicyPermission(policyName, "pAdmin");
		pe.addPolicyOperation(policyName, "bid");
		pe.addPolicyOperation(policyName, "register");
		pe.addPolicyOperation(policyName, "create");
		pe.addPolicyOperation(policyName, "delete");
		
		pe.addPolicyObject(policyName, "Sale");
		pe.getPolicyObjectByName(policyName, "Sale").setArchType("Sale");
		pe.addPolicyObject(policyName, "SaleManager");
		pe.getPolicyObjectByName(policyName, "SaleManager").setArchType("SaleManager");
		
		pe.addPolicyRoleRoleDSOD(policyName, "Buyer", "Seller");
		
		
		pe.addPolicyUserRole(policyName, "Boris", "Buyer");
		pe.addPolicyUserRole(policyName, "Boris", "Seller");
		pe.addPolicyUserRole(policyName, "Gary", "Buyer");
		pe.addPolicyUserRole(policyName, "Gary", "Seller");
		pe.addPolicyUserRole(policyName, "Alicia", "Buyer");
		pe.addPolicyUserRole(policyName, "Alicia", "Seller");
		pe.addPolicyUserRole(policyName, "Jane", "Buyer");
		pe.addPolicyUserRole(policyName, "Jane", "Seller");
		
		
		pe.addPolicyRolePermission(policyName, "Buyer", "pUser");
		pe.addPolicyRolePermission(policyName, "Seller", "pAdmin");
		pe.addPolicyPermissionOperation(policyName, "pUser", "bid");
		pe.addPolicyPermissionOperation(policyName, "pUser", "register");
		pe.addPolicyPermissionOperation(policyName, "pAdmin", "create");
		pe.addPolicyPermissionOperation(policyName, "pAdmin", "delete");
		pe.addPolicyPermissionOperationObject(policyName, "pUser","bid","Sale");
		pe.addPolicyPermissionOperationObject(policyName, "pUser","register","Sale");
		pe.addPolicyPermissionOperationObject(policyName, "pAdmin","create","SaleManager");
		pe.addPolicyPermissionOperationObject(policyName, "pAdmin","delete","SaleManager");
	}
	
	
	public void generateModelExampleASMSvaryUsers(int numberUsers) {
		PolicyEditor pe = new PolicyEditor(policy);
		String policyName = "AuctionSaleSystemPolicy";
		
		pe.setMainPolicyName(policyName);
		
		//adding users
		for(int i = 0;i<numberUsers;i++){
			pe.addPolicyUser(policyName, "User"+i);
		}
		
		
		//adding roles
		pe.addPolicyRole(policyName, "Buyer");
		pe.getPolicyRoleByName(policyName, "Buyer").setArchType("Buyer");
		pe.addPolicyRole(policyName, "Seller");
		pe.getPolicyRoleByName(policyName, "Seller").setArchType("Seller");
		
		
		//adding permissions
		pe.addPolicyPermission(policyName, "pUser");
		pe.addPolicyPermission(policyName, "pAdmin");
	
		//adding operations
		pe.addPolicyOperation(policyName, "bid");
		pe.addPolicyOperation(policyName, "register");
		pe.addPolicyOperation(policyName, "create");
		pe.addPolicyOperation(policyName, "delete");
		
	
		//adding objects
		pe.addPolicyObject(policyName, "Sale");
		pe.getPolicyObjectByName(policyName, "Sale").setArchType("Sale");
		pe.addPolicyObject(policyName, "SaleManager");
		pe.getPolicyObjectByName(policyName, "SaleManager").setArchType("SaleManager");
		
		//adding dsod
		pe.addPolicyRoleRoleDSOD(policyName, "Buyer", "Seller");
		
		//adding relationships users to roles
		for(int i = 0;i<numberUsers;i++){
			pe.addPolicyUserRole(policyName, "User"+i, "Buyer");
			pe.addPolicyUserRole(policyName, "User"+i, "Seller");	
		}
		
		//adding relationships between role and permissions
		pe.addPolicyRolePermission(policyName, "Buyer", "pUser");
		pe.addPolicyRolePermission(policyName, "Seller", "pAdmin");
		
		//adding relationships between role and permissions
		pe.addPolicyPermissionOperation(policyName, "pUser", "bid");
		pe.addPolicyPermissionOperation(policyName, "pUser", "register");
		pe.addPolicyPermissionOperation(policyName, "pAdmin", "create");
		pe.addPolicyPermissionOperation(policyName, "pAdmin", "delete");

		//adding relationships between role and permissions and objects
		pe.addPolicyPermissionOperationObject(policyName, "pUser","bid","Sale");
		pe.addPolicyPermissionOperationObject(policyName, "pUser","register","Sale");
		pe.addPolicyPermissionOperationObject(policyName, "pAdmin","create","SaleManager");
		pe.addPolicyPermissionOperationObject(policyName, "pAdmin","delete","SaleManager");
	}
	
	
	
	
	public void generateModelExampleASMSvaryUsers3(int numberUsers, int numberAuctions) {
		PolicyEditor pe = new PolicyEditor(policy);
		String policyName = "AuctionSaleSystemPolicy";
		
		pe.setMainPolicyName(policyName);
		
		//adding users
		for(int i = 0;i<numberUsers;i++){
			pe.addPolicyUser(policyName, "User"+i);
		}		
		
		//adding roles
		pe.addPolicyRole(policyName, "Buyer");
		pe.getPolicyRoleByName(policyName, "Buyer").setArchType("Buyer");
				
		pe.addPolicyRole(policyName, "Seller");
		pe.getPolicyRoleByName(policyName, "Seller").setArchType("Seller");
		
		pe.addPolicyRole(policyName, "Auctioneer");
		pe.getPolicyRoleByName(policyName, "Auctioneer").setArchType("Auctioneer");
		
		
		//adding permissions
		pe.addPolicyPermission(policyName, "pBuyer");
		pe.addPolicyPermission(policyName, "pBuyerCustomized");
		pe.addPolicyPermission(policyName, "pSeller");
		pe.addPolicyPermission(policyName, "pAuctioneer");
		
	
		//adding operations
			//buyers operations
		pe.addPolicyOperation(policyName, "bid");
		pe.addPolicyOperation(policyName, "register");
		pe.addPolicyOperation(policyName, "unregister");
		
		pe.addPolicyOperation(policyName, "comment");
		pe.addPolicyOperation(policyName, "proposeAprice");
		
	
			//buyers and customized buyers
		pe.addPolicyOperation(policyName, "bid10");
		pe.addPolicyOperation(policyName, "bid50");
		pe.addPolicyOperation(policyName, "bid100");
		

			//auctioneer operations
		pe.addPolicyOperation(policyName, "createAuction");
		pe.addPolicyOperation(policyName, "openAuction");
		pe.addPolicyOperation(policyName, "updateAuction");
		pe.addPolicyOperation(policyName, "deleteAuction");
		pe.addPolicyOperation(policyName, "closeAuction");
		pe.addPolicyOperation(policyName, "notifyAuctionWinner");
		
		
		
		// seller operations
		pe.addPolicyOperation(policyName, "addItem");
		pe.addPolicyOperation(policyName, "addItemWithNotifications");
		pe.addPolicyOperation(policyName, "withdrawItem");
		
		
		//adding objects
		for(int i = 0;i<numberAuctions;i++){
			pe.addPolicyObject(policyName, "Auction"+i);
			pe.getPolicyObjectByName(policyName, "Auction"+i).setArchType("Auction");
		}
		
		pe.addPolicyObject(policyName, "AuctionManager");
		pe.getPolicyObjectByName(policyName, "AuctionManager").setArchType("AuctionManager");
		
		pe.addPolicyObject(policyName, "ItemManager");
		pe.getPolicyObjectByName(policyName, "ItemManager").setArchType("ItemManager");
		
		
		//adding dsod
		pe.addPolicyRoleRoleDSOD(policyName, "Buyer", "Seller");
		pe.addPolicyRoleRoleDSOD(policyName, "Seller", "Auctioneer");
		
		//adding relationships users to roles
		for(int i = 0;i<numberUsers;i++){
			pe.addPolicyUserRole(policyName, "User"+i, "Buyer");
			pe.addPolicyUserRole(policyName, "User"+i, "Seller");
			pe.addPolicyUserRole(policyName, "User"+i, "Auctioneer");	
		}
		
		//adding relationships between role and permissions
		pe.addPolicyRolePermission(policyName, "Buyer", "pBuyer");
		pe.addPolicyRolePermission(policyName, "Buyer", "pBuyerCustomized");
		pe.addPolicyRolePermission(policyName, "Seller", "pSeller");
		pe.addPolicyRolePermission(policyName, "Auctioneer", "pAuctioneer");
		
		
		
		//adding relationships between permissions and operations
		pe.addPolicyPermissionOperation(policyName, "pBuyer", "bid");
		pe.addPolicyPermissionOperation(policyName, "pBuyer", "register");
		pe.addPolicyPermissionOperation(policyName, "pBuyer", "unregister");
		pe.addPolicyPermissionOperation(policyName, "pBuyer", "comment");
		pe.addPolicyPermissionOperation(policyName, "pBuyer", "proposeAprice");
		
		pe.addPolicyPermissionOperation(policyName, "pBuyerCustomized", "bid");
		pe.addPolicyPermissionOperation(policyName, "pBuyerCustomized", "bid10");
		pe.addPolicyPermissionOperation(policyName, "pBuyerCustomized", "bid50");
		pe.addPolicyPermissionOperation(policyName, "pBuyerCustomized", "bid100");
		pe.addPolicyPermissionOperation(policyName, "pBuyerCustomized", "register");
		pe.addPolicyPermissionOperation(policyName, "pBuyerCustomized", "unregister");
		pe.addPolicyPermissionOperation(policyName, "pBuyerCustomized", "comment");
		pe.addPolicyPermissionOperation(policyName, "pBuyerCustomized", "proposeAprice");
		
		
		pe.addPolicyPermissionOperation(policyName, "pSeller", "addItem");
		pe.addPolicyPermissionOperation(policyName, "pSeller", "addItemWithNotifications");
		pe.addPolicyPermissionOperation(policyName, "pSeller", "withdrawItem");
		
		pe.addPolicyPermissionOperation(policyName, "pAuctioneer", "createAuction");
		pe.addPolicyPermissionOperation(policyName, "pAuctioneer", "openAuction");
		pe.addPolicyPermissionOperation(policyName, "pAuctioneer", "updateAuction");
		pe.addPolicyPermissionOperation(policyName, "pAuctioneer", "deleteAuction");
		pe.addPolicyPermissionOperation(policyName, "pAuctioneer", "closeAuction");
		pe.addPolicyPermissionOperation(policyName, "pAuctioneer", "notifyAuctionWinner");

		//adding relationships between role and permissions and objects
		
		for(int i = 0;i<numberAuctions;i++){
			pe.addPolicyPermissionOperationObject(policyName, "pBuyer","bid","Auction"+i);
			pe.addPolicyPermissionOperationObject(policyName, "pBuyer","register","Auction"+i);
			pe.addPolicyPermissionOperationObject(policyName, "pBuyer","unregister","Auction"+i);
			pe.addPolicyPermissionOperationObject(policyName, "pBuyer","comment","Auction"+i);
			pe.addPolicyPermissionOperationObject(policyName, "pBuyer","proposeAprice","Auction"+i);
			
			pe.addPolicyPermissionOperationObject(policyName, "pBuyerCustomized","bid","Auction"+i);
			pe.addPolicyPermissionOperationObject(policyName, "pBuyerCustomized","bid10","Auction"+i);
			pe.addPolicyPermissionOperationObject(policyName, "pBuyerCustomized","bid50","Auction"+i);
			pe.addPolicyPermissionOperationObject(policyName, "pBuyerCustomized","bid100","Auction"+i);
			pe.addPolicyPermissionOperationObject(policyName, "pBuyerCustomized","register","Auction"+i);
			pe.addPolicyPermissionOperationObject(policyName, "pBuyerCustomized","unregister","Auction"+i);
			pe.addPolicyPermissionOperationObject(policyName, "pBuyerCustomized","comment","Auction"+i);
			pe.addPolicyPermissionOperationObject(policyName, "pBuyerCustomized","proposeAprice","Auction"+i);
		}
		
		pe.addPolicyPermissionOperationObject(policyName, "pSeller","addItem","ItemManager");
		pe.addPolicyPermissionOperationObject(policyName, "pSeller","addItemWithNotifications","ItemManager");
		pe.addPolicyPermissionOperationObject(policyName, "pSeller","withdrawItem","ItemManager");
		
		pe.addPolicyPermissionOperationObject(policyName, "pAuctioneer","createAuction","AuctionManager");
		pe.addPolicyPermissionOperationObject(policyName, "pAuctioneer","openAuction","AuctionManager");
		pe.addPolicyPermissionOperationObject(policyName, "pAuctioneer","updateAuction","AuctionManager");
		pe.addPolicyPermissionOperationObject(policyName, "pAuctioneer","deleteAuction","AuctionManager");			
		pe.addPolicyPermissionOperationObject(policyName, "pAuctioneer","closeAuction","AuctionManager");
		pe.addPolicyPermissionOperationObject(policyName, "pAuctioneer","notifyAuctionWinner","AuctionManager");		
	}
		
	
	
	
	
	public void generateModelExampleLMSTej() {
		 Statement statement;
	        String query;
	        PolicyEditor pe = new PolicyEditor(policy);
	        pe.setMainPolicyName("TEJ");
	        String policyName= "LMS";
	        pe.addPolicy(policyName);
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
//	                if(authType.equals("Prohibition")){
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
	    
}