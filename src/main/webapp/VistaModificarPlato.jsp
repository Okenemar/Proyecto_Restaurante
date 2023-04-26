<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">

		<form method="POST" action="ModificarPlato">
			<div class="row 2">
				<div class="col-6">

					<h1 class="fw-bold">Modificar Plato</h1>


					<p class="fw-bold">
						Id: ${plato.cPlato} <input type="hidden" name="cPlato"
							value="${plato.cPlato }" /> <br>
					</p>

					<p class="fw-bold">
						Nombre: <input type="text" name="nombre" value="${plato.nombre}" />
						<br>
					</p>
					<br>
					<p class="fw-bold">
						Precio: <input type="text" name="precio"
							value="${plato.precio }" /> <br>
					</p>
					<br>

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
			
		
							<c:forEach items="${productosPlato}" var="productosPlato">
								<tr>
									<th scope="row"></th>
									<td>${productosPlato.cProducto}</td>
									<td>${productosPlato.nombre}</td>

									<td><input class="form-check-input" type="checkbox"
										id="flexCheckDefault" value="${productosPlato.cProducto}" checked></td>
								
										

								</tr>

							</c:forEach>
							
							<c:forEach items="${productosNOplato}" var="productosNOplato">
								<tr>
									<th scope="row"></th>
									<td>${productosNOplato.cProducto}</td>
									<td>${productosNOplato.nombre}</td>

									<td><input class="form-check-input" type="checkbox"
										id="flexCheckDefault" value="${productosNOplato.cProducto}" ></td>
								
										

								</tr>

							</c:forEach>

						</tbody>
					</table>

				</div>
			</div>
			<input type="submit" class="btn btn-secondary" value="Guardar" />
		</form> 
	</div>
</body>
</html>