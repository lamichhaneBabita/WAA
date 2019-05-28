<%--
  Created by IntelliJ IDEA.
  User: Babita
  Date: 5/28/2019
  Time: 10:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Calculate</title>
</head>
<body>
<form action="calculator" method="post">
    <input name="add1" type="text" />+
    <input name = "add2" type="text"/>=
    <input name="sum" type="text" />

    <br>
    <input name="mul1" type="text"  />*
    <input name = "mul2" type="text" />=
    <input name="product" type="text"  />

    <br/>
    <input type="submit" value="Submit" />
</form>
</body>
</html>