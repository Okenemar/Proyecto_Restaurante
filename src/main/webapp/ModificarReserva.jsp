<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core"  %>
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
	<h1 class="fw-bold">Modificar Reserva</h1>
	<form  method="POST" action="ModificarReserva">
	<p class="fw-bold">
	Nº Reserva:
	<input type="hidden" name="nReserva" placeholder="id" value="${reserva.nReserva}">${reserva.nReserva}
	<br>
	</p>
	<p class="fw-bold">
	Fecha:
	<input type="date" name="fecha" placeholder="fecha" value="${reserva.fecha}">
	<br>
	<p class="fw-bold">
	DNI:
	<input type="hidden" name="dni" placeholder="dni" value="${reserva.cliente.dni}">${reserva.cliente.dni}
	</p>
	<br>
	<p class="fw-bold">
	Nombre:
	<input type="text" name="nombre" placeholder="nombre" value="${reserva.cliente.nombre}">
	</p>
	<br>
	<p class="fw-bold">
	Telefono:
	<input type="text" name="telefono" placeholder="telefono" value="${reserva.cliente.telefono}">
	</p>
	<br>
	<p>Eventos:
		<select name="evento">
			<option value="0"></option>
			<c:forEach items="${eventos}" var="evento">
			
				<c:if test="${evento.cEvento == reserva.evento.cEvento}">
					<option value="${evento.cEvento}" selected> ${evento.nombre} </option>
				</c:if>
				
				<c:if test="${evento.cEvento != reserva.evento.cEvento}">
					<option value="${evento.cEvento}"> ${evento.nombre} </option>
				</c:if>
				
			</c:forEach>
		</select> 
	</p>
	<input type="submit" class="btn btn-secondary" value="Modificar">
	</form>
	<a href="PaginaReservaUsuario" class="btn btn-dark">Volver </a> 

</body>
</html>