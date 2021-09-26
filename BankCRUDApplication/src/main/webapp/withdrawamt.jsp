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
	 int id = Integer.parseInt(request.getParameter("aid"));
	 int bal = Integer.parseInt(request.getParameter("abal"));
	 int withdrawamt = Integer.parseInt(request.getParameter("wamt"));
	 if(withdrawamt < bal)
	 {
		 bal = bal-withdrawamt;
	 }
	 else 
	 {
		 out.println("Your withdrawal amount is greater than the account balance withdrawal cannot be done!!!!! ");
		 %>
		 <a href ="withdraw.jsp">Go back</a>
		 
		 <%
	 }

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = application.getInitParameter("url");
		String username = application.getInitParameter("username");
		String password = application.getInitParameter("password");
		Connection con = DriverManager.getConnection(url,username,password);
		String query  = "update account set accountbalance=? where accountid=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1,bal);
		ps.setInt(2,id);
		int i= ps.executeUpdate();
		String u = (String) session.getAttribute("uname");
		if(i>0)
		{
			response.sendRedirect("withdraw.jsp?uname="+u);
		}
		else {
			out.println("Withdrawing amount from the particular account is not possible!!!");
		}
		
		
	
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}


%>
</body>
</html>