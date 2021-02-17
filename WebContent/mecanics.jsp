<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mecanics Department</title>
</head>
<body>
	<h1>Welcome to Mecanics Department</h1>
	<h2>Plese fill out the specifications of the Car:</h2>
	<form action="mecanicsServlet" method="post">
	Enter the Engine Type: 
	<input type="text" name="engineType" size="20">
	<br />
	Enter the Transmission Type:  
	<input type="text" name="transmissionType" size="20">
	<br />
	<input type="submit" value="Submit">
	</form>
</body>
</html>