<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Welcome Page</title>
</head>
<body>

	<ul>
		<li><a href="add_student_info">Add Student</a></li>
		<li><a href="add_result_student">Add Result For Student</a></li>
		<li><a href="result">Result by Department and Aggregation</a></li>
	</ul>

	<%-- <table>
		<c:forEach items="${firstname}" var="name">
			<tr>
				<td>${name.firstName}</td>
				<td>${name.middleName}</td>
				<td>${name.lastName}</td>
			</tr>
		</c:forEach>

	</table> --%>

</body>
</html>