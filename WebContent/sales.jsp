<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sales Department</title>
</head>
<body>
	<h1>Welcome to the Sales Department</h1>
	<h2>Enter the information related to the car: </h2>
	<form action="salesServlet" method="post">
		Enter the car's year:  
		<input type="text" name="carYear" size="10"> <br />
		Enter the car's make: 
		<input type="text" name="carMake" size="20"> <br />
		Enter the car's model:
		<input type="text" name="carModel" size="20"> <br />
		Enter the car's miles: 
		<input type="text" name="carMiles" size="20"> <br />
		<input type="submit" value="Submit"> 
	</form>
</body>
</html>