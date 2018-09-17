package datebase;

import java.sql.*;                                     // for JDBC classes
import java.io.*;                                      // for keyboard reading
 
public class KeyboardInsert
{
  public static void main(String args[]) throws Exception
  {                                                    // standard database connections
    Class.forName("org.postgresql.Driver");
    Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/Payal", "postgres", "postgres");
    Statement stmt = con.createStatement();
                                                       // keyboard input
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
    System.out.println("Enter Employee ID:");
    int id = Integer.parseInt(br.readLine());
 
    System.out.println("Enter Employee Name:");
    String name = br.readLine();
 
    System.out.println("Enter Employee Salary:");
    double salary = Double.parseDouble(br.readLine());
 
    stmt.executeUpdate("insert into Employee values("+id+ ", '"+name+"',"+salary+")");
                                                      // now record inserted (of Insert Record JDBC Keyboard Input)
    System.out.println(name + " record inserted");
 
    stmt.close();
    con.close();
   }
 } 