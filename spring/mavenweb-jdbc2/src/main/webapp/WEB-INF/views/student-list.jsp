<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="100%">
	<thead>
		<th>NAME</th>
		<th>EMAIL</th>
		<th>AGE</th>
		<th>SALARY</th>
	</thead>
	<tbody>
		<core:forEach var="student" items="${students}">
			<tr>
				<td>${student.name}</td>
				<td>${student.email}</td>
				<td>${student.age }</td>
				<td>${student.salary }</td>
				<td><a href="${pageContext.request.contextPath}/student/update?id=${student.id}">UPDATE</a></td>
				
			</tr> 
		</core:forEach>
	</tbody>
</table>
</body>
</html>