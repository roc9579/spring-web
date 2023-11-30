<%--
  Created by IntelliJ IDEA.
  User: Hpc
  Date: 2023/11/29
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post">
    用户名：<input type="text" name="username" value=""><br>
    密码：<input type="password" name="password" value=""><br>
    <input type="submit" value="登录">
    ${message}
</form>
</body>
</html>
