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
	 int id = Integer.parseInt(request.getParameter("acntid"));
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
		String query  = "update account set accounttype=?, accountopendate=?,accountbalance=? where accountid=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1,accounttype);
		ps.setDate(2,dat);
		ps.setInt(3,b);
		ps.setInt(4,id);
		int i= ps.executeUpdate();
		String u = (String) session.getAttribute("uname");
		if(i>0)
		{
			response.sendRedirect("editaccount.jsp?uname="+u);
		}
		else {
			out.println("Account cannot be updated!!!");
		}
		
		
	
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}


%>
</body>
</html>