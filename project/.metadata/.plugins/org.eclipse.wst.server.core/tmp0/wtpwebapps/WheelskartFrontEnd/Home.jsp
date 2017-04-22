<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ page isELIgnored="false" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>
		<h2>Welcome to Shopping Cart</h2>
</center>


<%@include file="WEB-INF/views/CommonHeader.jsp" %>
	
	<hr color="blue">


	<a href="LoginPage"> Login</a>

	<a href="RegistrationPage"> Register</a>
	<br>
	<c:if test="${isUserClickedLogin=='true'}">

		<jsp:include page="WEB-INF/views/Login.jsp"></jsp:include>

	</c:if>


	<c:if test="${isUserClickedRegister=='true' }">
		<jsp:include page="WEB-INF/views/Registration.jsp"></jsp:include>
	</c:if>
</body>
</html>