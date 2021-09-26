<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
<h2>Welcome to Bank Management System</h2>
			<h3>Choose from the following</h3>
			<div class="mydiv">
			<ul style="text-align:center">
			<li><a href="addaccount.jsp">Add Account</a></li>
			<li><a href="deleteaccount.jsp">Delete Account</a></li>
			<li><a href="editaccount.jsp">Edit Account</a></li>
			<li><a href="withdraw.jsp">Withdraw Amount</a></li>
			<li><a href="Deposit.jsp">Deposit Amount</a>
			</li>
			</ul>
			</div>
			<br><br><br><br><br><br><br>
			<a href="index.jsp">logout</a>
</body>
</html>