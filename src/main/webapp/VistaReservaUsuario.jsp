
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

<h1 class="fw-bold" > Realizar Reserva</h1>

<form method="POST" action="AņadirReserva">
		
		<p>DNI:
		<input type="text" name="DNI" /> <br></p>
		<p>Nombre:
		<input type="text" name="Nombre" /> <br></p>
		<br>
		<p>Telefono:
		<input type="text" name="Telefono" /> <br></p>
		<br>
		<p>Fecha/hora:
		<input type="datetime-local" name="hora" /> <br></p>
		<br>
		<br>
		<input type="submit" class="btn btn-secondary" value="Reservar"/>
	
	
</form>

		<a href="VerUsuarios" class="btn btn-primary">Volver</a>	

</body>
</html>