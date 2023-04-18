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
<body >
<div class="container">
	<h1 class="fw-bold" style="margin-left:280px;" > GESTIONES RESERVAS</h1>
<div class="row 2" >
<div class="col-6" >
	<h1 class="fw-bold" > Realizar Reserva</h1>


		<form method="get" action="CargarUsuario">
			<p>Buscar dni
			<input type="text" name="DNI"/>
			<input type="submit" class="btn-primary" value="Buscar"> 
			</p>
		</form> 

<form method="POST" action="AñadirReserva">
		
		<p>DNI:
		<input type="text" name="DNI"  value="${cliente.dni}"/><br>
		</p> 
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
</div>


<div class="col-6" >
			<h1 class="fw-bold" > Ver Reservas</h1>

<form method="get" action="VerReservas" >
			<p>DNI:
			<input type="text" name="DNI" value="${reserva.cliente.dni}"/>
			<input type="submit" class="btn-primary" value="Buscar"> 
			</p>
</form> 	
<table class="table">
	
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">nReserva</th>
      <th scope="col">Fecha</th>
      
     
    </tr>
  </thead>
  <tbody>
    
     <c:forEach items="${reservas}" var="reserva">
    <tr>
      <th scope="row"></th>
      <td>${reserva.nReserva}</td>
      <td>${reserva.fecha}</td>
      
      
      
    </tr>
    
    </c:forEach>
    
    
  </tbody>
</table>
		
</div>
</div>
</div>

</body>
</html>