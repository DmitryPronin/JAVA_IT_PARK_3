<%@ page import="java.util.ArrayList" %>
<%@ page import="ru.itpark.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Пользователи</title>
</head>
<body>

<table>
    <tr>
        <th>Id</th>
        <th>Имя</th>
        <th>Возраст</th>
    </tr>
    <%
        ArrayList<User> users = (ArrayList<User>) request.getAttribute("users");
        for (User user : users) {
    %>
    <tr>
        <td><%=user.getId()%></>
        <td><%=user.getName()%></>
        <td><%=user.getAge()%></>
    </tr>
    <% } %>
</table>
</body>
</html>