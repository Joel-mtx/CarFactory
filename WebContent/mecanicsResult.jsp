<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results from Mecanics Department</title>
</head>
<body>
	<p>The Engine type is: ${carMaker.getEngineType()} <br />
	The Trasmission type is: ${carMaker.getTransmissionType()}</p> <br />
	<a href="index.jsp">Enter data for a different car</a>
</body>
</html>