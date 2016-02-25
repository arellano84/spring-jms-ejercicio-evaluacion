<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
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
		<h2><small>Ingresar datos del cliente</small></h2>
	</div>
	
	<br><br><br>
	
	<sf:form action="alta" method="POST" cssClass="form-horizontal" modelAttribute="cliente">
	
		<div class="form-group">
			<sf:label path="dni" cssClass="col-lg-2 control-label">Documento: </sf:label>
			<div class="col-lg-10">
				<sf:input path="dni" cssClass="form-control"/>
			</div>
		</div>
		
		<div class="form-group">
			<sf:label path="nombre" cssClass="col-lg-2 control-label">Nombre(s): </sf:label>
			<div class="col-lg-10">
				<sf:input path="nombre" cssClass="form-control"/>
			</div>
		</div>
		<div class="form-group">
			<sf:label path="apellido" cssClass="col-lg-2 control-label">Apellido(s): </sf:label>
			<div class="col-lg-10">
				<sf:input path="apellido" cssClass="form-control"/>
			</div>
		</div>
		<div class="form-group">
			<sf:label path="edad" cssClass="col-lg-2 control-label">Edad: </sf:label>
			<div class="col-lg-10">
				<sf:input path="edad" cssClass="form-control"/>
			</div>
		</div>
		<div class="form-group">
			<sf:label path="telefono" cssClass="col-lg-2 control-label">Teléfono: </sf:label>
			<div class="col-lg-10">
				<sf:input path="telefono" cssClass="form-control"/>
			</div>
		</div>
		<div class="form-group">
			<sf:label path="email" cssClass="col-lg-2 control-label">E-mail: </sf:label>
			<div class="col-lg-10">
				<sf:input path="email" cssClass="form-control"/>
			</div>
		</div>
		<div class="form-group">
			<div class="col-lg-offset-2 col-lg-10">
				<input type="submit" class="btn btn-primary" value="Enviar Datos" />
			</div>
		</div>
	</sf:form>
</body>
</html>