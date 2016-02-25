<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring JMS</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="text-center">
		<h1>Spring JMS</h1>
		<h2><small>Resultado Envio</small></h2>
	</div>
	
	<br><br><br>
	
	<div class="text-center">
		<h3>${requestScope.msg}</h3>
	</p>
	
	<br><br><br>
    <div class="pull-left">
    <a href="alta">Volver</a>
    </div>
    
</body>
</html>