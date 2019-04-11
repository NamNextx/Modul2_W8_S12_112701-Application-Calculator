<%--
  Created by IntelliJ IDEA.
  User: Nam_Phuong
  Date: 2019-04-11
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
      <form method="post" action="/calculation">
        <h1>Simple calculator</h1>
        <label>First number</label> <br>
        <input type="number" name="first" > <br>
        <select>
          <option>Tinh tong</option>
          <option>Tru</option>
        </select> <br>
        <label> Second number</label> <br>
        <input type="number" name="second">
        <input type="submit">
      </form>
  </body>
</html>
