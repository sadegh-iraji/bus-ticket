<%--
  Created by IntelliJ IDEA.
  User: SadegH
  Date: 10/25/2021
  Time: 1:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="styles/style.css">
    <title>Add New Travel</title>
</head>
<body>
<h2>Add New Travel</h2>
<form action="addTravelConfirm" method="post">
    <table align='center'>
        <tr>
            <td align='right'><label for='origin'>From : </label></td>
            <td><select name='origin' id='origin'>
                <p:forEach items="${cities}" var="city">
                <option value="<p:out value="${city}"/>"><p:out value="${city.name()}"/></option>
                </p:forEach>
            </td>
        </tr>
        <tr>
            <td align='right'><label for='destination'>To : </label></td>
            <td align='left'><select name='destination' id='destination'>
                <p:forEach items="${cities}" var="city">
                <option value="<p:out value="${city}"/>"><p:out value="${city.name()}"/></option>
                </p:forEach>
            </td>
        </tr>
        <tr>
            <td align='right'><label for='date'>Date : </label></td>
            <td align='left'><input type='date' required='required' name='date' id='date'></td>
        </tr><tr>
            <td align='right'><label for='time'>Time : </label></td>
            <td align='left'><input type='time' required='required' name='time' id='time'></td>
        </tr>
        <tr>
            <td></td>
            <td><input type='submit' value='Add Travel'></td>
        </tr>
    </table>
</form>
</body>
</html>
