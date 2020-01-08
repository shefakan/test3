package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Hierachy;
import util.JDBCConnection;

public class HierachyDaoImp implements HierachyDao {
	
	public static Connection conn = JDBCConnection.getConnection();

	public Hierachy getRank(int rankNum) {
		// TODO Auto-generated method stub
		
		String sql = "SELECT * FROM Hierachy WHERE rankNum = ? ";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, Integer.toString(rankNum));
			
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return new Hierachy(
						rs.getString("positions"),
						rs.getInt("rankNum"));																	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
		return null;
	}
	
	

}
