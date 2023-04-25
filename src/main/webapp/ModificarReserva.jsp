<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core"  %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="ModificarReserva">
	<label>Nº Reserva</label>
	<input type="hidden" name="nReserva" placeholder="id" value="${reserva.nReserva}">${reserva.nReserva}
	<label>Fecha</label>
	<input type="date" name="fecha" placeholder="fecha" value="${reserva.fecha}">
	<label>DNI</label>
	<input type="hidden" name="dni" placeholder="dni" value="${reserva.cliente.dni}">${reserva.cliente.dni}
	<label>Nombre</label>
	<input type="text" name="nombre" placeholder="nombre" value="${reserva.cliente.nombre}">
	<label>Telefono</label>
	<input type="text" name="telefono" placeholder="telefono" value="${reserva.cliente.telefono}">
	
	 <td><a href="EliminarReserva?nReserva=${reserva.nReserva}" class="btn btn-danger">eliminar</a></td>
	
	<input type="submit" value="Modificar">
	</form>
	<form action="VerReservas">
		<input type="submit" value="Volver">
	</form>

</body>
</html>