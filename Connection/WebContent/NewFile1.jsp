<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>welcome here</h1>
<% String username=(String)request.getAttribute("data");%>
<% out.print("your usernane is velocity");%>
</body>
</html>