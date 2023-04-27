<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core"  %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<div class="container">
	<h1 class="fw-bold" style="margin-left:280px;" > GESTIONES EVENTOS</h1>
<div class="row 2" >
<div class="col-6" >
	<h1 class="fw-bold" > Insertar Evento</h1>

<form method="POST" action="InsertarEvento">
		
		<p>cEvento:
		<input type="text" name="c_evento" /> <br></p>
		<p>Nombre:
		<input type="text" name="nombre" /> <br></p>
		<br>
		
		
		<br>
		<br>
		<input type="submit" class="btn btn-secondary" value="Insertar"/>
	
	
</form>
		
</div>


<div class="col-6" >
			<h1 class="fw-bold" > Ver Eventos</h1>

<form method="get" action="VerEventos" >
				
<table class="table">
	
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">cEvento</th>
      <th scope="col">nombre</th>
     
      
     
    </tr>
  </thead>
  <tbody>
    
   <c:forEach items="${eventos}" var="evento">
    <tr>
      <th scope="row"></th>
      <td>${evento.cEvento}</td>
      <td>${evento.nombre}</td>
      <td><a href="FormularioModificarEvento?c_evento=${evento.cEvento}" class="btn btn-primary">modificar</a></td>
      <td><a href="EliminarEvento?c_evento=${evento.cEvento}" class="btn btn-danger">eliminar</a></td>
      
   
      
    </tr>
    
    </c:forEach>
    
    
  </tbody>
</table>
</form>	
</div>
</div>

</div>
</body>
</html>