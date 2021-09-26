<%@ page language="java" import="java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String firstname = request.getParameter("fname");
String lastname = request.getParameter("lname");
String user = request.getParameter("uname");
String pass = request.getParameter("pswd");
String mailid = request.getParameter("mail");
long mobile = Long.parseLong(request.getParameter("mobile"));
String address = request.getParameter("address");
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url = application.getInitParameter("url");
	String username = application.getInitParameter("username");
	String password = application.getInitParameter("password");
	Connection con = DriverManager.getConnection(url,username,password);
	String query  = "insert into users values(?,?,?,?,?,?,?)";
	PreparedStatement ps = con.prepareStatement(query);
	ps.setString(1, firstname);
	ps.setString(2, lastname);
	ps.setString(3, user);
	ps.setString(4,pass);
	ps.setLong(5,mobile);
	ps.setString(6, mailid);
	ps.setString(7, address);
	int i = ps.executeUpdate();
	if(i > 0 )
	{
		out.println("Values inserted successfully!!!!");
		%>
		<br>
		<a href="login.jsp">Click here to login again</a><br>
		<% 
	}
	else {
		out.println("values cannot be inserted!!");
	}
	
	

} catch (ClassNotFoundException | SQLException e) {
	e.printStackTrace();
}










%>
</body>
</html>