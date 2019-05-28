<%--
  Created by IntelliJ IDEA.
  User: Babita
  Date: 5/28/2019
  Time: 10:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Calculator Result</title>
</head>
<body>
<h>Calculator Results</h>

<form >
    <input name="add1" type="text" readonly  value="${add1}" />+
    <input name="add2" type="text"  readonly value=<c:out value="${add2}"/>>=

    <input name="sum" type="text"  readonly value=<c:out value="${sum}"/>>

    <br>

    <input name="mul1" type="text" readonly value=<c:out value="${mul1}"/>>*
    <input name="mul2" type="text" readonly value=<c:out value="${mul2}"/>>=
    <input name=product" type="text"  readonly value=<c:out value="${product}"/>>
    <br>
</form>
</body>
</html>
