<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<spring-form:form action="${pagecontext.request.contextpath}/student/save method="POST" modelattribute="student">
      <spring-form:label path="name">enter name</spring-form:label>
      <spring-form:input path="name"/>
      <br/>
      <spring-form:label path="email">enter email</spring-form:label>
       <spring-form:input path="email"/>
      <br/>
      <spring-form:label path="age">enter age</spring-form:label>
      <spring-form:input path="age"/>
      <br/>
      <spring-form:label path="salary">enter salary</spring-form:label>
      <spring-form:input path="salary"/>
      <br/>
      <input type="submit" value="Save">
      <br/>
</spring-form:form>
     
</body>
</html>