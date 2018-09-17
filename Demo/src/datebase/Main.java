package datebase;
import java.sql.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	    try{
	        Class.forName("org.postgresql.Driver");
	        } 
	    catch (ClassNotFoundException cnfe){
	          System.out.println("Could not find the JDBC driver!");
	          System.exit(1);
	        }
	    Connection conn = null;
	    try {
	        conn = DriverManager.getConnection
	                       ("jdbc:postgresql:Payal",  "postgres",  "postgres");
	        System.out.println("Connected");
	         } 
	    catch (SQLException sqle) 
	       {
	           System.out.println("Could not connect");
	           System.exit(1);
	     }

		}
	


	}


