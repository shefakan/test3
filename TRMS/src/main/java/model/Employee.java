package model;

public class Employee {
	
	 int eId;
	 String ePass;
	String fName;
	String lName;
	int age;
	String dept;
	int rankNum;	
	int supId;
	int hodId;
	int aCash;
	public Employee() {
		super();
	}
	public Employee(int eId, String ePass, String fName, String lName, int age, String dept, int rankNum, int supId,
			int hodId, int aCash) {
		super();
		this.eId = eId;
		this.ePass = ePass;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.dept = dept;
		this.rankNum = rankNum;
		this.supId = supId;
		this.hodId = hodId;
		this.aCash = aCash;
	}
	public Employee(int eId, String ePass, String fName, String lName, int age, String dept, int rankNum, int supId,
			int hodId) {
		super();
		this.eId = eId;
		this.ePass = ePass;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.dept = dept;
		this.rankNum = rankNum;
		this.supId = supId;
		this.hodId = hodId;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getePass() {
		return ePass;
	}
	public void setePass(String ePass) {
		this.ePass = ePass;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getRankNum() {
		return rankNum;
	}
	public void setRankNum(int rankNum) {
		this.rankNum = rankNum;
	}
	public int getSupId() {
		return supId;
	}
	public void setSupId(int supId) {
		this.supId = supId;
	}
	public int getHodId() {
		return hodId;
	}
	public void setHodId(int hodId) {
		this.hodId = hodId;
	}
	public int getaCash() {
		return aCash;
	}
	public void setaCash(int aCash) {
		this.aCash = aCash;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", ePass=" + ePass + ", fName=" + fName + ", lName=" + lName + ", age=" + age
				+ ", dept=" + dept + ", rankNum=" + rankNum + ", supId=" + supId + ", hodId=" + hodId + ", aCash="
				+ aCash + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}	
	