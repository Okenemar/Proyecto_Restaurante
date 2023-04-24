<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
</head>
<body>
	<h1 class="fw-bold">Modificar Producto</h1>

	<form method="POST" action="ModificarProducto">
		<p class="fw-bold">
			Id: ${producto.cProducto } <input type="hidden" name="cProducto"
				value="${producto.cProducto }" /> <br>
		</p>

		<p class="fw-bold">
			Nombre: <input type="text" name="nombre" value="${producto.nombre}" />
			<br>
		</p>
		<br>
		<p class="fw-bold">
			Calorias:(KCAL) <input type="text" name="calorias"
				value="${producto.calorias }" /> <br>
		</p>
		<br>
		<p class="fw-bold">
			Proteínas:(G) <input type="text" name="proteinas"
				value="${producto.proteinas }" /> <br>
		</p>
		<p class="fw-bold">
			Cantidad: <input type="text" name="cantidad"
				value="${producto.cantidad }" /> <br>
		</p>
		<p class="fw-bold">
			Precio: <input type="text" name="precio"
				value="${producto.precio }" /> <br>
		</p>
		<br> <input type="submit" class="btn btn-secondary"
			value="Enviar" />

	</form>

	<a href="VerProductos" class="btn btn-primary">Volver</a>
</body>
</html>