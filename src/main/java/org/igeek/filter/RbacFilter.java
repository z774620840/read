package org.igeek.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.igeek.pojo.Rule;
import org.igeek.service.RbacService;
import org.igeek.service.Impl.RbacServiceImpl;

@WebFilter(filterName="RbacFilter",urlPatterns="*.h" )
public class RbacFilter implements Filter {
	private RbacService rbacService=new RbacServiceImpl();
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("------------init-----------");
	}
	@Override
	@SuppressWarnings("all")
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		String message="";
		HttpServletRequest request=(HttpServletRequest)req;
		HttpServletResponse response=(HttpServletResponse)resp;
		String uri = request.getRequestURI();
		String path=uri.substring(uri.lastIndexOf("/"));
		if("/login.html".equals(path)){
			chain.doFilter(request, response);
			return;
		}
		HttpSession session=request.getSession();
		String username=(String) session.getAttribute("username");
		if(username!=null&&username!="")
		{
			//当前请求地址所属于的权限的id
			Integer requesturlrule=rbacService.getRule_Id(path);
			//System.out.println("requesturlrule:  "+requesturlrule);
			//当前用户拥有的规则 Set  
			Set<Rule> ruleset= rbacService.getUserRuleList(username, "url");
			//将用户的规则的id存放到以下的list中  用来和当前的请求做对比
			List<Integer> rulelist=new ArrayList<Integer>();
			Iterator<Rule> it = ruleset.iterator();  
			while (it.hasNext()) {  
				Rule rule = it.next();  
				rulelist.add(rule.getRule_Id());
			}
			for(Integer num:rulelist)
			{
				if(num.equals(requesturlrule))
				{
					chain.doFilter(request, response);
					return;
				}
			}
			message="您没有相关权限";
		}else{
			message="请先登录";
		}
		request.setAttribute("message",message);
		request.getRequestDispatcher("WEB-INF/view/error.jsp").forward(request, response);
	}

	@Override
	public void destroy() {
		System.out.println("------------destroy-----------");
	}

}
