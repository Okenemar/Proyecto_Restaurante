<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>


<h2 class="fw-bold" >${plato.nombre}</h2>
	
	
	<c:forEach items="${plato.productos}" var="producto">
    	
      <li class="list-group-item">${producto.nombre}</li>
    </c:forEach>
    
    <a href="VerPlatos" class="btn btn-primary">Volver</a>
	 
</body>
</html>