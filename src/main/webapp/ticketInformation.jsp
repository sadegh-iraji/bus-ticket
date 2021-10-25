<%--
  Created by IntelliJ IDEA.
  User: SadegH
  Date: 10/25/2021
  Time: 4:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="styles/style.css">
    <title>Traveller Information</title>
</head>
<body>
<h2>Traveller Information</h2>
<form action="reserveConfirm" method="post">
    <table align="center" class="ticket">
        <tr>
            <td>
                <label for="travellerName">Traveller Name</label>
            </td>
            <td>
                <input type="text" name="travellerName" id="travellerName">
            </td>
        </tr>
        <tr>
            <td>
                <p>Traveller Gender</p>
            </td>
            <td>
                <label for="male">Male</label>
                <input type="radio" name="gender" id="male" value="<p:out value="${male}"/>">
                <label for="female">Female</label>
                <input type="radio" name="gender" id="female" value="<p:out value="${female}"/>">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="hidden" name="travelId" value="<p:out value="${travelId}"/>">
                <input type="submit" value="Confirm">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
