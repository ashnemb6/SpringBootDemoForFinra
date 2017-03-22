<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript"
	src="<spring:url value="/resources/js/ajax.js"/>"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student's Result Based on Department</title>
</head>
<body>
	<fieldset>
		<legend>Select Department</legend>
		<select id="department" onchange="categorySubmit()">
			<option value="">Select Department</option>
			<option value="computer">Computer Science</option>
			<option value="management">Management</option>
			<option value="humanity">Humanity</option>
			<option value="medical">Medical</option>
		</select>
		<a href="/">Go Home</a>
	</fieldset>

	<div id="result"></div>

</body>
</html>