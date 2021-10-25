<%--
  Created by IntelliJ IDEA.
  User: SadegH
  Date: 10/25/2021
  Time: 3:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="styles/style.css">
    <title>Available Travels</title>
</head>
<body>
<table align="center" class="ticket">
    <tr>
        <td colspan="2"> Path: <p:out value="${origin}"/> - <p:out value="${destination}"/></td>
        <td> Date: <p:out value="${localDate}"/></td>
    </tr>
    <tr>
        <td>Choose</td>
        <td>Hour</td>
        <td>Travel ID</td>
    </tr>
    <p:forEach items="${travels}" var="travel">
        <tr>
            <td>
                <form action="ticketInformation" method="post">
                    <input type="hidden" name="id" id="id" value="<p:out value="${travel.id}"/>">
                    <input type="submit" value="Reserve">
                </form>
            </td>
            <td>
                <p:out value="${travel.time}"/>
            </td>
            <td>
                <p:out value="${travel.id}"/>
            </td>
        </tr>
    </p:forEach>
</table>

</body>
</html>