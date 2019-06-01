<%--
  Created by IntelliJ IDEA.
  User: Babita
  Date: 5/30/2019
  Time: 8:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="resources/style.css">
    <title>Results</title>
</head>
<body>
<h3>Results</h3>
<form>
    <input name = "add1" type="text" size="2" readonly value="${calculator.add1}" />+
    <input name="add2" type="text" size="2" readonly value="${calculator.add2}" />=
    <input name="sum" type="text" size="4" readonly value="${calculator.sum}" />
    <br/>
    <input name="mult1" type="text" size="2" readonly value="${calculator.mult1}" />*
    <input name="mult2" type="text" size="2" readonly value="${calculator.mult2}" />=
    <input name="product" type="text" size="4" readonly  value="${calculator.product}"/>
    <br/>
    <button type=button onclick=window.location.href="Calculator">Back</button></form>
</form>
</body>
</html>
