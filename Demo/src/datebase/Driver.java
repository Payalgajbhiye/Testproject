package datebase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Driver {

		public static void main(String[] args) throws SQLException {

				String url = "jdbc:postgresql://localhost/Payal/employees";
				String user = "postgres";
				String password = "postgres";

				Connection myConn = null;
				PreparedStatement myStmt = null;

				Scanner scanner = null;

				try {
					// 0. read user input from command line: last name, first name and email
					scanner = new Scanner(System.in);

					System.out.print("Enter your last name: ");
					String lastName = scanner.nextLine();

					System.out.print("Enter your first name: ");
					String firstName = scanner.nextLine();

					System.out.print("Enter your email: ");
					String email = scanner.nextLine();

					// 1. Get a connection to database
					myConn = DriverManager.getConnection(url, user, password);

					// 2. Create a statement
					String sql = "insert into employees "
							+ " (last_name, first_name, email)" + " values (?, ?, ?)";

					myStmt = myConn.prepareStatement(sql);

					// set param values
					myStmt.setString(1, lastName);
					myStmt.setString(2, firstName);
					myStmt.setString(3, email);

					// 3. Execute SQL query
					myStmt.executeUpdate();

					System.out.println("Insert complete.");
				} catch (Exception exc) {
					exc.printStackTrace();
				} finally {
					if (myStmt != null) {
						myStmt.close();
					}

					if (myConn != null) {
						myConn.close();
					}

					if (scanner != null) {
						scanner.close();
					}
				}
			}

		

	}


