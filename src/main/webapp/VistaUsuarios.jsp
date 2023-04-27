<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<h1 class="fw-bold" style="margin-left: 280px;">GESTIONES
			USUARIOS</h1>
		<div class="row 2">
			<div class="col-6">
				<h1 class="fw-bold">Insertar Usuario</h1>

				<form method="POST">

					<p>
						cUsuario: <input type="text" name="c_usuario"
							value="${usuario.cUsuario}" /><br>
					</p>
					<p>
						Nombre: <input type="text" name="nombre" value="${usuario.nombre}" />
						<br>
					</p>
					<br>
					<p>
						Apellido: <input type="text" name="apellido"
							value="${usuario.apellido}" /> <br>
					</p>
					<br>
					<p>
						Telefono: <input type="text" name="telefono"
							value="${usuario.telefono}" /> <br>
					</p>
					<br>
					<p>
						Correo Trabajo: <input type="text" name="correo_trabajo"
							value="${usuario.correoTrabajo}" /> <br>
					</p>
					<br>
					<p>
						Trabajo: <input type="text" name="trabajo"
							value="${usuario.trabajo}" /> <br>
					</p>
					<br>
					<p>
						MGR: <input type="text" name="mgr" value="${usuario.mgr}" /> <br>
						<br>
					<p>
						Rol:<select name="rol">
							<option value="0"></option>
							<c:forEach items="${roles}" var="rolUsuario">
								<option value="${rolUsuario.id}">${rolUsuario.nombre}</option>
							</c:forEach>
						</select> <br> <br> <input type="submit"
							class="btn btn-secondary" value="Insertar" />
				</form>

				<a href="VerUsuarios" class="btn btn-primary">Volver</a>
			</div>


			<div class="col-6">
				<h1 class="fw-bold">Ver Usuarios</h1>

				<form method="get" action="VerUsuarios"></form>
				<table class="table">

					<thead>
						<tr>
							<th scope="col">#</th>
							<th scope="col">cUsuario</th>
							<th scope="col">nombre</th>
							<th scope="col">apellido</th>
							<th scope="col">telefono</th>
							<th scope="col">correo trabajo</th>
							<th scope="col">trabajo</th>
							<th scope="col">mgr</th>
							<th scope="col">rol</th>


						</tr>
					</thead>
					<tbody>

						<c:forEach items="${usuarios}" var="usuario">
							<tr>
								<th scope="row"></th>
								<td>${usuario.cUsuario}</td>
								<td>${usuario.nombre}</td>
								<td>${usuario.apellido}</td>
								<td>${usuario.telefono}</td>
								<td>${usuario.correoTrabajo}</td>
								<td>${usuario.trabajo}</td>
								<td>${usuario.mgr}</td>
								<td>${usuario.rol.nombre}</td>


								<td><a
									href="FormularioModificarUsuario?c_usuario=${usuario.cUsuario}"
									class="btn btn-primary">modificar</a></td>
								<td><a href="EliminarUsuario?c_usuario=${usuario.cUsuario}"
									class="btn btn-danger">eliminar</a></td>



							</tr>

						</c:forEach>


					</tbody>
				</table>

			</div>
		</div>

	</div>

</body>
</html>