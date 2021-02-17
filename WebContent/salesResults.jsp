<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sales Results</title>
</head>
<body>
<p>The Year of the car is: ${carMaker.getYear()} <br />
The Make of the car is: ${carMaker.getMake()} <br />
The Model of the car is: ${carMaker.getModel()} <br />
The Miles of the car are: ${carMaker.getMiles()} <br />
The Price of the car is: ${carMaker.getPrice()} dollars
</p> 
<br />
<a href="index.jsp">Enter data for a different car</a>
</body>
</html>