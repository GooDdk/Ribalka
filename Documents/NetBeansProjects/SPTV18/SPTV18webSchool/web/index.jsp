<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Школа группы SPTV18</title>
    </head>
    <body>
        <h1>Сетевая школа</h1>
        <p id="info">${info}</p>
        <p>
            <a href="showNewPerson.jsp">Добавить ученика или учителя</a><br>
            <a href="listPersons.jsp">Список учеников/учителей</a><br>
            <a href="showNewSubject.jsp">Добавить предмет</a><br>
            <a href="listSubjects.jsp">Список предметов</a><br>
        </p>
    </body>
</html>
