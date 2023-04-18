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

<h1 class="fw-bold" > Realizar Reserva</h1>


		<form method="get" action="CargarUsuario">
			<p>DNI:
			<input type="text" name="DNI" value="${cliente.dni}"/>
			<input type="submit" class="btn-primary" value="Buscar"> 
			</p>
		</form> 

<form method="POST" action="AñadirReserva">
		
		
		<p>Nombre:
		<input type="text" name="Nombre"  value="${cliente.nombre}"/> <br> </p>
		<br>
		<p>Apellido:
		<input type="text" name="Apellido" value="${cliente.apellido}"/> <br></p>
		<br>
		<p>Telefono:
		<input type="text" name="Telefono" value="${cliente.telefono}"/> <br></p>
		<br>
		<p>Correo:
		<input type="text" name="Correo"  value="${cliente.correo}"/> <br></p>
		<br>
		<p>Fecha:
		<input type="date" name="Fecha" /> <br></p>
		<br>
		<br>
		<input type="submit" class="btn btn-secondary" value="Reservar"/>
	
	
</form>
		
		<a href="VerUsuarios" class="btn btn-primary">Volver</a>	

</body>
</html>