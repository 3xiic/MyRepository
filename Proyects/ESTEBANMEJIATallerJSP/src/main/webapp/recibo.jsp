<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%
String nombre = request.getAttribute("Nombre").toString();
String apellido = request.getAttribute("Apellido").toString();
String articulo = request.getAttribute("Articulo").toString();
String ip = request.getAttribute("Ip").toString();
String precio = request.getAttribute("Precio").toString();
String cantidad = request.getAttribute("Cantidad").toString();
String fecha = request.getAttribute("Fecha").toString();
String tipo = request.getAttribute("Card").toString();
String numero = request.getAttribute("Tarjeta").toString();
%>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./css/style.css" type="text/css">
<title>Confirmacion de compra</title>
</head>
<body>
<div class = "centrar">
	<h1 align="center">Recibo:</h1>
	<center><p>Señor Usuario: <b><%=nombre%> <%=apellido%></b></h2> </center>
		<center><p>Su compra fue realizada satisfactoriamente por un valor de <b>$<%=Integer.parseInt(precio)*Integer.parseInt(cantidad)%></b>. Correspondiente a <b><%=cantidad%> <%=articulo%></b>.</p></center>
		<center><p>El precio por unidad fue de: <b>$<%=precio%></b></p></center>
		<center><p>La compra fue realizada con la tarjeta de crédito número: <b>**** **** **** <%=numero%></b> de la franquicia <b><%=tipo%></b>. Fecha de la compra: <b><%=fecha%></b></p></center>
		<center><p>Dirección IP: <b><%=ip%></b></p></center>
		<center><input type="button" value=" Volver a comprar"	onClick= "location.href='Inicio.jsp'"></center>
</div>
</body>
</html>