<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/mydb" user="vetha" password="Vetha@5143"></sql:setDataSource>
<sql:transaction dataSource="${db}">
<sql:update var="count">
insert into users values('rupa','rupa',7864512986,'rupa@rupa.com');
</sql:update>
<sql:update>
insert into users values('janu','janu',8425679312,'janu@janu.com');
</sql:update>
<sql:update>
delete from users where username='rupa';
</sql:update>
<sql:update>
update users set email='janu123@janu.com' where username='janu';
</sql:update>
</sql:transaction>
<sql:query var="rs" dataSource="${db}">
select * from users;
</sql:query>

<table border="1" width="70%" bgColor="aqua">
<tr>
<th>User Name</th>
<th>Password</th>
<th>Mobile No</th>
<th>Email ID</th>
</tr>
<c:forEach var="user" items="${rs.rows}">
<tr>
	<td>${user.username}</td>
	<td>${user.password}</td>
	<td>${user.mobilenumber}</td>
	<td>${user.email}</td>
</tr>

</c:forEach>
</table>
</body>
</html>