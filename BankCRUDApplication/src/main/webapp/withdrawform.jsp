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
<form action="withdrawamt.jsp">
Enter the amount for withdrawal <input type="text" name="wamt"><br/>
<input type="submit" value="withdraw">
<input type="hidden" name="aid" value="<%=id %>">

<input type="hidden" name="abal" value="<%=bal%>">

</form>
</body>
</html>