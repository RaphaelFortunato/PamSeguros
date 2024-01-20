<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>PamSeguros</title>
</head>
<body>
	<h1>pam seguros</h1>
	
	<form action="ServletDeLogin" method="post">
		<input type="text" name="login" id="login" value="">
		
		<input type="password" name="senha" id="senha" value="">
		
		<input type="submit" value="Acessar">
	</form>
	
	<h4>${msg}</h4>
	
</body>
</html>