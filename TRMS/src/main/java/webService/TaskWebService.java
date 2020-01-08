package webService;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Task;
import model.TuitionApp;
import service.TaskService;
import service.TuitionAppService;

public class TaskWebService {
	
	public static void incompleteTasks(HttpServletRequest request, HttpServletResponse response){
		int eId = Integer.parseInt(request.getParameter("eId"));
		System.out.println(eId);
		
		List<Task> taskList = TaskService.incompleteTasks(eId);
		
		System.out.println(taskList);
		
		ObjectMapper om = new ObjectMapper();
		
		try {
			String taskListJSON = om.writeValueAsString(taskList);
			response.getWriter().append(taskListJSON);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void allTasks(HttpServletRequest request, HttpServletResponse response){
		int pappId = Integer.parseInt(request.getParameter("pappId"));
		
		
		List<Task> activities = TaskService.alltasks(pappId);
		
		System.out.println(activities);
		
		ObjectMapper om = new ObjectMapper();
		
		try {
			String activityListJSON = om.writeValueAsString(activities);
			response.getWriter().append(activityListJSON);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void addTask (HttpServletRequest request, HttpServletResponse response){
		int seId = Integer.parseInt(request.getParameter("seId"));
		int reId = Integer.parseInt(request.getParameter("reId"));
		int appId = Integer.parseInt(request.getParameter("appId"));
		String taskEvent = request.getParameter("taskEvent");
		String taskDate = request.getParameter("taskDate");
		
		
		TaskService.addTask(appId, seId, reId, taskEvent, taskDate);
		
		System.out.println(appId + seId + reId + taskEvent + taskDate );
		
		ObjectMapper om = new ObjectMapper();
		
		try {
			String taskListJSON = om.writeValueAsString("Task Created");
			response.getWriter().append(taskListJSON);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void completeTask (HttpServletRequest request, HttpServletResponse response){
		int ptaskId = Integer.parseInt(request.getParameter("ptaskId"));
		int myeId = Integer.parseInt(request.getParameter("myeId"));
		int pappId = Integer.parseInt(request.getParameter("pappId"));
		String ptReply = request.getParameter("ptReply");
		String taskDate = request.getParameter("taskDate");
		
		
		TaskService.completeTask(ptReply, ptaskId, pappId, myeId, taskDate);
		
		System.out.println(ptReply + ptaskId + pappId + myeId + taskDate);
		
		
		ObjectMapper om = new ObjectMapper();
		
		try {
			String taskListJSON = om.writeValueAsString("Task Completed");
			response.getWriter().append(taskListJSON);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void responseSeen (HttpServletRequest request, HttpServletResponse response){
		int ptaskId = Integer.parseInt(request.getParameter("ptaskId"));
		
		
		TaskService.responseSeen(ptaskId);
		
		
		
		ObjectMapper om = new ObjectMapper();
		
		try {
			String taskListJSON = om.writeValueAsString("Task Completed");
			response.getWriter().append(taskListJSON);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void getTask(HttpServletRequest request, HttpServletResponse response) {
		int eId = Integer.parseInt(request.getParameter("eId"));
		
		
		System.out.println(eId);
		
		
		
		
		Task ta = TaskService.getTask(eId);
		System.out.println(ta);
		
		ObjectMapper om = new ObjectMapper();
		
		
		

		try {
			String applicationJSON = om.writeValueAsString(ta);
			response.getWriter().append(applicationJSON);
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		}
	
	
}
