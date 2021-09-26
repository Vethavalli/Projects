<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insert.jsp" method="post">
<table border="1" style="text-align:center">
<tr>
<td>Enter AccountType</td>
<td><input type="text" name="acunttype"></td>
</tr>
<tr>
<td>Enter AccountOpenDate</td>
<td><input type="date" placeholder="YYYY-mm-dd" name="date"></td>
</tr>
<tr>
<td>Enter AccountBalance</td>
<td><input type="text" name="abalance"></td>
</tr>
<tr>
<td><input type="reset" value="reset"></td>
<td><input type="submit" value="insert"></td>
</tr>
</table>
<input type="hidden" value="<%=session.getAttribute("uname") %>" name="uname"/>

</form>
</body>
</html>