<%@ page import="com.workfront.springmvcexample.core.User" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Simple request JSP</title>
</head>
<body>

<h1>Simple Request JSP</h1>

<h2>${message}</h2>
<h3>${user.name}</h3>
<h3>${user.id}</h3>


<%
    User user = (User)request.getAttribute("user");
%>
<%= user.getName()%>


</body>
</html>
