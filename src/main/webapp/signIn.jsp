<%--
  Created by IntelliJ IDEA.
  User: SadegH
  Date: 10/25/2021
  Time: 11:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="styles/style.css">
    <title>Sign In</title>
</head>
<body>
<h2>Sign In</h2>
<form action="signInConfirm" method="post">
    <table align="center">
        <tr>
            <td align='right'><label for='username'>Username : </label></td>
            <td align='left'><input type='text' required='required' pattern='.+' name='username' id='username'></td>
        </tr>
        <tr>
            <td align='right'><label for='password'>Password : </label></td>
            <td align='left'><input type='password' required='required' pattern='.+' name='password' id='password'></td>
        </tr>
        <tr>
            <td></td>
            <td><input type='submit' value='Sign In'></td>
        </tr>
    </table>
</form>
</body>
</html>
