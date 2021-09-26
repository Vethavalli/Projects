<%@ page language="java" import="java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h2{
	text-align:center;
	color:brown;
}
h3{
	text-align:center;
	color:aqua;
}
.mydiv{
	text-align:center;
}
.mydiv > ul{
	display:inline-block;
}

</style>
</head>
<body>
<%
	String u = request.getParameter("uname");
	String p = request.getParameter("pswd");

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = application.getInitParameter("url");
		String username = application.getInitParameter("username");
		String password = application.getInitParameter("password");
		Connection con = DriverManager.getConnection(url,username,password);
		String query  = "select * from users where username =? and password=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, u);
		ps.setString(2, p);
		ResultSet rs = ps.executeQuery();
		session.setAttribute("uname",u);
		if(rs.next())
		{
			out.println("welcome here "+ u);
			%>
			<br>
			<a href="home.jsp">Home Page</a>
			<%
		}
		else {
			String message = "invalid username and password";
			response.sendRedirect("index.jsp?msg =" + message);
		}
		
		
	
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}


%>
</body>
</html>