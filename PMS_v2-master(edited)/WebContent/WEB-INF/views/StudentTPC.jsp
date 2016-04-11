<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<SCRIPT type="text/javascript">
    window.history.forward();
    function noBack() { window.history.forward(); }
</SCRIPT>
<title>Insert title here</title>
</head>
<body onload="noBack();"
    onpageshow="if (event.persisted) noBack();" onunload="">
	Welcome to STUDENT TPC page!!!!!!
	<h2>Logged in as <core:out value="${loginForm.userName}" /></h2>
	<!-- <a href="StudentTPC.jsp">Student</a> -->
	<a href="form">Logout</a>
</body>
</html>