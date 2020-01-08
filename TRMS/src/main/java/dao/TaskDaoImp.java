package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dao.TaskDao;
import model.Task;
import model.TuitionApp;
import util.JDBCConnection;

public class TaskDaoImp implements TaskDao {
	
	public static Connection conn = JDBCConnection.getConnection();
	
	
	
	public Task getTask(int eId) {
		// TODO Auto-generated method stub
	
		try {	
	
			String sql = "SELECT * FROM Task WHERE taskStatus = 'incomplete' AND reId = ?";
		
		
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, Integer.toString(eId));
			
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return new Task(
						rs.getInt("taskId"),
						rs.getInt("appId"),
						rs.getInt("seId"),
						rs.getInt("reId"),
						rs.getString("taskStatus"),
						rs.getString("taskEvent"),
						rs.getString("taskReply"),
						rs.getString("taskDate"));
						//rs.getInt("aCash"));
						
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	

	public boolean addTask(int appId, int seId, int reId, String taskEvent, String taskDate) {
		// TODO Auto-generated method stub
		
	String sql = "CALL createTask(?,?, ?, ?, ?)";
		
		try {
			CallableStatement cs = conn.prepareCall(sql);
			
			cs.setInt(1, appId);
			cs.setInt(2, seId);
			cs.setInt(3, reId);
			cs.setString(4, taskEvent);
			cs.setString(5, taskDate);		
			
			cs.execute();
			return "successful" != null;			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		return false;
	}

	public boolean completeTask(String ptReply, int ptaskId, int pappId, int myeId, String taskDate) {
		// TODO Auto-generated method stub
		
		String sql = "CALL completeTask(?,?, ?, ?, ?)";
		
		try {
			CallableStatement cs = conn.prepareCall(sql);
			
			cs.setString(1, ptReply);
			cs.setInt(2, ptaskId);
			cs.setInt(3, pappId);	
			cs.setInt(4, myeId);	
			cs.setString(5, taskDate);
						
			cs.execute();
			return "successful" != null;			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}			
		
		return false;
	}
	
	public List<Task> incompleteTasks(int eId) {
		// TODO Auto-generated method stub


		String sql = "SELECT * FROM Task WHERE taskStatus= 'incomplete' AND reId = ?";
		List<Task> taskList = new ArrayList<Task>();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, Integer.toString(eId));
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				taskList.add(new Task (
						rs.getInt("taskId"),
						rs.getInt("appId"),
						rs.getInt("seId"),
						rs.getInt("reId"),
						rs.getString("taskStatus"),
						rs.getString("taskEvent"),
						rs.getString("taskReply"),
						rs.getString("taskDate")));
			}
			
			return taskList;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Task> alltasks(int pappId) {
		// TODO Auto-generated method stub


		String sql = "SELECT * FROM Task WHERE appId = ?";
		List<Task> taskList = new ArrayList<Task>();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, Integer.toString(pappId));
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				taskList.add(new Task (
						rs.getInt("taskId"),
						rs.getInt("appId"),
						rs.getInt("seId"),
						rs.getInt("reId"),
						rs.getString("taskStatus"),
						rs.getString("taskEvent"),
						rs.getString("taskReply"),
						rs.getString("taskDate")));
			}
			
			return taskList;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean responseSeen(int ptaskId) {
		
		String sql = "CALL completeTask(?)";
		
		try {
			CallableStatement cs = conn.prepareCall(sql);
			cs.setInt(2, ptaskId);			
			cs.execute();
			return "successful" != null;			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}			
		
		return false;
		
	}

}
