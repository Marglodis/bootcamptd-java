<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario de Compra</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body class="mt-3 bg-body-tertiary">
	<div
		class="container mt-2 shadow p-3 mb-5 bg-body-tertiary rounded p-4">
		<h2 class="text-center bg-dark-subtle">Ingreso de datos</h2>
		<form action="EnviarInfoServlet" method="post">
			<div class="form-group">
				<label for="nombre">Nombre:</label> <input type="text"
					class="form-control" id="nombre" name="nombre" required>
			</div>
			<div class="form-group">
				<label for="direccion">Dirección:</label> <input type="text"
					class="form-control" id="direccion" name="direccion" required>
			</div>

			<!-- Tabla de productos -->
			<h3>Productos:</h3>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Producto</th>
						<th>Valor Unitario</th>
						<th>Cantidad</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>Producto 1</td>
						<td>$100</td>
						<td><input type="number" name="cantidad1"
							class="form-control" min="0" value="0"></td>
					</tr>
					<tr>
						<td>Producto 2</td>
						<td>$200</td>
						<td><input type="number" name="cantidad2"
							class="form-control" min="0" value="0"></td>
					</tr>
					<tr>
						<td>Producto 3</td>
						<td>$300</td>
						<td><input type="number" name="cantidad3"
							class="form-control" min="0" value="0"></td>
					</tr>
				</tbody>
			</table>

			<button type="submit" class="btn btn-primary">Calcular Total</button>
		</form>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>