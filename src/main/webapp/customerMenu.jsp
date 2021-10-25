<%@ page import="ir.maktab.busticket.util.SecurityContext" %><%--
  Created by IntelliJ IDEA.
  User: SadegH
  Date: 10/25/2021
  Time: 1:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="styles/style.css">
    <title>Customer Menu</title>
</head>
<body>
<h1>Customer Menu</h1>
<h2>Welcome <% out.print(SecurityContext.getActiveUser().getUsername());%></h2>
<div id='divMenu'>
    <ul>
        <li><a href='searchTicket'>Reserve a Ticket</a></li>
        <li><a href='reservedTickets'>Show Your Reserved Tickets</a></li>
        <li><a href='logOut'>Sign Out</a></li>
    </ul>
</div>
</body>
</html>
