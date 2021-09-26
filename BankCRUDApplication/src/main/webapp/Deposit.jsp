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
String u = (String) session.getAttribute("uname");

try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url = application.getInitParameter("url");
	String username = application.getInitParameter("username");
	String password = application.getInitParameter("password");
	Connection con = DriverManager.getConnection(url,username,password);
	String query  = "select * from account where acntuser =?" ;
	PreparedStatement ps = con.prepareStatement(query);
	ps.setString(1, u);
	ResultSet rs = ps.executeQuery();
	%>

	<table border="1" width="600" height="200" style="text-align:center">
	<tr>
	<th>AccountID</th>
	<th>Account Type</th>
	<th>Account Open Date</th>
	<th>Account User</th>
	<th>Account Balance</th>
	<th>&nbsp;&nbsp;</th>
	</tr>
	<%
	while(rs.next()) { %>
		<tr>
		<td><%=rs.getInt(1) %></td>
		<td><%=rs.getString(2) %></td>
		<td><%=rs.getDate(3) %></td>
		<td><%=rs.getString(4) %></td>
		<td><%=rs.getInt(5) %></td>
		<td><a href="depositform.jsp?aid=<%=rs.getInt(1)%>">Deposit</a></td>
		</tr>
		
		<%
		session.setAttribute("abal",rs.getInt(5));
	}
%>	
	</table>
	<br>
	<a href="home.jsp">Go back</a><br>
<%
} catch (ClassNotFoundException | SQLException e) {
	e.printStackTrace();
}
%>
</body>
</html>