package org.igeek.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.html")
public class MyForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		String ctxPath = this.getServletContext().getContextPath();
		int index = uri.lastIndexOf('.');
		String path = uri.substring(ctxPath.length(), index);
		String dispatcherPath = String.format("/WEB-INF/jsp%s.jsp", path);
		//System.out.println(dispatcherPath);
		request.getRequestDispatcher(dispatcherPath).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
