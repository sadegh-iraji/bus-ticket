<%--
  Created by IntelliJ IDEA.
  User: SadegH
  Date: 10/26/2021
  Time: 9:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="styles/style.css">
    <title>Reserved Tickets</title>
</head>
<body>
    <h2>Reserved Tickets</h2>
    <table align="center" class="ticket">
        <thead>
        <th colspan="3">List of Reserved Tickets</th>
        </thead>
        <tr>
            <td>Choose</td>
            <td>Ticket Id</td>
            <td>Date</td>
        </tr>
        <p:forEach items="${ticketList}" var="ticket">
            <tr>
                <td>
                    <form action="showTicketDetails" method="post">
                        <input type="hidden" name="id" value="<p:out value="${ticket.id}"/>">
                        <input type="submit" value="Show Ticket">
                    </form>
                </td>
                <td><p:out value="${ticket.id}"/></td>
                <td><p:out value="${ticket.travel.date}"/></td>
            </tr>
        </p:forEach>
    </table>
</body>
</html>
