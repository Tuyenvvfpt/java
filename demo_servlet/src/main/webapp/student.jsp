<%--
  Created by IntelliJ IDEA.
  User: Vu Van Tuyen
  Date: 10/28/2023
  Time: 1:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<h1> List Student </h1>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>ADDRESS</th>
            <th>AGE</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="student" items="${list_student}">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.address}</td>
                <td>${student.age}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
