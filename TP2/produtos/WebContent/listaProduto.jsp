<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"  %> 
<%@ page import="java.util.List, produtos.Produto" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Produtos</title>
</head>
	
<body>
			<a href="/produtos">Voltar</a>
<c:if test="${not empty produto}">
         Produto ${produto} cadastrado com sucesso!
</c:if>
	<h1>Lista de Produtos: </h1>
	<ul>
		<c:forEach items="${produto}" var="produto">
		<li>
			${produto.nome }
			<a href="mostraProduto?id=${produto.id}">ver</a>
			<a href="removeProd?id=${produto.id}">remover</a>
		</li>
		</c:forEach>
	</ul>
</body>

</html>
