<%@ page import="ru.itpark.model.Orders" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Заказы пользователей</title>
</head>
<body>
<table>
    <tr>
        <th>Id</th>
        <th>Дата и время</th>
        <th>Id пользователя</th>
    </tr>
    <%
        ArrayList<Orders> orders = (ArrayList<Orders>) request.getAttribute("orders");
        for (Orders order : orders) {

    %>
    <tr>
        <td><%=order.getId()%></>
        <td><%=order.getDateTime()%></>
        <td><%=order.getUsers_id()%></>
    </tr>
    <% } %>
</table>
</body>
</html>
