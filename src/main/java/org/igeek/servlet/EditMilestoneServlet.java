package org.igeek.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.igeek.pojo.Milestone;
import org.igeek.service.MileStoneService;
import org.igeek.service.Impl.MileStoneServiceImpl;

@WebServlet("/edit_milestone.html")
public class EditMilestoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MileStoneService mileStoneService = new MileStoneServiceImpl();
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String milestone_id = request.getParameter("mid");
		String project_Id = request.getParameter("pid");
		request.setAttribute("milestone_id", milestone_id);
		request.setAttribute("project_Id", project_Id);
		Integer ss=Integer.parseInt(milestone_id);
		Milestone mileStoneList = mileStoneService.getMileStoneById(ss);
		request.setAttribute("milestone", mileStoneList);	
		request.getRequestDispatcher("WEB-INF/jsp/edit_milestone.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String actual_time =request.getParameter("actual_time");
		Integer milestone_Status = Integer.parseInt(request.getParameter("milestone_status"));
        String project_id =(String) request.getParameter("project_id");
        Integer milestone_id = Integer.parseInt(request.getParameter("milestone_id"));
        Object[] object={actual_time.equals("")?null:actual_time,milestone_Status,project_id,milestone_id};
        int row=new MileStoneServiceImpl().updateMileStones(object);
        if(row>0){
        	response.sendRedirect("project_unified_view.html?pid="+project_id);
        	
        }
		
	}

}

