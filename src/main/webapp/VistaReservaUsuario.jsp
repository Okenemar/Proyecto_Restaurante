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

	<h1 class="fw-bold" style="margin-left:280px;" > GESTIONES RESERVAS</h1>

			<h1 class="fw-bold" > Ver Reservas</h1>

<form method="get" action="VerReservasUsuario" >
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
      <th scope="col">Evento</th>
      <th scope="col"></th>
      <th scope="col"></th>
      
     
    </tr>
  </thead>
  <tbody>
    
     <c:forEach items="${reservas}" var="reserva">
    <tr>
      <th scope="row"></th>
      <td>${reserva.nReserva}</td>
      <td>${reserva.fecha}</td>
      <td>${reserva.evento.nombre}</td>
      <td><a href="ModificarReserva?nReserva=${reserva.nReserva}" class="btn btn-primary">modificar</a></td>
      <td><a href="EliminarReserva?nReserva=${reserva.nReserva}" class="btn btn-danger">eliminar</a></td>
   
      
    </tr>
    
    </c:forEach>
    
    
  </tbody>
</table>
		


</body>
</html>