package webService;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.fasterxml.jackson.databind.ObjectMapper;

import model.Employee;
import service.EmployeeService;


public class EmployeeWebService {
	
	public static void getEmployee(HttpServletRequest request, HttpServletResponse response) {
		int eId = Integer.parseInt(request.getParameter("eId"));
		String ePass = request.getParameter("ePass");
		
		System.out.println(eId+" "+ePass);
		
		Employee em = EmployeeService.getEmployee(eId, ePass);
		
		ObjectMapper om = new ObjectMapper();
		System.out.println(em);
		
		

		try {
			String employeeJSON = om.writeValueAsString(em);
			response.getWriter().append(employeeJSON);
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
//		try {
//			if(em != null) {
//				employeeJSON = om.writeValueAsString("Welcome " + em.getfName() + " " + em.getlName());
//				response.getWriter().append(employeeJSON);
//			}else {
//				employeeJSON = om.writeValueAsString("Invalid Login. Please help re-enter login details.");
//				response.getWriter().append(employeeJSON);
//			}
//			
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
	

	public static void getApplicantEmployee(HttpServletRequest request, HttpServletResponse response) {
		int eId = Integer.parseInt(request.getParameter("eId"));
		
		
		System.out.println(eId);
		
		Employee ae = EmployeeService.getApplicantEmployee(eId);
		
		ObjectMapper om = new ObjectMapper();
		System.out.println(ae);
		
		

		try {
			String applicantJSON = om.writeValueAsString(ae);
			response.getWriter().append(applicantJSON);
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		

	}


}
