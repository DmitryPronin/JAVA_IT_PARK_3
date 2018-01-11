<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Заказы</title>
    <link href="/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>

<table>
    <h2>Пользователи</h2>
    <tr>
        <th>Id</th>
        <th>Время и дата</th>
        <th>id пользователя</th>
    </tr>
    <c:forEach items="${orders}" var="order">
        <tr>
            <td bgcolor="green">${order.id}</td>
            <td>${order.dateTime}</td>
            <td>$(order.user_id)</td>

        </tr>
    </c:forEach>
</table>
<table>
    <tr>
        <td>
            <!--<h4>Добавление записи</h4>
            <form action="/users_as_jsp" method="post">
                <input type="text" name="name_add" placeholder="Имя"><br>
                <input type="text" name="age_add" placeholder="Возраст"><br>
                <input type="submit">
            </form>
        </td>
        <td>
            <h4>Редактирование записи</h4>
            <form action="/users_as_jsp" method="post">
                <input type="text" name="id_update" placeholder="ID для редактирования"><br>
                <input type="text" name="name_update" placeholder="Новое имя"><br>
                <input type="text" name="age_update" placeholder="Новый возраст"><br>
                <input type="submit">
            </form>
        </td>
    </tr>
    <tr>
        <td>
            <h4>Удаление записи</h4>
            <form action="/users_as_jsp" method="post">
                <input type="text" name="id_delete" placeholder="ID для удаления"><br>
                <input type="submit">
            </form>
        </td>
        <td>
            <h3>Поиск</h3>
            <form action="/users_as_jsp" method="get">
                <input type="text" name="id_search" placeholder="Id для поиска"><br>
                <input type="submit">
            </form>-->
        </td>
    </tr>






</table>
</body>
</html>