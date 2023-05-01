<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1 class="fw-bold" > Iniciar Sesion</h1>
		<form method="POST" action="LoginEmpleado">
		
		<p>CºUsuario:
		<input type="text" name="cUsuario" /> <br></p>
		<br>
		<p>Contraseña:
		<input type="password" name="contraseña" /> <br></p>
		<br>
	
		<input type="submit" class="btn btn-secondary" value="Loguear"/>
</form>	
</body>
</html>