package org.igeek.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.igeek.pojo.ViewAccountApply;
import org.igeek.service.Impl.AccountServiceImpl;

/**
 * Servlet implementation class ShowDetail
 */
@WebServlet("/detailAccountMessage.html")
public class ShowDetailAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String clientid = request.getParameter("client_id");
		Integer client_Id = Integer.parseInt(clientid);
		Boolean passstatus = Boolean.valueOf(request.getParameter("passstatus"));
		request.setAttribute("passstatus", passstatus);
		ViewAccountApply v = new AccountServiceImpl().findAllByClientId(client_Id);
		if(v!=null) {
			request.setAttribute("viewapply", v);
			request.getRequestDispatcher("accountApplyDetail.html").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
