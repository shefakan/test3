package serf;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import webService.EmployeeWebService;
import webService.TaskWebService;
import webService.TuitionAppWebService;


public class RequestHelper {
	
	public static void process(HttpServletRequest request, HttpServletResponse response) {
		
		//This method will delegate other methods
		//on a different layer of our application
		//to process the request.
		
		String uri = request.getRequestURI();
		
		System.out.println(uri);
		
		switch(uri) {
			
//		case "/PokeApp/MasterServlet": {
//			System.out.println("In this case.");
//		}
		case "/TRMS/getTask.do": {
			TaskWebService.getTask(request, response);
			break;
		}
		case "/TRMS/getEmployee.do": {
			EmployeeWebService.getEmployee(request, response);
			break;
		}
		case "/TRMS/appList.do": {
			TuitionAppWebService.appList(request, response);
			break;
		}
		case "/TRMS/responseSeen.do": {
			TaskWebService.responseSeen(request, response);
			break;
		}
		case "/TRMS/completeTask.do": {
			TaskWebService.completeTask(request, response);
			break;
		}
		case "/TRMS/addTask.do": {
			TaskWebService.addTask(request, response);
			break;
		}
		case "/TRMS/allTasks.do": {
			TaskWebService.allTasks(request, response);
			break;
		}
		case "/TRMS/getApplicantEmployee.do": {
			EmployeeWebService.getApplicantEmployee(request, response);
			break;
		}
		
		case "/TRMS/getApplication.do": {
		TuitionAppWebService.getApplication(request, response);
		break;
		}
		case "/TRMS/submitGrade.do": {
			TuitionAppWebService.submitGrade(request, response);
			break;
		}
		case "/TRMS/supApprove.do": {
			TuitionAppWebService.supApprove(request, response);
			break;
		}
		case "/TRMS/hodApprove.do": {
			TuitionAppWebService.hodApprove(request, response);
			break;
		}
		case "/TRMS/ibApprove.do": {
			TuitionAppWebService.ibApprove(request, response);
			break;
		}
		case "/TRMS/fbApprove.do": {
			TuitionAppWebService.fbApprove(request, response);
			break;
		}
		case "/TRMS/supReject.do": {
			TuitionAppWebService.supReject(request, response);
			break;
		}
		case "/TRMS/hodReject.do": {
			TuitionAppWebService.hodReject(request, response);
			break;
		}
		case "/TRMS/bReject.do": {
			TuitionAppWebService.bReject(request, response);
			break;
		}
//		We need another case for  addPokemon.do
//		fill in the string and implementation.
//		It should call one method from PokemonWebService
		case "/TRMS/createTuitionApp.do": {
			TuitionAppWebService.createTuitionApp(request, response);
			break;
		}
		case "/TRMS/incompleteTasks.do": {
			TaskWebService.incompleteTasks(request, response);
			break;
		}
		default: {
			try {
				response.sendError(451, "Get off my lawn!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		}
		
	}

}
