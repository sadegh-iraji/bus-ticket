<%--
  Created by IntelliJ IDEA.
  User: SadegH
  Date: 10/25/2021
  Time: 7:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="styles/style.css">
    <title>Reserve Confirm</title>
</head>
<body>
<p:choose>
    <p:when test="${gender.equalsIgnoreCase('MALE')}">
        <h2>Mr. <p:out value="${ticket.travellerName}"/>, Your Ticket Reservation Was Successful</h2>
    </p:when>
    <p:when test="${gender.equalsIgnoreCase('FEMALE')}">
        <h2>Mrs. <p:out value="${ticket.travellerName}"/>, Your Ticket Reservation Was Successful</h2>
    </p:when>
</p:choose>
<h2>Ticket ID : <p:out value="${ticket.id}"/></h2>
<a href='customerMenu' class='underline'>Return to Menu</a>
</body>
</html>
