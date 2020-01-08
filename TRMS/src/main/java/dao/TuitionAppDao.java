package dao;


import java.util.List;

import model.Task;
import model.TuitionApp;

public interface TuitionAppDao {
	
	public boolean createTuitionApp(TuitionApp ta);
	public boolean submitGrade(String pfGrade, int pappId, int ptaskId, int myeId, String ptDate);
	public TuitionApp getApplication(int appId);
	public boolean supApprove(int pappId, int ptaskId, int myeId, String ptDate);
	public boolean hodApprove(String phodApproval, int pappId, int ptaskId, int myeId, String ptDate);
	public boolean ibApprove(int pappId, int ptaskId, int myeId, String ptDate);
	public boolean fbApprove(String fbApproval, int pappId, int ptaskId);
	public boolean supReject(String psupApproval, int pappId, int ptaskId);
	public boolean hodReject(String phodApproval, int pappId, int ptaskId);
	public boolean bReject(String pbApproval, int pappId, int ptaskId);
	public List<TuitionApp> appList(int eId);

}
