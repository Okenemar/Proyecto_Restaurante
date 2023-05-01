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

		<form method="POST" action="ModificarUsuario">
			

					<h1 class="fw-bold">Modificar Usuario</h1>


					<p class="fw-bold">
						cUsuario: ${usuario.cUsuario} <input type="hidden" name="cUsuario"
							value="${usuario.cUsuario}" /> <br>
					</p>

					<p class="fw-bold">
						Nombre: <input type="text" name="nombre" value="${usuario.nombre}" />
						<br>
					</p>
					<br>
					<p class="fw-bold">
						Apellido: <input type="text" name="apellido"
							value="${usuario.apellido}" /> <br>
					</p>
					<p class="fw-bold">
						Contrase�a: <input type="text" name="contrase�a"
							value="${usuario.contrase�a}" /> <br>
					</p>
					<br>
				<p class="fw-bold">
						Telefono: <input type="text" name="telefono"
							value="${usuario.telefono}" /> <br>
					</p>
					<br>	<p class="fw-bold">
						CorreoTrabajo: <input type="text" name="correoTrabajo"
							value="${usuario.correoTrabajo}" /> <br>
					</p>
					<br> 
		<p>Trabajos:
		<select name="rol">
			<option value="0"></option>
			<c:forEach items="${roles}" var="rol">
			
				<c:if test="${rol.id == usuario.rol.id}">
					<option value="${rol.id}" selected> ${rol.nombre} </option>
				</c:if>
				
				<c:if test="${rol.id != usuario.rol.id}">
					<option value="${rol.id}"> ${rol.nombre} </option>
				</c:if>
				
			</c:forEach>
		</select> 
		</P>
	
		<br> <input type="submit" class="btn btn-secondary"
			value="Enviar" />
			
	</form>
	<a href="VerUsuarios" class="btn btn-primary">Volver</a>
					


				
		

</body>
</html>