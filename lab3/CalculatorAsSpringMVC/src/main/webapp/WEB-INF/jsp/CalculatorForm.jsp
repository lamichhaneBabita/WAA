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
    <title>Calculator Form</title>

</head>
<body>
<h3>Calculator</h3>
<form action="Calculator" method="post">
    <input name = "add1" type="text" size="2" class="textBox" />+
    <input name="add2" type="text" size="2" class="textBox" />=
    <input class="textBox" name="sum" type="text" size="4" readonly />
    <br/>
    <input name="mult1" type="text" size="2" class="textBox" />*
    <input name="mult2" type="text" size="2" class="textBox" />=
    <input name="product" type="text" size="4" class="textBox" readonly />
    <br/>
    <input type="submit" value="Submit">

</form>
</body>
</html>
