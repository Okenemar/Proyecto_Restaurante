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
		
		<p>C�Usuario:
		<input type="text" name="cUsuario" /> <br></p>
		<br>
		<p>Contrase�a:
		<input type="password" name="contrase�a" /> <br></p>
		<br>
	
		<input type="submit" class="btn btn-secondary" value="Loguear"/>
</form>	
</body>
</html>