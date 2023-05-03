<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/alteraProd" var ="linkServletNovoProd"/>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"  %> 
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Alterar produto</title>
</head>

<body>

<a href="/produtos">Voltar</a>
	<form action="${linkServletNovoProd }" method="post">
		
		Nome: <input type="text" name="nome"  value="${produto.nome}" />
		Unidades: <input type="text" name="unidadeCompra" value="${produto.unidadeCompra}" />
		Descrição: <input type="text" name="descricao" value="${produto.descricao}" />
		Previsão de compras mensais: <input type="text" name="qtdPrevistoMes" value="${produto.qtdPrevistoMes}" />
		Preço máximo comprado: <input type="text" name="precoMaxComprado" value="${produto.precoMaxComprado}" />
		<input type="hidden" name="id" value="${produto.id}" />
		<input type="submit" />
		
	</form>

</body>
</html>
