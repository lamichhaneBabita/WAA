<%--
  Created by IntelliJ IDEA.
  User: Babita
  Date: 6/2/2019
  Time: 10:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h4>Calculator</h4>
<form action="Calcululator" method="post">
<input name="add1" type="text" size = "2" />+
<input name="add2" type="text" size = "2"   />=
<input name="sum" type="text" size = "4"  readonly />
<br>
<input name="mult1" type="text" size = "2"  />*
<input name="mult2" type="text" size = "2"  />=
<input name="product" type="text" size = "4"   readonly/>
<br>
<input type="submit" value="Submit" />
</form>


</body>
</html>
