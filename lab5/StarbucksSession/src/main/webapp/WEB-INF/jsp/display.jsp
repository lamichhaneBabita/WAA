<%--
  Created by IntelliJ IDEA.
  User: Babita
  Date: 6/2/2019
  Time: 2:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Result</title>
</head>
<body>
<h3> Good choice, ${userInfo.name}!</h3>

<h2>Starbuck's ${roast} Roast Coffees:</h2>
<form action="advice" method="get">

    <table >
        <c:forEach var="coffee" items="${roastList}" varStatus="status">

            <c:choose>
                <c:when test="${(status.index)%2 eq 0}">
                    <tr style="background-color:cyan">
                </c:when>
                <c:otherwise>
                    <tr style="background-color:yellow">
                </c:otherwise>
            </c:choose>
            <td>${coffee}</td>
            </tr>
        </c:forEach>
    </table>
    <input type="submit" value="Back">
</form>
</body>
</html>