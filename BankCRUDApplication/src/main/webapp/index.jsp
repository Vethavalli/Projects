<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String m = request.getParameter("msg");

if(m!=null) {
	out.print(m);
}
%>
<form action="./login" style="text-align:center">
<label >Enter username</label> <input type="text" name="uname"><br><br>
<label >Enter password</label> <input type="password" name="pswd"><br><br>
<input type="submit" value="login"><br><br>
<label style="color:red">New User ?</label><a href="register.jsp">Click here</a>
</form>
</body>
</html>