<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix = "b" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Mobile</title>
</head>
<body>
<b:form action = "mobilesearch" method = "post" modelAttribute="yy">
Mobile ID: <b:input path="mobId"/>
<input type = "submit" value = "Search Mobile"/>
</b:form>
</body>
</html>