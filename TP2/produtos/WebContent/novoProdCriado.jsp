<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<body>
	
		<c:if test="${not empty produto}">
			Produto ${produto } cadastrado com sucesso!
		</c:if>
		
		<c:if test="${ empty produto}">
			Nenhum produto cadastrado.
		</c:if>

</body>

</html>