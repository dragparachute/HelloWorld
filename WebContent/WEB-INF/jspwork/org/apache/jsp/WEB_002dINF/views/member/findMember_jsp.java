/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.40
 * Generated at: 2019-06-12 02:39:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class findMember_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

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
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/findMember.css\" />\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery-3.4.0.js\"></script>\r\n");
      out.write("\r\n");

	String findIdMsg = (String)request.getAttribute("findIdMsg");
	String findPasswordMsg = (String)request.getAttribute("findPasswordMsg");
	
	String memberName = (String)request.getAttribute("memberName");
	String tel = (String)request.getAttribute("tel");
	String memberId = (String)request.getAttribute("memberId");
	String question = (String)request.getAttribute("question");
	String answer = (String)request.getAttribute("answer");

      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function resetAll(){\r\n");
      out.write("\t$(\"input[type=text]\").val(\"\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$(\"#updatePasswordAfterFind\").click(function(){\r\n");
      out.write("\t\twindow.opener.top.location.href=\"");
      out.print(request.getContextPath());
      out.write("/member/updatePasswordAfterFind?memberId=");
      out.print(memberId);
      out.write("\";\r\n");
      out.write("        window.close();\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div id=\"find-container\">\r\n");
      out.write("\t<div id=\"findId\">\r\n");
      out.write("\t<h2>아이디 찾기</h2>\r\n");
      out.write("\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/member/findMemberId\"\r\n");
      out.write("\t\t\t  id=\"findIdFrm\"\r\n");
      out.write("\t\t\t  name=\"findIdFrm\"\r\n");
      out.write("\t\t\t  method=\"post\">\r\n");
      out.write("\t\t\t<label for=\"memberName\">회원이름</label>\r\n");
      out.write("\t\t\t<input type=\"text\" \r\n");
      out.write("\t\t\t\t   id=\"memberName\" \r\n");
      out.write("\t\t\t\t   name=\"memberName\" \r\n");
      out.write("\t\t\t\t   value=\"");
      out.print(memberName!=null?memberName:"");
      out.write("\"\r\n");
      out.write("\t\t\t\t   required/>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<label for=\"tel\">전화번호</label>\r\n");
      out.write("\t\t\t<input type=\"text\" \r\n");
      out.write("\t\t\t\t   id=\"tel\" \r\n");
      out.write("\t\t\t\t   name=\"tel\" \r\n");
      out.write("\t\t\t\t   value=\"");
      out.print(tel!=null?tel:"");
      out.write("\"\r\n");
      out.write("\t\t\t\t   required/>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"초기화\" onclick=\"resetAll();\"/>\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"아이디 찾기\" />\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<span id=\"findIdSpan\">");
      out.print(findIdMsg!=null?findIdMsg:"");
      out.write("</span>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<hr />\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"findPassword\">\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<h2>비밀번호 찾기</h2>\r\n");
      out.write("\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/member/findMemberPassword\"\r\n");
      out.write("\t\t\t  id=\"findPasswordFrm\"\r\n");
      out.write("\t\t\t  name=\"findPasswordFrm\"\r\n");
      out.write("\t\t\t  method=\"post\">\r\n");
      out.write("\t\t\t<label for=\"memberId\" >회원 아이디</label>\r\n");
      out.write("\t\t\t<input type=\"text\" \r\n");
      out.write("\t\t\t\t   id=\"memberId\" \r\n");
      out.write("\t\t\t\t   name=\"memberId\" \r\n");
      out.write("\t\t\t\t   value=\"");
      out.print(memberId!=null?memberId:"");
      out.write("\"\r\n");
      out.write("\t\t\t\t   required/>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<label for=\"question\">찾기 질문</label>\r\n");
      out.write("\t\t\t&nbsp;\r\n");
      out.write("\t\t\t<select name=\"question\" \r\n");
      out.write("\t\t\t\t\t    id=\"question\"\r\n");
      out.write("\t\t\t\t\t    required>\r\n");
      out.write("\t\t\t\t\t<option value=\"\">비밀번호 찾기 질문</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"나의 고향은?\" ");
      out.print(question!=null&&question.equals("나의 고향은?")?"selected":"");
      out.write(">나의 고향은?</option>\r\n");
      out.write("\t\t            <option value=\"보물 1호는?\" ");
      out.print(question!=null&&question.equals("보물 1호는?")?"selected":"");
      out.write(">보물 1호는?</option>\r\n");
      out.write("\t\t            <option value=\"어머니의 성함은?\" ");
      out.print(question!=null&&question.equals("어머니의 성함은?")?"selected":"");
      out.write(">어머니의 성함은?</option>\r\n");
      out.write("\t\t            <option value=\"나의 가장 친한 친구는?\" ");
      out.print(question!=null&&question.equals("나의 가장 친한 친구는?")?"selected":"");
      out.write(">나의 가장 친한 친구는?</option>\r\n");
      out.write("\t\t\t</select> \r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<label for=\"answer\">질문 정답</label>\r\n");
      out.write("\t\t\t<input type=\"text\" \r\n");
      out.write("\t\t\t\t   id=\"answer\" \r\n");
      out.write("\t\t\t\t   name=\"answer\" \r\n");
      out.write("\t\t\t\t   value=\"");
      out.print(answer!=null?answer:"");
      out.write("\"\r\n");
      out.write("\t\t\t\t   required/>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"초기화\" onclick=\"resetAll();\"/>\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"비밀번호 찾기\" />\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<span id=\"findPasswordSpan\">");
      out.print(findPasswordMsg!=null?findPasswordMsg:"");
      out.write("</span>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
