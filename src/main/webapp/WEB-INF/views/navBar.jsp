<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Employee Management</title>
<style type="text/css">
ul {
	list-style-type: none;
	background-color: black;
	overflow: hidden;
	background-color: #333;
}

li {
	float: right;
}

li a {
	display: block;
	margin: 0px;
	padding: 15px;
}

li a:hover {
	background-color: #111;
}
</style>
</head>
<body>
	<ul>
		<li><a style="color: white;" href="./logout">Logout</a></li>
		<li><a style="color: white;" href="./search">Search Employee</a></li>
		<li><a style="color: white;" href="./insert">Insert Employee</a></li>
		<li><a style="color: white;" href="./update">Update Employee</a></li>
		<li><a style="color: white;" href="./remove">Remove Employee</a></li>
	</ul>
</body>
</html>
