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
</head>
<body>
	
	<table class="table">
	
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">cPlato</th>
      <th scope="col">Nombre</th>
      <th scope="col">Precio</th>
     
      
      <th scope="col"></th>
       <th scope="col"></th>
      
      <td><a href="RegistrarPlato" class="btn btn-dark">Registrar </a> </td>
      
     
    </tr>
  </thead>
  <tbody>
    
     <c:forEach items="${platos}" var="plato">
    <tr>
      <th scope="row"></th>
      <td>${plato.cPlato}</td>
      <td>${plato.nombre}</td>
      <td>${plato.precio}</td>
      
      
      <td><a href="VerPlato?cPlato=${plato.cPlato}" class="btn btn-primary ">Ver </a> </td>
      <td><a href="ModificarPlato?cPlato=${plato.cPlato}" class="btn btn-secondary ">Modificar </a> </td>
      <td><a href="EliminarPlato?cPlato=${plato.cPlato}" class="btn btn-danger" >eliminar </a> </td>
    </tr>
    
    </c:forEach>
    
    
    
  </tbody>
</table>
	
	
</body>
</html>