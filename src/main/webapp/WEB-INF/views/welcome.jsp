<%--
  Created by IntelliJ IDEA.
  User: kamel
  Date: 1/12/2017
  Time: 3:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${message}
<form action="processform" method="post">
    First Name: <input type=" text" name =FName>
    Last Name: <input type=" text" name =LName>
    Age: <input type="number" name ="Age">

    <input type="submit" value="submit">


</form>

<a href="/">Refresh Page</a>
</body>
</html>
