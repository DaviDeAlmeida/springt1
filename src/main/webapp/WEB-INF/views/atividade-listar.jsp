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
<h1>Lista de Atividades</h1>

<a href="/index.html">Voltar</a></li>

<table class="table table-hover">
    <thead>
    <th>Título</th>
    <th>Descrição</th>
    <th>Data Início</th>
    <th>Data Fim</th>
    <th>Categoria</th>
    <th>Ações</th>
    </thead>
    <tbody>
    <c:forEach var="atividade" items="${atividades}">
        <tr>
            <td>${atividade.titulo}</td>
            <td>${atividade.descricao}</td>
            <fmt:parseDate value="${atividade.dataInicio}" pattern="yyyy-MM-dd"
                           var="parsedDateInicio" type="date" />
            <fmt:parseDate value="${atividade.dataFim}" pattern="yyyy-MM-dd"
                           var="parsedDateFim" type="date" />
            <td><fmt:formatDate value="${parsedDateInicio}" pattern="dd/MM/yyyy" /></td>
            <td><fmt:formatDate value="${parsedDateFim}" pattern="dd/MM/yyyy" /></td>
            <td>${atividade.categoria}</td>
                <%--            <td><a href="atividade-alterar.html/${atividade.id}" class="btn btn-primary"></a><i class="fas fa-pencil-alt"></i></td>--%>
            <td><a href="atividade-excluir.html/${atividade.id}" class="btn btn-danger"></a><i class="fa fa-trash"></i></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>