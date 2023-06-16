<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%
int numero1 = Integer.parseInt(request.getParameter("numero1"));
int numero2 = Integer.parseInt(request.getParameter("numero2"));
int suma = numero1 + numero2;
int resta = numero1 - numero2;
int multiplicacion = numero1 * numero2;
int division = numero1 / numero2;
%>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./css/style.css" type="text/css">
<title> Respuesta</title>
</head>
<body>
<div class = "centrar">
<h2> <center> Los resultados a las operaciones para los numeros <%=numero1%> y <%=numero2%> son;</center></h2>
<center> Suma: <%=suma %></center><br>
<center> Resta: <%=resta%></center><br>
<center> Multiplicaci&oacute;n: <%=multiplicacion %></center><br>
<center> Divisi&oacute;n: <%=division %></center><br>
		<center><input type="button" value=" Volver"	onClick= "location.href='ejercicio1.jsp'"></center>
</div>
</body>
</html>