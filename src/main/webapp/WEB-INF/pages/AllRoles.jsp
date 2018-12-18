<%--
  Created by IntelliJ IDEA.
  User: KeqinFeng
  Date: 2018/12/18
  Time: 12:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>AllRoles</title>
</head>
<body>
<c:forEach var="role" items="${allRoles}">
    <p>${role.roleName}</p>
</c:forEach>
</body>
</html>
