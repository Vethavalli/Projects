<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="registeruser.jsp" method="post">
<table border="1" style="text-align:center">
<tr>
<td>Enter FirstName</td>
<td><input type="text" name="fname"></td>
</tr>
<tr>
<td>Enter LastName</td>
<td><input type="text" name="lname"></td>
</tr>
<tr>
<td>Enter userName</td>
<td><input type="text" name="uname"></td>
</tr>
<tr>
<td>Enter Password</td>
<td><input type="password" name="pswd"></td>
</tr>
<tr>
<td>Enter Mailid</td>
<td><input type="text" name="mail"></td>
</tr>
<tr>
<td>Enter MobileNo</td>
<td><input type="text" name="mobile"></td>
</tr>
<tr>
<td>Enter Address</td>
<td><textarea rows="5" cols="30" name="address"></textarea></td>
</tr>
<tr>
<td><input type="submit" value="register"></td>
<td><input type="reset" value="reset">

</tr>

</table>


</form>
</body>
</html>