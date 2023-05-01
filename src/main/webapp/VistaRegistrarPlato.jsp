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


	
	<div class="container">
		
			<form method="POST" action="RegistrarPlato">
			<div class="row 2">
				<div class="col-6">
					<h1 class="fw-bold">Resgistrar Plato</h1>

					<p>
						Nombre: <input type="text" name="nombre" /> <br>
					</p>
					<br>
					<p>
						Precio: <input type="text" name="precio" /> <br>
					</p>
					
				</div>


				<div class="col-6">
					<h1 class="fw-bold">PRODUCTOS</h1>

					<table class="table">

						<thead>
							<tr>
								<th scope="col">#</th>
								<th scope="col">c_producto</th>
								<th scope="col">nombre</th>
								<th></th>

							</tr>
						</thead>
						<tbody>
							<c:forEach items="${productos}" var="producto">
								<tr>
									<th scope="row"></th>
									<td>${producto.cProducto}</td>
									<td>${producto.nombre}</td>
									
									<td><input class="form-check-input" type="checkbox"
										id="flexCheckDefault" value="${producto.cProducto}" name="${producto.cProducto}"></td>
									

								</tr>

							</c:forEach>




						</tbody>
					</table>

				</div>
			</div>
			<input type="submit" class="btn btn-secondary" value="Guardar"/>
			<a href="PaginaPlato" class="btn btn-dark">Volver </a> 
		</form>
	</div>

</body>
</html>







