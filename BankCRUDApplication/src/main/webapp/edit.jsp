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
int id= Integer.parseInt(request.getParameter("aid"));

try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url = application.getInitParameter("url");
	String username = application.getInitParameter("username");
	String password = application.getInitParameter("password");
	Connection con = DriverManager.getConnection(url,username,password);
	String query  = "select * from account where accountid =?" ;
	PreparedStatement ps = con.prepareStatement(query);
	ps.setInt(1, id);
	ResultSet rs = ps.executeQuery();
	
	if(rs.next()) {
	%>
		<form action="editact.jsp">
		<table border="1" style="text-align:center">
		<tr>
		<td>Enter AccountType</td>
		<td><input type="text" name="acunttype" value="<%=rs.getString(2)%>"></td>
		</tr>
		<tr>
		<td>Enter AccountOpenDate</td>
		<td><input type="date" placeholder="YYYY-mm-dd" name="date" value="<%=rs.getDate(3)%>"></td>
		</tr>
		<tr>
		<td>Enter AccountBalance</td>
		<td><input type="text" name="abalance" value="<%=rs.getInt(5)%>"></td>
		</tr>
		<tr>
		<td><input type="reset" value="reset"></td>
		<td><input type="submit" value="insert"></td>
		</tr>
		</table>
		<input type="hidden" name="acntid" value="<%=id %>"/>
		</form>
		
<%
	}
		
	

} catch (ClassNotFoundException | SQLException e) {
	e.printStackTrace();
}
%>
</body>
</html>