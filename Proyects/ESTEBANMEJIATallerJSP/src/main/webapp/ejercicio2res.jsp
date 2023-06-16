<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%
int numero1 = Integer.parseInt(request.getParameter("numero1"));
int numero2 = Integer.parseInt(request.getParameter("numero2"));
String res="";
for(int i = numero1; i <= numero2; i++){
	if (numero2!=i)res+=i+", ";
	else res+= i;
}
%>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./css/style.css" type="text/css">
<title> Respuesta</title>
<h2> <center> Los numeros comprendidos entre el numero <%=numero1%> y el numero <%=numero2%> son:</center></h2>
</head>
<body>
(<%=res %>)
<center><input type="button" value=" Volver"	onClick= "location.href='ejercicio2.jsp'"></center>

</body>
</html>