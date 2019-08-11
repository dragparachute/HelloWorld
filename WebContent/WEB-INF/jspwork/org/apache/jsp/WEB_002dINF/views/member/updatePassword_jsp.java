/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.40
 * Generated at: 2019-06-11 10:54:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.*;

public final class updatePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1560177730376L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1560168410310L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("member.model.vo");
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");

	Member memberLoggedIn = (Member)session.getAttribute("memberLoggedIn");
	String visit = (String)request.getAttribute("visit");	

	//쿠키 관련 처리
	Cookie[] cookies = request.getCookies();
	boolean saveIdFlag = false;
	String memberIdSaved = "";
	
	if(cookies != null){
		for(Cookie c: cookies){
			String key = c.getName();
			String value = c.getValue();
			if("saveId".equals(key)){
				saveIdFlag = true;
				memberIdSaved = value;
			}
		}
	}
	if(memberLoggedIn != null){
	System.out.println(memberLoggedIn.getAnswer().replaceAll(" ", "").replaceAll("\\p{Z}", ""));
	}
	System.out.println("멤버로그드인=="+memberLoggedIn);

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/common.css\" />\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery-3.4.0.js\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("$(function(){\r\n");
      out.write("\t");

	if(visit!=null && "first".equals(visit)){
	
      out.write("\r\n");
      out.write("\t\t$(\"#menubar\").css(\"right\",\"0px\");\r\n");
      out.write("\t\t$(\"#menubar\").css(\"display\",\"inline\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t");

		visit = "none";
	}
	
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t/* 메뉴바 클릭 이벤트 */\r\n");
      out.write("\t$(\"#menu_img\").click(function(){\r\n");
      out.write("\t\t$(\"#menubar\").animate({'right':'0px'},300,'linear');\r\n");
      out.write("\t\t$(\"#menubar\").css(\"display\",\"inline\");\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#menubar-close\").click(function(){\r\n");
      out.write("\t\t$(\"#menubar\").animate({'right':'-290px'},300, function(){\r\n");
      out.write("\t\t\t$(\"#menubar\").css(\"display\",\"none\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#chat-close\").click(function(){\r\n");
      out.write("\t\t$(\"#chatList-container\").css({'display':'none'});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t");
if(memberLoggedIn==null){
      out.write("\r\n");
      out.write("\t$(\"#chat_img\").click(function(){\r\n");
      out.write("\t\talert(\"로그인을 해주세요.\");\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t});\r\n");
      out.write("\t");
}
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#chatList-container\").draggable();\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* 로그인이 안된상태라면 웹소켓 접속 X */\r\n");
 if(memberLoggedIn!=null){ 
      out.write("\r\n");
      out.write("\r\n");
      out.write("var host = location.host;//접속하고 있는 서버의 ip주소\r\n");
      out.write("var ws = new WebSocket(\"ws://\"+host+\"");
      out.print(request.getContextPath());
      out.write("/chatWebSocket\");\r\n");
      out.write("\r\n");
      out.write("function chatFunction(){\r\n");
      out.write("\t\r\n");
      out.write("\t");
 if("admin".equals(memberLoggedIn.getMemberId())){
      out.write("\r\n");
      out.write("\t\t/* 관리자는 채팅메뉴 클릭시 현재 접속 인원수대로 채팅 방이 만들어진다 */\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl: \"");
      out.print(request.getContextPath());
      out.write("/chat/clientList.chat\",\r\n");
      out.write("\t\t\tdataType: \"json\",\r\n");
      out.write("\t\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t\tfor(var i=0; i<data.length; i++){\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(data[i]==\"admin\" || $(\"[name=\"+data[i]+\"]\").html()) continue;\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar html = '<button id=\"chatroom-show-btn\" onclick=\"viewChat(this);\">'+data[i]+'</button>';\r\n");
      out.write("\t\t\t\t\t$(\"#memberIdList-container\").append(html);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\thtml = '<div id=\"chat-container\" name=\"'+data[i]+'\">'\r\n");
      out.write("\t\t\t\t\thtml += '<div id=\"chatLog-container\">';\r\n");
      out.write("\t\t\t\t\thtml += '<div id=\"chatLog\"></div>';\t\r\n");
      out.write("\t\t\t\t\thtml += '<div id=\"current-chat\"></div></div>';\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t/* 사용자 input태그 */\r\n");
      out.write("\t\t\t\t\thtml += '<div id=\"input\">';\r\n");
      out.write("\t\t\t\t\thtml += '<input type=\"text\" id=\"chat-msg\" onkeypress=\"enterEvent(event, this);\">';\r\n");
      out.write("\t\t\t\t\thtml += '<button id=\"btn-send\" onclick=\"sendAnswer(this);\">전송</button></div></div>';\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$(\"#chatList-container\").append(html);\r\n");
      out.write("\t\t\t\t\t$(\"#chat-container\").siblings(\"#chat-container\").hide();\r\n");
      out.write("\t\t\t\t}//end of for\r\n");
      out.write("\t\t\t}//end of success\r\n");
      out.write("\t\t})//end of ajax\r\n");
      out.write("\t");
}else{
      out.write("\r\n");
      out.write("\t\t/* 채팅방을 열때마다 로그 최신화 */\r\n");
      out.write("\t\t$(\"#chatLog #msg\").remove();\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl: \"");
      out.print(request.getContextPath());
      out.write("/chat/chatLogList.chat\",\r\n");
      out.write("\t\t\tdataType: \"json\",\r\n");
      out.write("\t\t\tdata: \"userId=");
      out.print(memberLoggedIn.getMemberId());
      out.write("\",//파라미터직렬화\r\n");
      out.write("\t\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t\tfor(var i in data){\r\n");
      out.write("\t\t\t\t\tvar chatLog = data[i];\r\n");
      out.write("\t\t\t\t\tvar html = \"\";\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(chatLog.sender==\"admin\")\thtml = '<p id=\"msg\" class=\"reciver\">'+chatLog.content+'</p>';\r\n");
      out.write("\t\t\t\t\telse html = '<p id=\"msg\" class=\"sender\">'+chatLog.content+'</p>';\r\n");
      out.write("\t\t\t\t\t//chatLog에는 sender/reciver/msg가 들어있다\r\n");
      out.write("\t\t\t\t\t//msg-container안의 div를 채팅로그를 보여주는 div와 현재 이루어지는 채팅을 보여주는 div 2가지로 나눔\r\n");
      out.write("\t\t\t\t\t$(\"#chatLog\").append(html);\r\n");
      out.write("\t\t\t\t\t//스크롤처리 : 스크롤을 가장 하단으로 내린다.\r\n");
      out.write("\t\t\t\t\t$(\"#chatLog-container\").scrollTop($(\"#chatLog-container\").prop(\"scrollHeight\"));\r\n");
      out.write("\t\t\t\t}//end of for\r\n");
      out.write("\t\t\t}//end of success\r\n");
      out.write("\t\t});// end of ajax\r\n");
      out.write("\t");
}
      out.write("\r\n");
      out.write("\t\t$(\"#chatList-container\").show();\r\n");
      out.write("};//end of chatFunction\r\n");
      out.write("\r\n");
      out.write("ws.onopen = function(e){\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ws.onmessage = function(e){\r\n");
      out.write("\tvar o = JSON.parse(e.data);\r\n");
      out.write("\tvar sender = o.sender;\r\n");
      out.write("\tvar msg = o.msg;\r\n");
      out.write("\tvar to = o.to;\r\n");
      out.write("\tconsole.log(o);\r\n");
      out.write("\tvar html = '<div class=\"msg-view sender\"><span>'+sender+'</span>'+msg+'</div>';\r\n");
      out.write("\t//관리자접속중 보낸이가 관리자면 자신, 관리자x 보낸이가 \r\n");
      out.write("\tif(sender==\"");
      out.print(memberLoggedIn.getMemberId());
      out.write("\"){\r\n");
      out.write("\t\thtml = '<p id=\"msg\" class=\"sender\">'+msg+'</p>';\r\n");
      out.write("\t}\r\n");
      out.write("\telse {\r\n");
      out.write("\t\thtml = '<p id=\"msg\" class=\"reciver\">'+msg+'</p>';\r\n");
      out.write("\t}\r\n");
      out.write("\t$(\"[name=\"+(sender=='admin'?to:sender)+\"] #chatLog-container #current-chat\").append(html);\r\n");
      out.write("\t\r\n");
      out.write("\t//스크롤처리 : 스크롤을 가장 하단으로 내린다.\r\n");
      out.write("\t$(\"[name=\"+(sender=='admin'?to:sender)+\"] #chatLog-container\").scrollTop($(\"[name=\"+(sender=='admin'?to:sender)+\"] #chatLog-container\").prop(\"scrollHeight\"));\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("ws.onerror = function(e){\r\n");
      out.write("\t\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("ws.onclose = function(e){\r\n");
      out.write("\t\r\n");
      out.write("};\r\n");
      out.write("//회원이름버튼 클릭하면 해당 회원의 채팅창 띄우기(채팅로그도 같이 가져온다)\r\n");
      out.write("function viewChat(e){\r\n");
      out.write("\tvar id = $(e).html();\r\n");
      out.write("\t//모든 회원의 채팅창을 숨김\r\n");
      out.write("\t$(\"#chat-container\").hide();\r\n");
      out.write("\t//모든 회원의 채팅창을 숨김\r\n");
      out.write("\t$(\"[name=\"+id+\"]\").show();\r\n");
      out.write("\r\n");
      out.write("\t//채팅창이 보여지면서 채팅창에 채팅로그를 출력\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl: \"");
      out.print(request.getContextPath());
      out.write("/chat/chatLogList.chat\",\r\n");
      out.write("\t\tdataType: \"json\",\r\n");
      out.write("\t\tdata: \"userId=\"+id,//파라미터직렬화\r\n");
      out.write("\t\tsuccess: function(data){\r\n");
      out.write("\t\t\tfor(var i in data){\r\n");
      out.write("\t\t\t\tvar chatLog = data[i];\r\n");
      out.write("\t\t\t\tvar html = \"\";\r\n");
      out.write("\t\t\t\tif(chatLog.sender==\"admin\")\t{\r\n");
      out.write("\t\t\t\t\thtml = '<p id=\"msg\" class=\"sender\">'+chatLog.content+'</p>';\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\thtml = '<p id=\"msg\" class=\"reciver\">'+chatLog.content+'</p>';\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t//chatLog에는 sender/reciver/msg가 들어있다\r\n");
      out.write("\t\t\t\t//msg-container안의 div는 채팅로그를 보여주는 div와 현재 이루어지는 채팅을 보여주는 div 2가지로 나눔\r\n");
      out.write("\t\t\t\t$(\"[name=\"+id+\"] #chatLog-container #chatLog\").append(html);\r\n");
      out.write("\t\t\t\t//스크롤처리 : 스크롤을 가장 하단으로 내린다.\r\n");
      out.write("\t\t\t\t$(\"[name=\"+id+\"] #chatLog-container\").scrollTop($(\"[name=\"+id+\"] #chatLog-container\").prop(\"scrollHeight\"));\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("};\r\n");
      out.write("\r\n");
 if("admin".equals(memberLoggedIn.getMemberId())){
      out.write("\r\n");
      out.write("//관리자 답변 버튼\r\n");
      out.write("function sendAnswer(e){\r\n");
      out.write("\tif($(e).siblings().val().trim().length==0) return;\r\n");
      out.write("\t\r\n");
      out.write("\t/* 전송메세지를 js객체로 생성 */\r\n");
      out.write("\tvar msg = {\r\n");
      out.write("\t\t\ttype: \"message\",\r\n");
      out.write("\t\t\tmsg: $(e).siblings().val(),\r\n");
      out.write("\t\t\tsender: \"admin\",\r\n");
      out.write("\t\t\tto: $(e).parent().parent().attr(\"name\")\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\r\n");
      out.write("\tvar jsonStr = JSON.stringify(msg);\r\n");
      out.write("\t/* 웹소켓을 통해 메세지 전송 */\r\n");
      out.write("\tws.send(jsonStr);\r\n");
      out.write("\t/* 스크롤처리 : 스크롤을 가장 하단으로 내린다. */\r\n");
      out.write("\t$(\"#chatLog-container\").scrollTop($(\"#chatLog-container\").prop(\"scrollHeight\"));\r\n");
      out.write("\t/* #msg 초기화 */\r\n");
      out.write("\t$(e).siblings().val(\"\").focus();\r\n");
      out.write("}\r\n");
}else{
      out.write("\r\n");
      out.write("//회원 문의버튼\r\n");
      out.write("function sendQuestion(e){\r\n");
      out.write("\tif($(e).siblings().val().trim().length==0) return;\r\n");
      out.write("\t\r\n");
      out.write("\t/* 전송메세지를 js객체로 생성 */\r\n");
      out.write("\tvar o = {\r\n");
      out.write("\t\ttype: \"message\",\r\n");
      out.write("\t\tmsg: $(e).siblings().val(),\r\n");
      out.write("\t\tsender: \"");
      out.print(memberLoggedIn.getMemberId());
      out.write("\",\r\n");
      out.write("\t\tto: \"admin\"\r\n");
      out.write("\t}\r\n");
      out.write("\tvar jsonStr = JSON.stringify(o);\r\n");
      out.write("\t/* 웹소켓을 통해 메세지 전송 */\r\n");
      out.write("\tws.send(jsonStr);\r\n");
      out.write("\t//스크롤처리 : 스크롤을 가장 하단으로 내린다.\r\n");
      out.write("\t$(\"#chatLog-container\").scrollTop($(\"#chatLog-container\").prop(\"scrollHeight\"));\r\n");
      out.write("\t/* #msg 초기화 */\r\n");
      out.write("\t$(e).siblings().val(\"\").focus();\r\n");
      out.write("\t\r\n");
      out.write("};\r\n");
}
      out.write("\r\n");
      out.write("\r\n");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function findMember(){\r\n");
      out.write("\t//아이디, 비밀번호 찾기 팝업 생성\r\n");
      out.write("\tvar url = \"");
      out.print(request.getContextPath());
      out.write("/member/findMember\";\r\n");
      out.write("\tvar title = \"findMember\";\r\n");
      out.write("\tvar spec = \"width=500px, height=600px, left=500px, top=100px\";\r\n");
      out.write("\t\t\r\n");
      out.write("\tvar popup = open(url, title, spec); \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function enterEvent(event, el){\r\n");
      out.write("\t");
if(memberLoggedIn != null){
      out.write("\r\n");
      out.write("\t\tif(event.key==\"Enter\") {\r\n");
      out.write("\t\t\t");
if("admin".equals(memberLoggedIn.getMemberId())){
      out.write("\r\n");
      out.write("\t\t\tsendAnswer($(el).siblings());\r\n");
      out.write("\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\tsendQuestion($(el).siblings());\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t");
}
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("\t<!-- 헤더 -->\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<div id=\"header-container\" \r\n");
      out.write("\t\t\t class=\"header\">\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("\">\r\n");
      out.write("\t\t\t<img id=\"logo_img\" src=\"");
      out.print(request.getContextPath());
      out.write("/images/logo.png\"/>\r\n");
      out.write("\t\t\t<span>HelloWorld</span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<img id=\"chat_img\" src=\"");
      out.print(request.getContextPath());
      out.write("/images/chat.png\" onclick=\"chatFunction();\"/>\r\n");
      out.write("\t\t\t<img id=\"menu_img\" src=\"");
      out.print(request.getContextPath());
      out.write("/images/menu.png\"/>\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 채팅화면 -->\r\n");
      out.write("\t<div id=\"chatList-container\">\r\n");
      out.write("\t");
if(memberLoggedIn!=null){ 
      out.write("\r\n");
      out.write("\t\t");
 if("admin".equals(memberLoggedIn.getMemberId())){
      out.write("\r\n");
      out.write("\t\t\t<div id=\"memberIdList-container\"></div>\r\n");
      out.write("\t\t\t<span id=\"chat-title\">문의 답변하기</span>\r\n");
      out.write("\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t<span id=\"chat-title\">1:1 문의</span>\t\t\r\n");
      out.write("\t\t");
} 
      out.write("\r\n");
      out.write("\t\t<span id=\"chat-close\">X</span>\r\n");
      out.write("\t\t<div id=\"chat-container\" name=\"");
      out.print(memberLoggedIn.getMemberId());
      out.write("\">\r\n");
      out.write("\t\t\t<div id=\"chatLog-container\">\r\n");
      out.write("\t\t\t\t<div id=\"chatLog\"></div>\r\n");
      out.write("\t\t\t\t<div id=\"current-chat\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"input\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"chat-msg\" onkeypress=\"enterEvent(event, this);\">\r\n");
      out.write("\t\t\t\t<button id=\"btn-send\" onclick=\"sendQuestion(this);\">전송</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 메뉴바 -->\r\n");
      out.write("\t<div id=\"menubar\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<span id=\"menubar-close\">X</span>\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!-- 로그인 메뉴/폼 -->\r\n");
      out.write("\t\t<div class=\"login-container\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t");
if(memberLoggedIn == null){ 
      out.write("\r\n");
      out.write("\t\t\t<form action=\"");
      out.print(request.getContextPath() );
      out.write("/member/login\" \r\n");
      out.write("\t\t\t\t  id=\"loginfrm\"\r\n");
      out.write("\t\t\t\t  method=\"post\"\r\n");
      out.write("\t\t\t\t  onsubmit=\"loginSubmit();\"\r\n");
      out.write("\t\t\t\t  >\r\n");
      out.write("\t\t\t\t<span class=\"text\">로그인이 필요합니다.</span>\r\n");
      out.write("\t\t\t\t<br /><br />\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/images/userid.png\"/>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" \r\n");
      out.write("\t\t\t\t\t\t\t\t   name=\"memberId\" \r\n");
      out.write("\t\t\t\t\t\t\t\t   id=\"memberId\" \r\n");
      out.write("\t\t\t\t\t\t\t\t   placeholder=\"ID\"\r\n");
      out.write("\t\t\t\t\t\t\t\t   value=\"");
      out.print(saveIdFlag?memberIdSaved:"" );
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td rowspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"login_btn\" \r\n");
      out.write("\t\t\t\t\t\t\t\t   type=\"submit\" \r\n");
      out.write("\t\t\t\t\t\t\t\t   value=\"로그인\"/>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/key.png\"/></td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" \r\n");
      out.write("\t\t\t\t\t\t\t\t   name=\"password\" \r\n");
      out.write("\t\t\t\t\t\t\t\t   id=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\t   placeholder=\"PASSWORD\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" \r\n");
      out.write("\t\t\t\t\t\t\t\t   name=\"saveId\" \r\n");
      out.write("\t\t\t\t\t\t\t\t   id=\"saveId\"\r\n");
      out.write("\t\t\t\t\t\t\t\t   ");
      out.print(saveIdFlag?"checked":"");
      out.write("/>\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"saveId\"></label>\r\n");
      out.write("\t\t\t\t\t\t\t<span id=\"saveId-span\">&nbsp;아이디 저장</span>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t&nbsp;\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"아이디/비밀번호찾기\"\r\n");
      out.write("\t\t\t\t   class=\"membermenu\"\r\n");
      out.write("\t\t\t\t   onclick=\"findMember();\"/>\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"회원가입\"\r\n");
      out.write("\t\t\t\t   class=\"membermenu\"\r\n");
      out.write("\t\t\t\t   onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/member/memberEnroll'\"/>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t");

		}
		else{
		
      out.write("\r\n");
      out.write("\t\t<!-- 로그인 한 경우 -->\r\n");
      out.write("\t\t\t<table id='logged-in'>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"profile-div\">\r\n");
      out.write("\t\t\t\t\t\t<img id=\"profile-viewer_\"\r\n");
      out.write("\t\t\t\t\t \t\t src=\"");
      out.print(request.getContextPath());
      out.write("/upload/member/profile/");
      out.print(memberLoggedIn.getRenamedImgName());
      out.write("\" \r\n");
      out.write("\t\t\t\t\t \t\t width=\"120px\" height=\"120px\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(memberLoggedIn.getMemberName());
      out.write("님!<br>반갑습니다\r\n");
      out.write("\t\t\t\t\t\t");
if("admin".equals(memberLoggedIn.getMemberId())) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t   id=\"adminPageBtn\"\r\n");
      out.write("\t\t\t\t\t\t\t   value=\"▶ Admin Page\"\r\n");
      out.write("\t\t\t\t\t\t\t   onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/admin'\"/>\r\n");
      out.write("\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type='button' \r\n");
      out.write("\t\t\t\t\t\t\t   value='My Page'\r\n");
      out.write("\t\t\t\t\t\t\t   onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/member/memberMyPage?memberId=");
      out.print(memberLoggedIn.getMemberId());
      out.write("'\"/>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type='button'\r\n");
      out.write("\t\t\t\t\t\t\t   value='LogOut'\r\n");
      out.write("\t\t\t\t\t\t\t   onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/member/Logout'\"/>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");

		}
		
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"loginCheck\" id=\"loginCheck\" value=\"0\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- 로그인 메뉴/폼 끝 -->\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\tfunction loginSubmit(){\r\n");
      out.write("\t\t\tif($(\"#memberId\").val().trim().length == 0){\r\n");
      out.write("\t\t\t\talert(\"아이디를 입력하세요.\");\r\n");
      out.write("\t\t\t\t$(\"#memberId\").focus();\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif($(\"#password\").val().trim().length == 0){\r\n");
      out.write("\t\t\t\talert(\"비밀번호를 입력하세요.\");\r\n");
      out.write("\t\t\t\t$(\"#password\").focus();\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} \r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- 메뉴목록 -->\r\n");
      out.write("\t\t<div id=\"menu\">\r\n");
      out.write("\t\t\t<ul id=\"menu-list1\">\r\n");
      out.write("\t\t\t");
if(memberLoggedIn != null) {
      out.write("\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/plan/planList\">일정보기</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t <ul id=\"menu-list2\">\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/plan/planWriteFrm?userId=");
      out.print(memberLoggedIn.getMemberId());
      out.write("\">일정작성</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul id=\"menu-list3\">\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/review/MyreviewList?LoggedId=");
      out.print(memberLoggedIn.getMemberId());
      out.write("\">내글보기</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul id=\"menu-list4\">\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/review/reviewForm\">리뷰작성</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul id=\"menu-list5\">\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/quest/questList\">문의사항</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t<ul id=\"menu-list6\">\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/notice/noticeList\">공지사항</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 메뉴바 끝 -->\r\n");
      out.write("\t\r\n");
      out.write("\t<section id=\"content\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");

    String memberId = (String)request.getAttribute("memberId");

      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/updatePassword.css\" />\r\n");
      out.write("\r\n");
      out.write("<title>비밀번호 변경</title>\r\n");
      out.write("\r\n");
      out.write("<div id=\"updatePassword-container\">\r\n");
      out.write("<br /><br /><br />\r\n");
      out.write("    <h1>비밀번호 변경</h1>\r\n");
      out.write("    <form action=\"");
      out.print(request.getContextPath());
      out.write("/member/updatePasswordEnd\"\r\n");
      out.write("          id=\"updatePasswordFrm\"\r\n");
      out.write("          name=\"updatePasswordFrm\"\r\n");
      out.write("          method=\"post\"\r\n");
      out.write("          onsubmit=\"return submitInvalid();\">\r\n");
      out.write("        <input type=\"hidden\" name=\"memberId_\" value=\"");
      out.print(memberId);
      out.write("\"/>\r\n");
      out.write("        \r\n");
      out.write("        <label for=\"passwordOld\">현재 비밀번호</label>\r\n");
      out.write("        <input type=\"password\"\r\n");
      out.write("               id=\"passwordOld\" name=\"passwordOld\"\r\n");
      out.write("               required/>\r\n");
      out.write("        <br />\r\n");
      out.write("        <label for=\"passwordNew\">새 비밀번호</label>\r\n");
      out.write("        <input type=\"password\"\r\n");
      out.write("               id=\"passwordNew\" name=\"passwordNew\"\r\n");
      out.write("               required/>\r\n");
      out.write("        <br />\r\n");
      out.write("        <label for=\"passwordCheck\">비밀번호 확인</label>\r\n");
      out.write("        <input type=\"password\"\r\n");
      out.write("               id=\"passwordCheck\"\r\n");
      out.write("               required/>\r\n");
      out.write("        <span id=\"passwordCheck-span\"></span>\r\n");
      out.write("        <br />\r\n");
      out.write("\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/images/cancel.png\"\r\n");
      out.write("             onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/member/memberMyPage?memberId=");
      out.print(memberId);
      out.write("'\"\r\n");
      out.write("             />\r\n");
      out.write("        <img src=\"");
      out.print(request.getContextPath());
      out.write("/images/ok.png\"\r\n");
      out.write("             onclick=\"submitFrm();\"\r\n");
      out.write("             />\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function submitInvalid(){\r\n");
      out.write("    //비밀번호 검사\r\n");
      out.write("   //숫자/문자/특수문자 포함 형태의 8~15자리 이내의 암호 정규식\r\n");
      out.write("   var regExp = /^.*(?=^.{8,15}$)(?=.*\\d)(?=.*[a-zA-Z])(?=.*[^a-zA-Z0-9]).*$/g;\r\n");
      out.write("   if(!regExpTest(regExp, \"passwordNew\", \"비밀번호는 8~15자리 숫자/문자/특수문자를 포함해야 합니다.\")){\r\n");
      out.write("       return false;\r\n");
      out.write("   }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function submitFrm(){\r\n");
      out.write("\t$(\"#updatePasswordFrm\").submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("//유효성 검사용 알림창 띄우는 함수\r\n");
      out.write("function regExpTest(regExp, id, msg){\r\n");
      out.write("   if(regExp.test(document.querySelector(\"#\"+id).value)){\r\n");
      out.write("       return true;\r\n");
      out.write("   }\r\n");
      out.write("   alert(msg);\r\n");
      out.write("   return false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//비밀번호 유효성 검사 충족 못 하면 바로 빨간 밑줄\r\n");
      out.write("//숫자/문자/특수문자 포함 형태의 8~15자리 이내의 암호 정규식\r\n");
      out.write("$(\"#passwordNew\").keyup(function(){\r\n");
      out.write("    var regExp = /^.*(?=^.{8,15}$)(?=.*\\d)(?=.*[a-zA-Z])(?=.*[^a-zA-Z0-9]).*$/g;\r\n");
      out.write("    if(!regExp.test(document.getElementById(\"passwordNew\").value)){\r\n");
      out.write("        $(\"#passwordNew\").css(\"border-bottom\", \"2px dashed red\");\r\n");
      out.write("    }\r\n");
      out.write("    else{\r\n");
      out.write("        $(\"#passwordNew\").css(\"border-bottom\", \"2px solid black\");\r\n");
      out.write("    }\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("//비밀번호 확인 틀리면 바로 빨간 밑줄\r\n");
      out.write("$(\"#passwordCheck\").keyup(function(){\r\n");
      out.write("   var pwd = document.getElementById(\"passwordNew\");\r\n");
      out.write("   var pwdcheck = document.getElementById(\"passwordCheck\");\r\n");
      out.write("\r\n");
      out.write("   if(pwd.value == pwdcheck.value){\r\n");
      out.write("       $(\"#passwordCheck-span\").text(\"O\").css(\"color\", \"black\");\r\n");
      out.write("       return true;\r\n");
      out.write("   }\r\n");
      out.write("   else{\r\n");
      out.write("       $(\"#passwordCheck-span\").text(\"X\").css(\"color\", \"red\").css(\"font-weight\", \"bold\");\r\n");
      out.write("   }\r\n");
      out.write("});\r\n");
      out.write("$(\"#passwordNew\").keyup(function(){\r\n");
      out.write("   var pwd = document.getElementById(\"passwordNew\");\r\n");
      out.write("   var pwdcheck = document.getElementById(\"passwordCheck\");\r\n");
      out.write("\r\n");
      out.write("   if(pwd.value == pwdcheck.value){\r\n");
      out.write("       $(\"#passwordCheck-span\").text(\"O\").css(\"color\", \"black\");\r\n");
      out.write("       return true;\r\n");
      out.write("   }\r\n");
      out.write("   else{\r\n");
      out.write("       $(\"#passwordCheck-span\").text(\"X\").css(\"color\", \"red\").css(\"font-weight\", \"bold\");\r\n");
      out.write("   }\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t\t<footer>\r\n");
      out.write("\t\t\t<p>&lt;ⓒ  copyright 2019. <strong>HelloWorld</strong>. All rights reserved.&gt;</p>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("</div>\r\n");
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
