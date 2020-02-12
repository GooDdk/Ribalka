<%-- 
    Document   : listReaders
    Created on : Feb 12, 2020, 2:49:16 PM
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Список читателей</title>
    </head>
    <body>
        <h1>Список читателей</h1>
    <c:forEach var="reader" items="${listReaders}" varStatus="status">
        <li>${status.index+1}. ${reader.firstname}. ${reader.lastname}. Телефон: ${reader.phone}</li>
    </c:forEach>
    </body>
</html>
