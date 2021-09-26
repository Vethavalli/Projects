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
	
	String u = request.getParameter("uname");
	String accounttype = request.getParameter("acunttype");
	String d = request.getParameter("date");
	Date dat = Date.valueOf(d);
	int b = Integer.parseInt(request.getParameter("abalance"));

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = application.getInitParameter("url");
		String username = application.getInitParameter("username");
		String password = application.getInitParameter("password");
		Connection con = DriverManager.getConnection(url,username,password);
		String query  = "insert into account (accounttype,accountopendate,acntuser,accountbalance) values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, accounttype);
		ps.setDate(2, dat);
		ps.setString(3, u);
		ps.setInt(4, b);
		int i= ps.executeUpdate();
		if(i>0)
		{
			out.println("Account details inserted successfully!!!");
			String query1 = "select * from account where acntuser=?";
			PreparedStatement ps1 = con.prepareStatement(query1);
			ps1.setString(1, u);
			ResultSet rs = ps1.executeQuery();
			%>

			<table border="1" width="600" height="200" style="text-align:center">
			<tr>
			<th>AccountID</th>
			<th>Account Type</th>
			<th>Account Open Date</th>
			<th>Account User</th>
			<th>Account Balance</th>
			</tr>
			<%
			while(rs.next()) { %>
				<tr>
				<td><%=rs.getInt(1) %></td>
				<td><%=rs.getString(2) %></td>
				<td><%=rs.getDate(3) %></td>
				<td><%=rs.getString(4) %></td>
				<td><%=rs.getInt(5) %></td>
				</tr>
				
				<%
			}
		%>	
			</table>
			<br>
			<a href="home.jsp">Go back</a><br>
			<%
		}
		
	
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}


%>
</body>
</html>