<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<form action="ModificarEvento">
	<label>cEvento</label>
	<input type="hidden" name="c_evento" placeholder="c_evento" value="${evento.cEvento}">${evento.cEvento}
	<label>Nombre</label>
	<input type="text" name="nombre" placeholder="nombre" value="${evento.nombre}">
	
	
	<input type="submit" value="Modificar">
	</form>
	<form action="VerEventos">
		<input type="submit" value="Volver">
	</form>
</body>
</html>