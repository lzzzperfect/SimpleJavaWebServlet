<%--
  Created by IntelliJ IDEA.
  User: liuzhengping
  Date: 2018/6/28
  Time: 下午6:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/Servlet101" method="post">
    This is post method: </br>

    Input id: <input type="text" name = "id"/>
    </br>
    Input First Name: <input type="text" name = "id"  />
    </br>

  </form>

  <form action="/Servlet101" method="get">
    This is get Method:</br>
    <input type="button" name = "get" value="click to show new page" onclick="location='http://localhost:8080/Servlet101'"/>
  </form>

  $END$
  </body>
</html>
