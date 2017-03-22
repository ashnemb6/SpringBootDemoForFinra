<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Add Student</h2>
	<form:form modelAttribute="student" action="addStudent" method="post">
		<fieldset>
			<legend>Add a Student</legend>
			<table>
				<p>
				<tr>
					<td>Student Name:</td>
					<td><form:input type="text" id="name" path="name" /><br></td>
				</tr>
				</p>
				<p>
				<tr>
					<td>Department:</td>
					<td>
					<form:select id="department" path="department">
					<option value="">Select Department</option>
					<option value="computer">Computer Science</option>
					<option value="management">Management</option>
					<option value="humanity">Humanity</option>
					<option value="medical">Medical</option>
				</form:select>
					<br><br></td>
				</tr>
				</p>
				<p id="buttons">
				<tr>
					<td></td>
					<td><input id="submit" type="submit" value="Add Student"><br></td>
				</tr>
				</p>
				<tr>
					<td></td>
					<td><a href="/">Go Home</a></td>
				</tr>
			</table>
		</fieldset>
	</form:form>

	<%-- ${message} --%>

	<%-- <form:form commandName="student" action="addStudent" method="post">

		<div class="form-group">
			<label class="control-label col-sm-2" for="name">Student Name</label>
			<div class="col-sm-4">
				<form:input path="name" type="text" class="form-control"
					placeholder="Student Name" />
			</div>
		</div>

		<div class="form-group">
			<label class="control-label col-sm-2" for="department">Department</label>
			<div class="col-sm-4">
				<form:input path="department" type="text" class="form-control"
					placeholder="Description" />
			</div>
		</div>

		<div class="form-group">
			<button type="submit" class="btn btn-success btn-md">Add
				Student</button>
		</div>
	</form:form>
	${message} --%>
</body>
</html>