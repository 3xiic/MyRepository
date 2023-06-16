<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./css/style.css" type="text/css">
<title>Inicio</title>
<script language="JavaScript">
	function valida_envia(form) {
		if (form.articulo.value == "0") {
			alert("Debe ingresar el articulo a comprar....");
			form.articulo.focus();
			return;
		}
		if (form.cantidad.value == "") {
			alert("Debes de ingresar la cantidad que deseas comprar....");
			form.cantidad.focus();
			return;
		}
		if (form.precio.value == "") {
			alert("Debes ingresar el valor del articulo a comprar....");
			form.precio.focus();
			return;
		}
		if (form.nombre.value == "") {
			alert("Debes ingresar tus nombres....");
			form.nombre.focus();
			return;
		}
		if (form.apellido.value == "") {
			alert("Debes ingresar tus apellidos....");
			form.apellido.focus();
			return;
		}
		if (form.card.value == "") {
			alert("Debes ingresar tu tipo de tarjeta....");
			form.card.focus();
			return;
		}
		if (form.tarjeta.value == "") {
			alert("Debes ingresar el numero de tu tarjeta....");
			form.tarjeta.focus();
			return;
		}
		if (form.ctarjeta.value == "") {
			alert("Debes de volver a ingresar tu tarjeta....");
			form.ctarjeta.focus();
			return;
		}
		if (form.tarjeta.value != form.ctarjeta.value) {
			alert("El numero de tarjeta no coincide....");
			form.tarjeta.focus();
			form.ctarjeta.focus();
			return;
		}
		if (form.tarjeta.value.length < 16) {
			alert("Numero de tarjeta invalido!");
			form.tarjeta.focus();
			return;
		}
		form.submit();
	}
</script>
<div class="centrar">
<h1>
	<center>Tu Compra</center>
</h1>
</head>
<body>
	<form action="DemoServlet" method="post">
		<table align="center">
			<tr>
				<td>Articulo:</td>
				<td><select name = "articulo">
						<option value="0">:: Seleccione ::</option>
						<option values="1">Zapatos</option>
						<option values="2">Camisa</option>
						<option values="3">Reloj</option>
						<option values="4">Libro</option>
						<option values="5">Computador</option>
				</select></td>
			</tr>
			<tr>
				<td>Cantidad:</td>
				<td><input type="number" name="cantidad" value="" size="40" placeholder="Cantidad"></td>
			</tr>
			<tr>
				<td>Precio por unidad:</td>
				<td><input type="number" name="precio" value="" size="40" placeholder="Precio por unidad"></td>
			</tr>
			<tr>
				<td>Nombre:</td>
				<td><input type="text" name="nombre" value="" size="40" placeholder="Nombre"></td>
			</tr>
			<tr>
				<td>Apellido:</td>
				<td><input type="text" name="apellido" value="" size="40" placeholder="Apellido"></td>
			</tr>
			<tr>
				<td>Tarjeta de credito:</td>
				<td><input type="radio" name="card" value="Visa">Visa <input
					type="radio" name="card" value="MasterCard">MasterCard <input
					type="radio" name="card" value="American Express"> American
					Express</td>
			</tr>
			<tr>
				<td>Numero de tarjeta de credito:</td>
				<td><input type="text" name="tarjeta" value="" size="40" placeholder="Numero de tarjeta"></td>
			</tr>
			<tr>
				<td>Confirme el numero de su tarjeta:</td>
				<td><input type="text" name="ctarjeta" value="" size="40" placeholder="Confirme su numero de tarjeta"></td>
			</tr>
		</table>
		<center>
			<input type="button" value=" Confirmar compra"
				onClick="valida_envia(this.form)"/>
		</center>
		</div>
	</form>
</body>
</html>