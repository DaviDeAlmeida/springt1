<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Lista Membros</title>
    <link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
    <script src="webjars/jquery/3.0.0/jquery.min.js"></script>
    <script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
    <h1>Lista de Membros</h1>

    <a href="/index.html">Voltar</a></li>

    <table class="table table-hover">
        <thead>
        <th>Sede</th>
        <th>Nome</th>
        <th>Função</th>
        <th>eE-mail</th>
        <th>Data de Entrada na Função</th>
        <th>Data de Saída da Função</th>
        <th colspan="2">Opções</th>
        </thead>
        <tbody>
        <c:forEach var="membro" items="${membros}">
            <tr>
                <td>${membro.sede.fantasia}</td>
                <td>${membro.nome}</td>
                <td>${membro.funcao}</td>
                <td>${membro.email}</td>
                <fmt:parseDate value="${membro.dataEntradaFuncao}" pattern="yyyy-MM-dd"
                               var="parsedDateEntrada" type="date" />
                <fmt:parseDate value="${membro.dataSaidaFuncao}" pattern="yyyy-MM-dd"
                               var="parsedDateSaida" type="date" />
                <td><fmt:formatDate value="${parsedDateEntrada}" pattern="dd/MM/yyyy" /></td>
                <td><fmt:formatDate value="${parsedDateSaida}" pattern="dd/MM/yyyy" /></td>
                <td><a href="membro-alterar.html/${membro.membro_id}" class="btn btn-primary">Editar</a></td>
                <td><a href="membro-deletar.html/${membro.membro_id}" class="btn btn-danger">Excluir</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>