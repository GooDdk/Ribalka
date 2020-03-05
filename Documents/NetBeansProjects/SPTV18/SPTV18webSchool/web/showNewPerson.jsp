<%-- 
    Document   : showNewReader
    Created on : Feb 17, 2020, 9:45:59 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Добавить ученика/учителя</title>
    </head>
    <body>
        <h1>Добавить ученика/учителя</h1>
        <p id="info">${info}</p>
        <form action="addPerson" method="POST">
            Имя: <input type="text" name="firstname" value="${firstname}"><br>
            Фамилия: <input type="text" name="lastname" value="${lastname}"><br>
            Телефон: <input type="text" name="phone" value="${phone}"><br>
            Ученик/Учитель: <input type="text" name="phone" value="${phone}"><br>
            <button type="submit">Добавить</button>
        </form>
    </body>
</html>
