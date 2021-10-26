<%--
  Created by IntelliJ IDEA.
  User: SadegH
  Date: 10/25/2021
  Time: 2:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="styles/style.css">
    <title>Search Tickets</title>
</head>
<body>
<h2>Search Travels</h2>
<form action="existTravel" method="get">
    <label for="origin">From :</label>
    <select name='origin' id='origin'>
        <option value="" disabled selected>Select Your Travel Origin ...</option>
        <p:forEach items="${cities}" var="city">
            <option value="<p:out value="${city}"/>"><p:out value="${city.name()}"/></option>
        </p:forEach>
    </select>

    <label for="destination">To :</label>
    <select name='destination' id='destination'>
        <option value="" disabled selected>Select Your Travel Destination ...</option>
        <p:forEach items="${cities}" var="city">
            <option value="<p:out value="${city}"/>"><p:out value="${city.name()}"/></option>
        </p:forEach>
    </select>

    <label for='date'>Date : </label>
    <input type='date' required='required' name='date' id='date'>

    <input type='submit' value='Online Search'>
</form>

</body>
</html>
