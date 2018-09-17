import java.sql.*;
public class DemaClass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
    try{
        Class.forName("org.postgresql.Driver");
        } 
    catch (ClassNotFoundException cnfe){
          System.out.println("Could not find the JDBC driver!");
          System.exit(1);
        }
    Connection con = null;
    try {
        con = DriverManager.getConnection
                       ("jdbc:postgresql:Payal",  "postgres",  "postgres");
         } 
    catch (SQLException sqle) 
       {
           System.out.println("Could not connect");
           System.exit(1);
     }

	}
}
