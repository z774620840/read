/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-03-09 03:51:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Categories_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<title>iRead | 欢迎来到爱阅读网络书屋</title>\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"topbar\">\r\n");
      out.write("\t\t<div id=\"TopSection\">\r\n");
      out.write("\t\t\t<h1 id=\"sitename\">\r\n");
      out.write("\t\t\t\t<span><a href=\"#\">I</a></span><a href=\"#\">Read</a>\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\t\t\t<div id=\"topbarnav\">\r\n");
      out.write("\t\t\t\t<span class=\"topnavitems\"><a href=\"3\">注册</a> | <a href=\"3\">登录\r\n");
      out.write("\t\t\t\t</a></span>\r\n");
      out.write("\t\t\t\t<form action=\"#\">\r\n");
      out.write("\t\t\t\t\t<div class=\"searchform\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"searchtxt\"> 找书: </label> <input class=\"keywordfield\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"searchtxt\" /> <input type=\"submit\" value=\"搜索\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t<ul id=\"topmenu\">\r\n");
      out.write("\t\t\t\t<li><a href=\"bookindex.html\">首页</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"Categories.html\">分类</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"table.html\">排行榜</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"form.html\">推荐</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"notes.html\">免费</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"wrap\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"contents\">\r\n");
      out.write("\t\t\t<div id=\"left\">\r\n");
      out.write("\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">Blog Example</a>\r\n");
      out.write("\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t<p class=\"postdata\">Posted on 27/10/2007 by UserName</p>\r\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.\r\n");
      out.write("\t\t\t\t\tInteger ac orci. Vestibulum rutrum. Praesent a lectus. Nam ultrices\r\n");
      out.write("\t\t\t\t\teuismod dolor. Donec rutrum felis et mauris. Vestibulum nisl. Ut\r\n");
      out.write("\t\t\t\t\tultrices. Nunc adipiscing est ultrices augue. Aliquam commodo. Ut\r\n");
      out.write("\t\t\t\t\tiaculis tortor eu augue. Nullam mattis, turpis sed suscipit\r\n");
      out.write("\t\t\t\t\teuismod, est enim fermentum lorem, ac ornare est turpis eget\r\n");
      out.write("\t\t\t\t\tligula.</p>\r\n");
      out.write("\t\t\t\t<h3>Heading 3 - Blockquote</h3>\r\n");
      out.write("\t\t\t\t<blockquote>\r\n");
      out.write("\t\t\t\t\t<p>Donec dictum nibh nec est. Aliquam sagittis, lacus a\r\n");
      out.write("\t\t\t\t\t\tpharetra tempor, enim justo tempor nisi, at aliquet nulla metus\r\n");
      out.write("\t\t\t\t\t\tsed augue. Praesent sed nibh. Vestibulum bibendum enim ut nisi\r\n");
      out.write("\t\t\t\t\t\tfringilla accumsan. Nullam dapibus fermentum nulla. Phasellus in\r\n");
      out.write("\t\t\t\t\t\torci vel justo facilisis iaculis. Quisque facilisis ornare felis.\r\n");
      out.write("\t\t\t\t\t\tCurabitur nunc libero, dapibus vel, commodo nec, semper a, massa.\r\n");
      out.write("\t\t\t\t\t\tSuspendisse potenti.</p>\r\n");
      out.write("\t\t\t\t</blockquote>\r\n");
      out.write("\t\t\t\t<h4>Heading 4 - List Example</h4>\r\n");
      out.write("\t\t\t\t<h4>Unordered List</h4>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li>Lorem ipsum dolor sit amet</li>\r\n");
      out.write("\t\t\t\t\t<li>Consectetuer adipiscing elit.</li>\r\n");
      out.write("\t\t\t\t\t<li>In nonummy, ipsum a varius gravida, justo justo sagittis\r\n");
      out.write("\t\t\t\t\t\tfelis, convallis ornare odio erat sed leo.</li>\r\n");
      out.write("\t\t\t\t\t<li>Sed laoreet massa ac erat iaculis faucibus.</li>\r\n");
      out.write("\t\t\t\t\t<li>Maecenas dapibus.</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t\t<h3>Ordered List</h3>\r\n");
      out.write("\t\t\t\t<p>Ordred List Example</p>\r\n");
      out.write("\t\t\t\t<ol>\r\n");
      out.write("\t\t\t\t\t<li>Suspendisse ac sapien in turpis rutrum consectetuer.</li>\r\n");
      out.write("\t\t\t\t\t<li>Quisque vel tellus.</li>\r\n");
      out.write("\t\t\t\t\t<li>Sed orci turpis, rutrum sed, commodo eu, ullamcorper sit\r\n");
      out.write("\t\t\t\t\t\tamet, velit.</li>\r\n");
      out.write("\t\t\t\t\t<li>Praesent malesuada, enim sit amet pretium ultrices, libero\r\n");
      out.write("\t\t\t\t\t\tlibero vulputate metus, a porttitor magna nulla nec massa.</li>\r\n");
      out.write("\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t<img class=\"alignleft\" src=\"images/3.jpg\" alt=\"Image 2\" />\r\n");
      out.write("\t\t\t\t<p>Vestibulum venenatis. Nulla vel ipsum. Proin rutrum, urna sit\r\n");
      out.write("\t\t\t\t\tamet bibendum pellentesque, ante sapien varius turpis, eu nonummy\r\n");
      out.write("\t\t\t\t\tnunc urna scelerisque ante. Nunc sed leo at dolor pharetra\r\n");
      out.write("\t\t\t\t\tfacilisis. Sed sed lectus at justo dapibus tristique. Morbi\r\n");
      out.write("\t\t\t\t\tmolestie pulvinar elit. Donec dictum nibh nec est. Aliquam\r\n");
      out.write("\t\t\t\t\tsagittis, lacus a pharetra tempor, enim justo tempor nisi, at\r\n");
      out.write("\t\t\t\t\taliquet nulla metus sed augue. Praesent sed nibh. Vestibulum\r\n");
      out.write("\t\t\t\t\tbibendum enim ut nisi fringilla accumsan. Nullam dapibus fermentum\r\n");
      out.write("\t\t\t\t\tnulla. Phasellus in orci vel justo facilisis iaculis. Quisque\r\n");
      out.write("\t\t\t\t\tfacilisis ornare felis. Curabitur nunc libero, dapibus vel, commodo\r\n");
      out.write("\t\t\t\t\tnec, semper a, massa. Suspendisse potenti. Morbi a nisl. Nunc\r\n");
      out.write("\t\t\t\t\teuismod elit non lectus.</p>\r\n");
      out.write("\t\t\t\t<p class=\"postmetadata\">No Comment | Add Comment | Category</p>\r\n");
      out.write("\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">Comments Example</a>\r\n");
      out.write("\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t<p class=\"postdata\">Posted on 27/10/2007 by UserName</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<img class=\"alignright\" src=\"images/1.jpg\" alt=\"Image 3\" />\r\n");
      out.write("\t\t\t\t<p>Cras velit libero, lacinia ut, euismod at, semper suscipit,\r\n");
      out.write("\t\t\t\t\telit. Ut nec mauris at diam dignissim aliquam. Donec eu mi at nisl\r\n");
      out.write("\t\t\t\t\tsagittis tincidunt. Pellentesque feugiat molestie nunc. In\r\n");
      out.write("\t\t\t\t\tlobortis, est eget bibendum hendrerit, ipsum augue venenatis lorem,\r\n");
      out.write("\t\t\t\t\tnec sodales metus arcu sit amet nisi. Duis iaculis orci et tortor.\r\n");
      out.write("\t\t\t\t\tCum sociis natoque penatibus et magnis dis parturient montes,\r\n");
      out.write("\t\t\t\t\tnascetur ridiculus mus. Duis id lacus. Praesent faucibus, mauris et\r\n");
      out.write("\t\t\t\t\tlobortis tristique, mi justo consectetuer nulla, et pretium mauris\r\n");
      out.write("\t\t\t\t\tlacus ut elit. Etiam leo leo, auctor eget, tristique eu, ultrices\r\n");
      out.write("\t\t\t\t\teu, lorem. Nulla facilisi. Praesent imperdiet ante elementum nisi\r\n");
      out.write("\t\t\t\t\tvestibulum pharetra. Aliquam ullamcorper, lectus ut rhoncus\r\n");
      out.write("\t\t\t\t\tgravida, ligula velit porttitor nisi, non laoreet diam dui ac\r\n");
      out.write("\t\t\t\t\tmauris. Class aptent taciti sociosqu ad litora torquent per conubia\r\n");
      out.write("\t\t\t\t\tnostra, per inceptos hymenaeos. Cras pharetra pulvinar dolor.</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<p class=\"postmetadata\">No Comment | Add Comment | Category</p>\r\n");
      out.write("\t\t\t\t<div id=\"commenttpl\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<p class=\"nocomments\">This post is password protected.</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<h5 id=\"comments\">5 Comments in response to &quot;Image in a\r\n");
      out.write("\t\t\t\t\t\tpost&quot;</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<ol class=\"commentlist\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><cite>UserOne</cite> <small class=\"commentmeta\">Posted\r\n");
      out.write("\t\t\t\t\t\t\t\ton 23/10/2007 at 10:15 AM</small> <span class=\"commenttxt\">Praesent\r\n");
      out.write("\t\t\t\t\t\t\t\terat. Nulla venenatis lorem quis nisi. Aliquam congue, pede a\r\n");
      out.write("\t\t\t\t\t\t\t\tfacilisis porttitor, ligula nisl rhoncus purus, vel placerat\r\n");
      out.write("\t\t\t\t\t\t\t\tnulla metus eget erat.</span></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><cite>UserOne</cite> <small class=\"commentmeta\">Posted\r\n");
      out.write("\t\t\t\t\t\t\t\ton 23/10/2007 at 10:15 AM</small> <span class=\"commenttxt\">Praesent\r\n");
      out.write("\t\t\t\t\t\t\t\terat. Nulla venenatis lorem quis nisi. Aliquam congue, pede a\r\n");
      out.write("\t\t\t\t\t\t\t\tfacilisis porttitor, ligula nisl rhoncus purus, vel placerat\r\n");
      out.write("\t\t\t\t\t\t\t\tnulla metus eget erat.</span></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><cite>UserOne</cite> <small class=\"commentmeta\">Posted\r\n");
      out.write("\t\t\t\t\t\t\t\ton 23/10/2007 at 10:15 AM</small> <span class=\"commenttxt\">Praesent\r\n");
      out.write("\t\t\t\t\t\t\t\terat. Nulla venenatis lorem quis nisi. Aliquam congue, pede a\r\n");
      out.write("\t\t\t\t\t\t\t\tfacilisis porttitor, ligula nisl rhoncus purus, vel placerat\r\n");
      out.write("\t\t\t\t\t\t\t\tnulla metus eget erat.</span></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><cite>UserOne</cite> <small class=\"commentmeta\">Posted\r\n");
      out.write("\t\t\t\t\t\t\t\ton 23/10/2007 at 10:15 AM</small> <span class=\"commenttxt\">Praesent\r\n");
      out.write("\t\t\t\t\t\t\t\terat. Nulla venenatis lorem quis nisi. Aliquam congue, pede a\r\n");
      out.write("\t\t\t\t\t\t\t\tfacilisis porttitor, ligula nisl rhoncus purus, vel placerat\r\n");
      out.write("\t\t\t\t\t\t\t\tnulla metus eget erat.</span></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><cite>UserOne</cite> <small class=\"commentmeta\">Posted\r\n");
      out.write("\t\t\t\t\t\t\t\ton 23/10/2007 at 10:15 AM</small> <span class=\"commenttxt\">Praesent\r\n");
      out.write("\t\t\t\t\t\t\t\terat. Nulla venenatis lorem quis nisi. Aliquam congue, pede a\r\n");
      out.write("\t\t\t\t\t\t\t\tfacilisis porttitor, ligula nisl rhoncus purus, vel placerat\r\n");
      out.write("\t\t\t\t\t\t\t\tnulla metus eget erat.</span></li>\r\n");
      out.write("\t\t\t\t\t</ol>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<h5 class=\"subhead\" id=\"respond\">Leave a Reply</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\tYou must be <a href=\"#\">logged in</a> to post a comment.\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<form action=\"#\" method=\"post\" id=\"commentform\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\tLogged in as <a href=\"#\">UserName</a>. <a href=\"#\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle=\"Log out of this account\">Logout &raquo;</a>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"textfield\" type=\"text\" name=\"author\" id=\"author\"\r\n");
      out.write("\t\t\t\t\t\t\t\tsize=\"22\" tabindex=\"1\" /> <label for=\"author\"><small>Name\r\n");
      out.write("\t\t\t\t\t\t\t</small></label>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"textfield\" type=\"text\" name=\"email\" id=\"email\"\r\n");
      out.write("\t\t\t\t\t\t\t\tsize=\"22\" tabindex=\"2\" /> <label for=\"email\"><small>Mail\r\n");
      out.write("\t\t\t\t\t\t\t\t\t(will not be published) </small></label>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"textfield\" type=\"text\" name=\"url\" id=\"url\"\r\n");
      out.write("\t\t\t\t\t\t\t\tsize=\"22\" tabindex=\"3\" /> <label for=\"url\"><small>Website</small></label>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<textarea class=\"textfield\" name=\"comment\" id=\"comment\" cols=\"55\"\r\n");
      out.write("\t\t\t\t\t\t\t\trows=\"10\" tabindex=\"4\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<input name=\"submit\" type=\"submit\" id=\"submit\" tabindex=\"5\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"Submit Comment\" />\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t<div class=\"span12\">\r\n");
      out.write("\t\t\t <span class=\"label badge-info\">文字标签</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"sidebar\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><h2>分类</h2></li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<ul id=\"categories\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">现代</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">古代</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">玄幻</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">仙侠</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">悬疑</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">科幻</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<h2>字数</h2>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<ul id=\"blogroll\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"http://opendesigns.org\">10万以下</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"http://ramblingsoul.com\">10~30万</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"http://www.cssfreebies.com\">CSS Freebies</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li><h2>Recent Entries</h2></li>\r\n");
      out.write("\t\t\t\t\t<li id=\"recententries\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Lorem Ipsum Dolor Sit</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Cras Velit Libero, Lacinia ut, Euismod\r\n");
      out.write("\t\t\t\t\t\t\t\t\tat</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> Aliquam sagittis, lacus a pharetra\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttempor, enim justo tempor nisi, at aliquet nulla metus sed\r\n");
      out.write("\t\t\t\t\t\t\t\t\taugue.</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> Praesent sed nibh. </a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"footer\">\r\n");
      out.write("\t\t\r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"credit\">Designed by ZJN</div>\r\n");
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
