<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./css/style.css" type="text/css">
<title>Ejercicio 2</title>
<script language = "JavaScript">
function valida(form){
	if(form.numero1.value==""){
		alert("Debes ingresar el numero");
		form.numero1.focus();
		return;
	}
	if(form.numero2.value==""){
		alert("Debes ingresar el numero");
		form.numero1.focus();
		return;
	}

	
	form.submit();
}
</script>
</head>
<body>
Ejercicio 2:
<div class = "centrar">
<h1><center> Digita tus dos numeros </center></h1>
<form action="ejercicio2res.jsp" method = "post">
<table align = "center">
<tr><td>Numero 1</td><td><input type = "number" name = "numero1" value="" size="40" placeholder="Numero 1"></td></tr>
<tr><td>Numero 2</td><td><input type = "number" name = "numero2" value="" size="40" placeholder="Numero 2"></td></tr>
</table>
<center><input type="button" value=" Confirmar"onClick="valida(this.form)"/></center>
</div>
</form>
</body>
</html>