package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	
public static Connection conn = null;
	
	public static Connection getConnection() {
		
		if(conn == null) {
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			String endpoint = "jdbc:oracle:thin:@shefakan.cz5raldmonvz.us-east-2.rds.amazonaws.com:1521:ORCL";
			String username = "shefakan";
			String password = "Omowamwa1!";
			
			try {
				conn = DriverManager.getConnection(endpoint, username, password);
				return conn;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		} 
		else {
			return conn;
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		Connection conn1 = getConnection();
		Connection conn2 = getConnection();
		Connection conn3 = getConnection();
		Connection conn4 = getConnection();
		Connection conn5 = getConnection();
		
		System.out.println(conn1);
		System.out.println(conn2);
		System.out.println(conn3);
		System.out.println(conn4);
		System.out.println(conn5);
		
	}


}
