package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Employee;
import model.Task;
import model.TuitionApp;
import util.JDBCConnection;

public class TuitionAppDaoImp implements TuitionAppDao {
	
	public static Connection conn = JDBCConnection.getConnection();
	
	
	
	public List<TuitionApp> appList(int eId) {
		// TODO Auto-generated method stub


		String sql = "SELECT * FROM TuitionApp WHERE eId = ?";
		List<TuitionApp> appList = new ArrayList<TuitionApp>();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, Integer.toString(eId));
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				appList.add(new TuitionApp (
						rs.getInt("appId"),
						rs.getInt("eId"),
						rs.getString("status"),
						rs.getInt("eCatId"),
						rs.getString("eventDes"),
						rs.getString("justification"),
						rs.getString("gradeFormat"),
						rs.getInt("eCost"),
						rs.getInt("rCost"),
						rs.getString("eDate"),
						rs.getString("appDate"),
						rs.getString("supApproval"),
						rs.getString("hodApproval"),
						rs.getString("iBencoApproval"),
						rs.getString("fBencoApproval"),
						rs.getString("fGrade")));
			}
			
			return appList;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean createTuitionApp(TuitionApp ta) {
		// TODO Auto-generated method stub
		String sql = "CALL createTuitionApp(?,?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			CallableStatement cs = conn.prepareCall(sql);
			
			cs.setInt(1, ta.geteId());
			cs.setInt(2, ta.geteCatId());
			cs.setString(3, ta.getEventDes());
			cs.setString(4, ta.getJustification());
			cs.setString(5, ta.getGradeFormat());
			cs.setInt(6, ta.geteCost());
			cs.setInt(7, ta.getrCost());
			cs.setString(8, ta.geteDate());
			cs.setString(9, ta.getAppDate());
			
			cs.execute();
			return "successful" != null;			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		return false;
	}
	
	public boolean submitGrade(String pfGrade, int pappId, int ptaskId, int myeId, String ptDate) {
		String sql = "CALL supApprove(?,?, ?, ?, ?)";
		
		try {
			CallableStatement cs = conn.prepareCall(sql);
			
			cs.setString(1, pfGrade);
			cs.setInt(2, pappId);
			cs.setInt(3, ptaskId);
			cs.setInt(4, myeId);
			cs.setString(5, ptDate);
			
			
			cs.execute();
			return "successful" != null;			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		return false;		
	}
	
	
	public TuitionApp getApplication(int appId) {
		// TODO Auto-generated method stub
	
		try {	
	
			String sql = "SELECT * FROM TuitionApp WHERE appId = ?";
		
		
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, Integer.toString(appId));
			
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return new TuitionApp(
						rs.getInt("appId"),
						rs.getInt("eId"),
						rs.getString("status"),
						rs.getInt("eCatId"),
						rs.getString("eventDes"),
						rs.getString("justification"),
						rs.getString("gradeFormat"),
						rs.getInt("eCost"),
						rs.getInt("rCost"),
						rs.getString("eDate"),
						rs.getString("appDate"),
						rs.getString("supApproval"),
						rs.getString("hodApproval"),
						rs.getString("iBencoApproval"),
						rs.getString("fBencoApproval"),
						rs.getString("fGrade"));
						//rs.getInt("aCash"));
						
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public boolean supApprove(int pappId, int ptaskId, int myeId, String ptDate) {
	
	String sql = "CALL supApprove(?, ?, ?, ?)";
	
	try {
		CallableStatement cs = conn.prepareCall(sql);
		
		
		cs.setInt(1, pappId);
		cs.setInt(2, ptaskId);
		cs.setInt(3, myeId);
		cs.setString(4, ptDate);
		
		
		cs.execute();
		return "successful" != null;			
		
	} catch (SQLException e) {
		e.printStackTrace();
	}		
	
	return false;
}
		
	
	public boolean hodApprove(String phodApproval, int pappId, int ptaskId, int myeId, String ptDate) {
		
		String sql = "CALL hodApprove(?,?, ?, ?, ?)";
		
		try {
			CallableStatement cs = conn.prepareCall(sql);
			
			cs.setString(1, phodApproval);
			cs.setInt(2, pappId);
			cs.setInt(3, ptaskId);
			cs.setInt(4, myeId);
			cs.setString(5, ptDate);
			
			
			cs.execute();
			return "successful" != null;			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		return false;
		}
		
	public boolean ibApprove(int pappId, int ptaskId, int myeId, String ptDate) {
		String sql = "CALL ibApprove(?,?, ?, ?)";
		
		try {
			CallableStatement cs = conn.prepareCall(sql);
			
			
			cs.setInt(1, pappId);
			cs.setInt(2, ptaskId);
			cs.setInt(3, myeId);
			cs.setString(4, ptDate);
			
			
			cs.execute();
			return "successful" != null;			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		return false;			
		}
	
	public boolean fbApprove(String fbApproval, int pappId, int ptaskId) {
String sql = "CALL ibApprove(?,?, ?)";
		
		try {
			CallableStatement cs = conn.prepareCall(sql);
			
			cs.setString(1, fbApproval);
			cs.setInt(2, pappId);
			cs.setInt(3, ptaskId);
			
			
			
			cs.execute();
			return "successful" != null;			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		return false;	
		}
	
	public boolean supReject(String psupApproval, int pappId, int ptaskId) {
		
		String sql = "CALL supreject(?,?, ?)";
		
		try {
			CallableStatement cs = conn.prepareCall(sql);
			
			cs.setString(1, psupApproval);
			cs.setInt(2, pappId);
			cs.setInt(3, ptaskId);
			
			
			
			cs.execute();
			return "successful" != null;			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		return false;	
		
		
	}
	
	public boolean hodReject(String phodApproval, int pappId, int ptaskId) {
		
		String sql = "CALL supreject(?,?, ?)";
		
		try {
			CallableStatement cs = conn.prepareCall(sql);
			
			cs.setString(1, phodApproval);
			cs.setInt(2, pappId);
			cs.setInt(3, ptaskId);
			
			
			
			cs.execute();
			return "successful" != null;			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		return false;
	}
	
	
	public boolean bReject(String pbApproval, int pappId, int ptaskId) {
		
		String sql = "CALL supreject(?,?, ?)";
		
		try {
			CallableStatement cs = conn.prepareCall(sql);
			
			cs.setString(1, pbApproval);
			cs.setInt(2, pappId);
			cs.setInt(3, ptaskId);
			
			
			
			cs.execute();
			return "successful" != null;			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		return false;
	}


}
