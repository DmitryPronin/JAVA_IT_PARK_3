<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Пользователи</title>
    <link href="/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>

<table>
    <h2>Пользователи</h2>
    <tr>
        <th>Id</th>
        <th>Имя</th>
        <th>Возраст</th>
        <th>Номер телефона</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td bgcolor="green">${user.id}</td>
            <td>${user.name}</td>
            <td>${user.age}</td>
            <td>${user.mobilePhone}</td>
        </tr>
    </c:forEach>
</table>
<table>
    <tr>
        <td>
<h4>Добавление записи</h4>
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
            </form>
        </td>
    </tr>






</table>
</body>
</html>