<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<title>Insert title here</title>
</head>
<body>
	<h2>Add Student's Result</h2>
	<form:form modelAttribute="semesterResult" action="addResult"
		method="post">
		<fieldset>
			<legend>Add Student's Result</legend>
			<form:select path="serialNumber" class="selectpicker">
				<c:forEach var="students" items="${students}">
					<option value="${students.serialNumber}">${students.name}</option>
				</c:forEach>
			</form:select>
			<table>
				<tr>
					<td>Percentage:</td>
					<td><form:input type="text" id="percentage" path="percentage" /><br></td>
				</tr>


				<tr>
					<td>Semester:</td>
					<td><select id="semester" name="semester">
							<option value="Semester I">Semester I</option>
							<option value="Semester II">Semester II</option>
							<option value="Semester III">Semester III</option>
							<option value="Semester IV">Semester IV</option>
							<option value="Semester V">Semester V</option>
							<option value="Semester VI">Semester VI</option>

					</select> <br> <br></td>
				</tr>

				<tr>
					<td></td>
					<td><input id="submit" type="submit"
						value="Add Student's Result"><br></td>
				</tr>
				<tr>
					<td></td>
					<td><a href="/">Go Home</a></td>
				</tr>
			</table>
		</fieldset>
	</form:form>
</body>
</html>