package webService;


import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.Task;
import model.TuitionApp;
import service.TaskService;
import service.TuitionAppService;



public class TuitionAppWebService {
	
	public static void createTuitionApp(HttpServletRequest request, HttpServletResponse response) {
		
		int eId = Integer.parseInt(request.getParameter("eId"));
		int eCatId = Integer.parseInt(request.getParameter("eCatId"));
		
	
		String eventDes = request.getParameter("eventDes");
		String justification = request.getParameter("justification");
		String gradeFormat = request.getParameter("gradeFormat");
		int eCost= Integer.parseInt(request.getParameter("eCost"));
		int rCost = Integer.parseInt(request.getParameter("rCost"));
		String eDate = request.getParameter("eDate");
		String appDate = request.getParameter("appDate");
		
		
		//Then we will make a TuitionApp from those fields:
		TuitionApp ta = new TuitionApp(eId, eCatId, eventDes, justification, gradeFormat, eCost, rCost, eDate, appDate);
		System.out.println(ta);
		//Call your TuitionAppService to add it.
		//[replace this with your call]
		TuitionAppService.createTuitionApp(ta);
	
		
		////-----------------------------------------------------------------------------
		
		
		//Send a simple response back in the response
		//just indicating something like:
		ObjectMapper om = new ObjectMapper();
		String appJSON;
		try {
			appJSON = om.writeValueAsString("Application Succesfully created");
			response.getWriter().append(appJSON);		
			
		} catch (IOException e)  {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//"Pokemon added to database"
		
	}
	
	public static void appList(HttpServletRequest request, HttpServletResponse response){
		int eId = Integer.parseInt(request.getParameter("eId"));
		System.out.println(eId);
		
		List<TuitionApp> appList = TuitionAppService.appList(eId);
		
		System.out.println(appList);
		
		ObjectMapper om = new ObjectMapper();
		
		try {
			String appListJSON = om.writeValueAsString(appList);
			response.getWriter().append(appListJSON);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void getApplication(HttpServletRequest request, HttpServletResponse response) {
		int appId = Integer.parseInt(request.getParameter("appId"));
		
		
		System.out.println(appId);
		
		TuitionAppService.getApplication(appId);
		
		ObjectMapper om = new ObjectMapper();
		
		TuitionApp ta = TuitionAppService.getApplication(appId);
		

		try {
			String applicationJSON = om.writeValueAsString(ta);
			response.getWriter().append(applicationJSON);
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		}
	
	public static  void submitGrade(HttpServletRequest request, HttpServletResponse response) {
		String pfGrade = request.getParameter("pfGrade");
		int pappId = Integer.parseInt(request.getParameter("pappId"));
		int ptaskId = Integer.parseInt(request.getParameter("ptaskId"));
		int myeId = Integer.parseInt(request.getParameter("myeId"));
		String ptDate = request.getParameter("ptDate");
		
		
		TuitionAppService.submitGrade(pfGrade, pappId, ptaskId, myeId, ptDate);
		ObjectMapper om = new ObjectMapper();
		
		
		

		try {
			String applicationJSON = om.writeValueAsString("Grade Submitted");
			response.getWriter().append(applicationJSON);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	

	public static  void supApprove (HttpServletRequest request, HttpServletResponse response)  {
		
		
		int pappId = Integer.parseInt(request.getParameter("pappId"));
		int ptaskId = Integer.parseInt(request.getParameter("ptaskId"));
		int myeId = Integer.parseInt(request.getParameter("myeId"));
		String ptDate = request.getParameter("ptDate");
		
		TuitionAppService.supApprove(pappId, ptaskId, myeId, ptDate);
		
		ObjectMapper om = new ObjectMapper();
		
		
		

		try {
			String applicationJSON = om.writeValueAsString("Supervisor Approval Submitted");
			response.getWriter().append(applicationJSON);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public static void hodApprove (HttpServletRequest request, HttpServletResponse response)  {


		String phodApproval = request.getParameter("phodApproval");
		int pappId = Integer.parseInt(request.getParameter("pappId"));
		int ptaskId = Integer.parseInt(request.getParameter("ptaskId"));
		int myeId = Integer.parseInt(request.getParameter("myeId"));
		String ptDate = request.getParameter("ptDate");
		
		TuitionAppService.hodApprove(phodApproval, pappId, ptaskId, myeId, ptDate);
		
		ObjectMapper om = new ObjectMapper();
		
		
		

		try {
			String applicationJSON = om.writeValueAsString("HOD Approval Submitted");
			response.getWriter().append(applicationJSON);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void ibApprove (HttpServletRequest request, HttpServletResponse response)  {


		
		int pappId = Integer.parseInt(request.getParameter("pappId"));
		int ptaskId = Integer.parseInt(request.getParameter("ptaskId"));
		int myeId = Integer.parseInt(request.getParameter("myeId"));
		String ptDate = request.getParameter("ptDate");
		
		TuitionAppService.ibApprove(pappId, ptaskId, myeId, ptDate);
		
		ObjectMapper om = new ObjectMapper();
		
		
		

		try {
			String applicationJSON = om.writeValueAsString("Initial benefits Coordinator Approval Submitted");
			response.getWriter().append(applicationJSON);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void fbApprove (HttpServletRequest request, HttpServletResponse response)  {


		String fbApproval = request.getParameter("fbApproval");
		int pappId = Integer.parseInt(request.getParameter("pappId"));
		int ptaskId = Integer.parseInt(request.getParameter("ptaskId"));
		
		
		TuitionAppService.fbApprove(fbApproval, pappId, ptaskId);
		
		ObjectMapper om = new ObjectMapper();
		
		
		

		try {
			String applicationJSON = om.writeValueAsString("HOD Approval Submitted");
			response.getWriter().append(applicationJSON);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void supReject (HttpServletRequest request, HttpServletResponse response)  {


		String psupApproval = request.getParameter("psupApproval");
		int pappId = Integer.parseInt(request.getParameter("pappId"));
		int ptaskId = Integer.parseInt(request.getParameter("ptaskId"));
		
		
		TuitionAppService.supReject(psupApproval, pappId, ptaskId);
		
		ObjectMapper om = new ObjectMapper();
		
		
		

		try {
			String applicationJSON = om.writeValueAsString("Application Rejected");
			response.getWriter().append(applicationJSON);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void hodReject (HttpServletRequest request, HttpServletResponse response)  {


		String phodApproval = request.getParameter("phodApproval");
		int pappId = Integer.parseInt(request.getParameter("pappId"));
		int ptaskId = Integer.parseInt(request.getParameter("ptaskId"));
		
		
		TuitionAppService.hodReject(phodApproval, pappId, ptaskId);
		
		ObjectMapper om = new ObjectMapper();
		

		try {
			String applicationJSON = om.writeValueAsString("Application Rejected");
			response.getWriter().append(applicationJSON);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void bReject (HttpServletRequest request, HttpServletResponse response)  {


		String pbApproval = request.getParameter("pbApproval");
		int pappId = Integer.parseInt(request.getParameter("pappId"));
		int ptaskId = Integer.parseInt(request.getParameter("ptaskId"));
		
		
		TuitionAppService.bReject(pbApproval, pappId, ptaskId);
		
		ObjectMapper om = new ObjectMapper();

		try {
			String applicationJSON = om.writeValueAsString("Application Rejected");
			response.getWriter().append(applicationJSON);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
