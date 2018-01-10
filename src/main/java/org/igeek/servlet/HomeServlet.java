package org.igeek.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.igeek.Rbac.Rbac;
import org.igeek.Rbac.Roles;
import org.igeek.pojo.Role;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/home.html")
@Rbac(name="首页",url="/home.html",role={Roles.ADMIN,Roles.BUSINESS,Roles.PROJECT_MANAGER,Roles.CLIENT,Roles.CLIENT_MANAGERS,
										Roles.DEPARTMENT_MANAGER,Roles.LEADER,Roles.MANAGEMENT,Roles.PROJECT_MEMBER,Roles.ACCOUNYANT})
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Role role= (Role) session.getAttribute("role");
		switch (role.getRole_Id()) {
			case Roles.BUSINESS:
				request.getRequestDispatcher("WEB-INF/jsp/index_business.jsp").forward(request, response);
				break;
			case Roles.PROJECT_MANAGER:
				request.getRequestDispatcher("WEB-INF/jsp/index_project_manager.jsp").forward(request, response);
				break;
			case Roles.ADMIN:
				request.getRequestDispatcher("WEB-INF/jsp/index_admin.jsp").forward(request, response);
				break;
			case Roles.CLIENT:
				request.getRequestDispatcher("WEB-INF/jsp/index_project_manager.jsp").forward(request, response);
				break;
			case Roles.ACCOUNYANT:
				request.getRequestDispatcher("WEB-INF/jsp/index_accountant.jsp").forward(request, response);
				break;
			case Roles.CLIENT_MANAGERS:
				request.getRequestDispatcher("WEB-INF/jsp/index_client_managers.jsp").forward(request, response);
				break;
			case Roles.DEPARTMENT_MANAGER:
				request.getRequestDispatcher("WEB-INF/jsp/index_department_manager.jsp").forward(request, response);
				break;
			case Roles.LEADER:
				request.getRequestDispatcher("WEB-INF/jsp/index_leader.jsp").forward(request, response);
				break;
			case Roles.MANAGEMENT:
				request.getRequestDispatcher("WEB-INF/jsp/index_management.jsp").forward(request, response);
				break;
			case Roles.PROJECT_MEMBER:
				request.getRequestDispatcher("WEB-INF/jsp/index_project_member.jsp").forward(request, response);
				break;
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
