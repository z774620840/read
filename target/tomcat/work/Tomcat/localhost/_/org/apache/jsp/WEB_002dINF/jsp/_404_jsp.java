/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-01-09 15:09:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _404_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<style>\r\n");
      out.write("* {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tfont-family: 'Audiowide', cursive, arial, helvetica, sans-serif;\r\n");
      out.write("\tbackground:\r\n");
      out.write("\t\turl(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAoAAAAKCAYAAACNMs+9AAAAUElEQVQYV2NkYGAwBuKzQAwDID4IoIgxIikAMZE1oRiArBDdZBSNMIXoJiFbDZYDKcSmCOYimDuNSVKIzRNYrUYOFuQgweoZbIoxgoeoAAcAEckW11HVTfcAAAAASUVORK5CYII=)\r\n");
      out.write("\t\trepeat;\r\n");
      out.write("\tbackground-color: #212121;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\tpadding-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".error-code {\r\n");
      out.write("\tfont-family: 'Creepster', cursive, arial, helvetica, sans-serif;\r\n");
      out.write("\tfont-size: 200px;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tcolor: rgba(255, 255, 255, 0.98);\r\n");
      out.write("\twidth: 50%;\r\n");
      out.write("\ttext-align: right;\r\n");
      out.write("\tmargin-top: 5%;\r\n");
      out.write("\ttext-shadow: 5px 5px hsl(0, 0%, 25%);\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".not-found {\r\n");
      out.write("\twidth: 47%;\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("\tmargin-top: 5%;\r\n");
      out.write("\tfont-size: 50px;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\ttext-shadow: 2px 2px 5px hsl(0, 0%, 61%);\r\n");
      out.write("\tpadding-top: 70px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".clear {\r\n");
      out.write("\tfloat: none;\r\n");
      out.write("\tclear: both;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".content {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tline-height: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=text] {\r\n");
      out.write("\tborder: hsl(247, 89%, 72%) solid 1px;\r\n");
      out.write("\toutline: none;\r\n");
      out.write("\tpadding: 5px 3px;\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\tborder-radius: 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcolor: #9ECDFF;\r\n");
      out.write("\ttext-shadow: 0px 0px 2px white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a:hover {\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<title>错误</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<p class=\"error-code\">404</p>\r\n");
      out.write("\t<p class=\"not-found\">\r\n");
      out.write("\t\tNot<br />Found\r\n");
      out.write("\t</p>\r\n");
      out.write("\t<div class=\"clear\"></div>\r\n");
      out.write("\t<div class=\"content\">\r\n");
      out.write("\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.errorMsg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" <br />\r\n");
      out.write("\t\t<a href=\"home.html\">回到首页</a> \r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
