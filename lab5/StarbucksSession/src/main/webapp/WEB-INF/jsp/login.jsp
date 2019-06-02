<%--
  Created by IntelliJ IDEA.
  User: Babita
  Date: 6/2/2019
  Time: 2:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%--@page errorPage="loginerror.jsp"--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title>LOGIN FORM</title>
</head>
<body>
    <form action="login" method="post">
        <p>Login:</p>
        <p>Name:<input type="text" id = "name" name="name" /></p>
        <p>password:<input type ="password" id ="password" name="name" /></p>
        <p><input type="submit" value="Submit" /></p>
    </form>
</body>
</html>
