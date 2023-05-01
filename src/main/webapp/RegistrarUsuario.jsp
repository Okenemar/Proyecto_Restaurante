<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@  page import="java.sql.Date" %>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<h1 class="fw-bold" > Registrar Usuario</h1>

<form method="POST" action="InsertarUsuario">		
		
		<p>Nombre:
		<input type="text" name="nombre" /> <br></p>
		<br>
		<p>Apellido:
		<input type="text" name="apellido" /> <br></p>
		<br>
		<p>Telefono:
		<input type="text" name="telefono" /> <br></p>
		<br>
		<p>correoTrabajo:
		<input type="text" name="correoTrabajo" /> <br></p>
		<br>
		
		Roles:<select name="rol">
	<option value="0"></option>
		<c:forEach items="${roles}" var="rol">
				<option value="${ rol.id}" > ${rol.nombre}</option>	
		</c:forEach>
		</select>
		<br>
		<br>
		<input type="submit" class="btn btn-secondary" value="Guardar"/>
</form>
		<a href="VerUsuarios" class="btn btn-primary">Volver</a>
</body> </html>