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
<form action="ModificarUsuario">
	<label>cUsuario</label>
	<input type="hidden" name="c_usuario" placeholder="c_usuario" value="${usuario.cUsuario}">${usuario.cUsuario}
	<label>Nombre</label>
	<input type="text" name="nombre" placeholder="nombre" value="${usuario.nombre}">
	<label>Apellido</label>
	<input type="text" name="apellido" placeholder="apellido" value="${usuario.apellido}">
	<label>Telefono</label>
	<input type="text" name="telefono" placeholder="telefono" value="${usuario.telefono}">
	<label>Correo Trabajo</label>
	<input type="text" name="correo_trabajo" placeholder="correo_trabajo" value="${usuario.correo_trabajo}">
	<label>Trabajo</label>
	<input type="text" name="trabajo" placeholder="trabajo" value="${usuario.trabajo}">
	<label>Mgr</label>
	<input type="text" name="mgr" placeholder="mgr" value="${usuario.mgr}">
	<label>Rol</label>
	<input type="text" name="rol" placeholder="rol" value="${usuario.rolUsuario.nombre}">
	

	<input type="submit" value="Modificar">
	</form>
	
	<form action="PaginaReservaUsuario">
		<input type="submit" value="Volver">
	</form>
</body>
</html>