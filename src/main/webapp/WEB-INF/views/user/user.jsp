<%--
  Created by IntelliJ IDEA.
  User: tokiz
  Date: 18-3-13
  Time: 下午10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>
</head>
<body>
    name: ${user.username} <br>
    id: ${user.id}
    <hr>
    <c:out value="${user}"/>
    <c:if test="${user!=null}">
        aa
    </c:if>
</body>
</html>
