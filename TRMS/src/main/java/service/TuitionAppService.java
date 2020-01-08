package service;

import java.util.List;

import dao.TuitionAppDao;
import dao.TuitionAppDaoImp;
import model.TuitionApp;

public class TuitionAppService {
	
	public static TuitionAppDao tad = new TuitionAppDaoImp();
	
	public static boolean createTuitionApp(TuitionApp ta) {
		return tad.createTuitionApp(ta);
	}
	public static  boolean submitGrade(String pfGrade, int pappId, int ptaskId, int myeId, String ptDate) {
		return tad.submitGrade(pfGrade, pappId, ptaskId, myeId, ptDate);
	}
	public static TuitionApp getApplication(int appId) {
		return tad.getApplication(appId);
		
	}
	public static  boolean supApprove(int pappId, int ptaskId, int myeId, String ptDate) {
		return tad.supApprove(pappId, ptaskId, myeId, ptDate);
	}
	public static boolean hodApprove(String phodApproval, int pappId, int ptaskId, int myeId, String ptDate) {
		return tad.hodApprove(phodApproval, pappId, ptaskId, myeId, ptDate);
	}
	public static boolean ibApprove(int pappId, int ptaskId, int myeId, String ptDate) {
		return tad.ibApprove(pappId, ptaskId, myeId, ptDate);
	}
	public static boolean fbApprove(String fbApproval, int pappId, int ptaskId) {
		return tad.fbApprove(fbApproval, pappId, ptaskId);
	}
	public static boolean supReject(String psupApproval, int pappId, int ptaskId) {
		return tad.supReject(psupApproval, pappId, ptaskId);
	}
	public static boolean hodReject(String phodApproval, int pappId, int ptaskId) {
		return tad.hodReject(phodApproval, pappId, ptaskId);
	}
	public static boolean bReject(String pbApproval, int pappId, int ptaskId) {
		return tad.bReject(pbApproval, pappId, ptaskId);
	}
	public static List<TuitionApp> appList(int eId) {
		return tad.appList(eId);
	}

}
