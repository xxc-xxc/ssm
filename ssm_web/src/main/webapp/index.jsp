<%--
  Created by IntelliJ IDEA.
  User: jinj
  Date: 2020/12/28
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <a href="user/findAllUser">查询所有用户</a>
    <hr/>
    <form action="/user/saveUser" method="post">
       用户名：<input type="text" name="username"><br>
        <input type="submit" value="保存">
    </form>
</body>
</html>
