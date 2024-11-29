<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Factura</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body class="mt-3 bg-body-tertiary">
	<div
		class="container mt-2 shadow p-3 mb-5 bg-body-tertiary rounded p-4">
		<h2 class="text-center bg-dark-subtle">Resumen de Facturación</h2>

		<h4>Datos del Usuario:</h4>
		<p>Nombre: ${nombre}</p>
		<p>Dirección: ${direccion}</p>

		<h4>Detalle de la Compra:</h4>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Producto</th>
					<th>Valor Unitario</th>
					<th>Cantidad</th>
					<th>Total Producto</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Producto 1</td>
					<td>$100</td>
					<td>${cantidad1}</td>
					<td>${totalProducto1}</td>
				</tr>
				<tr>
					<td>Producto 2</td>
					<td>$200</td>
					<td>${cantidad2}</td>
					<td>${totalProducto2}</td>
				</tr>
				<tr>
					<td>Producto 3</td>
					<td>$300</td>
					<td>${cantidad3}</td>
					<td>${totalProducto3}</td>
				</tr>
			</tbody>
		</table>

		<h4>Resumen de la Factura:</h4>
		<p>Total: $${total}</p>
		<p>Descuento (10%): $${descuento}</p>
		<p>Total con Descuento: $${totalConDescuento}</p>

		<a href="IngresoValores.jsp" class="btn btn-secondary">Volver</a>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>