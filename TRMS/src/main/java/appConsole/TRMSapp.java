package appConsole;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import model.Employee;
import model.TuitionApp;
import service.EmployeeService;
import service.TuitionAppService;

public class TRMSapp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 
		 
		 
			int eId = 3;
			
			int eCatId = 1;
			String eventDes = "good";
			String justification = "wella";
			String gradeFormat = "percentage. 70% pass mark";
			int eCost = 900;
			int rCost = 100;
			
			
			String eDate = "20-10-2019";
			String appDate = "10-1-2019";
			
			
			
		//	Date appDate  = new Date(2020-01-01);
			
		//	System.out.println(appDate.toLocalDate());
//			
//			SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
//		
//			   java.util.Date edate;
//			try {
//				edate = formatter.parse(e1Date);
//				 System.out.println(edate);
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		 
		TuitionApp ta = new TuitionApp(eId, eCatId,  eventDes,  justification, gradeFormat, eCost,  rCost,  eDate, appDate);
		 
		System.out.println(TuitionAppService.createTuitionApp(ta));
		 System.out.println(ta);
			  
		
		 
		 ////////////////////////////////////////////////////////////////////////////////
		 
		 
				
				 
		

			

		

	}

	
	

	

}
