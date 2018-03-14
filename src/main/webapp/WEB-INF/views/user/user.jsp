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
    name: ${u.userName} <br>
    age: ${u.age}
    <c:out value="${u}"/>
    <c:if test="${u!=null}">
        aa
    </c:if>
</body>
</html>
