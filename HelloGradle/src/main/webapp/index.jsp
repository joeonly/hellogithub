<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@page import="hello.MessageService"%>
<%@page import="hello.MessageServiceImpl"%>
<html>
  <head>
    <title>Hello Gradle</title>
  </head>

  <body>
  <%="Hello Gradle!"%><br/>
  <% MessageService service = new MessageServiceImpl();%>
  <%=service.getMessage()%>
  </body>
</html>
