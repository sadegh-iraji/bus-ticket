<%--
  Created by IntelliJ IDEA.
  User: SadegH
  Date: 10/26/2021
  Time: 9:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="styles/style.css">
    <title>Ticket Details</title>
</head>
<body>
<h2>Ticket Details</h2>
<table align="center" class="ticket">
    <thead>
    <th colspan="2">Bus Ticket</th>
    </thead>
    <tr>
        <td>Ticket ID</td>
        <td><p:out value="${ticket.id}"/></td>
    </tr>
    <tr>
        <td>Traveller Name</td>
        <td><p:out value="${ticket.travellerName}"/></td>
    </tr>
    <tr>
        <td>Traveller Gender</td>
        <td><p:out value="${ticket.travellerGender}"/></td>
    </tr>
    <tr>
        <td>Travel Origin</td>
        <td><p:out value="${ticketTravel.origin}"/></td>
    </tr>
    <tr>
        <td>Travel Destination</td>
        <td><p:out value="${ticketTravel.destination}"/></td>
    </tr>
    <tr>
        <td>Travel Date</td>
        <td><p:out value="${ticketTravel.date}"/></td>
    </tr>
    <tr>
        <td>Travel Time</td>
        <td><p:out value="${ticketTravel.time}"/></td>
    </tr>
    <tr>
        <td>Travel ID</td>
        <td><p:out value="${ticketTravel.id}"/></td>
    </tr>
    <tr>
        <td colspan="2">
            <form action="ticketCancel" method="post">
                <input type="hidden" name="id" value="<p:out value="${ticket.id}"/>">
                <input type="submit" value="Ticket Cancellation">
            </form>
        </td>
    </tr>
</table>
</body>
</html>
