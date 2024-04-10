package db.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class MysqlConnectionExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/selenium_testing");
		
		Statement statement = connection.createStatement();
		
		ResultSet result = statement.executeQuery("SELECT * FROM table_users");
		
		while(result.next()) {
			System.out.println("firstname:" +result.getString(1)+ "  lastname:" +result.getString(2));
		}
		

	}

}
