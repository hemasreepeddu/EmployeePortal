<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Portal</title>
<jsp:include page="filename.css"/>
</head>
<body>
	<div>
		<img src="https://i.ytimg.com/vi/b_RDQSxMM7o/maxresdefault.jpg"
			alt="logo" width="1700" height="350">
	</div>
	<div class="head">
		<h1>Log In to the Employee Portal</h1>
	</div>
	<%
		System.out.println(request.getParameter("name"));
		Date date = new Date();
	%>
	<div class="footer">
		Current date is
		<%=date%></div>


	<form action="/login.do" method="post">
		<div class="main">
			<table align="center">
				<tr>
					<td>Name</td><td><input type='text' name="name" /></td>
				</tr>
				<tr>
					<td>Password</td><td><input type='password' name="password" /></td>
				</tr>
				<tr>
					<td></td><th><input type="submit" /></th>
				</tr>
				<tr><td></td><td><p>
				<font color="red">${errorMessage}</font>
			</p></td></tr>
			</table>
			

		</div>

	</form>
</body>
</html>