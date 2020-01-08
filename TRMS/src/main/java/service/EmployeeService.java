package service;

import dao.EmployeeDao;
import dao.EmployeeDaoImp;
import model.Employee;

public class EmployeeService {
	
	public static EmployeeDao e = new EmployeeDaoImp();
	
	public static Employee getEmployee(int eId, String ePass) {
		return e.getEmployee(eId, ePass);
	}
	
	public static Employee getApplicantEmployee(int eId) {
		return e.getApplicantEmployee(eId);
	}

}
