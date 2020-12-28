<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xxc
  Date: 2020/12/28
  Time: 22:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>用户数据</title>
</head>
<body>
    <table border="1" width="300px">
        <tr>
            <th>编号</th>
            <th>名称</th>
        </tr>
        <c:forEach items="${userList}" var="user" varStatus="vs">
            <tr>
                <td>${vs.count}</td>
                <td>${user.username}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
