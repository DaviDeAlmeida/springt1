<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Lista Membros</title>
    <link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="/webjars/font-awesome/5.8.1/css/fontawesome.min.css">
    <script src="webjars/jquery/3.0.0/jquery.min.js"></script>
    <script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<h1>Lista de Membros</h1>

<a href="/index.html">Voltar</a></li>

<table class="table table-hover">
    <thead>
    <th>Nome</th>
    <th>Função</th>
    <th>email</th>
    <th>Entrada função</th>
    <th>Saída função</th>
    <th>Ações</th>
    </thead>
    <tbody>
    <c:forEach var="membro" items="${membros}">
        <tr>
            <td>${membro.nome}</td>
            <td>${membro.funcao}</td>
            <td>${membro.email}</td>
            <fmt:parseDate value="${membro.dataEntradaFuncao}" pattern="yyyy-MM-dd"
                           var="parsedDateEntrada" type="date" />
            <fmt:parseDate value="${membro.dataSaidaFuncao}" pattern="yyyy-MM-dd"
                           var="parsedDateSaida" type="date" />
            <td><fmt:formatDate value="${parsedDateEntrada}" pattern="dd/MM/yyyy" /></td>
            <td><fmt:formatDate value="${parsedDateSaida}" pattern="dd/MM/yyyy" /></td>
<%--            <td><a href="membro-alterar.html/${membro.id}" class="btn btn-primary"></a><i class="fas fa-pencil-alt"></i></td>--%>
            <td><a href="membro-excluir.html/${membro.id}" class="btn btn-danger"></a><i class="fa fa-trash"></i></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>