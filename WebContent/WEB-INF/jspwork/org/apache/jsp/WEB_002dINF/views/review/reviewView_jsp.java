/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.40
 * Generated at: 2019-06-12 03:51:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.review;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import review.model.vo.*;
import java.util.*;
import place.model.vo.*;

public final class reviewView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("place.model.vo");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("review.model.vo");
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
      out.write("\r\n");

	Review rv = (Review)request.getAttribute("rv");
	List<ReviewPhoto> list = (List<ReviewPhoto>)request.getAttribute("list");
	List<ReviewComment> commentList = (List<ReviewComment>)request.getAttribute("commentList");
	Place p = (Place)request.getAttribute("p");
	
	String LoggedId = (String)request.getAttribute("LoggedId");	
	System.out.println("리스트에서 넘어온 로그드아이디:"+LoggedId);
	int num = (Integer)request.getAttribute("num");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery-3.4.0.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/reviewList.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/reviewView.css\" />\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(function(){\r\n");
      out.write("\tvar slideIndex = 0;\r\n");
      out.write("\tshowSlides();\r\n");
      out.write("\r\n");
      out.write("\tfunction showSlides() {\r\n");
      out.write("\t    var i;\r\n");
      out.write("\t    var slides = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("\t    var dots = document.getElementsByClassName(\"dot\");\r\n");
      out.write("\t    for (i = 0; i < slides.length; i++) {\r\n");
      out.write("\t       slides[i].style.display = \"none\";  \r\n");
      out.write("\t    }\r\n");
      out.write("\t    slideIndex++;\r\n");
      out.write("\t    if (slideIndex > slides.length) {slideIndex = 1}    \r\n");
      out.write("\t    for (i = 0; i < dots.length; i++) {\r\n");
      out.write("\t        dots[i].className = dots[i].className.replace(\" active\", \"\");\r\n");
      out.write("\t    }\r\n");
      out.write("\t    slides[slideIndex-1].style.display = \"block\";  \r\n");
      out.write("\t    dots[slideIndex-1].className += \" active\";\r\n");
      out.write("\t    setTimeout(showSlides, 2500); // Change image every 2 seconds\r\n");
      out.write("\t}\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function viewCommentList(reviewNo){\r\n");
      out.write("\tconsole.log(\"확인\");\r\n");
      out.write("\tconsole.log(reviewNo);\r\n");
      out.write("\tvar LoggedId = $(\"input[name=LoggedId]\").val();\r\n");
      out.write("\tconsole.log(LoggedId);\r\n");
      out.write("\t\r\n");
      out.write("\t//팝업창\r\n");
      out.write("\tvar url = \"");
      out.print(request.getContextPath());
      out.write("/review/reviewComment\";\r\n");
      out.write("\tvar title = \"reviewComment\";\r\n");
      out.write("\tvar specs = \"width=800px, height=500px, left=500px, top=100px\";\r\n");
      out.write("\t\t\r\n");
      out.write("\tvar popup = open(\"\",title,specs); // 팝업의 최상위 윈도우객체를 리턴\r\n");
      out.write("\t\t\r\n");
      out.write("\t//폼과 팝업 연결\r\n");
      out.write("\tvar frm = document.moveReviewComment;\r\n");
      out.write("\tfrm.target = title; // 팝업타이틀 지정\r\n");
      out.write("\tfrm.reviewNo.value = reviewNo;\r\n");
      out.write("\tfrm.LoggedId.value = LoggedId;\r\n");
      out.write("\tfrm.action = url;\r\n");
      out.write("\tfrm.submit();  \r\n");
      out.write("};\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function deleteReview(){\r\n");
      out.write("\tif(!confirm(\"이 게시글을 정말 삭제하시겠습니까?\")){\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\t$(\"#reviewDelFrm\").submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function addLike(){\r\n");
      out.write("\t//좋아요 처리\r\n");
      out.write("\tvar ch = $(\"input[name=like]\").prop(\"checked\");\r\n");
      out.write("\tconsole.log(ch);\r\n");
      out.write("\t\r\n");
      out.write("\tvar LoggedId = $(\"input[name=LoggedId]\").val();\r\n");
      out.write("\tvar reviewNo = ");
      out.print(rv.getReviewNo());
      out.write(";\r\n");
      out.write("\t\r\n");
      out.write("\tconsole.log(\"로그인된아이디:\"+LoggedId);\r\n");
      out.write("\tconsole.log(\"좋아요누를글의번호:\"+reviewNo);\r\n");
      out.write("\t\r\n");
      out.write(" \tif(ch){\r\n");
      out.write(" \t\t\r\n");
      out.write(" \t\t$(\"img#checkimg\").attr(\"src\", \"");
      out.print(request.getContextPath());
      out.write("/images/full_heart.png\");\r\n");
      out.write(" \t\t\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:\"");
      out.print(request.getContextPath());
      out.write("/ajax/addReviewLikeCount\",\r\n");
      out.write("\t\t\ttype:\"get\",\r\n");
      out.write("\t\t\tdata:{reviewNo:reviewNo, LoggedId:LoggedId},\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\tconsole.log(data[0].LikeCount);\r\n");
      out.write("\t\t\t\t$(\"#likeCount\").text(+data[0].LikeCount+\"likes\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\telse{\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"img#checkimg\").attr(\"src\", \"");
      out.print(request.getContextPath());
      out.write("/images/empty_heart.png\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:\"");
      out.print(request.getContextPath());
      out.write("/ajax/deleteReviewLikeCount\",\r\n");
      out.write("\t\t\ttype:\"get\",\r\n");
      out.write("\t\t\tdata:{reviewNo:reviewNo, LoggedId:LoggedId},\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\tconsole.log(data[0].LikeCount);\r\n");
      out.write("\t\t\t\t$(\"#likeCount\").text(data[0].LikeCount+\"likes\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}; \r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"moveReviewComment\" method=\"post\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"reviewNo\" value=\"");
      out.print(rv.getReviewNo() );
      out.write("\" />\r\n");
      out.write("\t<input type=\"hidden\" name=\"LoggedId\" value=\"");
      out.print(LoggedId.equals("")?"":LoggedId );
      out.write("\" />\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<input type=\"hidden\" name=\"LoggedId\" value=\"");
      out.print(LoggedId );
      out.write("\" />\r\n");
      out.write("\r\n");
      out.write("<div class=\"slideshow-container\">\r\n");
      out.write("\t");
if(!list.isEmpty()){
		 int i = 1;
	     for(ReviewPhoto rp : list){
      out.write("\r\n");
      out.write("\t<div class=\"mySlides fade\">\r\n");
      out.write("  \t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/upload/review/");
      out.print(rp.getRenamedPhotoName() );
      out.write("\" width=\"350px\" height=\"350px\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
} 
	  i++;}
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("<div class=\"review-content-list\">\r\n");
      out.write("\t<table id=\"review-content-table\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"3\" id=\"review-place\">\r\n");
      out.write("\t\t\t\t");
      out.print(p.getPlaceName());
      out.write("\r\n");
      out.write("\t\t\t\t");
for(int i=0; i<rv.getPlaceRating(); i++){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<img id=\"star\" src=\"");
      out.print(request.getContextPath());
      out.write("/images/star.png\" width=\"15px\" height=\"15px\">\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\" id=\"review-title\">");
      out.print(rv.getReviewTitle() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td id=\"review-id\">\r\n");
      out.write("\t\t\t\t");
      out.print(rv.getMemberId() );
      out.write(" <br />\r\n");
      out.write("\t\t\t\t");
      out.print(rv.getReviewDate() );
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"3\" ><div id=\"review-content\">");
      out.print(rv.getReviewContent() );
      out.write("</div></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t");
if(num==1){ 
      out.write("\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" name=\"like\" id=\"like\" checked=\"checked\" onchange=\"addLike();\" ");
      out.print(LoggedId.equals("")?"disabled":"" );
      out.write(" />\r\n");
      out.write("\t\t\t\t<label for=\"like\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/full_heart.png\" alt=\"\" id=\"checkimg\" width=\"30px\"/></label>\r\n");
      out.write("\t\t\t\t");
} else{
      out.write("\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" name=\"like\" id=\"like\" onchange=\"addLike();\" ");
      out.print(LoggedId.equals("")?"disabled":"" );
      out.write(" /> \r\n");
      out.write("\t\t\t\t<label for=\"like\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/empty_heart.png\" alt=\"\" id=\"checkimg\" width=\"30px\"/></label>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t<br /><span id=\"likeCount\">");
      out.print(rv.getLikeCount() );
      out.write("likes</span> \t\t\t\t\t\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"comment-container\">\r\n");
      out.write("\t\t");
if(!LoggedId.equals(" ")){ 
      out.write("\r\n");
      out.write("\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/review/reviewCommentInsert\" id=\"reviewCommentFrm\" name=\"reviewCommentFrm\" method=\"post\">\r\n");
      out.write("\t\t\t<textarea name=\"reviewCommentContent\" id=\"reviewCommentContent\" placeholder=\"댓글을 입력하세요\"></textarea>\r\n");
      out.write("\t\t\t<button type=\"submit\" id=\"btn-insert\" class=\"btn\">등록</button>\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"reviewRef\" value=\"");
      out.print(rv.getReviewNo());
      out.write("\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"reviewCommentWriter\" value=\"");
      out.print(LoggedId );
      out.write("\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"reviewCommentLevel\" value=\"1\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"reviewCommentRef\" value=\"0\" />\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t");
} 
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/review/reviewDelete\" method=\"post\" id=\"reviewDelFrm\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"reviewNo\" value=\"");
      out.print(rv.getReviewNo());
      out.write("\" />\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"review-botton\">\r\n");
      out.write("\t\t");
if(LoggedId.equals(rv.getMemberId())){ 
      out.write("\r\n");
      out.write("\t\t\t<button onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/review/reviewUpdate?reviewNo=");
      out.print(rv.getReviewNo());
      out.write("'\">수정하기</button>\r\n");
      out.write("\t\t\t<button onclick=\"deleteReview();\">삭제하기</button>\r\n");
      out.write("\t\t");
} 
      out.write("\r\n");
      out.write("\t\t<button onclick=\"viewCommentList(");
      out.print(rv.getReviewNo());
      out.write(");\" >댓글 보기</button>\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
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
