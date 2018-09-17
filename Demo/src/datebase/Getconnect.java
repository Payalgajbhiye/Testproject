package datebase;
import java.sql.*;
public class Getconnect {

	private static Statement create;
	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		getconnection();
			CreatTable();
			
	}
	public static void CreatTable()throws Exception{
		   try {
			   System.out.println("Connecting to a selected database...");
			   Connection conn= getconnection();
			   System.out.println("Connected database successfully...");
//			   System.out.println("Creating table in given database...");
//			  
//			  
//			 
//			    create = conn.createStatement(); 
//			   String sql = "CREATE TABLE Emp " +
//	                   "(id INTEGER not NULL, " +
//	                   " first VARCHAR(255), " + 
//	                   " last VARCHAR(255), " + 
//	                   " age INTEGER, " + 
//	                   " PRIMARY KEY ( id ))"; 
//			   create.executeUpdate(sql);
			   System.out.println("Inserting records into the table...");
			      create = conn.createStatement();
			      
			      String insert = "INSERT INTO Emp " +
			                   "VALUES (100, 'Zara', 'Ali', 18)";
			      create.executeUpdate(insert);
			      insert = "INSERT INTO Registration " +
			                   "VALUES (101, 'Mahnaz', 'Fatma', 25)";
			      create.executeUpdate(insert);
			      insert = "INSERT INTO Registration " +
			                   "VALUES (102, 'Zaid', 'Khan', 30)";
			      create.executeUpdate(insert);
			      insert = "INSERT INTO Registration " +
			                   "VALUES(103, 'Sumit', 'Mittal', 28)";
			      create.executeUpdate(insert);
			      System.out.println("Inserted records into the table...");

			   System.out.println("Created table in given database...");
			   
		   }catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }
	}
	
			  
			 
	
	
   public static Connection getconnection()throws Exception{
	  
	   try {
		   String driver="org.postgresql.Driver";
				   String url = "jdbc:postgresql://localhost/Payal";
				   String username="postgres";
				   String password="postgres";
				   Class.forName(driver);
				   Connection conn= DriverManager.getConnection(url,username,password);
				   System.out.println("Connected to database");
				   return conn;
				   
				 
	   }catch (Exception e) {
		   System.out.println(e);
	   }
	    return null;
	   
   }
   
   }
	   
   
   

