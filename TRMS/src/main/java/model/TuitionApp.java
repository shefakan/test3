package model;

import java.sql.Date;

import oracle.sql.DATE;

public class TuitionApp {
	
	private int appId;
	private int eId;
	String status;
	int eCatId;
	String eventDes;
	String justification;
	String gradeFormat;
	int eCost;
	int rCost;
	String eDate;
	String appDate;
	String supApproval;
	String hodApproval;
	String iBencoApproval;
	String fBencoApproval;
	String fGrade;
	//Date eTime;
	
	public TuitionApp() {
		super();
	}
	
	

	public TuitionApp(int eId, int eCatId, String eventDes, String justification, String gradeFormat, int eCost,
			int rCost, String eDate, String appDate) {
		super();
		this.eId = eId;
		this.eCatId = eCatId;
		this.eventDes = eventDes;
		this.justification = justification;
		this.gradeFormat = gradeFormat;
		this.eCost = eCost;
		this.rCost = rCost;
		this.eDate = eDate;
		this.appDate = appDate;
	}



	public TuitionApp(int appId, int eId, String status, int eCatId, String eventDes, String justification,
			String gradeFormat, int eCost, int rCost, String eDate, String appDate) {
		super();
		this.appId = appId;
		this.eId = eId;
		this.status = status;
		this.eCatId = eCatId;
		this.eventDes = eventDes;
		this.justification = justification;
		this.gradeFormat = gradeFormat;
		this.eCost = eCost;
		this.rCost = rCost;
		this.eDate = eDate;
		this.appDate = appDate;
	}

	public TuitionApp(int appId, int eId, String status, int eCatId, String eventDes, String justification,
			String gradeFormat, int eCost, int rCost, String eDate, String appDate, String supApproval, String hodApproval,
			String iBencoApproval, String fBencoApproval, String fGrade) {
		super();
		this.appId = appId;
		this.eId = eId;
		this.status = status;
		this.eCatId = eCatId;
		this.eventDes = eventDes;
		this.justification = justification;
		this.gradeFormat = gradeFormat;
		this.eCost = eCost;
		this.rCost = rCost;
		this.eDate = eDate;
		this.appDate = appDate;
		this.supApproval = supApproval;
		this.hodApproval = hodApproval;
		this.iBencoApproval = iBencoApproval;
		this.fBencoApproval = fBencoApproval;
		this.fGrade = fGrade;
	}

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int geteCatId() {
		return eCatId;
	}

	public void seteCatId(int eCatId) {
		this.eCatId = eCatId;
	}

	public String getEventDes() {
		return eventDes;
	}

	public void setEventDes(String eventDes) {
		this.eventDes = eventDes;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public String getGradeFormat() {
		return gradeFormat;
	}

	public void setGradeFormat(String gradeFormat) {
		this.gradeFormat = gradeFormat;
	}

	public int geteCost() {
		return eCost;
	}

	public void seteCost(int eCost) {
		this.eCost = eCost;
	}

	public int getrCost() {
		return rCost;
	}

	public void setrCost(int rCost) {
		this.rCost = rCost;
	}

	public String geteDate() {
		return eDate;
	}

	public void seteDate(String eDate) {
		this.eDate = eDate;
	}

	public String getAppDate() {
		return appDate;
	}

	public void setAppDate(String appDate) {
		this.appDate = appDate;
	}

	public String getSupApproval() {
		return supApproval;
	}

	public void setSupApproval(String supApproval) {
		this.supApproval = supApproval;
	}

	public String getHodApproval() {
		return hodApproval;
	}

	public void setHodApproval(String hodApproval) {
		this.hodApproval = hodApproval;
	}

	public String getiBencoApproval() {
		return iBencoApproval;
	}

	public void setiBencoApproval(String iBencoApproval) {
		this.iBencoApproval = iBencoApproval;
	}

	public String getfBencoApproval() {
		return fBencoApproval;
	}

	public void setfBencoApproval(String fBencoApproval) {
		this.fBencoApproval = fBencoApproval;
	}

	public String getfGrade() {
		return fGrade;
	}

	public void setfGrade(String fGrade) {
		this.fGrade = fGrade;
	}

	@Override
	public String toString() {
		return "TuitionApp [appId=" + appId + ", eId=" + eId + ", status=" + status + ", eCatId=" + eCatId
				+ ", eventDes=" + eventDes + ", justification=" + justification + ", gradeFormat=" + gradeFormat
				+ ", eCost=" + eCost + ", rCost=" + rCost + ", eDate=" + eDate + ", appDate=" + appDate
				+ ", supApproval=" + supApproval + ", hodApproval=" + hodApproval + ", iBencoApproval=" + iBencoApproval
				+ ", fBencoApproval=" + fBencoApproval + ", fGrade=" + fGrade + "]";
	}
	
	
	
	

}
