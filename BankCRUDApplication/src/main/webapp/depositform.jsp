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
int id= Integer.parseInt(request.getParameter("aid"));
int bal = (Integer) session.getAttribute("abal");


%>
<form action="depositamt.jsp">
Enter the amount to deposit <input type="text" name="damt"><br/>
<input type="submit" value="Deposit">
<input type="hidden" name="aid" value="<%=id %>">

<input type="hidden" name="abal" value="<%=bal%>">

</form>
</body>
</html>