package service;

import java.util.List;

import dao.TaskDao;
import dao.TaskDaoImp;
import model.Task;

public class TaskService {
	
	public static TaskDao tsk = new TaskDaoImp();
	
	public static boolean addTask(int appId, int seId, int reId, String taskEvent, String taskDate) {
		return tsk.addTask(appId, seId, reId, taskEvent, taskDate);
	}
	public static boolean completeTask(String ptReply, int ptaskId, int pappId, int myeId, String taskDate) {
		return tsk.completeTask(ptReply, ptaskId, pappId, myeId, taskDate);
	}
	public static boolean responseSeen(int ptaskId) {
		return tsk.responseSeen(ptaskId);
	}
	public static List<Task> incompleteTasks(int eId){
		return tsk.incompleteTasks(eId);
	}
	public static List<Task> alltasks(int pappId){
		return tsk.alltasks(pappId);
	}
	public static Task getTask(int eId) {
		return tsk.getTask(eId);
	}
}
