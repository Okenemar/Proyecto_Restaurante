<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ModificarEvento">
	<label>cEvento</label>
	<input type="text" name="cEvento" placeholder="cEvento" value="${evento.cEvento}">
	<label>Nombre</label>
	<input type="text" name="nombre" placeholder="nombre" value="${evento.nombre}">
	<label>Fecha</label>
	<input type="date" name="fecha" placeholder="fecha" value="${evento.fecha}">
	<label>cUsuario</label>
	<input type="text" name="cUsuario" placeholder="cUsuario" value="${evento.usuario.cUsuario}">
	
	
	<input type="submit" value="Modificar">
	</form>
	<form action="VerReservas">
		<input type="submit" value="Volver">
	</form>
</body>
</html>