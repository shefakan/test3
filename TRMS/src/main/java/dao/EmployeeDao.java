package dao;

import model.Employee;

public interface EmployeeDao {
	
	public Employee getEmployee(int eId, String ePass);
	
	public Employee getApplicantEmployee(int eId);

}
