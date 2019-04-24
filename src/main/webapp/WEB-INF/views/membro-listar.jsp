<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Lista Membros</title>
</head>
<body>
    <h1>Lista de Membros</h1>
    <ul>
        <c:forEach var="membro" items="${membros}">
            <li>[${membro.id}] ${membro.nome}: ${membro.funcao}</li>
        </c:forEach>
    </ul>
</body>
</html>