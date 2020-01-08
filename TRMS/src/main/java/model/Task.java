package model;

public class Task {
	
	int taskId;
	int appId;
	int seId;
	int reId;
	String taskStatus;
	String taskEvent;
	String taskReply;
	String taskDate;
	public Task() {
		super();
	}
	public Task(int appId, int seId, int reId, String taskStatus, String taskEvent, String taskReply, String taskDate) {
		super();
		this.appId = appId;
		this.seId = seId;
		this.reId = reId;
		this.taskStatus = taskStatus;
		this.taskEvent = taskEvent;
		this.taskReply = taskReply;
		this.taskDate = taskDate;
	}
	public Task(int taskId, int appId, int seId, int reId, String taskStatus, String taskEvent, String taskReply,
			String taskDate) {
		super();
		this.taskId = taskId;
		this.appId = appId;
		this.seId = seId;
		this.reId = reId;
		this.taskStatus = taskStatus;
		this.taskEvent = taskEvent;
		this.taskReply = taskReply;
		this.taskDate = taskDate;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}
	public int getSeId() {
		return seId;
	}
	public void setSeId(int seId) {
		this.seId = seId;
	}
	public int getReId() {
		return reId;
	}
	public void setReId(int reId) {
		this.reId = reId;
	}
	public String getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String getTaskEvent() {
		return taskEvent;
	}
	public void setTaskEvent(String taskEvent) {
		this.taskEvent = taskEvent;
	}
	public String getTaskReply() {
		return taskReply;
	}
	public void setTaskReply(String taskReply) {
		this.taskReply = taskReply;
	}
	public String getTaskDate() {
		return taskDate;
	}
	public void setTaskDate(String taskDate) {
		this.taskDate = taskDate;
	}
	
	
	
	
	

}
