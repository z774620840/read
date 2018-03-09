package org.igeek.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.igeek.service.Impl.RegisterServiceImpl;


@WebServlet("/register.html")
public class RegisterServlet extends HttpServlet {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5124496653901625330L;
	
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/jsp/register.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	
		Object[] object={username,password};
	        int row=new RegisterServiceImpl().insertWebUser(object);
	        if(row>0){
	        	response.sendRedirect("registersuccess.html");
	        }
		
	}

}
