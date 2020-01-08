package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import model.Employee;
import util.JDBCConnection;

public class EmployeeDaoImp implements EmployeeDao {
	
	public static Connection conn = JDBCConnection.getConnection();

	public Employee getEmployee(int eId, String ePass) {
		// TODO Auto-generated method stub
	
		try {	
	
			String sql = "SELECT * FROM Employee WHERE eId = ?  AND ePass = ?";
		
		
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, Integer.toString(eId));
			ps.setString(2, ePass);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return new Employee(
						rs.getInt("eId"),
						rs.getString("ePass"),
						rs.getString("fName"),
						rs.getString("lName"),
						rs.getInt("age"),
						rs.getString("dept"),
						rs.getInt("rankNum"),
						rs.getInt("supId"),
						rs.getInt("hodId"),
						rs.getInt("aCash"));
						
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public Employee getApplicantEmployee(int eId) {
		// TODO Auto-generated method stub
	
		try {	
	
			String sql = "SELECT * FROM Employee WHERE eId = ?";
		
		
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, Integer.toString(eId));
			
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return new Employee(
						rs.getInt("eId"),
						rs.getString("ePass"),
						rs.getString("fName"),
						rs.getString("lName"),
						rs.getInt("age"),
						rs.getString("dept"),
						rs.getInt("rankNum"),
						rs.getInt("supId"),
						rs.getInt("hodId"),
						rs.getInt("aCash"));
						
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
