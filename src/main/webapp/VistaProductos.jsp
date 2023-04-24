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
      <th scope="col">cProducto</th>
      <th scope="col">Nombre</th>
      <th scope="col">cantidad</th>
      <th scope="col">precio</th>
      
      <th scope="col"></th>
       <th scope="col"></th>
      
      <td><a href="RegistrarProducto" class="btn btn-dark">Registrar </a> </td>
      
     
    </tr>
  </thead>
  <tbody>
    
     <c:forEach items="${productos}" var="producto">
    <tr>
      <th scope="row"></th>
      <td>${producto.cProducto}</td>
      <td>${producto.nombre}</td>
      <td>${producto.cantidad}</td>
      <td>${producto.precio}</td>
      
      
      <td><a href="VerProducto?cProducto=${producto.cProducto}" class="btn btn-primary ">Ver </a> </td>
      <td><a href="ModificarProducto?cProducto=${producto.cProducto}" class="btn btn-secondary ">Modificar </a> </td>
      <td><a href="EliminarProducto?cProducto=${producto.cProducto}" class="btn btn-danger" >eliminar </a> </td>
    </tr>
    
    </c:forEach>
    
    
    
  </tbody>
</table>
	
	
</body>
</html>