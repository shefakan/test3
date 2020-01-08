package dao;

import java.util.List;

import model.Task;
import model.TuitionApp;

public interface TaskDao {
	
	public boolean addTask(int appId, int seId, int reId, String taskEvent, String taskDate);
	public boolean completeTask(String ptReply, int ptaskId, int pappId, int myeId, String taskDate);
	public boolean responseSeen(int ptaskId);
	public List<Task> incompleteTasks(int eId);
	public List<Task> alltasks(int pappId);
	public Task getTask(int eId);

}
