package org.igeek.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.igeek.pojo.Page;
import org.igeek.service.Impl.WeeklyReportListImpl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Servlet implementation class GetWeeklyReportServlet
 */
@WebServlet("/getWeeklyReport.html")
public class GetWeeklyReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json;charset=UTF-8");
		Integer pageSize = 1;
		Integer currentPage = 1;
		String pageStr = request.getParameter("page");
		String project_Id = request.getParameter("pid");
		if(pageStr!=null && pageStr.matches("^[0-9]*[1-9][0-9]*$")){
			currentPage = Integer.parseInt(pageStr);
		}
		Page<Object> page = new WeeklyReportListImpl().getAllWeeklyReport(project_Id, currentPage, pageSize);
		Gson gson =  new GsonBuilder()  
				  .setDateFormat("yyyy-MM-dd")  
				  .create(); 
		String jsonString  = gson.toJson(page);
		response.getWriter().print(jsonString);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
